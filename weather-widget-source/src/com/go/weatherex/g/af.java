// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;

// Referenced classes of package com.go.weatherex.g:
//            ae, ag

class af extends BroadcastReceiver
{

    final ae a;

    af(ae ae1)
    {
        a = ae1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null && "com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LOCATION".equals(intent.getAction()))
        {
            context = (CityBean)intent.getParcelableExtra("city");
            int i = intent.getIntExtra("isMyLocation", -1);
            if (ae.a(a) != null)
            {
                ae.a(a).a(context, i);
                return;
            }
        }
    }
}
