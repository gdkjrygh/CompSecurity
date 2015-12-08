// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.zzm;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzi, zzj

class zzaAr extends com.google.android.gms.location.places.f
{

    final zzi zzaAq;
    final PlaceReport zzaAr;

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzj)ient);
    }

    protected void zza(zzj zzj1)
        throws RemoteException
    {
        zzj1.zza(new zzm(this), zzaAr);
    }

    (zzi zzi1, com.google.android.gms.common.api.ientKey ientkey, GoogleApiClient googleapiclient, PlaceReport placereport)
    {
        zzaAq = zzi1;
        zzaAr = placereport;
        super(ientkey, googleapiclient);
    }
}
