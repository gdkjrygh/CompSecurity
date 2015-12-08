// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.a.bo;

// Referenced classes of package com.google.android.gms.maps.model:
//            e, LatLng

public final class CircleOptions
    implements SafeParcelable
{

    public static final e CREATOR = new e();
    private float HA;
    private int HB;
    private int HC;
    private float HD;
    private boolean HE;
    private LatLng Hy;
    private double Hz;
    private final int jE;

    public CircleOptions()
    {
        Hy = null;
        Hz = 0.0D;
        HA = 10F;
        HB = 0xff000000;
        HC = 0;
        HD = 0.0F;
        HE = true;
        jE = 1;
    }

    CircleOptions(int i, LatLng latlng, double d, float f, int j, int k, 
            float f1, boolean flag)
    {
        Hy = null;
        Hz = 0.0D;
        HA = 10F;
        HB = 0xff000000;
        HC = 0;
        HD = 0.0F;
        HE = true;
        jE = i;
        Hy = latlng;
        Hz = d;
        HA = f;
        HB = j;
        HC = k;
        HD = f1;
        HE = flag;
    }

    public final CircleOptions center(LatLng latlng)
    {
        Hy = latlng;
        return this;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final CircleOptions fillColor(int i)
    {
        HC = i;
        return this;
    }

    public final LatLng getCenter()
    {
        return Hy;
    }

    public final int getFillColor()
    {
        return HC;
    }

    public final double getRadius()
    {
        return Hz;
    }

    public final int getStrokeColor()
    {
        return HB;
    }

    public final float getStrokeWidth()
    {
        return HA;
    }

    final int getVersionCode()
    {
        return jE;
    }

    public final float getZIndex()
    {
        return HD;
    }

    public final boolean isVisible()
    {
        return HE;
    }

    public final CircleOptions radius(double d)
    {
        Hz = d;
        return this;
    }

    public final CircleOptions strokeColor(int i)
    {
        HB = i;
        return this;
    }

    public final CircleOptions strokeWidth(float f)
    {
        HA = f;
        return this;
    }

    public final CircleOptions visible(boolean flag)
    {
        HE = flag;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (bo.a())
        {
            int j = b.a(parcel);
            b.a(parcel, 1, getVersionCode());
            b.a(parcel, 2, getCenter(), i, false);
            b.a(parcel, 3, getRadius());
            b.a(parcel, 4, getStrokeWidth());
            b.a(parcel, 5, getStrokeColor());
            b.a(parcel, 6, getFillColor());
            b.a(parcel, 7, getZIndex());
            b.a(parcel, 8, isVisible());
            b.a(parcel, j);
            return;
        } else
        {
            e.a(this, parcel, i);
            return;
        }
    }

    public final CircleOptions zIndex(float f)
    {
        HD = f;
        return this;
    }

}
