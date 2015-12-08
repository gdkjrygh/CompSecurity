// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.util.r;

public class WeatherForecastView extends LinearLayout
{

    private String a;
    private String b;
    private TextView c;
    private TextView d;

    public WeatherForecastView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = "";
        b = "";
    }

    public String a()
    {
        return a;
    }

    public void a(String s)
    {
        if (!r.a(s))
        {
            c.setText(0x7f0801e3);
            return;
        } else
        {
            c.setText(s);
            return;
        }
    }

    public String b()
    {
        return b;
    }

    public void b(String s)
    {
        if (!r.a(s))
        {
            d.setText(0x7f0801e3);
            return;
        } else
        {
            d.setText(s);
            return;
        }
    }

    public void c(String s)
    {
        a = s;
    }

    public void d(String s)
    {
        b = s;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        c = (TextView)findViewById(0x7f09058a);
        d = (TextView)findViewById(0x7f09058c);
    }
}
