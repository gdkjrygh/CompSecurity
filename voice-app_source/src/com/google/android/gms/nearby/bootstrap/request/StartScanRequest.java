// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzol;
import com.google.android.gms.internal.zzon;

// Referenced classes of package com.google.android.gms.nearby.bootstrap.request:
//            zzg

public class StartScanRequest
    implements SafeParcelable
{

    public static final zzg CREATOR = new zzg();
    final int versionCode;
    private final zzol zzaFk;
    private final zzon zzaFm;

    StartScanRequest(int i, IBinder ibinder, IBinder ibinder1)
    {
        versionCode = i;
        zzu.zzu(ibinder);
        zzaFm = com.google.android.gms.internal.zzon.zza.zzcZ(ibinder);
        zzu.zzu(ibinder1);
        zzaFk = com.google.android.gms.internal.zzol.zza.zzcX(ibinder1);
    }

    public int describeContents()
    {
        zzg zzg1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzg zzg1 = CREATOR;
        zzg.zza(this, parcel, i);
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

    public IBinder zzwQ()
    {
        if (zzaFm == null)
        {
            return null;
        } else
        {
            return zzaFm.asBinder();
        }
    }

}
