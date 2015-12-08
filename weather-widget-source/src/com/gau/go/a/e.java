// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.gau.go.a.a.a;
import com.gau.go.a.a.b;
import com.gau.go.a.c.h;
import com.gau.go.a.f.c;
import com.gau.go.a.f.d;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.gau.go.a:
//            k, d, v, f, 
//            m, c, i, j, 
//            g, n, a, s, 
//            r, q, o, h, 
//            u

public class e
{

    public static boolean a = false;
    public static String b = null;
    public static String c;
    public static String d = null;
    public static String e = null;
    public static int f = 0;
    public static int g = 0;
    public static String h = null;
    public static String i = null;
    public static String j = null;
    public static String k = null;
    public static boolean l = true;
    private static e m;
    private static String u;
    private static String v;
    private static int w = -1;
    private static String x = null;
    private Map A;
    private ExecutorService B;
    private boolean C;
    private boolean D;
    private SharedPreferences E;
    private android.content.SharedPreferences.Editor F;
    private com.gau.go.a.e.d G;
    private boolean H;
    private BroadcastReceiver I;
    private int J;
    private long K;
    private long L;
    private boolean M;
    private boolean N;
    private Context n;
    private volatile boolean o;
    private com.gau.go.a.d p;
    private h q;
    private v r;
    private Object s;
    private long t;
    private boolean y;
    private Lock z;

    private e(Context context)
    {
        o = true;
        t = 0L;
        y = false;
        z = new ReentrantLock();
        C = false;
        D = false;
        H = false;
        I = new k(this);
        J = 0;
        K = 0L;
        L = 0L;
        M = false;
        N = false;
        if (context == null)
        {
            throw new NullPointerException("context can not be null");
        }
        n = context;
        m = this;
        com.gau.go.a.f.c.a(context);
        p = new com.gau.go.a.d();
        q = new h(n);
        r = new v(this, null);
        s = new Object();
        c = c(n);
        A = new Hashtable();
        E = n.getSharedPreferences((new StringBuilder()).append("ctrl_sp_").append(n.getPackageName()).toString(), 0);
        F = E.edit();
        B = Executors.newSingleThreadExecutor();
        d(n);
        Log.i("zhiping", (new StringBuilder()).append("\u7EDF\u8BA1sdk\u521D\u59CB\u5316,\u8FDB\u7A0B\u540D\u662F:").append(b).toString());
        if (c == null || c.equals(b))
        {
            a(new f(this));
            return;
        } else
        {
            a(new m(this));
            return;
        }
    }

    static int a(e e1, int i1)
    {
        e1.J = i1;
        return i1;
    }

    static long a(e e1, long l1)
    {
        e1.K = l1;
        return l1;
    }

    static SharedPreferences a(e e1)
    {
        return e1.E;
    }

    static com.gau.go.a.e.d a(e e1, com.gau.go.a.e.d d1)
    {
        e1.G = d1;
        return d1;
    }

    public static e a(Context context)
    {
        com/gau/go/a/e;
        JVM INSTR monitorenter ;
        if (m != null || context == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        Context context1 = context.getApplicationContext();
        if (context1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        m = new e(context1);
_L1:
        context = m;
        com/gau/go/a/e;
        JVM INSTR monitorexit ;
        return context;
        m = new e(context);
          goto _L1
        context;
        throw context;
    }

    public static e a(Context context, String s1, String s2, String s3, String s4)
    {
        com/gau/go/a/e;
        JVM INSTR monitorenter ;
        b = s1;
        h = s2;
        j = s3;
        k = s4;
        context = a(context);
        com/gau/go/a/e;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private StringBuffer a(int i1, com.gau.go.a.a.c c1, String s1, String s2, String s3)
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(i1);
        stringbuffer.append("||");
        stringbuffer.append(com.gau.go.a.f.d.f(n));
        stringbuffer.append("||");
        if (u == null)
        {
            u = com.gau.go.a.f.e.e(n);
        }
        stringbuffer.append(u);
        stringbuffer.append("||");
        stringbuffer.append(j);
        stringbuffer.append("||");
        stringbuffer.append(c1.k);
        stringbuffer.append("||");
        stringbuffer.append(e);
        stringbuffer.append("||");
        if (com.gau.go.a.f.e.c(s3))
        {
            stringbuffer.append(h);
        } else
        {
            stringbuffer.append(s3);
        }
        stringbuffer.append("||");
        if (com.gau.go.a.f.e.c(s1))
        {
            stringbuffer.append(f);
        } else
        {
            stringbuffer.append(s1);
        }
        stringbuffer.append("||");
        if (com.gau.go.a.f.e.c(s2))
        {
            stringbuffer.append(i);
        } else
        {
            stringbuffer.append(s2);
        }
        stringbuffer.append("||");
        stringbuffer.append(k);
        stringbuffer.append("||");
        stringbuffer.append(c1.p);
        stringbuffer.append("||");
        if (!y);
        return stringbuffer;
    }

    private void a(a a1, int i1, int j1, String s1, com.gau.go.a.c c1, String s2, String s3, 
            String s4, b ab[])
    {
        com.gau.go.a.a.c c2;
label0:
        {
            String s5;
label1:
            {
                if (a1.b() > System.currentTimeMillis())
                {
                    c2 = new com.gau.go.a.a.c();
                    c2.a = j1;
                    c2.k = com.gau.go.a.f.e.a(System.currentTimeMillis());
                    c2.p = a1.d();
                    c2.b = f();
                    s5 = c2.b;
                    s2 = a(i1, c2, s2, s3, s4);
                    a(((StringBuffer) (s2)), ab);
                    b(s2, ab);
                    c2.h = s2.append(s1).toString();
                    if (a(i1, j1) || a1.c() == 0L)
                    {
                        c2.q = true;
                    } else
                    {
                        c2.q = false;
                    }
                    c2.r = a1.g();
                    if (a1.c() != 0L && !b(ab))
                    {
                        break label0;
                    }
                    if (c != null && !c.equals(b))
                    {
                        break label1;
                    }
                    a(c2, true, c1);
                }
                return;
            }
            if (c1 != null)
            {
                c1.a();
            }
            q.a(c2, new i(this, c1, s5));
            return;
        }
        if (c1 != null)
        {
            c1.a();
        }
        q.a(c2, new j(this, c1));
    }

    private void a(a a1, int i1, int j1, String s1, com.gau.go.a.c c1, b ab[])
    {
        a(a1, i1, j1, s1, c1, null, null, null, ab);
    }

    private void a(com.gau.go.a.a.c c1, boolean flag, com.gau.go.a.c c2)
    {
        if (c2 != null)
        {
            c2.a();
        }
        q.a(c1, new g(this, c2, c1, flag));
    }

    private void a(com.gau.go.a.e.a a1)
    {
        a1.a(new n(this, a1));
        G.a(a1);
    }

    static void a(e e1, a a1, int i1, int j1, String s1, com.gau.go.a.c c1, b ab[])
    {
        e1.a(a1, i1, j1, s1, c1, ab);
    }

    static void a(e e1, com.gau.go.a.a.c c1)
    {
        e1.c(c1);
    }

    static void a(e e1, com.gau.go.a.a.c c1, boolean flag, com.gau.go.a.c c2)
    {
        e1.a(c1, flag, c2);
    }

    static void a(e e1, com.gau.go.a.e.a a1)
    {
        e1.a(a1);
    }

    static void a(e e1, Runnable runnable)
    {
        e1.a(runnable);
    }

    static void a(e e1, String s1)
    {
        e1.c(s1);
    }

    static void a(e e1, Map map)
    {
        e1.a(map);
    }

    private void a(Runnable runnable)
    {
        com.gau.go.a.a a1 = new com.gau.go.a.a();
        a1.(runnable);
        try
        {
            if (!B.isShutdown())
            {
                B.execute(a1);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            com.gau.go.a.f.e.a(runnable);
        }
    }

    private void a(StringBuffer stringbuffer, b ab[])
    {
        if (ab.length <= 0) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        j1 = ab.length;
        i1 = 0;
_L7:
        if (i1 >= j1) goto _L2; else goto _L3
_L3:
        b b1 = ab[i1];
        if (b1.a() != 2) goto _L5; else goto _L4
_L4:
        stringbuffer.append((String)b1.b());
_L2:
        stringbuffer.append("||");
        return;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void a(Map map)
    {
        a(((Runnable) (new s(this, map))));
    }

    private boolean a(int i1, int j1)
    {
        return i1 == 103 || j1 == 207;
    }

    static boolean a(e e1, int i1, int j1)
    {
        return e1.a(i1, j1);
    }

    static boolean a(e e1, HashSet hashset)
    {
        return e1.a(hashset);
    }

    static boolean a(e e1, boolean flag)
    {
        e1.M = flag;
        return flag;
    }

    static boolean a(e e1, b ab[])
    {
        return e1.a(ab);
    }

    private boolean a(HashSet hashset)
    {
        Object obj = s;
        obj;
        JVM INSTR monitorenter ;
        hashset = q.a(hashset);
        if (hashset.isEmpty())
        {
            hashset.addAll(q.b());
        }
        if (hashset == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        if (hashset.isEmpty())
        {
            break MISSING_BLOCK_LABEL_104;
        }
        hashset = hashset.iterator();
        do
        {
            if (!hashset.hasNext())
            {
                break;
            }
            com.gau.go.a.a.c c1 = (com.gau.go.a.a.c)hashset.next();
            if (c1.r <= com.gau.go.a.f.d.d(n))
            {
                p.a(c1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_102;
        hashset;
        obj;
        JVM INSTR monitorexit ;
        throw hashset;
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
    }

    private boolean a(b ab[])
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (ab.length <= 0) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        j1 = ab.length;
        i1 = 0;
_L7:
        flag = flag1;
        if (i1 >= j1) goto _L2; else goto _L3
_L3:
        b b1 = ab[i1];
        if (b1.a() != 3) goto _L5; else goto _L4
_L4:
        flag = ((Boolean)b1.b()).booleanValue();
_L2:
        return flag;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static long b(e e1, long l1)
    {
        e1.L = l1;
        return l1;
    }

    static Context b(e e1)
    {
        return e1.n;
    }

    public static String b(Context context)
    {
        if (m == null)
        {
            m = a(context);
        }
        e e1 = m;
        if (u == null)
        {
            e e2 = m;
            u = com.gau.go.a.f.e.e(context);
        }
        context = m;
        return u;
    }

    static Map b(e e1, Map map)
    {
        e1.A = map;
        return map;
    }

    private void b(com.gau.go.a.a.c c1)
    {
label0:
        {
            if (c1 != null && n != null)
            {
                com.gau.go.a.b.c.a(n, c1.a).a(c1);
                if (c1.f != 3)
                {
                    break label0;
                }
                com.gau.go.a.f.e.a("StatisticsManager", "a request has been posted");
            }
            return;
        }
        com.gau.go.a.f.e.a("StatisticsManager", (new StringBuilder()).append("post fundid:").append(c1.a).append(" failed!").toString());
    }

    static void b(e e1, com.gau.go.a.a.c c1)
    {
        e1.b(c1);
    }

    static void b(e e1, boolean flag)
    {
        e1.b(flag);
    }

    private void b(StringBuffer stringbuffer, b ab[])
    {
        if (ab.length > 0)
        {
            int j1 = ab.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                b b1 = ab[i1];
                if (b1.a() == 1 && !com.gau.go.a.f.e.c((String)b1.b()))
                {
                    stringbuffer.append(d((String)b1.b()));
                    return;
                }
            }

        }
        stringbuffer.append(d(((String) (null))));
    }

    private void b(boolean flag)
    {
        r r1;
        r1 = new r(this);
        if (flag)
        {
            a(r1);
            return;
        }
        z.lock();
        r1.run();
        z.unlock();
        return;
        Exception exception;
        exception;
        z.unlock();
        throw exception;
    }

    private boolean b(b ab[])
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (ab.length <= 0) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        j1 = ab.length;
        i1 = 0;
_L7:
        flag = flag1;
        if (i1 >= j1) goto _L2; else goto _L3
_L3:
        b b1 = ab[i1];
        if (b1.a() != 0) goto _L5; else goto _L4
_L4:
        flag = ((Boolean)b1.b()).booleanValue();
_L2:
        return flag;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static BroadcastReceiver c(e e1)
    {
        return e1.I;
    }

    public static String c(Context context)
    {
        int i1 = Process.myPid();
        for (context = ((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses().iterator(); context.hasNext();)
        {
            android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)context.next();
            if (runningappprocessinfo.pid == i1)
            {
                c = runningappprocessinfo.processName;
                return runningappprocessinfo.processName;
            }
        }

        return null;
    }

    private void c(com.gau.go.a.a.c c1)
    {
        if (c1.r <= com.gau.go.a.f.d.d(n))
        {
            p.a(c1);
            return;
        } else
        {
            q.b(c1);
            return;
        }
    }

    private void c(String s1)
    {
        a(new q(this, s1));
    }

    private void c(boolean flag)
    {
        if (n == null) goto _L2; else goto _L1
_L1:
        if (com.gau.go.a.f.d.d(n) == -1)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (o)
        {
            o = false;
            r.a();
            com.gau.go.a.f.e.a("StatisticsManager", "start loop task");
            return;
        }
        com.gau.go.a.a.c c1;
        try
        {
            com.gau.go.a.f.e.a("StatisticsManager", "task already running");
            return;
        }
        catch (Exception exception)
        {
            return;
        }
        if (flag) goto _L2; else goto _L3
_L3:
        c1 = p.a();
_L4:
        if (c1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        q.b(c1);
        c1 = p.a();
        if (true) goto _L4; else goto _L2
_L2:
    }

    static boolean c(e e1, boolean flag)
    {
        e1.C = flag;
        return flag;
    }

    static long d(e e1)
    {
        return e1.K;
    }

    private String d(String s1)
    {
        double d1;
        double d2;
        double d3;
        StringBuffer stringbuffer;
        DecimalFormat decimalformat;
        stringbuffer = new StringBuffer();
        d3 = 0.0D;
        decimalformat = new DecimalFormat("#.00");
        d2 = 0.0D;
        d1 = d2;
        if (TextUtils.isEmpty(com.gau.go.a.f.a.a()))
        {
            break MISSING_BLOCK_LABEL_455;
        }
        d1 = d2;
        double d4;
        if (TextUtils.isEmpty(com.gau.go.a.f.a.b()))
        {
            break MISSING_BLOCK_LABEL_455;
        }
        d2 = Double.parseDouble(com.gau.go.a.f.a.a());
        d4 = Double.parseDouble(com.gau.go.a.f.a.b());
        d1 = d2;
        if (d2 == 0.0D)
        {
            break MISSING_BLOCK_LABEL_455;
        }
        d1 = (d4 / d2) * 100D;
_L2:
        double d6;
        String s2;
        String s4;
        d4 = (double)com.gau.go.a.f.a.d() / 1024D / 1024D;
        d6 = (double)(com.gau.go.a.f.a.d() - com.gau.go.a.f.a.a(n)) / 1024D / 1024D;
        s4 = decimalformat.format(d2 / 1024D / 1024D);
        s2 = decimalformat.format((double)com.gau.go.a.f.a.d() / 1024D / 1024D);
        Object obj;
        String s3;
        d2 = d3;
        d3 = d1;
        obj = s2;
        s3 = s4;
        if (d4 != 0.0D)
        {
            d2 = (d6 / d4) * 100D;
            s3 = s4;
            obj = s2;
            d3 = d1;
        }
_L1:
        stringbuffer.append((new StringBuilder()).append("{\"cpu\":\"").append(s3).append("GHz\",\"men\":\"").append(((String) (obj))).append("MB\"}").toString());
        stringbuffer.append("||");
        Exception exception;
        if (s1 == null)
        {
            stringbuffer.append((new StringBuilder()).append("{\"cpu\":\"").append(decimalformat.format(d3)).append("%\",\"men\":\"").append(decimalformat.format(d2)).append("%\"").toString());
        } else
        {
            stringbuffer.append((new StringBuilder()).append("{\"cpu\":\"").append(decimalformat.format(d3)).append("%\",\"men\":\"").append(decimalformat.format(d2)).append("%\",\"position\":\"").append(s1).append("\"").toString());
        }
        stringbuffer.append((new StringBuilder()).append(",\"net\":\"").append(com.gau.go.a.f.d.d(n)).append("\"}").toString());
        stringbuffer.append("||");
        return stringbuffer.toString();
        exception;
        s3 = "0";
        exception = "0";
        d3 = 0.0D;
        d2 = 0.0D;
          goto _L1
        double d5 = 0.0D;
        d2 = d1;
        d1 = d5;
          goto _L2
    }

    private void d()
    {
        a(new o(this));
    }

    private void d(Context context)
    {
        d = com.gau.go.a.f.d.f(context);
        e = com.gau.go.a.f.d.b(context);
        g = android.os.Build.VERSION.SDK_INT;
        PackageManager packagemanager = context.getPackageManager();
        try
        {
            context = packagemanager.getPackageInfo(context.getPackageName(), 0);
            f = ((PackageInfo) (context)).versionCode;
            i = ((PackageInfo) (context)).versionName;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            f = 1;
        }
        i = "1.0";
    }

    static boolean d(e e1, boolean flag)
    {
        e1.D = flag;
        return flag;
    }

    private String e()
    {
        StringBuffer stringbuffer = new StringBuffer("||");
        stringbuffer.append(c.b);
        stringbuffer.append("||");
        stringbuffer.append(com.gau.go.a.f.a.c());
        stringbuffer.append("||");
        String as[];
        Object aobj[];
        try
        {
            double d1 = Double.parseDouble(com.gau.go.a.f.a.a()) / 1000D / 1000D;
            stringbuffer.append((new StringBuilder()).append(d1).append("GHZ").toString());
        }
        catch (Exception exception)
        {
            stringbuffer.append("unknown GHZ");
        }
        stringbuffer.append("||");
        stringbuffer.append(com.gau.go.a.f.a.e());
        stringbuffer.append("||");
        as = com.gau.go.a.f.d.a(com.gau.go.a.f.a.d());
        aobj = com.gau.go.a.f.d.a(com.gau.go.a.f.a.a(n));
        stringbuffer.append((new StringBuilder()).append(as[0]).append(as[1]).append(",").append(aobj[0]).append(aobj[1]).toString());
        stringbuffer.append("||");
        stringbuffer.append(com.gau.go.a.f.d.c());
        stringbuffer.append("||");
        aobj = com.gau.go.a.f.d.b();
        as = com.gau.go.a.f.d.a(aobj[0]);
        aobj = com.gau.go.a.f.d.a(aobj[1]);
        stringbuffer.append((new StringBuilder()).append(as[0]).append(as[1]).append(",").append(aobj[0]).append(aobj[1]).toString());
        stringbuffer.append("||");
        return stringbuffer.toString();
    }

    static void e(e e1)
    {
        e1.d();
    }

    static void e(e e1, boolean flag)
    {
        e1.c(flag);
    }

    static h f(e e1)
    {
        return e1.q;
    }

    private String f()
    {
        return String.valueOf(Math.abs(System.nanoTime()));
    }

    static boolean f(e e1, boolean flag)
    {
        e1.o = flag;
        return flag;
    }

    static android.content.SharedPreferences.Editor g(e e1)
    {
        return e1.F;
    }

    private void g()
    {
        if (o)
        {
            p.b();
        }
    }

    static Lock h(e e1)
    {
        return e1.z;
    }

    private void h()
    {
        if (i())
        {
            c(true);
        }
    }

    static Map i(e e1)
    {
        return e1.A;
    }

    private boolean i()
    {
        Object obj = s;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        long l1 = System.currentTimeMillis();
        if (l1 - t <= 10000L)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        t = l1;
        obj1 = q.b();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        if (((LinkedList) (obj1)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_109;
        }
        obj1 = ((LinkedList) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            com.gau.go.a.a.c c1 = (com.gau.go.a.a.c)((Iterator) (obj1)).next();
            if (c1.r <= com.gau.go.a.f.d.d(n))
            {
                p.a(c1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_107;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
    }

    static com.gau.go.a.e.d j(e e1)
    {
        return e1.G;
    }

    private void j()
    {
        Object obj = n.getPackageManager();
        try
        {
            obj = ((PackageManager) (obj)).getPackageInfo(n.getPackageName(), 0);
            w = ((PackageInfo) (obj)).versionCode;
            x = ((PackageInfo) (obj)).versionName;
            return;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            namenotfoundexception.printStackTrace();
        }
    }

    private String k()
    {
        StringBuffer stringbuffer = new StringBuffer();
        HashMap hashmap = new HashMap();
        hashmap.putAll(A);
        Iterator iterator = hashmap.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a1 = (a)hashmap.get((String)iterator.next());
            if (a1 != null)
            {
                stringbuffer.append((new StringBuilder()).append(a1.e()).append("_").append(a1.d()).append("_").append(a1.b()).append(",").toString());
            }
        } while (true);
        if (stringbuffer.length() > 0)
        {
            stringbuffer.deleteCharAt(stringbuffer.length() - 1);
        }
        stringbuffer.append((new StringBuilder()).append(";").append(J).toString());
        stringbuffer.append((new StringBuilder()).append(";").append(q.c()).toString());
        stringbuffer.append((new StringBuilder()).append(";").append(c()).toString());
        stringbuffer.append((new StringBuilder()).append(";").append(com.gau.go.a.f.e.a(K)).toString());
        stringbuffer.append((new StringBuilder()).append(";").append(com.gau.go.a.f.e.a(L)).toString());
        if (M)
        {
            stringbuffer.append(";1");
        } else
        {
            stringbuffer.append(";0");
        }
        return stringbuffer.toString();
    }

    static String k(e e1)
    {
        return e1.f();
    }

    static boolean l(e e1)
    {
        return e1.o;
    }

    static void m(e e1)
    {
        e1.g();
    }

    static com.gau.go.a.d n(e e1)
    {
        return e1.p;
    }

    static void o(e e1)
    {
        e1.h();
    }

    static boolean p(e e1)
    {
        return e1.C;
    }

    static boolean q(e e1)
    {
        return e1.D;
    }

    public StringBuffer a(com.gau.go.a.a.c c1)
    {
        StringBuffer stringbuffer;
        List list = null;
        if (n == null)
        {
            return null;
        }
        stringbuffer = new StringBuffer();
        stringbuffer.append(c1.a);
        stringbuffer.append("||");
        stringbuffer.append(c1.e);
        stringbuffer.append("||");
        stringbuffer.append(com.gau.go.a.f.d.f(n));
        stringbuffer.append("||");
        stringbuffer.append(c1.k);
        stringbuffer.append("||");
        stringbuffer.append(android.os.Build.VERSION.RELEASE);
        stringbuffer.append("||");
        stringbuffer.append(android.os.Build.VERSION.INCREMENTAL);
        stringbuffer.append("||");
        stringbuffer.append(Build.MODEL);
        stringbuffer.append("||");
        if (v == null || v.trim().equals(""))
        {
            v = com.gau.go.a.f.d.b(n);
        }
        stringbuffer.append(com.gau.go.a.f.d.b(n));
        stringbuffer.append("||");
        if (c1.c != null)
        {
            c1.c = c1.c.replaceAll("\r\n", "");
            c1.c = c1.c.replaceAll("\n", "");
        }
        stringbuffer.append(c1.c);
        stringbuffer.append("||");
        Object obj = n.getPackageManager();
        if (w == -1 || x == null)
        {
            j();
        }
        stringbuffer.append(w);
        stringbuffer.append("||");
        stringbuffer.append(x);
        stringbuffer.append("||");
        Intent intent;
        byte byte0;
        if (com.gau.go.a.f.d.c(n))
        {
            byte0 = 2;
        } else
        {
            byte0 = 1;
        }
        stringbuffer.append(byte0);
        stringbuffer.append("||");
        stringbuffer.append(-1);
        stringbuffer.append("||");
        stringbuffer.append(com.gau.go.a.f.d.a(n));
        stringbuffer.append("||");
        stringbuffer.append(c1.d);
        stringbuffer.append("||");
        intent = new Intent("com.gau.go.launcherex.MAIN");
        obj = ((PackageManager) (obj)).queryIntentActivities(intent, 0);
        list = ((List) (obj));
_L2:
        if (list != null && list.size() > 0)
        {
            stringbuffer.append(1);
        } else
        {
            stringbuffer.append(0);
        }
        stringbuffer.append("||");
        if (u == null)
        {
            u = com.gau.go.a.f.e.e(n);
        }
        stringbuffer.append(u);
        stringbuffer.append("||");
        stringbuffer.append(com.gau.go.a.f.d.a());
        stringbuffer.append("||");
        stringbuffer.append(com.gau.go.a.f.e.a(c1.m));
        stringbuffer.append("||");
        stringbuffer.append("||");
        stringbuffer.append("||");
        stringbuffer.append(c1.n);
        stringbuffer.append("||");
        stringbuffer.append(Build.CPU_ABI);
        stringbuffer.append("||");
        stringbuffer.append(c.c);
        stringbuffer.append("*");
        stringbuffer.append(c.d);
        stringbuffer.append("||");
        stringbuffer.append(n.getPackageName());
        return stringbuffer;
        Exception exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void a()
    {
    }

    public void a(int i1, int j1, String s1)
    {
        a(i1, j1, s1, ((com.gau.go.a.c) (null)), new b[0]);
    }

    public void a(int i1, int j1, String s1, com.gau.go.a.c c1)
    {
        a(i1, j1, s1, c1, new b[0]);
    }

    public transient void a(int i1, int j1, String s1, com.gau.go.a.c c1, b ab[])
    {
        if (com.gau.go.a.f.e.c(s1))
        {
            throw new NullPointerException("Static data buffer can not be null");
        }
        if (N)
        {
            com.gau.go.a.f.e.a("this static will not upload because of app stop it");
            return;
        } else
        {
            a(((Runnable) (new com.gau.go.a.h(this, i1, j1, ab, s1, c1))));
            return;
        }
    }

    public void a(String s1)
    {
        if (s1 != null)
        {
            a(((String) (null)), s1, 3);
        }
    }

    public void a(String s1, String s2, int i1)
    {
        a(((Runnable) (new u(this, s2, i1, s1))));
    }

    public void a(String s1, String s2, String s3, boolean flag, String s4, boolean flag1)
    {
        a(s1, s2, s3, flag, s4, flag1, ((String) (null)));
    }

    public void a(String s1, String s2, String s3, boolean flag, String s4, boolean flag1, String s5)
    {
        com.gau.go.a.a.c c1 = new com.gau.go.a.a.c();
        c1.q = true;
        c1.k = com.gau.go.a.f.e.a(System.currentTimeMillis());
        c1.r = 0;
        c1.a = 19;
        c1.b = f();
        c1.c = s2;
        c1.d = s3;
        c1.e = s1;
        c1.l = flag;
        c1.n = s4;
        c1.m = flag1;
        c1.j = 3;
        s1 = a(c1);
        if (s5 != null)
        {
            s1.append("||");
            s1.append(s5);
        }
        s1.append((new StringBuilder()).append("||||").append(c()).toString());
        s1.append(e());
        c1.h = s1.toString();
        a(101, 207, (new StringBuilder()).append("207||||gl_dc||1||||||||").append(k()).toString());
        a(c1, true, ((com.gau.go.a.c) (null)));
    }

    public void a(boolean flag)
    {
        com.gau.go.a.f.e.b(flag);
    }

    public void b(String s1)
    {
        com.gau.go.a.a.c c1 = new com.gau.go.a.a.c();
        c1.a = 1030;
        c1.k = com.gau.go.a.f.e.a(System.currentTimeMillis());
        c1.p = "20150112";
        c1.b = f();
        c1.h = s1;
        c1.q = true;
        c1.r = 0;
        a(c1, true, ((com.gau.go.a.c) (null)));
    }

    public boolean b()
    {
        return a;
    }

    public int c()
    {
        SharedPreferences sharedpreferences = n.getSharedPreferences((new StringBuilder()).append("ctrl_sp_").append(n.getPackageName()).toString(), 0);
        android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
        int j1 = sharedpreferences.getInt("user_ratio", -1);
        int i1 = j1;
        if (j1 == -1)
        {
            i1 = (new Random()).nextInt(100);
            editor.putInt("user_ratio", i1);
            editor.commit();
        }
        return i1;
    }

}
