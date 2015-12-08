// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.fitness.result:
//            zzl

public class SyncInfoResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzl();
    private final int zzCY;
    private final Status zzOt;
    private final long zzVp;

    SyncInfoResult(int i, Status status, long l)
    {
        zzCY = i;
        zzOt = status;
        zzVp = l;
    }

    private boolean zzb(SyncInfoResult syncinforesult)
    {
        return zzOt.equals(syncinforesult.zzOt) && zzt.equal(Long.valueOf(zzVp), Long.valueOf(syncinforesult.zzVp));
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof SyncInfoResult) && zzb((SyncInfoResult)obj);
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
            zzOt, Long.valueOf(zzVp)
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("status", zzOt).zzg("timestamp", Long.valueOf(zzVp)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzl.zza(this, parcel, i);
    }

    public long zzrz()
    {
        return zzVp;
    }

}
