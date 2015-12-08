// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.GeoDataApi;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.location.places.zzm;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzd

public class zzc
    implements GeoDataApi
{

    public zzc()
    {
    }

    public PendingResult addPlace(GoogleApiClient googleapiclient, AddPlaceRequest addplacerequest)
    {
        return googleapiclient.zzb(new com.google.android.gms.location.places.zzm.zzc(Places.zzazQ, googleapiclient, addplacerequest) {

            final AddPlaceRequest zzaAg;
            final zzc zzaAh;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzd)client);
            }

            protected void zza(zzd zzd1)
                throws RemoteException
            {
                zzd1.zza(new zzm(this, zzd1.getContext()), zzaAg);
            }

            
            {
                zzaAh = zzc.this;
                zzaAg = addplacerequest;
                super(clientkey, googleapiclient);
            }
        });
    }

    public PendingResult getAutocompletePredictions(GoogleApiClient googleapiclient, String s, LatLngBounds latlngbounds, AutocompleteFilter autocompletefilter)
    {
        return googleapiclient.zza(new com.google.android.gms.location.places.zzm.zza(Places.zzazQ, googleapiclient, s, latlngbounds, autocompletefilter) {

            final zzc zzaAh;
            final LatLngBounds zzaAj;
            final AutocompleteFilter zzaAk;
            final String zzaqR;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzd)client);
            }

            protected void zza(zzd zzd1)
                throws RemoteException
            {
                zzd1.zza(new zzm(this), zzaqR, zzaAj, zzaAk);
            }

            
            {
                zzaAh = zzc.this;
                zzaqR = s;
                zzaAj = latlngbounds;
                zzaAk = autocompletefilter;
                super(clientkey, googleapiclient);
            }
        });
    }

    public transient PendingResult getPlaceById(GoogleApiClient googleapiclient, String as[])
    {
        boolean flag = true;
        if (as == null || as.length < 1)
        {
            flag = false;
        }
        zzu.zzV(flag);
        return googleapiclient.zza(new com.google.android.gms.location.places.zzm.zzc(Places.zzazQ, googleapiclient, as) {

            final zzc zzaAh;
            final String zzaAi[];

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzd)client);
            }

            protected void zza(zzd zzd1)
                throws RemoteException
            {
                java.util.List list = Arrays.asList(zzaAi);
                zzd1.zza(new zzm(this, zzd1.getContext()), list);
            }

            
            {
                zzaAh = zzc.this;
                zzaAi = as;
                super(clientkey, googleapiclient);
            }
        });
    }
}
