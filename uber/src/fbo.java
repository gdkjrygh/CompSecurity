// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.promo.v3.PromoController;

public final class fbo
    implements ide
{

    final PromoController a;

    private fbo(PromoController promocontroller)
    {
        a = promocontroller;
        super();
    }

    public fbo(PromoController promocontroller, byte byte0)
    {
        this(promocontroller);
    }

    private static void a(Throwable throwable)
    {
        ijg.d(throwable, "GetPromos", new Object[0]);
    }

    public final void call(Object obj)
    {
        a((Throwable)obj);
    }
}
