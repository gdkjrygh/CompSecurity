// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.network.model;


// Referenced classes of package com.ubercab.payment.internal.network.model:
//            Shape_CheckBalanceResponse

public abstract class CheckBalanceResponse
{

    public CheckBalanceResponse()
    {
    }

    public static CheckBalanceResponse create()
    {
        return new Shape_CheckBalanceResponse();
    }

    public static CheckBalanceResponse create(double d, String s, String s1)
    {
        return (new Shape_CheckBalanceResponse()).setAmount(d).setDisplayAmount(s).setCurrencyCode(s1);
    }

    public abstract double getAmount();

    public abstract String getCurrencyCode();

    public abstract String getDisplayAmount();

    abstract CheckBalanceResponse setAmount(double d);

    abstract CheckBalanceResponse setCurrencyCode(String s);

    abstract CheckBalanceResponse setDisplayAmount(String s);
}
