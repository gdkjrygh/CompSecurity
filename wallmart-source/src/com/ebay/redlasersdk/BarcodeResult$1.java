// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ebay.redlasersdk;

import android.os.Parcel;

// Referenced classes of package com.ebay.redlasersdk:
//            BarcodeResult

static final class 
    implements android.os.or
{

    public final BarcodeResult createFromParcel(Parcel parcel)
    {
        return new BarcodeResult(parcel);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final BarcodeResult[] newArray(int i)
    {
        return new BarcodeResult[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
