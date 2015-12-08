// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.core.player.model.PlaybackStartDescriptor;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            ak, DirectorSavedState

public class PlaybackServiceState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ak();
    public final DirectorSavedState directorState;
    public final boolean manageAudioFocus;
    public final PlaybackStartDescriptor playbackStartDescriptor;
    public final com.google.android.apps.youtube.core.player.sequencer.PlaybackSequencer.SequencerState sequencerState;

    public PlaybackServiceState(Parcel parcel)
    {
        ClassLoader classloader = getClass().getClassLoader();
        playbackStartDescriptor = (PlaybackStartDescriptor)parcel.readParcelable(classloader);
        directorState = (DirectorSavedState)parcel.readParcelable(classloader);
        sequencerState = (com.google.android.apps.youtube.core.player.sequencer.PlaybackSequencer.SequencerState)parcel.readParcelable(classloader);
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        manageAudioFocus = flag;
    }

    public PlaybackServiceState(PlaybackStartDescriptor playbackstartdescriptor, com.google.android.apps.youtube.core.player.sequencer.PlaybackSequencer.SequencerState sequencerstate, DirectorSavedState directorsavedstate, boolean flag)
    {
        playbackStartDescriptor = playbackstartdescriptor;
        directorState = directorsavedstate;
        sequencerState = sequencerstate;
        manageAudioFocus = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        i = 0;
        parcel.writeParcelable(playbackStartDescriptor, 0);
        parcel.writeParcelable(directorState, 0);
        parcel.writeParcelable(sequencerState, 0);
        if (manageAudioFocus)
        {
            i = 1;
        }
        parcel.writeInt(i);
    }

}
