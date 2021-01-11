package crc648260b0b07a55856f;


public class AudioFocusManager_AudioFocusListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.AudioManager.OnAudioFocusChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAudioFocusChange:(I)V:GetOnAudioFocusChange_IHandler:Android.Media.AudioManager/IOnAudioFocusChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("MediaManager.Platforms.Android.Audio.AudioFocusManager+AudioFocusListener, MediaManager", AudioFocusManager_AudioFocusListener.class, __md_methods);
	}


	public AudioFocusManager_AudioFocusListener ()
	{
		super ();
		if (getClass () == AudioFocusManager_AudioFocusListener.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.Audio.AudioFocusManager+AudioFocusListener, MediaManager", "", this, new java.lang.Object[] {  });
	}


	public void onAudioFocusChange (int p0)
	{
		n_onAudioFocusChange (p0);
	}

	private native void n_onAudioFocusChange (int p0);

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
