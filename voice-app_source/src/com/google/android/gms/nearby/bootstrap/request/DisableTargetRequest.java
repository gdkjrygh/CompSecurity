// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzol;

// Referenced classes of package com.google.android.gms.nearby.bootstrap.request:
//            zzc

public class DisableTargetRequest
    implements SafeParcelable
{

    public static final zzc CREATOR = new zzc();
    final int versionCode;
    private final zzol zzaFk;

    DisableTargetRequest(int i, IBinder ibinder)
    {
        versionCode = i;
        zzu.zzu(ibinder);
        zzaFk = com.google.android.gms.internal.zzol.zza.zzcX(ibinder);
    }

    public int describeContents()
    {
        zzc zzc1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc zzc1 = CREATOR;
        zzc.zza(this, parcel, i);
    }

    public IBinder zzqU()
    {
        if (zzaFk == null)
        {
            return null;
        } else
        {
            return zzaFk.asBinder();
        }
    }

}
