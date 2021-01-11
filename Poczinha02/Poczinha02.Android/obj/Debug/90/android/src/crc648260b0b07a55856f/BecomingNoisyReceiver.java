package crc648260b0b07a55856f;


public class BecomingNoisyReceiver
	extends android.content.BroadcastReceiver
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onReceive:(Landroid/content/Context;Landroid/content/Intent;)V:GetOnReceive_Landroid_content_Context_Landroid_content_Intent_Handler\n" +
			"";
		mono.android.Runtime.register ("MediaManager.Platforms.Android.Audio.BecomingNoisyReceiver, MediaManager", BecomingNoisyReceiver.class, __md_methods);
	}


	public BecomingNoisyReceiver ()
	{
		super ();
		if (getClass () == BecomingNoisyReceiver.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.Audio.BecomingNoisyReceiver, MediaManager", "", this, new java.lang.Object[] {  });
	}


	public void onReceive (android.content.Context p0, android.content.Intent p1)
	{
		n_onReceive (p0, p1);
	}

	private native void n_onReceive (android.content.Context p0, android.content.Intent p1);

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
