// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzo, DataSet, zzs

public final class RawDataSet
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzo();
    final int zzCY;
    public final boolean zzajU;
    public final int zzakH;
    public final int zzakJ;
    public final List zzakK;

    public RawDataSet(int i, int j, int k, List list, boolean flag)
    {
        zzCY = i;
        zzakH = j;
        zzakJ = k;
        zzakK = list;
        zzajU = flag;
    }

    public RawDataSet(DataSet dataset, List list, List list1)
    {
        zzCY = 3;
        zzakK = dataset.zzk(list);
        zzajU = dataset.zzqr();
        zzakH = zzs.zza(dataset.getDataSource(), list);
        zzakJ = zzs.zza(dataset.getDataType(), list1);
    }

    private boolean zza(RawDataSet rawdataset)
    {
        return zzakH == rawdataset.zzakH && zzajU == rawdataset.zzajU && zzt.equal(zzakK, rawdataset.zzakK);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof RawDataSet) && zza((RawDataSet)obj);
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            Integer.valueOf(zzakH)
        });
    }

    public String toString()
    {
        return String.format("RawDataSet{%s@[%s]}", new Object[] {
            Integer.valueOf(zzakH), zzakK
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzo.zza(this, parcel, i);
    }

}
