// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import com.ubercab.rds.core.network.SupportApi;
import java.util.Calendar;

public final class hbt
{

    private final Application a;
    private final hci b;

    public hbt(Application application)
    {
        a = application;
        b = ((hcj)application).f();
    }

    public static hjf a(hjo hjo)
    {
        return hjf.a(hjo);
    }

    public static hjg b(hjo hjo)
    {
        return hjg.a(hjo);
    }

    public static Calendar b()
    {
        return Calendar.getInstance();
    }

    public final chp a()
    {
        return b.e();
    }

    public final hco a(cgh cgh1)
    {
        return new _cls1(cgh1);
    }

    public final gmg c()
    {
        return b.f();
    }

    public final hoi d()
    {
        return b.p();
    }

    public final cix e()
    {
        return b.r();
    }

    public final cgh f()
    {
        return cgh.a(a);
    }

    public final hch g()
    {
        return b.be();
    }

    public final hck h()
    {
        return b.t();
    }

    public final hjo i()
    {
        return b.s();
    }

    public final SupportApi j()
    {
        return b.u();
    }

    /* member class not found */
    class _cls1 {}

}
