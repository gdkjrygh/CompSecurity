// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.state;

import android.os.Parcel;
import com.google.android.apps.youtube.datalib.innertube.model.WatchNextResponse;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;

// Referenced classes of package com.google.android.apps.youtube.core.player.state:
//            VideoIdsSequencerState, e

public class WatchNextVideoIdsSequencerState extends VideoIdsSequencerState
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    public final WatchNextResponse currentWatchNextResponse;

    public WatchNextVideoIdsSequencerState(Parcel parcel)
    {
        super(parcel);
        currentWatchNextResponse = (WatchNextResponse)parcel.readParcelable(getClass().getClassLoader());
    }

    public WatchNextVideoIdsSequencerState(String as[], byte abyte0[], String s, int i, int j, PlaybackPair playbackpair, WatchNextResponse watchnextresponse, 
            boolean flag)
    {
        super(as, abyte0, s, i, j, playbackpair, flag);
        currentWatchNextResponse = watchnextresponse;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(currentWatchNextResponse, 0);
    }

}
