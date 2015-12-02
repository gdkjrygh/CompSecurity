// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_TunesProvider, TunesProvider

final class _cls9
    implements android.os.pe_TunesProvider._cls1
{

    public final TunesProvider createFromParcel(Parcel parcel)
    {
        return new Shape_TunesProvider(parcel, null);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final TunesProvider[] newArray(int i)
    {
        return new TunesProvider[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    _cls9()
    {
    }
}
