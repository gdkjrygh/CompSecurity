// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanorama, StreetViewPanoramaOptions, OnStreetViewPanoramaReadyCallback

public class SupportStreetViewPanoramaFragment extends Fragment
{

    private final zzb zzaGJ = new zzb();
    private StreetViewPanorama zzaGq;

    public SupportStreetViewPanoramaFragment()
    {
    /* block-local class not found */
    class zzb {}

    }

    public static SupportStreetViewPanoramaFragment newInstance()
    {
        return new SupportStreetViewPanoramaFragment();
    }

    public static SupportStreetViewPanoramaFragment newInstance(StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        SupportStreetViewPanoramaFragment supportstreetviewpanoramafragment = new SupportStreetViewPanoramaFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("StreetViewPanoramaOptions", streetviewpanoramaoptions);
        supportstreetviewpanoramafragment.setArguments(bundle);
        return supportstreetviewpanoramafragment;
    }

    public final StreetViewPanorama getStreetViewPanorama()
    {
        Object obj = zzwS();
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
                if (zzaGq == null || zzaGq.zzwR().asBinder() != ((IStreetViewPanoramaDelegate) (obj)).asBinder())
                {
                    zzaGq = new StreetViewPanorama(((IStreetViewPanoramaDelegate) (obj)));
                }
                return zzaGq;
            }
        }
        return null;
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
    {
        zzx.zzch("getStreetViewPanoramaAsync() must be called on the main thread");
        zzaGJ.getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
    }

    public void onActivityCreated(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/SupportStreetViewPanoramaFragment.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        zzb.zza(zzaGJ, activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        zzaGJ.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return zzaGJ.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        zzaGJ.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        zzaGJ.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        zzb.zza(zzaGJ, activity);
        attributeset = new Bundle();
        zzaGJ.onInflate(activity, attributeset, bundle);
    }

    public void onLowMemory()
    {
        zzaGJ.onLowMemory();
        super.onLowMemory();
    }

    public void onPause()
    {
        zzaGJ.onPause();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        zzaGJ.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/SupportStreetViewPanoramaFragment.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        zzaGJ.onSaveInstanceState(bundle);
    }

    public void setArguments(Bundle bundle)
    {
        super.setArguments(bundle);
    }

    protected IStreetViewPanoramaFragmentDelegate zzwS()
    {
        zzaGJ.zzwP();
    /* block-local class not found */
    class zza {}

        if (zzaGJ.zzrn() == null)
        {
            return null;
        } else
        {
            return ((zza)zzaGJ.zzrn()).zzwS();
        }
    }
}
