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
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            SupportStreetViewPanoramaFragment, OnStreetViewPanoramaReadyCallback, StreetViewPanorama

static class zzadh
    implements StreetViewLifecycleDelegate
{

    private final IStreetViewPanoramaFragmentDelegate zzaGr;
    private final Fragment zzadh;

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
    {
        try
        {
            zzaGr.getStreetViewPanoramaAsync(new com.google.android.gms.maps.internal.zzv.zza(onstreetviewpanoramareadycallback) {

                final SupportStreetViewPanoramaFragment.zza zzaGK;
                final OnStreetViewPanoramaReadyCallback zzaGs;

                public void zza(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
                    throws RemoteException
                {
                    zzaGs.onStreetViewPanoramaReady(new StreetViewPanorama(istreetviewpanoramadelegate));
                }

            
            {
                zzaGK = SupportStreetViewPanoramaFragment.zza.this;
                zzaGs = onstreetviewpanoramareadycallback;
                super();
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
        {
            throw new RuntimeRemoteException(onstreetviewpanoramareadycallback);
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
        bundle = zzadh.getArguments();
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        if (bundle.containsKey("StreetViewPanoramaOptions"))
        {
            com.google.android.gms.maps.internal.zzx.zza(bundle1, "StreetViewPanoramaOptions", bundle.getParcelable("StreetViewPanoramaOptions"));
        }
        zzaGr.onCreate(bundle1);
        return;
        bundle;
        throw new RuntimeRemoteException(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        try
        {
            layoutinflater = zzaGr.onCreateView(zze.zzx(layoutinflater), zze.zzx(viewgroup), bundle);
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
            zzaGr.onDestroy();
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
            zzaGr.onDestroyView();
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
    {
        try
        {
            zzaGr.onInflate(zze.zzx(activity), null, bundle1);
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
            zzaGr.onLowMemory();
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
            zzaGr.onPause();
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
            zzaGr.onResume();
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
            zzaGr.onSaveInstanceState(bundle);
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

    public IStreetViewPanoramaFragmentDelegate zzwS()
    {
        return zzaGr;
    }

    public legate(Fragment fragment, IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate)
    {
        zzaGr = (IStreetViewPanoramaFragmentDelegate)zzx.zzv(istreetviewpanoramafragmentdelegate);
        zzadh = (Fragment)zzx.zzv(fragment);
    }
}
