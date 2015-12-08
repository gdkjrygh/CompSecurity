// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.zzm;
import com.google.android.gms.maps.model.LatLngBounds;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzc, zzd

class zzaAk extends com.google.android.gms.location.places.a
{

    final zzc zzaAh;
    final LatLngBounds zzaAj;
    final AutocompleteFilter zzaAk;
    final String zzaqR;

    protected volatile void zza(com.google.android.gms.common.api.ient ient)
        throws RemoteException
    {
        zza((zzd)ient);
    }

    protected void zza(zzd zzd1)
        throws RemoteException
    {
        zzd1.zza(new zzm(this), zzaqR, zzaAj, zzaAk);
    }

    ter(zzc zzc1, com.google.android.gms.common.api.ientKey ientkey, GoogleApiClient googleapiclient, String s, LatLngBounds latlngbounds, AutocompleteFilter autocompletefilter)
    {
        zzaAh = zzc1;
        zzaqR = s;
        zzaAj = latlngbounds;
        zzaAk = autocompletefilter;
        super(ientkey, googleapiclient);
    }
}
