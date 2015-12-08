// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.Time;
import com.jiubang.goweather.a.f;
import com.jiubang.goweather.a.g;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.model:
//            p, q

public class PollenIndexBean
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new p();
    private long a;
    private int b;
    private int c;
    private int d;
    private int e;
    private float f;
    private List g;

    public PollenIndexBean()
    {
        a = -10000L;
        b = -10000;
        c = -10000;
        d = -10000;
        e = -10000;
        f = -10000F;
        g = null;
        g = new ArrayList();
    }

    private PollenIndexBean(Parcel parcel)
    {
        a = -10000L;
        b = -10000;
        c = -10000;
        d = -10000;
        e = -10000;
        f = -10000F;
        g = null;
        a = parcel.readLong();
        b = parcel.readInt();
        c = parcel.readInt();
        d = parcel.readInt();
        e = parcel.readInt();
        f = parcel.readFloat();
        g = new ArrayList();
        parcel.readList(g, com/gau/go/launcherex/gowidget/weather/model/q.getClassLoader());
    }

    PollenIndexBean(Parcel parcel, p p1)
    {
        this(parcel);
    }

    public long a()
    {
        return a;
    }

    public void a(float f1)
    {
        f = f1;
    }

    public void a(long l, int i)
    {
        Time time = new Time();
        if (i != -10000)
        {
            String as[] = TimeZone.getAvailableIDs(i);
            if (as.length > 0)
            {
                time.switchTimezone(as[0]);
            }
        }
        a = (l - time.gmtoff) + (long)i;
        time.set(a);
        b = time.year;
        c = time.month;
        d = time.monthDay;
        e = time.weekDay;
    }

    public void a(q q1)
    {
        if (g == null)
        {
            g = new ArrayList();
        }
        g.add(q1);
    }

    public void a(f f1, int i)
    {
        boolean flag = false;
        Time time = new Time();
        if (i != -10000)
        {
            String as[] = TimeZone.getAvailableIDs(i);
            if (as.length > 0)
            {
                time.switchTimezone(as[0]);
            }
        }
        a = f1.a;
        time.set(a);
        b = time.year;
        c = time.month;
        d = time.monthDay;
        e = time.weekDay;
        f = f1.b;
        int j = f1.a();
        for (i = ((flag) ? 1 : 0); i < j; i++)
        {
            g g1 = f1.a(i);
            g.add(new q(g1.a, g1.b, g1.c));
        }

    }

    public int b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public int d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public int e()
    {
        return e;
    }

    public float f()
    {
        return f;
    }

    public List g()
    {
        return g;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(a);
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeInt(d);
        parcel.writeInt(e);
        parcel.writeFloat(f);
        parcel.writeList(g);
    }

}
