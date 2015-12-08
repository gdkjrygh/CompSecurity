// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.download;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gau.go.launcherex.gowidget.download:
//            f

public class e
{

    private long a;
    private String b;
    private String c;
    private String d;
    private long e;
    private int f;
    private String g;
    private ArrayList h;
    private int i;
    private String j;

    public e(long l, String s, String s1, long l1, int i1, 
            String s2, String s3)
    {
        i = 0;
        if (l == 0x8000000000000000L)
        {
            a = System.currentTimeMillis();
        } else
        {
            a = l;
        }
        b = s;
        c = s1;
        e = l1;
        f = i1;
        g = s2;
        d = s3;
    }

    public void a()
    {
        e = 0L;
        f = 0;
        i = 2;
    }

    public void a(int l)
    {
        f = l;
    }

    public void a(long l)
    {
        e = l;
    }

    public void a(f f1)
    {
        if (f1 != null)
        {
            if (h == null)
            {
                h = new ArrayList();
            }
            h.add(f1);
        }
    }

    public void a(String s)
    {
        b = s;
    }

    public long b()
    {
        return a;
    }

    public void b(int l)
    {
        i = l;
    }

    public void b(String s)
    {
        c = s;
    }

    public String c()
    {
        return b;
    }

    public void c(int l)
    {
        if (h != null)
        {
            Iterator iterator = h.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                f f1 = (f)iterator.next();
                if (f1 == null)
                {
                    continue;
                }
                switch (l)
                {
                case 1: // '\001'
                    f1.a(this);
                    break;

                case 6: // '\006'
                    f1.f(this);
                    break;

                case 2: // '\002'
                    f1.b(this);
                    break;

                case 5: // '\005'
                    f1.e(this);
                    break;

                case 4: // '\004'
                    f1.d(this);
                    break;

                case 3: // '\003'
                    f1.c(this);
                    break;

                case 7: // '\007'
                    f1.g(this);
                    break;
                }
            } while (true);
        }
    }

    public void c(String s)
    {
        j = s;
    }

    public String d()
    {
        return c;
    }

    public long e()
    {
        return e;
    }

    public int f()
    {
        return f;
    }

    public String g()
    {
        return g;
    }

    public int h()
    {
        return i;
    }

    public String i()
    {
        return j;
    }

    public String j()
    {
        return d;
    }

    public void k()
    {
        b = null;
        c = null;
        g = null;
        if (h != null)
        {
            Iterator iterator = h.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                f f1 = (f)iterator.next();
                if (f1 != null)
                {
                    f1.h(this);
                }
            } while (true);
            h.clear();
            h = null;
        }
        j = null;
        d = null;
    }
}
