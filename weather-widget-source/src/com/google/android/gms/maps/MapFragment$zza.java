// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            MapFragment, GoogleMapOptions, OnMapReadyCallback, GoogleMap

static class zv
    implements MapLifecycleDelegate
{

    private final IMapFragmentDelegate zzaFW;
    private final Fragment zzamZ;

    public void getMapAsync(OnMapReadyCallback onmapreadycallback)
    {
        try
        {
            zzaFW.getMapAsync(new com.google.android.gms.maps.internal.zzl.zza(onmapreadycallback) {

                final OnMapReadyCallback zzaFX;
                final MapFragment.zza zzaFY;

                public void zza(IGoogleMapDelegate igooglemapdelegate)
                    throws RemoteException
                {
                    zzaFX.onMapReady(new GoogleMap(igooglemapdelegate));
                }

            
            {
                zzaFY = MapFragment.zza.this;
                zzaFX = onmapreadycallback;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnMapReadyCallback onmapreadycallback)
        {
            throw new RuntimeRemoteException(onmapreadycallback);
        }
    }

    public void onCreate(Bundle bundle)
    {
        Bundle bundle1;
        bundle1 = bundle;
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        bundle1 = new Bundle();
        bundle = zzamZ.getArguments();
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        if (bundle.containsKey("MapOptions"))
        {
            com.google.android.gms.maps.internal.zzx.zza(bundle1, "MapOptions", bundle.getParcelable("MapOptions"));
        }
        zzaFW.onCreate(bundle1);
        return;
        bundle;
        throw new RuntimeRemoteException(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        try
        {
            layoutinflater = zzaFW.onCreateView(zze.zzx(layoutinflater), zze.zzx(viewgroup), bundle);
        }
        // Misplaced declaration of an exception variable
        catch (LayoutInflater layoutinflater)
        {
            throw new RuntimeRemoteException(layoutinflater);
        }
        return (View)zze.zzp(layoutinflater);
    }

    public void onDestroy()
    {
        try
        {
            zzaFW.onDestroy();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void onDestroyView()
    {
        try
        {
            zzaFW.onDestroyView();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
    {
        bundle = (GoogleMapOptions)bundle.getParcelable("MapOptions");
        try
        {
            zzaFW.onInflate(zze.zzx(activity), bundle, bundle1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw new RuntimeRemoteException(activity);
        }
    }

    public void onLowMemory()
    {
        try
        {
            zzaFW.onLowMemory();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void onPause()
    {
        try
        {
            zzaFW.onPause();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void onResume()
    {
        try
        {
            zzaFW.onResume();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        try
        {
            zzaFW.onSaveInstanceState(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new RuntimeRemoteException(bundle);
        }
    }

    public void onStart()
    {
    }

    public void onStop()
    {
    }

    public IMapFragmentDelegate zzwO()
    {
        return zzaFW;
    }

    public gmentDelegate(Fragment fragment, IMapFragmentDelegate imapfragmentdelegate)
    {
        zzaFW = (IMapFragmentDelegate)zzx.zzv(imapfragmentdelegate);
        zzamZ = (Fragment)zzx.zzv(fragment);
    }
}
