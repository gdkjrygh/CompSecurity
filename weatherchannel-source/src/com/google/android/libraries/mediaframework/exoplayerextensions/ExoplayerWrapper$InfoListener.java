// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.mediaframework.exoplayerextensions;

import com.google.android.exoplayer.TimeRange;
import com.google.android.exoplayer.chunk.Format;

// Referenced classes of package com.google.android.libraries.mediaframework.exoplayerextensions:
//            ExoplayerWrapper

public static interface 
{

    public abstract void onAudioFormatEnabled(Format format, int i, long l);

    public abstract void onAvailableRangeChanged(TimeRange timerange);

    public abstract void onBandwidthSample(int i, long l, long l1);

    public abstract void onDecoderInitialized(String s, long l, long l1);

    public abstract void onDroppedFrames(int i, long l);

    public abstract void onLoadCompleted(int i, long l, int j, int k, Format format, long l1, long l2, long l3, long l4);

    public abstract void onLoadStarted(int i, long l, int j, int k, Format format, long l1, long l2);

    public abstract void onVideoFormatEnabled(Format format, int i, long l);
}
