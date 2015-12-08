// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.appdatasearch.zza;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal:
//            zzgv, zzgt, zzgq

private static abstract class  extends com.google.android.gms.common.api.Client
{

    protected volatile void zza(com.google.android.gms.common.api.Client client)
        throws RemoteException
    {
        zza((zzgt)client);
    }

    protected abstract void zza(zzgq zzgq)
        throws RemoteException;

    protected final void zza(zzgt zzgt1)
        throws RemoteException
    {
        zza(zzgt1.zzjH());
    }

    public piClient(GoogleApiClient googleapiclient)
    {
        super(zza.zzIS, googleapiclient);
    }
}
