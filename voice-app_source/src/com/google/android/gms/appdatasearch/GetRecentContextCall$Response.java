// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            GetRecentContextCall, zzg

public static class zzNp
    implements Result, SafeParcelable
{

    public static final zzg CREATOR = new zzg();
    final int zzCY;
    public Status zzNn;
    public List zzNo;
    public String zzNp[];

    public int describeContents()
    {
        zzg zzg1 = CREATOR;
        return 0;
    }

    public Status getStatus()
    {
        return zzNn;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzg zzg1 = CREATOR;
        zzg.zza(this, parcel, i);
    }


    public ()
    {
        zzCY = 1;
    }

    zzCY(int i, Status status, List list, String as[])
    {
        zzCY = i;
        zzNn = status;
        zzNo = list;
        zzNp = as;
    }
}
