// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzn, DataPoint, zzs, Value

public final class RawDataPoint
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzn();
    final int zzCY;
    public final long zzajV;
    public final long zzajW;
    public final Value zzajX[];
    public final long zzajZ;
    public final int zzakH;
    public final int zzakI;
    public final long zzaka;

    public RawDataPoint(int i, long l, long l1, Value avalue[], int j, 
            int k, long l2, long l3)
    {
        zzCY = i;
        zzajV = l;
        zzajW = l1;
        zzakH = j;
        zzakI = k;
        zzajZ = l2;
        zzaka = l3;
        zzajX = avalue;
    }

    RawDataPoint(DataPoint datapoint, List list)
    {
        zzCY = 4;
        zzajV = datapoint.getTimestamp(TimeUnit.NANOSECONDS);
        zzajW = datapoint.getStartTime(TimeUnit.NANOSECONDS);
        zzajX = datapoint.zzqu();
        zzakH = zzs.zza(datapoint.getDataSource(), list);
        zzakI = zzs.zza(datapoint.getOriginalDataSource(), list);
        zzajZ = datapoint.zzqv();
        zzaka = datapoint.zzqw();
    }

    private boolean zza(RawDataPoint rawdatapoint)
    {
        return zzajV == rawdatapoint.zzajV && zzajW == rawdatapoint.zzajW && Arrays.equals(zzajX, rawdatapoint.zzajX) && zzakH == rawdatapoint.zzakH && zzakI == rawdatapoint.zzakI && zzajZ == rawdatapoint.zzajZ;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof RawDataPoint) && zza((RawDataPoint)obj);
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            Long.valueOf(zzajV), Long.valueOf(zzajW)
        });
    }

    public String toString()
    {
        return String.format("RawDataPoint{%s@[%s, %s](%d,%d)}", new Object[] {
            Arrays.toString(zzajX), Long.valueOf(zzajW), Long.valueOf(zzajV), Integer.valueOf(zzakH), Integer.valueOf(zzakI)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzn.zza(this, parcel, i);
    }

}
