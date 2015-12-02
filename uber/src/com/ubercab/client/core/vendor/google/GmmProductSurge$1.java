// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.google;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.vendor.google:
//            GmmProductSurge

final class 
    implements android.os.
{

    private static GmmProductSurge a(Parcel parcel)
    {
        return new GmmProductSurge(parcel, (byte)0);
    }

    private static GmmProductSurge[] a(int i)
    {
        return new GmmProductSurge[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
