// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.util;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

public class p
{

    public static Intent a(Context context, String s, boolean flag, int i, String s1, int j)
    {
        ComponentName componentname = new ComponentName("com.gau.go.launcherex.gowidget.weatherwidget", "com.gau.go.launcherex.gowidget.weather.view.WeatherDetailActivity");
        Intent intent = new Intent();
        intent.setComponent(componentname);
        intent.putExtra("cityId", s);
        intent.putExtra("EXTRA_BG_LOADING_IMMEDIATELY_", flag);
        intent.putExtra("detailSrc", i);
        intent.putExtra("extra_src_app_package_name", s1);
        intent.putExtra("detail_goto", j);
        if (!(context instanceof Activity))
        {
            intent.addFlags(0x10000000);
        }
        return intent;
    }
}
