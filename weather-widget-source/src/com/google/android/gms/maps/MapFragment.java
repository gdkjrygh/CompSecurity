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
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMap, GoogleMapOptions, OnMapReadyCallback, MapsInitializer

public class MapFragment extends Fragment
{
    static class zza
        implements MapLifecycleDelegate
    {

        private final IMapFragmentDelegate zzaFW;
        private final Fragment zzamZ;

        public void getMapAsync(OnMapReadyCallback onmapreadycallback)
        {
            try
            {
                zzaFW.getMapAsync(new com.google.android.gms.maps.internal.zzl.zza(this, onmapreadycallback) {

                    final OnMapReadyCallback zzaFX;
                    final zza zzaFY;

                    public void zza(IGoogleMapDelegate igooglemapdelegate)
                        throws RemoteException
                    {
                        zzaFX.onMapReady(new GoogleMap(igooglemapdelegate));
                    }

            
            {
                zzaFY = zza1;
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

        public zza(Fragment fragment, IMapFragmentDelegate imapfragmentdelegate)
        {
            zzaFW = (IMapFragmentDelegate)zzx.zzv(imapfragmentdelegate);
            zzamZ = (Fragment)zzx.zzv(fragment);
        }
    }

    static class zzb extends com.google.android.gms.dynamic.zza
    {

        private Activity mActivity;
        protected zzf zzaFZ;
        private final List zzaGa = new ArrayList();
        private final Fragment zzamZ;

        private void setActivity(Activity activity)
        {
            mActivity = activity;
            zzwP();
        }

        static void zza(zzb zzb1, Activity activity)
        {
            zzb1.setActivity(activity);
        }

        public void getMapAsync(OnMapReadyCallback onmapreadycallback)
        {
            if (zzrn() != null)
            {
                ((zza)zzrn()).getMapAsync(onmapreadycallback);
                return;
            } else
            {
                zzaGa.add(onmapreadycallback);
                return;
            }
        }

        protected void zza(zzf zzf1)
        {
            zzaFZ = zzf1;
            zzwP();
        }

        public void zzwP()
        {
            if (mActivity == null || zzaFZ == null || zzrn() != null)
            {
                break MISSING_BLOCK_LABEL_139;
            }
            IMapFragmentDelegate imapfragmentdelegate;
            MapsInitializer.initialize(mActivity);
            imapfragmentdelegate = zzy.zzaF(mActivity).zzt(zze.zzx(mActivity));
            if (imapfragmentdelegate == null)
            {
                return;
            }
            RemoteException remoteexception;
            zzaFZ.zza(new zza(zzamZ, imapfragmentdelegate));
            OnMapReadyCallback onmapreadycallback;
            for (Iterator iterator = zzaGa.iterator(); iterator.hasNext(); ((zza)zzrn()).getMapAsync(onmapreadycallback))
            {
                onmapreadycallback = (OnMapReadyCallback)iterator.next();
            }

            try
            {
                zzaGa.clear();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
            catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception) { }
        }

        zzb(Fragment fragment)
        {
            zzamZ = fragment;
        }
    }


    private final zzb zzaFU = new zzb(this);
    private GoogleMap zzaFV;

    public MapFragment()
    {
    }

    public static MapFragment newInstance()
    {
        return new MapFragment();
    }

    public static MapFragment newInstance(GoogleMapOptions googlemapoptions)
    {
        MapFragment mapfragment = new MapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googlemapoptions);
        mapfragment.setArguments(bundle);
        return mapfragment;
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
        zzaFU.getMapAsync(onmapreadycallback);
    }

    public void onActivityCreated(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/MapFragment.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        zzb.zza(zzaFU, activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        zzaFU.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = zzaFU.onCreateView(layoutinflater, viewgroup, bundle);
        layoutinflater.setClickable(true);
        return layoutinflater;
    }

    public void onDestroy()
    {
        zzaFU.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        zzaFU.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        zzb.zza(zzaFU, activity);
        attributeset = GoogleMapOptions.createFromAttributes(activity, attributeset);
        Bundle bundle1 = new Bundle();
        bundle1.putParcelable("MapOptions", attributeset);
        zzaFU.onInflate(activity, bundle1, bundle);
    }

    public void onLowMemory()
    {
        zzaFU.onLowMemory();
        super.onLowMemory();
    }

    public void onPause()
    {
        zzaFU.onPause();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        zzaFU.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/MapFragment.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        zzaFU.onSaveInstanceState(bundle);
    }

    public void setArguments(Bundle bundle)
    {
        super.setArguments(bundle);
    }

    protected IMapFragmentDelegate zzwO()
    {
        zzaFU.zzwP();
        if (zzaFU.zzrn() == null)
        {
            return null;
        } else
        {
            return ((zza)zzaFU.zzrn()).zzwO();
        }
    }
}
