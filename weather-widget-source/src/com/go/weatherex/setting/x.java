// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;

// Referenced classes of package com.go.weatherex.setting:
//            u, v

class x extends BroadcastReceiver
{

    final u a;

    private x(u u1)
    {
        a = u1;
        super();
    }

    x(u u1, v v)
    {
        this(u1);
    }

    public void onReceive(Context context, Intent intent)
    {
        while (intent == null || !intent.getAction().equals("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE")) 
        {
            return;
        }
        context = c.a(a.getActivity().getApplicationContext());
        if (context.e().b())
        {
            context.f().a(WeatherContentProvider.g, "setting_key", "world_clock", "setting_value", "1");
        }
        u.a(a);
    }
}
