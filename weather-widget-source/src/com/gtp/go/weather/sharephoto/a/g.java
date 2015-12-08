// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.a;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gtp.go.weather.sharephoto.b.o;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gtp.go.weather.sharephoto.a:
//            d, i, a, h

public class g
    implements d
{

    private static volatile g a;
    private Context b;
    private o c;
    private i d;
    private a e;
    private boolean f;
    private boolean g;
    private ArrayList h;

    private g(Context context)
    {
        c = new o();
        f = false;
        g = false;
        h = new ArrayList();
        b = context.getApplicationContext();
        d = new i(b.getContentResolver(), this);
        e = new a(b);
        e.a(this);
        e();
    }

    public static g a(Context context)
    {
        com/gtp/go/weather/sharephoto/a/g;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new g(context);
        }
        context = a;
        com/gtp/go/weather/sharephoto/a/g;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private void a(Cursor cursor)
    {
        a(cursor, c);
    }

    private static void a(Cursor cursor, o o1)
    {
        if (cursor == null)
        {
            return;
        }
        if (cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        int k;
        cursor.moveToLast();
        k = cursor.getColumnCount();
        int j = 0;
_L9:
        if (j >= k) goto _L2; else goto _L3
_L3:
        String s = cursor.getColumnName(j);
        if (!s.equals("user_id")) goto _L5; else goto _L4
_L4:
        o1.a(cursor.getString(j));
          goto _L6
_L5:
        if (s.equals("user_gmail"))
        {
            o1.b(cursor.getString(j));
        }
          goto _L6
        o1;
        o1.printStackTrace();
        try
        {
            cursor.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor) { }
_L7:
        cursor.printStackTrace();
        return;
        o1;
        try
        {
            cursor.close();
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            cursor.printStackTrace();
        }
        throw o1;
_L2:
        try
        {
            cursor.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor) { }
        if (true) goto _L7; else goto _L6
_L6:
        j++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    static void a(g g1)
    {
        g1.f();
    }

    static void a(g g1, Cursor cursor)
    {
        g1.a(cursor);
    }

    static boolean a(g g1, boolean flag)
    {
        g1.f = flag;
        return flag;
    }

    public static o b(Context context)
    {
        o o1 = new o();
        a(context.getContentResolver().query(WeatherContentProvider.v, null, null, null, "user_id"), o1);
        return o1;
    }

    private void e()
    {
        if (!f)
        {
            f = true;
            d.startQuery(1, null, WeatherContentProvider.v, new String[] {
                "user_id", "user_gmail"
            }, null, null, null);
        }
    }

    private void f()
    {
        g();
        if (!TextUtils.isEmpty(c.a()))
        {
            g = true;
            return;
        } else
        {
            e.a();
            return;
        }
    }

    private void g()
    {
        for (Iterator iterator = (new ArrayList(h)).iterator(); iterator.hasNext(); ((h)iterator.next()).a(b())) { }
    }

    public void a(h h1)
    {
        if (h1 != null && !h.contains(h1))
        {
            h.add(h1);
        }
    }

    public void a(o o1)
    {
        if (!TextUtils.isEmpty(o1.a()))
        {
            c.a(o1.a());
            c.b(o1.b());
            c.a(o1.c());
            g = true;
            b(o1);
        }
        g();
    }

    public boolean a()
    {
        return g;
    }

    public o b()
    {
        return c;
    }

    public void b(h h1)
    {
        h.remove(h1);
    }

    public void b(o o1)
    {
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CHANGE_USER_DATA");
        intent.putExtra("extra_user_id", o1.a());
        intent.putExtra("extra_user_gamil", o1.b());
        b.sendBroadcast(intent);
    }

    public a c()
    {
        return e;
    }

    public String d()
    {
        return c.a();
    }
}
