// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;

import com.walmart.android.app.fastpickup.FastPickupUtil;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.walmart.android.data:
//            FastPickupOrder

public static class orders
{

    public List orders;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (orders)obj;
            if (!orders.equals(((orders) (obj)).orders))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return orders.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("[").append(FastPickupUtil.print(orders)).append("]").toString();
    }

    public til()
    {
        orders = new ArrayList();
    }

    public orders(String s)
    {
        orders = new ArrayList();
    }
}
