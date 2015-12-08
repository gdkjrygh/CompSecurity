// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzh, zzba, zzbn

class t extends zzh
{

    final zzba zzbaJ;

    protected volatile void zza(com.google.android.gms.common.api. )
        throws RemoteException
    {
        zza((zzbn));
    }

    protected void zza(zzbn zzbn1)
        throws RemoteException
    {
        zzbn1.zzp(this);
    }

    protected Result zzb(Status status)
    {
        return zzbv(status);
    }

    protected com.google.android.gms.wearable..GetConnectedNodesResult zzbv(Status status)
    {
        return new b(status, new ArrayList());
    }

    t(zzba zzba1, GoogleApiClient googleapiclient)
    {
        zzbaJ = zzba1;
        super(googleapiclient);
    }
}
