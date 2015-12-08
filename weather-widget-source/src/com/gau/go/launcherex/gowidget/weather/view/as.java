// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Intent;

public class as
{

    public int a;
    public int b;
    public int c;
    public String d;

    public as()
    {
        a = 40;
        b = 40;
        c = -1;
    }

    public void a(Intent intent)
    {
        if (intent != null && intent.getExtras() != null)
        {
            d = intent.getStringExtra("cityId");
            c = intent.getIntExtra("extra_theme_entrance", 0);
            if (c == 33)
            {
                a = intent.getIntExtra("first_level_tab_id", 40);
                b = intent.getIntExtra("second_level_tab_id", 40);
            }
        }
    }
}
