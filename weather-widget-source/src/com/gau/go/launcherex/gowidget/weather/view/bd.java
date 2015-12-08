// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Intent;

public class bd
{

    public String a;
    public boolean b;
    public int c;
    public String d;
    public int e;

    public bd()
    {
        b = false;
        c = 0;
    }

    public void a(Intent intent)
    {
        if (intent != null && intent.getExtras() != null)
        {
            a = intent.getStringExtra("cityId");
            b = intent.getBooleanExtra("EXTRA_BG_LOADING_IMMEDIATELY_", true);
            c = intent.getIntExtra("detailSrc", 0);
            d = intent.getStringExtra("extra_src_app_package_name");
            e = intent.getIntExtra("detail_goto", -1);
        }
    }
}
