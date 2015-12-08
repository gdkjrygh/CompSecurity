// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.gau.go.launcherex.gowidget.weather.util.q;
import com.jiubang.goweather.a.d;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.model:
//            k

public class HourlyBean
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new k();
    int a;
    int b;
    int c;
    int d;
    float e;
    int f;
    String g;
    String h;
    int i;
    float j;
    String k;
    int l;

    public HourlyBean()
    {
        a = -10000;
        b = -10000;
        c = -10000;
        e = -10000F;
        g = "";
        h = "";
        j = -10000F;
        k = "";
        l = -10000;
    }

    private HourlyBean(Parcel parcel)
    {
        a = -10000;
        b = -10000;
        c = -10000;
        e = -10000F;
        g = "";
        h = "";
        j = -10000F;
        k = "";
        l = -10000;
        a = parcel.readInt();
        b = parcel.readInt();
        c = parcel.readInt();
        d = parcel.readInt();
        k = parcel.readString();
        f = parcel.readInt();
        e = parcel.readFloat();
        g = parcel.readString();
        i = parcel.readInt();
        h = parcel.readString();
        j = parcel.readFloat();
        l = parcel.readInt();
    }

    HourlyBean(Parcel parcel, k k1)
    {
        this(parcel);
    }

    public int a()
    {
        return a;
    }

    public void a(float f1)
    {
        e = f1;
    }

    public void a(int i1)
    {
        d = i1;
    }

    public void a(int i1, int j1, int k1)
    {
        a = i1;
        b = j1;
        c = k1;
    }

    public void a(d d1)
    {
        a(d1.c());
        d = d1.f();
        k = d1.g();
        f = d1.j();
        e = d1.h();
        g = d1.d();
        i = d1.a();
        h = d1.e();
        j = d1.b();
        l = d1.k();
    }

    public void a(String s)
    {
        if (s != null && !s.equals("--"))
        {
            if ((s = s.split("/")).length >= 3)
            {
                try
                {
                    a = Integer.parseInt(s[0]);
                    b = Integer.parseInt(s[1]);
                    c = Integer.parseInt(s[2]);
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

    public float b(int i1)
    {
        if (i1 == 1 && e != -10000F)
        {
            return q.b(e, 1);
        } else
        {
            return e;
        }
    }

    public int b()
    {
        return b;
    }

    public void b(float f1)
    {
        j = f1;
    }

    public void b(String s)
    {
        g = s;
    }

    public int c()
    {
        return c;
    }

    public void c(int i1)
    {
        f = i1;
    }

    public void c(String s)
    {
        h = s;
    }

    public int d()
    {
        return d;
    }

    public void d(int i1)
    {
        i = i1;
    }

    public void d(String s)
    {
        k = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public int e()
    {
        return f;
    }

    public void e(int i1)
    {
        l = i1;
    }

    public String f()
    {
        return g;
    }

    public String g()
    {
        return k;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeInt(a);
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeInt(d);
        parcel.writeString(k);
        parcel.writeInt(f);
        parcel.writeFloat(e);
        parcel.writeString(g);
        parcel.writeInt(i);
        parcel.writeString(h);
        parcel.writeFloat(j);
        parcel.writeInt(l);
    }

}
