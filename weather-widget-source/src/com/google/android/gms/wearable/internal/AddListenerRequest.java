// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzb, zzbo, zzav

public class AddListenerRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    final int mVersionCode;
    public final zzav zzaZq;
    public final IntentFilter zzaZr[];
    public final String zzaZs;
    public final String zzaZt;

    AddListenerRequest(int i, IBinder ibinder, IntentFilter aintentfilter[], String s, String s1)
    {
        mVersionCode = i;
        if (ibinder != null)
        {
            zzaZq = zzav.zza.zzdZ(ibinder);
        } else
        {
            zzaZq = null;
        }
        zzaZr = aintentfilter;
        zzaZs = s;
        zzaZt = s1;
    }

    public AddListenerRequest(zzbo zzbo1)
    {
        mVersionCode = 1;
        zzaZq = zzbo1;
        zzaZr = zzbo1.zzCJ();
        zzaZs = zzbo1.zzCK();
        zzaZt = zzbo1.zzCL();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
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
