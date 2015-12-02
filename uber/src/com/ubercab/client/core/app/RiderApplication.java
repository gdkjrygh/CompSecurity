// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.app;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import ces;
import cev;
import chp;
import chx;
import chy;
import cig;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mobileapptracker.MobileAppTracker;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.core.support.multidex.CoreMultiDexApplication;
import com.ubercab.network.uspout.UspoutClient;
import com.ubercab.rider.realtime.object.PersistedObjectDataStore;
import crt;
import cwy;
import cxc;
import cyl;
import cyy;
import czf;
import czg;
import czh;
import czi;
import czj;
import dai;
import daj;
import dak;
import dal;
import dao;
import das;
import dat;
import dba;
import dbf;
import dcb;
import dch;
import dco;
import dcv;
import dcw;
import dcz;
import dda;
import ddc;
import ddn;
import dec;
import ded;
import dee;
import def;
import deg;
import deh;
import dfp;
import dfq;
import djg;
import djh;
import djs;
import djt;
import djv;
import dod;
import doe;
import dol;
import dop;
import doq;
import dor;
import dqv;
import dqx;
import drj;
import drt;
import dua;
import due;
import dun;
import dwx;
import dxa;
import efa;
import eky;
import eyy;
import fei;
import foz;
import gju;
import gjz;
import gkf;
import gkh;
import gla;
import glb;
import glc;
import glf;
import glk;
import gll;
import gln;
import gmb;
import gmc;
import gmg;
import gpt;
import gqd;
import grb;
import gry;
import grz;
import hav;
import hay;
import hci;
import hcj;
import hoi;
import hoq;
import hsq;
import ijg;
import ijj;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import rx;
import ry;

// Referenced classes of package com.ubercab.client.core.app:
//            RiderActivity

public class RiderApplication extends CoreMultiDexApplication
    implements chy, czh, czi, glc, grz, hcj
{

    private static final String U[] = {
        "NDKLIBRARY"
    };
    public cyy A;
    public czf B;
    public eyy C;
    public dor D;
    public fei E;
    public dal F;
    public cyl G;
    public gpt H;
    public dao I;
    public djv J;
    public ijj K;
    public gmc L;
    public das M;
    public glf N;
    public dat O;
    public UspoutClient P;
    public dak Q;
    public gju R;
    public ContentResolver S;
    public foz T;
    private dfp V;
    private glb W;
    private boolean X;
    private czh Y;
    public chp a;
    public dcv b;
    public cev c;
    public dai d;
    public gqd e;
    public czg f;
    public ExecutorService g;
    public gmg h;
    public hsq i;
    public chx j;
    public dch k;
    public dqv l;
    public MobileAppTracker m;
    public efa n;
    public cig o;
    public grb p;
    public dwx q;
    public PersistedObjectDataStore r;
    public daj s;
    public dol t;
    public doq u;
    public dod v;
    public djt w;
    public dqx x;
    public dda y;
    public hsq z;

    public RiderApplication()
    {
    }

    private void A()
    {
        n.a();
    }

    private void B()
    {
        E.b();
    }

    private void C()
    {
        ijg.a(K);
        if (h.a(dbf.C))
        {
            dbf dbf1 = dbf.bN;
            dbf dbf2 = dbf.af;
            dbf dbf3 = dbf.aw;
            dbf dbf4 = dbf.F;
            ijg.a(new dco(P, Q, new dba(h, new dbf[] {
                dbf1, dbf2, dbf3, dbf4
            })));
        }
    }

    private void D()
    {
        crt.a(this, V);
    }

    private void E()
    {
        if (h.a(dbf.M))
        {
            w.a();
        }
        if (h.a(dbf.N))
        {
            J.a();
        }
    }

    private void F()
    {
        if (h.a(dbf.bn))
        {
            r.enable();
        }
    }

    private void G()
    {
        if (h.a(dbf.bl))
        {
            ((ThreadPoolExecutor)g).setMaximumPoolSize(20);
        }
    }

    private void H()
    {
        c.a(this);
    }

    private void I()
    {
        ViewConfiguration viewconfiguration;
        Field field;
        try
        {
            viewconfiguration = ViewConfiguration.get(this);
            field = android/view/ViewConfiguration.getDeclaredField("sHasPermanentMenuKey");
        }
        catch (Exception exception)
        {
            return;
        }
        if (field == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        field.setAccessible(true);
        field.setBoolean(viewconfiguration, false);
    }

    private void J()
    {
        if (!X)
        {
            X = true;
            ((eky)z.a()).a();
            D.a();
        }
    }

    private static djg K()
    {
        return deg.a().a(new djh()).a();
    }

    public static RiderApplication a(Context context)
    {
        return (RiderApplication)context.getApplicationContext();
    }

    private void a(Handler handler, RiderActivity rideractivity)
    {
        handler.post(new Runnable(rideractivity) {

            final RiderActivity a;
            final RiderApplication b;

            public final void run()
            {
                RiderApplication.a(b, a);
            }

            
            {
                b = RiderApplication.this;
                a = rideractivity;
                super();
            }
        });
    }

    static void a(RiderApplication riderapplication, Handler handler, RiderActivity rideractivity)
    {
        riderapplication.a(handler, rideractivity);
    }

    static void a(RiderApplication riderapplication, RiderActivity rideractivity)
    {
        riderapplication.b(rideractivity);
    }

    private void a(dfp dfp1)
    {
        dfp1.a(this);
    }

    private void a(dop dop)
    {
        if (X)
        {
            X = false;
            ((eky)z.a()).b();
            D.a(F.u(), dop);
        }
    }

    private void a(hav hav1)
    {
        if (!X)
        {
            X = true;
            ((eky)z.a()).a();
            if (!t.a())
            {
                t.a(hav1);
            }
        }
    }

    private void a(hay hay)
    {
        if (X)
        {
            X = false;
            ((eky)z.a()).b();
            t.a(hay);
        }
    }

    private void b(RiderActivity rideractivity)
    {
        F.P();
        l.a();
        s.a();
        E.a();
        ((hoi)i.a()).a("com.ubercab.client.RIDER_ACCOUNT");
        s();
        if (h.a(dbf.aI))
        {
            C.a();
        }
        e.a();
        rideractivity.v();
    }

    public static boolean g()
    {
        if (!TextUtils.isEmpty(cyy.d()))
        {
            return true;
        }
        for (Iterator iterator = dod.b.iterator(); iterator.hasNext();)
        {
            if (((File)iterator.next()).exists())
            {
                return true;
            }
        }

        return false;
    }

    private dfp k()
    {
        djg djg1 = K();
        djg1.f().a();
        return dec.q().a(djg1).a(new ddc()).a(new dcb()).a(djs.a(this)).a(djs.a()).a(new dfq(this)).a(djs.a(this)).a(new drj(this)).a(new ddn(this)).a();
    }

    private void l()
    {
        if (F.v())
        {
            if (h.a(dbf.aM))
            {
                hav hav1;
                if (doq.a(this))
                {
                    hav1 = hav.b;
                } else
                {
                    hav1 = hav.a;
                }
                a(hav1);
            } else
            if (doq.a(this))
            {
                J();
                return;
            }
        }
    }

    private void m()
    {
        String s1;
        if (!cwy.b(this))
        {
            m.setDeviceId(G.a());
            if (S != null)
            {
                m.setAndroidId(android.provider.Settings.Secure.getString(S, "android_id"));
            }
        } else
        {
            g.execute(new Runnable() {

                final RiderApplication a;

                public final void run()
                {
                    com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = AdvertisingIdClient.getAdvertisingIdInfo(a);
                    a.m.setGoogleAdvertisingId(info.getId(), info.isLimitAdTrackingEnabled());
_L1:
                    return;
                    Object obj;
                    obj;
                    a.m.setDeviceId(a.G.a());
                    if (a.S != null)
                    {
                        a.m.setAndroidId(android.provider.Settings.Secure.getString(a.S, "android_id"));
                        return;
                    }
                      goto _L1
                    obj;
                    return;
                    obj;
                }

            
            {
                a = RiderApplication.this;
                super();
            }
            });
        }
        s1 = dua.a(this);
        if (s1 != null && !"com.android.vending".equals(s1))
        {
            m.setPackageName(s1);
        }
        m.measureSession();
    }

    private void n()
    {
        if (h.a(dbf.aO))
        {
            a.c();
        }
        if (I.e())
        {
            a.a(true);
            a.a(b);
        }
    }

    private void o()
    {
        registerActivityLifecycleCallbacks(j);
        j.a(this);
    }

    private void p()
    {
        s();
        if (h.a(dbf.P))
        {
            q();
            return;
        } else
        {
            r();
            return;
        }
    }

    private void q()
    {
        czg.a(O);
    }

    private void r()
    {
        if (!h.a(dbf.I))
        {
            return;
        } else
        {
            gkf gkf1 = new gkf();
            gkf1.a(new gln(L));
            a.d();
            gkf1.a(new glk(a));
            gkf1.a(new gll(new gla(a)));
            gkf1.a(new gmb(p));
            N.a(gkf1.a());
            czg.a(N);
            M.a();
            return;
        }
    }

    private void s()
    {
        L.a(F.z());
    }

    private void t()
    {
        if (h.a(dbf.aI))
        {
            C.e();
        }
    }

    private void u()
    {
        hoq.a(this);
    }

    private void v()
    {
        String as[] = U;
        int j1 = as.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            due.a(this, as[i1]);
        }

    }

    private void w()
    {
        dun.a(this, F);
    }

    private void x()
    {
        if (F.v() && dxa.a(h))
        {
            q.a(this, false);
        }
    }

    private void y()
    {
        k.a();
    }

    private void z()
    {
        o.a(y);
    }

    public final void a()
    {
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("lifecycle").setName(dcz.a);
        a.a(analyticsevent);
        T.b();
        T.a("close");
    }

    public final void a(Intent intent)
    {
        a.a(gju.a());
        Object obj = new dcw(intent);
        AnalyticsEvent analyticsevent = AnalyticsEvent.create("lifecycle").setName(dcz.c).setReferrer(((dcw) (obj)).a()).setValue(((dcw) (obj)).b()).setUrl(intent.getDataString());
        obj = dua.a(this);
        intent = ((Intent) (obj));
        if (obj == null)
        {
            intent = "NO_INSTALLER";
        }
        String s1 = v.g();
        obj = s1;
        if (s1 == null)
        {
            obj = "NO_PRELOAD_DATA";
        }
        if (v.a())
        {
            intent = (new gkh()).a("preload_data", obj).a("install_referrer", intent).a();
            analyticsevent.setCustomValues((new gkh()).a("first_time_launch_android", intent).a());
        }
        a.a(analyticsevent);
        if (T.d())
        {
            T.a("open");
        } else
        {
            T.c();
        }
        T.a();
    }

    public final void a(RiderActivity rideractivity)
    {
        Handler handler = new Handler(Looper.getMainLooper());
        x.c();
        if (!i())
        {
            rideractivity.b(getString(0x7f070296), null);
        }
        if (!X)
        {
            b(rideractivity);
            return;
        }
        if (!h.a(dbf.aM))
        {
            a(new dop(handler, rideractivity) {

                final Handler a;
                final RiderActivity b;
                final RiderApplication c;

                public final void a(Exception exception)
                {
                    RiderApplication.a(c, a, b);
                }

                public final void a(String s1, String s2)
                {
                    RiderApplication.a(c, a, b);
                }

            
            {
                c = RiderApplication.this;
                a = handler;
                b = rideractivity;
                super();
            }
            });
            return;
        }
        if (!t.a())
        {
            b(rideractivity);
            return;
        } else
        {
            a(new hay(handler, rideractivity) {

                final Handler a;
                final RiderActivity b;
                final RiderApplication c;

                public final void a()
                {
                    RiderApplication.a(c, a, b);
                }

                public final void b()
                {
                    RiderApplication.a(c, a, b);
                }

            
            {
                c = RiderApplication.this;
                a = handler;
                b = rideractivity;
                super();
            }
            });
            return;
        }
    }

    public final volatile void a(czj czj)
    {
        a((dfp)czj);
    }

    public final void a(String s1, String s2, String s3)
    {
        gjz.a(s1);
        gjz.a(s2);
        if (TextUtils.isEmpty(s2))
        {
            ijg.a(dbf.af.name()).d("setCurrentUser_Empty_Token", new Object[0]);
        }
        F.d(s1);
        F.c(s2);
        if (!h.a(dbf.at))
        {
            d.a(s3);
        }
        (new doe(this)).a();
        s();
        l();
    }

    public final dfp b()
    {
        return V;
    }

    public final czj c()
    {
        return k();
    }

    public final czj d()
    {
        return b();
    }

    public final gry e()
    {
        return V;
    }

    public final hci f()
    {
        return V;
    }

    public final boolean h()
    {
        return !g() || v.d();
    }

    public final boolean i()
    {
        return (getApplicationInfo().flags & 0x100) != 0;
    }

    public final glb j()
    {
        if (W == null)
        {
            djg djg1 = K();
            djg1.f().a();
            W = dee.a().a(djg1).a(new ddc()).a(new ddn(this)).a(djs.a(this)).a(djs.a(this)).a(new dfq(this)).a();
        }
        return W;
    }

    public void onCreate()
    {
        super.onCreate();
        if (!cxc.a(this) && !i())
        {
            return;
        }
        if (!i())
        {
            ces.a();
        }
        if (Y == null)
        {
            V = k();
        } else
        {
            V = (dfp)Y.c();
        }
        a(V);
        G();
        C();
        p();
        y();
        v();
        n();
        o();
        u();
        m();
        A();
        z();
        l();
        B();
        t();
        w();
        I();
        H();
        x();
        E();
        F();
        D();
    }

}
