// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j;

import android.database.Cursor;

public class j
{

    protected int a;
    protected int b;
    protected String c;
    protected String d;

    public j()
    {
        a = 0;
        b = 0;
        c = "";
    }

    public static j a(Cursor cursor)
    {
        j j1 = new j();
        int k = cursor.getColumnCount();
        int i = 0;
        while (i < k) 
        {
            String s = cursor.getColumnName(i);
            if ("current_cityid".equals(s))
            {
                j1.a(cursor.getString(i));
            } else
            if ("widget_type".equals(s))
            {
                j1.b(cursor.getInt(i));
            } else
            if ("widget_id".equals(s))
            {
                j1.a(cursor.getInt(i));
            } else
            if ("theme_package_name".equals(s))
            {
                j1.b(cursor.getString(i));
            }
            i++;
        }
        return j1;
    }

    public static j b(Cursor cursor)
    {
        j j1 = new j();
        int k = cursor.getColumnCount();
        int i = 0;
        while (i < k) 
        {
            String s = cursor.getColumnName(i);
            if ("city_id".equals(s))
            {
                j1.a(cursor.getString(i));
            } else
            if ("go_widget_type".equals(s))
            {
                j1.b(cursor.getInt(i));
            } else
            if ("go_widget_id".equals(s))
            {
                j1.a(cursor.getInt(i));
            } else
            if ("widget_theme".equals(s))
            {
                j1.b(cursor.getString(i));
            }
            i++;
        }
        return j1;
    }

    public int a()
    {
        return a;
    }

    public void a(int i)
    {
        a = i;
    }

    public void a(String s)
    {
        c = s;
    }

    public String b()
    {
        return c;
    }

    public void b(int i)
    {
        b = i;
    }

    public void b(String s)
    {
        d = s;
    }

    public String c()
    {
        return d;
    }
}
