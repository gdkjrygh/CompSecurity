// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j.b;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.go.weatherex.j.h;
import com.go.weatherex.j.j;
import com.go.weatherex.j.n;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// Referenced classes of package com.go.weatherex.j.b:
//            h, d, f, g

public class e extends h
{

    private final Executor a = Executors.newSingleThreadExecutor();

    public e(Context context)
    {
        super(context);
    }

    static j a(e e1, int i)
    {
        return e1.b(i);
    }

    private void a(int i, int k)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ContentResolver contentresolver = a().getContentResolver();
        Object obj = contentresolver.query(WeatherContentProvider.u, new String[] {
            "widget_id"
        }, "widget_id=?", new String[] {
            String.valueOf(i)
        }, null);
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag;
        if (((Cursor) (obj)).getCount() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((Cursor) (obj)).close();
        if (flag) goto _L1; else goto _L3
_L3:
        obj = new ContentValues();
        ((ContentValues) (obj)).put("widget_id", Integer.valueOf(i));
        ((ContentValues) (obj)).put("widget_type", Integer.valueOf(k));
        ((ContentValues) (obj)).put("current_cityid", "");
        ((ContentValues) (obj)).put("theme_package_name", "");
        contentresolver.insert(WeatherContentProvider.u, ((ContentValues) (obj)));
        return;
    }

    private void a(int i, String s)
    {
        if (i == 0)
        {
            return;
        } else
        {
            ContentResolver contentresolver = a().getContentResolver();
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("current_cityid", s);
            contentresolver.update(WeatherContentProvider.u, contentvalues, "widget_id=?", new String[] {
                String.valueOf(i)
            });
            return;
        }
    }

    static void a(e e1, int i, int k)
    {
        e1.a(i, k);
    }

    static void a(e e1, int i, String s)
    {
        e1.a(i, s);
    }

    static void a(e e1, j j1)
    {
        e1.a(j1);
    }

    private j b(int i)
    {
        j j1 = null;
        Object obj = a().getContentResolver().query(WeatherContentProvider.u, null, "widget_id=?", new String[] {
            String.valueOf(i)
        }, null);
        if (obj != null)
        {
            if (((Cursor) (obj)).moveToFirst())
            {
                j1 = j.a(((Cursor) (obj)));
            }
            ((Cursor) (obj)).close();
        } else
        {
            j1 = null;
        }
        obj = j1;
        if (j1 == null)
        {
            obj = new j();
        }
        ((j) (obj)).a(i);
        return ((j) (obj));
    }

    public void a(int i)
    {
        (new com.go.weatherex.j.b.h(this)).execute(new Integer[] {
            Integer.valueOf(i)
        });
    }

    public void a(d d1)
    {
        int i = d1.o();
        int k = d1.j();
        a.execute(new f(this, i, k));
    }

    public void b(d d1)
    {
        n n1 = d1.i();
        int i = d1.o();
        d1 = n1.c();
        a.execute(new g(this, i, d1));
    }
}
