// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;


// Referenced classes of package com.stripe.model:
//            StripeObject, Coupon

public class Discount extends StripeObject
{

    Coupon coupon;
    String customer;
    Long end;
    String id;
    Long start;

    public Discount()
    {
    }

    public Coupon getCoupon()
    {
        return coupon;
    }

    public String getCustomer()
    {
        return customer;
    }

    public Long getEnd()
    {
        return end;
    }

    public String getId()
    {
        return id;
    }

    public Long getStart()
    {
        return start;
    }

    public void setCoupon(Coupon coupon1)
    {
        coupon = coupon1;
    }

    public void setCustomer(String s)
    {
        customer = s;
    }

    public void setEnd(Long long1)
    {
        end = long1;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setStart(Long long1)
    {
        start = long1;
    }
}
