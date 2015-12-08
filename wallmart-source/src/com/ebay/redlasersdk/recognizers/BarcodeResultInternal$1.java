// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ebay.redlasersdk.recognizers;

import android.os.Parcel;

// Referenced classes of package com.ebay.redlasersdk.recognizers:
//            BarcodeResultInternal

static final class 
    implements android.os.rcodeResultInternal._cls1
{

    public final Object createFromParcel(Parcel parcel)
    {
        return new BarcodeResultInternal(parcel, null);
    }

    public final volatile Object[] newArray(int i)
    {
        return new BarcodeResultInternal[i];
    }

    ()
    {
    }
}
