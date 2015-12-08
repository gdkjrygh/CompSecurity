// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.state;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.apps.youtube.datalib.innertube.model.WatchNextResponse;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;

// Referenced classes of package com.google.android.apps.youtube.core.player.state:
//            b

public class OfflineSequencerState
    implements com.google.android.apps.youtube.core.player.sequencer.PlaybackSequencer.SequencerState
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    public final byte clickTrackingParams[];
    public final PlaybackPair currentPlaybackPair;
    public final WatchNextResponse currentWatchNextResponse;
    public final int index;
    public final boolean loop;
    public final int pendingIndex;
    public final String playlistId;
    public final String videoId;

    public OfflineSequencerState(Parcel parcel)
    {
        Object obj = null;
        super();
        String s1 = parcel.readString();
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = null;
        }
        videoId = s;
        s = parcel.readString();
        if (TextUtils.isEmpty(s))
        {
            s = obj;
        }
        playlistId = s;
        clickTrackingParams = new byte[parcel.readInt()];
        parcel.readByteArray(clickTrackingParams);
        currentPlaybackPair = (PlaybackPair)parcel.readParcelable(getClass().getClassLoader());
        currentWatchNextResponse = (WatchNextResponse)parcel.readParcelable(getClass().getClassLoader());
        index = parcel.readInt();
        pendingIndex = parcel.readInt();
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        loop = flag;
    }

    public OfflineSequencerState(String s, String s1, byte abyte0[], PlaybackPair playbackpair, WatchNextResponse watchnextresponse, int i, int j, 
            boolean flag)
    {
        videoId = s;
        playlistId = s1;
        clickTrackingParams = abyte0;
        currentPlaybackPair = playbackpair;
        currentWatchNextResponse = watchnextresponse;
        index = i;
        pendingIndex = j;
        loop = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        String s;
        if (videoId != null)
        {
            s = videoId;
        } else
        {
            s = "";
        }
        parcel.writeString(s);
        if (playlistId != null)
        {
            s = playlistId;
        } else
        {
            s = "";
        }
        parcel.writeString(s);
        parcel.writeInt(clickTrackingParams.length);
        parcel.writeByteArray(clickTrackingParams);
        parcel.writeParcelable(currentPlaybackPair, 0);
        parcel.writeParcelable(currentWatchNextResponse, 0);
        parcel.writeInt(index);
        parcel.writeInt(pendingIndex);
        if (loop)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
