// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.fitness.data.DataSet;

// Referenced classes of package com.google.android.gms.fitness.result:
//            zzb

public class DailyTotalResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    private final int zzCY;
    private final Status zzOt;
    private final DataSet zzakO;

    DailyTotalResult(int i, Status status, DataSet dataset)
    {
        zzCY = i;
        zzOt = status;
        zzakO = dataset;
    }

    public DailyTotalResult(DataSet dataset, Status status)
    {
        zzCY = 1;
        zzOt = status;
        zzakO = dataset;
    }

    public static DailyTotalResult zzK(Status status)
    {
        return new DailyTotalResult(null, status);
    }

    private boolean zzb(DailyTotalResult dailytotalresult)
    {
        return zzOt.equals(dailytotalresult.zzOt) && zzt.equal(zzakO, dailytotalresult.zzakO);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof DailyTotalResult) && zzb((DailyTotalResult)obj);
    }

    public Status getStatus()
    {
        return zzOt;
    }

    public DataSet getTotal()
    {
        return zzakO;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzOt, zzakO
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("status", zzOt).zzg("dataPoint", zzakO).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.fitness.result.zzb.zza(this, parcel, i);
    }

}
