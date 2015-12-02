// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;

import java.util.List;

// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_ShoppingCart

public abstract class ShoppingCart
{

    public ShoppingCart()
    {
    }

    public static ShoppingCart create(List list)
    {
        return (new Shape_ShoppingCart()).setItems(list);
    }

    public abstract List getItems();

    abstract ShoppingCart setItems(List list);
}
