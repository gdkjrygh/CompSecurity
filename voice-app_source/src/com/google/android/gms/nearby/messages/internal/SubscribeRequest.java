// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            zzj, zzb, zza

public final class SubscribeRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzj();
    final int zzCY;
    public final Strategy zzaGc;
    public final zzb zzaGd;
    public final String zzaGe;
    public final zza zzaGf;
    public final MessageFilter zzaGg;
    public final PendingIntent zzaGh;
    public final int zzaGi;
    public final String zzayp;

    SubscribeRequest(int i, IBinder ibinder, Strategy strategy, IBinder ibinder1, MessageFilter messagefilter, PendingIntent pendingintent, int j, 
            String s, String s1)
    {
        zzCY = i;
        zzaGf = zza.zza.zzdd(ibinder);
        zzaGc = strategy;
        zzaGd = zzb.zza.zzde(ibinder1);
        zzaGg = messagefilter;
        zzaGh = pendingintent;
        zzaGi = j;
        zzayp = s;
        zzaGe = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzj.zza(this, parcel, i);
    }

    IBinder zzxa()
    {
        if (zzaGd == null)
        {
            return null;
        } else
        {
            return zzaGd.asBinder();
        }
    }

    IBinder zzxb()
    {
        if (zzaGf == null)
        {
            return null;
        } else
        {
            return zzaGf.asBinder();
        }
    }

}
