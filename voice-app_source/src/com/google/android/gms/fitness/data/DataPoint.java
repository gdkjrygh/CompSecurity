// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlu;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzd, DataSource, DataType, Value, 
//            Field, RawDataPoint

public final class DataPoint
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzd();
    private final int zzCY;
    private final DataSource zzajG;
    private long zzajV;
    private long zzajW;
    private final Value zzajX[];
    private DataSource zzajY;
    private long zzajZ;
    private long zzaka;

    DataPoint(int i, DataSource datasource, long l, long l1, Value avalue[], 
            DataSource datasource1, long l2, long l3)
    {
        zzCY = i;
        zzajG = datasource;
        zzajY = datasource1;
        zzajV = l;
        zzajW = l1;
        zzajX = avalue;
        zzajZ = l2;
        zzaka = l3;
    }

    private DataPoint(DataSource datasource)
    {
        zzCY = 4;
        zzajG = (DataSource)zzu.zzb(datasource, "Data source cannot be null");
        datasource = datasource.getDataType().getFields();
        zzajX = new Value[datasource.size()];
        datasource = datasource.iterator();
        for (int i = 0; datasource.hasNext(); i++)
        {
            Field field = (Field)datasource.next();
            zzajX[i] = new Value(field.getFormat());
        }

    }

    public DataPoint(DataSource datasource, DataSource datasource1, RawDataPoint rawdatapoint)
    {
        this(4, datasource, zza(Long.valueOf(rawdatapoint.zzajV), 0L), zza(Long.valueOf(rawdatapoint.zzajW), 0L), rawdatapoint.zzajX, datasource1, zza(Long.valueOf(rawdatapoint.zzajZ), 0L), zza(Long.valueOf(rawdatapoint.zzaka), 0L));
    }

    DataPoint(List list, RawDataPoint rawdatapoint)
    {
        this(zza(list, rawdatapoint.zzakH), zza(list, rawdatapoint.zzakI), rawdatapoint);
    }

    public static DataPoint create(DataSource datasource)
    {
        return new DataPoint(datasource);
    }

    public static DataPoint extract(Intent intent)
    {
        if (intent == null)
        {
            return null;
        } else
        {
            return (DataPoint)zzc.zza(intent, "com.google.android.gms.fitness.EXTRA_DATA_POINT", CREATOR);
        }
    }

    private static long zza(Long long1, long l)
    {
        if (long1 != null)
        {
            l = long1.longValue();
        }
        return l;
    }

    private static DataSource zza(List list, int i)
    {
        if (i >= 0 && i < list.size())
        {
            return (DataSource)list.get(i);
        } else
        {
            return null;
        }
    }

    private boolean zza(DataPoint datapoint)
    {
        return zzt.equal(zzajG, datapoint.zzajG) && zzajV == datapoint.zzajV && zzajW == datapoint.zzajW && Arrays.equals(zzajX, datapoint.zzajX) && zzt.equal(zzajY, datapoint.zzajY);
    }

    private void zzed(int i)
    {
        List list = getDataType().getFields();
        int j = list.size();
        boolean flag;
        if (i == j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Attempting to insert %s values, but needed %s: %s", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j), list
        });
    }

    private boolean zzqt()
    {
        return getDataType() == DataType.TYPE_LOCATION_SAMPLE;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof DataPoint) && zza((DataPoint)obj);
    }

    public DataSource getDataSource()
    {
        return zzajG;
    }

    public DataType getDataType()
    {
        return zzajG.getDataType();
    }

    public long getEndTime(TimeUnit timeunit)
    {
        return timeunit.convert(zzajV, TimeUnit.NANOSECONDS);
    }

    public DataSource getOriginalDataSource()
    {
        return zzajY;
    }

    public long getStartTime(TimeUnit timeunit)
    {
        return timeunit.convert(zzajW, TimeUnit.NANOSECONDS);
    }

    public long getTimestamp(TimeUnit timeunit)
    {
        return timeunit.convert(zzajV, TimeUnit.NANOSECONDS);
    }

    public long getTimestampNanos()
    {
        return zzajV;
    }

    public Value getValue(Field field)
    {
        int i = getDataType().indexOf(field);
        return zzajX[i];
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzajG, Long.valueOf(zzajV), Long.valueOf(zzajW)
        });
    }

    public transient DataPoint setFloatValues(float af[])
    {
        zzed(af.length);
        for (int i = 0; i < af.length; i++)
        {
            zzajX[i].setFloat(af[i]);
        }

        return this;
    }

    public transient DataPoint setIntValues(int ai[])
    {
        zzed(ai.length);
        for (int i = 0; i < ai.length; i++)
        {
            zzajX[i].setInt(ai[i]);
        }

        return this;
    }

    public DataPoint setTimeInterval(long l, long l1, TimeUnit timeunit)
    {
        zzajW = timeunit.toNanos(l);
        zzajV = timeunit.toNanos(l1);
        return this;
    }

    public DataPoint setTimestamp(long l, TimeUnit timeunit)
    {
        zzajV = timeunit.toNanos(l);
        if (zzqt() && zzlu.zza(timeunit))
        {
            Log.w("Fitness", "Storing location at more than millisecond granularity is not supported. Extra precision is lost as the value is converted to milliseconds.");
            zzajV = zzlu.zza(zzajV, TimeUnit.NANOSECONDS, TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public String toString()
    {
        String s1 = Arrays.toString(zzajX);
        long l = zzajW;
        long l1 = zzajV;
        long l2 = zzajZ;
        long l3 = zzaka;
        String s2 = zzajG.toDebugString();
        String s;
        if (zzajY != null)
        {
            s = zzajY.toDebugString();
        } else
        {
            s = "N/A";
        }
        return String.format("DataPoint{%s@[%s, %s,raw=%s,insert=%s](%s %s)}", new Object[] {
            s1, Long.valueOf(l), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), s2, s
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd.zza(this, parcel, i);
    }

    public Value[] zzqu()
    {
        return zzajX;
    }

    public long zzqv()
    {
        return zzajZ;
    }

    public long zzqw()
    {
        return zzaka;
    }

    public void zzqx()
    {
        DataSource datasource = getDataSource();
        zzu.zzb(getDataType().getName().equals(datasource.getDataType().getName()), "Conflicting data types found %s vs %s", new Object[] {
            getDataType(), getDataType()
        });
        boolean flag;
        if (zzajV > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Data point does not have the timestamp set: %s", new Object[] {
            this
        });
        if (zzajW <= zzajV)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Data point with start time greater than end time found: %s", new Object[] {
            this
        });
    }

    public long zzqy()
    {
        return zzajW;
    }

}
