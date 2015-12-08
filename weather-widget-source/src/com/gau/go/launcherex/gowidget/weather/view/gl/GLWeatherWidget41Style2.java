// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view.gl;

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
import android.view.MotionEvent;
import com.gau.go.launcherex.gowidget.framework.GLGoWidgetFrame;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.e.h;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.RequestBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.WidgetSettingBean;
import com.gau.go.launcherex.gowidget.weather.scroller.GLWidgetScrollGroup;
import com.gau.go.launcherex.gowidget.weather.scroller.e;
import com.gau.go.launcherex.gowidget.weather.service.WeatherService;
import com.gau.go.launcherex.gowidget.weather.systemwidget.m;
import com.gau.go.launcherex.gowidget.weather.theme.a;
import com.gau.go.launcherex.gowidget.weather.theme.b;
import com.gau.go.launcherex.gowidget.weather.theme.d;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.gau.go.launcherex.gowidget.weather.view.t;
import com.go.gl.animation.Translate3DAnimation;
import com.go.gl.view.GLView;
import com.go.gowidget.core.WidgetCallback;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view.gl:
//            g, d, e, GLWeather41Style2, 
//            c, h, f

public class GLWeatherWidget41Style2 extends GLGoWidgetFrame
    implements e, com.go.gl.view.GLView.OnClickListener, com.go.gl.view.GLView.OnLongClickListener
{

    private final BroadcastReceiver A = new com.gau.go.launcherex.gowidget.weather.view.gl.d(this);
    private final BroadcastReceiver B = new com.gau.go.launcherex.gowidget.weather.view.gl.e(this);
    private int a;
    private g b;
    private GLWidgetScrollGroup c;
    private GLView d;
    private GLView e;
    private Translate3DAnimation f;
    private boolean g;
    private boolean h;
    private boolean i;
    private final com.gau.go.launcherex.gowidget.weather.view.gl.g j = new com.gau.go.launcherex.gowidget.weather.view.gl.g(this);
    private String k;
    private int l;
    private boolean m;
    boolean mIsPro;
    WidgetSettingBean mSettings;
    private m n;
    private com.gau.go.launcherex.gowidget.weather.view.gl.h o;
    private com.gau.go.launcherex.gowidget.weather.service.e p;
    private com.gau.go.launcherex.gowidget.weather.service.b q;
    private ServiceConnection r;
    private boolean s;
    private a t;
    private String u;
    private int v;
    private int w;
    private Resources x;
    private boolean y;
    private boolean z;

    public GLWeatherWidget41Style2(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 0;
        g = true;
        h = false;
        i = true;
        r = null;
        mSettings = new WidgetSettingBean();
        t = null;
        u = "";
        v = 5;
        w = 0;
        x = null;
        a();
    }

    private GLWeather41Style2 a(WeatherBean weatherbean)
    {
        GLWeather41Style2 glweather41style2 = new GLWeather41Style2(mContext);
        glweather41style2.setWidgetView(this);
        glweather41style2.setOnLongClickListener(this);
        glweather41style2.setWeatherBean(weatherbean);
        glweather41style2.updateAllViews();
        if (t != null)
        {
            glweather41style2.onApplyTheme(t);
        }
        c.addView(glweather41style2);
        c.notifyViewsChanged();
        return glweather41style2;
    }

    private void a()
    {
        r = new c(this);
        o = new com.gau.go.launcherex.gowidget.weather.view.gl.h(this);
        n();
        b = new g(mContext);
        u = mContext.getPackageName();
        n = new m(mContext);
        f = new Translate3DAnimation(1, 0.0F, 1, 0.0F, 1, 1.0F, 1, 0.0F, 1, 0.0F, 1, 0.0F);
        f.setDuration(500L);
        getContext().startService(new Intent("com.gau.go.launcherex.gowidget.weather.service.NotifyService"));
    }

    private void a(int i1)
    {
        b.d(i1);
        int j1 = c.getChildCount();
        for (i1 = 0; i1 < j1; i1++)
        {
            ((GLWeather41Style2)c.getChildAt(i1)).updateDateWeek();
        }

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
            WidgetSettingBean widgetsettingbean = mSettings;
            if (com.gau.go.launcherex.gowidget.weather.util.r.a(bundle, "isCycle") == 1)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            widgetsettingbean.f = flag;
            d(mSettings.f);
            return;
        }
        if (bundle.containsKey("tempUnit"))
        {
            mSettings.a = com.gau.go.launcherex.gowidget.weather.util.r.a(bundle, "tempUnit");
            f();
            return;
        }
        if (bundle.containsKey("widgt_calendar"))
        {
            mSettings.e = bundle.getString("widgt_calendar");
            return;
        }
        if (bundle.containsKey("widgt_clock"))
        {
            mSettings.d = bundle.getString("widgt_clock");
            return;
        }
        if (bundle.containsKey("go_widget_theme"))
        {
            u = bundle.getString("go_widget_theme");
            b(u);
            return;
        }
        if (!bundle.containsKey("auto_location"))
        {
            continue; /* Loop/switch isn't completed */
        }
        WidgetSettingBean widgetsettingbean1 = mSettings;
        if (com.gau.go.launcherex.gowidget.weather.util.r.a(bundle, "auto_location") == 1)
        {
            flag = flag3;
        } else
        {
            flag = false;
        }
        widgetsettingbean1.i = flag;
        if (mSettings.i) goto _L4; else goto _L3
_L3:
        g();
        return;
        if (!bundle.containsKey("dynamic_icon_gowidget")) goto _L4; else goto _L5
_L5:
        WidgetSettingBean widgetsettingbean2 = mSettings;
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
        mSettings = widgetsettingbean;
        c.setCycleMode(mSettings.f);
        mIsPro = p.d();
        widgetsettingbean = b;
        boolean flag;
        if (mIsPro && mSettings.h)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        widgetsettingbean.a(flag);
        b.d(mSettings.c);
        a(list);
        h();
        a(p.e());
    }

    private void a(GLWeather41Style2 glweather41style2)
    {
        if (glweather41style2 != null)
        {
            glweather41style2.cleanup();
        }
    }

    private void a(List list)
    {
        i = false;
        if (!list.isEmpty())
        {
            m();
            for (list = list.iterator(); list.hasNext(); a((WeatherBean)list.next())) { }
        } else
        {
            h = true;
            list = new Intent("com.gau.go.launcherex.gowidget.weather.service.NotifyService");
            list.putExtra("notify_request", 50);
            mContext.startService(list);
        }
        j();
    }

    private void a(boolean flag)
    {
        Log.e("zyz", (new StringBuilder()).append("showStarView isShow:").append(flag).toString());
        if (flag)
        {
            d.setVisibility(0);
            e.startAnimation(f);
            return;
        } else
        {
            d.setVisibility(8);
            return;
        }
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
            obj = com.gau.go.launcherex.gowidget.weather.theme.d.b(getContext(), u, ((String) (obj)));
        }
        if (obj == null)
        {
            return false;
        }
        obj1 = com.gau.go.launcherex.gowidget.weather.theme.d.a(((InputStream) (obj)));
        t = new a();
        t.a = s1;
        t.a("widget_style", String.valueOf(v));
        t.a("widget_theme_type", String.valueOf(w));
        if (obj1 != null)
        {
            (new b()).a(((org.xmlpull.v1.XmlPullParser) (obj1)), t);
        }
        try
        {
            ((InputStream) (obj)).close();
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        x = getContext().getPackageManager().getResourcesForApplication(s1);
        t.b = x;
        obj1 = t.a("gw_weather_41_bg");
        obj = null;
        try
        {
            if (!TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                obj = com.gau.go.launcherex.gowidget.weather.theme.b.a(x, ((String) (obj1)), s1);
            }
            c.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
            for (s1 = c.getCitys().iterator(); s1.hasNext(); ((GLWeather41Style2)s1.next()).onApplyTheme(t)) { }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
        }
        c.requestLayout();
        return true;
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
        getContext().registerReceiver(A, intentfilter);
        intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.PACKAGE_DATA_CLEARED");
        intentfilter.addDataScheme("package");
        getContext().registerReceiver(B, intentfilter);
    }

    private void b(String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            Message message = j.obtainMessage();
            message.what = 3;
            message.obj = s1;
            j.sendMessage(message);
        }
    }

    private void b(boolean flag)
    {
        int j1 = c.getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((GLWeather41Style2)c.getChildAt(i1)).showProgerssView(flag);
        }

    }

    private void c()
    {
        for (Iterator iterator = c.getCitys().iterator(); iterator.hasNext(); ((GLWeather41Style2)iterator.next()).notifyLanguageChanged()) { }
    }

    private void c(boolean flag)
    {
        Message message = j.obtainMessage();
        message.what = 2;
        message.obj = Boolean.valueOf(flag);
        j.sendMessage(message);
    }

    private void d()
    {
        if (g)
        {
            int j1 = c.getChildCount();
            for (int i1 = 0; i1 < j1; i1++)
            {
                GLWeather41Style2 glweather41style2 = (GLWeather41Style2)c.getChildAt(i1);
                glweather41style2.updateTime();
                glweather41style2.updateDateWeek();
                glweather41style2.mAnimationWeatherIcon = false;
                glweather41style2.updateWeatherIcon();
            }

        }
    }

    private void d(boolean flag)
    {
        c.setCycleMode(flag);
    }

    private void e()
    {
        m = true;
        m();
        a(((WeatherBean) (null)));
    }

    private void f()
    {
        int j1 = c.getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((GLWeather41Style2)c.getChildAt(i1)).updateNowTemp();
        }

    }

    private void g()
    {
        ArrayList arraylist;
        Iterator iterator;
        arraylist = c.getCitys();
        iterator = arraylist.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        GLWeather41Style2 glweather41style2 = (GLWeather41Style2)iterator.next();
        if (glweather41style2.getWeatherBean().e() == 1) goto _L4; else goto _L3
_L3:
        if (glweather41style2 == null) goto _L6; else goto _L5
_L5:
        if (glweather41style2.getWeatherBean().e() != 3 && arraylist.size() != 1) goto _L8; else goto _L7
_L7:
        glweather41style2.getWeatherBean().a(1);
_L6:
        return;
_L8:
        int i1;
        GLView glview = c.getChildAt(l);
        c.removeView(glweather41style2);
        c.notifyViewsChanged();
        i1 = c.indexOfChild(glview);
        if (i1 == -1) goto _L6; else goto _L9
_L9:
        c.setCurScreen(i1);
        return;
_L2:
        glweather41style2 = null;
        if (true) goto _L3; else goto _L10
_L10:
    }

    private void h()
    {
        try
        {
            k = p.a(a);
        }
        catch (RemoteException remoteexception)
        {
            remoteexception.printStackTrace();
        }
        if (!TextUtils.isEmpty(k))
        {
            i();
        }
    }

    private void i()
    {
        int k1 = c.getChildCount();
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
        weatherbean = ((GLWeather41Style2)c.getChildAt(i1)).getWeatherBean();
        if (weatherbean == null || TextUtils.isEmpty(weatherbean.c()) || !weatherbean.c().equals(k)) goto _L4; else goto _L3
_L3:
        int j1 = i1;
        if (i1 == -1)
        {
            j1 = l % k1;
        }
        if (k1 > 0 && j1 < k1)
        {
            c.setCurScreen(j1);
            l = j1;
            return;
        }
          goto _L1
_L4:
        i1++;
          goto _L5
        i1 = -1;
          goto _L3
    }

    private void j()
    {
        int j1 = c.getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            GLWeather41Style2 glweather41style2 = (GLWeather41Style2)c.getChildAt(i1);
            glweather41style2.mAnimationWeatherIcon = true;
            glweather41style2.updateAllViews();
        }

    }

    private void k()
    {
        for (Iterator iterator = c.getCitys().iterator(); iterator.hasNext(); ((GLWeather41Style2)iterator.next()).updateWeatherIcon()) { }
    }

    private void l()
    {
        if (c != null)
        {
            c.setEventListener(null);
        }
        if (e != null)
        {
            e.setOnClickListener(null);
        }
    }

    private void m()
    {
        int j1 = c.getChildCount();
        Object obj = new ArrayList(j1);
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((ArrayList) (obj)).add(c.getChildAt(i1));
        }

        c.removeAllViews();
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a((GLWeather41Style2)(GLView)((Iterator) (obj)).next())) { }
    }

    private void n()
    {
        q = new f(this);
    }

    private void o()
    {
        Iterator iterator = c.getCitys().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            GLWeather41Style2 glweather41style2 = (GLWeather41Style2)iterator.next();
            if (glweather41style2.isEmptyCity())
            {
                c.removeView(glweather41style2);
            }
        } while (true);
        c.notifyViewsChanged();
    }

    public void cleanup()
    {
        super.cleanup();
        l();
    }

    public GLView getContentView()
    {
        return this;
    }

    public g getTimeManager()
    {
        return b;
    }

    public int getVersion()
    {
        return 0;
    }

    public int getWidgetId()
    {
        return a;
    }

    public void gotoCalendar()
    {
        n.a(mSettings.e);
    }

    public void gotoClock()
    {
        n.b(mSettings.d);
    }

    public void gotoThemeStore()
    {
        com.gau.go.launcherex.gowidget.weather.view.t.a(mContext, 20);
    }

    public boolean isLoadingDatas()
    {
        return i;
    }

    public boolean isLocatingCity()
    {
        return h;
    }

    public boolean onActivate(boolean flag, Bundle bundle)
    {
        return false;
    }

    public boolean onApplyTheme(Bundle bundle)
    {
        z = true;
        String s1 = bundle.getString("gowidget_theme");
        v = bundle.getInt("gowidget_type");
        w = bundle.getInt("gowidget_themeid");
        a = bundle.getInt("gowidget_Id");
        if (w == 1)
        {
            w = 0;
        }
        if (y)
        {
            if (s1.equals(getContext().getPackageName()) || "app_widget_theme_white".equals(s1) || "app_widget_theme_black".equals(s1))
            {
                u = getContext().getPackageName();
                bundle = "app_widget_theme_white";
                w = 0;
            } else
            {
                u = s1;
                bundle = s1;
            }
            if (!com.gau.go.launcherex.gowidget.weather.e.h.a(getContext(), a, bundle))
            {
                return false;
            }
        } else
        {
            bundle = com.gau.go.launcherex.gowidget.weather.e.h.a(getContext(), a);
            if (!TextUtils.isEmpty(bundle))
            {
                if (bundle.equals("app_widget_theme_white"))
                {
                    u = getContext().getPackageName();
                    w = 0;
                } else
                if (bundle.equals("app_widget_theme_black"))
                {
                    u = getContext().getPackageName();
                    w = 0;
                } else
                {
                    u = bundle;
                    w = 0;
                }
            } else
            {
                u = s1;
            }
        }
        return a(u);
    }

    public void onBillingStatusChange(boolean flag)
    {
        mIsPro = flag;
        mSettings.h = mIsPro;
        b.a(mIsPro);
        j();
    }

    public void onClearMemory()
    {
    }

    public void onClick(GLView glview)
    {
        if (glview.equals(e))
        {
            Log.i("wss", "GLWeatherWidget41Style2_onClick");
            com.gau.go.launcherex.gowidget.weather.view.t.a(mContext, 31);
        }
    }

    public boolean onDeactivate(boolean flag, Bundle bundle)
    {
        return false;
    }

    public void onDelete()
    {
        super.onDelete();
        com.gau.go.launcherex.gowidget.weather.e.h.b(mContext, a);
        if (p == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        p.b(a);
        return;
        RemoteException remoteexception;
        remoteexception;
        remoteexception.printStackTrace();
        return;
    }

    public void onEnter()
    {
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        c = (GLWidgetScrollGroup)findViewById(0x7f09055c);
        c.setEventListener(this);
        d = findViewById(0x7f090123);
        e = findViewById(0x7f090124);
        e.setOnClickListener(this);
        b();
        a(((WeatherBean) (null)));
    }

    public void onLanguageChanged(Resources resources)
    {
        super.onLanguageChanged(resources);
        c();
    }

    public void onLeave()
    {
        j.sendEmptyMessage(5);
    }

    public boolean onLongClick(GLView glview)
    {
        if (!c.getScreenScroller().d())
        {
            return false;
        } else
        {
            performLongClick();
            return true;
        }
    }

    public void onRemove()
    {
        super.onRemove();
        b.b();
        mContext.unregisterReceiver(A);
        mContext.unregisterReceiver(B);
    }

    public void onScrollGroupChange(GLWidgetScrollGroup glwidgetscrollgroup, int i1)
    {
    }

    public void onScrollGroupFinishScroll(GLWidgetScrollGroup glwidgetscrollgroup, int i1)
    {
        l = i1;
        glwidgetscrollgroup = (GLWeather41Style2)glwidgetscrollgroup.getChildAt(i1);
        if (glwidgetscrollgroup == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        glwidgetscrollgroup = glwidgetscrollgroup.getWeatherBean();
        if (glwidgetscrollgroup == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        k = glwidgetscrollgroup.c();
        if (p == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        p.a(5, a, k);
        return;
        glwidgetscrollgroup;
        glwidgetscrollgroup.printStackTrace();
        return;
    }

    public void onScrollGroupStartScroll(GLWidgetScrollGroup glwidgetscrollgroup, int i1)
    {
    }

    public void onStart(Bundle bundle)
    {
        y = true;
        if (bundle != null)
        {
            s = bundle.getBoolean("gowidget_add_to_screen");
            a = bundle.getInt("gowidget_Id");
            mContext.bindService(new Intent(mContext, com/gau/go/launcherex/gowidget/weather/service/WeatherService), r, 1);
            if (!z)
            {
                bundle = com.gau.go.launcherex.gowidget.weather.e.h.a(mContext, a);
                if (TextUtils.isEmpty(bundle))
                {
                    u = mContext.getPackageName();
                    w = 0;
                } else
                if (bundle.equals("app_widget_theme_white"))
                {
                    u = mContext.getPackageName();
                    w = 0;
                } else
                if (bundle.equals("app_widget_theme_black"))
                {
                    u = mContext.getPackageName();
                    w = 0;
                } else
                {
                    u = bundle;
                    w = 0;
                }
                a(u);
                return;
            }
        }
    }

    public void onStop()
    {
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return true;
    }

    public void refreshWeather()
    {
        if (c.getChildCount() != 1 || ((GLWeather41Style2)c.getChildAt(0)).getWeatherBean() != null)
        {
            ArrayList arraylist = new ArrayList();
            Iterator iterator = c.getCitys().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                WeatherBean weatherbean = ((GLWeather41Style2)iterator.next()).getWeatherBean();
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
                mContext.startService(intent);
                return;
            }
        }
    }

    public void setWidgetCallback(WidgetCallback widgetcallback)
    {
    }



/*
    static com.gau.go.launcherex.gowidget.weather.service.e access$002(GLWeatherWidget41Style2 glweatherwidget41style2, com.gau.go.launcherex.gowidget.weather.service.e e1)
    {
        glweatherwidget41style2.p = e1;
        return e1;
    }

*/



/*
    static boolean access$1002(GLWeatherWidget41Style2 glweatherwidget41style2, boolean flag)
    {
        glweatherwidget41style2.h = flag;
        return flag;
    }

*/




/*
    static boolean access$1202(GLWeatherWidget41Style2 glweatherwidget41style2, boolean flag)
    {
        glweatherwidget41style2.m = flag;
        return flag;
    }

*/









/*
    static String access$1902(GLWeatherWidget41Style2 glweatherwidget41style2, String s1)
    {
        glweatherwidget41style2.u = s1;
        return s1;
    }

*/



/*
    static int access$2002(GLWeatherWidget41Style2 glweatherwidget41style2, int i1)
    {
        glweatherwidget41style2.w = i1;
        return i1;
    }

*/











/*
    static int access$2902(GLWeatherWidget41Style2 glweatherwidget41style2, int i1)
    {
        glweatherwidget41style2.l = i1;
        return i1;
    }

*/







/*
    static boolean access$702(GLWeatherWidget41Style2 glweatherwidget41style2, boolean flag)
    {
        glweatherwidget41style2.g = flag;
        return flag;
    }

*/


}
