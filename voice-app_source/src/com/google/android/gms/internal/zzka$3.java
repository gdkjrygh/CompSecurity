// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal:
//            zzka, zzkb

class eApiClient extends b
{

    final zzka zzVx;

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zzkb)ent);
    }

    protected void zza(zzkb zzkb1)
        throws RemoteException
    {
        zzkb1.zza(new b.zzb(this));
    }

    eApiClient(zzka zzka1, GoogleApiClient googleapiclient)
    {
        zzVx = zzka1;
        super(zzka1, googleapiclient);
    }
}
