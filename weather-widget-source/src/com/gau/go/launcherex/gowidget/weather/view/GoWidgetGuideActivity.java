// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;

public class GoWidgetGuideActivity extends GoWeatherEXActivity
    implements android.view.View.OnClickListener
{

    private View a;
    private View b;

    public GoWidgetGuideActivity()
    {
    }

    public void onClick(View view)
    {
        if (view.equals(b))
        {
            finish();
        } else
        if (view.equals(a))
        {
            view = new Intent("android.intent.action.MAIN");
            view.addCategory("android.intent.category.HOME");
            startActivity(view);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0300a1);
        getWindow().clearFlags(0x8000000);
        a = findViewById(0x7f0901b4);
        a.setOnClickListener(this);
        b = findViewById(0x7f090060);
        b.setOnClickListener(this);
    }
}
