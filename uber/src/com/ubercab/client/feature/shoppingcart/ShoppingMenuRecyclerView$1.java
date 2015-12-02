// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart;

import fiu;

// Referenced classes of package com.ubercab.client.feature.shoppingcart:
//            ShoppingMenuRecyclerView

final class a
    implements Runnable
{

    final ShoppingMenuRecyclerView a;

    public final void run()
    {
        a.h.c(ShoppingMenuRecyclerView.a(a) + ShoppingMenuRecyclerView.b(a));
    }

    (ShoppingMenuRecyclerView shoppingmenurecyclerview)
    {
        a = shoppingmenurecyclerview;
        super();
    }
}
