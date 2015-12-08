// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.state;

import android.os.Parcel;
import com.google.android.apps.youtube.core.player.model.PlaybackStartDescriptor;
import com.google.android.apps.youtube.datalib.innertube.model.WatchNextResponse;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;

// Referenced classes of package com.google.android.apps.youtube.core.player.state:
//            d

public class WatchNextSequencerState
    implements com.google.android.apps.youtube.core.player.sequencer.PlaybackSequencer.SequencerState
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    public final PlaybackPair currentPlaybackPair;
    public PlaybackStartDescriptor currentPlaybackStartDescriptor;
    public final WatchNextResponse currentWatchNextResponse;
    public final boolean loop;
    public PlaybackStartDescriptor pendingPlaybackStartDescriptor;
    public final boolean shuffle;

    public WatchNextSequencerState(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        ClassLoader classloader = getClass().getClassLoader();
        currentPlaybackPair = (PlaybackPair)parcel.readParcelable(classloader);
        currentWatchNextResponse = (WatchNextResponse)parcel.readParcelable(classloader);
        currentPlaybackStartDescriptor = (PlaybackStartDescriptor)parcel.readParcelable(classloader);
        pendingPlaybackStartDescriptor = (PlaybackStartDescriptor)parcel.readParcelable(classloader);
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        shuffle = flag;
        if (parcel.readInt() == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        loop = flag;
    }

    public WatchNextSequencerState(PlaybackPair playbackpair, WatchNextResponse watchnextresponse, PlaybackStartDescriptor playbackstartdescriptor, PlaybackStartDescriptor playbackstartdescriptor1, boolean flag, boolean flag1)
    {
        currentPlaybackPair = playbackpair;
        currentWatchNextResponse = watchnextresponse;
        currentPlaybackStartDescriptor = playbackstartdescriptor;
        pendingPlaybackStartDescriptor = playbackstartdescriptor1;
        shuffle = flag;
        loop = flag1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeParcelable(currentPlaybackPair, 0);
        parcel.writeParcelable(currentWatchNextResponse, 0);
        parcel.writeParcelable(currentPlaybackStartDescriptor, 0);
        parcel.writeParcelable(pendingPlaybackStartDescriptor, 0);
        if (shuffle)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (loop)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
