// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzm, Bucket, DataSet, RawDataSet, 
//            Session

public final class RawBucket
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzm();
    final int zzCY;
    public final long zzKT;
    public final long zzajH;
    public final Session zzajJ;
    public final List zzajS;
    public final int zzajT;
    public final boolean zzajU;
    public final int zzakG;

    public RawBucket(int i, long l, long l1, Session session, int j, 
            List list, int k, boolean flag)
    {
        zzCY = i;
        zzKT = l;
        zzajH = l1;
        zzajJ = session;
        zzakG = j;
        zzajS = list;
        zzajT = k;
        zzajU = flag;
    }

    public RawBucket(Bucket bucket, List list, List list1)
    {
        zzCY = 2;
        zzKT = bucket.getStartTime(TimeUnit.MILLISECONDS);
        zzajH = bucket.getEndTime(TimeUnit.MILLISECONDS);
        zzajJ = bucket.getSession();
        zzakG = bucket.zzqq();
        zzajT = bucket.getBucketType();
        zzajU = bucket.zzqr();
        bucket = bucket.getDataSets();
        zzajS = new ArrayList(bucket.size());
        DataSet dataset;
        for (bucket = bucket.iterator(); bucket.hasNext(); zzajS.add(new RawDataSet(dataset, list, list1)))
        {
            dataset = (DataSet)bucket.next();
        }

    }

    private boolean zza(RawBucket rawbucket)
    {
        return zzKT == rawbucket.zzKT && zzajH == rawbucket.zzajH && zzakG == rawbucket.zzakG && zzt.equal(zzajS, rawbucket.zzajS) && zzajT == rawbucket.zzajT && zzajU == rawbucket.zzajU;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof RawBucket) && zza((RawBucket)obj);
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            Long.valueOf(zzKT), Long.valueOf(zzajH), Integer.valueOf(zzajT)
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("startTime", Long.valueOf(zzKT)).zzg("endTime", Long.valueOf(zzajH)).zzg("activity", Integer.valueOf(zzakG)).zzg("dataSets", zzajS).zzg("bucketType", Integer.valueOf(zzajT)).zzg("serverHasMoreData", Boolean.valueOf(zzajU)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzm.zza(this, parcel, i);
    }

}
