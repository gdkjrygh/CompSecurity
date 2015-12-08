// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.fitness.data.DataType;

// Referenced classes of package com.google.android.gms.fitness.result:
//            zzg

public class DataTypeResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzg();
    private final int zzCY;
    private final Status zzOt;
    private final DataType zzajF;

    DataTypeResult(int i, Status status, DataType datatype)
    {
        zzCY = i;
        zzOt = status;
        zzajF = datatype;
    }

    public DataTypeResult(Status status, DataType datatype)
    {
        zzCY = 2;
        zzOt = status;
        zzajF = datatype;
    }

    public static DataTypeResult zzM(Status status)
    {
        return new DataTypeResult(status, null);
    }

    private boolean zzb(DataTypeResult datatyperesult)
    {
        return zzOt.equals(datatyperesult.zzOt) && zzt.equal(zzajF, datatyperesult.zzajF);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof DataTypeResult) && zzb((DataTypeResult)obj);
    }

    public DataType getDataType()
    {
        return zzajF;
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
            zzOt, zzajF
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("status", zzOt).zzg("dataType", zzajF).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzg.zza(this, parcel, i);
    }

}
