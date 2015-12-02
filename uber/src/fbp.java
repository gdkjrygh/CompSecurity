// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.promo.v3.PromoController;
import java.util.List;

public final class fbp
    implements ide
{

    final PromoController a;

    private fbp(PromoController promocontroller)
    {
        a = promocontroller;
        super();
    }

    public fbp(PromoController promocontroller, byte byte0)
    {
        this(promocontroller);
    }

    private void a(List list)
    {
        a.a.a(list);
        a.a.c();
    }

    public final void call(Object obj)
    {
        a((List)obj);
    }
}
