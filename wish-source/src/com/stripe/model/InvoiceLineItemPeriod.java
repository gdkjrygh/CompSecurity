// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;


// Referenced classes of package com.stripe.model:
//            StripeObject

public class InvoiceLineItemPeriod extends StripeObject
{

    Long end;
    Long start;

    public InvoiceLineItemPeriod()
    {
    }

    public Long getEnd()
    {
        return end;
    }

    public Long getStart()
    {
        return start;
    }

    public void setEnd(Long long1)
    {
        end = long1;
    }

    public void setStart(Long long1)
    {
        start = long1;
    }
}
