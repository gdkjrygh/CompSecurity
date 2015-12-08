// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.RequestBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gtp.a.a.a.a;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            u, r

public class t
{

    private u a;
    private ConnectivityManager b;
    private Context c;

    public t(Context context)
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.SCREEN_ON");
        intentfilter.addAction("android.intent.action.SCREEN_OFF");
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DATA_READY");
        intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        a = new u(this);
        context.registerReceiver(a, intentfilter);
        b = (ConnectivityManager)context.getSystemService("connectivity");
        c = context;
    }

    static ConnectivityManager a(t t1)
    {
        return t1.b;
    }

    private void b()
    {
        Object obj = f.a(c);
        ArrayList arraylist = new ArrayList();
        obj = ((f) (obj)).f();
        int j = ((ArrayList) (obj)).size();
        if (j > 0)
        {
            com.gtp.a.a.a.a.a().a("\u6EE1\u8DB3\u57CE\u5E02\u6570\u636E\u51C6\u5907\u597D\u4E14\u57CE\u5E02\u6570\u91CF\u5927\u4E8E1\uFF0C\u7F51\u7EDC\u51C6\u5907\u597D\uFF0C\u9ED1\u5C4F\u4E0E\u4EAE\u5C4F\u4E4B\u95F4\u7684\u65F6\u95F4\u5DEE\u8FBE\u52305\u5206\u949F\u4EE5\u4E0A\uFF0C\u5F00\u59CB\u5237\u65B0\u5929\u6C14", "\u4EAE\u5C4F\u5237\u65B0\u5929\u6C14.txt");
            for (int i = 0; i < j; i++)
            {
                WeatherBean weatherbean = (WeatherBean)((ArrayList) (obj)).get(i);
                RequestBean requestbean = new RequestBean();
                requestbean.a(weatherbean.c(), weatherbean.d(), weatherbean.l.g());
                arraylist.add(requestbean);
            }

            com.gau.go.launcherex.gowidget.weather.b.r.a(c).a(arraylist, 22, 4);
        }
    }

    static void b(t t1)
    {
        t1.b();
    }

    public void a()
    {
        c.unregisterReceiver(a);
    }
}
