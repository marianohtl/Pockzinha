package crc644b1a6e14a4741484;


public class MetadataOutput
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.exoplayer2.metadata.MetadataOutput
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMetadata:(Lcom/google/android/exoplayer2/metadata/Metadata;)V:GetOnMetadata_Lcom_google_android_exoplayer2_metadata_Metadata_Handler:Com.Google.Android.Exoplayer2.Metadata.IMetadataOutputInvoker, ExoPlayer.Core\n" +
			"";
		mono.android.Runtime.register ("MediaManager.Platforms.Android.Media.MetadataOutput, MediaManager", MetadataOutput.class, __md_methods);
	}


	public MetadataOutput ()
	{
		super ();
		if (getClass () == MetadataOutput.class)
			mono.android.TypeManager.Activate ("MediaManager.Platforms.Android.Media.MetadataOutput, MediaManager", "", this, new java.lang.Object[] {  });
	}


	public void onMetadata (com.google.android.exoplayer2.metadata.Metadata p0)
	{
		n_onMetadata (p0);
	}

	private native void n_onMetadata (com.google.android.exoplayer2.metadata.Metadata p0);

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
