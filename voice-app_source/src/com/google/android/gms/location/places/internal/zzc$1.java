// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.zzm;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzc, zzd

class zzaAg extends com.google.android.gms.location.places.c
{

    final AddPlaceRequest zzaAg;
    final zzc zzaAh;

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzd)ient);
    }

    protected void zza(zzd zzd1)
        throws RemoteException
    {
        zzd1.zza(new zzm(this, zzd1.getContext()), zzaAg);
    }

    (zzc zzc1, com.google.android.gms.common.api.ientKey ientkey, GoogleApiClient googleapiclient, AddPlaceRequest addplacerequest)
    {
        zzaAh = zzc1;
        zzaAg = addplacerequest;
        super(ientkey, googleapiclient);
    }
}
