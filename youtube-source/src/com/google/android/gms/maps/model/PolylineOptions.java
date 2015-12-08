// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.a.bo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//            l, LatLng

public final class PolylineOptions
    implements SafeParcelable
{

    public static final l CREATOR = new l();
    private float HD;
    private boolean HE;
    private float HI;
    private final List Ic;
    private boolean Ie;
    private final int jE;
    private int qB;

    public PolylineOptions()
    {
        HI = 10F;
        qB = 0xff000000;
        HD = 0.0F;
        HE = true;
        Ie = false;
        jE = 1;
        Ic = new ArrayList();
    }

    PolylineOptions(int i, List list, float f, int j, float f1, boolean flag, boolean flag1)
    {
        HI = 10F;
        qB = 0xff000000;
        HD = 0.0F;
        HE = true;
        Ie = false;
        jE = i;
        Ic = list;
        HI = f;
        qB = j;
        HD = f1;
        HE = flag;
        Ie = flag1;
    }

    public final PolylineOptions add(LatLng latlng)
    {
        Ic.add(latlng);
        return this;
    }

    public final transient PolylineOptions add(LatLng alatlng[])
    {
        Ic.addAll(Arrays.asList(alatlng));
        return this;
    }

    public final PolylineOptions addAll(Iterable iterable)
    {
        LatLng latlng;
        for (iterable = iterable.iterator(); iterable.hasNext(); Ic.add(latlng))
        {
            latlng = (LatLng)iterable.next();
        }

        return this;
    }

    public final PolylineOptions color(int i)
    {
        qB = i;
        return this;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final PolylineOptions geodesic(boolean flag)
    {
        Ie = flag;
        return this;
    }

    public final int getColor()
    {
        return qB;
    }

    public final List getPoints()
    {
        return Ic;
    }

    final int getVersionCode()
    {
        return jE;
    }

    public final float getWidth()
    {
        return HI;
    }

    public final float getZIndex()
    {
        return HD;
    }

    public final boolean isGeodesic()
    {
        return Ie;
    }

    public final boolean isVisible()
    {
        return HE;
    }

    public final PolylineOptions visible(boolean flag)
    {
        HE = flag;
        return this;
    }

    public final PolylineOptions width(float f)
    {
        HI = f;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (bo.a())
        {
            i = b.a(parcel);
            b.a(parcel, 1, getVersionCode());
            b.b(parcel, 2, getPoints(), false);
            b.a(parcel, 3, getWidth());
            b.a(parcel, 4, getColor());
            b.a(parcel, 5, getZIndex());
            b.a(parcel, 6, isVisible());
            b.a(parcel, 7, isGeodesic());
            b.a(parcel, i);
            return;
        } else
        {
            l.a(this, parcel);
            return;
        }
    }

    public final PolylineOptions zIndex(float f)
    {
        HD = f;
        return this;
    }

}
