package crc644b1a6e14a4741484;


public class MediaPlayer
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("MediaManager.Platforms.Android.Media.MediaPlayer, MediaManager", MediaPlayer.class, __md_methods);
	}


	public MediaPlayer ()
	{
		super ();
		if (getClass () == MediaPlayer.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.Media.MediaPlayer, MediaManager", "", this, new java.lang.Object[] {  });
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
