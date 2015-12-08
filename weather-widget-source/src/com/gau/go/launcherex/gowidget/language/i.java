// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.language;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.gau.go.launcherex.gowidget.weather.view.LanguageSetting;

// Referenced classes of package com.gau.go.launcherex.gowidget.language:
//            e

class i extends BroadcastReceiver
{

    final e a;

    i(e e1)
    {
        a = e1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (context != null)
        {
            if (context.equals("action_touch_language_check_update_notification"))
            {
                intent = new Intent(e.a(a), com/gau/go/launcherex/gowidget/weather/view/LanguageSetting);
                intent.setFlags(0x34000000);
                intent.putExtra("weather_alerts_lists_entrance", "widget&notification");
                e.a(a).startActivity(intent);
                e.b(a);
                e.c(a);
            }
            if (context.equals("action_delete_language_check_update_notification"))
            {
                e.c(a);
                return;
            }
        }
    }
}
