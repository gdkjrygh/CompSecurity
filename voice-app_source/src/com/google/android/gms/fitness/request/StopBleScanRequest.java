// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzmu;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzab, zzn, BleScanCallback

public class StopBleScanRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzab();
    private final int zzCY;
    private final String zzMZ;
    private final zzmu zzalN;
    private final zzn zzamK;

    StopBleScanRequest(int i, IBinder ibinder, IBinder ibinder1, String s)
    {
        zzCY = i;
        zzamK = zzn.zza.zzbI(ibinder);
        if (ibinder1 == null)
        {
            ibinder = null;
        } else
        {
            ibinder = com.google.android.gms.internal.zzmu.zza.zzbF(ibinder1);
        }
        zzalN = ibinder;
        zzMZ = s;
    }

    public StopBleScanRequest(BleScanCallback blescancallback, zzmu zzmu1, String s)
    {
        this(((zzn) (zza.zza.zzqS().zzb(blescancallback))), zzmu1, s);
    }

    public StopBleScanRequest(zzn zzn1, zzmu zzmu1, String s)
    {
        zzCY = 2;
        zzamK = zzn1;
        zzalN = zzmu1;
        zzMZ = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getPackageName()
    {
        return zzMZ;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzab.zza(this, parcel, i);
    }

    public IBinder zzqU()
    {
        if (zzalN == null)
        {
            return null;
        } else
        {
            return zzalN.asBinder();
        }
    }

    public IBinder zzrq()
    {
        return zzamK.asBinder();
    }

}
