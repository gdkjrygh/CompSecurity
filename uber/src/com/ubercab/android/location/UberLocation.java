// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.location;

import android.os.Parcelable;
import cir;

// Referenced classes of package com.ubercab.android.location:
//            Shape_UberLocation, UberLatLng

public abstract class UberLocation
    implements Parcelable
{

    public UberLocation()
    {
    }

    public static UberLocation a(float f1, double d1, float f2, float f3, long l, UberLatLng uberlatlng, 
            String s)
    {
        return (new Shape_UberLocation()).a(f1).a(d1).b(f2).c(f3).a(l).a(uberlatlng).a(s);
    }

    public static cir h()
    {
        return cir.i();
    }

    public abstract float a();

    abstract UberLocation a(double d1);

    abstract UberLocation a(float f1);

    abstract UberLocation a(long l);

    abstract UberLocation a(UberLatLng uberlatlng);

    abstract UberLocation a(String s);

    public abstract double b();

    abstract UberLocation b(float f1);

    public abstract float c();

    abstract UberLocation c(float f1);

    public abstract float d();

    public abstract long e();

    public abstract String f();

    public abstract UberLatLng g();
}
