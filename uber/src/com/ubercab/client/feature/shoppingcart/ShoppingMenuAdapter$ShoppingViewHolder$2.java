// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.ubercab.client.feature.shoppingcart.model.Reminder;
import fir;
import fis;
import n;

// Referenced classes of package com.ubercab.client.feature.shoppingcart:
//            ShoppingMenuAdapter

final class b
    implements android.content.er.ShoppingViewHolder._cls2
{

    final fis a;
    final Reminder b;
    final c c;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        long l = ((Long)a.getItem(i)).longValue();
        if (ShoppingMenuAdapter.b(c.c) != null)
        {
            if (b == null || TextUtils.isEmpty(b.getUuid()))
            {
                ShoppingMenuAdapter.b(c.c).a(c(c), l);
            } else
            {
                ShoppingMenuAdapter.b(c.c).a(c(c), b.getUuid(), l);
            }
        }
        b(c, n.hU);
    }

    ( , fis fis1, Reminder reminder)
    {
        c = ;
        a = fis1;
        b = reminder;
        super();
    }
}
