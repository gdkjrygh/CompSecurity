// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzg

public class DataSourceQueryParams
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzg();
    final int zzCY;
    public final long zzOw;
    public final DataSource zzajG;
    public final long zzajW;
    public final int zzalY;
    public final long zzamd;
    public final int zzame;

    DataSourceQueryParams(int i, DataSource datasource, long l, long l1, long l2, int j, int k)
    {
        zzCY = i;
        zzajG = datasource;
        zzOw = l;
        zzajW = l1;
        zzamd = l2;
        zzalY = j;
        zzame = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzg.zza(this, parcel, i);
    }

}
