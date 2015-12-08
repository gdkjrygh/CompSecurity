// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.places.PlaceDetectionApi;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.location.places.zzm;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzj

public class zzi
    implements PlaceDetectionApi
{

    public zzi()
    {
    }

    public PendingResult getCurrentPlace(GoogleApiClient googleapiclient, PlaceFilter placefilter)
    {
        return googleapiclient.zza(new com.google.android.gms.location.places.zzm.zzd(Places.zzazR, googleapiclient, placefilter) {

            final PlaceFilter zzaAp;
            final zzi zzaAq;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzj)client);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(new zzm(this, zzj1.getContext()), zzaAp);
            }

            
            {
                zzaAq = zzi.this;
                zzaAp = placefilter;
                super(clientkey, googleapiclient);
            }
        });
    }

    public PendingResult reportDeviceAtPlace(GoogleApiClient googleapiclient, PlaceReport placereport)
    {
        return googleapiclient.zzb(new com.google.android.gms.location.places.zzm.zzf(Places.zzazR, googleapiclient, placereport) {

            final zzi zzaAq;
            final PlaceReport zzaAr;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((zzj)client);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(new zzm(this), zzaAr);
            }

            
            {
                zzaAq = zzi.this;
                zzaAr = placereport;
                super(clientkey, googleapiclient);
            }
        });
    }
}
