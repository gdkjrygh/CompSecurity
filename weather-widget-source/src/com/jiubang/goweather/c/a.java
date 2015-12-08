// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.c;

import android.content.Context;
import android.location.Location;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.language.e;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import com.go.weatherex.g.r;
import com.jiubang.goweather.b.f;
import java.util.List;

// Referenced classes of package com.jiubang.goweather.c:
//            x, s

public class a extends AsyncTask
{

    private Context a;
    private s b;
    private Location c;
    private f d;
    private String e;

    public a(Context context, s s1, Location location)
    {
        a = context;
        b = s1;
        c = location;
        d = new f();
        e = com.gau.go.launcherex.gowidget.language.e.a(a).d();
        if (TextUtils.isEmpty(e))
        {
            e = com.jiubang.goweather.e.a.a(context);
        }
    }

    protected transient CityBean a(Object aobj[])
    {
        Location location = (Location)aobj[0];
        int i = 3;
        Object obj;
        for (aobj = null; i > 0 && aobj == null; aobj = ((Object []) (obj)))
        {
            List list = x.a(a, location, d, e);
            obj = ((Object) (aobj));
            if (list != null)
            {
                obj = ((Object) (aobj));
                if (list.size() > 0)
                {
                    obj = (CityBean)list.get(0);
                }
            }
            i--;
        }

        return ((CityBean) (aobj));
    }

    protected void a(CityBean citybean)
    {
        if (citybean != null)
        {
            b.a(citybean, c);
            r.a(a, true, null);
            return;
        } else
        {
            b.a();
            r.a(a, false, d.l());
            return;
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((CityBean)obj);
    }
}
