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
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMap, GoogleMapOptions, OnMapReadyCallback

public class SupportMapFragment extends Fragment
{

    private GoogleMap zzaFV;
    private final zzb zzaGH = new zzb();

    public SupportMapFragment()
    {
    /* block-local class not found */
    class zzb {}

    }

    public static SupportMapFragment newInstance()
    {
        return new SupportMapFragment();
    }

    public static SupportMapFragment newInstance(GoogleMapOptions googlemapoptions)
    {
        SupportMapFragment supportmapfragment = new SupportMapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googlemapoptions);
        supportmapfragment.setArguments(bundle);
        return supportmapfragment;
    }

    public final GoogleMap getMap()
    {
        Object obj = zzwO();
        if (obj != null)
        {
            try
            {
                obj = ((IMapFragmentDelegate) (obj)).getMap();
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
            if (obj != null)
            {
                if (zzaFV == null || zzaFV.zzwD().asBinder() != ((IGoogleMapDelegate) (obj)).asBinder())
                {
                    zzaFV = new GoogleMap(((IGoogleMapDelegate) (obj)));
                }
                return zzaFV;
            }
        }
        return null;
    }

    public void getMapAsync(OnMapReadyCallback onmapreadycallback)
    {
        zzx.zzch("getMapAsync must be called on the main thread.");
        zzaGH.getMapAsync(onmapreadycallback);
    }

    public void onActivityCreated(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/SupportMapFragment.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        zzb.zza(zzaGH, activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        zzaGH.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = zzaGH.onCreateView(layoutinflater, viewgroup, bundle);
        layoutinflater.setClickable(true);
        return layoutinflater;
    }

    public void onDestroy()
    {
        zzaGH.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        zzaGH.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        zzb.zza(zzaGH, activity);
        attributeset = GoogleMapOptions.createFromAttributes(activity, attributeset);
        Bundle bundle1 = new Bundle();
        bundle1.putParcelable("MapOptions", attributeset);
        zzaGH.onInflate(activity, bundle1, bundle);
    }

    public void onLowMemory()
    {
        zzaGH.onLowMemory();
        super.onLowMemory();
    }

    public void onPause()
    {
        zzaGH.onPause();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        zzaGH.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/SupportMapFragment.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        zzaGH.onSaveInstanceState(bundle);
    }

    public void setArguments(Bundle bundle)
    {
        super.setArguments(bundle);
    }

    protected IMapFragmentDelegate zzwO()
    {
        zzaGH.zzwP();
    /* block-local class not found */
    class zza {}

        if (zzaGH.zzrn() == null)
        {
            return null;
        } else
        {
            return ((zza)zzaGH.zzrn()).zzwO();
        }
    }
}
