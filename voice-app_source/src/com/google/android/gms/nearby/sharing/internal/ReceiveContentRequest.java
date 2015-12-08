// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.nearby.sharing.internal:
//            zzg, zzc, zza

public final class ReceiveContentRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzg();
    public String packageName;
    final int versionCode;
    public IBinder zzaGp;
    public zzc zzaGt;
    public zza zzaGu;

    ReceiveContentRequest()
    {
        versionCode = 1;
    }

    ReceiveContentRequest(int i, IBinder ibinder, IBinder ibinder1, String s, IBinder ibinder2)
    {
        versionCode = i;
        zzaGp = ibinder;
        zzaGu = zza.zza.zzdh(ibinder1);
        packageName = s;
        zzaGt = zzc.zza.zzdj(ibinder2);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzg.zza(this, parcel, i);
    }

    IBinder zzxa()
    {
        return zzaGt.asBinder();
    }

    IBinder zzxj()
    {
        if (zzaGu == null)
        {
            return null;
        } else
        {
            return zzaGu.asBinder();
        }
    }

}
