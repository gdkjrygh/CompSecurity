// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzbf, zzav

public class RemoveListenerRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzbf();
    final int mVersionCode;
    public final zzav zzaZq;

    RemoveListenerRequest(int i, IBinder ibinder)
    {
        mVersionCode = i;
        if (ibinder != null)
        {
            zzaZq = zzav.zza.zzdZ(ibinder);
            return;
        } else
        {
            zzaZq = null;
            return;
        }
    }

    public RemoveListenerRequest(zzav zzav1)
    {
        mVersionCode = 1;
        zzaZq = zzav1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzbf.zza(this, parcel, i);
    }

    IBinder zzCt()
    {
        if (zzaZq == null)
        {
            return null;
        } else
        {
            return zzaZq.asBinder();
        }
    }

}
