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
    String zzCI;
    private final int zzCY;
    String zzaSG;
    TimeInterval zzaSJ;
    UriData zzaSK;
    UriData zzaSL;

    WalletObjectMessage()
    {
        zzCY = 1;
    }

    WalletObjectMessage(int i, String s, String s1, TimeInterval timeinterval, UriData uridata, UriData uridata1)
    {
        zzCY = i;
        zzaSG = s;
        zzCI = s1;
        zzaSJ = timeinterval;
        zzaSK = uridata;
        zzaSL = uridata1;
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
        zzi.zza(this, parcel, i);
    }

}
