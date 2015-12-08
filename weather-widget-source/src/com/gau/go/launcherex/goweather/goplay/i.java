// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.goplay;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.gau.go.launcherex.goweather.livewallpaper.b.h;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.b;
import com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.w;
import com.gau.go.launcherex.gowidget.weather.view.AppWidgetGuideActivity;
import com.go.weatherex.setting.PersonalizeSettingsActivity;
import com.go.weatherex.themestore.ab;
import com.go.weatherex.themestore.ac;
import com.jiubang.core.b.a;
import com.jiubang.playsdk.main.e;

// Referenced classes of package com.gau.go.launcherex.goweather.goplay:
//            a, InstalledAppBackgroundPreviewView, ThemeDataHandler, j, 
//            k, ThemeDetailActivity

public class i extends com.gau.go.launcherex.goweather.goplay.a
    implements b
{

    private LinearLayout a;
    private InstalledAppBackgroundPreviewView b;
    private w c;
    private ThemeDetailActivity d;

    public i()
    {
    }

    private void a(Context context)
    {
        context.startActivity(new Intent(context, com/gau/go/launcherex/gowidget/weather/view/AppWidgetGuideActivity));
    }

    static void a(i l, Context context)
    {
        l.a(context);
    }

    private void b(Context context)
    {
        context.startActivity(PersonalizeSettingsActivity.a(context, ac.e().b));
        context = GoWidgetApplication.c(context.getApplicationContext()).a().edit();
        context.putInt("key_need_recomment_live_wallpaper", 0);
        context.commit();
    }

    static void b(i l, Context context)
    {
        l.b(context);
    }

    public View a(Context context, com.jiubang.playsdk.a.a a1)
    {
        com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1 = null;
        if (b != null)
        {
            b.a();
            b = null;
        }
        b = new InstalledAppBackgroundPreviewView(context);
        if (com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context) != null)
        {
            b1 = com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context).a(a1);
        }
        context = b.a(context, b1);
        a1 = (ViewGroup)context.getParent();
        if (a1 != null)
        {
            a1.removeView(context);
        }
        return context;
    }

    public View a(Context context, com.jiubang.playsdk.a.a a1, e e)
    {
        if (a == null)
        {
            e = context.getResources().getDisplayMetrics();
            a = new LinearLayout(context);
            Object obj = new android.view.ViewGroup.LayoutParams(-1, -2);
            a.setMinimumHeight((int)(34F * ((DisplayMetrics) (e)).density));
            a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            a.setBackgroundColor(context.getResources().getColor(0x7f0a004c));
            a.setOrientation(0);
            a.setGravity(16);
            obj = new ImageView(context);
            ((ImageView) (obj)).setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) (obj)).setImageResource(0x7f0205a5);
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams((int)(((DisplayMetrics) (e)).density * 22F), (int)(((DisplayMetrics) (e)).density * 22F));
            layoutparams.setMargins((int)(((DisplayMetrics) (e)).density * 8F), 0, (int)(((DisplayMetrics) (e)).density * 8F), 0);
            a.addView(((View) (obj)), layoutparams);
            e = new TextView(context);
            e.setTextSize(15F);
            e.setTextColor(context.getResources().getColor(0x7f0a004d));
            obj = new android.widget.LinearLayout.LayoutParams(-2, -2);
            a.addView(e, ((android.view.ViewGroup.LayoutParams) (obj)));
        }
        a.setVisibility(8);
        if (com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context) == null) goto _L2; else goto _L1
_L1:
        a1 = com.gau.go.launcherex.goweather.goplay.ThemeDataHandler.a(context).a(a1);
        if (a1 == null) goto _L2; else goto _L3
_L3:
        if (!a1.E()) goto _L5; else goto _L4
_L4:
        if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(context)) goto _L2; else goto _L6
_L6:
        int l;
        a.setVisibility(0);
        l = 0;
_L11:
        if (l >= a.getChildCount()) goto _L8; else goto _L7
_L7:
        context = a.getChildAt(l);
        if (!(context instanceof TextView)) goto _L10; else goto _L9
_L9:
        ((TextView)context).setText(0x7f08054c);
_L8:
        a.setOnClickListener(new j(this));
_L2:
        if (a.getParent() != null)
        {
            ((ViewGroup)a.getParent()).removeView(a);
        }
        return a;
_L10:
        l++;
          goto _L11
_L5:
        if (!a1.t()) goto _L2; else goto _L12
_L12:
        a1 = GoWidgetApplication.c(context.getApplicationContext()).a();
        if (!h.a(context.getApplicationContext())) goto _L14; else goto _L13
_L13:
        context = a1.edit();
        context.putInt("key_need_recomment_live_wallpaper", 0);
        context.commit();
          goto _L2
_L14:
        if (a1.getInt("key_need_recomment_live_wallpaper", 1) != 1) goto _L2; else goto _L15
_L15:
        a.setVisibility(0);
        l = 0;
_L16:
label0:
        {
            if (l < a.getChildCount())
            {
                context = a.getChildAt(l);
                if (!(context instanceof TextView))
                {
                    break label0;
                }
                ((TextView)context).setText(0x7f0804c7);
            }
            a.setOnClickListener(new k(this));
        }
          goto _L2
        l++;
          goto _L16
    }

    public w a()
    {
        return c;
    }

    public void a(ThemeDetailActivity themedetailactivity)
    {
        d = themedetailactivity;
        c = new w(d);
        c.a();
        c.a(this);
    }

    public void a(com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1)
    {
    }

    public Context b()
    {
        return d;
    }

    public void c()
    {
        c.b();
        if (b != null)
        {
            b.a();
            b = null;
        }
        a = null;
        d = null;
    }
}
