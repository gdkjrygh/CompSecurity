// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.payment;

import android.os.Parcel;

// Referenced classes of package com.walmartlabs.payment.service.payment:
//            PairRequest

public static class creditCardId
{

    private String creditCardId;
    private String token;
    private boolean useAssociateDiscount;
    private boolean useGiftCardsFirst;

    public PairRequest build()
    {
        return new PairRequest(this);
    }

    public creditCardId setCreditCardId(String s)
    {
        creditCardId = s;
        return this;
    }

    public creditCardId setToken(String s)
    {
        token = s;
        return this;
    }

    public token setUseAssociateDiscount(boolean flag)
    {
        useAssociateDiscount = flag;
        return this;
    }

    public useAssociateDiscount setUseGiftCards(boolean flag)
    {
        useGiftCardsFirst = flag;
        return this;
    }





    public A()
    {
    }

    public A(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        token = parcel.readString();
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        useAssociateDiscount = flag;
        if (parcel.readInt() == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        useGiftCardsFirst = flag;
        creditCardId = parcel.readString();
    }
}
