// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.fitness.result:
//            zzi

public class ReadRawResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzi();
    private final int zzCY;
    private final DataHolder zzWu;

    ReadRawResult(int i, DataHolder dataholder)
    {
        zzCY = i;
        zzWu = dataholder;
    }

    public int describeContents()
    {
        return 0;
    }

    public Status getStatus()
    {
        return new Status(zzWu.getStatusCode());
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.zza(this, parcel, i);
    }

    DataHolder zzpx()
    {
        return zzWu;
    }

}
