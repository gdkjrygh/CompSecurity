// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.gau.go.launcherex.gowidget.weather.service.e;
import com.gau.go.launcherex.gowidget.weather.service.f;
import com.gtp.a.a.b.c;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            WeatherWidget41Style2

class be
    implements ServiceConnection
{

    final WeatherWidget41Style2 a;

    be(WeatherWidget41Style2 weatherwidget41style2)
    {
        a = weatherwidget41style2;
        super();
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        WeatherWidget41Style2.a(a, f.a(ibinder));
        try
        {
            WeatherWidget41Style2.b(a).a(WeatherWidget41Style2.a(a));
            c.a("lishen", (new StringBuilder()).append(getClass().getSimpleName()).append(" onServiceConnected.").toString());
            WeatherWidget41Style2.a(a, WeatherWidget41Style2.b(a).b(), WeatherWidget41Style2.b(a).a(), WeatherWidget41Style2.b(a).a(com.gau.go.launcherex.gowidget.weather.view.WeatherWidget41Style2.c(a)));
            if (WeatherWidget41Style2.d(a))
            {
                WeatherWidget41Style2.b(a).a(com.gau.go.launcherex.gowidget.weather.view.WeatherWidget41Style2.c(a), 5);
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
        WeatherWidget41Style2.a(a, null);
        c.a("lishen", (new StringBuilder()).append(getClass().getSimpleName()).append(" onServiceDisconnected.").toString());
    }
}
