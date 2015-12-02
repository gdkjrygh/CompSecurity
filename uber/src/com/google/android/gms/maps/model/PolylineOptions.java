// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import azq;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng

public final class PolylineOptions
    implements SafeParcelable
{

    public static final azq CREATOR = new azq();
    private final int a;
    private final List b;
    private float c;
    private int d;
    private float e;
    private boolean f;
    private boolean g;

    public PolylineOptions()
    {
        c = 10F;
        d = 0xff000000;
        e = 0.0F;
        f = true;
        g = false;
        a = 1;
        b = new ArrayList();
    }

    public PolylineOptions(int i, List list, float f1, int j, float f2, boolean flag, boolean flag1)
    {
        c = 10F;
        d = 0xff000000;
        e = 0.0F;
        f = true;
        g = false;
        a = i;
        b = list;
        c = f1;
        d = j;
        e = f2;
        f = flag;
        g = flag1;
    }

    public final int a()
    {
        return a;
    }

    public final PolylineOptions a(float f1)
    {
        c = f1;
        return this;
    }

    public final PolylineOptions a(int i)
    {
        d = i;
        return this;
    }

    public final PolylineOptions a(Iterable iterable)
    {
        LatLng latlng;
        for (iterable = iterable.iterator(); iterable.hasNext(); b.add(latlng))
        {
            latlng = (LatLng)iterable.next();
        }

        return this;
    }

    public final PolylineOptions b(float f1)
    {
        e = f1;
        return this;
    }

    public final List b()
    {
        return b;
    }

    public final float c()
    {
        return c;
    }

    public final int d()
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

    public final boolean f()
    {
        return f;
    }

    public final boolean g()
    {
        return g;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        azq.a(this, parcel);
    }

}
