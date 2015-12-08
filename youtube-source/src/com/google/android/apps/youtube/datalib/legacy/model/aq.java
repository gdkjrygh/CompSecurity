// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.os.Parcel;
import com.google.android.apps.youtube.a.a.a.b;
import com.google.android.apps.youtube.common.e.j;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            Survey

final class aq
    implements android.os.Parcelable.Creator
{

    aq()
    {
    }

    private static Survey a(Parcel parcel)
    {
        try
        {
            parcel = new Survey((b)j.b(parcel, new b()), null);
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            return Survey.EMPTY;
        }
        return parcel;
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new Survey[i];
    }
}
