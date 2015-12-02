// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import azv;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class Tile
    implements SafeParcelable
{

    public static final azv CREATOR = new azv();
    public final int a;
    public final int b;
    public final byte c[];
    private final int d;

    public Tile()
    {
        this(1, -1, -1, null);
    }

    public Tile(int i, int j, int k, byte abyte0[])
    {
        d = i;
        a = j;
        b = k;
        c = abyte0;
    }

    public final int a()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        azv.a(this, parcel);
    }

}
