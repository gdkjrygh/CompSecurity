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
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanorama, StreetViewPanoramaOptions, OnStreetViewPanoramaReadyCallback

public class SupportStreetViewPanoramaFragment extends Fragment
{

    private final zzb zzaCJ = new zzb();
    private StreetViewPanorama zzaCq;

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
        zzaCJ.getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
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
        zzb.zza(zzaCJ, activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        zzaCJ.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return zzaCJ.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        zzaCJ.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        zzaCJ.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        zzb.zza(zzaCJ, activity);
        attributeset = new Bundle();
        zzaCJ.onInflate(activity, attributeset, bundle);
    }

    public void onLowMemory()
    {
        zzaCJ.onLowMemory();
        super.onLowMemory();
    }

    public void onPause()
    {
        zzaCJ.onPause();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        zzaCJ.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/SupportStreetViewPanoramaFragment.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        zzaCJ.onSaveInstanceState(bundle);
    }

    public void setArguments(Bundle bundle)
    {
        super.setArguments(bundle);
    }

    protected IStreetViewPanoramaFragmentDelegate zzvx()
    {
        zzaCJ.zzvu();
    /* block-local class not found */
    class zza {}

        if (zzaCJ.zzqj() == null)
        {
            return null;
        } else
        {
            return ((zza)zzaCJ.zzqj()).zzvx();
        }
    }
}
