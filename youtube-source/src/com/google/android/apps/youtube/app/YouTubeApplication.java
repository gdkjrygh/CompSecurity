// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.android.volley.l;
import com.google.ads.conversiontracking.GoogleConversionPing;
import com.google.android.apps.youtube.app.b.e;
import com.google.android.apps.youtube.app.b.n;
import com.google.android.apps.youtube.app.notification.b;
import com.google.android.apps.youtube.app.remote.YouTubeTvScreensMonitor;
import com.google.android.apps.youtube.app.remote.an;
import com.google.android.apps.youtube.app.remote.bb;
import com.google.android.apps.youtube.app.remote.bk;
import com.google.android.apps.youtube.app.remote.bw;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.d.d;
import com.google.android.apps.youtube.common.d.j;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.BaseApplication;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.async.u;
import com.google.android.apps.youtube.core.client.at;
import com.google.android.apps.youtube.core.client.ax;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.client.ca;
import com.google.android.apps.youtube.core.identity.ai;
import com.google.android.apps.youtube.core.identity.aj;
import com.google.android.apps.youtube.core.offline.store.q;
import com.google.android.apps.youtube.core.offline.store.r;
import com.google.android.apps.youtube.core.player.ae;
import com.google.android.apps.youtube.core.player.c;
import com.google.android.apps.youtube.core.utils.PackageUtil;
import com.google.android.apps.youtube.core.utils.Util;
import com.google.android.apps.youtube.datalib.c.f;
import com.google.android.apps.youtube.datalib.innertube.ag;
import com.google.android.apps.youtube.datalib.offline.o;
import com.google.android.apps.youtube.datalib.offline.s;
import com.google.android.apps.ytremote.a.d.a;
import com.google.android.youtube.app.honeycomb.widget.WidgetProvider;
import com.google.android.youtube.p;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.impl.client.AbstractHttpClient;

// Referenced classes of package com.google.android.apps.youtube.app:
//            as, at, ax, au, 
//            aw, av

public class YouTubeApplication extends BaseApplication
    implements r
{

    private int a;
    private com.google.android.apps.youtube.app.ax b;
    private final com.google.android.apps.youtube.common.c.d c = new as(this);
    private final com.google.android.apps.youtube.common.c.d d = new com.google.android.apps.youtube.app.at(this);

    public YouTubeApplication()
    {
    }

    static com.google.android.apps.youtube.app.ax a(YouTubeApplication youtubeapplication)
    {
        return youtubeapplication.b;
    }

    private void a(int i1)
    {
        a = i1;
        String s1;
        if (i1 == -2)
        {
            s1 = "Signed out";
        } else
        if (i1 == -1)
        {
            s1 = "Signed in";
        } else
        if (i1 == 0)
        {
            s1 = "No subscriptions";
        } else
        {
            s1 = "Subscriptions";
        }
        b.ba().a(2, "Engagement", s1, 2);
    }

    protected final boolean a()
    {
        Object obj1 = (ActivityManager)getSystemService("activity");
        int i1 = Process.myPid();
        Object obj = new Intent("com.google.android.youtube.api.service.START");
        ((Intent) (obj)).setPackage(getApplicationInfo().packageName);
        obj = getPackageManager().resolveService(((Intent) (obj)), 0);
        if (((ResolveInfo) (obj)).serviceInfo != null)
        {
            obj = ((ResolveInfo) (obj)).serviceInfo.processName;
        } else
        {
            obj = null;
        }
        if (obj == null)
        {
            return true;
        }
        obj1 = ((ActivityManager) (obj1)).getRunningAppProcesses();
        if (obj1 == null || getApplicationInfo().processName.equals(obj))
        {
            return true;
        }
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext();)
        {
            android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj1)).next();
            if (runningappprocessinfo.pid == i1)
            {
                return !runningappprocessinfo.processName.equals(obj);
            }
        }

        return true;
    }

    protected final com.google.android.apps.youtube.core.a b()
    {
        return new com.google.android.apps.youtube.app.ax(this);
    }

    protected final void c()
    {
        b = (com.google.android.apps.youtube.app.ax)super.y();
        super.c();
        h h1 = b.aX();
        com.google.android.apps.youtube.common.e.n n1 = b.aG();
        com.google.android.apps.youtube.core.identity.l l1 = b.aT();
        Object obj = b.aP();
        com.google.android.apps.ytremote.a.d.a.a(b.aZ());
        u.a = ((SharedPreferences) (obj));
        com.google.android.apps.youtube.common.c.a a1 = b.bf();
        a1.a(this, com/google/android/apps/youtube/core/identity/aj, c);
        a1.a(this, com/google/android/apps/youtube/core/identity/ai, d);
        (new e()).a(b.K());
        a1.a(new n());
        a1.a(b.ac());
        a1.a(b.ad());
        a1.a(b.T());
        a1.a(b.aa());
        a1.a(b.D());
        a1.a(b.P());
        b.Q();
        b.R();
        b.W();
        b.X();
        b.q();
        b.aM().setCookieStore(b.D().a());
        if (b.aX().g())
        {
            ComponentName componentname = new ComponentName(this, "com.google.android.youtube.ManageNetworkUsageActivity");
            PackageManager packagemanager = getPackageManager();
            if (packagemanager.getComponentEnabledSetting(componentname) != 1)
            {
                L.e("Enabling network usage management");
                packagemanager.setComponentEnabledSetting(componentname, 1, 1);
            }
        }
        if (z())
        {
            ((SharedPreferences) (obj)).edit().putBoolean("download_only_while_charging", true).putInt("transfer_max_connections", 3).apply();
        }
        ((SharedPreferences) (obj)).edit().putInt("identity_version", 1).apply();
        com.google.android.apps.youtube.core.utils.Util.StartupType startuptype = Util.a(PackageUtil.f(this), ((SharedPreferences) (obj)));
        String s1 = getResources().getString(p.bX);
        Analytics analytics = b.ba();
        analytics.a(3, "FormFactor", s1, 2);
        analytics.a("Startup", startuptype.toString());
        if (z())
        {
            (new au(this, b.av().listFiles())).start();
        }
        a(-2);
        b.W().a(new bb(this));
        GoogleConversionPing.a(this, "1001680686", "4dahCKKczAYQrt7R3QM", "<Android_YT_Open_App>", null);
        b.l().a();
        if (z() || ((SharedPreferences) (obj)).getBoolean("pending_notification_registration", false))
        {
            if (h1.a())
            {
                b.T().a();
                ((SharedPreferences) (obj)).edit().putBoolean("pending_notification_registration", false).apply();
            } else
            {
                ((SharedPreferences) (obj)).edit().putBoolean("pending_notification_registration", true).apply();
            }
        }
        b.bi().a(new com.google.android.apps.youtube.datalib.offline.h(b.n()));
        obj = b.bh();
        ((j) (obj)).a(new com.google.android.apps.youtube.datalib.offline.p(b.n(), h1));
        ((j) (obj)).b(com.google.android.apps.youtube.datalib.offline.o.a(n1.a()));
        com.google.android.apps.youtube.core.player.c.a(PackageUtil.f(this));
        com.google.android.apps.youtube.core.player.c.a(n1);
        com.google.android.apps.youtube.core.player.c.a(h1);
        com.google.android.apps.youtube.core.player.c.a(b.L());
        if (l1.b())
        {
            q q1 = b.q();
            if (q1 instanceof com.google.android.apps.youtube.app.offline.a.a)
            {
                ((com.google.android.apps.youtube.app.offline.a.a)q1).handleSignInEvent(new ai());
            }
        }
        if (com.google.android.apps.youtube.core.utils.p.a(this))
        {
            ((j) (obj)).a(new com.google.android.apps.youtube.app.offline.sync.e(b.r(), h1));
        }
        ((j) (obj)).a(new s(b.B(), b.S(), ((j) (obj)), n1, b.i()));
        ((j) (obj)).a(com.google.android.apps.youtube.datalib.offline.s.a(n1.a(), b.i()));
        b.I().a(a1);
    }

    public final com.google.android.apps.youtube.app.ax d()
    {
        return (com.google.android.apps.youtube.app.ax)super.y();
    }

    public final void e()
    {
        SharedPreferences sharedpreferences = b.aP();
        int i1 = sharedpreferences.getInt("session_watch_count", 0);
        sharedpreferences.edit().putInt("session_watch_count", i1 + 1).apply();
    }

    public final bc f()
    {
        return b.f();
    }

    public final String g()
    {
        return "YouTube";
    }

    public final com.google.android.apps.youtube.app.offline.sync.b h()
    {
        return b.r();
    }

    public final bj i()
    {
        return b.aw();
    }

    public final at j()
    {
        return b.O();
    }

    public final bk k()
    {
        return b.P();
    }

    public final YouTubeTvScreensMonitor l()
    {
        return b.Q();
    }

    public final bw m()
    {
        return b.R();
    }

    public final b n()
    {
        return b.T();
    }

    public final f o()
    {
        return b.V();
    }

    public final an p()
    {
        return b.W();
    }

    public final q q()
    {
        return b.q();
    }

    public final ae r()
    {
        return b.ac();
    }

    public final String s()
    {
        String s1;
        Object obj;
        Set set;
        set = GDataRequestFactory.a;
        obj = b.aP().getString("country", "");
        s1 = ((String) (obj));
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L2; else goto _L1
_L1:
        obj = ((String) (obj)).toUpperCase(Locale.US);
        s1 = ((String) (obj));
        if (!set.contains(obj)) goto _L2; else goto _L3
_L3:
        s1 = ((String) (obj));
_L5:
        return s1;
_L2:
        obj = (TelephonyManager)getSystemService("phone");
        if (obj != null)
        {
            obj = ((TelephonyManager) (obj)).getSimCountryIso();
            s1 = ((String) (obj));
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                obj = ((String) (obj)).toUpperCase(Locale.US);
                s1 = ((String) (obj));
                if (set.contains(obj))
                {
                    return ((String) (obj));
                }
            }
        }
        if (!TextUtils.isEmpty(s1))
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = b.b().V();
        if (TextUtils.isEmpty(s1))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = s1.toUpperCase(Locale.US);
        s1 = ((String) (obj));
        if (set.contains(obj)) goto _L5; else goto _L4
_L4:
        String s2 = Locale.getDefault().getCountry().toUpperCase(Locale.US);
        s1 = s2;
        if (!set.contains(s2))
        {
            return null;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public final void t()
    {
        L.e("User signed in");
        b.f().i();
        a(-1);
        WidgetProvider.a(this);
        b.O().f();
    }

    public final void u()
    {
        L.e("User signed out");
        b.ai().set(null);
        b.f().i();
        a(-2);
        b.aJ().execute(new av(this));
        WidgetProvider.a(this);
    }

    public final int v()
    {
        return a;
    }

    public final boolean w()
    {
        return b.al();
    }

    public final ag x()
    {
        return b.aq();
    }

    public final volatile com.google.android.apps.youtube.core.a y()
    {
        return (com.google.android.apps.youtube.app.ax)super.y();
    }
}
