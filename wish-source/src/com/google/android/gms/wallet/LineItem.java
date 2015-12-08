// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            zzi

public final class LineItem
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzi();
    String description;
    String zzaHS;
    String zzaHT;
    String zzaIx;
    String zzaIy;
    int zzaIz;
    private final int zzzH;

    LineItem()
    {
        zzzH = 1;
        zzaIz = 0;
    }

    LineItem(int i, String s, String s1, String s2, String s3, int j, String s4)
    {
        zzzH = i;
        description = s;
        zzaIx = s1;
        zzaIy = s2;
        zzaHS = s3;
        zzaIz = j;
        zzaHT = s4;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.zza(this, parcel, i);
    }

}
