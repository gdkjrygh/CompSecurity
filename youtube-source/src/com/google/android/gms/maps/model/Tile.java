// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.a.bo;

// Referenced classes of package com.google.android.gms.maps.model:
//            m

public final class Tile
    implements SafeParcelable
{

    public static final m CREATOR = new m();
    public final byte data[];
    public final int height;
    private final int jE;
    public final int width;

    Tile(int i, int j, int k, byte abyte0[])
    {
        jE = i;
        width = j;
        height = k;
        data = abyte0;
    }

    public Tile(int i, int j, byte abyte0[])
    {
        this(1, i, j, abyte0);
    }

    public final int describeContents()
    {
        return 0;
    }

    final int getVersionCode()
    {
        return jE;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (bo.a())
        {
            i = b.a(parcel);
            b.a(parcel, 1, getVersionCode());
            b.a(parcel, 2, width);
            b.a(parcel, 3, height);
            b.a(parcel, 4, data, false);
            b.a(parcel, i);
            return;
        } else
        {
            m.a(this, parcel);
            return;
        }
    }

}
