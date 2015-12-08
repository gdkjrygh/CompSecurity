// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.nearby.sharing.internal:
//            zzk, zzc

public final class TrustedDevicesRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzk();
    final int versionCode;
    public zzc zzaGt;
    public String zzaGv;
    public byte zzaGw[];

    TrustedDevicesRequest(int i, String s, byte abyte0[], IBinder ibinder)
    {
        versionCode = i;
        zzaGv = (String)zzu.zzu(s);
        zzaGw = (byte[])zzu.zzu(abyte0);
        zzaGt = zzc.zza.zzdj(ibinder);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

    IBinder zzxa()
    {
        return zzaGt.asBinder();
    }

}
