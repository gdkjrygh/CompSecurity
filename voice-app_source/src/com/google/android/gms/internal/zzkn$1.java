// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal:
//            zzkn, zzkp, zzkr

class eApiClient extends a
{

    final zzkn zzabk;

    protected volatile void zza(com.google.android.gms.common.api.ent ent)
        throws RemoteException
    {
        zza((zzkp)ent);
    }

    protected void zza(zzkp zzkp1)
        throws RemoteException
    {
        ((zzkr)zzkp1.zznM()).zza(new a(this));
    }

    eApiClient(zzkn zzkn1, GoogleApiClient googleapiclient)
    {
        zzabk = zzkn1;
        super(googleapiclient);
    }
}
