// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzx;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            SupportMapFragment, GoogleMapOptions, OnMapReadyCallback, GoogleMap

static class zzZX
    implements MapLifecycleDelegate
{

    private final Fragment zzZX;
    private final IMapFragmentDelegate zzaBW;

    public void getMapAsync(OnMapReadyCallback onmapreadycallback)
    {
        try
        {
            zzaBW.getMapAsync(new com.google.android.gms.maps.internal.zzm.zza(onmapreadycallback) {

                final OnMapReadyCallback zzaBX;
                final SupportMapFragment.zza zzaCI;

                public void zza(IGoogleMapDelegate igooglemapdelegate)
                    throws RemoteException
                {
                    zzaBX.onMapReady(new GoogleMap(igooglemapdelegate));
                }

            
            {
                zzaCI = SupportMapFragment.zza.this;
                zzaBX = onmapreadycallback;
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
        bundle = zzZX.getArguments();
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        if (bundle.containsKey("MapOptions"))
        {
            zzx.zza(bundle1, "MapOptions", bundle.getParcelable("MapOptions"));
        }
        zzaBW.onCreate(bundle1);
        return;
        bundle;
        throw new RuntimeRemoteException(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        try
        {
            layoutinflater = zzaBW.onCreateView(zze.zzw(layoutinflater), zze.zzw(viewgroup), bundle);
        }
        // Misplaced declaration of an exception variable
        catch (LayoutInflater layoutinflater)
        {
            throw new RuntimeRemoteException(layoutinflater);
        }
        return (View)zze.zzn(layoutinflater);
    }

    public void onDestroy()
    {
        try
        {
            zzaBW.onDestroy();
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
            zzaBW.onDestroyView();
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
            zzaBW.onInflate(zze.zzw(activity), bundle, bundle1);
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
            zzaBW.onLowMemory();
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
            zzaBW.onPause();
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
            zzaBW.onResume();
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
            zzaBW.onSaveInstanceState(bundle);
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

    public IMapFragmentDelegate zzvt()
    {
        return zzaBW;
    }

    public legate(Fragment fragment, IMapFragmentDelegate imapfragmentdelegate)
    {
        zzaBW = (IMapFragmentDelegate)zzu.zzu(imapfragmentdelegate);
        zzZX = (Fragment)zzu.zzu(fragment);
    }
}
