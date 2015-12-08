// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.model;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.model:
//            w

public class ThemeDataBean
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new w();
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
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
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;
    private boolean z;

    public ThemeDataBean()
    {
        v = false;
        w = false;
        x = false;
        y = -1;
        z = false;
        A = false;
        B = false;
        C = false;
    }

    private ThemeDataBean(Parcel parcel)
    {
        v = false;
        w = false;
        x = false;
        y = -1;
        z = false;
        A = false;
        B = false;
        C = false;
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

    ThemeDataBean(Parcel parcel, w w1)
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

    public void a(boolean flag)
    {
        z = flag;
    }

    public String b()
    {
        return e;
    }

    public void b(int i1)
    {
        c = i1;
    }

    public void b(String s1)
    {
        f = s1;
    }

    public String c()
    {
        return j;
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
        return p;
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
        return q;
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
        return s;
    }

    public void f(int i1)
    {
        D = i1;
    }

    public void f(String s1)
    {
        l = s1;
    }

    public String g()
    {
        return t;
    }

    public void g(int i1)
    {
        y = i1;
    }

    public void g(String s1)
    {
        m = s1;
    }

    public void h(String s1)
    {
        n = s1;
    }

    public void i(String s1)
    {
        o = s1;
    }

    public void j(String s1)
    {
        p = s1;
    }

    public void k(String s1)
    {
        q = s1;
    }

    public void l(String s1)
    {
        r = s1;
    }

    public void m(String s1)
    {
        s = s1;
    }

    public void n(String s1)
    {
        t = s1;
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
