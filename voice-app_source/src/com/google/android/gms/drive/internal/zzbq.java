// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzd

public class zzbq extends zzd
{

    private final com.google.android.gms.common.api.zza.zzb zzOs;

    public zzbq(com.google.android.gms.common.api.zza.zzb zzb)
    {
        zzOs = zzb;
    }

    public void onSuccess()
        throws RemoteException
    {
        zzOs.zzm(Status.zzXP);
    }

    public void zzt(Status status)
        throws RemoteException
    {
        zzOs.zzm(status);
    }
}
