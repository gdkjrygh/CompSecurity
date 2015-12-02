// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body.payment;


// Referenced classes of package com.ubercab.rider.realtime.request.body.payment:
//            Shape_BankCard

public abstract class BankCard
{

    public BankCard()
    {
    }

    public static BankCard create(String s, String s1, String s2, String s3)
    {
        return (new Shape_BankCard()).setCardNumber(s).setCardExpirationMonth(s1).setCardExpirationYear(s2).setCardCode(s3);
    }

    public abstract String getCardCode();

    public abstract String getCardExpirationMonth();

    public abstract String getCardExpirationYear();

    public abstract String getCardNumber();

    abstract BankCard setCardCode(String s);

    abstract BankCard setCardExpirationMonth(String s);

    abstract BankCard setCardExpirationYear(String s);

    abstract BankCard setCardNumber(String s);
}
