// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzb, zzbl, zzas

public class AddListenerRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    final int zzCY;
    public final zzas zzaTq;
    public final IntentFilter zzaTr[];
    public final String zzaTs;
    public final String zzaTt;

    AddListenerRequest(int i, IBinder ibinder, IntentFilter aintentfilter[], String s, String s1)
    {
        zzCY = i;
        if (ibinder != null)
        {
            zzaTq = zzas.zza.zzdP(ibinder);
        } else
        {
            zzaTq = null;
        }
        zzaTr = aintentfilter;
        zzaTs = s;
        zzaTt = s1;
    }

    public AddListenerRequest(zzbl zzbl1)
    {
        zzCY = 1;
        zzaTq = zzbl1;
        zzaTr = zzbl1.zzBh();
        zzaTs = zzbl1.zzBi();
        zzaTt = zzbl1.zzBj();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
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
