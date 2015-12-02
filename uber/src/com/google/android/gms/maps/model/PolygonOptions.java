// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import azp;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

public final class PolygonOptions
    implements SafeParcelable
{

    public static final azp CREATOR = new azp();
    private final int a;
    private final List b;
    private final List c;
    private float d;
    private int e;
    private int f;
    private float g;
    private boolean h;
    private boolean i;

    public PolygonOptions()
    {
        d = 10F;
        e = 0xff000000;
        f = 0;
        g = 0.0F;
        h = true;
        i = false;
        a = 1;
        b = new ArrayList();
        c = new ArrayList();
    }

    public PolygonOptions(int j, List list, List list1, float f1, int k, int l, float f2, 
            boolean flag, boolean flag1)
    {
        d = 10F;
        e = 0xff000000;
        f = 0;
        g = 0.0F;
        h = true;
        i = false;
        a = j;
        b = list;
        c = list1;
        d = f1;
        e = k;
        f = l;
        g = f2;
        h = flag;
        i = flag1;
    }

    public final int a()
    {
        return a;
    }

    public final List b()
    {
        return c;
    }

    public final List c()
    {
        return b;
    }

    public final float d()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int e()
    {
        return e;
    }

    public final int f()
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

    public final void writeToParcel(Parcel parcel, int j)
    {
        azp.a(this, parcel);
    }

}
