// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.c.g;
import com.gau.go.launcherex.gowidget.weather.model.ThemeDataBean;
import com.gau.go.launcherex.gowidget.weather.model.x;
import com.gtp.a.a.b.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            c, d

class e extends AsyncTask
{

    final com.gau.go.launcherex.gowidget.weather.b.c a;

    private e(com.gau.go.launcherex.gowidget.weather.b.c c1)
    {
        a = c1;
        super();
    }

    e(com.gau.go.launcherex.gowidget.weather.b.c c1, d d)
    {
        this(c1);
    }

    protected transient Boolean a(Void avoid[])
    {
        Object obj;
        Object obj1;
        ArrayList arraylist;
        int i;
        int j;
        boolean flag1;
        boolean flag2;
        obj = null;
        flag1 = true;
        flag2 = false;
        long l = c.a(a);
        c.a("LJL", (new StringBuilder()).append("syncTime-------").append(l).toString());
        if (l + 0x5265c00L > System.currentTimeMillis())
        {
            return Boolean.valueOf(false);
        }
        arraylist = new ArrayList();
        c.a(a, arraylist);
        c.a(a, false);
        obj1 = c.b(a, arraylist);
        if (c.b(a))
        {
            g.a(com.gau.go.launcherex.gowidget.weather.b.c.c(a), "/GOWeatherEX/download", "hiWeather.ex", true);
            c.d(a);
            return Boolean.valueOf(true);
        }
        if (obj1 == null)
        {
            return Boolean.valueOf(false);
        }
        j = ((ArrayList) (obj1)).size();
        avoid = (new StringBuilder()).append("com.gau.go.launcherex.gowidget.weatherwidget.launchimage.").append(c.e(a)).toString();
        c.a("LJL", (new StringBuilder()).append("mLanguageSetting---").append(c.e(a)).toString());
        i = 0;
_L6:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_681;
        }
        if (!avoid.equalsIgnoreCase(((ThemeDataBean)((ArrayList) (obj1)).get(i)).c())) goto _L2; else goto _L1
_L1:
        avoid = (ThemeDataBean)((ArrayList) (obj1)).get(i);
_L9:
        if (avoid != null) goto _L4; else goto _L3
_L3:
        String as[];
        as = c.e(a).split("_");
        c.a("LJL", (new StringBuilder()).append("langLocale.length---").append(as.length).toString());
        if (as.length != 2 || TextUtils.isEmpty(as[0])) goto _L4; else goto _L5
_L2:
        i++;
          goto _L6
_L7:
        boolean flag;
        if (obj != null)
        {
            avoid = ((Void []) (obj));
        }
        if (avoid == null)
        {
            g.a(com.gau.go.launcherex.gowidget.weather.b.c.c(a), "/GOWeatherEX/download", "hiWeather.ex", true);
            c.d(a);
            return Boolean.valueOf(true);
        }
        arraylist.clear();
        c.a(a, arraylist, avoid);
        avoid = com.gau.go.launcherex.gowidget.weather.b.c.c(a, arraylist);
        if (avoid == null)
        {
            return Boolean.valueOf(false);
        }
        flag = flag2;
        if (!TextUtils.isEmpty(avoid.a()))
        {
            avoid = avoid.a().split("#");
            flag = flag2;
            if (avoid != null)
            {
                flag = flag2;
                if (avoid.length > 0)
                {
                    arraylist.clear();
                    c.a(a, arraylist, avoid[0]);
                    avoid = c.a(a, avoid[0]);
                    flag = flag2;
                    if (avoid != null)
                    {
                        obj = g.a(avoid, "/GOWeatherEX/download", "hiWeather.ex", android.graphics.Bitmap.CompressFormat.PNG, 100, com.gau.go.launcherex.gowidget.weather.b.c.c(a), true);
                        avoid.recycle();
                        if (obj != null)
                        {
                            flag = flag1;
                        } else
                        {
                            flag = false;
                        }
                    }
                }
            }
        }
        if (flag)
        {
            c.d(a);
        }
        return Boolean.valueOf(flag);
_L5:
        c.a("LJL", (new StringBuilder()).append("langLocale[0]---").append(as[0]).toString());
        String s = (new StringBuilder()).append("com.gau.go.launcherex.gowidget.weatherwidget.launchimage.").append(as[0]).toString();
        for (i = 0; i < j; i++)
        {
            if ("com.gau.go.launcherex.gowidget.weatherwidget.launchimage.en".equalsIgnoreCase(((ThemeDataBean)((ArrayList) (obj1)).get(i)).c()))
            {
                obj = (ThemeDataBean)((ArrayList) (obj1)).get(i);
            }
            if (s.equalsIgnoreCase(((ThemeDataBean)((ArrayList) (obj1)).get(i)).c()))
            {
                obj1 = (ThemeDataBean)((ArrayList) (obj1)).get(i);
                avoid = ((Void []) (obj));
                obj = obj1;
                break MISSING_BLOCK_LABEL_431;
            }
        }

        Void avoid1[] = avoid;
        avoid = ((Void []) (obj));
        obj = avoid1;
          goto _L7
_L4:
        Object obj2 = null;
        obj = avoid;
        avoid = obj2;
        if (true) goto _L7; else goto _L8
_L8:
        avoid = null;
          goto _L9
    }

    protected void a(Boolean boolean1)
    {
        c.f(null);
        c.b(a, false);
    }

    protected transient void b(Void avoid[])
    {
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }

    protected void onProgressUpdate(Object aobj[])
    {
        b((Void[])aobj);
    }
}
