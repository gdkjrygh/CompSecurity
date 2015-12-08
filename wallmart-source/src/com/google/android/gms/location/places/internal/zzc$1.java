// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.zzl;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzc, zzd

class zzaEd extends com.google.android.gms.location.places.c
{

    final AddPlaceRequest zzaEd;
    final zzc zzaEe;

    protected volatile void zza(com.google.android.gms.common.api.b b)
        throws RemoteException
    {
        zza((zzd)b);
    }

    protected void zza(zzd zzd1)
        throws RemoteException
    {
        zzd1.zza(new zzl(this, zzd1.getContext()), zzaEd);
    }

    (zzc zzc1, com.google.android.gms.common.api.c c, GoogleApiClient googleapiclient, AddPlaceRequest addplacerequest)
    {
        zzaEe = zzc1;
        zzaEd = addplacerequest;
        super(c, googleapiclient);
    }
}
