// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view.gl;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.format.Time;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.WidgetSettingBean;
import com.gau.go.launcherex.gowidget.weather.theme.a;
import com.gau.go.launcherex.gowidget.weather.theme.b;
import com.gau.go.launcherex.gowidget.weather.util.c;
import com.gau.go.launcherex.gowidget.weather.util.p;
import com.gau.go.launcherex.gowidget.weather.util.q;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.gau.go.launcherex.gowidget.weather.view.bl;
import com.go.gl.animation.Animation;
import com.go.gl.animation.Translate3DAnimation;
import com.go.gl.graphics.GLDrawable;
import com.go.gl.view.GLView;
import com.go.gl.widget.GLImageView;
import com.go.gl.widget.GLTextViewWrapper;
import java.util.HashMap;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view.gl:
//            GLWidgetChildView, GLWeatherLouverView, GLProgressBar, GLWeatherWidget41Style2

public class GLWeather41Style2 extends GLWidgetChildView
    implements com.go.gl.view.GLView.OnClickListener, com.go.gl.view.GLView.OnLongClickListener
{

    private WeatherBean a;
    private Animation b;
    private Animation c;
    private GLWeatherLouverView d;
    private GLImageView e;
    private GLProgressBar f;
    private GLTextViewWrapper g;
    private GLTextViewWrapper h;
    private GLTextViewWrapper i;
    private GLTextViewWrapper j;
    private GLTextViewWrapper k;
    private GLTextViewWrapper l;
    private GLView m;
    boolean mAnimationWeatherIcon;
    private GLWeatherWidget41Style2 n;
    private a o;
    private String p[];
    private GLImageView q;

    public GLWeather41Style2(Context context)
    {
        super(context, bl.a);
        a = null;
        d = null;
        mAnimationWeatherIcon = true;
        e = null;
        f = null;
        o = null;
        p = null;
        p = com.gau.go.launcherex.gowidget.weather.util.c.h(mContext);
        b = new Translate3DAnimation(1, 0.0F, 1, 0.0F, 1, 1.0F, 1, 0.0F, 1, 0.0F, 1, 0.0F);
        b.setDuration(500L);
        c = new Translate3DAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 1, -1F, 1, 0.0F, 1, 0.0F);
        c.setDuration(500L);
        a(context);
        a();
    }

    private void a()
    {
        d = (GLWeatherLouverView)findViewById(0x7f090563);
        e = (GLImageView)findViewById(0x7f090565);
        f = (GLProgressBar)findViewById(0x7f090566);
        g = (GLTextViewWrapper)findViewById(0x7f090560);
        h = (GLTextViewWrapper)findViewById(0x7f090561);
        i = (GLTextViewWrapper)findViewById(0x7f090562);
        j = (GLTextViewWrapper)findViewById(0x7f09055d);
        Typeface typeface = Typeface.createFromAsset(mContext.getAssets(), "fonts/Roboto-Light.ttf");
        j.getTextView().setTypeface(typeface);
        k = (GLTextViewWrapper)findViewById(0x7f09055e);
        l = (GLTextViewWrapper)findViewById(0x7f09055f);
        q = (GLImageView)findViewById(0x7f090567);
        m = findViewById(0x7f0903b3);
        showProgerssView(false);
        b();
    }

    private void a(int i1, float f1, float f2, float f3)
    {
        g.getTextView().setShadowLayer(f3, f1, f2, i1);
        h.getTextView().setShadowLayer(f3, f1, f2, i1);
        k.getTextView().setShadowLayer(f3, f1, f2, i1);
        j.getTextView().setShadowLayer(f3, f1, f2, i1);
        l.getTextView().setShadowLayer(f3, f1, f2, i1);
        i.getTextView().setShadowLayer(f3, f1, f2, i1);
    }

    private void a(Context context)
    {
        o = new a();
        o.a = context.getPackageName();
        o.b = context.getResources();
        o.c = (new String[] {
            "go_widget_41_style2_na", "go_widget_41_style2_sunny_day", "go_widget_41_style2_sunny_night", "go_widget_41_style2_cloudy_day", "go_widget_41_style2_cloudy_night", "go_widget_41_style2_overcast", "go_widget_41_style2_snowy", "go_widget_41_style2_foggy", "go_widget_41_style2_rainy", "go_widget_41_style2_thunderstrom"
        });
        context = new HashMap();
        context.put("gw_weather_41_bg", "");
        context.put("gw_weather_41_txt_selector", "go_widget_41_style2_text_selector");
        context.put("gw_weather_41_txt_shadow_color", "#66FFFFFF");
        context.put("gw_weather_41_txt_shadow_dx", "0");
        context.put("gw_weather_41_txt_shadow_dy", "1");
        context.put("gw_weather_41_txt_shadow_radius", "1");
        context.put("gw_weather_41_refresh_selector", "go_widget_41_style2_refresh_selector");
        context.put("refresh_progress_41", "go_widget_41_style2_refresh_progress");
        o.a(context);
    }

    private void a(ColorStateList colorstatelist)
    {
        g.setTextColor(colorstatelist);
        h.setTextColor(colorstatelist);
        k.setTextColor(colorstatelist);
        j.setTextColor(colorstatelist);
        l.setTextColor(colorstatelist);
        i.setTextColor(colorstatelist);
    }

    private void a(Time time, boolean flag)
    {
        int i1 = time.hour;
        if (flag)
        {
            k.setVisibility(8);
            return;
        }
        k.setVisibility(0);
        if (i1 >= 0 && i1 < 12)
        {
            k.setText("AM");
            return;
        } else
        {
            k.setText("PM");
            return;
        }
    }

    private void a(boolean flag)
    {
        b(flag);
    }

    private void b()
    {
        setOnClickListener(this);
        e.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        j.setOnClickListener(this);
        d.setOnClickListener(this);
        q.setOnClickListener(this);
        e.setOnLongClickListener(this);
        g.setOnLongClickListener(this);
        h.setOnLongClickListener(this);
        i.setOnLongClickListener(this);
        k.setOnLongClickListener(this);
        l.setOnLongClickListener(this);
        j.setOnLongClickListener(this);
        d.setOnLongClickListener(this);
        q.setOnLongClickListener(this);
    }

    private void b(Time time, boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder();
        int j1 = time.hour;
        int i1 = j1;
        if (!flag)
        {
            j1 %= 12;
            i1 = j1;
            if (j1 == 0)
            {
                i1 = 12;
            }
        }
        if (i1 < 10)
        {
            stringbuilder.append(0);
        }
        stringbuilder.append(i1);
        stringbuilder.append(":");
        i1 = time.minute;
        if (i1 < 10)
        {
            stringbuilder.append(0);
        }
        stringbuilder.append(i1);
        j.setText(stringbuilder.toString());
    }

    private void b(boolean flag)
    {
        Object obj = h();
        if (obj != null && ((Drawable) (obj)).getIntrinsicWidth() > 0 && ((Drawable) (obj)).getIntrinsicHeight() > 0)
        {
            if ((obj = GLDrawable.getDrawable(((Drawable) (obj)))) != null)
            {
                d.setWeather(((GLDrawable) (obj)), flag);
                return;
            }
        }
    }

    private void c()
    {
        Object obj = "";
        int i1;
        if (a != null)
        {
            obj = a.c();
            i1 = a.e();
        } else
        {
            i1 = -1;
        }
        obj = com.gau.go.launcherex.gowidget.weather.util.p.a(getContext(), ((String) (obj)), true, 5, "", -1);
        ((Intent) (obj)).addFlags(0x4000000);
        ((Intent) (obj)).putExtra("gowidget_Id", n.getWidgetId());
        ((Intent) (obj)).putExtra("isMyLocation", i1);
        try
        {
            getContext().startActivity(((Intent) (obj)));
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            activitynotfoundexception.printStackTrace();
        }
    }

    private void d()
    {
        String s;
        if (a == null)
        {
            if (n.isLocatingCity())
            {
                s = mContext.getString(0x7f080517);
            } else
            if (n.isLoadingDatas())
            {
                s = mContext.getString(0x7f080516);
            } else
            {
                s = mContext.getString(0x7f080514);
            }
        } else
        {
            s = a.d();
        }
        g.setText(s);
    }

    private void e()
    {
        String s;
        if (n.isLoadingDatas())
        {
            s = "--";
        } else
        if (a == null)
        {
            s = mContext.getString(0x7f0801e2);
        } else
        {
            s = a.l.e();
        }
        i.setText(s);
    }

    private Time f()
    {
        g g1 = n.getTimeManager();
        boolean flag = n.mSettings.h;
        boolean flag1 = n.mIsPro;
        if (a != null && flag1 && flag)
        {
            return g1.b(a.l.n());
        } else
        {
            return g1.c();
        }
    }

    private boolean g()
    {
        if (a == null)
        {
            return true;
        }
        g g1 = n.getTimeManager();
        String s = a.l.j();
        String s1 = a.l.k();
        if (g1.d())
        {
            return r.a(s, s1, g1.b(a.l.n()));
        } else
        {
            return r.a(s, s1);
        }
    }

    private Drawable h()
    {
        String s;
        String s1;
        boolean flag;
        s1 = o.c[0];
        flag = g();
        s = s1;
        if (a == null) goto _L2; else goto _L1
_L1:
        a.l.d();
        JVM INSTR tableswitch 2 8: default 76
    //                   2 97
    //                   3 127
    //                   4 157
    //                   5 170
    //                   6 184
    //                   7 198
    //                   8 212;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L3:
        s = s1;
_L2:
        return com.gau.go.launcherex.gowidget.weather.theme.b.a(o.b, s, o.a);
_L4:
        if (flag)
        {
            s = o.c[1];
        } else
        {
            s = o.c[2];
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (flag)
        {
            s = o.c[3];
        } else
        {
            s = o.c[4];
        }
        continue; /* Loop/switch isn't completed */
_L6:
        s = o.c[5];
        continue; /* Loop/switch isn't completed */
_L7:
        s = o.c[6];
        continue; /* Loop/switch isn't completed */
_L8:
        s = o.c[7];
        continue; /* Loop/switch isn't completed */
_L9:
        s = o.c[8];
        continue; /* Loop/switch isn't completed */
_L10:
        s = o.c[9];
        if (true) goto _L2; else goto _L11
_L11:
    }

    private void i()
    {
        setOnClickListener(null);
        if (e != null)
        {
            e.setOnClickListener(null);
        }
        if (g != null)
        {
            g.setOnClickListener(null);
        }
        if (h != null)
        {
            h.setOnClickListener(null);
        }
        if (i != null)
        {
            i.setOnClickListener(null);
        }
        if (k != null)
        {
            k.setOnClickListener(null);
        }
        if (l != null)
        {
            l.setOnClickListener(null);
        }
        if (j != null)
        {
            j.setOnClickListener(null);
        }
        if (d != null)
        {
            d.setOnClickListener(null);
        }
        setOnLongClickListener(null);
        if (e != null)
        {
            e.setOnLongClickListener(null);
        }
        if (g != null)
        {
            g.setOnLongClickListener(null);
        }
        if (h != null)
        {
            h.setOnLongClickListener(null);
        }
        if (i != null)
        {
            i.setOnLongClickListener(null);
        }
        if (k != null)
        {
            k.setOnLongClickListener(null);
        }
        if (l != null)
        {
            l.setOnLongClickListener(null);
        }
        if (j != null)
        {
            j.setOnLongClickListener(null);
        }
        if (d != null)
        {
            d.setOnLongClickListener(null);
        }
    }

    public void cleanup()
    {
        super.cleanup();
        i();
    }

    public String getCityId()
    {
        if (a != null)
        {
            return a.c();
        } else
        {
            return null;
        }
    }

    public int getContentViewLayoutId()
    {
        return 0x7f030126;
    }

    public WeatherBean getWeatherBean()
    {
        return a;
    }

    public boolean isEmptyCity()
    {
        return TextUtils.isEmpty(getCityId());
    }

    public void notifyLanguageChanged()
    {
        p = com.gau.go.launcherex.gowidget.weather.util.c.h(mContext);
        d();
        updateDateWeek();
    }

    public void onApplyTheme(a a1)
    {
        float f3;
        f3 = 1.0F;
        o = a1;
        Object obj = o.c[0];
        obj = com.gau.go.launcherex.gowidget.weather.theme.b.a(o.b, ((String) (obj)), o.a);
        if (obj != null)
        {
            obj = GLDrawable.getDrawable(((Drawable) (obj)));
            if (obj != null)
            {
                d.setWeather(((GLDrawable) (obj)), false);
            }
        }
        obj = com.gau.go.launcherex.gowidget.weather.theme.b.b(o.b, o.a("gw_weather_41_txt_selector"), o.a);
        if (obj != null)
        {
            a(((ColorStateList) (obj)));
            m.setBackgroundColor(((ColorStateList) (obj)).getDefaultColor());
        }
        float f1;
        int i1;
        i1 = com.gau.go.launcherex.gowidget.weather.theme.b.a(o.a("gw_weather_41_txt_shadow_color"), 0xffffff);
        String s = o.a("gw_weather_41_txt_shadow_dx");
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_408;
        }
        f1 = Float.parseFloat(s);
_L5:
        String s1 = o.a("gw_weather_41_txt_shadow_dy");
        if (TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        float f2 = Float.parseFloat(s1);
_L4:
        String s2 = o.a("gw_weather_41_txt_shadow_radius");
        if (!TextUtils.isEmpty(s2))
        {
            f3 = Float.parseFloat(s2);
        }
        a(i1, f1, f2, f3);
_L3:
        Object obj1 = o.a("gw_weather_41_theme_setting_selector");
        obj1 = com.gau.go.launcherex.gowidget.weather.theme.b.a(o.b, ((String) (obj1)), o.a);
        Exception exception;
        int j1;
        if (obj1 != null)
        {
            q.setVisibility(0);
            q.setImageDrawable(((Drawable) (obj1)));
        } else
        {
            q.setVisibility(4);
        }
        j1 = e.getVisibility();
        e.setBackgroundDrawable(com.gau.go.launcherex.gowidget.weather.theme.b.a(o.b, a1.a("gw_weather_41_refresh_selector"), o.a));
        e.setVisibility(j1);
        j1 = f.getVisibility();
        a1 = o.a("gw_weather_41_refresh_selector");
        f.setBackgroundDrawable(com.gau.go.launcherex.gowidget.weather.theme.b.a(o.b, a1, o.a));
        f.setVisibility(j1);
        updateAllViews();
        return;
        exception;
        exception.printStackTrace();
          goto _L3
_L2:
        f2 = 1.0F;
          goto _L4
        f1 = 0.0F;
          goto _L5
    }

    public void onClick(GLView glview)
    {
        if (!n.isLoadingDatas())
        {
            if (glview.equals(e))
            {
                n.refreshWeather();
                return;
            }
            if (glview.equals(this))
            {
                c();
                return;
            }
            if (glview.equals(g))
            {
                c();
                return;
            }
            if (glview.equals(h))
            {
                c();
                return;
            }
            if (glview.equals(i))
            {
                c();
                return;
            }
            if (glview.equals(d))
            {
                c();
                return;
            }
            if (glview.equals(k))
            {
                n.gotoClock();
                return;
            }
            if (glview.equals(j))
            {
                n.gotoClock();
                return;
            }
            if (glview.equals(l))
            {
                n.gotoCalendar();
                return;
            }
            if (glview.equals(q))
            {
                n.gotoThemeStore();
                return;
            }
        }
    }

    public boolean onLongClick(GLView glview)
    {
        performLongClick();
        return true;
    }

    public void setWeatherBean(WeatherBean weatherbean)
    {
        a = weatherbean;
    }

    public void setWidgetView(GLWeatherWidget41Style2 glweatherwidget41style2)
    {
        n = glweatherwidget41style2;
    }

    public void showProgerssView(boolean flag)
    {
        if (flag)
        {
            e.setVisibility(4);
            f.setVisibility(0);
            f.startAnimation();
            return;
        } else
        {
            e.setVisibility(0);
            f.setVisibility(4);
            f.stopAnimation();
            return;
        }
    }

    public void updateAllViews()
    {
        d();
        updateWeatherIcon();
        e();
        updateNowTemp();
        updateTime();
        updateDateWeek();
    }

    public void updateDateWeek()
    {
        g g1 = n.getTimeManager();
        Time time = f();
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(p[time.weekDay].replace(".", ""));
        stringbuffer.append(" , ");
        stringbuffer.append(g1.a(time, false));
        l.setText(stringbuffer.toString());
    }

    public void updateNowTemp()
    {
        StringBuilder stringbuilder = new StringBuilder();
        WidgetSettingBean widgetsettingbean = n.mSettings;
        if (n.isLoadingDatas())
        {
            stringbuilder.append("--");
        } else
        if (a == null)
        {
            stringbuilder.append("--");
        } else
        {
            float f1 = a.l.a(widgetsettingbean.a);
            if (f1 == -10000F)
            {
                stringbuilder.append("--");
            } else
            {
                stringbuilder.append(com.gau.go.launcherex.gowidget.weather.util.q.a(f1));
            }
        }
        if (widgetsettingbean.a == 1)
        {
            stringbuilder.append("\260C");
        } else
        {
            stringbuilder.append("\260F");
        }
        h.setText(stringbuilder.toString());
    }

    public void updateTime()
    {
        Time time = f();
        boolean flag = r.b(mContext);
        a(time, flag);
        b(time, flag);
    }

    public void updateWeatherIcon()
    {
        a(mAnimationWeatherIcon);
    }
}
