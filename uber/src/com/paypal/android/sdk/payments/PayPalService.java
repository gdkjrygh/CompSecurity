// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import bqz;
import bra;
import bre;
import bst;
import bsu;
import bsv;
import bsx;
import bsy;
import bta;
import bti;
import btk;
import btl;
import bto;
import btv;
import btz;
import buf;
import buh;
import buj;
import bun;
import buo;
import buq;
import bur;
import bus;
import buv;
import buw;
import bux;
import bvy;
import bwa;
import bwb;
import bwc;
import bwd;
import bwe;
import bwf;
import bwg;
import bwh;
import bwj;
import bwm;
import bwn;
import bwp;
import bxe;
import byc;
import byq;
import bzn;
import bzp;
import bzr;
import bzs;
import bzt;
import bzu;
import bzv;
import bzw;
import bzx;
import bzy;
import ccm;
import cct;
import ccu;
import com.paypal.android.sdk.bB;
import com.paypal.android.sdk.bF;
import com.paypal.android.sdk.bI;
import com.paypal.android.sdk.bK;
import com.paypal.android.sdk.bY;
import com.paypal.android.sdk.ca;
import com.paypal.android.sdk.ce;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk.payments:
//            PayPalConfiguration, PayPalItem

public final class PayPalService extends Service
{

    static final ExecutorService a = btv.a();
    private static final String c = com/paypal/android/sdk/payments/PayPalService.getSimpleName();
    private static Intent t;
    public bF b;
    private bus d;
    private buq e;
    private PayPalConfiguration f;
    private boolean g;
    private bzn h;
    private bzn i;
    private cct j;
    private String k;
    private bsv l;
    private bzv m;
    private String n;
    private bsx o;
    private bsy p;
    private List q;
    private boolean r;
    private boolean s;
    private final BroadcastReceiver u = new bzr(this);
    private final IBinder v = new bzu(this);

    public PayPalService()
    {
        h = new bzn();
        i = new bzn();
        j = new ccm(this);
        q = new ArrayList();
        r = true;
        s = true;
    }

    private boolean A()
    {
        return f != null && e != null;
    }

    private static buq B()
    {
        return new buq();
    }

    private void C()
    {
        a(new bzs(this), false);
    }

    public static bzw a(buj buj1)
    {
        return c(buj1);
    }

    public static PayPalConfiguration a(PayPalService paypalservice)
    {
        return paypalservice.f;
    }

    private static void a(Context context)
    {
        Log.w("paypal.sdk", "clearing user data");
        a.submit(new bzp(context));
    }

    private void a(Intent intent)
    {
        t = intent;
        (new StringBuilder("init:")).append(b(intent));
        if (f == null)
        {
            f = (PayPalConfiguration)intent.getParcelableExtra("com.paypal.android.sdk.paypalConfiguration");
            if (f == null)
            {
                throw new RuntimeException("Missing EXTRA_PAYPAL_CONFIGURATION. To avoid this error, set EXTRA_PAYPAL_CONFIGURATION in both PayPalService, and the initializing activity.");
            }
        }
        if (!f.o())
        {
            throw new RuntimeException("Service extras invalid.  Please check the docs.");
        }
        Object obj1 = f.b();
        Object obj;
        if (bst.c(((String) (obj1))))
        {
            obj = "https://api-m.paypal.com/v1/";
        } else
        if (bst.b(((String) (obj1))))
        {
            obj = "https://api-m.sandbox.paypal.com/v1/";
        } else
        if (bst.a(((String) (obj1))))
        {
            obj = null;
        } else
        if (z() && intent.hasExtra("com.paypal.android.sdk.baseEnvironmentUrl"))
        {
            obj = intent.getStringExtra("com.paypal.android.sdk.baseEnvironmentUrl");
        } else
        {
            throw new RuntimeException((new StringBuilder("Invalid environment selected:")).append(((String) (obj1))).toString());
        }
        p = new bsy(o, f.b());
        obj = b(((String) (obj1)), ((String) (obj)));
        if (l == null)
        {
            int i1;
            int j1;
            boolean flag;
            boolean flag1;
            if (z() && intent.hasExtra("com.paypal.android.sdk.mockNetworkDelay"))
            {
                i1 = intent.getIntExtra("com.paypal.android.sdk.mockNetworkDelay", 500);
            } else
            {
                i1 = 500;
            }
            if (z() && intent.hasExtra("com.paypal.android.sdk.mockEnable2fa"))
            {
                flag = intent.getBooleanExtra("com.paypal.android.sdk.mockEnable2fa", false);
            } else
            {
                flag = false;
            }
            if (z() && intent.hasExtra("com.paypal.android.sdk.mock2faPhoneNumberCount"))
            {
                j1 = intent.getIntExtra("com.paypal.android.sdk.mock2faPhoneNumberCount", 1);
            } else
            {
                j1 = 1;
            }
            r = true;
            if (z() && intent.hasExtra("com.paypal.android.sdk.enableAuthenticator"))
            {
                r = intent.getBooleanExtra("com.paypal.android.sdk.enableAuthenticator", true);
            }
            if (z() && intent.hasExtra("com.paypal.android.sdk.enableAuthenticatorSecurity"))
            {
                s = intent.getBooleanExtra("com.paypal.android.sdk.enableAuthenticatorSecurity", true);
            }
            if (z() && intent.hasExtra("com.paypal.android.sdk.enableStageSsl"))
            {
                flag1 = intent.getBooleanExtra("com.paypal.android.sdk.enableStageSsl", true);
            } else
            {
                flag1 = true;
            }
            obj1 = o;
            a();
            l = new bsv(((bsx) (obj1)), ((bsu) (obj)));
            l.a(new btk(new bzx(this, (byte)0)));
            obj = new bwp(l, i1, flag, j1);
            obj1 = new btz(o, f.b(), a(), l, a().b(), bra.a(a()), flag1);
            obj = new buf(f.b(), l, ((btx) (obj)), ((btz) (obj1)));
            l.a(((buf) (obj)));
        }
        bux.b(f.a());
        if (e == null)
        {
            e = B();
        }
        if (!f.j())
        {
            a(o.f());
        }
        k = intent.getComponent().getPackageName();
        a(buw.a);
        C();
    }

    private void a(buw buw1, boolean flag, String s1, String s2, String s3)
    {
        j.a(buw1, flag, s1, s2, s3);
    }

    public static void a(PayPalService paypalservice, buj buj1)
    {
        paypalservice.e.c = null;
        (new StringBuilder()).append(buj1.o()).append(" request error");
        String s1 = buj1.q().a();
        Log.e("paypal.sdk", s1);
        paypalservice.b(buw.b, s1, buj1.k());
        if (paypalservice.m != null)
        {
            paypalservice.m.a(c(buj1));
            paypalservice.m = null;
        }
        paypalservice.g = false;
    }

    public static void a(PayPalService paypalservice, buw buw1, boolean flag, String s1, String s2)
    {
        paypalservice.a(buw1, flag, s1, s2, null);
    }

    private static boolean a(bI bi)
    {
        return bi != null && bi.c();
    }

    private static bwj[] a(PayPalItem apaypalitem[])
    {
        if (apaypalitem == null)
        {
            return null;
        }
        bwj abwj[] = new bwj[apaypalitem.length];
        int k1 = apaypalitem.length;
        int j1 = 0;
        for (int i1 = 0; j1 < k1; i1++)
        {
            PayPalItem paypalitem = apaypalitem[j1];
            abwj[i1] = new bwj(paypalitem.a(), paypalitem.b(), paypalitem.c(), paypalitem.d(), paypalitem.e());
            j1++;
        }

        return abwj;
    }

    private static bsu b(String s1, String s2)
    {
        bsu bsu1 = new bsu();
        bsu1.a(s1);
        bsu1.a(new HashMap());
        if (s2 != null)
        {
            if (!s2.startsWith("https://"))
            {
                throw new RuntimeException((new StringBuilder()).append(s2).append(" does not start with 'https://', ignoring ").append(s1).toString());
            }
            s1 = s2;
            if (!s2.endsWith("/"))
            {
                (new StringBuilder()).append(s2).append(" does not end with a slash, adding one.");
                s1 = (new StringBuilder()).append(s2).append("/").toString();
            }
            buh buh1;
            for (s2 = buo.d().iterator(); s2.hasNext(); bsu1.b().put(buh1.a(), (new StringBuilder()).append(s1).append(buh1.c()).toString()))
            {
                buh1 = (buh)s2.next();
            }

        }
        return bsu1;
    }

    private static String b(Intent intent)
    {
        if (intent == null)
        {
            return "Intent = null";
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Intent{");
        stringbuilder.append((new StringBuilder("action:")).append(intent.getAction()).toString());
        stringbuilder.append((new StringBuilder(", cmp:")).append(intent.getComponent()).append(", ").toString());
        if (intent.getExtras() == null)
        {
            stringbuilder.append("null extras");
        } else
        {
            stringbuilder.append("extras:");
            Iterator iterator = intent.getExtras().keySet().iterator();
            while (iterator.hasNext()) 
            {
                String s1 = (String)iterator.next();
                stringbuilder.append((new StringBuilder("(")).append(s1).append(":").append(intent.getExtras().get(s1)).append(")").toString());
            }
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    private void b(buj buj1)
    {
        l.b(buj1);
    }

    private void b(buw buw1, String s1, String s2)
    {
        a(buw1, false, s1, s2, null);
    }

    public static void b(PayPalService paypalservice, buj buj1)
    {
        String s1 = buj1.q().a();
        Log.e("paypal.sdk", s1);
        paypalservice.b(buw.h, s1, buj1.k());
        paypalservice.i.a(c(buj1));
    }

    public static boolean b(PayPalService paypalservice)
    {
        paypalservice.g = false;
        return false;
    }

    public static bzv c(PayPalService paypalservice)
    {
        return paypalservice.m;
    }

    private static bzw c(buj buj1)
    {
        String s1 = buj1.q().a();
        Integer integer = buj1.s();
        buj1.q();
        return new bzw(s1, integer);
    }

    public static bzv d(PayPalService paypalservice)
    {
        paypalservice.m = null;
        return null;
    }

    public static bzn e(PayPalService paypalservice)
    {
        return paypalservice.h;
    }

    public static bsy f(PayPalService paypalservice)
    {
        return paypalservice.p;
    }

    public static bzn g(PayPalService paypalservice)
    {
        return paypalservice.i;
    }

    public static bsx h(PayPalService paypalservice)
    {
        return paypalservice.o;
    }

    public static String y()
    {
        return c;
    }

    private static boolean z()
    {
        return "partner".equals("general");
    }

    public final bus a()
    {
        if (d == null)
        {
            d = new ccu();
        }
        return d;
    }

    final String a(String s1)
    {
        return o.c(s1);
    }

    final void a(int i1)
    {
        l.b(new bwg(l, a(), l.c(), f.k(), e.j, (String)(new ArrayList(e.g.a.keySet())).get(i1)));
    }

    public final void a(bqz bqz1)
    {
        if (bqz1.e)
        {
            b(new bwn(l, a(), bqz1));
            return;
        } else
        {
            b(new bwe(l, a(), buv.a(bqz1)));
            return;
        }
    }

    public final void a(buw buw1)
    {
        a(buw1, false, ((String) (null)), ((String) (null)), null);
    }

    final void a(buw buw1, Boolean boolean1)
    {
        a(buw1, boolean1.booleanValue(), ((String) (null)), ((String) (null)), null);
    }

    public final void a(buw buw1, Boolean boolean1, String s1)
    {
        a(buw1, boolean1.booleanValue(), ((String) (null)), s1, null);
    }

    public final void a(buw buw1, String s1)
    {
        a(buw1, false, ((String) (null)), s1, null);
    }

    public final void a(buw buw1, String s1, String s2)
    {
        a(buw1, false, ((String) (null)), s1, s2);
    }

    final void a(bzt bzt)
    {
        h.a(bzt);
    }

    public final void a(bzv bzv1, boolean flag)
    {
        if (flag)
        {
            e.c = null;
        }
        for (m = bzv1; g || e.c();)
        {
            return;
        }

        g = true;
        a(buw.b);
        l.b(new bwm(f.b(), l, a(), f.k()));
    }

    final void a(bY by, String s1, boolean flag, String s2, boolean flag1, String s3)
    {
        l.b(new bwh(l, a(), l.c(), f.k(), by, s1, e.j, flag, s2, flag1, s3));
    }

    final void a(bY by, boolean flag, String s1, boolean flag1, String s2)
    {
        l.b(new bwh(l, a(), l.c(), f.k(), by, flag, s1, flag1, s2));
    }

    final void a(ca ca, Map map, PayPalItem apaypalitem[], String s1, String s2, String s3, boolean flag, 
            String s4, String s5, String s6)
    {
        l.b((new bwb(l, a(), e.h.b(), e.b(), ca, map, a(apaypalitem), s1, s2, n, s3, flag)).d(s4).e(s5).f(s6));
    }

    public final void a(String s1, String s2)
    {
        b(new bwd(l, a(), s1, s2));
    }

    final void a(String s1, String s2, ca ca, Map map, PayPalItem apaypalitem[], String s3, boolean flag, 
            String s4, String s5, String s6, String s7, String s8, String s9)
    {
        l.b((new bwc(l, a(), e.c.b(), s1, s2, s4, ca, map, a(apaypalitem), s3, flag, s5, n, s6)).d(s7).e(s8).f(s9));
    }

    final void a(String s1, String s2, String s3, String s4, int i1, int j1, ca ca, 
            Map map, PayPalItem apaypalitem[], String s5, boolean flag, String s6, String s7, String s8, 
            String s9, String s10)
    {
        if (s3.equalsIgnoreCase("4111111111111111") && bst.b(f.b()))
        {
            s3 = "4444333322221111";
        }
        l.b((new bwc(l, a(), e.c.b(), s1, s2, s3, s4, i1, j1, ca, map, a(apaypalitem), s5, flag, s6, n, s7)).d(s8).e(s9).f(s10));
    }

    public final void a(List list)
    {
        l.b(new bwa(l, a(), l.c(), f.k(), e.f.b(), e.j, list));
    }

    final void a(boolean flag, String s1, String s2, JSONObject jsonobject, JSONObject jsonobject1, String s3)
    {
        l.b(new bvy(l, a(), e.h.b(), e.b(), flag, s3, n, s1, s2, jsonobject, jsonobject1));
    }

    public final boolean a(bzy bzy1)
    {
        if (A())
        {
            return true;
        } else
        {
            q.add(bzy1);
            return false;
        }
    }

    public final bsv b()
    {
        return l;
    }

    public final void b(bzt bzt)
    {
        i.a(bzt);
    }

    public final buq c()
    {
        return e;
    }

    public final PayPalConfiguration d()
    {
        return f;
    }

    public final String e()
    {
        return f.b();
    }

    public final String f()
    {
        return f.k();
    }

    public final void g()
    {
        t();
        h();
        p.b();
        u();
    }

    public final void h()
    {
        e.h = null;
        bur.b(f.b());
        e.e = null;
        e.d = null;
    }

    public final boolean i()
    {
        return e.c();
    }

    public final boolean j()
    {
        buq buq1 = e;
        return buq1.h != null && buq1.h.c();
    }

    public final boolean k()
    {
        return e.f != null && e.j != null;
    }

    final void l()
    {
        Object obj = p.a();
        if (obj == null)
        {
            h();
            return;
        }
        Object obj1 = e.h;
        bI bi = bur.a(f.b());
        if (!a(((bI) (obj1))) && a(bi))
        {
            e.h = bi;
        }
        obj1 = e;
        if (((bB) (obj)).d())
        {
            if (((bB) (obj)).c().equals(bta.a))
            {
                obj = ((bB) (obj)).b();
            } else
            {
                obj = ((bB) (obj)).a().a(bun.a());
            }
        } else
        {
            obj = null;
        }
        obj1.d = ((String) (obj));
    }

    public final void m()
    {
        i.b();
    }

    final void n()
    {
        h.b();
    }

    final void o()
    {
        m = null;
    }

    public final IBinder onBind(Intent intent)
    {
        (new StringBuilder("onBind(")).append(b(intent)).append(")");
        if (!A())
        {
            if (t == null)
            {
                a(intent);
            } else
            {
                a(t);
            }
        }
        return v;
    }

    public final void onCreate()
    {
        Log.w("paypal.sdk", (new StringBuilder()).append(com/paypal/android/sdk/payments/PayPalService.getSimpleName()).append(" created. ").append(a().b()).toString());
        new ccu();
        o = new bsx(this, "AndroidBasePrefs");
        btl.a(o);
        bto.a(o);
        n = byc.a(a, this, o, "2.9.10");
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.paypal.android.sdk.clearAllUserData");
        byq.a(this).a(u, intentfilter);
    }

    public final void onDestroy()
    {
        if (l != null)
        {
            l.a();
            l.b();
            l = null;
        }
        try
        {
            byq.a(this).a(u);
        }
        catch (Throwable throwable)
        {
            (new StringBuilder("ignoring:")).append(throwable.getMessage());
        }
        (new StringBuilder("service destroyed: ")).append(this);
    }

    public final void onRebind(Intent intent)
    {
        super.onRebind(intent);
        (new StringBuilder("onRebind(")).append(b(intent)).append(")");
    }

    public final int onStartCommand(Intent intent, int i1, int j1)
    {
        (new StringBuilder("onStartCommand(")).append(b(intent)).append(", ").append(i1).append(", ").append(j1).append(")");
        if (!A())
        {
            (new bxe(this)).a();
            if (intent == null || intent.getExtras() == null)
            {
                throw new RuntimeException("Service extras required. Please see the docs.");
            }
            a(intent);
        }
        if (q.size() > 0)
        {
            for (intent = q.iterator(); intent.hasNext(); ((bzy)intent.next()).a()) { }
            q.clear();
        }
        return 3;
    }

    public final boolean onUnbind(Intent intent)
    {
        (new StringBuilder("onUnbind(")).append(b(intent)).append(")");
        return true;
    }

    public final void p()
    {
        l.b(new bwf(l, a(), l.c(), e.c.b(), f.k()));
    }

    final bB q()
    {
        return p.a();
    }

    final String r()
    {
        return e.d;
    }

    final bF s()
    {
        return p.a(f.k());
    }

    public final void t()
    {
        b = s();
        p.c();
        if (b != null && e.c != null)
        {
            a(e.c.b(), b.e());
            b = null;
        }
    }

    final void u()
    {
        if (f != null && f.o())
        {
            e = B();
            C();
        }
    }

    public final String v()
    {
        return k;
    }

    public final boolean w()
    {
        return r;
    }

    public final boolean x()
    {
        return s;
    }

}
