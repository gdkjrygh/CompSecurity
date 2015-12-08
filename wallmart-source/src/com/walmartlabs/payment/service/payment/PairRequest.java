// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.payment;

import android.os.Parcel;

public class PairRequest
{
    public static class Builder
    {

        private String creditCardId;
        private String token;
        private boolean useAssociateDiscount;
        private boolean useGiftCardsFirst;

        public PairRequest build()
        {
            return new PairRequest(this);
        }

        public Builder setCreditCardId(String s)
        {
            creditCardId = s;
            return this;
        }

        public Builder setToken(String s)
        {
            token = s;
            return this;
        }

        public Builder setUseAssociateDiscount(boolean flag)
        {
            useAssociateDiscount = flag;
            return this;
        }

        public Builder setUseGiftCards(boolean flag)
        {
            useGiftCardsFirst = flag;
            return this;
        }





        public Builder()
        {
        }

        public Builder(Parcel parcel)
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


    public String creditCardId;
    public String token;
    public boolean useAssociateDiscount;
    public boolean useGiftCardsFirst;

    public PairRequest()
    {
    }

    public PairRequest(Builder builder)
    {
        token = builder.token;
        useAssociateDiscount = builder.useAssociateDiscount;
        useGiftCardsFirst = builder.useGiftCardsFirst;
        creditCardId = builder.creditCardId;
    }
}
