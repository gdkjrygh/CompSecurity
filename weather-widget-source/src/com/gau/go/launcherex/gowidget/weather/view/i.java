// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import com.go.weatherex.e.a;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            ViewPage

public class i
{

    private LayoutInflater a;

    public i(Context context)
    {
        a = LayoutInflater.from(context);
    }

    public ViewPage a(Activity activity, int j)
    {
        ViewPage viewpage;
        int i1;
        viewpage = null;
        i1 = 0x7f030013;
        j;
        JVM INSTR tableswitch 0 13: default 80
    //                   0 135
    //                   1 167
    //                   2 151
    //                   3 199
    //                   4 183
    //                   5 215
    //                   6 231
    //                   7 247
    //                   8 261
    //                   9 277
    //                   10 301
    //                   11 325
    //                   12 349
    //                   13 373;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        android.graphics.Bitmap bitmap;
        int k;
        int l;
        bitmap = null;
        k = -1;
        l = -1;
        i1 = -1;
        j = -1;
_L17:
        if (i1 != -1)
        {
            viewpage = (ViewPage)a.inflate(0x7f030015, null);
            if (bitmap == null)
            {
                break; /* Loop/switch isn't completed */
            }
            viewpage.a(activity, j, i1, k, l, bitmap);
        }
        return viewpage;
_L2:
        i1 = 0x7f030012;
        l = 0x7f080313;
        bitmap = null;
        k = -1;
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = 0x7f03000d;
        l = 0x7f08030f;
        bitmap = null;
        k = -1;
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = 0x7f030016;
        l = 0x7f080314;
        bitmap = null;
        k = -1;
        continue; /* Loop/switch isn't completed */
_L6:
        i1 = 0x7f030017;
        l = 0x7f080311;
        bitmap = null;
        k = -1;
        continue; /* Loop/switch isn't completed */
_L5:
        i1 = 0x7f030014;
        l = 0x7f080312;
        bitmap = null;
        k = -1;
        continue; /* Loop/switch isn't completed */
_L7:
        i1 = 0x7f03000e;
        l = 0x7f080315;
        bitmap = null;
        k = -1;
        continue; /* Loop/switch isn't completed */
_L8:
        i1 = 0x7f030010;
        l = 0x7f080316;
        bitmap = null;
        k = -1;
        continue; /* Loop/switch isn't completed */
_L9:
        bitmap = null;
        k = -1;
        l = -1;
        i1 = -1;
        continue; /* Loop/switch isn't completed */
_L10:
        i1 = 0x7f030011;
        l = 0x7f080317;
        bitmap = null;
        k = -1;
        continue; /* Loop/switch isn't completed */
_L11:
        l = 0x7f080244;
        k = 0x7f080245;
        bitmap = com.go.weatherex.e.a.a().a("advanced_no_ad", "http://goappdl.goforandroid.com/dynamic/ValueAddedService151102/2014.1.1;2014.12.1.zip", 35);
        continue; /* Loop/switch isn't completed */
_L12:
        l = 0x7f080248;
        k = 0x7f080249;
        bitmap = com.go.weatherex.e.a.a().a("advanced_recommend_svip_day_forecast", "http://goappdl.goforandroid.com/dynamic/ValueAddedService151102/2014.1.1;2014.12.1.zip", 40);
        continue; /* Loop/switch isn't completed */
_L13:
        l = 0x7f08024a;
        k = 0x7f08024b;
        bitmap = com.go.weatherex.e.a.a().a("advanced_recommend_svip_hourly_forecast", "http://goappdl.goforandroid.com/dynamic/ValueAddedService151102/2014.1.1;2014.12.1.zip", 35);
        continue; /* Loop/switch isn't completed */
_L14:
        l = 0x7f080246;
        k = 0x7f080247;
        bitmap = com.go.weatherex.e.a.a().a("advanced_recommend_svip_probability_precipitation", "http://goappdl.goforandroid.com/dynamic/ValueAddedService151102/2014.1.1;2014.12.1.zip", 35);
        continue; /* Loop/switch isn't completed */
_L15:
        l = 0x7f08024c;
        k = 0x7f08024d;
        bitmap = com.go.weatherex.e.a.a().a("advanced_recommend_more_premium_functions", "http://goappdl.goforandroid.com/dynamic/ValueAddedService151102/2014.1.1;2014.12.1.zip", 0);
        if (true) goto _L17; else goto _L16
_L16:
        viewpage.a(activity, j, i1, l);
        return viewpage;
    }
}
