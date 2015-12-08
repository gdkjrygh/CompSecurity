// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            zzd

public final class LoyaltyPointsBalance
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzd();
    String zzaIq;
    int zzaKA;
    int zzaKw;
    String zzaKx;
    double zzaKy;
    long zzaKz;
    private final int zzzH;

    LoyaltyPointsBalance()
    {
        zzzH = 1;
        zzaKA = -1;
        zzaKw = -1;
        zzaKy = -1D;
    }

    LoyaltyPointsBalance(int i, int j, String s, double d, String s1, long l, int k)
    {
        zzzH = i;
        zzaKw = j;
        zzaKx = s;
        zzaKy = d;
        zzaIq = s1;
        zzaKz = l;
        zzaKA = k;
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
        zzd.zza(this, parcel, i);
    }

}
