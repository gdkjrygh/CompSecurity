// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import java.util.List;

// Referenced classes of package com.stripe.model:
//            StripeObject

public class CustomerCollection extends StripeObject
{

    Integer count;
    List data;

    public CustomerCollection()
    {
    }

    public Integer getCount()
    {
        return count;
    }

    public List getData()
    {
        return data;
    }

    public void setCount(Integer integer)
    {
        count = integer;
    }

    public void setData(List list)
    {
        data = list;
    }
}
