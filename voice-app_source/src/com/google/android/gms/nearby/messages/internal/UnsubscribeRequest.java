// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            zzl, zzb, zza

public final class UnsubscribeRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzl();
    final int zzCY;
    public final zzb zzaGd;
    public final String zzaGe;
    public final zza zzaGf;
    public final PendingIntent zzaGh;
    public final int zzaGi;
    public final String zzayp;

    UnsubscribeRequest(int i, IBinder ibinder, IBinder ibinder1, PendingIntent pendingintent, int j, String s, String s1)
    {
        zzCY = i;
        zzaGf = zza.zza.zzdd(ibinder);
        zzaGd = zzb.zza.zzde(ibinder1);
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
        zzl.zza(this, parcel, i);
    }

    IBinder zzxa()
    {
        return zzaGd.asBinder();
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
