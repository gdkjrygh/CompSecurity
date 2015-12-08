// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;

import android.text.TextUtils;
import com.walmart.android.app.fastpickup.FastPickupUtil;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.walmart.android.data:
//            FastPickupOrder

public static class items
{

    public int customerState;
    public String id;
    public List items;
    public String orderDate;
    public List pickupPersons;
    public items store;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (items)obj;
            if (id == null ? ((id) (obj)).id != null : !id.equals(((id) (obj)).id))
            {
                return false;
            }
            if (!items.equals(((items) (obj)).items))
            {
                return false;
            }
            if (orderDate == null ? ((orderDate) (obj)).orderDate != null : !orderDate.equals(((orderDate) (obj)).orderDate))
            {
                return false;
            }
            if (!pickupPersons.equals(((pickupPersons) (obj)).pickupPersons))
            {
                return false;
            }
            if (store == null ? ((store) (obj)).store != null : !store.equals(((equals) (obj)).store))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (id != null)
        {
            i = id.hashCode();
        } else
        {
            i = 0;
        }
        if (orderDate != null)
        {
            j = orderDate.hashCode();
        } else
        {
            j = 0;
        }
        if (store != null)
        {
            k = store.hashCode();
        }
        return (((i * 31 + j) * 31 + k) * 31 + pickupPersons.hashCode()) * 31 + items.hashCode();
    }

    public boolean isForStore(String s)
    {
        boolean flag;
        if (store != null && store.number != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag && (TextUtils.isEmpty(s) || store.number.equals(s));
    }

    public void setCustomerState(ata ata)
    {
        if (ata != null)
        {
            customerState = ata.getUserStatus();
        }
    }

    public void setItems(List list)
    {
        items = list;
    }

    public String toString()
    {
        return (new StringBuilder()).append("{ id=").append(id).append(", orderDate:").append(orderDate).append(", store:").append(store).append(", pickupPersons:[").append(FastPickupUtil.print(pickupPersons)).append("],items [").append(FastPickupUtil.print(items)).append("]").append("}").toString();
    }

    public ata()
    {
        pickupPersons = new ArrayList();
        customerState = -1;
        items = new ArrayList();
    }
}
