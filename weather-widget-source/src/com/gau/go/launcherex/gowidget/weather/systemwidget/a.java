// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.systemwidget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.util.SparseArray;
import android.widget.RemoteViews;
import com.go.weatherex.j.b.d;
import com.go.weatherex.j.b.e;
import com.go.weatherex.j.b.l;
import com.go.weatherex.j.b.n;
import com.go.weatherex.j.b.r;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.systemwidget:
//            b

public class a
{

    private Context a;
    private final SparseArray b = new SparseArray();
    private int c;

    public a(Context context, int i)
    {
        a = context.getApplicationContext();
        c = i;
    }

    static Context a(a a1)
    {
        return a1.a;
    }

    private void a(int i)
    {
        if ((l)b.get(i) == null)
        {
            Object obj;
            l l1;
            if (c == 6)
            {
                obj = new r(a(), c);
            } else
            {
                obj = new d(a(), c);
            }
            ((d) (obj)).a(i);
            l1 = new l(a());
            l1.a(new b(this, i));
            l1.a(((d) (obj)));
            b.put(i, l1);
            n.n().m().a(((d) (obj)));
        }
    }

    protected Context a()
    {
        return a;
    }

    protected final void a(int i, RemoteViews remoteviews)
    {
        AppWidgetManager.getInstance(a).updateAppWidget(i, remoteviews);
    }

    public void a(Context context)
    {
    }

    public void a(Context context, int ai[])
    {
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            int k = ai[i];
            context = (l)b.get(k);
            if (context != null)
            {
                context.a();
                b.delete(k);
            }
        }

    }

    public void b(Context context)
    {
    }

    public void b(Context context, int ai[])
    {
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            a(ai[i]);
        }

    }
}
