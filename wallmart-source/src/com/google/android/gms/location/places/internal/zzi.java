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
import com.google.android.gms.location.places.zzl;

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
        return googleapiclient.zza(new com.google.android.gms.location.places.zzl.zzd(Places.zzaDO, googleapiclient, placefilter) {

            final PlaceFilter zzaEn;
            final zzi zzaEo;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
                throws RemoteException
            {
                zza((zzj)zzb);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(new zzl(this, zzj1.getContext()), zzaEn);
            }

            
            {
                zzaEo = zzi.this;
                zzaEn = placefilter;
                super(zzc, googleapiclient);
            }
        });
    }

    public PendingResult reportDeviceAtPlace(GoogleApiClient googleapiclient, PlaceReport placereport)
    {
        return googleapiclient.zzb(new com.google.android.gms.location.places.zzl.zzf(Places.zzaDO, googleapiclient, placereport) {

            final zzi zzaEo;
            final PlaceReport zzaEp;

            protected volatile void zza(com.google.android.gms.common.api.Api.zzb zzb)
                throws RemoteException
            {
                zza((zzj)zzb);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(new zzl(this), zzaEp);
            }

            
            {
                zzaEo = zzi.this;
                zzaEp = placereport;
                super(zzc, googleapiclient);
            }
        });
    }
}
