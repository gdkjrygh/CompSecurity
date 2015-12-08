// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.b;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

// Referenced classes of package com.gtp.go.weather.sharephoto.b:
//            g, e

public class p
{

    private boolean a;
    private long b;
    private String c;
    private String d;
    private boolean e;
    private int f;
    private int g;
    private int h;
    private String i;
    private String j;
    private long k;
    private long l;
    private boolean m;
    private long n;
    private String o;
    private String p;
    private String q;
    private String r;
    private e s;

    public p(e e1)
    {
        d = "";
        k = 0L;
        l = 0L;
        m = false;
        o = "";
        p = "";
        q = "";
        r = "";
        a(e1);
    }

    public p(g g1)
    {
        d = "";
        k = 0L;
        l = 0L;
        m = false;
        o = "";
        p = "";
        q = "";
        r = "";
        a = false;
        b = g1.a();
        c = g1.l();
        d = g1.m();
        o = a(g1.k());
        n = g1.j();
        p = g1.x();
        q = g1.p();
        r = g1.t();
        e = g1.h();
        f = g1.c();
        g = g1.d();
    }

    private String a(String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            return s1.split("\\s")[0];
        } else
        {
            return "unknown";
        }
    }

    public static ArrayList a(ArrayList arraylist)
    {
        ArrayList arraylist1 = new ArrayList();
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); arraylist1.add(new p((e)arraylist.next()))) { }
        return arraylist1;
    }

    private String n()
    {
        return (new SimpleDateFormat("yyyy/MM/dd", Locale.US)).format(Long.valueOf(System.currentTimeMillis()));
    }

    public e a()
    {
        return s;
    }

    public void a(int i1)
    {
        f = Math.max(0, f + i1);
    }

    public void a(e e1)
    {
        a = true;
        b = e1.f();
        c = e1.c();
        d = e1.a();
        o = n();
        s = e1;
        h = e1.d();
        i = e1.g();
        j = e1.h();
        k = e1.i();
        l = e1.j();
        m = e1.m();
    }

    public void a(boolean flag)
    {
        e = flag;
    }

    public boolean b()
    {
        return a;
    }

    public long c()
    {
        return b;
    }

    public String d()
    {
        return c;
    }

    public String e()
    {
        return d;
    }

    public String f()
    {
        return i;
    }

    public String g()
    {
        return j;
    }

    public boolean h()
    {
        return s.k();
    }

    public String i()
    {
        return o;
    }

    public String j()
    {
        return p;
    }

    public boolean k()
    {
        return e;
    }

    public int l()
    {
        return f;
    }

    public int m()
    {
        return g;
    }
}
