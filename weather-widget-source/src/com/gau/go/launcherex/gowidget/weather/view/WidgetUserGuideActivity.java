// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class WidgetUserGuideActivity extends Activity
    implements android.view.View.OnClickListener
{

    private LinearLayout a;
    private LinearLayout b;
    private TextView c;
    private TextView d;
    private ImageView e;
    private View f;
    private LayoutInflater g;

    public WidgetUserGuideActivity()
    {
    }

    private void a(LinearLayout linearlayout, String as[])
    {
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            TextView textview = (TextView)g.inflate(0x7f030118, null);
            textview.setText(as[i]);
            linearlayout.addView(textview);
        }

    }

    public void onClick(View view)
    {
        if (view.equals(f))
        {
            finish();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030117);
        getWindow().clearFlags(0x8000000);
        g = getLayoutInflater();
        a = (LinearLayout)findViewById(0x7f09054b);
        b = (LinearLayout)findViewById(0x7f09054d);
        c = (TextView)findViewById(0x7f09054a);
        d = (TextView)findViewById(0x7f09054c);
        e = (ImageView)findViewById(0x7f090203);
        f = findViewById(0x7f090060);
        f.setOnClickListener(this);
        switch (getIntent().getIntExtra("widget_user_guide_type", 3))
        {
        default:
            return;

        case 3: // '\003'
            bundle = getResources().getStringArray(0x7f0d002e);
            a(a, bundle);
            bundle = getResources().getStringArray(0x7f0d002f);
            a(b, bundle);
            return;

        case 1: // '\001'
            e.setVisibility(8);
            d.setVisibility(8);
            b.setVisibility(8);
            bundle = getResources().getStringArray(0x7f0d002e);
            a(a, bundle);
            return;

        case 2: // '\002'
            e.setVisibility(8);
            c.setVisibility(8);
            a.setVisibility(8);
            bundle = getResources().getStringArray(0x7f0d002f);
            a(b, bundle);
            return;
        }
    }
}
