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
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.PlacesOptions;
import com.google.android.gms.location.places.zzl;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlacesParams, zzf

public class zzd extends zzj
{
    public static class zza extends com.google.android.gms.common.api.Api.zza
    {

        private final String zzaEl;
        private final String zzaEm;

        public volatile com.google.android.gms.common.api.Api.zzb zza(Context context, Looper looper, zzf zzf1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return zza(context, looper, zzf1, (PlacesOptions)obj, connectioncallbacks, onconnectionfailedlistener);
        }

        public zzd zza(Context context, Looper looper, zzf zzf1, PlacesOptions placesoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
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
            return new zzd(context, looper, zzf1, connectioncallbacks, onconnectionfailedlistener, s, s1, placesoptions);
        }

        public zza(String s, String s1)
        {
            zzaEl = s;
            zzaEm = s1;
        }
    }


    private final PlacesParams zzaEj;
    private final Locale zzaEk = Locale.getDefault();

    public zzd(Context context, Looper looper, zzf zzf1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, String s1, 
            PlacesOptions placesoptions)
    {
        super(context, looper, 65, zzf1, connectioncallbacks, onconnectionfailedlistener);
        context = null;
        if (zzf1.getAccount() != null)
        {
            context = zzf1.getAccount().name;
        }
        zzaEj = new PlacesParams(s, zzaEk, context, placesoptions.zzaDU, s1);
    }

    protected IInterface zzV(IBinder ibinder)
    {
        return zzcc(ibinder);
    }

    public void zza(com.google.android.gms.location.places.zzf zzf1, String s)
        throws RemoteException
    {
        zzx.zzb(s, "placeId cannot be null");
        ((com.google.android.gms.location.places.internal.zzf)zzoA()).zza(s, zzaEj, zzf1);
    }

    public void zza(com.google.android.gms.location.places.zzf zzf1, String s, int i, int j, int k)
        throws RemoteException
    {
        boolean flag1 = true;
        zzx.zzb(s, "fifeUrl cannot be null");
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "width should be > 0");
        if (i > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "height should be > 0");
        ((com.google.android.gms.location.places.internal.zzf)zzoA()).zza(s, i, j, k, zzaEj, zzf1);
    }

    public void zza(zzl zzl, AddPlaceRequest addplacerequest)
        throws RemoteException
    {
        zzx.zzb(addplacerequest, "userAddedPlace == null");
        ((com.google.android.gms.location.places.internal.zzf)zzoA()).zza(addplacerequest, zzaEj, zzl);
    }

    public void zza(zzl zzl, String s, LatLngBounds latlngbounds, AutocompleteFilter autocompletefilter)
        throws RemoteException
    {
        zzx.zzb(s, "query == null");
        zzx.zzb(latlngbounds, "bounds == null");
        zzx.zzb(zzl, "callback == null");
        if (autocompletefilter == null)
        {
            autocompletefilter = AutocompleteFilter.create(null);
        }
        ((com.google.android.gms.location.places.internal.zzf)zzoA()).zza(s, latlngbounds, autocompletefilter, zzaEj, zzl);
    }

    public void zza(zzl zzl, List list)
        throws RemoteException
    {
        ((com.google.android.gms.location.places.internal.zzf)zzoA()).zzb(list, zzaEj, zzl);
    }

    protected com.google.android.gms.location.places.internal.zzf zzcc(IBinder ibinder)
    {
        return zzf.zza.zzce(ibinder);
    }

    protected String zzfA()
    {
        return "com.google.android.gms.location.places.GeoDataApi";
    }

    protected String zzfB()
    {
        return "com.google.android.gms.location.places.internal.IGooglePlacesService";
    }
}
