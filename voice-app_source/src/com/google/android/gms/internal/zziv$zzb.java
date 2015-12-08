// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.appdatasearch.zza;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal:
//            zziv, zzit, zziq

private static abstract class entKey extends com.google.android.gms.common.api.tKey
{

    protected volatile void zza(com.google.android.gms.common.api.t t)
        throws RemoteException
    {
        zza((zzit)t);
    }

    protected abstract void zza(zziq zziq)
        throws RemoteException;

    protected final void zza(zzit zzit1)
        throws RemoteException
    {
        zza(zzit1.zzkO());
    }

    public piClient(GoogleApiClient googleapiclient)
    {
        super(zza.zzMO, googleapiclient);
    }
}
