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
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzx;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            SupportStreetViewPanoramaFragment, OnStreetViewPanoramaReadyCallback, StreetViewPanorama

static class zzZX
    implements StreetViewLifecycleDelegate
{

    private final Fragment zzZX;
    private final IStreetViewPanoramaFragmentDelegate zzaCr;

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
    {
        try
        {
            zzaCr.getStreetViewPanoramaAsync(new com.google.android.gms.maps.internal.zzv.zza(onstreetviewpanoramareadycallback) {

                final SupportStreetViewPanoramaFragment.zza zzaCK;
                final OnStreetViewPanoramaReadyCallback zzaCs;

                public void zza(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
                    throws RemoteException
                {
                    zzaCs.onStreetViewPanoramaReady(new StreetViewPanorama(istreetviewpanoramadelegate));
                }

            
            {
                zzaCK = SupportStreetViewPanoramaFragment.zza.this;
                zzaCs = onstreetviewpanoramareadycallback;
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
        bundle = zzZX.getArguments();
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        if (bundle.containsKey("StreetViewPanoramaOptions"))
        {
            zzx.zza(bundle1, "StreetViewPanoramaOptions", bundle.getParcelable("StreetViewPanoramaOptions"));
        }
        zzaCr.onCreate(bundle1);
        return;
        bundle;
        throw new RuntimeRemoteException(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        try
        {
            layoutinflater = zzaCr.onCreateView(zze.zzw(layoutinflater), zze.zzw(viewgroup), bundle);
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
            zzaCr.onDestroy();
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
            zzaCr.onDestroyView();
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
            zzaCr.onInflate(zze.zzw(activity), null, bundle1);
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
            zzaCr.onLowMemory();
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
            zzaCr.onPause();
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
            zzaCr.onResume();
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
            zzaCr.onSaveInstanceState(bundle);
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

    public IStreetViewPanoramaFragmentDelegate zzvx()
    {
        return zzaCr;
    }

    public legate(Fragment fragment, IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate)
    {
        zzaCr = (IStreetViewPanoramaFragmentDelegate)zzu.zzu(istreetviewpanoramafragmentdelegate);
        zzZX = (Fragment)zzu.zzu(fragment);
    }
}
