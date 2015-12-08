// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.goplay;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.globaltheme.view.MyCouponsActivity;
import com.gau.go.launcherex.gowidget.weather.view.ThemeSettingActivity;
import com.jiubang.playsdk.main.e;

// Referenced classes of package com.gau.go.launcherex.goweather.goplay:
//            a, f, m, ThemeDataHandler

public class l extends a
    implements f
{

    private LinearLayout a;
    private ThemeSettingActivity b;

    public l()
    {
    }

    private void a(Context context)
    {
        context.startActivity(new Intent(context, com/gau/go/launcherex/gowidget/weather/globaltheme/view/MyCouponsActivity));
    }

    static void a(l l1, Context context)
    {
        l1.a(context);
    }

    public View a(Context context, e e)
    {
        if (a == null)
        {
            e = context.getResources().getDisplayMetrics();
            a = new LinearLayout(context);
            a.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, (int)(34F * ((DisplayMetrics) (e)).density)));
            a.setBackgroundColor(context.getResources().getColor(0x7f0a004c));
            a.setOrientation(0);
            a.setGravity(16);
            Object obj = new ImageView(context);
            ((ImageView) (obj)).setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) (obj)).setImageResource(0x7f020115);
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams((int)(((DisplayMetrics) (e)).density * 22F), (int)(((DisplayMetrics) (e)).density * 22F));
            layoutparams.setMargins((int)(((DisplayMetrics) (e)).density * 8F), 0, (int)(((DisplayMetrics) (e)).density * 8F), 0);
            a.addView(((View) (obj)), layoutparams);
            e = new TextView(context);
            e.setText(0x7f080337);
            e.setTextSize(15F);
            e.setTextColor(context.getResources().getColor(0x7f0a004d));
            obj = new android.widget.LinearLayout.LayoutParams(-2, -2);
            a.addView(e, ((android.view.ViewGroup.LayoutParams) (obj)));
            a.setOnClickListener(new m(this));
        }
        if (a.getParent() != null)
        {
            ((ViewGroup)a.getParent()).removeView(a);
        }
        if (ThemeDataHandler.a(context) != null && ThemeDataHandler.a(context).a())
        {
            a.setVisibility(0);
        } else
        {
            a.setVisibility(8);
        }
        return a;
    }

    public void a(ThemeSettingActivity themesettingactivity)
    {
        b = themesettingactivity;
        ThemeDataHandler.a(b.getApplicationContext()).a(this);
    }

    public void a(String s)
    {
    }

    public void a(String s, int i)
    {
    }

    public void a_()
    {
    }

    public Context b()
    {
        return b;
    }

    public void b(String s)
    {
    }

    public void c()
    {
        a = null;
        ThemeDataHandler.a(b.getApplicationContext()).b(this);
        b = null;
    }

    public void c(String s)
    {
    }
}
