// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.internal.zzmu;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzac

public class SubscribeRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzac();
    private final int zzCY;
    private final String zzMZ;
    private final zzmu zzalN;
    private final Subscription zzamM;
    private final boolean zzamN;

    SubscribeRequest(int i, Subscription subscription, boolean flag, IBinder ibinder, String s)
    {
        zzCY = i;
        zzamM = subscription;
        zzamN = flag;
        if (ibinder == null)
        {
            subscription = null;
        } else
        {
            subscription = com.google.android.gms.internal.zzmu.zza.zzbF(ibinder);
        }
        zzalN = subscription;
        zzMZ = s;
    }

    public SubscribeRequest(Subscription subscription, boolean flag, zzmu zzmu1, String s)
    {
        zzCY = 2;
        zzamM = subscription;
        zzamN = flag;
        zzalN = zzmu1;
        zzMZ = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getPackageName()
    {
        return zzMZ;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("subscription", zzamM).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzac.zza(this, parcel, i);
    }

    public IBinder zzqU()
    {
        if (zzalN == null)
        {
            return null;
        } else
        {
            return zzalN.asBinder();
        }
    }

    public Subscription zzrr()
    {
        return zzamM;
    }

    public boolean zzrs()
    {
        return zzamN;
    }

}
