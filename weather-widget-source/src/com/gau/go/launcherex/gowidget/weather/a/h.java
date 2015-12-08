// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.a;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.jiubang.goweather.b.c;
import com.jiubang.goweather.b.d;
import com.jiubang.goweather.b.e;
import com.jiubang.goweather.b.f;
import java.io.UnsupportedEncodingException;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.a:
//            f, g

class h extends AsyncTask
{

    final com.gau.go.launcherex.gowidget.weather.a.f a;

    private h(com.gau.go.launcherex.gowidget.weather.a.f f1)
    {
        a = f1;
        super();
    }

    h(com.gau.go.launcherex.gowidget.weather.a.f f1, g g)
    {
        this(f1);
    }

    protected transient Void a(String as[])
    {
        as = as[0];
        if (!TextUtils.isEmpty(as))
        {
            Object obj = new StringBuilder();
            ((StringBuilder) (obj)).append("http://").append("61.145.124.191:8088/goweatherexCityCrawler/city/add/searchCity");
            obj = new e(((StringBuilder) (obj)).toString(), 5000, 50000);
            ((e) (obj)).a("city", as);
            ((e) (obj)).a(a.a);
            try
            {
                as = ((e) (obj)).i();
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                if (com.gtp.a.a.b.c.a())
                {
                    as.printStackTrace();
                }
                as = null;
            }
            if (!TextUtils.isEmpty(as))
            {
                f f1 = new f();
                c c1 = d.a();
                if (!c1.a(f1, a.a))
                {
                    f1.b(11);
                    f1.c(3);
                    return null;
                } else
                {
                    as = c1.b(as, ((e) (obj)), f1);
                    com.gtp.a.a.b.c.a("OnlineCitySearchHelper", (new StringBuilder()).append("AdditionalSearchCityTask: ").append(as).toString());
                    return null;
                }
            }
        }
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }
}
