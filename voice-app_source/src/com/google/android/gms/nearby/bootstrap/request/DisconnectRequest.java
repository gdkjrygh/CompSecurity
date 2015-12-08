// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzol;
import com.google.android.gms.nearby.bootstrap.Device;

// Referenced classes of package com.google.android.gms.nearby.bootstrap.request:
//            zzd

public class DisconnectRequest
    implements SafeParcelable
{

    public static final zzd CREATOR = new zzd();
    final int versionCode;
    private final Device zzaFh;
    private final zzol zzaFk;

    DisconnectRequest(int i, Device device, IBinder ibinder)
    {
        versionCode = i;
        zzaFh = (Device)zzu.zzu(device);
        zzu.zzu(ibinder);
        zzaFk = com.google.android.gms.internal.zzol.zza.zzcX(ibinder);
    }

    public int describeContents()
    {
        zzd zzd1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd zzd1 = CREATOR;
        zzd.zza(this, parcel, i);
    }

    public IBinder zzqU()
    {
        return zzaFk.asBinder();
    }

    public Device zzwM()
    {
        return zzaFh;
    }

}
