// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.core.model.AppConfig;
import com.ubercab.client.core.model.Ping;
import java.util.concurrent.TimeUnit;

public final class cyh extends dcq
{

    private final chp a;
    private final ica b;
    private final cev c;
    private final cig d;
    private final RiderApplication e;
    private icl f;
    private final dao g;

    public cyh(chp chp, cev cev1, cig cig1, RiderApplication riderapplication, ici ici, dao dao1)
    {
        f = ijd.b();
        a = chp;
        c = cev1;
        d = cig1;
        e = riderapplication;
        g = dao1;
        b = ica.a(new idh() {

            final cyh a;

            private ica a()
            {
                cyh.a(a).f();
                cyh.b(a).a();
                return ica.b(null);
            }

            public final Object call()
            {
                return a();
            }

            
            {
                a = cyh.this;
                super();
            }
        }).b(ico.a()).g(new idi(ici) {

            final ici a;
            final cyh b;

            private ica a(ica ica1)
            {
                return ica1.a(TimeUnit.SECONDS, a);
            }

            public final volatile Object a(Object obj)
            {
                return a((ica)obj);
            }

            
            {
                b = cyh.this;
                a = ici;
                super();
            }
        });
    }

    static chp a(cyh cyh1)
    {
        return cyh1.a;
    }

    static cig b(cyh cyh1)
    {
        return cyh1.d;
    }

    private void c()
    {
        while (!e.h() || !f.c()) 
        {
            return;
        }
        f = b.h();
    }

    private void f()
    {
        f.b();
    }

    protected final void a()
    {
        c.a(this);
        c();
    }

    protected final void b()
    {
        c.b(this);
        f();
    }

    public final void onPermissionsAcceptedEvent(dof dof)
    {
        c();
    }

    public final void onPingEvent(dar dar1)
    {
        dar1 = dar1.a();
        if (dul.b(dar1))
        {
            boolean flag = dar1.getAppConfig().isNetworkMonitoringEnabled();
            g.b(flag);
            d.a(flag);
        }
    }
}
