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
    CommonWalletObject zzaIm;
    String zzaIn;
    String zzaIo;
    long zzaIp;
    String zzaIq;
    long zzaIr;
    String zzaIs;
    final int zzzH;

    GiftCardWalletObject()
    {
        zzaIm = CommonWalletObject.zzyR().zzyS();
        zzzH = 1;
    }

    GiftCardWalletObject(int i, CommonWalletObject commonwalletobject, String s, String s1, String s2, long l, 
            String s3, long l1, String s4)
    {
        zzaIm = CommonWalletObject.zzyR().zzyS();
        zzzH = i;
        zzaIm = commonwalletobject;
        zzaIn = s;
        pin = s1;
        zzaIp = l;
        zzaIq = s3;
        zzaIr = l1;
        zzaIs = s4;
        zzaIo = s2;
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
        zzg.zza(this, parcel, i);
    }

}
