package crc644b1a6e14a4741484;


public class MediaDescriptionAdapter
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_createCurrentContentIntent:(Lcom/google/android/exoplayer2/Player;)Landroid/app/PendingIntent;:GetCreateCurrentContentIntent_Lcom_google_android_exoplayer2_Player_Handler:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager/IMediaDescriptionAdapterInvoker, ExoPlayer.UI\n" +
			"n_getCurrentContentText:(Lcom/google/android/exoplayer2/Player;)Ljava/lang/String;:GetGetCurrentContentText_Lcom_google_android_exoplayer2_Player_Handler:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager/IMediaDescriptionAdapterInvoker, ExoPlayer.UI\n" +
			"n_getCurrentContentTitle:(Lcom/google/android/exoplayer2/Player;)Ljava/lang/String;:GetGetCurrentContentTitle_Lcom_google_android_exoplayer2_Player_Handler:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager/IMediaDescriptionAdapterInvoker, ExoPlayer.UI\n" +
			"n_getCurrentLargeIcon:(Lcom/google/android/exoplayer2/Player;Lcom/google/android/exoplayer2/ui/PlayerNotificationManager$BitmapCallback;)Landroid/graphics/Bitmap;:GetGetCurrentLargeIcon_Lcom_google_android_exoplayer2_Player_Lcom_google_android_exoplayer2_ui_PlayerNotificationManager_BitmapCallback_Handler:Com.Google.Android.Exoplayer2.UI.PlayerNotificationManager/IMediaDescriptionAdapterInvoker, ExoPlayer.UI\n" +
			"";
		mono.android.Runtime.register ("MediaManager.Platforms.Android.Media.MediaDescriptionAdapter, MediaManager", MediaDescriptionAdapter.class, __md_methods);
	}


	public MediaDescriptionAdapter ()
	{
		super ();
		if (getClass () == MediaDescriptionAdapter.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.Media.MediaDescriptionAdapter, MediaManager", "", this, new java.lang.Object[] {  });
	}

	public MediaDescriptionAdapter (android.app.PendingIntent p0)
	{
		super ();
		if (getClass () == MediaDescriptionAdapter.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.Media.MediaDescriptionAdapter, MediaManager", "Android.App.PendingIntent, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public android.app.PendingIntent createCurrentContentIntent (com.google.android.exoplayer2.Player p0)
	{
		return n_createCurrentContentIntent (p0);
	}

	private native android.app.PendingIntent n_createCurrentContentIntent (com.google.android.exoplayer2.Player p0);


	public java.lang.String getCurrentContentText (com.google.android.exoplayer2.Player p0)
	{
		return n_getCurrentContentText (p0);
	}

	private native java.lang.String n_getCurrentContentText (com.google.android.exoplayer2.Player p0);


	public java.lang.String getCurrentContentTitle (com.google.android.exoplayer2.Player p0)
	{
		return n_getCurrentContentTitle (p0);
	}

	private native java.lang.String n_getCurrentContentTitle (com.google.android.exoplayer2.Player p0);


	public android.graphics.Bitmap getCurrentLargeIcon (com.google.android.exoplayer2.Player p0, com.google.android.exoplayer2.ui.PlayerNotificationManager.BitmapCallback p1)
	{
		return n_getCurrentLargeIcon (p0, p1);
	}

	private native android.graphics.Bitmap n_getCurrentLargeIcon (com.google.android.exoplayer2.Player p0, com.google.android.exoplayer2.ui.PlayerNotificationManager.BitmapCallback p1);

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
