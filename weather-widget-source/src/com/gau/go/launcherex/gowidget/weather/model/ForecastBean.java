// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.gau.go.launcherex.gowidget.weather.util.q;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.jiubang.goweather.a.c;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.model:
//            f

public class ForecastBean
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new f();
    String a;
    int b;
    int c;
    int d;
    String e;
    float f;
    float g;
    String h;
    int i;
    String j;
    float k;
    int l;
    int m;
    String n;
    String o;
    String p;

    public ForecastBean()
    {
        a = "";
        b = -10000;
        c = -10000;
        d = -10000;
        e = "";
        f = -10000F;
        g = -10000F;
        h = "";
        j = "";
        m = -10000;
        n = "";
        o = "";
        p = "";
    }

    private ForecastBean(Parcel parcel)
    {
        a = "";
        b = -10000;
        c = -10000;
        d = -10000;
        e = "";
        f = -10000F;
        g = -10000F;
        h = "";
        j = "";
        m = -10000;
        n = "";
        o = "";
        p = "";
        b = parcel.readInt();
        c = parcel.readInt();
        d = parcel.readInt();
        g = parcel.readFloat();
        f = parcel.readFloat();
        a = parcel.readString();
        l = parcel.readInt();
        e = parcel.readString();
        h = parcel.readString();
        i = parcel.readInt();
        j = parcel.readString();
        k = parcel.readFloat();
        m = parcel.readInt();
        p = parcel.readString();
        n = parcel.readString();
        o = parcel.readString();
    }

    ForecastBean(Parcel parcel, f f1)
    {
        this(parcel);
    }

    public float a(int i1)
    {
        if (i1 == 1 && f != -10000F)
        {
            return q.b(f, 1);
        } else
        {
            return f;
        }
    }

    public String a()
    {
        return n;
    }

    public void a(float f1)
    {
        f = f1;
    }

    public void a(int i1, int j1, int k1)
    {
        b = i1;
        c = j1;
        d = k1;
    }

    public void a(c c1)
    {
        e(c1.m());
        g = r.a(c1.h());
        f = r.a(c1.i());
        a = c1.f();
        l = c1.g();
        e = c1.e();
        h = c1.c();
        i = c1.b();
        j = c1.d();
        k = c1.a();
        m = c1.j();
        p = c1.m();
        n = c1.k();
        o = c1.l();
    }

    public void a(String s)
    {
        n = s;
    }

    public float b(int i1)
    {
        if (i1 == 1 && g != -10000F)
        {
            return q.b(g, 1);
        } else
        {
            return g;
        }
    }

    public String b()
    {
        return o;
    }

    public void b(float f1)
    {
        g = f1;
    }

    public void b(String s)
    {
        o = s;
    }

    public String c()
    {
        return p;
    }

    public void c(float f1)
    {
        k = f1;
    }

    public void c(int i1)
    {
        l = i1;
    }

    public void c(String s)
    {
        p = s;
        e(s);
    }

    public String d()
    {
        return a;
    }

    public void d(int i1)
    {
        i = i1;
    }

    public void d(String s)
    {
        a = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public int e()
    {
        return b;
    }

    public void e(int i1)
    {
        m = i1;
    }

    public void e(String s)
    {
        if (s != null && !s.equals("--"))
        {
            if ((s = s.split("/")).length >= 3)
            {
                try
                {
                    b = Integer.parseInt(s[0]);
                    c = Integer.parseInt(s[1]);
                    d = Integer.parseInt(s[2]);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    s.printStackTrace();
                }
                return;
            }
        }
    }

    public int f()
    {
        return c;
    }

    public void f(String s)
    {
        e = s;
    }

    public int g()
    {
        return d;
    }

    public void g(String s)
    {
        h = s;
    }

    public String h()
    {
        return e;
    }

    public void h(String s)
    {
        j = s;
    }

    public int i()
    {
        return l;
    }

    public String j()
    {
        return h;
    }

    public int k()
    {
        return i;
    }

    public float l()
    {
        return k;
    }

    public int m()
    {
        return m;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeInt(d);
        parcel.writeFloat(g);
        parcel.writeFloat(f);
        parcel.writeString(a);
        parcel.writeInt(l);
        parcel.writeString(e);
        parcel.writeString(h);
        parcel.writeInt(i);
        parcel.writeString(j);
        parcel.writeFloat(k);
        parcel.writeInt(m);
        parcel.writeString(p);
        parcel.writeString(n);
        parcel.writeString(o);
    }

}
