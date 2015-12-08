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
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlm;
import com.google.android.gms.location.places.personalized.zzd;

// Referenced classes of package com.google.android.gms.location.places:
//            PlaceLikelihoodBuffer, AutocompletePredictionBuffer, PlaceBuffer

public class zzm extends com.google.android.gms.location.places.internal.zzh.zza
{
    public static abstract class zza extends zzb
    {

        protected Result createFailedResult(Status status)
        {
            return zzaG(status);
        }

        protected AutocompletePredictionBuffer zzaG(Status status)
        {
            return new AutocompletePredictionBuffer(DataHolder.zzbi(status.getStatusCode()));
        }

        public zza(com.google.android.gms.common.api.Api.ClientKey clientkey, GoogleApiClient googleapiclient)
        {
            super(clientkey, googleapiclient);
        }
    }

    public static abstract class zzb extends com.google.android.gms.common.api.zza.zza
    {

        public zzb(com.google.android.gms.common.api.Api.ClientKey clientkey, GoogleApiClient googleapiclient)
        {
            super(clientkey, googleapiclient);
        }
    }

    public static abstract class zzc extends zzb
    {

        protected Result createFailedResult(Status status)
        {
            return zzaH(status);
        }

        protected PlaceBuffer zzaH(Status status)
        {
            return new PlaceBuffer(DataHolder.zzbi(status.getStatusCode()), null);
        }

        public zzc(com.google.android.gms.common.api.Api.ClientKey clientkey, GoogleApiClient googleapiclient)
        {
            super(clientkey, googleapiclient);
        }
    }

    public static abstract class zzd extends zzb
    {

        protected Result createFailedResult(Status status)
        {
            return zzaI(status);
        }

        protected PlaceLikelihoodBuffer zzaI(Status status)
        {
            return new PlaceLikelihoodBuffer(DataHolder.zzbi(status.getStatusCode()), 100, null);
        }

        public zzd(com.google.android.gms.common.api.Api.ClientKey clientkey, GoogleApiClient googleapiclient)
        {
            super(clientkey, googleapiclient);
        }
    }

    public static abstract class zze extends zzb
    {

        protected Result createFailedResult(Status status)
        {
            return zzaJ(status);
        }

        protected com.google.android.gms.location.places.personalized.zzd zzaJ(Status status)
        {
            return com.google.android.gms.location.places.personalized.zzd.zzaK(status);
        }
    }

    public static abstract class zzf extends zzb
    {

        protected Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        protected Status zzb(Status status)
        {
            return status;
        }

        public zzf(com.google.android.gms.common.api.Api.ClientKey clientkey, GoogleApiClient googleapiclient)
        {
            super(clientkey, googleapiclient);
        }
    }


    private static final String TAG = com/google/android/gms/location/places/zzm.getSimpleName();
    private final Context mContext;
    private final zzd zzazS;
    private final zza zzazT;
    private final zze zzazU;
    private final zzf zzazV;
    private final zzc zzazW;

    public zzm(zza zza1)
    {
        zzazS = null;
        zzazT = zza1;
        zzazU = null;
        zzazV = null;
        zzazW = null;
        mContext = null;
    }

    public zzm(zzc zzc1, Context context)
    {
        zzazS = null;
        zzazT = null;
        zzazU = null;
        zzazV = null;
        zzazW = zzc1;
        mContext = context;
    }

    public zzm(zzd zzd1, Context context)
    {
        zzazS = zzd1;
        zzazT = null;
        zzazU = null;
        zzazV = null;
        zzazW = null;
        mContext = context;
    }

    public zzm(zzf zzf1)
    {
        zzazS = null;
        zzazT = null;
        zzazU = null;
        zzazV = zzf1;
        zzazW = null;
        mContext = null;
    }

    public void zzY(DataHolder dataholder)
        throws RemoteException
    {
        boolean flag;
        if (zzazS != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "placeEstimator cannot be null");
        if (dataholder == null)
        {
            if (Log.isLoggable(TAG, 6))
            {
                Log.e(TAG, (new StringBuilder()).append("onPlaceEstimated received null DataHolder: ").append(zzlm.zzpa()).toString());
            }
            zzazS.zzr(Status.zzXR);
            return;
        } else
        {
            dataholder = new PlaceLikelihoodBuffer(dataholder, 100, mContext);
            zzazS.setResult(dataholder);
            return;
        }
    }

    public void zzZ(DataHolder dataholder)
        throws RemoteException
    {
        if (dataholder == null)
        {
            if (Log.isLoggable(TAG, 6))
            {
                Log.e(TAG, (new StringBuilder()).append("onAutocompletePrediction received null DataHolder: ").append(zzlm.zzpa()).toString());
            }
            zzazT.zzr(Status.zzXR);
            return;
        } else
        {
            zzazT.setResult(new AutocompletePredictionBuffer(dataholder));
            return;
        }
    }

    public void zzaF(Status status)
        throws RemoteException
    {
        zzazV.setResult(status);
    }

    public void zzaa(DataHolder dataholder)
        throws RemoteException
    {
        if (dataholder == null)
        {
            if (Log.isLoggable(TAG, 6))
            {
                Log.e(TAG, (new StringBuilder()).append("onPlaceUserDataFetched received null DataHolder: ").append(zzlm.zzpa()).toString());
            }
            zzazU.zzr(Status.zzXR);
            return;
        } else
        {
            zzazU.setResult(new com.google.android.gms.location.places.personalized.zzd(dataholder));
            return;
        }
    }

    public void zzab(DataHolder dataholder)
        throws RemoteException
    {
        dataholder = new PlaceBuffer(dataholder, mContext);
        zzazW.setResult(dataholder);
    }

}
