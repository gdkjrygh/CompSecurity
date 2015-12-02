// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import aaf;
import aag;
import android.os.IBinder;
import android.os.Parcel;
import axw;
import azl;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import wn;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng, LatLngBounds

public final class GroundOverlayOptions
    implements SafeParcelable
{

    public static final azl CREATOR = new azl();
    private final int a;
    private axw b;
    private LatLng c;
    private float d;
    private float e;
    private LatLngBounds f;
    private float g;
    private float h;
    private boolean i;
    private float j;
    private float k;
    private float l;

    public GroundOverlayOptions()
    {
        i = true;
        j = 0.0F;
        k = 0.5F;
        l = 0.5F;
        a = 1;
    }

    public GroundOverlayOptions(int i1, IBinder ibinder, LatLng latlng, float f1, float f2, LatLngBounds latlngbounds, float f3, 
            float f4, boolean flag, float f5, float f6, float f7)
    {
        i = true;
        j = 0.0F;
        k = 0.5F;
        l = 0.5F;
        a = i1;
        b = new axw(aag.a(ibinder));
        c = latlng;
        d = f1;
        e = f2;
        f = latlngbounds;
        g = f3;
        h = f4;
        i = flag;
        j = f5;
        k = f6;
        l = f7;
    }

    private GroundOverlayOptions b(LatLng latlng, float f1, float f2)
    {
        c = latlng;
        d = f1;
        e = f2;
        return this;
    }

    public final IBinder a()
    {
        return b.a().asBinder();
    }

    public final GroundOverlayOptions a(float f1)
    {
        h = f1;
        return this;
    }

    public final GroundOverlayOptions a(float f1, float f2)
    {
        k = f1;
        l = f2;
        return this;
    }

    public final GroundOverlayOptions a(axw axw1)
    {
        b = axw1;
        return this;
    }

    public final GroundOverlayOptions a(LatLng latlng, float f1)
    {
        boolean flag1 = true;
        boolean flag;
        if (f == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        wn.a(flag, "Position has already been set using positionFromBounds");
        if (latlng != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        wn.b(flag, "Location must be specified");
        if (f1 >= 0.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        wn.b(flag, "Width must be non-negative");
        return b(latlng, f1, -1F);
    }

    public final GroundOverlayOptions a(LatLng latlng, float f1, float f2)
    {
        boolean flag1 = true;
        boolean flag;
        if (f == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        wn.a(flag, "Position has already been set using positionFromBounds");
        if (latlng != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        wn.b(flag, "Location must be specified");
        if (f1 >= 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        wn.b(flag, "Width must be non-negative");
        if (f2 >= 0.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        wn.b(flag, "Height must be non-negative");
        return b(latlng, f1, f2);
    }

    public final GroundOverlayOptions a(LatLngBounds latlngbounds)
    {
        boolean flag;
        if (c == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        wn.a(flag, (new StringBuilder("Position has already been set using position: ")).append(c).toString());
        f = latlngbounds;
        return this;
    }

    public final GroundOverlayOptions a(boolean flag)
    {
        i = flag;
        return this;
    }

    public final int b()
    {
        return a;
    }

    public final GroundOverlayOptions b(float f1)
    {
        boolean flag;
        if (f1 >= 0.0F && f1 <= 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        wn.b(flag, "Transparency must be in the range [0..1]");
        j = f1;
        return this;
    }

    public final LatLng c()
    {
        return c;
    }

    public final float d()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final float e()
    {
        return e;
    }

    public final LatLngBounds f()
    {
        return f;
    }

    public final float g()
    {
        return g;
    }

    public final float h()
    {
        return h;
    }

    public final float i()
    {
        return j;
    }

    public final float j()
    {
        return k;
    }

    public final float k()
    {
        return l;
    }

    public final boolean l()
    {
        return i;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        azl.a(this, parcel, i1);
    }

}
