// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.identity.intents;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zznk;

// Referenced classes of package com.google.android.gms.identity.intents:
//            Address, UserAddressRequest

static final class a extends a
{

    final UserAddressRequest zzawv;
    final int zzaww;

    protected volatile void zza(com.google.android.gms.common.api. )
        throws RemoteException
    {
        zza((zznk));
    }

    protected void zza(zznk zznk1)
        throws RemoteException
    {
        zznk1.zza(zzawv, zzaww);
        setResult(Status.zzXP);
    }

    sRequest(GoogleApiClient googleapiclient, UserAddressRequest useraddressrequest, int i)
    {
        zzawv = useraddressrequest;
        zzaww = i;
        super(googleapiclient);
    }
}
