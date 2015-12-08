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
    private final int zzCY;
    String zzaQD;
    int zzaSB;
    String zzaSC;
    double zzaSD;
    long zzaSE;
    int zzaSF;

    LoyaltyPointsBalance()
    {
        zzCY = 1;
        zzaSF = -1;
        zzaSB = -1;
        zzaSD = -1D;
    }

    LoyaltyPointsBalance(int i, int j, String s, double d, String s1, long l, int k)
    {
        zzCY = i;
        zzaSB = j;
        zzaSC = s;
        zzaSD = d;
        zzaQD = s1;
        zzaSE = l;
        zzaSF = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd.zza(this, parcel, i);
    }

}
