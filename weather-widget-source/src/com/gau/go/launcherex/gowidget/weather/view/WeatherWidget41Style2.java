// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.gau.go.launcherex.gowidget.framework.GoWidgetFrame;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.e.h;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.RequestBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.WidgetSettingBean;
import com.gau.go.launcherex.gowidget.weather.scroller.WidgetScrollGroup;
import com.gau.go.launcherex.gowidget.weather.scroller.m;
import com.gau.go.launcherex.gowidget.weather.service.WeatherService;
import com.gau.go.launcherex.gowidget.weather.service.e;
import com.gau.go.launcherex.gowidget.weather.theme.a;
import com.gau.go.launcherex.gowidget.weather.theme.b;
import com.gau.go.launcherex.gowidget.weather.theme.d;
import com.gau.go.launcherex.gowidget.weather.util.r;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            bi, bf, bg, ay, 
//            be, bj, bh, t

public class WeatherWidget41Style2 extends GoWidgetFrame
    implements android.view.View.OnClickListener, android.view.View.OnLongClickListener, m
{

    private boolean A;
    private boolean B;
    private PackageChangeReceiver C;
    private final BroadcastReceiver D = new bf(this);
    private final BroadcastReceiver E = new bg(this);
    boolean a;
    WidgetSettingBean b;
    private int c;
    private g d;
    private com.gau.go.launcherex.gowidget.weather.widget.dynamicicon.a e;
    private View f;
    private View g;
    private boolean h;
    private boolean i;
    private boolean j;
    private final bi k = new bi(this);
    private String l;
    private int m;
    public WidgetScrollGroup mWidgetScrollGroup;
    private boolean n;
    private com.gau.go.launcherex.gowidget.weather.systemwidget.m o;
    private bj p;
    private e q;
    private com.gau.go.launcherex.gowidget.weather.service.b r;
    private ServiceConnection s;
    private String t;
    private boolean u;
    private a v;
    private String w;
    private int x;
    private int y;
    private Resources z;

    public WeatherWidget41Style2(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = 0;
        e = null;
        h = true;
        i = false;
        j = true;
        s = null;
        b = new WidgetSettingBean();
        v = null;
        w = "";
        x = 5;
        y = 0;
        z = null;
        a();
    }

    static int a(WeatherWidget41Style2 weatherwidget41style2, int i1)
    {
        weatherwidget41style2.y = i1;
        return i1;
    }

    static com.gau.go.launcherex.gowidget.weather.service.b a(WeatherWidget41Style2 weatherwidget41style2)
    {
        return weatherwidget41style2.r;
    }

    static e a(WeatherWidget41Style2 weatherwidget41style2, e e1)
    {
        weatherwidget41style2.q = e1;
        return e1;
    }

    private ay a(WeatherBean weatherbean)
    {
        ay ay1 = new ay(getContext());
        ay1.a(this);
        ay1.setOnLongClickListener(this);
        ay1.a(weatherbean);
        ay1.e();
        if (v != null)
        {
            ay1.a(v);
        }
        mWidgetScrollGroup.addView(ay1);
        mWidgetScrollGroup.a();
        return ay1;
    }

    static ay a(WeatherWidget41Style2 weatherwidget41style2, WeatherBean weatherbean)
    {
        return weatherwidget41style2.a(weatherbean);
    }

    static String a(WeatherWidget41Style2 weatherwidget41style2, String s1)
    {
        weatherwidget41style2.w = s1;
        return s1;
    }

    private void a()
    {
        s = new be(this);
        p = new bj(this);
        l();
        d = new g(getContext());
        t = getContext().getPackageName();
        o = new com.gau.go.launcherex.gowidget.weather.systemwidget.m(getContext());
        getContext().startService(new Intent("com.gau.go.launcherex.gowidget.weather.service.NotifyService"));
    }

    private void a(int i1)
    {
        d.d(i1);
        for (Iterator iterator = mWidgetScrollGroup.b().iterator(); iterator.hasNext(); ((ay)iterator.next()).f()) { }
    }

    private void a(Bundle bundle)
    {
        boolean flag;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        flag2 = true;
        flag3 = true;
        flag4 = true;
        flag = true;
        if (!bundle.containsKey("dateStyle")) goto _L2; else goto _L1
_L1:
        a(com.gau.go.launcherex.gowidget.weather.util.r.a(bundle, "dateStyle"));
_L4:
        return;
_L2:
        if (bundle.containsKey("world_clock"))
        {
            if (com.gau.go.launcherex.gowidget.weather.util.r.a(bundle, "world_clock") != 1)
            {
                flag = false;
            }
            c(flag);
            return;
        }
        if (bundle.containsKey("isCycle"))
        {
            WidgetSettingBean widgetsettingbean = b;
            if (com.gau.go.launcherex.gowidget.weather.util.r.a(bundle, "isCycle") == 1)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            widgetsettingbean.f = flag;
            d(b.f);
            return;
        }
        if (bundle.containsKey("tempUnit"))
        {
            b.a = com.gau.go.launcherex.gowidget.weather.util.r.a(bundle, "tempUnit");
            g();
            return;
        }
        if (bundle.containsKey("widgt_calendar"))
        {
            b.e = bundle.getString("widgt_calendar");
            return;
        }
        if (bundle.containsKey("widgt_clock"))
        {
            b.d = bundle.getString("widgt_clock");
            return;
        }
        if (bundle.containsKey("go_widget_theme"))
        {
            t = bundle.getString("go_widget_theme");
            b(t);
            return;
        }
        if (!bundle.containsKey("auto_location"))
        {
            continue; /* Loop/switch isn't completed */
        }
        WidgetSettingBean widgetsettingbean1 = b;
        if (com.gau.go.launcherex.gowidget.weather.util.r.a(bundle, "auto_location") == 1)
        {
            flag = flag3;
        } else
        {
            flag = false;
        }
        widgetsettingbean1.i = flag;
        if (b.i) goto _L4; else goto _L3
_L3:
        h();
        return;
        if (!bundle.containsKey("dynamic_icon_gowidget")) goto _L4; else goto _L5
_L5:
        WidgetSettingBean widgetsettingbean2 = b;
        boolean flag1;
        if (com.gau.go.launcherex.gowidget.weather.util.r.a(bundle, "dynamic_icon_gowidget") == 1)
        {
            flag1 = flag4;
        } else
        {
            flag1 = false;
        }
        widgetsettingbean2.g = flag1;
        return;
    }

    private void a(WidgetSettingBean widgetsettingbean, List list, String s1)
    {
        b = widgetsettingbean;
        mWidgetScrollGroup.a(b.f);
        a = q.d();
        widgetsettingbean = d;
        boolean flag;
        if (a && b.h)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        widgetsettingbean.a(flag);
        d.d(b.c);
        a(list);
        f();
        a(q.e());
    }

    static void a(WeatherWidget41Style2 weatherwidget41style2, Bundle bundle)
    {
        weatherwidget41style2.a(bundle);
    }

    static void a(WeatherWidget41Style2 weatherwidget41style2, WidgetSettingBean widgetsettingbean, List list, String s1)
    {
        weatherwidget41style2.a(widgetsettingbean, list, s1);
    }

    private void a(List list)
    {
        j = false;
        if (!list.isEmpty())
        {
            mWidgetScrollGroup.removeAllViews();
            for (list = list.iterator(); list.hasNext(); a((WeatherBean)list.next())) { }
        } else
        {
            i = true;
            list = new Intent("com.gau.go.launcherex.gowidget.weather.service.NotifyService");
            list.putExtra("notify_request", 50);
            getContext().startService(list);
        }
        j();
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            f.setVisibility(0);
            g.startAnimation(AnimationUtils.loadAnimation(getContext(), 0x7f04002c));
            return;
        } else
        {
            f.setVisibility(8);
            return;
        }
    }

    static boolean a(WeatherWidget41Style2 weatherwidget41style2, boolean flag)
    {
        weatherwidget41style2.h = flag;
        return flag;
    }

    private boolean a(String s1)
    {
        String s2 = getContext().getPackageName().substring("com.gau.go.launcherex.gowidget.".length());
        Object obj = (new StringBuilder()).append("widget_").append(s2).append(".xml").toString();
        Object obj1 = com.gau.go.launcherex.gowidget.weather.theme.d.a(getContext(), s1, ((String) (obj)));
        obj = obj1;
        if (obj1 == null)
        {
            obj = (new StringBuilder()).append("widget_").append(s2).toString();
            obj = com.gau.go.launcherex.gowidget.weather.theme.d.b(getContext(), w, ((String) (obj)));
        }
        if (obj == null)
        {
            return false;
        }
        obj1 = com.gau.go.launcherex.gowidget.weather.theme.d.a(((InputStream) (obj)));
        v = new a();
        v.a = s1;
        v.a("widget_style", String.valueOf(x));
        v.a("widget_theme_type", String.valueOf(y));
        if (obj1 != null)
        {
            (new b()).a(((org.xmlpull.v1.XmlPullParser) (obj1)), v);
        }
        try
        {
            ((InputStream) (obj)).close();
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        z = getContext().getPackageManager().getResourcesForApplication(s1);
        v.b = z;
        obj1 = v.a("gw_weather_41_bg");
        obj = null;
        try
        {
            if (!TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                obj = com.gau.go.launcherex.gowidget.weather.theme.b.a(z, ((String) (obj1)), s1);
            }
            mWidgetScrollGroup.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
            for (s1 = mWidgetScrollGroup.b().iterator(); s1.hasNext(); ((ay)s1.next()).a(v)) { }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
        }
        mWidgetScrollGroup.requestLayout();
        return true;
    }

    static int b(WeatherWidget41Style2 weatherwidget41style2, int i1)
    {
        weatherwidget41style2.m = i1;
        return i1;
    }

    static e b(WeatherWidget41Style2 weatherwidget41style2)
    {
        return weatherwidget41style2.q;
    }

    private void b()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.TIME_TICK");
        intentfilter.addAction("android.intent.action.TIME_SET");
        intentfilter.addAction("android.intent.action.DATE_CHANGED");
        intentfilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentfilter.addAction("android.intent.action.SCREEN_OFF");
        intentfilter.addAction("android.intent.action.SCREEN_ON");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_INITIALIZED_CITY");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_REFRESH_STARTED");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_RELOAD_DATA");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATA_READY");
        intentfilter.setPriority(1008);
        getContext().registerReceiver(D, intentfilter);
        intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.PACKAGE_DATA_CLEARED");
        intentfilter.addDataScheme("package");
        getContext().registerReceiver(E, intentfilter);
        C = new PackageChangeReceiver();
        intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentfilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentfilter.addDataScheme("package");
        getContext().registerReceiver(C, intentfilter);
    }

    static void b(WeatherWidget41Style2 weatherwidget41style2, boolean flag)
    {
        weatherwidget41style2.b(flag);
    }

    private void b(String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            Message message = k.obtainMessage();
            message.what = 3;
            message.obj = s1;
            k.sendMessage(message);
        }
    }

    private void b(boolean flag)
    {
        for (Iterator iterator = mWidgetScrollGroup.b().iterator(); iterator.hasNext(); ((ay)iterator.next()).a(flag)) { }
    }

    static boolean b(WeatherWidget41Style2 weatherwidget41style2, String s1)
    {
        return weatherwidget41style2.a(s1);
    }

    static int c(WeatherWidget41Style2 weatherwidget41style2)
    {
        return weatherwidget41style2.c;
    }

    private void c()
    {
        for (Iterator iterator = mWidgetScrollGroup.b().iterator(); iterator.hasNext(); ((ay)iterator.next()).j()) { }
    }

    private void c(boolean flag)
    {
        b.h = flag;
        if (b.h && !a)
        {
            return;
        } else
        {
            d.a(b.h);
            j();
            return;
        }
    }

    static boolean c(WeatherWidget41Style2 weatherwidget41style2, boolean flag)
    {
        weatherwidget41style2.i = flag;
        return flag;
    }

    private void d()
    {
        if (h)
        {
            ay ay1;
            for (Iterator iterator = mWidgetScrollGroup.b().iterator(); iterator.hasNext(); ay1.h())
            {
                ay1 = (ay)iterator.next();
                ay1.i();
                ay1.f();
                ay1.a = false;
            }

        }
    }

    private void d(boolean flag)
    {
        mWidgetScrollGroup.a(flag);
    }

    static boolean d(WeatherWidget41Style2 weatherwidget41style2)
    {
        return weatherwidget41style2.u;
    }

    static boolean d(WeatherWidget41Style2 weatherwidget41style2, boolean flag)
    {
        weatherwidget41style2.n = flag;
        return flag;
    }

    private void e()
    {
        n = true;
        mWidgetScrollGroup.removeAllViews();
        a(((WeatherBean) (null)));
    }

    static void e(WeatherWidget41Style2 weatherwidget41style2)
    {
        weatherwidget41style2.d();
    }

    static void e(WeatherWidget41Style2 weatherwidget41style2, boolean flag)
    {
        weatherwidget41style2.a(flag);
    }

    static g f(WeatherWidget41Style2 weatherwidget41style2)
    {
        return weatherwidget41style2.d;
    }

    private void f()
    {
        try
        {
            l = q.a(c);
        }
        catch (RemoteException remoteexception)
        {
            remoteexception.printStackTrace();
        }
        if (!TextUtils.isEmpty(l))
        {
            i();
        }
    }

    private void g()
    {
        int j1 = mWidgetScrollGroup.getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((ay)mWidgetScrollGroup.getChildAt(i1)).g();
        }

    }

    static void g(WeatherWidget41Style2 weatherwidget41style2)
    {
        weatherwidget41style2.j();
    }

    private void h()
    {
        ArrayList arraylist;
        Iterator iterator;
        arraylist = mWidgetScrollGroup.b();
        iterator = arraylist.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        ay ay1 = (ay)iterator.next();
        if (ay1.b().e() == 1) goto _L4; else goto _L3
_L3:
        if (ay1 == null) goto _L6; else goto _L5
_L5:
        if (ay1.b().e() != 3 && arraylist.size() != 1) goto _L8; else goto _L7
_L7:
        ay1.b().a(1);
_L6:
        return;
_L8:
        int i1;
        View view = mWidgetScrollGroup.getChildAt(m);
        mWidgetScrollGroup.removeView(ay1);
        mWidgetScrollGroup.a();
        i1 = mWidgetScrollGroup.indexOfChild(view);
        if (i1 == -1) goto _L6; else goto _L9
_L9:
        mWidgetScrollGroup.a(i1);
        return;
_L2:
        ay1 = null;
        if (true) goto _L3; else goto _L10
_L10:
    }

    static boolean h(WeatherWidget41Style2 weatherwidget41style2)
    {
        return weatherwidget41style2.n;
    }

    private void i()
    {
        int k1 = mWidgetScrollGroup.getChildCount();
        if (k1 >= 1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i1 = 0;
_L5:
        WeatherBean weatherbean;
        if (i1 >= k1)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        weatherbean = ((ay)mWidgetScrollGroup.getChildAt(i1)).b();
        if (weatherbean == null || TextUtils.isEmpty(weatherbean.c()) || !weatherbean.c().equals(l)) goto _L4; else goto _L3
_L3:
        int j1 = i1;
        if (i1 == -1)
        {
            j1 = m % k1;
        }
        if (k1 > 0 && j1 < k1)
        {
            mWidgetScrollGroup.a(j1);
            m = j1;
            return;
        }
          goto _L1
_L4:
        i1++;
          goto _L5
        i1 = -1;
          goto _L3
    }

    static boolean i(WeatherWidget41Style2 weatherwidget41style2)
    {
        return weatherwidget41style2.A;
    }

    static ServiceConnection j(WeatherWidget41Style2 weatherwidget41style2)
    {
        return weatherwidget41style2.s;
    }

    private void j()
    {
        ay ay1;
        for (Iterator iterator = mWidgetScrollGroup.b().iterator(); iterator.hasNext(); ay1.e())
        {
            ay1 = (ay)iterator.next();
            ay1.a = true;
        }

    }

    private void k()
    {
        for (Iterator iterator = mWidgetScrollGroup.b().iterator(); iterator.hasNext(); ((ay)iterator.next()).h()) { }
    }

    static void k(WeatherWidget41Style2 weatherwidget41style2)
    {
        weatherwidget41style2.e();
    }

    static bi l(WeatherWidget41Style2 weatherwidget41style2)
    {
        return weatherwidget41style2.k;
    }

    private void l()
    {
        r = new bh(this);
    }

    static String m(WeatherWidget41Style2 weatherwidget41style2)
    {
        return weatherwidget41style2.t;
    }

    private void m()
    {
        Iterator iterator = mWidgetScrollGroup.b().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ay ay1 = (ay)iterator.next();
            if (ay1.d())
            {
                mWidgetScrollGroup.removeView(ay1);
            }
        } while (true);
        mWidgetScrollGroup.a();
    }

    static String n(WeatherWidget41Style2 weatherwidget41style2)
    {
        return weatherwidget41style2.w;
    }

    static void o(WeatherWidget41Style2 weatherwidget41style2)
    {
        weatherwidget41style2.k();
    }

    static bj p(WeatherWidget41Style2 weatherwidget41style2)
    {
        return weatherwidget41style2.p;
    }

    static void q(WeatherWidget41Style2 weatherwidget41style2)
    {
        weatherwidget41style2.i();
    }

    static void r(WeatherWidget41Style2 weatherwidget41style2)
    {
        weatherwidget41style2.m();
    }

    static String s(WeatherWidget41Style2 weatherwidget41style2)
    {
        return weatherwidget41style2.l;
    }

    static int t(WeatherWidget41Style2 weatherwidget41style2)
    {
        return weatherwidget41style2.m;
    }

    public com.gau.go.launcherex.gowidget.weather.widget.dynamicicon.a getDynamicIconManager()
    {
        return e;
    }

    public g getTimeManager()
    {
        return d;
    }

    public int getWidgetId()
    {
        return c;
    }

    public void gotoCalendar()
    {
        o.a(b.e);
    }

    public void gotoClock()
    {
        o.b(b.d);
    }

    public void gotoThemeStore()
    {
        com.gau.go.launcherex.gowidget.weather.view.t.a(getContext(), 20);
    }

    public boolean isLoadingDatas()
    {
        return j;
    }

    public boolean isLocatingCity()
    {
        return i;
    }

    public boolean onApplyTheme(Bundle bundle)
    {
        B = true;
        String s1 = bundle.getString("gowidget_theme");
        x = bundle.getInt("gowidget_type");
        y = bundle.getInt("gowidget_themeid");
        c = bundle.getInt("gowidget_Id");
        if (y == 1)
        {
            y = 0;
        }
        if (A)
        {
            if (s1.equals(getContext().getPackageName()) || "app_widget_theme_white".equals(s1) || "app_widget_theme_black".equals(s1))
            {
                w = getContext().getPackageName();
                bundle = "app_widget_theme_white";
                y = 0;
            } else
            {
                w = s1;
                bundle = s1;
            }
            if (!com.gau.go.launcherex.gowidget.weather.e.h.a(getContext(), c, bundle))
            {
                return false;
            }
        } else
        {
            bundle = com.gau.go.launcherex.gowidget.weather.e.h.a(getContext(), c);
            if (!TextUtils.isEmpty(bundle))
            {
                if (bundle.equals("app_widget_theme_white"))
                {
                    w = getContext().getPackageName();
                    y = 0;
                } else
                if (bundle.equals("app_widget_theme_black"))
                {
                    w = getContext().getPackageName();
                    y = 0;
                } else
                {
                    w = bundle;
                    y = 0;
                }
            } else
            {
                w = s1;
            }
        }
        return a(w);
    }

    public void onBillingStatusChange(boolean flag)
    {
        a = flag;
        b.h = a;
        d.a(a);
        j();
    }

    public void onClick(View view)
    {
        if (view.equals(g))
        {
            Log.i("wss", "WeatherWidget41Style2_onClick");
            com.gau.go.launcherex.gowidget.weather.view.t.a(getContext(), 31);
        }
    }

    public void onDelete(int i1)
    {
        super.onDelete(i1);
        com.gau.go.launcherex.gowidget.weather.e.h.b(getContext(), c);
        if (q == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        q.b(c);
        return;
        RemoteException remoteexception;
        remoteexception;
        remoteexception.printStackTrace();
        return;
    }

    public void onEnter(int i1)
    {
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mWidgetScrollGroup = (WidgetScrollGroup)findViewById(0x7f09055c);
        mWidgetScrollGroup.a(this);
        f = findViewById(0x7f090123);
        g = findViewById(0x7f090124);
        g.setOnClickListener(this);
        b();
        a(((WeatherBean) (null)));
    }

    public void onLanguageChanged(Resources resources)
    {
        super.onLanguageChanged(resources);
        c();
    }

    public void onLeave(int i1)
    {
    }

    public boolean onLongClick(View view)
    {
        if (!mWidgetScrollGroup.getScreenScroller().d())
        {
            return false;
        } else
        {
            performLongClick();
            return true;
        }
    }

    public void onPause(int i1)
    {
    }

    public void onRemove(int i1)
    {
        super.onRemove(i1);
        d.b();
        getContext().unregisterReceiver(D);
        getContext().unregisterReceiver(E);
        getContext().unregisterReceiver(C);
        try
        {
            q.b(r);
            getContext().unbindService(s);
            return;
        }
        catch (RemoteException remoteexception)
        {
            remoteexception.printStackTrace();
        }
    }

    public void onResume(int i1)
    {
    }

    public void onScrollGroupChange(WidgetScrollGroup widgetscrollgroup, int i1)
    {
    }

    public void onScrollGroupFinishScroll(WidgetScrollGroup widgetscrollgroup, int i1)
    {
        m = i1;
        widgetscrollgroup = (ay)widgetscrollgroup.getChildAt(i1);
        if (widgetscrollgroup == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        widgetscrollgroup = widgetscrollgroup.b();
        if (widgetscrollgroup == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        l = widgetscrollgroup.c();
        if (q == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        q.a(5, c, l);
        return;
        widgetscrollgroup;
        widgetscrollgroup.printStackTrace();
        return;
    }

    public void onScrollGroupStartScroll(WidgetScrollGroup widgetscrollgroup, int i1)
    {
    }

    public void onStart(Bundle bundle)
    {
        A = true;
        if (bundle != null)
        {
            u = bundle.getBoolean("gowidget_add_to_screen");
            c = bundle.getInt("gowidget_Id");
            getContext().bindService(new Intent(getContext(), com/gau/go/launcherex/gowidget/weather/service/WeatherService), s, 1);
            if (!B)
            {
                bundle = com.gau.go.launcherex.gowidget.weather.e.h.a(getContext(), c);
                if (TextUtils.isEmpty(bundle))
                {
                    w = getContext().getPackageName();
                    y = 0;
                } else
                if (bundle.equals("app_widget_theme_white"))
                {
                    w = getContext().getPackageName();
                    y = 0;
                } else
                if (bundle.equals("app_widget_theme_black"))
                {
                    w = getContext().getPackageName();
                    y = 0;
                } else
                {
                    w = bundle;
                    y = 0;
                }
                a(w);
                return;
            }
        }
    }

    public void refreshWeather()
    {
        Object obj = mWidgetScrollGroup.b();
        if (((ArrayList) (obj)).size() != 1 || ((ay)((ArrayList) (obj)).get(0)).b() != null)
        {
            ArrayList arraylist = new ArrayList();
            obj = ((ArrayList) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                WeatherBean weatherbean = ((ay)((Iterator) (obj)).next()).b();
                if (weatherbean != null)
                {
                    RequestBean requestbean = new RequestBean();
                    requestbean.a(weatherbean.c(), weatherbean.d(), weatherbean.l.g());
                    arraylist.add(requestbean);
                }
            } while (true);
            if (!arraylist.isEmpty())
            {
                Intent intent = new Intent("com.gau.go.launcherex.gowidget.weather.service.NotifyService");
                intent.putExtra("notify_request", 22);
                intent.putParcelableArrayListExtra("req_arg", arraylist);
                getContext().startService(intent);
                return;
            }
        }
    }

    private class PackageChangeReceiver extends BroadcastReceiver
    {

        final WeatherWidget41Style2 a;

        public void onReceive(Context context, Intent intent)
        {
label0:
            {
                context = intent.getAction();
                if (context.equals("android.intent.action.PACKAGE_ADDED") || context.equals("android.intent.action.PACKAGE_REMOVED"))
                {
                    context = intent.getDataString();
                    if (!TextUtils.isEmpty(context) && !context.equals("com.gau.go.launcherex.gowidget.weatherwidget"))
                    {
                        break label0;
                    }
                }
                return;
            }
            WeatherWidget41Style2.l(a).sendEmptyMessage(7);
        }

        public PackageChangeReceiver()
        {
            a = WeatherWidget41Style2.this;
            super();
        }
    }

}
