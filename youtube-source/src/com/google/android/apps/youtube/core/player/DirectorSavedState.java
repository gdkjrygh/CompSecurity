// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            q, r

public final class DirectorSavedState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new q();
    public final VastAd ad;
    public final VmapAdBreak adBreak;
    public final int adStartPositionMillis;
    public final boolean canToggleFullscreen;
    public final r contentVideoState;
    public final WatchFeature feature;
    public final boolean isInAudioOnlyMode;
    public final boolean isInBackgroundMode;
    public final PlaybackClientManager.PlaybackClientManagerState playbackClientManagerState;
    public final PlaybackPair playbackPair;
    public final int streamSelectionHint;
    public final boolean userInitiatedPlayback;

    public DirectorSavedState(Parcel parcel)
    {
        boolean flag2 = true;
        super();
        ClassLoader classloader = getClass().getClassLoader();
        boolean flag;
        boolean flag1;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (parcel.readInt() == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        contentVideoState = new r(flag, flag1, parcel.readInt());
        playbackClientManagerState = (PlaybackClientManager.PlaybackClientManagerState)parcel.readParcelable(classloader);
        playbackPair = (PlaybackPair)parcel.readParcelable(classloader);
        feature = WatchFeature.fromOrdinal(parcel.readInt());
        streamSelectionHint = parcel.readInt();
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        canToggleFullscreen = flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        userInitiatedPlayback = flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isInBackgroundMode = flag;
        if (parcel.readInt() == 1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        isInAudioOnlyMode = flag;
        adBreak = (VmapAdBreak)parcel.readParcelable(classloader);
        ad = (VastAd)parcel.readParcelable(classloader);
        adStartPositionMillis = parcel.readInt();
    }

    public DirectorSavedState(r r1, PlaybackClientManager.PlaybackClientManagerState playbackclientmanagerstate, PlaybackPair playbackpair, WatchFeature watchfeature, int i, boolean flag, boolean flag1, 
            boolean flag2, boolean flag3, VmapAdBreak vmapadbreak, VastAd vastad, int j)
    {
        contentVideoState = r1;
        playbackClientManagerState = playbackclientmanagerstate;
        playbackPair = playbackpair;
        feature = (WatchFeature)c.a(watchfeature);
        streamSelectionHint = i;
        canToggleFullscreen = flag;
        userInitiatedPlayback = flag1;
        isInBackgroundMode = flag2;
        isInAudioOnlyMode = flag3;
        adBreak = vmapadbreak;
        ad = vastad;
        adStartPositionMillis = j;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return (new StringBuilder("DirectorSavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" contentVideoState=").append(contentVideoState).append(" playbackClientManagerState=").append(playbackClientManagerState).append(" playbackPair=").append(playbackPair).append(" feature=").append(feature).append(" streamSelectionHint=").append(streamSelectionHint).append(" canToggleFullscreen=").append(canToggleFullscreen).append(" userInitiatedPlayback=").append(userInitiatedPlayback).append(" isInBackgroundMode=").append(isInBackgroundMode).append(" isInAudioOnlyMode=").append(isInAudioOnlyMode).append(" adBreak=").append(adBreak).append(" ad=").append(ad).append(" adStartPositionMillis=").append(adStartPositionMillis).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        r r1 = contentVideoState;
        if (r1.a)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (r1.b)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeInt(r1.c);
        parcel.writeParcelable(playbackClientManagerState, 0);
        parcel.writeParcelable(playbackPair, 0);
        parcel.writeInt(feature.ordinal());
        parcel.writeInt(streamSelectionHint);
        if (canToggleFullscreen)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (userInitiatedPlayback)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (isInBackgroundMode)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (isInAudioOnlyMode)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeParcelable(adBreak, 0);
        parcel.writeParcelable(ad, 0);
        parcel.writeInt(adStartPositionMillis);
    }

}
