// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.b;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class k
{

    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private String f;
    private int g;
    private boolean h;

    public k()
    {
        c = -1;
        g = -1;
        h = true;
    }

    public static int a(Context context, String s, String as[])
    {
        return context.getContentResolver().delete(WeatherContentProvider.B, s, as);
    }

    public static Uri a(Context context, k k1)
    {
        context = context.getContentResolver();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("local_type", Integer.valueOf(k1.d()));
        contentvalues.put("page_type", Integer.valueOf(k1.d()));
        contentvalues.put("prompt_text", k1.e());
        contentvalues.put("prompt_type", Integer.valueOf(k1.f()));
        contentvalues.put("prompt_id", Integer.valueOf(k1.b()));
        contentvalues.put("response_type", Integer.valueOf(k1.c()));
        int i;
        if (k1.a())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put("need_show", Integer.valueOf(i));
        return context.insert(WeatherContentProvider.B, contentvalues);
    }

    public static k a(Cursor cursor)
    {
        k k1 = new k();
        int j = cursor.getColumnCount();
        int i = 0;
        while (i < j) 
        {
            String s = cursor.getColumnName(i);
            if ("_id".equals(s))
            {
                k1.a(cursor.getInt(i));
            } else
            if ("local_type".equals(s))
            {
                k1.e(cursor.getInt(i));
            } else
            if ("prompt_text".equals(s))
            {
                k1.a(cursor.getString(i));
            } else
            if ("page_type".equals(s))
            {
                k1.d(cursor.getInt(i));
            } else
            if ("prompt_type".equals(s))
            {
                k1.f(cursor.getInt(i));
            } else
            if ("prompt_id".equals(s))
            {
                k1.b(cursor.getInt(i));
            } else
            if ("response_type".equals(s))
            {
                k1.c(cursor.getInt(i));
            } else
            if ("need_show".equals(s))
            {
                boolean flag;
                if (cursor.getInt(i) == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                k1.a(flag);
            }
            i++;
        }
        return k1;
    }

    public static k a(JSONObject jsonobject)
    {
        k k1 = new k();
        k1.e(jsonobject.optInt("localType", 1));
        k1.d(jsonobject.optInt("pageType", 1));
        k1.a(jsonobject.optString("text", ""));
        k1.f(jsonobject.optInt("promptType", -1));
        k1.b(jsonobject.getInt("promptId"));
        k1.c(jsonobject.optInt("responseType", -1));
        return k1;
    }

    public static List a(Context context, String as[], String s, String as1[])
    {
        ArrayList arraylist = new ArrayList();
        context = context.getContentResolver().query(WeatherContentProvider.B, as, s, as1, "_id");
        if (context != null)
        {
            if (context.moveToFirst())
            {
                do
                {
                    arraylist.add(a(((Cursor) (context))));
                } while (context.moveToNext());
            }
            context.close();
        }
        return arraylist;
    }

    public static List a(JSONArray jsonarray)
    {
        ArrayList arraylist = new ArrayList();
        int j = jsonarray.length();
        for (int i = 0; i < j; i++)
        {
            arraylist.add(a(jsonarray.getJSONObject(i)));
        }

        return arraylist;
    }

    public void a(int i)
    {
        a = i;
    }

    public void a(String s)
    {
        f = s;
    }

    public void a(boolean flag)
    {
        h = flag;
    }

    public boolean a()
    {
        return h;
    }

    public int b()
    {
        return b;
    }

    public void b(int i)
    {
        b = i;
    }

    public int c()
    {
        return c;
    }

    public void c(int i)
    {
        c = i;
    }

    public int d()
    {
        return e;
    }

    public void d(int i)
    {
        d = i;
    }

    public String e()
    {
        return f;
    }

    public void e(int i)
    {
        e = i;
    }

    public int f()
    {
        return g;
    }

    public void f(int i)
    {
        g = i;
    }
}
