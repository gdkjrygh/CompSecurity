// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zze, DataSource, RawDataPoint, DataPoint, 
//            RawDataSet, DataType

public final class DataSet
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zze();
    private final int zzCY;
    private final DataType zzajF;
    private final DataSource zzajG;
    private boolean zzajU;
    private final List zzakb;
    private final List zzakc;

    DataSet(int i, DataSource datasource, DataType datatype, List list, List list1, boolean flag)
    {
        zzajU = false;
        zzCY = i;
        zzajG = datasource;
        zzajF = datasource.getDataType();
        zzajU = flag;
        zzakb = new ArrayList(list.size());
        if (i < 2)
        {
            list1 = Collections.singletonList(datasource);
        }
        zzakc = list1;
        for (datasource = list.iterator(); datasource.hasNext(); zzakb.add(new DataPoint(zzakc, datatype)))
        {
            datatype = (RawDataPoint)datasource.next();
        }

    }

    public DataSet(DataSource datasource)
    {
        zzajU = false;
        zzCY = 3;
        zzajG = (DataSource)zzu.zzu(datasource);
        zzajF = datasource.getDataType();
        zzakb = new ArrayList();
        zzakc = new ArrayList();
        zzakc.add(zzajG);
    }

    public DataSet(RawDataSet rawdataset, List list)
    {
        zzajU = false;
        zzCY = 3;
        zzajG = (DataSource)zzb(list, rawdataset.zzakH);
        zzajF = zzajG.getDataType();
        zzakc = list;
        zzajU = rawdataset.zzajU;
        rawdataset = rawdataset.zzakK;
        zzakb = new ArrayList(rawdataset.size());
        for (rawdataset = rawdataset.iterator(); rawdataset.hasNext(); zzakb.add(new DataPoint(zzakc, list)))
        {
            list = (RawDataPoint)rawdataset.next();
        }

    }

    public static DataSet create(DataSource datasource)
    {
        zzu.zzb(datasource, "DataSource should be specified");
        return new DataSet(datasource);
    }

    private boolean zza(DataSet dataset)
    {
        return zzt.equal(getDataType(), dataset.getDataType()) && zzt.equal(zzajG, dataset.zzajG) && zzt.equal(zzakb, dataset.zzakb) && zzajU == dataset.zzajU;
    }

    private static Object zzb(List list, int i)
    {
        if (i >= 0 && i < list.size())
        {
            return list.get(i);
        } else
        {
            return null;
        }
    }

    public void add(DataPoint datapoint)
    {
        DataSource datasource = datapoint.getDataSource();
        zzu.zzb(datasource.getStreamIdentifier().equals(zzajG.getStreamIdentifier()), "Conflicting data sources found %s vs %s", new Object[] {
            datasource, zzajG
        });
        datapoint.zzqx();
        zzb(datapoint);
    }

    public void addAll(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); add((DataPoint)iterable.next())) { }
    }

    public DataPoint createDataPoint()
    {
        return DataPoint.create(zzajG);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof DataSet) && zza((DataSet)obj);
    }

    public List getDataPoints()
    {
        return Collections.unmodifiableList(zzakb);
    }

    public DataSource getDataSource()
    {
        return zzajG;
    }

    public DataType getDataType()
    {
        return zzajG.getDataType();
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzajG
        });
    }

    public boolean isEmpty()
    {
        return zzakb.isEmpty();
    }

    public String toString()
    {
        Object obj = zzqz();
        String s = zzajG.toDebugString();
        if (zzakb.size() >= 10)
        {
            obj = String.format("%d data points, first 5: %s", new Object[] {
                Integer.valueOf(zzakb.size()), ((List) (obj)).subList(0, 5)
            });
        }
        return String.format("DataSet{%s %s}", new Object[] {
            s, obj
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i);
    }

    public void zzb(DataPoint datapoint)
    {
        zzakb.add(datapoint);
        datapoint = datapoint.getOriginalDataSource();
        if (datapoint != null && !zzakc.contains(datapoint))
        {
            zzakc.add(datapoint);
        }
    }

    public void zzb(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); zzb((DataPoint)iterable.next())) { }
    }

    List zzk(List list)
    {
        ArrayList arraylist = new ArrayList(zzakb.size());
        for (Iterator iterator = zzakb.iterator(); iterator.hasNext(); arraylist.add(new RawDataPoint((DataPoint)iterator.next(), list))) { }
        return arraylist;
    }

    List zzqA()
    {
        return zzakc;
    }

    public boolean zzqr()
    {
        return zzajU;
    }

    List zzqz()
    {
        return zzk(zzakc);
    }

}
