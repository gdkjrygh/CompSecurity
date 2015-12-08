// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

// Referenced classes of package com.google.android.gms.wallet:
//            zzn

public final class OfferWalletObject
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzn();
    private final int zzCY;
    CommonWalletObject zzaQz;
    String zzaRy;
    String zzhI;

    OfferWalletObject()
    {
        zzCY = 3;
    }

    OfferWalletObject(int i, String s, String s1, CommonWalletObject commonwalletobject)
    {
        zzCY = i;
        zzaRy = s1;
        if (i < 3)
        {
            zzaQz = CommonWalletObject.zzAN().zzff(s).zzAO();
            return;
        } else
        {
            zzaQz = commonwalletobject;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public String getId()
    {
        return zzaQz.getId();
    }

    public String getRedemptionCode()
    {
        return zzaRy;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzn.zza(this, parcel, i);
    }

}
