// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.gtp.a.a.b.c;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.model:
//            b

public class CityBean
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    float a;
    float b;
    int c;
    int d;
    double e[] = {
        -10000D, -10000D
    };
    double f[] = {
        -10000D, -10000D
    };
    private String g;
    private String h;
    private String i;
    private String j;
    private int k;
    private String l;
    private String m;
    private String n;

    public CityBean()
    {
        k = -10000;
        a = -10000F;
        b = -10000F;
        c = 0;
        d = 0;
    }

    private CityBean(Parcel parcel)
    {
        k = -10000;
        a = -10000F;
        b = -10000F;
        c = 0;
        d = 0;
        if (e == null)
        {
            e = (new double[] {
                -10000D, -10000D
            });
        }
        if (f == null)
        {
            f = (new double[] {
                -10000D, -10000D
            });
        }
        g = parcel.readString();
        h = parcel.readString();
        j = parcel.readString();
        i = parcel.readString();
        k = parcel.readInt();
        c = parcel.readInt();
        d = parcel.readInt();
        b = parcel.readFloat();
        a = parcel.readFloat();
        parcel.readDoubleArray(e);
        parcel.readDoubleArray(f);
    }

    CityBean(Parcel parcel, b b1)
    {
        this(parcel);
    }

    public CityBean(String s, String s1, String s2, String s3, String s4, String s5)
    {
        k = -10000;
        a = -10000F;
        b = -10000F;
        c = 0;
        d = 0;
        a(s);
        b(s1);
        d(s2);
        c(s3);
        e(s4);
        f(s5);
    }

    public String a()
    {
        return g;
    }

    public void a(float f1)
    {
        a = f1;
    }

    public void a(int i1)
    {
        k = i1;
    }

    public void a(String s)
    {
        g = s;
    }

    public void a(double ad[])
    {
        e = ad;
    }

    public String b()
    {
        return h;
    }

    public void b(float f1)
    {
        b = f1;
    }

    public void b(int i1)
    {
        c = i1;
    }

    public void b(String s)
    {
        h = s;
    }

    public void b(double ad[])
    {
        f = ad;
    }

    public String c()
    {
        return i;
    }

    public void c(int i1)
    {
        d = i1;
    }

    public void c(String s)
    {
        i = s;
    }

    public String d()
    {
        return j;
    }

    public void d(String s)
    {
        j = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public int e()
    {
        return k;
    }

    public void e(String s)
    {
        k = Integer.parseInt(s);
_L1:
        return;
        s;
        if (com.gtp.a.a.b.c.a())
        {
            s.printStackTrace();
            return;
        }
          goto _L1
    }

    public String f()
    {
        return l;
    }

    public void f(String s)
    {
        l = s;
    }

    public String g()
    {
        return m;
    }

    public void g(String s)
    {
        m = s;
    }

    public float h()
    {
        return a;
    }

    public void h(String s)
    {
        n = s;
    }

    public int i()
    {
        return c;
    }

    public float j()
    {
        return b;
    }

    public int k()
    {
        return d;
    }

    public String l()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("--------------CityBean-------------\n");
        stringbuffer.append((new StringBuilder()).append("mCityId:").append(g).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("mCityName:").append(h).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("mStateName:").append(j).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("mCountryName:").append(i).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("mTimeZone:").append(k).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("mLatitude:").append(a).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("mLongitude:").append(b).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("mHasRadar:").append(c).append("\n").toString());
        stringbuffer.append((new StringBuilder()).append("mHasSatellite:").append(d).append("\n").toString());
        return stringbuffer.toString();
    }

    public String m()
    {
        return n;
    }

    public CityBean n()
    {
        CityBean citybean = new CityBean();
        citybean.a(g);
        citybean.b(h);
        citybean.d(j);
        citybean.c(i);
        citybean.a(k);
        citybean.f(l);
        citybean.h(n);
        citybean.b(c);
        citybean.c(d);
        citybean.a(a);
        citybean.b(b);
        citybean.g(m);
        citybean.a(e);
        citybean.b(f);
        return citybean;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        if (e == null)
        {
            e = (new double[] {
                -10000D, -10000D
            });
        }
        if (f == null)
        {
            f = (new double[] {
                -10000D, -10000D
            });
        }
        parcel.writeString(g);
        parcel.writeString(h);
        parcel.writeString(j);
        parcel.writeString(i);
        parcel.writeInt(k);
        parcel.writeInt(c);
        parcel.writeInt(d);
        parcel.writeFloat(b);
        parcel.writeFloat(a);
        parcel.writeDoubleArray(e);
        parcel.writeDoubleArray(f);
    }

}
