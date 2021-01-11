using System;
using System.Linq;
using System.Text;
using MediaManager;
using Xamarin.Forms;
using Plugin.AudioRecorder;
using System.ComponentModel;
using System.Threading.Tasks;
using System.Collections.Generic;
using System.IO;
using Xamarin.Essentials;

namespace Poczinha02
{
    [DesignTimeVisible(false)]
    public partial class MainPage : ContentPage
    {

        AudioRecorderService gravador;
        AudioPlayer reprodutor;

        public MainPage(){
        
            InitializeComponent();

            gravador = new AudioRecorderService
            {
                StopRecordingAfterTimeout = true,
                TotalAudioTimeout = TimeSpan.FromSeconds(15),
                AudioSilenceTimeout = TimeSpan.FromSeconds(2)
            };
            reprodutor = new AudioPlayer();
        
        }

        //Audio
        private async void ClickedPlay(object sender, EventArgs e)
        { 

            //Testar esse trem também
            //await CrossMediaManager.Current.Play("https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3");

            try
            {
                string filePath = gravador.GetAudioFilePath();
                    
                if (filePath != null)
                {
                    ReproduzirButton.IsEnabled = false;
                    reprodutor.Play(filePath);
                }
            }catch (Exception ex){
                await DisplayAlert("Erro", ex.Message, "OK");
            }
        }


            private async void ClickedStopRecord(object sender, EventArgs e){
                gravador.StopRecording();
            }


            private async void ClickedRecord(object sender, EventArgs e) {
            
            try{
                if (!gravador.IsRecording)
                {
                    
                    //Começar gravação
                    var audioRecordTask = await gravador.StartRecording();


                    audioRecordTask.ContinueWith(async task =>
                    {
                        ReproduzirButton.IsEnabled = true;
                        FileInfo fi = new FileInfo(gravador.FilePath);
                        Xamarin.Essentials.OpenFileRequest req = new OpenFileRequest("teste", new ReadOnlyFile(fi.FullName));
                        await Launcher.OpenAsync(req);
                    });


                }
                else
                {
                    
                    await gravador.StopRecording();

                }
            }
            catch (Exception ex)
            {
                await DisplayAlert("Erro", ex.Message, "OK");
            }
        }
    }

}
