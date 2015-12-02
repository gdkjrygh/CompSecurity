// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart;

import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package com.ubercab.client.feature.shoppingcart:
//            ShoppingConfirmationView

final class a
    implements Runnable
{

    final ShoppingConfirmationView a;

    public final void run()
    {
        if (a.mContentArea.getHeight() > 0)
        {
            a.mScrollContainer.setScrollY(a.mContentArea.getHeight());
            return;
        } else
        {
            ShoppingConfirmationView.a(a);
            return;
        }
    }

    (ShoppingConfirmationView shoppingconfirmationview)
    {
        a = shoppingconfirmationview;
        super();
    }
}
