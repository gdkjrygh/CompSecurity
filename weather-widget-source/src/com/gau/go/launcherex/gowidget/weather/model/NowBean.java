// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.util.q;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.jiubang.goweather.a.a;
import com.jiubang.goweather.a.e;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.model:
//            n

public class NowBean
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new n();
    int A;
    int B;
    int C;
    float D;
    float E;
    int F;
    int G;
    double H[] = {
        -10000D, -10000D
    };
    double I[] = {
        -10000D, -10000D
    };
    String J;
    float a;
    float b;
    float c;
    int d;
    int e;
    String f;
    long g;
    long h;
    long i;
    float j;
    float k;
    float l;
    String m;
    String n;
    float o;
    String p;
    String q;
    float r;
    int s;
    int t;
    int u;
    float v;
    float w;
    int x;
    int y;
    int z;

    public NowBean()
    {
        a = -10000F;
        b = -10000F;
        c = -10000F;
        d = -10000;
        e = 1;
        f = "";
        g = -10000L;
        h = -10000L;
        i = -10000L;
        j = -10000F;
        k = -10000F;
        l = -10000F;
        m = "";
        n = "";
        o = -10000F;
        p = "";
        q = "";
        r = -10000F;
        t = -10000;
        u = -10000;
        v = -10000F;
        w = -10000F;
        x = -10000;
        y = -10000;
        z = -10000;
        A = -10000;
        B = -10000;
        C = -10000;
        D = -10000F;
        E = -10000F;
        F = 0;
        G = 0;
    }

    private NowBean(Parcel parcel)
    {
        a = -10000F;
        b = -10000F;
        c = -10000F;
        d = -10000;
        e = 1;
        f = "";
        g = -10000L;
        h = -10000L;
        i = -10000L;
        j = -10000F;
        k = -10000F;
        l = -10000F;
        m = "";
        n = "";
        o = -10000F;
        p = "";
        q = "";
        r = -10000F;
        t = -10000;
        u = -10000;
        v = -10000F;
        w = -10000F;
        x = -10000;
        y = -10000;
        z = -10000;
        A = -10000;
        B = -10000;
        C = -10000;
        D = -10000F;
        E = -10000F;
        F = 0;
        G = 0;
        k = parcel.readFloat();
        l = parcel.readFloat();
        j = parcel.readFloat();
        m = parcel.readString();
        n = parcel.readString();
        o = parcel.readFloat();
        v = parcel.readFloat();
        u = parcel.readInt();
        w = parcel.readFloat();
        a = parcel.readFloat();
        c = parcel.readFloat();
        b = parcel.readFloat();
        f = parcel.readString();
        d = parcel.readInt();
        e = parcel.readInt();
        g = parcel.readLong();
        h = parcel.readLong();
        i = parcel.readLong();
        p = parcel.readString();
        s = parcel.readInt();
        q = parcel.readString();
        r = parcel.readFloat();
        t = parcel.readInt();
        x = parcel.readInt();
        y = parcel.readInt();
        z = parcel.readInt();
        A = parcel.readInt();
        B = parcel.readInt();
        C = parcel.readInt();
        J = parcel.readString();
    }

    NowBean(Parcel parcel, n n1)
    {
        this(parcel);
    }

    public double[] A()
    {
        return I;
    }

    public long B()
    {
        return i;
    }

    public String C()
    {
        return J;
    }

    public float a()
    {
        return r;
    }

    public float a(int i1)
    {
        if (i1 == 1 && a != -10000F)
        {
            return com.gau.go.launcherex.gowidget.weather.util.q.b(a, 1);
        } else
        {
            return a;
        }
    }

    public void a(float f1)
    {
        r = f1;
    }

    public void a(long l1)
    {
        g = l1;
    }

    public void a(a a1)
    {
        e e1 = a1.q();
        k = e1.k();
        l = e1.l();
        j = e1.j();
        m = e1.n();
        n = e1.o();
        o = e1.m();
        v = e1.i();
        u = e1.p();
        w = e1.x();
        a = com.gau.go.launcherex.gowidget.weather.util.r.a(e1.v());
        c = com.gau.go.launcherex.gowidget.weather.util.r.a(e1.s());
        b = com.gau.go.launcherex.gowidget.weather.util.r.a(e1.r());
        f = e1.t();
        d = e1.w();
        e = e1.u();
        g = a1.n();
        h = a1.o();
        i = a1.p();
        p = e1.q();
        s = e1.g();
        q = e1.h();
        r = e1.f();
        t = a1.u();
        H = a1.j();
        I = a1.l();
        x = e1.y();
        y = e1.a();
        z = e1.b();
        A = e1.c();
        B = e1.d();
        C = e1.e();
        E = a1.f();
        D = a1.g();
        F = a1.h();
        G = a1.i();
        J = a1.m;
    }

    public void a(String s1)
    {
        p = s1;
    }

    public void a(double ad[])
    {
        H = ad;
    }

    public float b(int i1)
    {
        if (i1 == 1 && b != -10000F)
        {
            return com.gau.go.launcherex.gowidget.weather.util.q.b(b, 1);
        } else
        {
            return b;
        }
    }

    public String b()
    {
        return p;
    }

    public void b(float f1)
    {
        a = f1;
    }

    public void b(long l1)
    {
        h = l1;
    }

    public void b(String s1)
    {
        q = s1;
    }

    public void b(double ad[])
    {
        I = ad;
    }

    public float c(int i1)
    {
        if (i1 == 1 && c != -10000F)
        {
            return com.gau.go.launcherex.gowidget.weather.util.q.b(c, 1);
        } else
        {
            return c;
        }
    }

    public int c()
    {
        return d;
    }

    public void c(float f1)
    {
        b = f1;
    }

    public void c(String s1)
    {
        f = s1;
    }

    public int d()
    {
        return e;
    }

    public void d(float f1)
    {
        c = f1;
    }

    public void d(int i1)
    {
        d = i1;
    }

    public void d(String s1)
    {
        m = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return f;
    }

    public void e(float f1)
    {
        j = f1;
    }

    public void e(int i1)
    {
        e = i1;
    }

    public void e(String s1)
    {
        n = s1;
    }

    public float f(int i1)
    {
        if (i1 == 1 && l != -10000F)
        {
            return com.gau.go.launcherex.gowidget.weather.util.q.b(l, 1);
        } else
        {
            return l;
        }
    }

    public long f()
    {
        return g;
    }

    public void f(float f1)
    {
        k = f1;
    }

    public void f(String s1)
    {
        J = s1;
    }

    public long g()
    {
        return h;
    }

    public void g(float f1)
    {
        l = f1;
    }

    public void g(int i1)
    {
        s = i1;
    }

    public float h()
    {
        return j;
    }

    public void h(float f1)
    {
        o = f1;
    }

    public void h(int i1)
    {
        t = i1;
    }

    public float i()
    {
        return k;
    }

    public void i(float f1)
    {
        w = f1;
    }

    public void i(int i1)
    {
        u = i1;
    }

    public float j(int i1)
    {
        if (i1 == 1 && v != -10000F)
        {
            return com.gau.go.launcherex.gowidget.weather.util.q.b(v, 1);
        } else
        {
            return v;
        }
    }

    public String j()
    {
        return m;
    }

    public void j(float f1)
    {
        v = f1;
    }

    public String k()
    {
        return n;
    }

    public void k(float f1)
    {
        D = f1;
    }

    public void k(int i1)
    {
        x = i1;
    }

    public float l()
    {
        return o;
    }

    public void l(float f1)
    {
        E = f1;
    }

    public void l(int i1)
    {
        y = i1;
    }

    public int m()
    {
        return s;
    }

    public void m(int i1)
    {
        z = i1;
    }

    public int n()
    {
        return t;
    }

    public void n(int i1)
    {
        A = i1;
    }

    public int o()
    {
        return u;
    }

    public void o(int i1)
    {
        B = i1;
    }

    public int p()
    {
        return x;
    }

    public void p(int i1)
    {
        C = i1;
    }

    public int q()
    {
        return y;
    }

    public void q(int i1)
    {
        F = i1;
    }

    public int r()
    {
        return z;
    }

    public void r(int i1)
    {
        G = i1;
    }

    public int s()
    {
        return A;
    }

    public int t()
    {
        return B;
    }

    public int u()
    {
        return C;
    }

    public float v()
    {
        return D;
    }

    public float w()
    {
        return E;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeFloat(k);
        parcel.writeFloat(l);
        parcel.writeFloat(j);
        parcel.writeString(m);
        parcel.writeString(n);
        parcel.writeFloat(o);
        parcel.writeFloat(v);
        parcel.writeInt(u);
        parcel.writeFloat(w);
        parcel.writeFloat(a);
        parcel.writeFloat(c);
        parcel.writeFloat(b);
        parcel.writeString(f);
        parcel.writeInt(d);
        parcel.writeInt(e);
        parcel.writeLong(g);
        parcel.writeLong(h);
        parcel.writeLong(i);
        parcel.writeString(p);
        parcel.writeInt(s);
        parcel.writeString(q);
        parcel.writeFloat(r);
        parcel.writeInt(t);
        parcel.writeInt(x);
        parcel.writeInt(y);
        parcel.writeInt(z);
        parcel.writeInt(A);
        parcel.writeInt(B);
        parcel.writeInt(C);
        parcel.writeString(J);
    }

    public int x()
    {
        return !TextUtils.isEmpty(J) ? 1 : 0;
    }

    public int y()
    {
        return G;
    }

    public double[] z()
    {
        return H;
    }

}
