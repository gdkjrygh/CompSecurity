// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.a;

import com.jiubang.commerce.ad.b.a.b;
import com.jiubang.commerce.ad.b.a.d;
import com.jiubang.commerce.ad.b.a.h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
    implements Serializable
{

    private String A;
    private String B;
    private int C;
    private String D;
    private int E;
    private int F;
    private int G;
    private String H;
    private int I;
    private String J;
    private String K;
    private String L;
    private int M;
    private int N;
    private int O;
    private int a;
    private int b;
    private int c;
    private String d;
    private int e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private boolean l;
    private boolean m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private int v;
    private String w;
    private String x;
    private int y;
    private String z;

    public a()
    {
        m = false;
    }

    public static List a(List list)
    {
        if (list == null || list.isEmpty())
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            h h1 = (h)list.next();
            if (h1 != null)
            {
                a a1 = new a();
                a1.G = h1.q();
                a1.a = h1.r();
                a1.b = h1.a();
                a1.c = h1.b();
                a1.d = "";
                a1.e = h1.d();
                a1.f = h1.c();
                a1.g = h1.i();
                a1.h = h1.g();
                a1.i = h1.h();
                a1.j = "";
                a1.k = "";
                a1.l = false;
                a1.n = h1.j();
                a1.o = "";
                a1.p = "0";
                a1.q = "";
                a1.r = String.valueOf(h1.p());
                a1.s = "";
                a1.t = "";
                a1.u = h1.k();
                a1.v = h1.f();
                a1.w = h1.e();
                a1.x = "";
                a1.y = 0;
                a1.z = h1.l();
                a1.A = h1.m();
                a1.B = h1.n();
                a1.C = 1;
                a1.D = h1.e();
                a1.E = h1.o();
                a1.F = 2;
                a1.H = h1.s();
                a1.I = h1.t();
                arraylist.add(a1);
            }
        } while (true);
        return arraylist;
    }

    public static List b(List list)
    {
        if (list == null || list.isEmpty())
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            b b1 = (b)list.next();
            if (b1 != null)
            {
                a a1 = new a();
                a1.G = b1.B();
                a1.a = b1.E();
                a1.b = b1.F();
                a1.c = b1.G();
                a1.d = b1.C();
                a1.e = b1.a();
                a1.f = b1.b();
                a1.g = b1.c();
                a1.h = b1.h();
                a1.i = b1.d();
                a1.j = b1.e();
                a1.k = b1.f();
                a1.l = b1.g();
                a1.n = b1.i();
                a1.o = b1.j();
                a1.p = b1.k();
                a1.q = b1.l();
                a1.r = b1.n();
                a1.s = b1.m();
                a1.t = b1.p();
                a1.u = b1.q();
                a1.v = b1.s();
                a1.w = b1.t();
                a1.x = b1.u();
                a1.y = b1.x();
                a1.z = b1.y();
                a1.A = b1.z();
                a1.B = b1.A();
                a1.C = b1.v();
                a1.D = b1.w();
                a1.E = b1.r();
                a1.F = b1.D();
                a1.H = b1.H();
                a1.I = b1.I();
                a1.J = b1.o();
                a1.m = b1.L();
                a1.K = b1.J();
                a1.L = b1.K();
                a1.M = b1.M();
                a1.N = b1.N();
                arraylist.add(a1);
            }
        } while (true);
        return arraylist;
    }

    public static List c(List list)
    {
        if (list == null || list.isEmpty())
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            d d1 = (d)list.next();
            if (d1 != null)
            {
                a a1 = new a();
                a1.G = d1.h();
                a1.e = d1.b();
                a1.f = d1.a();
                a1.g = d1.d();
                a1.h = d1.f();
                a1.i = d1.g();
                a1.C = 1;
                a1.D = d1.c();
                a1.E = d1.e();
                arraylist.add(a1);
            }
        } while (true);
        return arraylist;
    }

    public int a()
    {
        return G;
    }

    public void a(int i1)
    {
        C = i1;
    }

    public int b()
    {
        return a;
    }

    public void b(int i1)
    {
        E = i1;
    }

    public int c()
    {
        return b;
    }

    public void c(int i1)
    {
        O = i1;
    }

    public int d()
    {
        return c;
    }

    public int e()
    {
        return e;
    }

    public String f()
    {
        return f;
    }

    public String g()
    {
        return g;
    }

    public String h()
    {
        return h;
    }

    public String i()
    {
        return i;
    }

    public boolean j()
    {
        return l;
    }

    public String k()
    {
        return w;
    }

    public String l()
    {
        return x;
    }

    public String m()
    {
        return z;
    }

    public String n()
    {
        return A;
    }

    public String o()
    {
        return B;
    }

    public int p()
    {
        return C;
    }

    public String q()
    {
        return D;
    }

    public int r()
    {
        return E;
    }

    public String s()
    {
        return H;
    }

    public int t()
    {
        return I;
    }

    public int u()
    {
        return O;
    }

    public String v()
    {
        return J;
    }

    public int w()
    {
        return N;
    }
}
