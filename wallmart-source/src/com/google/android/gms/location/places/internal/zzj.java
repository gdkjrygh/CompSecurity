// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlacesOptions;
import com.google.android.gms.location.places.zzl;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlacesParams, zze

public class zzj extends com.google.android.gms.common.internal.zzj
{
    public static class zza extends com.google.android.gms.common.api.Api.zza
    {

        private final String zzaEl;
        private final String zzaEm;

        public com.google.android.gms.common.api.Api.zzb zza(Context context, Looper looper, zzf zzf1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return zzb(context, looper, zzf1, (PlacesOptions)obj, connectioncallbacks, onconnectionfailedlistener);
        }

        public zzj zzb(Context context, Looper looper, zzf zzf1, PlacesOptions placesoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            String s;
            String s1;
            if (zzaEl != null)
            {
                s = zzaEl;
            } else
            {
                s = context.getPackageName();
            }
            if (zzaEm != null)
            {
                s1 = zzaEm;
            } else
            {
                s1 = context.getPackageName();
            }
            if (placesoptions == null)
            {
                placesoptions = (new com.google.android.gms.location.places.PlacesOptions.Builder()).build();
            }
            return new zzj(context, looper, zzf1, connectioncallbacks, onconnectionfailedlistener, s, s1, placesoptions);
        }

        public zza(String s, String s1)
        {
            zzaEl = s;
            zzaEm = s1;
        }
    }


    private final PlacesParams zzaEj;
    private final Locale zzaEk = Locale.getDefault();

    public zzj(Context context, Looper looper, zzf zzf1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, String s1, 
            PlacesOptions placesoptions)
    {
        super(context, looper, 67, zzf1, connectioncallbacks, onconnectionfailedlistener);
        context = null;
        if (zzf1.getAccount() != null)
        {
            context = zzf1.getAccount().name;
        }
        zzaEj = new PlacesParams(s, zzaEk, context, placesoptions.zzaDU, s1);
    }

    protected IInterface zzV(IBinder ibinder)
    {
        return zzch(ibinder);
    }

    public void zza(zzl zzl, PlaceFilter placefilter)
        throws RemoteException
    {
        PlaceFilter placefilter1 = placefilter;
        if (placefilter == null)
        {
            placefilter1 = PlaceFilter.zzwe();
        }
        ((zze)zzoA()).zza(placefilter1, zzaEj, zzl);
    }

    public void zza(zzl zzl, PlaceReport placereport)
        throws RemoteException
    {
        zzx.zzv(placereport);
        ((zze)zzoA()).zza(placereport, zzaEj, zzl);
    }

    protected zze zzch(IBinder ibinder)
    {
        return zze.zza.zzcd(ibinder);
    }

    protected String zzfA()
    {
        return "com.google.android.gms.location.places.PlaceDetectionApi";
    }

    protected String zzfB()
    {
        return "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService";
    }
}
