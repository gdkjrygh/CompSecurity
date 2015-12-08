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
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlacesOptions;
import com.google.android.gms.location.places.zzm;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlacesParams, zze

public class zzj extends zzi
{
    public static class zza
        implements com.google.android.gms.common.api.Api.zza
    {

        private final String zzaAn;
        private final String zzaAo;

        public int getPriority()
        {
            return 0x7fffffff;
        }

        public com.google.android.gms.common.api.Api.Client zza(Context context, Looper looper, zze zze1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return zzb(context, looper, zze1, (PlacesOptions)obj, connectioncallbacks, onconnectionfailedlistener);
        }

        public zzj zzb(Context context, Looper looper, zze zze1, PlacesOptions placesoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            String s;
            String s1;
            if (zzaAn != null)
            {
                s = zzaAn;
            } else
            {
                s = context.getPackageName();
            }
            if (zzaAo != null)
            {
                s1 = zzaAo;
            } else
            {
                s1 = context.getPackageName();
            }
            if (placesoptions == null)
            {
                placesoptions = (new com.google.android.gms.location.places.PlacesOptions.Builder()).build();
            }
            return new zzj(context, looper, zze1, connectioncallbacks, onconnectionfailedlistener, s, s1, placesoptions);
        }

        public zza(String s, String s1)
        {
            zzaAn = s;
            zzaAo = s1;
        }
    }


    private final PlacesParams zzaAl;
    private final Locale zzaAm = Locale.getDefault();

    public zzj(Context context, Looper looper, zze zze1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, String s1, 
            PlacesOptions placesoptions)
    {
        super(context, looper, 67, connectioncallbacks, onconnectionfailedlistener, zze1);
        context = null;
        if (zze1.getAccount() != null)
        {
            context = zze1.getAccount().name;
        }
        zzaAl = new PlacesParams(s, zzaAm, context, placesoptions.zzazX, s1);
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.location.places.PlaceDetectionApi";
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return zzcd(ibinder);
    }

    public void zza(zzm zzm, PlaceFilter placefilter)
        throws RemoteException
    {
        PlaceFilter placefilter1 = placefilter;
        if (placefilter == null)
        {
            placefilter1 = PlaceFilter.zzuJ();
        }
        ((com.google.android.gms.location.places.internal.zze)zznM()).zza(placefilter1, zzaAl, zzm);
    }

    public void zza(zzm zzm, PlaceReport placereport)
        throws RemoteException
    {
        zzu.zzu(placereport);
        ((com.google.android.gms.location.places.internal.zze)zznM()).zza(placereport, zzaAl, zzm);
    }

    protected com.google.android.gms.location.places.internal.zze zzcd(IBinder ibinder)
    {
        return zze.zza.zzbZ(ibinder);
    }
}
