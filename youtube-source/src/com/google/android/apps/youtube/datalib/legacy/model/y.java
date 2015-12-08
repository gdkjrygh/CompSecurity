// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.os.Parcel;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            PlaybackPair

final class y
    implements android.os.Parcelable.Creator
{

    y()
    {
    }

    private PlaybackPair a(Parcel parcel)
    {
        PlayerResponse playerresponse = (PlayerResponse)parcel.readParcelable(getClass().getClassLoader());
        parcel = (Video)parcel.readSerializable();
        if (playerresponse == null || parcel == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel = new PlaybackPair(playerresponse, parcel);
        return parcel;
        parcel;
        return null;
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PlaybackPair[i];
    }
}
