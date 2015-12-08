// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Handler;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.facebook.ads.a:
//            b, c, o, j, 
//            n

public class k
{

    private static Map a = new ConcurrentHashMap();
    private static Map b = new ConcurrentHashMap();
    private final Context c;
    private final String d;
    private final AdSize e;
    private final n f;
    private final j.b g;
    private final o h;
    private final int i;
    private boolean j;
    private final b k;
    private boolean l;
    private int m;
    private boolean n;
    private volatile boolean o;
    private final Handler p;
    private final Runnable q;
    private AsyncTask r;
    private int s;

    public k(Context context, String s1, AdSize adsize, n n1, boolean flag, o o1, int i1, 
            j.b b1)
    {
        m = 30000;
        n = false;
        o = false;
        s = 8;
        if (b1 == null)
        {
            throw new IllegalArgumentException("adViewRequestCallback");
        } else
        {
            c = context;
            d = s1;
            e = adsize;
            f = n1;
            j = flag;
            h = o1;
            i = i1;
            g = b1;
            k = new b(null);
            p = new Handler();
            q = new _cls1();
            d();
            return;
        }
    }

    static int a(k k1, int i1)
    {
        k1.m = i1;
        return i1;
    }

    static j.b a(k k1)
    {
        return k1.g;
    }

    private void a(long l1)
    {
        a.put(h(), Long.valueOf(l1));
    }

    static void a(k k1, String s1)
    {
        k1.b(s1);
    }

    static boolean a(k k1, boolean flag)
    {
        k1.o = flag;
        return flag;
    }

    static int b(k k1)
    {
        return k1.s;
    }

    private void b(int i1)
    {
        b.put(h(), Integer.valueOf(i1));
    }

    static void b(k k1, int i1)
    {
        k1.b(i1);
    }

    private void b(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = o;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        p.removeCallbacks(q);
        o = false;
        if (true) goto _L1; else goto _L3
_L3:
        s1;
        throw s1;
    }

    static boolean b(k k1, boolean flag)
    {
        k1.n = flag;
        return flag;
    }

    private void d()
    {
        if (!j)
        {
            return;
        } else
        {
            IntentFilter intentfilter = new IntentFilter("android.intent.action.SCREEN_ON");
            intentfilter.addAction("android.intent.action.SCREEN_OFF");
            c.registerReceiver(k, intentfilter);
            l = true;
            return;
        }
    }

    private void e()
    {
        if (l)
        {
            try
            {
                c.unregisterReceiver(k);
            }
            catch (Exception exception)
            {
                com.facebook.ads.a.c.a(com.facebook.ads.a.b.a(exception));
            }
            l = false;
        }
    }

    private int f()
    {
        Integer integer = j();
        if (integer == null)
        {
            return !j ? -1000 : 20000;
        } else
        {
            return integer.intValue();
        }
    }

    private a g()
    {
        if (o.b == h)
        {
            return a.c;
        }
        if (AdSize.INTERSTITIAL == e)
        {
            return a.b;
        } else
        {
            return a.a;
        }
    }

    private String h()
    {
        return (new StringBuilder()).append(d).append(":").append(g().toString()).toString();
    }

    private Long i()
    {
        return (Long)a.get(h());
    }

    private Integer j()
    {
        return (Integer)b.get(h());
    }

    private boolean k()
    {
        if (c.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0)
        {
            return true;
        }
        NetworkInfo networkinfo = ((ConnectivityManager)c.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean flag;
        if (networkinfo != null && networkinfo.isConnected())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public void a()
    {
        j = false;
    }

    public void a(int i1)
    {
        s = i1;
        if (i1 == 0)
        {
            if (n)
            {
                a("onWindowVisibilityChanged");
            }
            return;
        } else
        {
            b("onWindowVisibilityChanged");
            return;
        }
    }

    public void a(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = j;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (m > 0 && !o)
        {
            p.postDelayed(q, m);
            o = true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        s1;
        throw s1;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        Long long1;
        long l1;
        l1 = System.currentTimeMillis();
        long1 = i();
        if (long1 == null) goto _L2; else goto _L1
_L1:
        if (l1 >= long1.longValue() + (long)f()) goto _L2; else goto _L3
_L3:
        g.a(AdError.LOAD_TOO_FREQUENTLY);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (o)
        {
            b(((String) (null)));
        }
        if (r != null && r.getStatus() != android.os.AsyncTask.Status.FINISHED)
        {
            r.cancel(true);
        }
        if (k())
        {
            break MISSING_BLOCK_LABEL_127;
        }
        m = 30000;
        g.a(AdError.NETWORK_ERROR);
        a("no network connection");
          goto _L4
        Exception exception;
        exception;
        throw exception;
        a(l1);
        r = (new j(c, d, e, f, h, i, AdSettings.isTestMode(c), new _cls2())).a();
          goto _L4
    }

    public void c()
    {
        e();
        b("destroy");
    }


    private class b extends BroadcastReceiver
    {

        final k a;

        public void onReceive(Context context, Intent intent)
        {
            context = intent.getAction();
            if ("android.intent.action.SCREEN_OFF".equals(context))
            {
                k.a(a, intent.getAction());
            } else
            if ("android.intent.action.SCREEN_ON".equals(context) && k.b(a) == 0)
            {
                a.a(intent.getAction());
                return;
            }
        }

        private b()
        {
            a = k.this;
            super();
        }

        b(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls1
        implements Runnable
    {

        final k a;

        public void run()
        {
            k.a(a, false);
            a.b();
        }

        _cls1()
        {
            a = k.this;
            super();
        }
    }


    private class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/facebook/ads/a/k$a, s1);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("BANNER", 0);
            b = new a("INTERSTITIAL", 1);
            c = new a("NATIVE", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private class _cls2
        implements j.b
    {

        final k a;

        public void a(AdError aderror)
        {
            k.a(a).a(aderror);
            k.b(a, true);
            a.a("onError");
        }

        public void a(l l1)
        {
            k.a(a, l1.a());
            k.b(a, l1.b());
            k.a(a).a(l1);
            k.b(a, true);
        }

        _cls2()
        {
            a = k.this;
            super();
        }
    }

}
