// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

// Referenced classes of package com.google.android.gms.wallet:
//            zzg

public final class GiftCardWalletObject
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzg();
    String pin;
    final int zzCY;
    String zzaQA;
    String zzaQB;
    long zzaQC;
    String zzaQD;
    long zzaQE;
    String zzaQF;
    CommonWalletObject zzaQz;

    GiftCardWalletObject()
    {
        zzaQz = CommonWalletObject.zzAN().zzAO();
        zzCY = 1;
    }

    GiftCardWalletObject(int i, CommonWalletObject commonwalletobject, String s, String s1, String s2, long l, 
            String s3, long l1, String s4)
    {
        zzaQz = CommonWalletObject.zzAN().zzAO();
        zzCY = i;
        zzaQz = commonwalletobject;
        zzaQA = s;
        pin = s1;
        zzaQC = l;
        zzaQD = s3;
        zzaQE = l1;
        zzaQF = s4;
        zzaQB = s2;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getId()
    {
        return zzaQz.getId();
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzg.zza(this, parcel, i);
    }

}
