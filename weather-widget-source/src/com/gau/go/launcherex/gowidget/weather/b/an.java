// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import com.gau.go.launcherex.gowidget.weather.model.RequestBean;
import com.gtp.a.a.b.c;
import com.jiubang.goweather.b.f;
import com.jiubang.goweather.d.a;
import com.jiubang.goweather.d.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            ak

class an extends AsyncTask
    implements a
{

    final ak a;
    private final List b;
    private int c;
    private ArrayList d;
    private final int e;
    private final boolean f = false;
    private f g;

    public an(ak ak1, List list, int i, int j)
    {
        a = ak1;
        super();
        b = list;
        c = i;
        e = j;
        d = new ArrayList();
        for (ak1 = list.iterator(); ak1.hasNext(); d.add(list))
        {
            list = (RequestBean)ak1.next();
            list = new com.jiubang.goweather.a.a(((RequestBean) (list)).b, ((RequestBean) (list)).a, ((RequestBean) (list)).c);
        }

    }

    static ArrayList a(an an1)
    {
        return an1.d;
    }

    static int b(an an1)
    {
        return an1.e;
    }

    static f c(an an1)
    {
        return an1.g;
    }

    static int d(an an1)
    {
        return an1.c;
    }

    static List e(an an1)
    {
        return an1.b;
    }

    protected transient Void a(Void avoid[])
    {
        a();
        return null;
    }

    public void a()
    {
        b b1 = new b(com.gau.go.launcherex.gowidget.weather.b.ak.a(a), d, this);
        b1.a(false);
        b1.a(e);
    }

    public void a(List list, f f1)
    {
        com.gtp.a.a.b.c.a("goweatherex", "\u5237\u65B0\u5929\u6C14\u56DE\u8C03 - onErrorGeneral");
        g = f1;
        list = com.gau.go.launcherex.gowidget.weather.b.ak.c(a).obtainMessage();
        list.obj = this;
        com.gau.go.launcherex.gowidget.weather.b.ak.c(a).sendMessage(list);
    }

    public void b(List list, f f1)
    {
        com.gtp.a.a.b.c.a("goweatherex", "\u5237\u65B0\u5929\u6C14\u56DE\u8C03 - onNetworkUnavailable");
        g = f1;
        list = com.gau.go.launcherex.gowidget.weather.b.ak.c(a).obtainMessage();
        list.obj = this;
        com.gau.go.launcherex.gowidget.weather.b.ak.c(a).sendMessage(list);
    }

    public void c(List list, f f1)
    {
        com.gtp.a.a.b.c.a("goweatherex", "\u5237\u65B0\u5929\u6C14\u56DE\u8C03 - onSuccess");
        g = f1;
        list = com.gau.go.launcherex.gowidget.weather.b.ak.c(a).obtainMessage();
        list.obj = this;
        com.gau.go.launcherex.gowidget.weather.b.ak.c(a).sendMessage(list);
    }

    public void d(List list, f f1)
    {
        com.gtp.a.a.b.c.a("goweatherex", "\u5237\u65B0\u5929\u6C14\u56DE\u8C03 - onNoNewData");
        g = f1;
        list = com.gau.go.launcherex.gowidget.weather.b.ak.c(a).obtainMessage();
        list.obj = this;
        com.gau.go.launcherex.gowidget.weather.b.ak.c(a).sendMessage(list);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }
}
