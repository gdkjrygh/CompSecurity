// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.ubercab.client.feature.shoppingcart:
//            ShoppingLookingView

final class a extends DebouncingOnClickListener
{

    final ShoppingLookingView a;
    final ckout b;

    public final void doClick(View view)
    {
        a.onClickButtonCheckout();
    }

    Q(Q q, ShoppingLookingView shoppinglookingview)
    {
        b = q;
        a = shoppinglookingview;
        super();
    }
}
