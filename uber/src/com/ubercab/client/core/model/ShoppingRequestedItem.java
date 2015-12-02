// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.rider.realtime.request.param.ShoppingCartItem;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_ShoppingRequestedItem

public abstract class ShoppingRequestedItem
    implements ShoppingCartItem
{

    public ShoppingRequestedItem()
    {
    }

    public static ShoppingRequestedItem create(String s, int i)
    {
        return (new Shape_ShoppingRequestedItem()).setItemId(s).setQuantity(i);
    }

    public abstract String getItemId();

    public abstract int getQuantity();

    abstract ShoppingRequestedItem setItemId(String s);

    abstract ShoppingRequestedItem setQuantity(int i);
}
