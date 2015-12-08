// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.a.a;

import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.gau.go.launcherex.goweather.a.a:
//            b

public class a
{

    private final b a = new b(128D, 128D);
    private final double b = 0.71111112833023071D;
    private final double c = 40.743665431525208D;

    public a()
    {
    }

    public static double a(double d)
    {
        return d / 0.017453292519943295D;
    }

    public LatLng a(b b1)
    {
        double d = (b1.b - a.b) / b;
        return new LatLng(a(Math.atan(Math.exp((b1.a - a.a) / -c)) * 2D - 1.5707963267948966D), d);
    }
}
