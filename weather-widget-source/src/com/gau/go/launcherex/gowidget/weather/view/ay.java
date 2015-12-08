// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.format.Time;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.WidgetSettingBean;
import com.gau.go.launcherex.gowidget.weather.theme.a;
import com.gau.go.launcherex.gowidget.weather.util.c;
import com.gau.go.launcherex.gowidget.weather.util.p;
import com.gau.go.launcherex.gowidget.weather.util.q;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.gau.go.launcherex.gowidget.weather.widget.dynamicicon.GoWidgetDynamicIconView;
import com.gau.go.launcherex.gowidget.weather.widget.dynamicicon.a.b;
import com.jiubang.core.a.i;
import java.util.HashMap;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            bk, bl, WeatherWidget41Style2

public class ay extends bk
    implements android.view.View.OnClickListener, android.view.View.OnLongClickListener, b
{

    boolean a;
    private WeatherBean d;
    private GoWidgetDynamicIconView e;
    private FrameLayout f;
    private ImageView g;
    private ProgressBar h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private View o;
    private WeatherWidget41Style2 p;
    private a q;
    private String r[];
    private ImageView s;

    public ay(Context context)
    {
        super(context, com.gau.go.launcherex.gowidget.weather.view.bl.a);
        d = null;
        e = null;
        a = true;
        g = null;
        h = null;
        q = null;
        r = null;
        s = null;
        r = com.gau.go.launcherex.gowidget.weather.util.c.h(b);
        a(context);
        l();
    }

    private void a(int i1, float f1, float f2, float f3)
    {
        i.setShadowLayer(f3, f1, f2, i1);
        j.setShadowLayer(f3, f1, f2, i1);
        m.setShadowLayer(f3, f1, f2, i1);
        l.setShadowLayer(f3, f1, f2, i1);
        n.setShadowLayer(f3, f1, f2, i1);
        k.setShadowLayer(f3, f1, f2, i1);
    }

    private void a(Context context)
    {
        q = new a();
        q.a = context.getPackageName();
        q.b = context.getResources();
        q.c = (new String[] {
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
        q.a(context);
    }

    private void a(ColorStateList colorstatelist)
    {
        i.setTextColor(colorstatelist);
        j.setTextColor(colorstatelist);
        m.setTextColor(colorstatelist);
        l.setTextColor(colorstatelist);
        n.setTextColor(colorstatelist);
        k.setTextColor(colorstatelist);
    }

    private void a(Time time, boolean flag)
    {
        int i1 = time.hour;
        if (flag)
        {
            m.setVisibility(4);
            return;
        }
        m.setVisibility(0);
        if (i1 >= 0 && i1 < 12)
        {
            m.setText("AM");
            return;
        } else
        {
            m.setText("PM");
            return;
        }
    }

    private void a(com.gau.go.launcherex.gowidget.weather.widget.dynamicicon.a a1, boolean flag, boolean flag1, boolean flag2)
    {
        Object obj = s();
        boolean flag3 = r();
        int i1;
        if (d != null)
        {
            i1 = d.l.d();
        } else
        {
            i1 = 1;
        }
        if (a1 == null || !flag || !flag1 || !flag2) goto _L2; else goto _L1
_L1:
        obj = a1.a(i1, flag3, true);
        if (obj != null) goto _L4; else goto _L3
_L3:
        a1.a(i1, flag3, true, this);
_L6:
        return;
_L4:
        e.a(((i) (obj)), true);
        return;
_L2:
        if (obj != null)
        {
            a1 = com.gau.go.launcherex.gowidget.weather.theme.c.a(((Drawable) (obj)));
            if (a1 != null)
            {
                e.a(a1, flag2);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
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
        l.setText(stringbuilder.toString());
    }

    private void b(boolean flag)
    {
        Object obj = s();
        if (obj != null)
        {
            obj = com.gau.go.launcherex.gowidget.weather.theme.c.a(((Drawable) (obj)));
            if (obj != null)
            {
                e.a(((android.graphics.Bitmap) (obj)), flag);
            }
        }
    }

    private void l()
    {
        e = (GoWidgetDynamicIconView)findViewById(0x7f090563);
        f = (FrameLayout)findViewById(0x7f090564);
        g = (ImageView)findViewById(0x7f090565);
        h = (ProgressBar)findViewById(0x7f090566);
        i = (TextView)findViewById(0x7f090560);
        j = (TextView)findViewById(0x7f090561);
        k = (TextView)findViewById(0x7f090562);
        l = (TextView)findViewById(0x7f09055d);
        Typeface typeface = Typeface.createFromAsset(b.getAssets(), "fonts/Roboto-Light.ttf");
        l.setTypeface(typeface);
        m = (TextView)findViewById(0x7f09055e);
        n = (TextView)findViewById(0x7f09055f);
        s = (ImageView)findViewById(0x7f090567);
        o = findViewById(0x7f0903b3);
        a(false);
        m();
    }

    private void m()
    {
        setOnClickListener(this);
        g.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        l.setOnClickListener(this);
        e.setOnClickListener(this);
        s.setOnClickListener(this);
        g.setOnLongClickListener(this);
        i.setOnLongClickListener(this);
        j.setOnLongClickListener(this);
        k.setOnLongClickListener(this);
        m.setOnLongClickListener(this);
        n.setOnLongClickListener(this);
        l.setOnLongClickListener(this);
        e.setOnLongClickListener(this);
        s.setOnLongClickListener(this);
    }

    private void n()
    {
        Object obj = "";
        int i1;
        if (d != null)
        {
            obj = d.c();
            i1 = d.e();
        } else
        {
            i1 = -1;
        }
        obj = com.gau.go.launcherex.gowidget.weather.util.p.a(b, ((String) (obj)), true, 5, "", -1);
        ((Intent) (obj)).addFlags(0x4000000);
        ((Intent) (obj)).putExtra("gowidget_Id", p.getWidgetId());
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

    private void o()
    {
        String s1;
        if (d == null)
        {
            if (p.isLocatingCity())
            {
                s1 = b.getString(0x7f080517);
            } else
            if (p.isLoadingDatas())
            {
                s1 = b.getString(0x7f080516);
            } else
            {
                s1 = b.getString(0x7f080514);
            }
        } else
        {
            s1 = d.d();
        }
        i.setText(s1);
    }

    private void p()
    {
        String s1;
        if (p.isLoadingDatas())
        {
            s1 = "--";
        } else
        if (d == null)
        {
            s1 = b.getString(0x7f0801e2);
        } else
        {
            s1 = d.l.e();
        }
        k.setText(s1);
    }

    private Time q()
    {
        g g1 = p.getTimeManager();
        boolean flag = p.b.h;
        boolean flag1 = p.a;
        if (d != null && flag1 && flag)
        {
            return g1.b(d.l.n());
        } else
        {
            return g1.c();
        }
    }

    private boolean r()
    {
        if (d == null)
        {
            return true;
        }
        g g1 = p.getTimeManager();
        String s1 = d.l.j();
        String s2 = d.l.k();
        if (g1.d())
        {
            return com.gau.go.launcherex.gowidget.weather.util.r.a(s1, s2, g1.b(d.l.n()));
        } else
        {
            return com.gau.go.launcherex.gowidget.weather.util.r.a(s1, s2);
        }
    }

    private Drawable s()
    {
        String s1;
        String s2;
        boolean flag;
        s2 = q.c[0];
        flag = r();
        s1 = s2;
        if (d == null) goto _L2; else goto _L1
_L1:
        d.l.d();
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
        s1 = s2;
_L2:
        return com.gau.go.launcherex.gowidget.weather.theme.b.a(q.b, s1, q.a);
_L4:
        if (flag)
        {
            s1 = q.c[1];
        } else
        {
            s1 = q.c[2];
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (flag)
        {
            s1 = q.c[3];
        } else
        {
            s1 = q.c[4];
        }
        continue; /* Loop/switch isn't completed */
_L6:
        s1 = q.c[5];
        continue; /* Loop/switch isn't completed */
_L7:
        s1 = q.c[6];
        continue; /* Loop/switch isn't completed */
_L8:
        s1 = q.c[7];
        continue; /* Loop/switch isn't completed */
_L9:
        s1 = q.c[8];
        continue; /* Loop/switch isn't completed */
_L10:
        s1 = q.c[9];
        if (true) goto _L2; else goto _L11
_L11:
    }

    public int a()
    {
        return 0x7f030125;
    }

    public void a(WeatherBean weatherbean)
    {
        d = weatherbean;
    }

    public void a(a a1)
    {
        float f3;
        f3 = 1.0F;
        q = a1;
        Object obj = q.c[0];
        obj = com.gau.go.launcherex.gowidget.weather.theme.b.a(q.b, ((String) (obj)), q.a);
        if (obj != null)
        {
            obj = com.gau.go.launcherex.gowidget.weather.theme.c.a(((Drawable) (obj)));
            if (obj != null)
            {
                e.a(((android.graphics.Bitmap) (obj)), false);
            }
        }
        obj = com.gau.go.launcherex.gowidget.weather.theme.b.b(q.b, a1.a("gw_weather_41_txt_selector"), q.a);
        if (obj != null)
        {
            a(((ColorStateList) (obj)));
            o.setBackgroundColor(((ColorStateList) (obj)).getDefaultColor());
        }
        float f1;
        int i1;
        i1 = com.gau.go.launcherex.gowidget.weather.theme.b.a(q.a("gw_weather_41_txt_shadow_color"), 0xffffff);
        String s1 = q.a("gw_weather_41_txt_shadow_dx");
        if (TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_481;
        }
        f1 = Float.parseFloat(s1);
_L5:
        String s2 = q.a("gw_weather_41_txt_shadow_dy");
        if (TextUtils.isEmpty(s2)) goto _L2; else goto _L1
_L1:
        float f2 = Float.parseFloat(s2);
_L4:
        String s3 = q.a("gw_weather_41_txt_shadow_radius");
        if (!TextUtils.isEmpty(s3))
        {
            f3 = Float.parseFloat(s3);
        }
        a(i1, f1, f2, f3);
_L3:
        Object obj1 = q.a("gw_weather_41_theme_setting_selector");
        obj1 = com.gau.go.launcherex.gowidget.weather.theme.b.a(q.b, ((String) (obj1)), q.a);
        Exception exception;
        int j1;
        if (obj1 != null)
        {
            s.setVisibility(0);
            s.setImageDrawable(((Drawable) (obj1)));
        } else
        {
            s.setVisibility(4);
        }
        j1 = g.getVisibility();
        g.setImageDrawable(com.gau.go.launcherex.gowidget.weather.theme.b.a(q.b, a1.a("gw_weather_41_refresh_selector"), q.a));
        g.setVisibility(j1);
        j1 = h.getVisibility();
        f.removeView(h);
        h = new ProgressBar(b);
        a1 = a1.a("refresh_progress_41");
        a1 = com.gau.go.launcherex.gowidget.weather.theme.b.a(q.b, a1, q.a);
        f1 = b.getResources().getDisplayMetrics().density;
        h.setLayoutParams(new android.widget.FrameLayout.LayoutParams((int)(18F * f1), (int)(f1 * 18F)));
        h.setIndeterminateDrawable(a1);
        h.setVisibility(j1);
        f.addView(h);
        e();
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

    public void a(WeatherWidget41Style2 weatherwidget41style2)
    {
        p = weatherwidget41style2;
    }

    public void a(b b1, i i1, int j1, boolean flag, boolean flag1)
    {
        if (i1 == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        if (d == null) goto _L2; else goto _L1
_L1:
        if (d.l.d() == j1)
        {
            e.a(i1, flag1);
        }
_L4:
        return;
_L2:
        if (j1 != 1) goto _L4; else goto _L3
_L3:
        e.a(i1, flag1);
        return;
        b(flag1);
        return;
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            g.setVisibility(4);
            h.setVisibility(0);
            return;
        } else
        {
            g.setVisibility(0);
            h.setVisibility(4);
            return;
        }
    }

    public WeatherBean b()
    {
        return d;
    }

    public String c()
    {
        if (d != null)
        {
            return d.c();
        } else
        {
            return null;
        }
    }

    public boolean d()
    {
        return TextUtils.isEmpty(c());
    }

    public void e()
    {
        o();
        h();
        p();
        g();
        i();
        f();
    }

    public void f()
    {
        g g1 = p.getTimeManager();
        Time time = q();
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(r[time.weekDay].replace(".", ""));
        stringbuffer.append(" , ");
        stringbuffer.append(g1.a(time, false));
        n.setText(stringbuffer.toString());
    }

    public void g()
    {
        StringBuilder stringbuilder = new StringBuilder();
        WidgetSettingBean widgetsettingbean = p.b;
        if (p.isLoadingDatas())
        {
            stringbuilder.append("--");
        } else
        if (d == null)
        {
            stringbuilder.append("--");
        } else
        {
            float f1 = d.l.a(widgetsettingbean.a);
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
        j.setText(stringbuilder.toString());
    }

    public void h()
    {
        a(p.getDynamicIconManager(), p.a, p.b.g, a);
    }

    public void i()
    {
        Time time = q();
        boolean flag = com.gau.go.launcherex.gowidget.weather.util.r.b(b);
        a(time, flag);
        b(time, flag);
    }

    public void j()
    {
        r = com.gau.go.launcherex.gowidget.weather.util.c.h(b);
        o();
        f();
    }

    public void onClick(View view)
    {
        if (!p.isLoadingDatas())
        {
            if (view.equals(g))
            {
                p.refreshWeather();
                return;
            }
            if (view.equals(this))
            {
                n();
                return;
            }
            if (view.equals(i))
            {
                n();
                return;
            }
            if (view.equals(j))
            {
                n();
                return;
            }
            if (view.equals(k))
            {
                n();
                return;
            }
            if (view.equals(e))
            {
                n();
                return;
            }
            if (view.equals(m))
            {
                p.gotoCalendar();
                return;
            }
            if (view.equals(l))
            {
                p.gotoClock();
                return;
            }
            if (view.equals(n))
            {
                p.gotoCalendar();
                return;
            }
            if (view.equals(s))
            {
                p.gotoThemeStore();
                return;
            }
        }
    }

    public boolean onLongClick(View view)
    {
        performLongClick();
        return true;
    }
}
