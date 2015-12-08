// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.zzj;
import com.google.android.gms.internal.zzmu;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzt

public class SensorUnregistrationRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzt();
    private final PendingIntent mPendingIntent;
    private final int zzCY;
    private final String zzMZ;
    private final zzmu zzalN;
    private final zzj zzamr;

    SensorUnregistrationRequest(int i, IBinder ibinder, PendingIntent pendingintent, IBinder ibinder1, String s)
    {
        zzCY = i;
        if (ibinder == null)
        {
            ibinder = null;
        } else
        {
            ibinder = com.google.android.gms.fitness.data.zzj.zza.zzbh(ibinder);
        }
        zzamr = ibinder;
        mPendingIntent = pendingintent;
        zzalN = com.google.android.gms.internal.zzmu.zza.zzbF(ibinder1);
        zzMZ = s;
    }

    public SensorUnregistrationRequest(zzj zzj1, PendingIntent pendingintent, zzmu zzmu1, String s)
    {
        zzCY = 3;
        zzamr = zzj1;
        mPendingIntent = pendingintent;
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

    public String toString()
    {
        return String.format("SensorUnregistrationRequest{%s}", new Object[] {
            zzamr
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzt.zza(this, parcel, i);
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

    public PendingIntent zzrg()
    {
        return mPendingIntent;
    }

    IBinder zzrl()
    {
        if (zzamr == null)
        {
            return null;
        } else
        {
            return zzamr.asBinder();
        }
    }

}
