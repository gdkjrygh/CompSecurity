// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.state;

import android.os.Parcel;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;

// Referenced classes of package com.google.android.apps.youtube.core.player.state:
//            c

public class VideoIdsSequencerState
    implements com.google.android.apps.youtube.core.player.sequencer.PlaybackSequencer.SequencerState
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    public final byte clickTrackingParams[];
    public final PlaybackPair currentPlayerResponse;
    public final int index;
    public final boolean loop;
    public final int pendingIndex;
    public final String playerParams;
    public final String videoIds[];

    public VideoIdsSequencerState(Parcel parcel)
    {
        videoIds = new String[parcel.readInt()];
        parcel.readStringArray(videoIds);
        clickTrackingParams = new byte[parcel.readInt()];
        parcel.readByteArray(clickTrackingParams);
        playerParams = parcel.readString();
        index = parcel.readInt();
        pendingIndex = parcel.readInt();
        currentPlayerResponse = (PlaybackPair)parcel.readParcelable(getClass().getClassLoader());
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

    public VideoIdsSequencerState(String as[], byte abyte0[], String s, int i, int j, PlaybackPair playbackpair, boolean flag)
    {
        videoIds = as;
        clickTrackingParams = abyte0;
        playerParams = s;
        index = i;
        pendingIndex = j;
        currentPlayerResponse = playbackpair;
        loop = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        i = 0;
        parcel.writeInt(videoIds.length);
        parcel.writeStringArray(videoIds);
        parcel.writeInt(clickTrackingParams.length);
        parcel.writeByteArray(clickTrackingParams);
        parcel.writeString(playerParams);
        parcel.writeInt(index);
        parcel.writeInt(pendingIndex);
        parcel.writeParcelable(currentPlayerResponse, 0);
        if (loop)
        {
            i = 1;
        }
        parcel.writeInt(i);
    }

}
