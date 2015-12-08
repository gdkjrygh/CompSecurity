// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanorama, StreetViewPanoramaOptions, OnStreetViewPanoramaReadyCallback

public class StreetViewPanoramaFragment extends Fragment
{

    private final zzb zzaCp = new zzb();
    private StreetViewPanorama zzaCq;

    public StreetViewPanoramaFragment()
    {
    /* block-local class not found */
    class zzb {}

    }

    public static StreetViewPanoramaFragment newInstance()
    {
        return new StreetViewPanoramaFragment();
    }

    public static StreetViewPanoramaFragment newInstance(StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        StreetViewPanoramaFragment streetviewpanoramafragment = new StreetViewPanoramaFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("StreetViewPanoramaOptions", streetviewpanoramaoptions);
        streetviewpanoramafragment.setArguments(bundle);
        return streetviewpanoramafragment;
    }

    public final StreetViewPanorama getStreetViewPanorama()
    {
        Object obj = zzvx();
        if (obj != null)
        {
            try
            {
                obj = ((IStreetViewPanoramaFragmentDelegate) (obj)).getStreetViewPanorama();
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
            if (obj != null)
            {
                if (zzaCq == null || zzaCq.zzvw().asBinder() != ((IStreetViewPanoramaDelegate) (obj)).asBinder())
                {
                    zzaCq = new StreetViewPanorama(((IStreetViewPanoramaDelegate) (obj)));
                }
                return zzaCq;
            }
        }
        return null;
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
    {
        zzu.zzbY("getStreetViewPanoramaAsync() must be called on the main thread");
        zzaCp.getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
    }

    public void onActivityCreated(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/StreetViewPanoramaFragment.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        zzb.zza(zzaCp, activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        zzaCp.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return zzaCp.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        zzaCp.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        zzaCp.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        zzb.zza(zzaCp, activity);
        attributeset = new Bundle();
        zzaCp.onInflate(activity, attributeset, bundle);
    }

    public void onLowMemory()
    {
        zzaCp.onLowMemory();
        super.onLowMemory();
    }

    public void onPause()
    {
        zzaCp.onPause();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        zzaCp.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/StreetViewPanoramaFragment.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        zzaCp.onSaveInstanceState(bundle);
    }

    public void setArguments(Bundle bundle)
    {
        super.setArguments(bundle);
    }

    protected IStreetViewPanoramaFragmentDelegate zzvx()
    {
        zzaCp.zzvu();
    /* block-local class not found */
    class zza {}

        if (zzaCp.zzqj() == null)
        {
            return null;
        } else
        {
            return ((zza)zzaCp.zzqj()).zzvx();
        }
    }
}
