// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.zzm;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzi, zzj

class zzaAp extends com.google.android.gms.location.places.d
{

    final PlaceFilter zzaAp;
    final zzi zzaAq;

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzj)ient);
    }

    protected void zza(zzj zzj1)
        throws RemoteException
    {
        zzj1.zza(new zzm(this, zzj1.getContext()), zzaAp);
    }

    (zzi zzi1, com.google.android.gms.common.api.ientKey ientkey, GoogleApiClient googleapiclient, PlaceFilter placefilter)
    {
        zzaAq = zzi1;
        zzaAp = placefilter;
        super(ientkey, googleapiclient);
    }
}
