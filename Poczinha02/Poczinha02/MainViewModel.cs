using MvvmHelpers;
using MvvmHelpers.Commands;
using Plugin.AudioRecorder;
using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Essentials;
using Xamarin.Forms;

namespace Poczinha02
{
    public class MainViewModel : BaseViewModel
    {

        private bool _IsRecording;
        public bool IsRecording { get => _IsRecording; set => SetProperty(ref _IsRecording, value); }


        private bool _IsPlaying;
        public bool IsPlaying { get => _IsPlaying; set => SetProperty(ref _IsPlaying, value); }


        AudioRecorderService gravador;

        AudioPlayer reprodutor = new AudioPlayer();

        string recordedPath;

        public AsyncCommand RecordCommand { get; set; }

        public AsyncCommand PlayCommand { get; set; }

        public MainViewModel()
        {
            gravador = new AudioRecorderService
            {
                StopRecordingAfterTimeout = true,
                TotalAudioTimeout = TimeSpan.FromSeconds(15),
                AudioSilenceTimeout = TimeSpan.FromSeconds(2)
            };
            RecordCommand = new AsyncCommand(Record, e => !IsPlaying, async ex => await HandleException(ex));
            PlayCommand = new AsyncCommand(Play, e => !IsRecording, async ex => await HandleException(ex));
            reprodutor.FinishedPlaying += Reprodutor_FinishedPlaying;
        }

        private void Reprodutor_FinishedPlaying(object sender, EventArgs e)
        {
            if (IsPlaying) 
            {
                IsPlaying = false;
            }
        }

        private Task Play()
        {
            if (!String.IsNullOrEmpty(recordedPath))
            {
                if (IsPlaying)
                {
                    reprodutor.Pause();
                    IsPlaying = false;
                }
                else
                {
                    IsPlaying = true;
                    reprodutor.Play(recordedPath); //som ficou baixo no iOS não sei se é problema do microfone do aparelho
                }
            }
            return Task.CompletedTask;
        }

        private async Task Record()
        {
            if (!IsRecording)
            {
                IsRecording = true;
                //Começar gravação
                var audioRecordTask = await gravador.StartRecording();

#pragma warning disable CS4014 // Because this call is not awaited, execution of the current method continues before the call is completed
                audioRecordTask.ContinueWith(async task =>
                {
                    recordedPath = gravador.FilePath;
                    IsRecording = false;
                    FileInfo fi = new FileInfo(gravador.FilePath);
                    OpenFileRequest req = new OpenFileRequest("teste", new ReadOnlyFile(fi.FullName)); //essa parte de abrir não funcionou no iOS
                    await Launcher.OpenAsync(req);
                });
#pragma warning restore CS4014 // Because this call is not awaited, execution of the current method continues before the call is completed
            }
            else
            {
                await gravador.StopRecording();
                IsRecording = false;
            }
        }

        private Task HandleException(Exception ex)
        {
            Console.WriteLine(ex.StackTrace);
            return Device.InvokeOnMainThreadAsync(() => App.Current.MainPage.DisplayAlert("ERRO", ex.Message, "ok"));
            
        }
    }
}
