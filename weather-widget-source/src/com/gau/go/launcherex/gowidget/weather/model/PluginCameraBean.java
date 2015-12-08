// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.model;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.model:
//            o

public class PluginCameraBean
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new o();
    private int a;
    private int b;
    private int c;
    private int d;
    private String e;
    private String f;
    private String g;
    private String h;
    private int i;
    private String j;
    private int k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private int v;

    public PluginCameraBean()
    {
        v = -1;
    }

    private PluginCameraBean(Parcel parcel)
    {
        v = -1;
        c = parcel.readInt();
        k = parcel.readInt();
        a = parcel.readInt();
        d = parcel.readInt();
        b = parcel.readInt();
        i = parcel.readInt();
        q = parcel.readString();
        o = parcel.readString();
        p = parcel.readString();
        r = parcel.readString();
        f = parcel.readString();
        e = parcel.readString();
        s = parcel.readString();
        j = parcel.readString();
        l = parcel.readString();
        m = parcel.readString();
        g = parcel.readString();
        n = parcel.readString();
        h = parcel.readString();
        t = parcel.readString();
        u = parcel.readString();
    }

    PluginCameraBean(Parcel parcel, o o1)
    {
        this(parcel);
    }

    public int a()
    {
        return b;
    }

    public void a(int i1)
    {
        b = i1;
    }

    public void a(String s1)
    {
        e = s1;
    }

    public int b()
    {
        return c;
    }

    public void b(int i1)
    {
        c = i1;
    }

    public void b(String s1)
    {
        f = s1;
    }

    public int c()
    {
        return d;
    }

    public void c(int i1)
    {
        d = i1;
    }

    public void c(String s1)
    {
        g = s1;
    }

    public String d()
    {
        return e;
    }

    public void d(int i1)
    {
        i = i1;
    }

    public void d(String s1)
    {
        h = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return f;
    }

    public void e(int i1)
    {
        k = i1;
    }

    public void e(String s1)
    {
        j = s1;
    }

    public String f()
    {
        return g;
    }

    public void f(String s1)
    {
        l = s1;
    }

    public String g()
    {
        return h;
    }

    public void g(String s1)
    {
        m = s1;
    }

    public int h()
    {
        return i;
    }

    public void h(String s1)
    {
        n = s1;
    }

    public String i()
    {
        return j;
    }

    public void i(String s1)
    {
        o = s1;
    }

    public int j()
    {
        return k;
    }

    public void j(String s1)
    {
        p = s1;
    }

    public String k()
    {
        return l;
    }

    public void k(String s1)
    {
        q = s1;
    }

    public String l()
    {
        return m;
    }

    public void l(String s1)
    {
        r = s1;
    }

    public String m()
    {
        return n;
    }

    public void m(String s1)
    {
        s = s1;
    }

    public String n()
    {
        return o;
    }

    public void n(String s1)
    {
        t = s1;
    }

    public String o()
    {
        return p;
    }

    public String p()
    {
        return q;
    }

    public String q()
    {
        return r;
    }

    public String r()
    {
        return s;
    }

    public String s()
    {
        return t;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeInt(c);
        parcel.writeInt(k);
        parcel.writeInt(a);
        parcel.writeInt(d);
        parcel.writeInt(b);
        parcel.writeInt(i);
        parcel.writeString(q);
        parcel.writeString(o);
        parcel.writeString(p);
        parcel.writeString(r);
        parcel.writeString(f);
        parcel.writeString(e);
        parcel.writeString(s);
        parcel.writeString(j);
        parcel.writeString(l);
        parcel.writeString(m);
        parcel.writeString(g);
        parcel.writeString(n);
        parcel.writeString(h);
        parcel.writeString(t);
        parcel.writeString(u);
    }

}
