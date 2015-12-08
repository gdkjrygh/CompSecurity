// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model.media;

import android.os.Parcel;
import com.google.a.a.a.a.fj;
import com.google.android.apps.youtube.common.e.j;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model.media:
//            FormatStream

final class a
    implements android.os.Parcelable.Creator
{

    a()
    {
    }

    private static FormatStream a(Parcel parcel)
    {
        try
        {
            parcel = new FormatStream((fj)j.b(parcel, new fj()), parcel.readString(), parcel.readLong());
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw new IllegalArgumentException(parcel);
        }
        return parcel;
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new FormatStream[i];
    }
}
