// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import com.ubercab.analytics.network.AnalyticsApi;
import com.ubercab.client.core.metrics.analytics.model.RiderEventsProperties;

public final class ddc
{

    public ddc()
    {
    }

    protected static chp a(hoi hoi, dao dao, grs grs1, chv chv, chu chu, cin cin1)
    {
        chn.a(dao, chu, chv, (AnalyticsApi)grs1.a(com/ubercab/analytics/network/AnalyticsApi), cin1, hoi);
        hoi = chn.a().b();
        hoi.b();
        return hoi;
    }

    protected static chv a(Application application, cev cev, dal dal)
    {
        application = new RiderEventsProperties(application, dal);
        application.register(cev);
        return application;
    }

    protected static cin a(chx chx, dao dao)
    {
        return new cin(chx, dao);
    }

    protected static cyi a()
    {
        return new cyi();
    }

    static dcv a(Application application)
    {
        return new dcv(application);
    }

    protected final chu a(cix cix)
    {
        return new chu(cix) {

            final cix a;
            final ddc b;

            public final Double a()
            {
                return a.d();
            }

            public final Double b()
            {
                return a.e();
            }

            public final Float c()
            {
                return a.f();
            }

            public final Float d()
            {
                return a.g();
            }

            public final Double e()
            {
                return a.h();
            }

            public final Float f()
            {
                return a.i();
            }

            public final Float g()
            {
                return a.j();
            }

            public final Long h()
            {
                return a.k();
            }

            
            {
                b = ddc.this;
                a = cix1;
                super();
            }
        };
    }
}
