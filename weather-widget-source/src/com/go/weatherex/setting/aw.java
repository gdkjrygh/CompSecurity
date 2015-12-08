// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.os.AsyncTask;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b;
import com.gau.go.launcherex.gowidget.weather.model.RecommendedAppsBean;
import com.gau.go.launcherex.gowidget.weather.model.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.go.weatherex.setting:
//            at

class aw extends AsyncTask
{

    final at a;
    private ArrayList b;
    private int c;

    public aw(at at1, int i)
    {
        a = at1;
        super();
        b = new ArrayList();
        c = i;
    }

    protected transient Integer a(Void avoid[])
    {
        int i;
        if (at.d(a) || at.e(a))
        {
            i = 0;
        } else
        {
            at.a(a, true);
            ArrayList arraylist = new ArrayList();
            avoid = new StringBuilder(com.gau.go.launcherex.gowidget.weather.globaltheme.b.a(a.getActivity()));
            avoid.append("#");
            arraylist.add(new BasicNameValuePair("vps", avoid.toString()));
            arraylist.add(new BasicNameValuePair("channel", w.f(a.getActivity())));
            arraylist.add(new BasicNameValuePair("lang", w.j(a.getActivity())));
            arraylist.add(new BasicNameValuePair("pversion", "23"));
            arraylist.add(new BasicNameValuePair("ps", "30"));
            arraylist.add(new BasicNameValuePair("isgmail", "-1"));
            arraylist.add(new BasicNameValuePair("appuid", "7"));
            if (w.h(a.getActivity()))
            {
                avoid = "1";
            } else
            {
                avoid = "0";
            }
            arraylist.add(new BasicNameValuePair("offical", avoid));
            arraylist.add(new BasicNameValuePair("funid", "27"));
            arraylist.add(new BasicNameValuePair("timestamp", "0"));
            arraylist.add(new BasicNameValuePair("ty", "4"));
            i = at.a(a, arraylist, b);
            at.a(a, false);
        }
        return Integer.valueOf(i);
    }

    protected void a(Integer integer)
    {
        if (!at.d(a)) goto _L2; else goto _L1
_L1:
        com.go.weatherex.setting.at.b(a, c);
_L4:
        com.go.weatherex.setting.at.b(a, c);
        return;
_L2:
        if (integer.intValue() != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        for (integer = b.iterator(); integer.hasNext();)
        {
            RecommendedAppsBean recommendedappsbean = (RecommendedAppsBean)integer.next();
            Iterator iterator = at.a(a).iterator();
            while (iterator.hasNext()) 
            {
                l l1 = (l)iterator.next();
                if (l1.d().equals(recommendedappsbean.a()))
                {
                    l1.a(recommendedappsbean.g());
                    l1.b(recommendedappsbean.c());
                    l1.e(recommendedappsbean.f());
                    l1.a(recommendedappsbean.b());
                    l1.c(recommendedappsbean.d());
                    l1.d(recommendedappsbean.e());
                }
            }
        }

        com.go.weatherex.setting.at.b(a, true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Integer)obj);
    }
}
