// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.goplay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.widget.Toast;
import com.gau.go.launcherex.goweather.goplay.a.b;
import com.gau.go.launcherex.gowidget.weather.globaltheme.d;
import com.gau.go.launcherex.gowidget.weather.globaltheme.f;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.go.weatherex.common.PackageEventReceiver;
import com.jiubang.playsdk.a.a;
import com.jiubang.playsdk.main.BitmapBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gau.go.launcherex.goweather.goplay:
//            e, f

public class ThemeDataHandler
{

    private static volatile ThemeDataHandler a = null;
    private Context b;
    private b c;
    private final d d;
    private final ArrayList e = new ArrayList();
    private final List f = new ArrayList();
    private EventReceiver g;
    private final PackageEventReceiver h = new PackageEventReceiver();
    private final com.go.weatherex.common.d i = new e(this);

    private ThemeDataHandler(Context context)
    {
        context = context.getApplicationContext();
        b = context;
        c = new b();
        d = new d(context);
        b();
        h.a(context);
        h.a(i);
        g = new EventReceiver();
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_USED_COUPON_ID");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_APPWIDGET_THEME_CHANGE");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_GOWIDGET_THEME_CHANGE");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_APP_THEME_CHANGE");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LIVE_WALLPAPER_THEME_CHANGE");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_USER_LANGUAGE_CHANGED");
        context.registerReceiver(g, intentfilter);
    }

    public static ThemeDataHandler a(Context context)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/gau/go/launcherex/goweather/goplay/ThemeDataHandler;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new ThemeDataHandler(context);
        }
        com/gau/go/launcherex/goweather/goplay/ThemeDataHandler;
        JVM INSTR monitorexit ;
_L2:
        return a;
        context;
        com/gau/go/launcherex/goweather/goplay/ThemeDataHandler;
        JVM INSTR monitorexit ;
        throw context;
    }

    static ArrayList a(ThemeDataHandler themedatahandler)
    {
        return themedatahandler.e;
    }

    static void a(ThemeDataHandler themedatahandler, String s)
    {
        themedatahandler.c(s);
    }

    static void a(ThemeDataHandler themedatahandler, String s, int j)
    {
        themedatahandler.a(s, j);
    }

    private void a(String s)
    {
        com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1 = c.a(1, s);
        if (b1 != null)
        {
            if (b1.q())
            {
                d.a(0, c.a(b, 1));
            }
            c.c(b1);
        }
        b1 = c.a(3, s);
        if (b1 != null)
        {
            if (b1.q())
            {
                d.a(1, c.a(b, 3));
            }
            c.j(b1);
        }
        b1 = c.a(4, s);
        if (b1 != null)
        {
            if (b1.q())
            {
                d.a(3, c.a(b, 4));
            }
            c.j(b1);
        }
        e(s);
    }

    private void a(String s, int j)
    {
        for (Iterator iterator = (new ArrayList(f)).iterator(); iterator.hasNext(); ((com.gau.go.launcherex.goweather.goplay.f)iterator.next()).a(s, j)) { }
    }

    private void b()
    {
        e.clear();
    }

    static void b(ThemeDataHandler themedatahandler)
    {
        themedatahandler.b();
    }

    static void b(ThemeDataHandler themedatahandler, String s)
    {
        themedatahandler.a(s);
    }

    private void b(com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1)
    {
label0:
        {
label1:
            {
label2:
                {
                    if (b1 != null)
                    {
                        b1.a(e);
                        switch (b1.a())
                        {
                        default:
                            throw new IllegalArgumentException("baseThemeBean.getThemeType() value is bad");

                        case 2: // '\002'
                            break label2;

                        case 3: // '\003'
                            break label1;

                        case 4: // '\004'
                            break label0;

                        case 1: // '\001'
                            c.a(b1);
                            break;
                        }
                    }
                    return;
                }
                c.d(b1);
                return;
            }
            c.f(b1);
            return;
        }
        c.g(b1);
    }

    private void b(String s)
    {
        com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1 = d.a(s);
        if (b1 == null) goto _L2; else goto _L1
_L1:
        if (!b1.t() || !b1.u()) goto _L4; else goto _L3
_L3:
        b1.a(3);
        b(b1);
        b1 = d.a(s);
        b1.a(4);
        b(b1);
_L2:
        d(s);
        return;
_L4:
        if (b1.t())
        {
            b1.a(3);
            b(b1);
        } else
        if (b1.u())
        {
            b1.a(4);
            b(b1);
        } else
        if (b1.E())
        {
            b1.a(1);
            b(b1);
        } else
        if (b1.D())
        {
            b1.a(2);
            b(b1);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    static b c(ThemeDataHandler themedatahandler)
    {
        return themedatahandler.c;
    }

    private void c()
    {
        for (Iterator iterator = (new ArrayList(f)).iterator(); iterator.hasNext(); ((com.gau.go.launcherex.goweather.goplay.f)iterator.next()).a_()) { }
    }

    static void c(ThemeDataHandler themedatahandler, String s)
    {
        themedatahandler.b(s);
    }

    private void c(com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1)
    {
label0:
        {
label1:
            {
label2:
                {
                    if (b1 != null)
                    {
                        b1.a(e);
                        switch (b1.a())
                        {
                        default:
                            throw new IllegalArgumentException("baseThemeBean.getThemeType() value is bad");

                        case 2: // '\002'
                            break label2;

                        case 3: // '\003'
                            break label1;

                        case 4: // '\004'
                            break label0;

                        case 1: // '\001'
                            c.b(b1);
                            break;
                        }
                    }
                    return;
                }
                c.e(b1);
                return;
            }
            c.h(b1);
            return;
        }
        c.i(b1);
    }

    private void c(String s)
    {
        com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1 = d.a(s);
        if (b1 == null) goto _L2; else goto _L1
_L1:
        if (!b1.t() || !b1.u()) goto _L4; else goto _L3
_L3:
        b1.a(3);
        c(b1);
        b1 = d.a(s);
        b1.a(4);
        c(b1);
_L2:
        f(s);
        return;
_L4:
        if (b1.t())
        {
            b1.a(3);
            c(b1);
        } else
        if (b1.u())
        {
            b1.a(4);
            c(b1);
        } else
        if (b1.E())
        {
            b1.a(1);
            c(b1);
        } else
        if (b1.D())
        {
            b1.a(2);
            c(b1);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    static Context d(ThemeDataHandler themedatahandler)
    {
        return themedatahandler.b;
    }

    private void d(String s)
    {
        for (Iterator iterator = (new ArrayList(f)).iterator(); iterator.hasNext(); ((com.gau.go.launcherex.goweather.goplay.f)iterator.next()).a(s)) { }
    }

    static void e(ThemeDataHandler themedatahandler)
    {
        themedatahandler.c();
    }

    private void e(String s)
    {
        for (Iterator iterator = (new ArrayList(f)).iterator(); iterator.hasNext(); ((com.gau.go.launcherex.goweather.goplay.f)iterator.next()).b(s)) { }
    }

    private void f(String s)
    {
        for (Iterator iterator = (new ArrayList(f)).iterator(); iterator.hasNext(); ((com.gau.go.launcherex.goweather.goplay.f)iterator.next()).c(s)) { }
    }

    public com.gau.go.launcherex.gowidget.weather.globaltheme.b.b a(a a1)
    {
        return c.a(a1);
    }

    public BitmapBean a(Context context, a a1)
    {
        BitmapBean bitmapbean = new BitmapBean();
        a1 = a(a1);
        if (a1 != null)
        {
            context = a1.a(context);
            if (context != null && (context instanceof BitmapDrawable))
            {
                bitmapbean.a(((BitmapDrawable)context).getBitmap());
            }
        }
        return bitmapbean;
    }

    public void a(Context context, int j)
    {
        if (r.a(context, "com.kittyplay.ex"))
        {
            Intent intent = new Intent("com.jiubang.go.gomarket.appgame_MAIN.kittyplay");
            intent.putExtra("APPS_MANAGEMENT_ENTRANCE_KEY", 24);
            intent.addFlags(0x10000000);
            context.startActivity(intent);
            return;
        } else
        {
            r.b(context, "market://details?id=com.kittyplay.ex&referrer=utm_source%3Dweather%26utm_medium%3DHyperlink%26utm_campaign%3Dgetmorethemes", "com.kittyplay.ex");
            return;
        }
    }

    public void a(com.gau.go.launcherex.goweather.goplay.f f1)
    {
        if (f1 == null || f.contains(f1))
        {
            return;
        } else
        {
            f.add(f1);
            return;
        }
    }

    public boolean a()
    {
        return e != null && !e.isEmpty();
    }

    public boolean a(com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1)
    {
        return c.k(b1);
    }

    public ArrayList b(Context context, a a1)
    {
        Object obj = com.gau.go.launcherex.gowidget.weather.globaltheme.f.a(context, a(a1));
        a1 = new ArrayList();
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a1.add(new BitmapBean((Bitmap)((Iterator) (obj)).next(), ""))) { }
        if (a1.size() == 0)
        {
            a1.add(new BitmapBean(BitmapFactory.decodeResource(context.getResources(), 0x7f0205a8), ""));
        }
        return a1;
    }

    public List b(Context context)
    {
        if (!c.b())
        {
            context = d.e();
            for (Iterator iterator = context.iterator(); iterator.hasNext(); ((com.gau.go.launcherex.gowidget.weather.globaltheme.b.b)iterator.next()).a(e)) { }
            c.a(com.gau.go.launcherex.gowidget.weather.globaltheme.b.b.a(context));
        }
        return c.c();
    }

    public void b(com.gau.go.launcherex.goweather.goplay.f f1)
    {
        if (f1 == null || !f.contains(f1))
        {
            return;
        } else
        {
            f.remove(f1);
            return;
        }
    }

    public List c(Context context)
    {
        if (!c.d())
        {
            context = d.d();
            for (Iterator iterator = context.iterator(); iterator.hasNext(); ((com.gau.go.launcherex.gowidget.weather.globaltheme.b.b)iterator.next()).a(e)) { }
            c.b(com.gau.go.launcherex.gowidget.weather.globaltheme.b.b.a(context));
        }
        return c.e();
    }

    public boolean c(Context context, a a1)
    {
        context = a(a1);
        if (context != null)
        {
            return context.q();
        } else
        {
            return false;
        }
    }

    public List d(Context context)
    {
        if (!c.f())
        {
            context = d.b();
            for (Iterator iterator = context.iterator(); iterator.hasNext(); ((com.gau.go.launcherex.gowidget.weather.globaltheme.b.b)iterator.next()).a(e)) { }
            c.c(com.gau.go.launcherex.gowidget.weather.globaltheme.b.b.a(context));
        }
        return c.h();
    }

    public void d(Context context, a a1)
    {
        Intent intent;
        a1 = a(a1);
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", context.getString(0x7f08021f));
        intent.putExtra("android.intent.extra.TEXT", context.getString(0x7f080220, new Object[] {
            a1.w()
        }));
        context.startActivity(Intent.createChooser(intent, context.getString(0x7f0801dd)));
        return;
        a1;
        Toast.makeText(context, 0x7f0801de, 0).show();
        return;
    }

    public List e(Context context)
    {
        if (!c.g())
        {
            context = d.c();
            for (Iterator iterator = context.iterator(); iterator.hasNext(); ((com.gau.go.launcherex.gowidget.weather.globaltheme.b.b)iterator.next()).a(e)) { }
            c.d(com.gau.go.launcherex.gowidget.weather.globaltheme.b.b.a(context));
        }
        return c.i();
    }

    public boolean f(Context context)
    {
        return com.gau.go.launcherex.gowidget.weather.d.f.a(context).c();
    }


    private class EventReceiver extends BroadcastReceiver
    {

        final ThemeDataHandler a;

        public void onReceive(Context context, Intent intent)
        {
            if (intent != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            Object obj = intent.getAction();
            if (!"com.gau.go.launcherex.gowidget.weatherwidget.ACTION_USED_COUPON_ID".equals(obj)) goto _L4; else goto _L3
_L3:
            context = intent.getStringExtra("extra_used_coupon_id");
            if (TextUtils.isEmpty(context)) goto _L1; else goto _L5
_L5:
            int j;
            int k;
            k = com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(a).size();
            j = 0;
_L8:
            if (j >= k)
            {
                break MISSING_BLOCK_LABEL_477;
            }
            if (!((com.gau.go.launcherex.gowidget.weather.globaltheme.b.a)com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(a).get(j)).a().equals(context)) goto _L7; else goto _L6
_L6:
            if (j != -1)
            {
                com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(a).remove(j);
                return;
            }
              goto _L1
_L7:
            j++;
              goto _L8
_L4:
            if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_RECEIVE_THEME_COUPON_NOTIFICATION".equals(obj))
            {
                com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.b(a);
                return;
            }
            if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_APPWIDGET_THEME_CHANGE".equals(obj))
            {
                String s = intent.getStringExtra("extra_app_widget_theme_package");
                obj = com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.c(a).a(1, s);
                intent = ((Intent) (obj));
                if (obj == null)
                {
                    intent = com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.c(a).a(2, s);
                }
                if (intent != null && a.a(intent))
                {
                    com.gau.go.launcherex.goweather.goplay.q.d(context);
                    com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(a, intent.x(), 1);
                    return;
                }
            } else
            if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_GOWIDGET_THEME_CHANGE".equals(obj))
            {
                obj = intent.getStringExtra("extra_gowidget_theme_package");
                intent = ((Intent) (obj));
                if ("app_widget_theme_white".equals(obj))
                {
                    intent = "go_widget_theme_white";
                }
                intent = com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.c(a).a(2, intent);
                if (intent != null && a.a(intent))
                {
                    com.gau.go.launcherex.goweather.goplay.q.d(context);
                    com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(a, intent.x(), 2);
                    return;
                }
            } else
            {
label0:
                {
                    if (!"com.gau.go.launcherex.gowidget.weatherwidget.ACTION_APP_THEME_CHANGE".equals(obj))
                    {
                        break label0;
                    }
                    intent = intent.getStringExtra("extra_app_theme_package");
                    if ("com.gtp.go.weather.phototheme".equals(intent) && com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.c(a).a(3, intent) == null)
                    {
                        com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.c(a).f(com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.a(com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.d(a)));
                    }
                    intent = com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.c(a).a(3, intent);
                    if (intent != null && a.a(intent))
                    {
                        com.gau.go.launcherex.goweather.goplay.q.d(context);
                        com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(a, intent.x(), 3);
                        return;
                    }
                }
            }
              goto _L1
            if (!"com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LIVE_WALLPAPER_THEME_CHANGE".equals(obj))
            {
                continue; /* Loop/switch isn't completed */
            }
            intent = intent.getStringExtra("extra_wallpaper_theme_package");
            intent = com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.c(a).a(4, intent);
            if (intent == null || !a.a(intent)) goto _L1; else goto _L9
_L9:
            com.gau.go.launcherex.goweather.goplay.q.d(context);
            com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(a, intent.x(), 3);
            return;
            if (!"com.gau.go.launcherex.gowidget.weatherwidget.ACTION_USER_LANGUAGE_CHANGED".equals(obj)) goto _L1; else goto _L10
_L10:
            com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.c(a).a();
            ThemeDataHandler.e(a);
            return;
            j = -1;
              goto _L6
        }

        public EventReceiver()
        {
            a = ThemeDataHandler.this;
            super();
        }
    }

}
