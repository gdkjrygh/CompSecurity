// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.a;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.gtp.a.a.b.c;
import com.jiubang.goweather.b.e;
import java.io.UnsupportedEncodingException;

// Referenced classes of package com.gau.go.launcherex.goweather.a:
//            a, g

public class f extends a
{

    private double a;
    private double b;
    private double c;
    private double d;
    private int e;
    private int f;
    private String g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private String m;

    public f()
    {
        m = "http://gwm.3g.cn:8099/goweatherexMeteor/satellite/image";
        h = 0;
        g = g.b.e;
        i = 0;
        j = 0;
        k = 107;
        l = 2;
    }

    private boolean n()
    {
        return f == 0 || e == 0 || b == a || d == c;
    }

    public int a()
    {
        return l;
    }

    public void a(double d1)
    {
        a = d1;
    }

    public void a(int i1)
    {
        l = i1;
    }

    public void a(g g1)
    {
        g = g1.e;
    }

    public void a(LatLngBounds latlngbounds)
    {
        b(latlngbounds.northeast.latitude);
        c(latlngbounds.southwest.longitude);
        a(latlngbounds.southwest.latitude);
        d(latlngbounds.northeast.longitude);
    }

    public void a(String s)
    {
        m = s;
    }

    public int b()
    {
        return k;
    }

    public void b(double d1)
    {
        b = d1;
    }

    public void b(int i1)
    {
        e = i1;
    }

    public int c()
    {
        return j;
    }

    public void c(double d1)
    {
        c = d1;
    }

    public void c(int i1)
    {
        f = i1;
    }

    public int d()
    {
        return i;
    }

    public void d(double d1)
    {
        d = d1;
    }

    public double e()
    {
        return a;
    }

    public double f()
    {
        return b;
    }

    public double g()
    {
        return c;
    }

    public double h()
    {
        return d;
    }

    public int i()
    {
        return e;
    }

    public int j()
    {
        return f;
    }

    public String k()
    {
        return g;
    }

    public int l()
    {
        return h;
    }

    public String m()
    {
        Object obj1 = null;
        Object obj = obj1;
        if (!n())
        {
            obj = new e(m, "GET");
            ((e) (obj)).a("minlat", String.valueOf(e()));
            ((e) (obj)).a("maxlat", String.valueOf(f()));
            ((e) (obj)).a("minlon", String.valueOf(g()));
            ((e) (obj)).a("maxlon", String.valueOf(h()));
            ((e) (obj)).a("width", String.valueOf(i()));
            ((e) (obj)).a("height", String.valueOf(j()));
            ((e) (obj)).a("key", String.valueOf(k()));
            ((e) (obj)).a("basemap", String.valueOf(l()));
            ((e) (obj)).a("timelabel", String.valueOf(d()));
            ((e) (obj)).a("smooth", String.valueOf(c()));
            ((e) (obj)).a("gtt", String.valueOf(b()));
            ((e) (obj)).a("zoom", String.valueOf(a()));
            try
            {
                obj = ((e) (obj)).i();
            }
            catch (UnsupportedEncodingException unsupportedencodingexception)
            {
                obj = obj1;
                if (com.gtp.a.a.b.c.a())
                {
                    unsupportedencodingexception.printStackTrace();
                    return null;
                }
            }
        }
        return ((String) (obj));
    }
}
