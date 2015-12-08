// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.common.fromguava.b;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            y

public class PlaybackPair
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new y();
    private final PlayerResponse playerResponse;
    private final Video video;

    public PlaybackPair(PlayerResponse playerresponse, Video video1)
    {
        playerResponse = playerresponse;
        video = video1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof PlaybackPair))
            {
                return false;
            }
            obj = (PlaybackPair)obj;
            if (!b.a(playerResponse, ((PlaybackPair) (obj)).getPlayerResponse()) || !b.a(video, ((PlaybackPair) (obj)).getVideo()))
            {
                return false;
            }
        }
        return true;
    }

    public PlayerResponse getPlayerResponse()
    {
        return playerResponse;
    }

    public Video getVideo()
    {
        return video;
    }

    public int hashCode()
    {
        if (playerResponse != null)
        {
            playerResponse.hashCode();
        }
        if (video != null)
        {
            video.hashCode();
        }
        return super.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(playerResponse, 0);
        parcel.writeSerializable(video);
    }

}
