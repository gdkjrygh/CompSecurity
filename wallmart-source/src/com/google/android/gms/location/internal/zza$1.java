// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.location.internal:
//            zza, zzj

class nt extends a
{

    final long zzaCv;
    final PendingIntent zzaCw;
    final zza zzaCx;

    protected volatile void zza(com.google.android.gms.common.api.b b)
        throws RemoteException
    {
        zza((zzj)b);
    }

    protected void zza(zzj zzj1)
        throws RemoteException
    {
        zzj1.zza(zzaCv, zzaCw);
        zza(((com.google.android.gms.common.api.Result) (Status.zzaaD)));
    }

    nt(zza zza1, GoogleApiClient googleapiclient, long l, PendingIntent pendingintent)
    {
        zzaCx = zza1;
        zzaCv = l;
        zzaCw = pendingintent;
        super(googleapiclient);
    }
}
