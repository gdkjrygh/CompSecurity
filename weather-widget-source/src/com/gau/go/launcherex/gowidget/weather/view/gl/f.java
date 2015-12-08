// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view.gl;

import android.os.Bundle;
import android.os.Message;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.service.j;
import java.util.List;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view.gl:
//            GLWeatherWidget41Style2, h

class f extends j
{

    final GLWeatherWidget41Style2 a;

    f(GLWeatherWidget41Style2 glweatherwidget41style2)
    {
        a = glweatherwidget41style2;
        super();
    }

    private void a(int i, int k, int l, Object obj, Bundle bundle)
    {
        Message message = GLWeatherWidget41Style2.access$2300(a).obtainMessage();
        message.what = i;
        message.arg1 = k;
        message.arg2 = l;
        if (obj != null)
        {
            message.obj = obj;
        }
        if (bundle != null)
        {
            message.setData(bundle);
        }
        GLWeatherWidget41Style2.access$2300(a).sendMessage(message);
    }

    public void a(int i, int k)
    {
        a(3, i, k, null, null);
    }

    public void a(int i, List list)
    {
        a(1, i, -1, list, null);
    }

    public void a(WeatherBean weatherbean)
    {
        a(4, -1, -1, weatherbean, null);
    }

    public void a(String s, String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putString(s, s1);
        a(2, -1, -1, null, bundle);
    }

    public void a(List list)
    {
        a(5, -1, -1, list, null);
    }

    public void a(boolean flag)
    {
        a(7, -1, -1, Boolean.valueOf(flag), null);
    }

    public void b(WeatherBean weatherbean)
    {
        a(6, -1, -1, weatherbean, null);
    }

    public void b(boolean flag)
    {
        a(8, -1, -1, Boolean.valueOf(flag), null);
    }
}
