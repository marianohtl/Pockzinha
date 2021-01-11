package crc644b1a6e14a4741484;


public class PlaybackController
	extends com.google.android.exoplayer2.ext.mediasession.DefaultPlaybackController
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getCommands:()[Ljava/lang/String;:GetGetCommandsHandler\n" +
			"n_getSupportedPlaybackActions:(Lcom/google/android/exoplayer2/Player;)J:GetGetSupportedPlaybackActions_Lcom_google_android_exoplayer2_Player_Handler\n" +
			"n_onCommand:(Lcom/google/android/exoplayer2/Player;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V:GetOnCommand_Lcom_google_android_exoplayer2_Player_Ljava_lang_String_Landroid_os_Bundle_Landroid_os_ResultReceiver_Handler\n" +
			"n_onFastForward:(Lcom/google/android/exoplayer2/Player;)V:GetOnFastForward_Lcom_google_android_exoplayer2_Player_Handler\n" +
			"n_onPause:(Lcom/google/android/exoplayer2/Player;)V:GetOnPause_Lcom_google_android_exoplayer2_Player_Handler\n" +
			"n_onPlay:(Lcom/google/android/exoplayer2/Player;)V:GetOnPlay_Lcom_google_android_exoplayer2_Player_Handler\n" +
			"n_onRewind:(Lcom/google/android/exoplayer2/Player;)V:GetOnRewind_Lcom_google_android_exoplayer2_Player_Handler\n" +
			"n_onSeekTo:(Lcom/google/android/exoplayer2/Player;J)V:GetOnSeekTo_Lcom_google_android_exoplayer2_Player_JHandler\n" +
			"n_onSetRepeatMode:(Lcom/google/android/exoplayer2/Player;I)V:GetOnSetRepeatMode_Lcom_google_android_exoplayer2_Player_IHandler\n" +
			"n_onSetShuffleMode:(Lcom/google/android/exoplayer2/Player;I)V:GetOnSetShuffleMode_Lcom_google_android_exoplayer2_Player_IHandler\n" +
			"n_onStop:(Lcom/google/android/exoplayer2/Player;)V:GetOnStop_Lcom_google_android_exoplayer2_Player_Handler\n" +
			"";
		mono.android.Runtime.register ("MediaManager.Platforms.Android.Media.PlaybackController, MediaManager", PlaybackController.class, __md_methods);
	}


	public PlaybackController ()
	{
		super ();
		if (getClass () == PlaybackController.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.Media.PlaybackController, MediaManager", "", this, new java.lang.Object[] {  });
	}


	public PlaybackController (long p0, long p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == PlaybackController.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.Media.PlaybackController, MediaManager", "System.Int64, mscorlib:System.Int64, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public java.lang.String[] getCommands ()
	{
		return n_getCommands ();
	}

	private native java.lang.String[] n_getCommands ();


	public long getSupportedPlaybackActions (com.google.android.exoplayer2.Player p0)
	{
		return n_getSupportedPlaybackActions (p0);
	}

	private native long n_getSupportedPlaybackActions (com.google.android.exoplayer2.Player p0);


	public void onCommand (com.google.android.exoplayer2.Player p0, java.lang.String p1, android.os.Bundle p2, android.os.ResultReceiver p3)
	{
		n_onCommand (p0, p1, p2, p3);
	}

	private native void n_onCommand (com.google.android.exoplayer2.Player p0, java.lang.String p1, android.os.Bundle p2, android.os.ResultReceiver p3);


	public void onFastForward (com.google.android.exoplayer2.Player p0)
	{
		n_onFastForward (p0);
	}

	private native void n_onFastForward (com.google.android.exoplayer2.Player p0);


	public void onPause (com.google.android.exoplayer2.Player p0)
	{
		n_onPause (p0);
	}

	private native void n_onPause (com.google.android.exoplayer2.Player p0);


	public void onPlay (com.google.android.exoplayer2.Player p0)
	{
		n_onPlay (p0);
	}

	private native void n_onPlay (com.google.android.exoplayer2.Player p0);


	public void onRewind (com.google.android.exoplayer2.Player p0)
	{
		n_onRewind (p0);
	}

	private native void n_onRewind (com.google.android.exoplayer2.Player p0);


	public void onSeekTo (com.google.android.exoplayer2.Player p0, long p1)
	{
		n_onSeekTo (p0, p1);
	}

	private native void n_onSeekTo (com.google.android.exoplayer2.Player p0, long p1);


	public void onSetRepeatMode (com.google.android.exoplayer2.Player p0, int p1)
	{
		n_onSetRepeatMode (p0, p1);
	}

	private native void n_onSetRepeatMode (com.google.android.exoplayer2.Player p0, int p1);


	public void onSetShuffleMode (com.google.android.exoplayer2.Player p0, int p1)
	{
		n_onSetShuffleMode (p0, p1);
	}

	private native void n_onSetShuffleMode (com.google.android.exoplayer2.Player p0, int p1);


	public void onStop (com.google.android.exoplayer2.Player p0)
	{
		n_onStop (p0);
	}

	private native void n_onStop (com.google.android.exoplayer2.Player p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
