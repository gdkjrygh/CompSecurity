// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            zzi, TimeInterval, UriData

public final class WalletObjectMessage
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzi();
    String zzaKC;
    TimeInterval zzaKF;
    UriData zzaKG;
    UriData zzaKH;
    private final int zzzH;
    String zzzr;

    WalletObjectMessage()
    {
        zzzH = 1;
    }

    WalletObjectMessage(int i, String s, String s1, TimeInterval timeinterval, UriData uridata, UriData uridata1)
    {
        zzzH = i;
        zzaKC = s;
        zzzr = s1;
        zzaKF = timeinterval;
        zzaKG = uridata;
        zzaKH = uridata1;
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
