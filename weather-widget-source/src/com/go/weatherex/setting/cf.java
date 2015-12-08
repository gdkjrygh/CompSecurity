// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.CheckBox;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;

// Referenced classes of package com.go.weatherex.setting:
//            cc, cd

class cf extends BroadcastReceiver
{

    final cc a;

    private cf(cc cc1)
    {
        a = cc1;
        super();
    }

    cf(cc cc1, cd cd)
    {
        this(cc1);
    }

    public void onReceive(Context context, Intent intent)
    {
        int i;
        int j;
        boolean flag4 = true;
        boolean flag1 = false;
        i = 0;
        boolean flag = false;
        context = e.a(context.getApplicationContext()).a();
        a.b = ((u) (context)).j;
        intent = cc.f(a);
        boolean flag2;
        if (a.b == 1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        intent.setChecked(flag2);
        a.a = ((u) (context)).h;
        cc.a(a, ((u) (context)).i);
        j = cc.a(a).length;
        if (!cc.g(a))
        {
            if (a.a != 0)
            {
                a.a = 0;
                cc.h(a).setChecked(false);
                com.go.weatherex.setting.cc.e(a).k(a.a);
                com.go.weatherex.setting.cc.e(a).a(WeatherContentProvider.g, "setting_key", "calendarType", "setting_value", a.a);
            } else
            {
                cc.h(a).setChecked(false);
            }
        } else
        {
            context = cc.h(a);
            boolean flag3;
            if (a.a == 1)
            {
                flag3 = flag4;
            } else
            {
                flag3 = false;
            }
            context.setChecked(flag3);
        }
        if (cc.i(a)) goto _L2; else goto _L1
_L1:
        i = ((flag1) ? 1 : 0);
        if (cc.d(a) == 0) goto _L4; else goto _L3
_L3:
        cc.a(a, 0);
        i = ((flag) ? 1 : 0);
_L16:
        if (i >= j) goto _L6; else goto _L5
_L5:
        if (cc.d(a) != cc.a(a)[i]) goto _L8; else goto _L7
_L7:
        cc.c(a).setText(cc.b(a)[i]);
        com.go.weatherex.setting.cc.e(a).j(cc.d(a));
        com.go.weatherex.setting.cc.e(a).a(WeatherContentProvider.g, "setting_key", "festival", "setting_value", cc.d(a));
_L6:
        return;
_L8:
        i++;
        continue; /* Loop/switch isn't completed */
_L11:
        i++;
_L4:
        if (i >= j) goto _L6; else goto _L9
_L9:
        if (cc.d(a) != cc.a(a)[i]) goto _L11; else goto _L10
_L10:
        cc.c(a).setText(cc.b(a)[i]);
        return;
_L14:
        i++;
_L2:
        if (i >= j) goto _L6; else goto _L12
_L12:
        if (cc.d(a) != cc.a(a)[i]) goto _L14; else goto _L13
_L13:
        cc.c(a).setText(cc.b(a)[i]);
        return;
        if (true) goto _L16; else goto _L15
_L15:
    }
}
