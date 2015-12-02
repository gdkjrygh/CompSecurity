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
import com.google.android.gms.dynamic.e;
import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.w;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions, OnMapReadyCallback

class TG
    implements MapLifecycleDelegate
{

    private final Fragment TG;
    private final IMapFragmentDelegate akT;

    public void getMapAsync(OnMapReadyCallback onmapreadycallback)
    {
        try
        {
            class _cls1 extends com.google.android.gms.maps.internal.m.a
            {

                final OnMapReadyCallback akU;
                final MapFragment.a akV;

                public void a(IGoogleMapDelegate igooglemapdelegate)
                {
                    akU.onMapReady(new GoogleMap(igooglemapdelegate));
                }

            _cls1(OnMapReadyCallback onmapreadycallback)
            {
                akV = MapFragment.a.this;
                akU = onmapreadycallback;
                super();
            }
            }

            akT.getMapAsync(new _cls1(onmapreadycallback));
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
        bundle = TG.getArguments();
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        boolean flag = bundle.containsKey("MapOptions");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        w.a(bundle1, "MapOptions", bundle.getParcelable("MapOptions"));
        try
        {
            akT.onCreate(bundle1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new RuntimeRemoteException(bundle);
        }
        bundle;
        try
        {
            throw bundle;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle) { }
        throw bundle;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        try
        {
            layoutinflater = akT.onCreateView(e.k(layoutinflater), e.k(viewgroup), bundle);
        }
        // Misplaced declaration of an exception variable
        catch (LayoutInflater layoutinflater)
        {
            throw new RuntimeRemoteException(layoutinflater);
        }
        return (View)e.f(layoutinflater);
    }

    public void onDestroy()
    {
        try
        {
            akT.onDestroy();
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
            akT.onDestroyView();
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
            akT.onInflate(e.k(activity), bundle, bundle1);
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
            akT.onLowMemory();
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
            akT.onPause();
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
            akT.onResume();
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
            akT.onSaveInstanceState(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new RuntimeRemoteException(bundle);
        }
    }

    public ragmentDelegate(Fragment fragment, IMapFragmentDelegate imapfragmentdelegate)
    {
        akT = (IMapFragmentDelegate)jx.i(imapfragmentdelegate);
        TG = (Fragment)jx.i(fragment);
    }
}
