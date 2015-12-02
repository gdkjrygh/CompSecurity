// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.promo.v3.PromoViewModel;
import com.ubercab.ui.collection.model.ViewModel;
import java.util.Collections;
import java.util.List;

public final class fbn extends hqg
{

    private final fbm a = new fbm();

    public fbn(hqi hqi)
    {
        super(hqi);
        b(Collections.singletonList(new fby()));
    }

    public final int a()
    {
        return a.a();
    }

    public final void a(PromoViewModel promoviewmodel)
    {
        a.a(promoviewmodel);
    }

    public final void a(List list)
    {
        a.a(list);
    }

    protected final ViewModel c(int i)
    {
        return (ViewModel)a.a(i);
    }
}
