// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import android.os.Parcel;
import com.google.android.apps.youtube.a.a.h;
import com.google.android.apps.youtube.common.e.j;
import com.google.protobuf.micro.InvalidProtocolBufferMicroException;
import java.util.Collections;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            TrackingUrl

final class aq
    implements android.os.Parcelable.Creator
{

    aq()
    {
    }

    private static TrackingUrl a(Parcel parcel)
    {
        try
        {
            parcel = new TrackingUrl((h)j.b(parcel, new h()));
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            return new TrackingUrl("", Collections.emptySet());
        }
        return parcel;
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new TrackingUrl[i];
    }
}
