// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;


// Referenced classes of package com.stripe.model:
//            StripeObject

public class NextRecurringCharge extends StripeObject
{

    Integer amount;
    String date;

    public NextRecurringCharge()
    {
    }

    public Integer getAmount()
    {
        return amount;
    }

    public String getDate()
    {
        return date;
    }

    public void setAmount(Integer integer)
    {
        amount = integer;
    }

    public void setDate(String s)
    {
        date = s;
    }
}
