// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzbc, zzas

public class RemoveListenerRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzbc();
    final int zzCY;
    public final zzas zzaTq;

    RemoveListenerRequest(int i, IBinder ibinder)
    {
        zzCY = i;
        if (ibinder != null)
        {
            zzaTq = zzas.zza.zzdP(ibinder);
            return;
        } else
        {
            zzaTq = null;
            return;
        }
    }

    public RemoveListenerRequest(zzas zzas1)
    {
        zzCY = 1;
        zzaTq = zzas1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzbc.zza(this, parcel, i);
    }

    IBinder zzAT()
    {
        if (zzaTq == null)
        {
            return null;
        } else
        {
            return zzaTq.asBinder();
        }
    }

}
