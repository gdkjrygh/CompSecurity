// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.b;

import android.text.TextUtils;
import java.io.File;

public class e
{

    private int a;
    private long b;
    private String c;
    private String d;
    private long e;
    private long f;
    private boolean g;
    private String h;
    private String i;
    private String j;

    public e()
    {
        b = -1L;
        c = "";
        d = "";
        e = 0L;
        f = 0L;
        g = false;
    }

    public String a()
    {
        return h;
    }

    public void a(int i1)
    {
        a = i1;
    }

    public void a(long l1)
    {
        b = l1;
    }

    public void a(String s)
    {
        h = s;
    }

    public void a(boolean flag)
    {
        g = flag;
    }

    public String b()
    {
        return i;
    }

    public void b(long l1)
    {
        e = l1;
    }

    public void b(String s)
    {
        i = s;
    }

    public String c()
    {
        return j;
    }

    public void c(long l1)
    {
        f = l1;
    }

    public void c(String s)
    {
        j = s;
    }

    public int d()
    {
        return a;
    }

    public void d(String s)
    {
        c = s;
    }

    public void e(String s)
    {
        d = s;
    }

    public boolean e()
    {
        return g;
    }

    public long f()
    {
        return b;
    }

    public String g()
    {
        return c;
    }

    public String h()
    {
        return d;
    }

    public long i()
    {
        return e;
    }

    public long j()
    {
        return f;
    }

    public boolean k()
    {
        boolean flag1 = true;
        boolean flag;
        if (!TextUtils.isEmpty(c))
        {
            if ((new File(c)).length() == e)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            return flag;
        }
        if (g && !TextUtils.isEmpty(d))
        {
            if ((new File(d)).length() == f)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        return flag;
    }

    public boolean l()
    {
        boolean flag = false;
        if (!TextUtils.isEmpty(c))
        {
            flag = (new File(c)).exists();
        }
        return flag;
    }

    public boolean m()
    {
        boolean flag = false;
        if (!TextUtils.isEmpty(d))
        {
            flag = (new File(d)).exists();
        }
        return flag;
    }
}
