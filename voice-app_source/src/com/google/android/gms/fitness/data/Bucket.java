// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.fitness.FitnessActivities;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzc, RawBucket, DataSet, RawDataSet, 
//            DataType, Session

public class Bucket
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    public static final int TYPE_ACTIVITY_SEGMENT = 4;
    public static final int TYPE_ACTIVITY_TYPE = 3;
    public static final int TYPE_SESSION = 2;
    public static final int TYPE_TIME = 1;
    private final int zzCY;
    private final long zzKT;
    private final long zzajH;
    private final Session zzajJ;
    private final int zzajR;
    private final List zzajS;
    private final int zzajT;
    private boolean zzajU;

    Bucket(int i, long l, long l1, Session session, int j, 
            List list, int k, boolean flag)
    {
        zzajU = false;
        zzCY = i;
        zzKT = l;
        zzajH = l1;
        zzajJ = session;
        zzajR = j;
        zzajS = list;
        zzajT = k;
        zzajU = flag;
    }

    public Bucket(RawBucket rawbucket, List list)
    {
        this(2, rawbucket.zzKT, rawbucket.zzajH, rawbucket.zzajJ, rawbucket.zzakG, zza(rawbucket.zzajS, list), rawbucket.zzajT, rawbucket.zzajU);
    }

    private static List zza(Collection collection, List list)
    {
        ArrayList arraylist = new ArrayList(collection.size());
        for (collection = collection.iterator(); collection.hasNext(); arraylist.add(new DataSet((RawDataSet)collection.next(), list))) { }
        return arraylist;
    }

    private boolean zza(Bucket bucket)
    {
        return zzKT == bucket.zzKT && zzajH == bucket.zzajH && zzajR == bucket.zzajR && zzt.equal(zzajS, bucket.zzajS) && zzajT == bucket.zzajT && zzajU == bucket.zzajU;
    }

    public static String zzeb(int i)
    {
        switch (i)
        {
        default:
            return "bug";

        case 1: // '\001'
            return "time";

        case 3: // '\003'
            return "type";

        case 4: // '\004'
            return "segment";

        case 2: // '\002'
            return "session";

        case 0: // '\0'
            return "unknown";
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof Bucket) && zza((Bucket)obj);
    }

    public String getActivity()
    {
        return FitnessActivities.getName(zzajR);
    }

    public int getBucketType()
    {
        return zzajT;
    }

    public DataSet getDataSet(DataType datatype)
    {
        for (Iterator iterator = zzajS.iterator(); iterator.hasNext();)
        {
            DataSet dataset = (DataSet)iterator.next();
            if (dataset.getDataType().equals(datatype))
            {
                return dataset;
            }
        }

        return null;
    }

    public List getDataSets()
    {
        return zzajS;
    }

    public long getEndTime(TimeUnit timeunit)
    {
        return timeunit.convert(zzajH, TimeUnit.MILLISECONDS);
    }

    public Session getSession()
    {
        return zzajJ;
    }

    public long getStartTime(TimeUnit timeunit)
    {
        return timeunit.convert(zzKT, TimeUnit.MILLISECONDS);
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            Long.valueOf(zzKT), Long.valueOf(zzajH), Integer.valueOf(zzajR), Integer.valueOf(zzajT)
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("startTime", Long.valueOf(zzKT)).zzg("endTime", Long.valueOf(zzajH)).zzg("activity", Integer.valueOf(zzajR)).zzg("dataSets", zzajS).zzg("bucketType", zzeb(zzajT)).zzg("serverHasMoreData", Boolean.valueOf(zzajU)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

    public boolean zzb(Bucket bucket)
    {
        return zzKT == bucket.zzKT && zzajH == bucket.zzajH && zzajR == bucket.zzajR && zzajT == bucket.zzajT;
    }

    public long zzkt()
    {
        return zzKT;
    }

    public int zzqq()
    {
        return zzajR;
    }

    public boolean zzqr()
    {
        if (zzajU)
        {
            return true;
        }
        for (Iterator iterator = zzajS.iterator(); iterator.hasNext();)
        {
            if (((DataSet)iterator.next()).zzqr())
            {
                return true;
            }
        }

        return false;
    }

    public long zzqs()
    {
        return zzajH;
    }

}
