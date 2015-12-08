// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzm

public final class Tile
    implements SafeParcelable
{

    public static final zzm CREATOR = new zzm();
    public final byte data[];
    public final int height;
    public final int width;
    private final int zzCY;

    Tile(int i, int j, int k, byte abyte0[])
    {
        zzCY = i;
        width = j;
        height = k;
        data = abyte0;
    }

    public Tile(int i, int j, byte abyte0[])
    {
        this(1, i, j, abyte0);
    }

    public int describeContents()
    {
        return 0;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzm.zza(this, parcel, i);
    }

}
