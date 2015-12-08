// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.c.h;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;
import com.gau.go.launcherex.gowidget.language.b;
import com.gau.go.launcherex.gowidget.weather.view.AppWidgetGuideActivity;

// Referenced classes of package com.go.weatherex.themestore:
//            an, ao

public class WidgetApplyThemeGuideActivity extends GoWeatherEXActivity
    implements android.view.View.OnClickListener
{

    private an a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private TextView h;
    private final h i = new h();

    public WidgetApplyThemeGuideActivity()
    {
    }

    static View a(WidgetApplyThemeGuideActivity widgetapplythemeguideactivity)
    {
        return widgetapplythemeguideactivity.b;
    }

    private void a()
    {
        Object obj = g.getLayoutParams();
        obj.width = g.getWidth();
        obj.height = (((android.view.ViewGroup.LayoutParams) (obj)).width * 1752) / 1080;
        g.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        c.setVisibility(0);
        d.setVisibility(0);
        e.setVisibility(0);
        f.setVisibility(0);
        float f1 = (float)((android.view.ViewGroup.LayoutParams) (obj)).width / 1080F;
        obj = e().getDisplayMetrics();
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(c.getLayoutParams());
        layoutparams.leftMargin = (int)(263F * f1);
        layoutparams.topMargin = (int)(90F * f1);
        layoutparams.rightMargin = (int)(((DisplayMetrics) (obj)).density * 22F);
        c.setLayoutParams(layoutparams);
        layoutparams = new android.widget.FrameLayout.LayoutParams(d.getLayoutParams());
        layoutparams.leftMargin = (int)(53F * f1);
        layoutparams.topMargin = (int)(797F * f1);
        layoutparams.rightMargin = (int)(((DisplayMetrics) (obj)).density * 24F);
        d.setLayoutParams(layoutparams);
        layoutparams = new android.widget.FrameLayout.LayoutParams(e.getLayoutParams());
        layoutparams.leftMargin = (int)(53F * f1);
        layoutparams.topMargin = (int)(1150F * f1);
        layoutparams.rightMargin = (int)(((DisplayMetrics) (obj)).density * 160F);
        e.setLayoutParams(layoutparams);
        layoutparams = new android.widget.FrameLayout.LayoutParams(f.getLayoutParams());
        layoutparams.leftMargin = (int)(185F * f1);
        layoutparams.topMargin = (int)(f1 * 1544F);
        layoutparams.rightMargin = (int)(((DisplayMetrics) (obj)).density * 30F);
        f.setLayoutParams(layoutparams);
    }

    private void b()
    {
        startActivity(new Intent(this, com/gau/go/launcherex/gowidget/weather/view/AppWidgetGuideActivity));
    }

    static void b(WidgetApplyThemeGuideActivity widgetapplythemeguideactivity)
    {
        widgetapplythemeguideactivity.a();
    }

    public void onClick(View view)
    {
        if (view.equals(a.a))
        {
            finish();
        } else
        if (view.equals(h) && !i.a(h))
        {
            b();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030000);
        getWindow().setFormat(-3);
        getWindow().clearFlags(0x8000000);
        Log.i("lky", "WidgetApplyThemeGuideActivity start");
        a = new an(this, findViewById(0x7f090050));
        a.b.setText(0x7f080509);
        a.b().setBackgroundResource(0x7f0205a9);
        a.g.setVisibility(8);
        a.c.setVisibility(8);
        a.d.setVisibility(8);
        b = findViewById(0x7f090051);
        g = findViewById(0x7f090052);
        c = findViewById(0x7f090053);
        d = findViewById(0x7f090055);
        e = findViewById(0x7f090056);
        f = findViewById(0x7f090057);
        c.setVisibility(8);
        d.setVisibility(8);
        e.setVisibility(8);
        f.setVisibility(8);
        h = (TextView)findViewById(0x7f090054);
        h.setText(Html.fromHtml((new StringBuilder()).append("<u>").append(getString(0x7f080541)).append("</u>").toString()));
        a.a.setOnClickListener(this);
        h.setOnClickListener(this);
        a(h, 4, true);
        a(c, 4, true);
        a(d, 4, true);
        a(e, 4, true);
        a(f, 4, true);
        b.getViewTreeObserver().addOnGlobalLayoutListener(new ao(this));
    }
}
