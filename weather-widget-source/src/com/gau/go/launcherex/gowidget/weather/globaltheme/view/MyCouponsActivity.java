// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme.view;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;

public class MyCouponsActivity extends GoWeatherEXActivity
    implements android.view.View.OnClickListener
{

    private View a;
    private ViewGroup b;
    private ViewGroup c;
    private ViewGroup d;
    private View e;
    private View f;
    private View g;

    public MyCouponsActivity()
    {
    }

    public void onClick(View view)
    {
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0300ce);
        getWindow().clearFlags(0x8000000);
        a = findViewById(0x7f09043e);
        b = (ViewGroup)findViewById(0x7f090439);
        c = (ViewGroup)findViewById(0x7f09043b);
        d = (ViewGroup)findViewById(0x7f09043d);
        e = findViewById(0x7f090438);
        f = findViewById(0x7f09043a);
        g = findViewById(0x7f09043c);
        b.setVisibility(8);
        c.setVisibility(8);
        d.setVisibility(8);
        e.setVisibility(8);
        f.setVisibility(8);
        g.setVisibility(8);
        a.setOnClickListener(this);
    }

    protected void onDestroy()
    {
        super.onDestroy();
    }
}
