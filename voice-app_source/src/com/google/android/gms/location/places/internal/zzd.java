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
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.PlacesOptions;
import com.google.android.gms.location.places.zzm;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlacesParams, zzf

public class zzd extends zzi
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

        public volatile com.google.android.gms.common.api.Api.Client zza(Context context, Looper looper, zze zze1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return zza(context, looper, zze1, (PlacesOptions)obj, connectioncallbacks, onconnectionfailedlistener);
        }

        public zzd zza(Context context, Looper looper, zze zze1, PlacesOptions placesoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
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
            return new zzd(context, looper, zze1, connectioncallbacks, onconnectionfailedlistener, s, s1, placesoptions);
        }

        public zza(String s, String s1)
        {
            zzaAn = s;
            zzaAo = s1;
        }
    }


    private final PlacesParams zzaAl;
    private final Locale zzaAm = Locale.getDefault();

    public zzd(Context context, Looper looper, zze zze1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, String s1, 
            PlacesOptions placesoptions)
    {
        super(context, looper, 65, connectioncallbacks, onconnectionfailedlistener, zze1);
        context = null;
        if (zze1.getAccount() != null)
        {
            context = zze1.getAccount().name;
        }
        zzaAl = new PlacesParams(s, zzaAm, context, placesoptions.zzazX, s1);
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.location.places.internal.IGooglePlacesService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.location.places.GeoDataApi";
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return zzbY(ibinder);
    }

    public void zza(zzm zzm, AddPlaceRequest addplacerequest)
        throws RemoteException
    {
        zzu.zzb(addplacerequest, "userAddedPlace == null");
        ((zzf)zznM()).zza(addplacerequest, zzaAl, zzm);
    }

    public void zza(zzm zzm, String s, LatLngBounds latlngbounds, AutocompleteFilter autocompletefilter)
        throws RemoteException
    {
        zzu.zzb(s, "query == null");
        zzu.zzb(latlngbounds, "bounds == null");
        zzu.zzb(zzm, "callback == null");
        if (autocompletefilter == null)
        {
            autocompletefilter = AutocompleteFilter.create(null);
        }
        ((zzf)zznM()).zza(s, latlngbounds, autocompletefilter, zzaAl, zzm);
    }

    public void zza(zzm zzm, List list)
        throws RemoteException
    {
        ((zzf)zznM()).zzb(list, zzaAl, zzm);
    }

    protected zzf zzbY(IBinder ibinder)
    {
        return zzf.zza.zzca(ibinder);
    }
}
