// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.param;


// Referenced classes of package com.ubercab.rider.realtime.request.param:
//            Shape_ShoppingRequestedItem

public abstract class ShoppingRequestedItem
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
