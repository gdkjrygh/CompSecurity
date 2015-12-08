// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.result:
//            zze

public class DataSourcesResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zze();
    private final int zzCY;
    private final Status zzOt;
    private final List zzalP;

    DataSourcesResult(int i, List list, Status status)
    {
        zzCY = i;
        zzalP = Collections.unmodifiableList(list);
        zzOt = status;
    }

    public DataSourcesResult(List list, Status status)
    {
        zzCY = 3;
        zzalP = Collections.unmodifiableList(list);
        zzOt = status;
    }

    public static DataSourcesResult zzL(Status status)
    {
        return new DataSourcesResult(Collections.emptyList(), status);
    }

    private boolean zzb(DataSourcesResult datasourcesresult)
    {
        return zzOt.equals(datasourcesresult.zzOt) && zzt.equal(zzalP, datasourcesresult.zzalP);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof DataSourcesResult) && zzb((DataSourcesResult)obj);
    }

    public List getDataSources()
    {
        return zzalP;
    }

    public List getDataSources(DataType datatype)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = zzalP.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            DataSource datasource = (DataSource)iterator.next();
            if (datasource.getDataType().equals(datatype))
            {
                arraylist.add(datasource);
            }
        } while (true);
        return Collections.unmodifiableList(arraylist);
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
            zzOt, zzalP
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("status", zzOt).zzg("dataSets", zzalP).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i);
    }

}
