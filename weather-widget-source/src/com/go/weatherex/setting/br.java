// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.globalview.a;
import com.gau.go.launcherex.gowidget.weather.globalview.i;
import com.gau.go.launcherex.gowidget.weather.globalview.m;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.util.f;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.go.weatherex.setting:
//            bo

class br
    implements m
{

    final bo a;

    br(bo bo1)
    {
        a = bo1;
        super();
    }

    public void a(i i, boolean flag, ArrayList arraylist)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        boolean flag1;
        i = new StringBuffer();
        iterator = bo.d(a).d().iterator();
        flag1 = true;
_L4:
        String s;
        boolean flag2;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = ((WeatherBean)iterator.next()).c();
        Iterator iterator1 = arraylist.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break MISSING_BLOCK_LABEL_247;
            }
        } while (!s.equals((String)((a)iterator1.next()).c));
        flag2 = true;
_L5:
        if (!flag2)
        {
            if (flag1)
            {
                i.append(s);
                flag1 = false;
            } else
            {
                i.append((new StringBuilder()).append("#").append(s).toString());
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        a.k = i.toString();
        com.go.weatherex.setting.bo.a(a).b(a.k);
        com.go.weatherex.setting.bo.a(a).a(WeatherContentProvider.g, "setting_key", "no_alerts_cities", "setting_value", a.k);
        com.go.weatherex.setting.bo.a(a).a(a.k);
        com.go.weatherex.setting.bo.a(a).a(WeatherContentProvider.g, "setting_key", "no_notify_temp_change_cities", "setting_value", a.k);
_L2:
        return;
        flag2 = false;
          goto _L5
    }
}
