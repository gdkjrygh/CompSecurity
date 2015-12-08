// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzlx;
import com.google.android.gms.location.places.personalized.zzd;

// Referenced classes of package com.google.android.gms.location.places:
//            PlaceLikelihoodBuffer, AutocompletePredictionBuffer, PlaceBuffer

public class zzl extends com.google.android.gms.location.places.internal.zzh.zza
{
    public static abstract class zza extends zzb
    {

        protected AutocompletePredictionBuffer zzaP(Status status)
        {
            return new AutocompletePredictionBuffer(DataHolder.zzbp(status.getStatusCode()));
        }

        protected Result zzb(Status status)
        {
            return zzaP(status);
        }

        public zza(com.google.android.gms.common.api.Api.zzc zzc1, GoogleApiClient googleapiclient)
        {
            super(zzc1, googleapiclient);
        }
    }

    public static abstract class zzb extends com.google.android.gms.common.api.zzc.zza
    {

        public zzb(com.google.android.gms.common.api.Api.zzc zzc1, GoogleApiClient googleapiclient)
        {
            super(zzc1, googleapiclient);
        }
    }

    public static abstract class zzc extends zzb
    {

        protected PlaceBuffer zzaQ(Status status)
        {
            return new PlaceBuffer(DataHolder.zzbp(status.getStatusCode()), null);
        }

        protected Result zzb(Status status)
        {
            return zzaQ(status);
        }

        public zzc(com.google.android.gms.common.api.Api.zzc zzc1, GoogleApiClient googleapiclient)
        {
            super(zzc1, googleapiclient);
        }
    }

    public static abstract class zzd extends zzb
    {

        protected PlaceLikelihoodBuffer zzaR(Status status)
        {
            return new PlaceLikelihoodBuffer(DataHolder.zzbp(status.getStatusCode()), 100, null);
        }

        protected Result zzb(Status status)
        {
            return zzaR(status);
        }

        public zzd(com.google.android.gms.common.api.Api.zzc zzc1, GoogleApiClient googleapiclient)
        {
            super(zzc1, googleapiclient);
        }
    }

    public static abstract class zze extends zzb
    {

        protected com.google.android.gms.location.places.personalized.zzd zzaS(Status status)
        {
            return com.google.android.gms.location.places.personalized.zzd.zzaT(status);
        }

        protected Result zzb(Status status)
        {
            return zzaS(status);
        }
    }

    public static abstract class zzf extends zzb
    {

        protected Result zzb(Status status)
        {
            return zzd(status);
        }

        protected Status zzd(Status status)
        {
            return status;
        }

        public zzf(com.google.android.gms.common.api.Api.zzc zzc1, GoogleApiClient googleapiclient)
        {
            super(zzc1, googleapiclient);
        }
    }


    private static final String TAG = com/google/android/gms/location/places/zzl.getSimpleName();
    private final Context mContext;
    private final zzd zzaDP;
    private final zza zzaDQ;
    private final zze zzaDR;
    private final zzf zzaDS;
    private final zzc zzaDT;

    public zzl(zza zza1)
    {
        zzaDP = null;
        zzaDQ = zza1;
        zzaDR = null;
        zzaDS = null;
        zzaDT = null;
        mContext = null;
    }

    public zzl(zzc zzc1, Context context)
    {
        zzaDP = null;
        zzaDQ = null;
        zzaDR = null;
        zzaDS = null;
        zzaDT = zzc1;
        mContext = context;
    }

    public zzl(zzd zzd1, Context context)
    {
        zzaDP = zzd1;
        zzaDQ = null;
        zzaDR = null;
        zzaDS = null;
        zzaDT = null;
        mContext = context;
    }

    public zzl(zzf zzf1)
    {
        zzaDP = null;
        zzaDQ = null;
        zzaDR = null;
        zzaDS = zzf1;
        zzaDT = null;
        mContext = null;
    }

    public void zzZ(DataHolder dataholder)
        throws RemoteException
    {
        boolean flag;
        if (zzaDP != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, "placeEstimator cannot be null");
        if (dataholder == null)
        {
            if (Log.isLoggable(TAG, 6))
            {
                Log.e(TAG, (new StringBuilder()).append("onPlaceEstimated received null DataHolder: ").append(zzlx.zzpY()).toString());
            }
            zzaDP.zzx(Status.zzaaF);
            return;
        } else
        {
            dataholder = new PlaceLikelihoodBuffer(dataholder, 100, mContext);
            zzaDP.zza(dataholder);
            return;
        }
    }

    public void zzaO(Status status)
        throws RemoteException
    {
        zzaDS.zza(status);
    }

    public void zzaa(DataHolder dataholder)
        throws RemoteException
    {
        if (dataholder == null)
        {
            if (Log.isLoggable(TAG, 6))
            {
                Log.e(TAG, (new StringBuilder()).append("onAutocompletePrediction received null DataHolder: ").append(zzlx.zzpY()).toString());
            }
            zzaDQ.zzx(Status.zzaaF);
            return;
        } else
        {
            zzaDQ.zza(new AutocompletePredictionBuffer(dataholder));
            return;
        }
    }

    public void zzab(DataHolder dataholder)
        throws RemoteException
    {
        if (dataholder == null)
        {
            if (Log.isLoggable(TAG, 6))
            {
                Log.e(TAG, (new StringBuilder()).append("onPlaceUserDataFetched received null DataHolder: ").append(zzlx.zzpY()).toString());
            }
            zzaDR.zzx(Status.zzaaF);
            return;
        } else
        {
            zzaDR.zza(new com.google.android.gms.location.places.personalized.zzd(dataholder));
            return;
        }
    }

    public void zzac(DataHolder dataholder)
        throws RemoteException
    {
        dataholder = new PlaceBuffer(dataholder, mContext);
        zzaDT.zza(dataholder);
    }

}
