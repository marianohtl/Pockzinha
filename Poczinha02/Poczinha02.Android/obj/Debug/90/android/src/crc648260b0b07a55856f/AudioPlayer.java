package crc648260b0b07a55856f;


public class AudioPlayer
	extends crc644b1a6e14a4741484.MediaPlayer
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("MediaManager.Platforms.Android.Audio.AudioPlayer, MediaManager", AudioPlayer.class, __md_methods);
	}


	public AudioPlayer ()
	{
		super ();
		if (getClass () == AudioPlayer.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.Audio.AudioPlayer, MediaManager", "", this, new java.lang.Object[] {  });
	}

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
