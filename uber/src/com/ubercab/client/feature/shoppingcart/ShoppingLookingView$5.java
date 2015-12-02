// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart;


// Referenced classes of package com.ubercab.client.feature.shoppingcart:
//            ShoppingLookingView, ShoppingMenuAdapter, ShoppingMenuRecyclerView

final class a
    implements Runnable
{

    final ShoppingLookingView a;

    public final void run()
    {
        a.mShoppingMenuRecyclerView.a(a.f.a());
    }

    ew(ShoppingLookingView shoppinglookingview)
    {
        a = shoppinglookingview;
        super();
    }
}
