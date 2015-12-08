// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.crashlytics.android.internal.A;
import com.crashlytics.android.internal.D;
import com.crashlytics.android.internal.aM;
import com.crashlytics.android.internal.aP;
import com.crashlytics.android.internal.aQ;
import com.crashlytics.android.internal.aR;
import com.crashlytics.android.internal.aS;
import com.crashlytics.android.internal.aX;
import com.crashlytics.android.internal.ab;
import com.crashlytics.android.internal.af;
import com.crashlytics.android.internal.ag;
import com.crashlytics.android.internal.ai;
import com.crashlytics.android.internal.ao;
import com.crashlytics.android.internal.av;
import com.crashlytics.android.internal.ax;
import com.crashlytics.android.internal.ay;
import com.crashlytics.android.internal.q;
import com.crashlytics.android.internal.r;
import com.crashlytics.android.internal.u;
import com.crashlytics.android.internal.v;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

// Referenced classes of package com.crashlytics.android:
//            b, v, c, t, 
//            Y, T, aa, ad, 
//            X, u, p, k, 
//            CrashlyticsMissingDependencyException, CrashTest, l, m, 
//            n, V, o, PinningInfoProvider, 
//            CrashlyticsListener

public final class Crashlytics extends u
{

    public static final String TAG = "Crashlytics";
    private static ContextWrapper j;
    private static String k;
    private static String l;
    private static String m;
    private static String n;
    private static String o;
    private static String p;
    private static String q;
    private static boolean r = false;
    private static PinningInfoProvider s = null;
    private static av t;
    private static float u;
    private static Crashlytics v;
    private final long a = System.currentTimeMillis();
    private final ConcurrentHashMap b = new ConcurrentHashMap();
    private CrashlyticsListener c;
    private com.crashlytics.android.v d;
    private ao e;
    private String f;
    private String g;
    private String h;
    private String i;

    public Crashlytics()
    {
        e = null;
        f = null;
        g = null;
        h = null;
    }

    static int a(Crashlytics crashlytics, float f1, int i1)
    {
        return (int)((float)i1 * f1);
    }

    private b a(Y y)
    {
        String s1 = ab.a(new String[] {
            i
        });
        int i1 = ai.a(l).a();
        return new b(p, k, o, n, s1, m, i1, q, "0", y);
    }

    static com.crashlytics.android.v a(Crashlytics crashlytics)
    {
        return crashlytics.d;
    }

    private static void a(int i1, String s1, String s2)
    {
        Crashlytics crashlytics = getInstance();
        if (crashlytics == null || crashlytics.d == null)
        {
            com.crashlytics.android.internal.v.a().b().a(s1, "Crashlytics must be initialized by calling Crashlytics.start(Context) prior to logging messages.", null);
            return;
        } else
        {
            long l1 = System.currentTimeMillis();
            long l2 = crashlytics.a;
            crashlytics.d.a(l1 - l2, (new StringBuilder()).append(ab.b(i1)).append("/").append(s1).append(" ").append(s2).toString());
            return;
        }
    }

    static void a(String s1)
    {
        D d1 = (D)com.crashlytics.android.internal.v.a().a(com/crashlytics/android/internal/D);
        if (d1 != null)
        {
            d1.a(new ag(s1));
        }
    }

    private void a(String s1, Context context, float f1)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        if (j == null) goto _L2; else goto _L1
_L1:
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Crashlytics already started, ignoring re-initialization attempt.");
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        p = s1;
        j = new ContextWrapper(context.getApplicationContext());
        t = new av(com.crashlytics.android.internal.v.a().b());
        com.crashlytics.android.internal.v.a().b().b("Crashlytics", (new StringBuilder("Initializing Crashlytics ")).append(getCrashlyticsVersion()).toString());
        Object obj;
        k = j.getPackageName();
        obj = j.getPackageManager();
        l = ((PackageManager) (obj)).getInstallerPackageName(k);
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", (new StringBuilder("Installer package name is: ")).append(l).toString());
        obj = ((PackageManager) (obj)).getPackageInfo(k, 0);
        n = Integer.toString(((PackageInfo) (obj)).versionCode);
        if (((PackageInfo) (obj)).versionName != null) goto _L4; else goto _L3
_L3:
        obj = "0.0";
_L8:
        o = ((String) (obj));
        m = context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
        q = Integer.toString(context.getApplicationInfo().targetSdkVersion);
        i = ab.i(context);
_L9:
        e = new ao(j);
        e.h();
        (new c(i, ab.a(j, "com.crashlytics.RequireBuildId", true))).a(s1, k);
        boolean flag = flag1;
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Installing exception handler...");
        flag = flag1;
        d = new com.crashlytics.android.v(Thread.getDefaultUncaughtExceptionHandler(), c, i);
        flag = flag1;
        flag1 = d.f();
        flag = flag1;
        d.d();
        flag = flag1;
        d.c();
        flag = flag1;
        d.h();
        flag = flag1;
        Thread.setDefaultUncaughtExceptionHandler(d);
        flag = flag1;
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Successfully installed exception handler.");
        flag = flag1;
_L10:
        s1 = new CountDownLatch(1);
        (new Thread(new t(this, context, f1, s1), "Crashlytics Initializer")).start();
        if (!flag) goto _L6; else goto _L5
_L5:
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        if (s1.await(4000L, TimeUnit.MILLISECONDS)) goto _L6; else goto _L7
_L7:
        com.crashlytics.android.internal.v.a().b().c("Crashlytics", "Crashlytics initialization was not completed in the allotted time.");
          goto _L6
        s1;
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Crashlytics was interrupted during initialization.", s1);
          goto _L6
        s1;
        throw s1;
_L4:
        obj = ((PackageInfo) (obj)).versionName;
          goto _L8
        Exception exception;
        exception;
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Error setting up app properties", exception);
          goto _L9
        s1;
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", "There was a problem installing the exception handler.", s1);
          goto _L10
    }

    static void a(boolean flag)
    {
        ab.a().edit().putBoolean("always_send_reports_opt_in", true).commit();
    }

    private boolean a(Context context, float f1)
    {
        Object obj;
        aM am;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5 = true;
        flag4 = true;
        flag1 = false;
        obj = ab.g(getContext());
        try
        {
            aS.a().a(context, t, n, o, i()).c();
            context = aS.a().b();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Error dealing with settings", context);
            context = null;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_440;
        }
        am = ((aX) (context)).a;
        if (!"new".equals(am.a)) goto _L2; else goto _L1
_L1:
        obj = a(Y.a(getContext(), ((String) (obj))));
        if (!(new T(i(), am.b, t)).a(((b) (obj)))) goto _L4; else goto _L3
_L3:
        flag2 = aS.a().d();
_L7:
        try
        {
            flag3 = ((aX) (context)).d.b;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Error getting collect reports setting.", context);
            flag3 = false;
        }
_L9:
        if (!flag2 || !flag3) goto _L6; else goto _L5
_L5:
        flag2 = flag5;
        flag3 = d.b() & true;
        flag2 = flag3;
        context = q();
        flag = flag1;
        flag2 = flag3;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        flag2 = flag3;
        (new aa(context)).a(f1);
        flag2 = flag3;
        flag = flag1;
_L8:
        if (flag)
        {
            com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Crash reporting disabled.");
        }
        return flag2;
_L4:
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Failed to create app with Crashlytics service.", null);
        flag2 = false;
          goto _L7
_L2:
        try
        {
label0:
            {
                if (!"configured".equals(am.a))
                {
                    break label0;
                }
                flag2 = aS.a().d();
            }
        }
        catch (Exception exception)
        {
            com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Error performing auto configuration.", exception);
            flag2 = false;
        }
          goto _L7
        if (am.d)
        {
            com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Server says an update is required - forcing a full App update.");
            obj = a(Y.a(getContext(), ((String) (obj))));
            (new ad(i(), am.b, t)).a(((b) (obj)));
        }
        flag2 = true;
          goto _L7
        context;
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Error sending crash report", context);
        flag = flag1;
          goto _L8
_L6:
        flag = true;
        flag2 = flag4;
          goto _L8
        flag3 = false;
        flag2 = false;
          goto _L9
    }

    static boolean a(Crashlytics crashlytics, Activity activity, aQ aq)
    {
        X x = new X(activity, aq);
        com.crashlytics.android.u u1 = new com.crashlytics.android.u(crashlytics, (byte)0);
        activity.runOnUiThread(new p(crashlytics, activity, u1, x, aq));
        com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Waiting for user opt-in.");
        u1.b();
        return u1.a();
    }

    static boolean a(Crashlytics crashlytics, Context context, float f1)
    {
        return crashlytics.a(context, f1);
    }

    static void b(String s1)
    {
        D d1 = (D)com.crashlytics.android.internal.v.a().a(com/crashlytics/android/internal/D);
        if (d1 != null)
        {
            d1.a(new af(s1));
        }
    }

    private static String c(String s1)
    {
        String s2 = s1;
        if (s1 != null)
        {
            s1 = s1.trim();
            s2 = s1;
            if (s1.length() > 1024)
            {
                s2 = s1.substring(0, 1024);
            }
        }
        return s2;
    }

    static String d()
    {
        return k;
    }

    static String e()
    {
        return l;
    }

    static String f()
    {
        return o;
    }

    static String g()
    {
        return n;
    }

    public static String getCrashlyticsVersion()
    {
        return getInstance().getVersion();
    }

    public static Crashlytics getInstance()
    {
        com/crashlytics/android/Crashlytics;
        JVM INSTR monitorenter ;
        Crashlytics crashlytics = (Crashlytics)com.crashlytics.android.internal.v.a().a(com/crashlytics/android/Crashlytics);
        if (crashlytics == null) goto _L2; else goto _L1
_L1:
        com/crashlytics/android/Crashlytics;
        JVM INSTR monitorexit ;
        return crashlytics;
_L2:
        if (v == null)
        {
            v = new Crashlytics();
        }
        crashlytics = v;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public static PinningInfoProvider getPinningInfoProvider()
    {
        return s;
    }

    static String h()
    {
        return m;
    }

    static String i()
    {
        return ab.a(j, "com.crashlytics.ApiEndpoint");
    }

    static boolean k()
    {
        return ab.a().getBoolean("always_send_reports_opt_in", false);
    }

    public static void log(int i1, String s1, String s2)
    {
        a(i1, s1, s2);
        com.crashlytics.android.internal.v.a().b().a(i1, (new StringBuilder()).append(s1).toString(), (new StringBuilder()).append(s2).toString(), true);
    }

    public static void log(String s1)
    {
        a(3, "Crashlytics", s1);
    }

    public static void logException(Throwable throwable)
    {
        Crashlytics crashlytics = getInstance();
        if (crashlytics == null || crashlytics.d == null)
        {
            com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Crashlytics must be initialized by calling Crashlytics.start(Context) prior to logging exceptions.", null);
            return;
        }
        if (throwable == null)
        {
            com.crashlytics.android.internal.v.a().b().a(5, "Crashlytics", "Crashlytics is ignoring a request to log a null exception.");
            return;
        } else
        {
            crashlytics.d.a(Thread.currentThread(), throwable);
            return;
        }
    }

    static av s()
    {
        return t;
    }

    public static void setApplicationInstallationIdentifier(String s1)
    {
        com.crashlytics.android.internal.v.a().a(c(s1));
    }

    public static void setBool(String s1, boolean flag)
    {
        setString(s1, Boolean.toString(flag));
    }

    public static void setDouble(String s1, double d1)
    {
        setString(s1, Double.toString(d1));
    }

    public static void setFloat(String s1, float f1)
    {
        setString(s1, Float.toString(f1));
    }

    public static void setInt(String s1, int i1)
    {
        setString(s1, Integer.toString(i1));
    }

    public static void setLong(String s1, long l1)
    {
        setString(s1, Long.toString(l1));
    }

    public static void setPinningInfoProvider(PinningInfoProvider pinninginfoprovider)
    {
label0:
        {
            if (s != pinninginfoprovider)
            {
                s = pinninginfoprovider;
                if (t != null)
                {
                    if (pinninginfoprovider != null)
                    {
                        break label0;
                    }
                    t.a(null);
                }
            }
            return;
        }
        t.a(new k(pinninginfoprovider));
    }

    public static void setString(String s1, String s2)
    {
        if (s1 == null)
        {
            if (j != null && ab.f(j))
            {
                throw new IllegalArgumentException("Custom attribute key cannot be null.");
            } else
            {
                com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                return;
            }
        }
        String s3 = c(s1);
        if (getInstance().b.size() < 64 || getInstance().b.containsKey(s3))
        {
            if (s2 == null)
            {
                s1 = "";
            } else
            {
                s1 = c(s2);
            }
            getInstance().b.put(s3, s1);
            return;
        } else
        {
            com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Exceeded maximum number of custom attributes (64)");
            return;
        }
    }

    public static void setUserEmail(String s1)
    {
        getInstance().g = c(s1);
    }

    public static void setUserIdentifier(String s1)
    {
        getInstance().f = c(s1);
    }

    public static void setUserName(String s1)
    {
        getInstance().h = c(s1);
    }

    public static void start(Context context)
    {
        start(context, 1.0F);
    }

    public static void start(Context context, float f1)
    {
        u = f1;
        if (!ab.d(context))
        {
            com.crashlytics.android.internal.v.a().a(new A());
        }
        com.crashlytics.android.internal.v.a(context, new u[] {
            getInstance(), new D()
        });
    }

    final Map a()
    {
        return Collections.unmodifiableMap(b);
    }

    final ao b()
    {
        return e;
    }

    protected final void c()
    {
        Context context = super.getContext();
        String s1 = com.crashlytics.android.internal.r.a(context, false);
        if (s1 == null)
        {
            return;
        }
        try
        {
            a(s1, context, u);
            return;
        }
        catch (CrashlyticsMissingDependencyException crashlyticsmissingdependencyexception)
        {
            throw crashlyticsmissingdependencyexception;
        }
        catch (Exception exception)
        {
            com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Crashlytics was not started due to an exception during initialization", exception);
        }
    }

    public final void crash()
    {
        (new CrashTest()).indexOutOfBounds();
    }

    public final boolean getDebugMode()
    {
        return com.crashlytics.android.internal.v.a().f();
    }

    public final String getVersion()
    {
        return com.crashlytics.android.internal.v.a().getVersion();
    }

    final boolean j()
    {
        return ((Boolean)aS.a().a(new l(this), Boolean.valueOf(false))).booleanValue();
    }

    final com.crashlytics.android.v l()
    {
        return d;
    }

    final String m()
    {
        if (e.a())
        {
            return f;
        } else
        {
            return null;
        }
    }

    final String n()
    {
        if (e.a())
        {
            return g;
        } else
        {
            return null;
        }
    }

    final String o()
    {
        if (e.a())
        {
            return h;
        } else
        {
            return null;
        }
    }

    final boolean p()
    {
        return ((Boolean)aS.a().a(new m(this), Boolean.valueOf(true))).booleanValue();
    }

    final V q()
    {
        return (V)aS.a().a(new n(this), null);
    }

    final aR r()
    {
        return (aR)aS.a().a(new o(this), null);
    }

    public final void setDebugMode(boolean flag)
    {
        com.crashlytics.android.internal.v.a().a(flag);
    }

    public final void setListener(CrashlyticsListener crashlyticslistener)
    {
        c = crashlyticslistener;
    }

    public final boolean verifyPinning(URL url)
    {
label0:
        {
            try
            {
                if (getPinningInfoProvider() == null)
                {
                    break label0;
                }
                url = t.a(ax.a, url.toString());
                ((HttpsURLConnection)url.a()).setInstanceFollowRedirects(false);
                url.b();
            }
            // Misplaced declaration of an exception variable
            catch (URL url)
            {
                com.crashlytics.android.internal.v.a().b().a("Crashlytics", "Could not verify SSL pinning", url);
                return false;
            }
            return true;
        }
        return false;
    }

}
