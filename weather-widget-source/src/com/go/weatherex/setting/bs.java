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

class bs
    implements m
{

    final bo a;

    bs(bo bo1)
    {
        a = bo1;
        super();
    }

    public void a(i i, boolean flag, ArrayList arraylist)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        int j;
        i = new StringBuffer("");
        iterator = bo.d(a).d().iterator();
        j = 0;
_L4:
        WeatherBean weatherbean;
        boolean flag1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        weatherbean = (WeatherBean)iterator.next();
        Iterator iterator1 = arraylist.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break MISSING_BLOCK_LABEL_176;
            }
        } while (!((String)((a)iterator1.next()).c).equals(weatherbean.c()));
        flag1 = true;
_L5:
        if (!flag1)
        {
            if (j > 0)
            {
                i.append("#");
            }
            i.append(weatherbean.c());
            j++;
        }
        if (true) goto _L4; else goto _L3
_L3:
        i = i.toString();
        com.go.weatherex.setting.bo.a(a).a(i);
        com.go.weatherex.setting.bo.a(a).a(WeatherContentProvider.g, "setting_key", "no_notify_temp_change_cities", "setting_value", i);
_L2:
        return;
        flag1 = false;
          goto _L5
    }
}
