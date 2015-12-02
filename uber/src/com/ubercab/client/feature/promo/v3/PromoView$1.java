// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.promo.v3;

import android.animation.AnimatorSet;
import android.support.v7.widget.RecyclerView;
import fbg;
import hm;

// Referenced classes of package com.ubercab.client.feature.promo.v3:
//            PromoView

public final class a extends hm
{

    final PromoView a;

    public final void a(RecyclerView recyclerview, int i)
    {
        if (!PromoView.a(a))
        {
            if (i < -20 && PromoView.b(a))
            {
                PromoView.c(a).start();
                PromoView.d(a).cancel();
                PromoView.a(a, false);
                PromoView.b(a, true);
                fbg.b(a.mItemsView, PromoView.e(a));
            } else
            if (i > 20 && !PromoView.b(a))
            {
                PromoView.c(a).cancel();
                PromoView.d(a).start();
                PromoView.a(a, true);
                PromoView.b(a, true);
                fbg.b(a.mItemsView, PromoView.e(a) - PromoView.f(a));
                return;
            }
        }
    }

    (PromoView promoview)
    {
        a = promoview;
        super();
    }
}
