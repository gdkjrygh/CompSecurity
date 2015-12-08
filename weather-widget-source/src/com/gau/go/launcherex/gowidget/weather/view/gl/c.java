// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view.gl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.gau.go.launcherex.gowidget.weather.service.e;
import com.gau.go.launcherex.gowidget.weather.service.f;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view.gl:
//            GLWeatherWidget41Style2

class c
    implements ServiceConnection
{

    final GLWeatherWidget41Style2 a;

    c(GLWeatherWidget41Style2 glweatherwidget41style2)
    {
        a = glweatherwidget41style2;
        super();
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        GLWeatherWidget41Style2.access$002(a, f.a(ibinder));
        try
        {
            GLWeatherWidget41Style2.access$000(a).a(GLWeatherWidget41Style2.access$100(a));
            com.gtp.a.a.b.c.a("lishen", (new StringBuilder()).append(getClass().getSimpleName()).append(" onServiceConnected.").toString());
            GLWeatherWidget41Style2.access$300(a, GLWeatherWidget41Style2.access$000(a).b(), GLWeatherWidget41Style2.access$000(a).a(), GLWeatherWidget41Style2.access$000(a).a(GLWeatherWidget41Style2.access$200(a)));
            if (GLWeatherWidget41Style2.access$400(a))
            {
                GLWeatherWidget41Style2.access$000(a).a(GLWeatherWidget41Style2.access$200(a), 5);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            componentname.printStackTrace();
        }
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        com.gtp.a.a.b.c.a("lishen", "WeatherWidget41Style2 onServiceDisconnected.");
        GLWeatherWidget41Style2.access$002(a, null);
    }
}
