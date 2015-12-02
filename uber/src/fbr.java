// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.promo.v3.PromoController;
import com.ubercab.client.feature.promo.v3.PromoView;
import com.ubercab.client.feature.promo.v3.PromoViewModel;

public final class fbr
    implements ide
{

    final PromoController a;

    private fbr(PromoController promocontroller)
    {
        a = promocontroller;
        super();
    }

    public fbr(PromoController promocontroller, byte byte0)
    {
        this(promocontroller);
    }

    private void a(PromoViewModel promoviewmodel)
    {
        a.a.a(promoviewmodel);
        a.a.d();
        a.mView.a();
    }

    public final void call(Object obj)
    {
        a((PromoViewModel)obj);
    }
}
