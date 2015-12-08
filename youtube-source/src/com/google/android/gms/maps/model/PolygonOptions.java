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
//            k, LatLng

public final class PolygonOptions
    implements SafeParcelable
{

    public static final k CREATOR = new k();
    private float HA;
    private int HB;
    private int HC;
    private float HD;
    private boolean HE;
    private final List Ic;
    private final List Id;
    private boolean Ie;
    private final int jE;

    public PolygonOptions()
    {
        HA = 10F;
        HB = 0xff000000;
        HC = 0;
        HD = 0.0F;
        HE = true;
        Ie = false;
        jE = 1;
        Ic = new ArrayList();
        Id = new ArrayList();
    }

    PolygonOptions(int i, List list, List list1, float f, int j, int l, float f1, 
            boolean flag, boolean flag1)
    {
        HA = 10F;
        HB = 0xff000000;
        HC = 0;
        HD = 0.0F;
        HE = true;
        Ie = false;
        jE = i;
        Ic = list;
        Id = list1;
        HA = f;
        HB = j;
        HC = l;
        HD = f1;
        HE = flag;
        Ie = flag1;
    }

    public final PolygonOptions add(LatLng latlng)
    {
        Ic.add(latlng);
        return this;
    }

    public final transient PolygonOptions add(LatLng alatlng[])
    {
        Ic.addAll(Arrays.asList(alatlng));
        return this;
    }

    public final PolygonOptions addAll(Iterable iterable)
    {
        LatLng latlng;
        for (iterable = iterable.iterator(); iterable.hasNext(); Ic.add(latlng))
        {
            latlng = (LatLng)iterable.next();
        }

        return this;
    }

    public final PolygonOptions addHole(Iterable iterable)
    {
        ArrayList arraylist = new ArrayList();
        for (iterable = iterable.iterator(); iterable.hasNext(); arraylist.add((LatLng)iterable.next())) { }
        Id.add(arraylist);
        return this;
    }

    public final int describeContents()
    {
        return 0;
    }

    final List eE()
    {
        return Id;
    }

    public final PolygonOptions fillColor(int i)
    {
        HC = i;
        return this;
    }

    public final PolygonOptions geodesic(boolean flag)
    {
        Ie = flag;
        return this;
    }

    public final int getFillColor()
    {
        return HC;
    }

    public final List getHoles()
    {
        return Id;
    }

    public final List getPoints()
    {
        return Ic;
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

    public final boolean isGeodesic()
    {
        return Ie;
    }

    public final boolean isVisible()
    {
        return HE;
    }

    public final PolygonOptions strokeColor(int i)
    {
        HB = i;
        return this;
    }

    public final PolygonOptions strokeWidth(float f)
    {
        HA = f;
        return this;
    }

    public final PolygonOptions visible(boolean flag)
    {
        HE = flag;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (bo.a())
        {
            i = b.a(parcel);
            b.a(parcel, 1, getVersionCode());
            b.b(parcel, 2, getPoints(), false);
            b.c(parcel, 3, eE(), false);
            b.a(parcel, 4, getStrokeWidth());
            b.a(parcel, 5, getStrokeColor());
            b.a(parcel, 6, getFillColor());
            b.a(parcel, 7, getZIndex());
            b.a(parcel, 8, isVisible());
            b.a(parcel, 9, isGeodesic());
            b.a(parcel, i);
            return;
        } else
        {
            k.a(this, parcel);
            return;
        }
    }

    public final PolygonOptions zIndex(float f)
    {
        HD = f;
        return this;
    }

}
