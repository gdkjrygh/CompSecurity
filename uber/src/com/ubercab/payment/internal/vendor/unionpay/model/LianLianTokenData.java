// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.unionpay.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.payment.internal.vendor.unionpay.model:
//            Shape_LianLianTokenData

public abstract class LianLianTokenData
    implements Parcelable
{

    public static final String CARD_TYPE_CREDIT = "3";
    public static final String CARD_TYPE_DEBIT = "2";

    public LianLianTokenData()
    {
    }

    public static LianLianTokenData createCard(String s, String s1, String s2, String s3)
    {
        return (new Shape_LianLianTokenData()).setCardNumberLastDigits(s).setCardType(s1).setExpirationDate(s2).setPayload(s3);
    }

    public abstract String getCardNumberLastDigits();

    public abstract String getCardType();

    public abstract String getExpirationDate();

    public abstract String getPayload();

    abstract LianLianTokenData setCardNumberLastDigits(String s);

    abstract LianLianTokenData setCardType(String s);

    abstract LianLianTokenData setExpirationDate(String s);

    abstract LianLianTokenData setPayload(String s);
}
