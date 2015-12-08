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
    final String zzVy;

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zzkb)ent);
    }

    protected void zza(zzkb zzkb1)
        throws RemoteException
    {
        zzkb1.zza(new b.zza(this, zzkb1), zzka.zzb(zzVx), zzVy);
    }

    eApiClient(zzka zzka1, GoogleApiClient googleapiclient, String s)
    {
        zzVx = zzka1;
        zzVy = s;
        super(zzka1, googleapiclient);
    }
}
