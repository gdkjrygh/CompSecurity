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
//            zzf

public class SendDataRequest
    implements SafeParcelable
{

    public static final zzf CREATOR = new zzf();
    private final byte data[];
    final int versionCode;
    private final Device zzaFh;
    private final zzol zzaFk;

    SendDataRequest(int i, Device device, byte abyte0[], IBinder ibinder)
    {
        versionCode = i;
        zzaFh = (Device)zzu.zzu(device);
        data = (byte[])zzu.zzu(abyte0);
        zzu.zzu(ibinder);
        zzaFk = com.google.android.gms.internal.zzol.zza.zzcX(ibinder);
    }

    public int describeContents()
    {
        zzf zzf1 = CREATOR;
        return 0;
    }

    public byte[] getData()
    {
        return data;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf zzf1 = CREATOR;
        zzf.zza(this, parcel, i);
    }

    public IBinder zzqU()
    {
        if (zzaFk == null)
        {
            return null;
        } else
        {
            return zzaFk.asBinder();
        }
    }

    public Device zzwM()
    {
        return zzaFh;
    }

}
