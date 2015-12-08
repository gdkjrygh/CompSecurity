// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.a;

import android.os.AsyncTask;
import com.gau.go.launcherex.gowidget.weather.a.a.a;
import com.gau.go.launcherex.gowidget.weather.provider.b;
import com.jiubang.goweather.c.u;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.a:
//            c, d

class e extends AsyncTask
{

    final c a;

    private e(c c1)
    {
        a = c1;
        super();
    }

    e(c c1, d d)
    {
        this(c1);
    }

    protected transient List a(String as[])
    {
        as = as[0];
        if (com.gau.go.launcherex.gowidget.weather.a.c.a(a))
        {
            return u.a(a.a, as, 0x7f06001e);
        } else
        {
            return b.a(a.a, as);
        }
    }

    protected void a(List list)
    {
        String s = a.b;
        a.b = null;
        if (isCancelled())
        {
            return;
        } else
        {
            a a1 = new a();
            a1.c = s;
            a1.a.addAll(list);
            a1.b = 1;
            a.a(a1);
            return;
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((List)obj);
    }
}
