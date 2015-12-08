// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.Strategy;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            zzi, zzb, MessageWrapper

public final class PublishRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzi();
    final int zzCY;
    public final MessageWrapper zzaGb;
    public final Strategy zzaGc;
    public final zzb zzaGd;
    public final String zzaGe;
    public final String zzayp;

    PublishRequest(int i, MessageWrapper messagewrapper, Strategy strategy, IBinder ibinder, String s, String s1)
    {
        zzCY = i;
        zzaGb = messagewrapper;
        zzaGc = strategy;
        zzaGd = zzb.zza.zzde(ibinder);
        zzayp = s;
        zzaGe = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.zza(this, parcel, i);
    }

    IBinder zzxa()
    {
        return zzaGd.asBinder();
    }

}
