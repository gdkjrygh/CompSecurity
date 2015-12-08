// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.gau.go.a.c.a;

public class c
{

    public int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    public int g;
    public String h;
    public String i;
    public int j;
    public String k;
    public boolean l;
    public boolean m;
    public String n;
    public c o;
    public String p;
    public boolean q;
    public int r;
    private boolean s;

    public c()
    {
        f = 0;
        g = 0;
        s = false;
        j = 3;
        m = false;
        n = "-1";
        q = false;
        r = 0;
    }

    public ContentValues a()
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(a.d, Integer.valueOf(a));
        contentvalues.put(a.w, Boolean.valueOf(q));
        contentvalues.put(a.v, k);
        contentvalues.put(a.e, b);
        contentvalues.put(a.i, h);
        contentvalues.put(a.r, Integer.valueOf(j));
        contentvalues.put(a.D, Integer.valueOf(r));
        return contentvalues;
    }

    public void a(Cursor cursor)
    {
        if (cursor != null)
        {
            int i1 = cursor.getColumnIndex(a.d);
            if (i1 != -1)
            {
                a = cursor.getInt(i1);
            }
            i1 = cursor.getColumnIndex(a.e);
            if (i1 != -1)
            {
                b = cursor.getString(i1);
            }
            i1 = cursor.getColumnIndex(a.D);
            if (i1 != -1)
            {
                r = cursor.getInt(i1);
            }
            i1 = cursor.getColumnIndex(a.i);
            if (i1 != -1)
            {
                h = cursor.getString(i1);
            }
            i1 = cursor.getColumnIndex(a.r);
            if (i1 != -1)
            {
                j = cursor.getInt(i1);
            }
            i1 = cursor.getColumnIndex(a.v);
            if (i1 != -1)
            {
                k = cursor.getString(i1);
            }
            i1 = cursor.getColumnIndex(a.w);
            if (i1 != -1)
            {
                boolean flag;
                if (cursor.getInt(i1) == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                q = flag;
            }
            s = true;
        }
    }

    public void a(boolean flag)
    {
        s = flag;
    }
}
