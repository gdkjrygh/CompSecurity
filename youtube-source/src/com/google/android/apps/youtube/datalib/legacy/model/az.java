// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.os.Parcel;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            VastAd

final class az
    implements android.os.Parcelable.Creator
{

    az()
    {
    }

    private static VastAd a(Parcel parcel)
    {
        try
        {
            parcel = new VastAd(parcel);
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw new RuntimeException("Failed to parse VastAd's annotations parcel", parcel);
        }
        return parcel;
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new VastAd[i];
    }
}
