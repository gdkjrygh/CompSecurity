// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.zzl;
import com.google.android.gms.maps.model.LatLngBounds;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzc, zzd

class zzaEh extends com.google.android.gms.location.places.a
{

    final zzc zzaEe;
    final LatLngBounds zzaEg;
    final AutocompleteFilter zzaEh;
    final String zzauM;

    protected volatile void zza(com.google.android.gms.common.api.b b)
        throws RemoteException
    {
        zza((zzd)b);
    }

    protected void zza(zzd zzd1)
        throws RemoteException
    {
        zzd1.zza(new zzl(this), zzauM, zzaEg, zzaEh);
    }

    ter(zzc zzc1, com.google.android.gms.common.api.c c, GoogleApiClient googleapiclient, String s, LatLngBounds latlngbounds, AutocompleteFilter autocompletefilter)
    {
        zzaEe = zzc1;
        zzauM = s;
        zzaEg = latlngbounds;
        zzaEh = autocompletefilter;
        super(c, googleapiclient);
    }
}
