// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            SensorRequest

public static class zzamA
{

    private DataType zzajF;
    private DataSource zzajG;
    private long zzakP;
    private int zzakQ;
    private long zzamA;
    private boolean zzamB;
    private long zzamu;
    private long zzamv;

    static DataSource zza(zzamA zzama)
    {
        return zzama.zzajG;
    }

    static DataType zzb(zzajG zzajg)
    {
        return zzajg.zzajF;
    }

    static long zzc(zzajF zzajf)
    {
        return zzajf.zzakP;
    }

    static long zzd(zzakP zzakp)
    {
        return zzakp.zzamv;
    }

    static long zze(zzamv zzamv1)
    {
        return zzamv1.zzamu;
    }

    static int zzf(zzamu zzamu1)
    {
        return zzamu1.zzakQ;
    }

    static long zzg(zzakQ zzakq)
    {
        return zzakq.zzamA;
    }

    public SensorRequest build()
    {
label0:
        {
            boolean flag1 = false;
            boolean flag;
            if (zzajG != null || zzajF != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zza(flag, "Must call setDataSource() or setDataType()");
            if (zzajF != null && zzajG != null)
            {
                flag = flag1;
                if (!zzajF.equals(zzajG.getDataType()))
                {
                    break label0;
                }
            }
            flag = true;
        }
        zzu.zza(flag, "Specified data type is incompatible with specified data source");
        return new SensorRequest(this, null);
    }

    public zzajG setAccuracyMode(int i)
    {
        zzakQ = SensorRequest.zzeM(i);
        return this;
    }

    public zzakQ setDataSource(DataSource datasource)
    {
        zzajG = datasource;
        return this;
    }

    public zzajG setDataType(DataType datatype)
    {
        zzajF = datatype;
        return this;
    }

    public zzajF setFastestRate(int i, TimeUnit timeunit)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Cannot use a negative interval");
        zzamB = true;
        zzamv = timeunit.toMicros(i);
        return this;
    }

    public zzamv setMaxDeliveryLatency(int i, TimeUnit timeunit)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Cannot use a negative delivery interval");
        zzamu = timeunit.toMicros(i);
        return this;
    }

    public zzamu setSamplingRate(long l, TimeUnit timeunit)
    {
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Cannot use a negative sampling interval");
        zzakP = timeunit.toMicros(l);
        if (!zzamB)
        {
            zzamv = zzakP / 2L;
        }
        return this;
    }

    public zzakP setTimeout(long l, TimeUnit timeunit)
    {
        boolean flag1 = true;
        boolean flag;
        if (l > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Invalid time out value specified: %d", new Object[] {
            Long.valueOf(l)
        });
        if (timeunit != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Invalid time unit specified");
        zzamA = timeunit.toMicros(l);
        return this;
    }

    public ()
    {
        zzakP = -1L;
        zzamv = 0L;
        zzamu = 0L;
        zzamB = false;
        zzakQ = 2;
        zzamA = 0x7fffffffffffffffL;
    }
}
