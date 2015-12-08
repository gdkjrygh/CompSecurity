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
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.internal.zzx;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMap, GoogleMapOptions, OnMapReadyCallback, MapsInitializer

public class SupportMapFragment extends Fragment
{
    static class zza
        implements MapLifecycleDelegate
    {

        private final Fragment zzZX;
        private final IMapFragmentDelegate zzaBW;

        public void getMapAsync(OnMapReadyCallback onmapreadycallback)
        {
            try
            {
                zzaBW.getMapAsync(new com.google.android.gms.maps.internal.zzm.zza(this, onmapreadycallback) {

                    final OnMapReadyCallback zzaBX;
                    final zza zzaCI;

                    public void zza(IGoogleMapDelegate igooglemapdelegate)
                        throws RemoteException
                    {
                        zzaBX.onMapReady(new GoogleMap(igooglemapdelegate));
                    }

            
            {
                zzaCI = zza1;
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

        public zza(Fragment fragment, IMapFragmentDelegate imapfragmentdelegate)
        {
            zzaBW = (IMapFragmentDelegate)zzu.zzu(imapfragmentdelegate);
            zzZX = (Fragment)zzu.zzu(fragment);
        }
    }

    static class zzb extends com.google.android.gms.dynamic.zza
    {

        private Activity mActivity;
        private final Fragment zzZX;
        protected zzf zzaBZ;
        private final List zzaCa = new ArrayList();

        private void setActivity(Activity activity)
        {
            mActivity = activity;
            zzvu();
        }

        static void zza(zzb zzb1, Activity activity)
        {
            zzb1.setActivity(activity);
        }

        public void getMapAsync(OnMapReadyCallback onmapreadycallback)
        {
            if (zzqj() != null)
            {
                ((zza)zzqj()).getMapAsync(onmapreadycallback);
                return;
            } else
            {
                zzaCa.add(onmapreadycallback);
                return;
            }
        }

        protected void zza(zzf zzf1)
        {
            zzaBZ = zzf1;
            zzvu();
        }

        public void zzvu()
        {
            if (mActivity == null || zzaBZ == null || zzqj() != null)
            {
                break MISSING_BLOCK_LABEL_139;
            }
            IMapFragmentDelegate imapfragmentdelegate;
            MapsInitializer.initialize(mActivity);
            imapfragmentdelegate = zzy.zzay(mActivity).zzr(zze.zzw(mActivity));
            if (imapfragmentdelegate == null)
            {
                return;
            }
            RemoteException remoteexception;
            zzaBZ.zza(new zza(zzZX, imapfragmentdelegate));
            OnMapReadyCallback onmapreadycallback;
            for (Iterator iterator = zzaCa.iterator(); iterator.hasNext(); ((zza)zzqj()).getMapAsync(onmapreadycallback))
            {
                onmapreadycallback = (OnMapReadyCallback)iterator.next();
            }

            try
            {
                zzaCa.clear();
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
            zzZX = fragment;
        }
    }


    private GoogleMap zzaBV;
    private final zzb zzaCH = new zzb(this);

    public SupportMapFragment()
    {
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
        Object obj = zzvt();
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
                if (zzaBV == null || zzaBV.zzvi().asBinder() != ((IGoogleMapDelegate) (obj)).asBinder())
                {
                    zzaBV = new GoogleMap(((IGoogleMapDelegate) (obj)));
                }
                return zzaBV;
            }
        }
        return null;
    }

    public void getMapAsync(OnMapReadyCallback onmapreadycallback)
    {
        zzu.zzbY("getMapAsync must be called on the main thread.");
        zzaCH.getMapAsync(onmapreadycallback);
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
        zzb.zza(zzaCH, activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        zzaCH.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = zzaCH.onCreateView(layoutinflater, viewgroup, bundle);
        layoutinflater.setClickable(true);
        return layoutinflater;
    }

    public void onDestroy()
    {
        zzaCH.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        zzaCH.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        zzb.zza(zzaCH, activity);
        attributeset = GoogleMapOptions.createFromAttributes(activity, attributeset);
        Bundle bundle1 = new Bundle();
        bundle1.putParcelable("MapOptions", attributeset);
        zzaCH.onInflate(activity, bundle1, bundle);
    }

    public void onLowMemory()
    {
        zzaCH.onLowMemory();
        super.onLowMemory();
    }

    public void onPause()
    {
        zzaCH.onPause();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        zzaCH.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/SupportMapFragment.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        zzaCH.onSaveInstanceState(bundle);
    }

    public void setArguments(Bundle bundle)
    {
        super.setArguments(bundle);
    }

    protected IMapFragmentDelegate zzvt()
    {
        zzaCH.zzvu();
        if (zzaCH.zzqj() == null)
        {
            return null;
        } else
        {
            return ((zza)zzaCH.zzqj()).zzvt();
        }
    }
}
