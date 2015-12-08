// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j.c;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.go.weatherex.j.h;
import com.go.weatherex.j.j;
import com.go.weatherex.j.n;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// Referenced classes of package com.go.weatherex.j.c:
//            i, d, f, g, 
//            h

public class e extends h
{

    private final Executor a = Executors.newSingleThreadExecutor();

    public e(Context context)
    {
        super(context);
    }

    static j a(e e1, int k)
    {
        return e1.b(k);
    }

    private void a(int k, int l)
    {
        a().getContentResolver().delete(WeatherContentProvider.l, "go_widget_id=?", new String[] {
            String.valueOf(k)
        });
        c(l);
    }

    private void a(int k, String s)
    {
        ContentResolver contentresolver = a().getContentResolver();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("city_id", s);
        contentresolver.update(WeatherContentProvider.l, contentvalues, "go_widget_id=?", new String[] {
            String.valueOf(k)
        });
    }

    static void a(e e1, int k, int l)
    {
        e1.b(k, l);
    }

    static void a(e e1, int k, String s)
    {
        e1.a(k, s);
    }

    static void a(e e1, j j1)
    {
        e1.a(j1);
    }

    private j b(int k)
    {
        j j1 = null;
        Object obj = a().getContentResolver().query(WeatherContentProvider.l, null, "go_widget_id=?", new String[] {
            String.valueOf(k)
        }, null);
        if (obj != null)
        {
            if (((Cursor) (obj)).moveToFirst())
            {
                j1 = j.b(((Cursor) (obj)));
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
        ((j) (obj)).a(k);
        return ((j) (obj));
    }

    private void b(int k, int l)
    {
        Cursor cursor;
        ContentResolver contentresolver;
        ContentValues contentvalues;
        contentresolver = a().getContentResolver();
        contentvalues = new ContentValues();
        contentvalues.put("go_widget_type", Integer.valueOf(l));
        contentvalues.put("go_widget_id", Integer.valueOf(k));
        contentvalues.put("city_id", "");
        contentvalues.put("widget_theme", "");
        cursor = contentresolver.query(WeatherContentProvider.l, new String[] {
            "go_widget_id"
        }, "go_widget_id=?", new String[] {
            String.valueOf(k)
        }, null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        try
        {
            k = cursor.getCount();
        }
        catch (Exception exception1)
        {
            cursor.close();
            k = -1;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            cursor.close();
            throw exception;
        }
        cursor.close();
_L4:
        if (k == 0)
        {
            contentresolver.insert(WeatherContentProvider.l, contentvalues);
            c(l);
        }
        return;
_L2:
        k = -1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void b(e e1, int k, int l)
    {
        e1.a(k, l);
    }

    private void c(int k)
    {
        ContentResolver contentresolver = a().getContentResolver();
        ContentValues contentvalues = new ContentValues();
        Object obj = contentresolver.query(WeatherContentProvider.l, new String[] {
            "go_widget_id"
        }, "go_widget_type=?", new String[] {
            String.valueOf(k)
        }, null);
        int l;
        if (obj != null)
        {
            if (((Cursor) (obj)).moveToFirst())
            {
                l = ((Cursor) (obj)).getCount();
            } else
            {
                l = 0;
            }
            try
            {
                ((Cursor) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
            }
        } else
        {
            l = 0;
        }
        contentvalues.clear();
        k;
        JVM INSTR tableswitch 0 5: default 120
    //                   0 179
    //                   1 173
    //                   2 161
    //                   3 167
    //                   4 191
    //                   5 185;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        obj = null;
_L9:
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            contentvalues.put(((String) (obj)), Integer.valueOf(l));
            contentresolver.update(WeatherContentProvider.o, contentvalues, null, null);
        }
        return;
_L4:
        obj = "count_gowidget_11";
        continue; /* Loop/switch isn't completed */
_L5:
        obj = "count_gowidget_21";
        continue; /* Loop/switch isn't completed */
_L3:
        obj = "count_gowidget_41";
        continue; /* Loop/switch isn't completed */
_L2:
        obj = "count_gowidget_42";
        continue; /* Loop/switch isn't completed */
_L7:
        obj = "count_gowidget_41_style2";
        continue; /* Loop/switch isn't completed */
_L6:
        obj = "count_gowidget_days_41";
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void a(int k)
    {
        (new i(this)).execute(new Integer[] {
            Integer.valueOf(k)
        });
    }

    public void a(d d1)
    {
        int k = d1.o();
        int l = d1.s();
        a.execute(new f(this, k, l));
    }

    public void b(d d1)
    {
        int k = d1.o();
        int l = d1.s();
        a.execute(new g(this, k, l));
    }

    public void c(d d1)
    {
        n n1 = d1.i();
        int k = d1.o();
        d1 = n1.c();
        a.execute(new com.go.weatherex.j.c.h(this, k, d1));
    }
}
