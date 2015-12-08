// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.RawBucket;
import com.google.android.gms.fitness.data.RawDataSet;
import com.google.android.gms.fitness.request.DataReadRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.result:
//            zzc

public class DataReadResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    private final int zzCY;
    private final Status zzOt;
    private final List zzajS;
    private final List zzakc;
    private final List zzamP;
    private int zzamQ;
    private final List zzamR;

    DataReadResult(int i, List list, Status status, List list1, int j, List list2, List list3)
    {
        zzCY = i;
        zzOt = status;
        zzamQ = j;
        zzakc = list2;
        zzamR = list3;
        zzajS = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); zzajS.add(new DataSet(status, list2)))
        {
            status = (RawDataSet)list.next();
        }

        zzamP = new ArrayList(list1.size());
        for (list = list1.iterator(); list.hasNext(); zzamP.add(new Bucket(status, list2)))
        {
            status = (RawBucket)list.next();
        }

    }

    public DataReadResult(List list, List list1, Status status)
    {
        zzCY = 5;
        zzajS = list;
        zzOt = status;
        zzamP = list1;
        zzamQ = 1;
        zzakc = new ArrayList();
        zzamR = new ArrayList();
    }

    public static DataReadResult zza(Status status, DataReadRequest datareadrequest)
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = datareadrequest.getDataSources().iterator(); iterator.hasNext(); arraylist.add(DataSet.create((DataSource)iterator.next()))) { }
        DataType datatype;
        for (datareadrequest = datareadrequest.getDataTypes().iterator(); datareadrequest.hasNext(); arraylist.add(DataSet.create((new com.google.android.gms.fitness.data.DataSource.Builder()).setDataType(datatype).setType(1).setName("Default").build())))
        {
            datatype = (DataType)datareadrequest.next();
        }

        return new DataReadResult(arraylist, Collections.emptyList(), status);
    }

    private void zza(Bucket bucket, List list)
    {
label0:
        {
            for (Iterator iterator = list.iterator(); iterator.hasNext();)
            {
                list = (Bucket)iterator.next();
                if (list.zzb(bucket))
                {
                    for (bucket = bucket.getDataSets().iterator(); bucket.hasNext(); zza((DataSet)bucket.next(), list.getDataSets())) { }
                    break label0;
                }
            }

            zzamP.add(bucket);
        }
    }

    private void zza(DataSet dataset, List list)
    {
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            DataSet dataset1 = (DataSet)iterator.next();
            if (dataset1.getDataSource().equals(dataset.getDataSource()))
            {
                dataset1.zzb(dataset.getDataPoints());
                return;
            }
        }

        list.add(dataset);
    }

    private boolean zzc(DataReadResult datareadresult)
    {
        return zzOt.equals(datareadresult.zzOt) && zzt.equal(zzajS, datareadresult.zzajS) && zzt.equal(zzamP, datareadresult.zzamP);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof DataReadResult) && zzc((DataReadResult)obj);
    }

    public List getBuckets()
    {
        return zzamP;
    }

    public DataSet getDataSet(DataSource datasource)
    {
        for (Iterator iterator = zzajS.iterator(); iterator.hasNext();)
        {
            DataSet dataset = (DataSet)iterator.next();
            if (datasource.equals(dataset.getDataSource()))
            {
                return dataset;
            }
        }

        throw new IllegalArgumentException(String.format("Attempting to read data for %s, which was not requested", new Object[] {
            datasource.getStreamIdentifier()
        }));
    }

    public DataSet getDataSet(DataType datatype)
    {
        for (Iterator iterator = zzajS.iterator(); iterator.hasNext();)
        {
            DataSet dataset = (DataSet)iterator.next();
            if (datatype.equals(dataset.getDataType()))
            {
                return dataset;
            }
        }

        throw new IllegalArgumentException(String.format("Attempting to read data for %s, which was not requested", new Object[] {
            datatype.getName()
        }));
    }

    public List getDataSets()
    {
        return zzajS;
    }

    public Status getStatus()
    {
        return zzOt;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzOt, zzajS, zzamP
        });
    }

    public String toString()
    {
        com.google.android.gms.common.internal.zzt.zza zza1 = zzt.zzt(this).zzg("status", zzOt);
        Object obj;
        if (zzajS.size() > 5)
        {
            obj = (new StringBuilder()).append(zzajS.size()).append(" data sets").toString();
        } else
        {
            obj = zzajS;
        }
        zza1 = zza1.zzg("dataSets", obj);
        if (zzamP.size() > 5)
        {
            obj = (new StringBuilder()).append(zzamP.size()).append(" buckets").toString();
        } else
        {
            obj = zzamP;
        }
        return zza1.zzg("buckets", obj).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.fitness.result.zzc.zza(this, parcel, i);
    }

    public void zzb(DataReadResult datareadresult)
    {
        for (Iterator iterator = datareadresult.getDataSets().iterator(); iterator.hasNext(); zza((DataSet)iterator.next(), zzajS)) { }
        for (datareadresult = datareadresult.getBuckets().iterator(); datareadresult.hasNext(); zza((Bucket)datareadresult.next(), zzamP)) { }
    }

    List zzqA()
    {
        return zzakc;
    }

    public int zzrt()
    {
        return zzamQ;
    }

    List zzru()
    {
        ArrayList arraylist = new ArrayList(zzamP.size());
        for (Iterator iterator = zzamP.iterator(); iterator.hasNext(); arraylist.add(new RawBucket((Bucket)iterator.next(), zzakc, zzamR))) { }
        return arraylist;
    }

    List zzrv()
    {
        ArrayList arraylist = new ArrayList(zzajS.size());
        for (Iterator iterator = zzajS.iterator(); iterator.hasNext(); arraylist.add(new RawDataSet((DataSet)iterator.next(), zzakc, zzamR))) { }
        return arraylist;
    }

    List zzrw()
    {
        return zzamR;
    }

}
