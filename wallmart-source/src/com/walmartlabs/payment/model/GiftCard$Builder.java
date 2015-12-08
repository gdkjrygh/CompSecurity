// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.model;

import android.os.Parcel;
import java.math.BigInteger;

// Referenced classes of package com.walmartlabs.payment.model:
//            GiftCard

public static class optOut
{

    public float balance;
    public BigInteger billingNumber;
    public String currency;
    public String id;
    public String label;
    public String lastFour;
    public boolean optOut;

    public GiftCard build()
    {
        return new GiftCard(this, null);
    }

    public ()
    {
    }

    public (Parcel parcel)
    {
        boolean flag = true;
        super();
        id = parcel.readString();
        label = parcel.readString();
        lastFour = parcel.readString();
        billingNumber = new BigInteger(parcel.readString());
        balance = parcel.readFloat();
        currency = parcel.readString();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        optOut = flag;
    }

    public optOut(GiftCard giftcard)
    {
        id = giftcard.id;
        label = giftcard.label;
        lastFour = giftcard.lastFour;
        billingNumber = giftcard.billingNumber;
        balance = giftcard.balance;
        currency = giftcard.currency;
        optOut = giftcard.optOut;
    }
}
