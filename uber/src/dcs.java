// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.ubercab.android.location.UberLocation;
import com.ubercab.android.location.service.model.UberLocationRequest;
import com.ubercab.client.core.model.AppConfig;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.model.RiderAppConfig;
import com.ubercab.client.core.model.Session;
import com.ubercab.client.core.model.TagToken;
import com.ubercab.client.core.realtime.model.PollingResponse;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dcs extends dcq
    implements ciw, gnw, gqk
{

    private static final TimeUnit a;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private long E;
    private Runnable F;
    private final chp b;
    private final dqt c;
    private final Application d;
    private final cev e;
    private final gqd f;
    private final gmg g;
    private final bjw h;
    private final Handler i = new Handler(Looper.getMainLooper());
    private final cix j;
    private final Object k = new Object();
    private final dpb l;
    private final dpg m;
    private final gob n;
    private final dce o;
    private final dkn p;
    private final ScheduledExecutorService q;
    private final dqx r;
    private final dal s;
    private final dcu t;
    private final dao u;
    private final hkp v;
    private dct w;
    private ScheduledFuture x;
    private icl y;
    private cis z;

    public dcs(chp chp1, dqt dqt, Application application, cev cev1, gqd gqd1, gmg gmg1, bjw bjw1, 
            cix cix1, dpb dpb1, dpg dpg1, gob gob1, dce dce1, dkn dkn1, ScheduledExecutorService scheduledexecutorservice, 
            dqx dqx, dal dal1, dcu dcu1, dao dao1, hkp hkp1)
    {
        F = new Runnable() {

            final dcs a;

            public final void run()
            {
                if (dcs.a(a) != null && !dcs.a(a).isCancelled())
                {
                    dcs.b(a);
                    if (dcs.c(a).v())
                    {
                        dcs.d(a).d();
                        return;
                    }
                }
            }

            
            {
                a = dcs.this;
                super();
            }
        };
        b = chp1;
        c = dqt;
        d = application;
        e = cev1;
        f = gqd1;
        g = gmg1;
        h = bjw1;
        j = cix1;
        l = dpb1;
        r = dqx;
        m = dpg1;
        n = gob1;
        o = dce1;
        p = dkn1;
        q = scheduledexecutorservice;
        s = dal1;
        t = dcu1;
        u = dao1;
        v = hkp1;
    }

    static ScheduledFuture a(dcs dcs1)
    {
        return dcs1.x;
    }

    private void a(cis cis1)
    {
        k();
        synchronized (k)
        {
            z = cis1;
            z.a(this);
            z.a(i());
            z.c();
        }
        if (dxf.a(d))
        {
            w = new dct(this, cis1);
            i.postDelayed(w, 4000L);
            return;
        } else
        {
            e.c(produceNoLocationEvent());
            return;
        }
        cis1;
        obj;
        JVM INSTR monitorexit ;
        throw cis1;
    }

    private void a(Ping ping)
    {
        if (ping.isForceUpgrade() && !TextUtils.isEmpty(ping.getForceUpgradeUrl()))
        {
            d.startActivity((new Intent("com.ubercab.intent.ForceUpgrade")).setFlags(0x10008000).putExtra("forceUpgradeUrl", ping.getForceUpgradeUrl()));
            h();
        }
    }

    private void a(gqg gqg1)
    {
        a(gqg1, E);
    }

    private void a(gqg gqg1, long l1)
    {
        if (!gqg1.c() || m.n())
        {
            return;
        } else
        {
            h();
            x = q.schedule(F, l1, a);
            return;
        }
    }

    private void a(gqg gqg1, Ping ping)
    {
        if (dul.n(ping))
        {
            String s1 = ping.getSession().getSessionHash();
            if (!TextUtils.isEmpty(s1) && !s1.equals(s.O()))
            {
                s.k(s1);
            }
        }
        if (dul.p(ping))
        {
            E = ping.getAppConfig().getPingUpdateIntervalMs().longValue();
            if (E < 1000L)
            {
                E = 1000L;
            }
        } else
        {
            E = 4000L;
        }
        a(gqg1, E);
        if (!A)
        {
            A = true;
            if (dul.c(ping))
            {
                a(((Context) (d)), ping.getAppConfig().getRiderConfig().getTagTokens());
            }
        }
    }

    private void a(String s1)
    {
        byte byte0;
        o.a(s1);
        if (!D)
        {
            return;
        }
        byte0 = -1;
        s1.hashCode();
        JVM INSTR tableswitch 64093495 64093495: default 40
    //                   64093495 83;
           goto _L1 _L2
_L1:
        byte0;
        JVM INSTR tableswitch 0 0: default 60
    //                   0 98;
           goto _L3 _L4
_L3:
        s1 = t.a(d, cit.b);
_L5:
        a(((cis) (s1)));
        return;
_L2:
        if (s1.equals("CHINA"))
        {
            byte0 = 0;
        }
          goto _L1
_L4:
        s1 = t.a(d, cit.a);
          goto _L5
    }

    static ScheduledFuture b(dcs dcs1)
    {
        dcs1.x = null;
        return null;
    }

    static dal c(dcs dcs1)
    {
        return dcs1.s;
    }

    static dkn d(dcs dcs1)
    {
        return dcs1.p;
    }

    static dqx e(dcs dcs1)
    {
        return dcs1.r;
    }

    static dqt f(dcs dcs1)
    {
        return dcs1.c;
    }

    private void f()
    {
        if (!C)
        {
            C = true;
            b.a(l.bS);
        }
    }

    static Application g(dcs dcs1)
    {
        return dcs1.d;
    }

    private void g()
    {
label0:
        {
            if (s.v())
            {
                B = true;
                if (!m.n())
                {
                    break label0;
                }
                y = l.a().a(ico.a()).c(new ide() {

                    final dcs a;

                    private void a(PollingResponse pollingresponse)
                    {
                        if (pollingresponse.isSuccessful())
                        {
                            dcs.e(a).f();
                            pollingresponse = dcs.f(a).a(com.ubercab.client.core.config.AppConfigKey.Rider.f, "");
                            a.a(dcs.g(a), pollingresponse);
                        }
                    }

                    public final void call(Object obj)
                    {
                        a((PollingResponse)obj);
                    }

            
            {
                a = dcs.this;
                super();
            }
                });
            }
            return;
        }
        p.d();
    }

    static Handler h(dcs dcs1)
    {
        return dcs1.i;
    }

    private void h()
    {
        if (x != null)
        {
            x.cancel(true);
            x = null;
        }
        if (y != null)
        {
            y.b();
        }
    }

    private static UberLocationRequest i()
    {
        return UberLocationRequest.create().setPriority(1).setFastestInterval(16L).setInterval(5000L);
    }

    static dct i(dcs dcs1)
    {
        return dcs1.w;
    }

    private static UberLocationRequest j()
    {
        return UberLocationRequest.create().setPriority(0).setFastestInterval(3000L).setInterval(5000L);
    }

    static dct j(dcs dcs1)
    {
        dcs1.w = null;
        return null;
    }

    static cev k(dcs dcs1)
    {
        return dcs1.e;
    }

    private void k()
    {
        synchronized (k)
        {
            if (z != null && z.b())
            {
                z.b(this);
                z.d();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void a()
    {
        B = false;
        A = false;
        C = false;
        D = true;
        e.a(this);
        n.a(this);
        f.a(this);
        E = 4000L;
        e.c(producePersistentConnectionManagerReadyEvent());
    }

    final void a(Context context, String s1)
    {
        if (!TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s2;
        Object obj;
        try
        {
            s1 = Base64.decode(s1, 0);
            s1 = cwx.a(drg.a, s1, "AES");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ijg.d(context, "Failed to parse tag tokens and tag user.", new Object[0]);
            return;
        }
        if (s1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        s1 = new String(s1);
        s1 = (List)h.a(s1, (new bmj() {

            final dcs a;

            
            {
                a = dcs.this;
                super();
            }
        }).getType());
        if (s1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        s1 = s1.iterator();
_L3:
        while (s1.hasNext()) 
        {
            obj = (TagToken)s1.next();
            s2 = ((TagToken) (obj)).getTag();
            obj = ((TagToken) (obj)).getValidator();
            if (!TextUtils.isEmpty(((CharSequence) (obj))) && !TextUtils.isEmpty(s2) && s.v() && cwm.b(context, ((String) (obj))))
            {
                if (!m.t())
                {
                    break MISSING_BLOCK_LABEL_180;
                }
                v.b(s2).b(duo.a());
            }
        }
        continue; /* Loop/switch isn't completed */
        p.d(s2);
          goto _L3
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void a(ciu ciu1)
    {
        if (ciu1.a() == -1)
        {
            e.c(new ciz());
        }
    }

    public final void a(UberLocation uberlocation)
    {
        synchronized (k)
        {
            if (z != null && z.b() && z.a() == null)
            {
                z.a(j());
            }
        }
        if (u.l())
        {
            uberlocation = u.k();
        }
        j.a(uberlocation);
        f();
        if (!B)
        {
            g();
        }
        return;
        uberlocation;
        obj;
        JVM INSTR monitorexit ;
        throw uberlocation;
    }

    public final volatile void a(gqg gqg1, gqj gqj, Response response)
    {
        a(gqg1);
    }

    public final void a(gqg gqg1, RetrofitError retrofiterror)
    {
        a(gqg1, E);
    }

    public final volatile void a(gqj gqj)
    {
        a((Ping)gqj);
    }

    public final void a(Exception exception)
    {
        a("UNKNOWN");
    }

    public final volatile void a(Object obj)
    {
        a((String)obj);
    }

    protected final void b()
    {
        D = false;
        if (w != null)
        {
            synchronized (i)
            {
                i.removeCallbacks(w);
                w = null;
            }
        }
        e.b(this);
        k();
        h();
        f.b(this);
        return;
        exception;
        handler;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b(gqg gqg1, gqj gqj, Response response)
    {
        a(gqg1, (Ping)gqj);
    }

    public final void b_()
    {
        if (g.a(dbf.bm))
        {
            synchronized (k)
            {
                if (z != null && z.a() != null)
                {
                    a(z.a());
                }
            }
            return;
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c()
    {
        n.a(this);
    }

    public final void onNoLocationEvent(ciz ciz1)
    {
        if (!B)
        {
            g();
        }
    }

    public final ciz produceNoLocationEvent()
    {
        Object obj = null;
        ciz ciz1;
        if (!dxf.a(d))
        {
            ciz1 = new ciz();
        } else
        {
            ciz1 = obj;
            if (z != null)
            {
                ciz1 = obj;
                if (w == null)
                {
                    ciz1 = obj;
                    if (j.c() == null)
                    {
                        return new ciz();
                    }
                }
            }
        }
        return ciz1;
    }

    public final czk producePersistentConnectionManagerReadyEvent()
    {
        return new czk();
    }

    static 
    {
        a = TimeUnit.MILLISECONDS;
    }
}
