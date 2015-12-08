// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.SystemClock;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.TimeUnit;

public class SensorRequest
{
    public static class Builder
    {

        private DataType zzajF;
        private DataSource zzajG;
        private long zzakP;
        private int zzakQ;
        private long zzamA;
        private boolean zzamB;
        private long zzamu;
        private long zzamv;

        static DataSource zza(Builder builder)
        {
            return builder.zzajG;
        }

        static DataType zzb(Builder builder)
        {
            return builder.zzajF;
        }

        static long zzc(Builder builder)
        {
            return builder.zzakP;
        }

        static long zzd(Builder builder)
        {
            return builder.zzamv;
        }

        static long zze(Builder builder)
        {
            return builder.zzamu;
        }

        static int zzf(Builder builder)
        {
            return builder.zzakQ;
        }

        static long zzg(Builder builder)
        {
            return builder.zzamA;
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
            return new SensorRequest(this);
        }

        public Builder setAccuracyMode(int i)
        {
            zzakQ = SensorRequest.zzeM(i);
            return this;
        }

        public Builder setDataSource(DataSource datasource)
        {
            zzajG = datasource;
            return this;
        }

        public Builder setDataType(DataType datatype)
        {
            zzajF = datatype;
            return this;
        }

        public Builder setFastestRate(int i, TimeUnit timeunit)
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

        public Builder setMaxDeliveryLatency(int i, TimeUnit timeunit)
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

        public Builder setSamplingRate(long l, TimeUnit timeunit)
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

        public Builder setTimeout(long l, TimeUnit timeunit)
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

        public Builder()
        {
            zzakP = -1L;
            zzamv = 0L;
            zzamu = 0L;
            zzamB = false;
            zzakQ = 2;
            zzamA = 0x7fffffffffffffffL;
        }
    }


    public static final int ACCURACY_MODE_DEFAULT = 2;
    public static final int ACCURACY_MODE_HIGH = 3;
    public static final int ACCURACY_MODE_LOW = 1;
    private final DataType zzajF;
    private final DataSource zzajG;
    private final long zzakP;
    private final int zzakQ;
    private final long zzamA;
    private final long zzamu;
    private final long zzamv;
    private final LocationRequest zzamz;

    private SensorRequest(DataSource datasource, LocationRequest locationrequest)
    {
        zzamz = locationrequest;
        zzakP = TimeUnit.MILLISECONDS.toMicros(locationrequest.getInterval());
        zzamv = TimeUnit.MILLISECONDS.toMicros(locationrequest.getFastestInterval());
        zzamu = zzakP;
        zzajF = datasource.getDataType();
        zzakQ = zza(locationrequest);
        zzajG = datasource;
        long l = locationrequest.getExpirationTime();
        if (l == 0x7fffffffffffffffL)
        {
            zzamA = 0x7fffffffffffffffL;
            return;
        } else
        {
            zzamA = TimeUnit.MILLISECONDS.toMicros(l - SystemClock.elapsedRealtime());
            return;
        }
    }

    private SensorRequest(Builder builder)
    {
        zzajG = Builder.zza(builder);
        zzajF = Builder.zzb(builder);
        zzakP = Builder.zzc(builder);
        zzamv = Builder.zzd(builder);
        zzamu = Builder.zze(builder);
        zzakQ = Builder.zzf(builder);
        zzamz = null;
        zzamA = Builder.zzg(builder);
    }


    public static SensorRequest fromLocationRequest(DataSource datasource, LocationRequest locationrequest)
    {
        return new SensorRequest(datasource, locationrequest);
    }

    private static int zza(LocationRequest locationrequest)
    {
        switch (locationrequest.getPriority())
        {
        default:
            return 2;

        case 100: // 'd'
            return 3;

        case 104: // 'h'
            return 1;
        }
    }

    private boolean zza(SensorRequest sensorrequest)
    {
        return zzt.equal(zzajG, sensorrequest.zzajG) && zzt.equal(zzajF, sensorrequest.zzajF) && zzakP == sensorrequest.zzakP && zzamv == sensorrequest.zzamv && zzamu == sensorrequest.zzamu && zzakQ == sensorrequest.zzakQ && zzt.equal(zzamz, sensorrequest.zzamz) && zzamA == sensorrequest.zzamA;
    }

    public static int zzeM(int i)
    {
        int j = i;
        switch (i)
        {
        case 2: // '\002'
        default:
            j = 2;
            // fall through

        case 1: // '\001'
        case 3: // '\003'
            return j;
        }
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof SensorRequest) && zza((SensorRequest)obj);
    }

    public int getAccuracyMode()
    {
        return zzakQ;
    }

    public DataSource getDataSource()
    {
        return zzajG;
    }

    public DataType getDataType()
    {
        return zzajF;
    }

    public long getFastestRate(TimeUnit timeunit)
    {
        return timeunit.convert(zzamv, TimeUnit.MICROSECONDS);
    }

    public long getMaxDeliveryLatency(TimeUnit timeunit)
    {
        return timeunit.convert(zzamu, TimeUnit.MICROSECONDS);
    }

    public long getSamplingRate(TimeUnit timeunit)
    {
        return timeunit.convert(zzakP, TimeUnit.MICROSECONDS);
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzajG, zzajF, Long.valueOf(zzakP), Long.valueOf(zzamv), Long.valueOf(zzamu), Integer.valueOf(zzakQ), zzamz, Long.valueOf(zzamA)
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("dataSource", zzajG).zzg("dataType", zzajF).zzg("samplingRateMicros", Long.valueOf(zzakP)).zzg("deliveryLatencyMicros", Long.valueOf(zzamu)).zzg("timeOutMicros", Long.valueOf(zzamA)).toString();
    }

    public long zzrm()
    {
        return zzamA;
    }
}
