// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import android.os.Parcel;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            WatchNextResponse

final class az
    implements android.os.Parcelable.Creator
{

    az()
    {
    }

    private static WatchNextResponse a(Parcel parcel)
    {
        try
        {
            parcel = new WatchNextResponse(parcel, null);
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            return null;
        }
        return parcel;
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new WatchNextResponse[i];
    }
}
