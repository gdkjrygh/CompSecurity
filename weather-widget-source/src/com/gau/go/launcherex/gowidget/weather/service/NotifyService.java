// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.service;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.service.error.model.LocationErrorBean;
import com.gau.go.launcherex.gowidget.statistics.i;
import com.gau.go.launcherex.gowidget.statistics.s;
import com.gau.go.launcherex.gowidget.weather.b.aa;
import com.gau.go.launcherex.gowidget.weather.b.ab;
import com.gau.go.launcherex.gowidget.weather.b.ae;
import com.gau.go.launcherex.gowidget.weather.b.ah;
import com.gau.go.launcherex.gowidget.weather.b.k;
import com.gau.go.launcherex.gowidget.weather.b.m;
import com.gau.go.launcherex.gowidget.weather.b.r;
import com.gau.go.launcherex.gowidget.weather.b.t;
import com.gau.go.launcherex.gowidget.weather.b.v;
import com.gau.go.launcherex.gowidget.weather.d.p;
import com.gau.go.launcherex.gowidget.weather.globaltheme.a;
import com.gau.go.launcherex.gowidget.weather.globaltheme.a.d;
import com.gau.go.launcherex.gowidget.weather.view.WeatherDetailActivity;
import com.google.analytics.tracking.android.GAServiceManager;
import com.gtp.a.a.b.c;
import com.gtp.go.weather.a.a.b;
import com.gtp.go.weather.sharephoto.b.g;
import com.gtp.go.weather.sharephoto.photo.f;
import java.io.File;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.service:
//            AppWidgetService, h, i

public class NotifyService extends Service
{

    private k a;
    private com.gau.go.launcherex.gowidget.weather.b.i b;
    private ah c;
    private Notification d;
    private m e;
    private v f;
    private ab g;
    private Handler h;
    private r i;
    private p j;
    private com.gau.go.launcherex.gowidget.weather.globaltheme.a.a k;
    private t l;

    public NotifyService()
    {
    }

    private void a()
    {
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(this))
        {
            startService(new Intent(this, com/gau/go/launcherex/gowidget/weather/service/AppWidgetService));
        }
    }

    private static void a(Context context, String s1, boolean flag)
    {
        context = GoWidgetApplication.c(context.getApplicationContext()).a().edit();
        context.putBoolean(s1, flag);
        context.commit();
    }

    private void a(Bundle bundle)
    {
        java.util.ArrayList arraylist = bundle.getParcelableArrayList("req_arg");
        if (arraylist != null)
        {
            int i1 = bundle.getInt("updateWay", 1);
            i.a(arraylist, i1);
        }
    }

    private void a(Bundle bundle, int i1)
    {
        java.util.ArrayList arraylist = bundle.getParcelableArrayList("req_arg");
        int j1 = bundle.getInt("updateWay", 1);
        i.a(arraylist, i1, j1);
    }

    private void b()
    {
        i i1 = com.gau.go.launcherex.gowidget.statistics.i.a(getApplicationContext());
        long l1 = getSharedPreferences("network_time_and_status_schedule_task", 0).getLong("upload_time", 0L);
        if (l1 == 0L)
        {
            i1.a(0x2bf20L);
            return;
        }
        l1 = System.currentTimeMillis() - l1;
        if (l1 >= 0L && l1 <= 0x1b77400L)
        {
            i1.a(0x1b77400L - l1);
            return;
        } else
        {
            i1.a(5000L);
            return;
        }
    }

    private void b(Bundle bundle)
    {
        int i1 = bundle.getInt("notify_on_or_off", -1);
        if (i1 != -1)
        {
            if (i1 == 1)
            {
                if (a == null)
                {
                    a = new k(getApplicationContext());
                }
                a.a();
            } else
            if (i1 == 0 && a != null)
            {
                a.b();
                a = null;
                return;
            }
        }
    }

    private void c()
    {
        s s1 = s.a(getApplicationContext());
        long l1 = getSharedPreferences("schedule_task", 0).getLong("upload_time", 0L);
        if (l1 == 0L)
        {
            s1.a();
            return;
        }
        l1 = System.currentTimeMillis() - l1;
        if (l1 >= 0L && l1 <= 0x1b77400L)
        {
            s1.a(0x1b77400L - l1);
            return;
        } else
        {
            s1.a(0L);
            return;
        }
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        h = new Handler();
        d = new Notification();
        g = ab.a(getApplicationContext());
        g.a();
        b = new com.gau.go.launcherex.gowidget.weather.b.i(getApplicationContext());
        c = new ah(getApplicationContext());
        k = new com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(getApplicationContext());
        c();
        i = r.a(getApplicationContext());
        b();
        a();
        l = new t(getApplicationContext());
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (a != null)
        {
            a.b();
            a = null;
        }
        if (b != null)
        {
            b.c();
            b = null;
        }
        if (d != null)
        {
            d = null;
        }
        if (c != null)
        {
            c.b();
            c = null;
        }
        if (g != null)
        {
            g.b();
            g = null;
        }
        if (e != null)
        {
            e.b();
            e = null;
        }
        if (l != null)
        {
            l.a();
        }
        if (f != null)
        {
            f.a();
        }
        s.a(getApplicationContext()).c();
        i.c();
        if (j != null)
        {
            j.b();
            j = null;
        }
        startService(new Intent(this, com/gau/go/launcherex/gowidget/weather/service/NotifyService));
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        Object obj;
        com.gtp.a.a.b.c.a("NotifyService", (new StringBuilder()).append("onStartCommand: ").append(intent).append(", ").append(i1).append(", ").append(j1).toString());
        if (intent == null)
        {
            if (k != null)
            {
                k.a();
            }
            return super.onStartCommand(intent, i1, j1);
        }
        obj = intent.getExtras();
        if (obj == null) goto _L2; else goto _L1
_L1:
        int k1 = ((Bundle) (obj)).getInt("notify_request", -1);
        k1;
        JVM INSTR tableswitch 1 53: default 320
    //                   1 328
    //                   2 320
    //                   3 337
    //                   4 448
    //                   5 320
    //                   6 320
    //                   7 320
    //                   8 480
    //                   9 512
    //                   10 320
    //                   11 320
    //                   12 534
    //                   13 543
    //                   14 320
    //                   15 320
    //                   16 320
    //                   17 565
    //                   18 320
    //                   19 320
    //                   20 593
    //                   21 638
    //                   22 629
    //                   23 649
    //                   24 320
    //                   25 320
    //                   26 320
    //                   27 320
    //                   28 320
    //                   29 666
    //                   30 710
    //                   31 742
    //                   32 760
    //                   33 320
    //                   34 788
    //                   35 805
    //                   36 828
    //                   37 846
    //                   38 982
    //                   39 320
    //                   40 320
    //                   41 320
    //                   42 320
    //                   43 320
    //                   44 320
    //                   45 320
    //                   46 320
    //                   47 320
    //                   48 320
    //                   49 320
    //                   50 616
    //                   51 320
    //                   52 1026
    //                   53 1059;
           goto _L2 _L3 _L2 _L4 _L5 _L2 _L2 _L2 _L6 _L7 _L2 _L2 _L8 _L9 _L2 _L2 _L2 _L10 _L2 _L2 _L11 _L12 _L13 _L14 _L2 _L2 _L2 _L2 _L2 _L15 _L16 _L17 _L18 _L2 _L19 _L20 _L21 _L22 _L23 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L24 _L2 _L25 _L26
_L2:
        return super.onStartCommand(intent, i1, j1);
_L3:
        b(((Bundle) (obj)));
        continue; /* Loop/switch isn't completed */
_L4:
        obj = intent.getStringExtra("notify_extra_warn_type");
        if (((String) (obj)).equals("notify_extra_warn_delete"))
        {
            if (b != null)
            {
                b.b();
                b.a();
            }
        } else
        if (((String) (obj)).equals("notify_extra_warn_touch") && b != null)
        {
            obj = intent.getStringExtra("cityId");
            long l1 = intent.getLongExtra("notify_extra_warn_notifyid", 0L);
            startActivity(WeatherDetailActivity.a(this, ((String) (obj)), true, 11, "", 7));
            b.a(l1);
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (c == null)
        {
            c = new ah(getApplicationContext());
        }
        c.a();
        continue; /* Loop/switch isn't completed */
_L6:
        if (e == null)
        {
            e = new m(getApplicationContext());
        }
        e.a();
        continue; /* Loop/switch isn't completed */
_L7:
        h.postDelayed(new h(this), 20000L);
        continue; /* Loop/switch isn't completed */
_L8:
        GAServiceManager.getInstance().dispatch();
        continue; /* Loop/switch isn't completed */
_L9:
        h.postDelayed(new com.gau.go.launcherex.gowidget.weather.service.i(this), 1000L);
        continue; /* Loop/switch isn't completed */
_L10:
        obj = intent.getStringExtra("request_extra_statistics_installed_theme_package_name");
        (new aa(getApplicationContext())).a(((String) (obj)));
        continue; /* Loop/switch isn't completed */
_L11:
        k1 = ((Bundle) (obj)).getInt("isMyLocation", 2);
        i.a(k1);
        continue; /* Loop/switch isn't completed */
_L24:
        ae.a(getApplicationContext()).a();
        continue; /* Loop/switch isn't completed */
_L13:
        a(((Bundle) (obj)));
        continue; /* Loop/switch isn't completed */
_L12:
        a(((Bundle) (obj)), k1);
        continue; /* Loop/switch isn't completed */
_L14:
        (new com.gau.go.launcherex.gowidget.weather.b.a(getApplicationContext())).a();
        continue; /* Loop/switch isn't completed */
_L15:
        obj = ((Bundle) (obj)).getString("request_extra_notify_request_code_open_app");
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            try
            {
                startActivity(getPackageManager().getLaunchIntentForPackage(((String) (obj))));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
            }
        }
        continue; /* Loop/switch isn't completed */
_L16:
        obj = (LocationErrorBean)((Bundle) (obj)).getParcelable("request_extra_feedback_location_data");
        (new com.gau.go.launcherex.gowidget.service.error.a.a(getApplicationContext())).a(((LocationErrorBean) (obj)));
        continue; /* Loop/switch isn't completed */
_L17:
        (new com.gau.go.launcherex.gowidget.a.a.a()).execute(new Void[0]);
        continue; /* Loop/switch isn't completed */
_L18:
        if (j == null)
        {
            j = p.a(getApplicationContext());
            j.a();
        }
        continue; /* Loop/switch isn't completed */
_L19:
        if (k != null)
        {
            k.a();
        }
        continue; /* Loop/switch isn't completed */
_L20:
        boolean flag = ((Bundle) (obj)).getBoolean("request_extra_show_new_theme_star", false);
        com.gau.go.launcherex.gowidget.weather.globaltheme.a.d.a(getApplication(), flag);
        continue; /* Loop/switch isn't completed */
_L21:
        (new com.gau.go.launcherex.gowidget.statistics.c(getApplicationContext())).a(intent);
        continue; /* Loop/switch isn't completed */
_L22:
        long l2 = ((Bundle) (obj)).getLong("request_extra_redownload_photo_id");
        if (l2 != 0L && TextUtils.isEmpty(com.gtp.go.weather.sharephoto.photo.f.a(getApplicationContext()).a(l2)))
        {
            Object obj1 = ((Bundle) (obj)).getString("request_extra_redownload_photo_path");
            if (!TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                obj1 = new File(((String) (obj1)));
                if (obj1 != null && ((File) (obj1)).exists())
                {
                    ((File) (obj1)).delete();
                }
            }
            obj1 = ((Bundle) (obj)).getString("request_extra_redownload_photo_url");
            if (!TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                g g1 = new g();
                g1.a(l2);
                g1.l(((String) (obj1)));
                com.gtp.go.weather.sharephoto.photo.f.a(getApplicationContext()).a(g1);
            }
        }
_L23:
        String s1 = ((Bundle) (obj)).getString("request_extra_runtime_crash_title");
        obj = ((Bundle) (obj)).getString("request_extra_runtime_crash_text");
        com.gtp.go.weather.a.a.b.a(getApplicationContext()).a(new com.gtp.go.weather.a.a.a(s1, ((String) (obj))));
        continue; /* Loop/switch isn't completed */
_L25:
        if (f == null)
        {
            f = new v(getApplicationContext());
        }
        f.a(intent);
        continue; /* Loop/switch isn't completed */
_L26:
        a(this, "key_enable_ad_banner", intent.getBooleanExtra("extra_ad_enable", false));
        if (true) goto _L2; else goto _L27
_L27:
    }
}
