// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.zzl;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzi, zzj

class zzaEp extends com.google.android.gms.location.places.f
{

    final zzi zzaEo;
    final PlaceReport zzaEp;

    protected volatile void zza(com.google.android.gms.common.api.b b)
        throws RemoteException
    {
        zza((zzj)b);
    }

    protected void zza(zzj zzj1)
        throws RemoteException
    {
        zzj1.zza(new zzl(this), zzaEp);
    }

    (zzi zzi1, com.google.android.gms.common.api.c c, GoogleApiClient googleapiclient, PlaceReport placereport)
    {
        zzaEo = zzi1;
        zzaEp = placereport;
        super(c, googleapiclient);
    }
}
