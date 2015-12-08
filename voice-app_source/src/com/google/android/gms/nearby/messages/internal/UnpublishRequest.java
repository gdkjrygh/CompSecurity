// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            zzk, zzb, MessageWrapper

public final class UnpublishRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzk();
    final int zzCY;
    public final MessageWrapper zzaGb;
    public final zzb zzaGd;
    public final String zzaGe;
    public final String zzayp;

    UnpublishRequest(int i, MessageWrapper messagewrapper, IBinder ibinder, String s, String s1)
    {
        zzCY = i;
        zzaGb = messagewrapper;
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
        zzk.zza(this, parcel, i);
    }

    IBinder zzxa()
    {
        return zzaGd.asBinder();
    }

}
