// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.widget.dynamicicon;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.scriptengine.parser.ae;
import com.gau.go.launcherex.gowidget.weather.widget.dynamicicon.a.a;
import com.gau.go.launcherex.gowidget.weather.widget.dynamicicon.a.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.widget.dynamicicon:
//            d, a, b

class c extends AsyncTask
{

    final com.gau.go.launcherex.gowidget.weather.widget.dynamicicon.a a;

    private c(com.gau.go.launcherex.gowidget.weather.widget.dynamicicon.a a1)
    {
        a = a1;
        super();
    }

    c(com.gau.go.launcherex.gowidget.weather.widget.dynamicicon.a a1, com.gau.go.launcherex.gowidget.weather.widget.dynamicicon.b b1)
    {
        this(a1);
    }

    protected transient d a(d ad[])
    {
        ad = ad[0];
        if (!TextUtils.isEmpty(((d) (ad)).c) && !TextUtils.isEmpty(((d) (ad)).g))
        {
            if (((d) (ad)).b == null)
            {
                ad.b = (new ae(a(a))).b(((d) (ad)).c, ((d) (ad)).g);
            }
            if (((d) (ad)).b != null)
            {
                ad.a = (new a(((d) (ad)).b, a(a), ((d) (ad)).g, b(a), com.gau.go.launcherex.gowidget.weather.widget.dynamicicon.a.c(a))).a(((d) (ad)).g);
            }
        }
        return ad;
    }

    protected void a(d d1)
    {
        if (d1.h != null)
        {
            d1.h.a(d1.h, d1.a, d1.d, d1.e, d1.f);
        }
        a(a, d1.b, d1.c);
        com.gau.go.launcherex.gowidget.weather.widget.dynamicicon.a.d(a).remove(d1.c);
        ArrayList arraylist = new ArrayList();
        Iterator iterator = com.gau.go.launcherex.gowidget.weather.widget.dynamicicon.a.e(a).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            d d3 = (d)iterator.next();
            if (d3.c.equals(d1.c))
            {
                d3.a = d1.a;
                arraylist.add(d3);
            }
        } while (true);
        d1 = arraylist.iterator();
        do
        {
            if (!d1.hasNext())
            {
                break;
            }
            d d2 = (d)d1.next();
            com.gau.go.launcherex.gowidget.weather.widget.dynamicicon.a.e(a).remove(d2);
            if (d2.h != null)
            {
                d2.h.a(d2.h, d2.a, d2.d, d2.e, d2.f);
            }
        } while (true);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((d[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((d)obj);
    }
}
