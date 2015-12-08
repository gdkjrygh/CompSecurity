// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.service;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.zzj;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.service:
//            zza, zzb, SensorEventDispatcher

public class FitnessSensorServiceRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    public static final int UNSPECIFIED = -1;
    private final int zzCY;
    private final DataSource zzajG;
    private final zzj zzamr;
    private final long zzana;
    private final long zzanb;

    FitnessSensorServiceRequest(int i, DataSource datasource, IBinder ibinder, long l, long l1)
    {
        zzCY = i;
        zzajG = datasource;
        zzamr = com.google.android.gms.fitness.data.zzj.zza.zzbh(ibinder);
        zzana = l;
        zzanb = l1;
    }

    private boolean zza(FitnessSensorServiceRequest fitnesssensorservicerequest)
    {
        return zzt.equal(zzajG, fitnesssensorservicerequest.zzajG) && zzana == fitnesssensorservicerequest.zzana && zzanb == fitnesssensorservicerequest.zzanb;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof FitnessSensorServiceRequest) && zza((FitnessSensorServiceRequest)obj);
    }

    public long getBatchInterval(TimeUnit timeunit)
    {
        return timeunit.convert(zzanb, TimeUnit.MICROSECONDS);
    }

    public DataSource getDataSource()
    {
        return zzajG;
    }

    public SensorEventDispatcher getDispatcher()
    {
        return new zzb(zzamr);
    }

    public long getSamplingRate(TimeUnit timeunit)
    {
        if (zzana == -1L)
        {
            return -1L;
        } else
        {
            return timeunit.convert(zzana, TimeUnit.MICROSECONDS);
        }
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzajG, Long.valueOf(zzana), Long.valueOf(zzanb)
        });
    }

    public String toString()
    {
        return String.format("FitnessSensorServiceRequest{%s}", new Object[] {
            zzajG
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.fitness.service.zza.zza(this, parcel, i);
    }

    public long zzqL()
    {
        return zzana;
    }

    public long zzrB()
    {
        return zzanb;
    }

    IBinder zzrl()
    {
        return zzamr.asBinder();
    }

}
