// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.zzl;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzi, zzj

class zzaEn extends com.google.android.gms.location.places.d
{

    final PlaceFilter zzaEn;
    final zzi zzaEo;

    protected volatile void zza(com.google.android.gms.common.api.b b)
        throws RemoteException
    {
        zza((zzj)b);
    }

    protected void zza(zzj zzj1)
        throws RemoteException
    {
        zzj1.zza(new zzl(this, zzj1.getContext()), zzaEn);
    }

    (zzi zzi1, com.google.android.gms.common.api.c c, GoogleApiClient googleapiclient, PlaceFilter placefilter)
    {
        zzaEo = zzi1;
        zzaEn = placefilter;
        super(c, googleapiclient);
    }
}
