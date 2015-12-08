// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.os.Parcel;

// Referenced classes of package com.braintreepayments.api.models:
//            PayPalAccount

static final class 
    implements android.os.or
{

    public PayPalAccount createFromParcel(Parcel parcel)
    {
        return new PayPalAccount(parcel, null);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public PayPalAccount[] newArray(int i)
    {
        return new PayPalAccount[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
