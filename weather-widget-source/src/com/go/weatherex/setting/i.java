// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;

// Referenced classes of package com.go.weatherex.setting:
//            j

public class i
{

    private Context a;
    private j b;

    public i(Context context)
    {
        a = context;
        b = new j(this, context.getContentResolver());
    }

    private void a()
    {
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LIVE_WALLPAPER_SETTINGS_CHANGE");
        a.sendBroadcast(intent);
    }

    private void a(int k)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("setting_value", Integer.valueOf(k));
        b.a(-1, null, WeatherContentProvider.g, contentvalues, "setting_key=?", new String[] {
            "key_live_wallpaper_city_flag"
        });
    }

    static void a(i k)
    {
        k.a();
    }

    static void a(i k, int l)
    {
        k.a(l);
    }

    public void a(CityBean citybean)
    {
        if (citybean == null || TextUtils.isEmpty(citybean.a()))
        {
            return;
        } else
        {
            b.a(1, citybean, WeatherContentProvider.g, new String[] {
                "setting_value"
            }, "setting_key=?", new String[] {
                "key_live_wallpaper_city_flag"
            }, "_id");
            return;
        }
    }

    public void a(String s)
    {
        b.a(3, s, WeatherContentProvider.g, new String[] {
            "setting_value"
        }, "setting_key=?", new String[] {
            "key_live_wallpaper_city_id"
        }, "_id");
    }
}
