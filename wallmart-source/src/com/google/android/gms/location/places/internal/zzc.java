// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.GeoDataApi;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.location.places.zzf;
import com.google.android.gms.location.places.zzl;
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
        return googleapiclient.zzb(new com.google.android.gms.location.places.zzl.zzc(Places.zzaDN, googleapiclient, addplacerequest) {

            final AddPlaceRequest zzaEd;
            final zzc zzaEe;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
                throws RemoteException
            {
                zza((zzd)zzb);
            }

            protected void zza(zzd zzd1)
                throws RemoteException
            {
                zzd1.zza(new zzl(this, zzd1.getContext()), zzaEd);
            }

            
            {
                zzaEe = zzc.this;
                zzaEd = addplacerequest;
                super(zzc2, googleapiclient);
            }
        });
    }

    public PendingResult getAutocompletePredictions(GoogleApiClient googleapiclient, String s, LatLngBounds latlngbounds, AutocompleteFilter autocompletefilter)
    {
        return googleapiclient.zza(new com.google.android.gms.location.places.zzl.zza(Places.zzaDN, googleapiclient, s, latlngbounds, autocompletefilter) {

            final zzc zzaEe;
            final LatLngBounds zzaEg;
            final AutocompleteFilter zzaEh;
            final String zzauM;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
                throws RemoteException
            {
                zza((zzd)zzb);
            }

            protected void zza(zzd zzd1)
                throws RemoteException
            {
                zzd1.zza(new zzl(this), zzauM, zzaEg, zzaEh);
            }

            
            {
                zzaEe = zzc.this;
                zzauM = s;
                zzaEg = latlngbounds;
                zzaEh = autocompletefilter;
                super(zzc2, googleapiclient);
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
        zzx.zzZ(flag);
        return googleapiclient.zza(new com.google.android.gms.location.places.zzl.zzc(Places.zzaDN, googleapiclient, as) {

            final zzc zzaEe;
            final String zzaEf[];

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
                throws RemoteException
            {
                zza((zzd)zzb);
            }

            protected void zza(zzd zzd1)
                throws RemoteException
            {
                java.util.List list = Arrays.asList(zzaEf);
                zzd1.zza(new zzl(this, zzd1.getContext()), list);
            }

            
            {
                zzaEe = zzc.this;
                zzaEf = as;
                super(zzc2, googleapiclient);
            }
        });
    }

    public PendingResult getPlacePhotos(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zza(new com.google.android.gms.location.places.zzf.zzb(Places.zzaDN, googleapiclient, s) {

            final zzc zzaEe;
            final String zzaEi;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
                throws RemoteException
            {
                zza((zzd)zzb);
            }

            protected void zza(zzd zzd1)
                throws RemoteException
            {
                zzd1.zza(new zzf(this), zzaEi);
            }

            
            {
                zzaEe = zzc.this;
                zzaEi = s;
                super(zzc2, googleapiclient);
            }
        });
    }
}
