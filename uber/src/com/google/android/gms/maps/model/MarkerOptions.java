// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import aaf;
import aag;
import android.os.IBinder;
import android.os.Parcel;
import axw;
import azo;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng

public final class MarkerOptions
    implements SafeParcelable
{

    public static final azo CREATOR = new azo();
    private final int a;
    private LatLng b;
    private String c;
    private String d;
    private axw e;
    private float f;
    private float g;
    private boolean h;
    private boolean i;
    private boolean j;
    private float k;
    private float l;
    private float m;
    private float n;

    public MarkerOptions()
    {
        f = 0.5F;
        g = 1.0F;
        i = true;
        j = false;
        k = 0.0F;
        l = 0.5F;
        m = 0.0F;
        n = 1.0F;
        a = 1;
    }

    public MarkerOptions(int i1, LatLng latlng, String s, String s1, IBinder ibinder, float f1, float f2, 
            boolean flag, boolean flag1, boolean flag2, float f3, float f4, float f5, float f6)
    {
        f = 0.5F;
        g = 1.0F;
        i = true;
        j = false;
        k = 0.0F;
        l = 0.5F;
        m = 0.0F;
        n = 1.0F;
        a = i1;
        b = latlng;
        c = s;
        d = s1;
        if (ibinder == null)
        {
            latlng = null;
        } else
        {
            latlng = new axw(aag.a(ibinder));
        }
        e = latlng;
        f = f1;
        g = f2;
        h = flag;
        i = flag1;
        j = flag2;
        k = f3;
        l = f4;
        m = f5;
        n = f6;
    }

    public final int a()
    {
        return a;
    }

    public final MarkerOptions a(float f1)
    {
        k = f1;
        return this;
    }

    public final MarkerOptions a(float f1, float f2)
    {
        f = f1;
        g = f2;
        return this;
    }

    public final MarkerOptions a(axw axw1)
    {
        e = axw1;
        return this;
    }

    public final MarkerOptions a(LatLng latlng)
    {
        b = latlng;
        return this;
    }

    public final IBinder b()
    {
        if (e == null)
        {
            return null;
        } else
        {
            return e.a().asBinder();
        }
    }

    public final MarkerOptions b(float f1)
    {
        n = f1;
        return this;
    }

    public final LatLng c()
    {
        return b;
    }

    public final String d()
    {
        return c;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String e()
    {
        return d;
    }

    public final float f()
    {
        return f;
    }

    public final float g()
    {
        return g;
    }

    public final boolean h()
    {
        return h;
    }

    public final boolean i()
    {
        return i;
    }

    public final boolean j()
    {
        return j;
    }

    public final float k()
    {
        return k;
    }

    public final float l()
    {
        return l;
    }

    public final float m()
    {
        return m;
    }

    public final float n()
    {
        return n;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        azo.a(this, parcel, i1);
    }

}
