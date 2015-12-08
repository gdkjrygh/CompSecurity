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
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanorama, StreetViewPanoramaOptions, OnStreetViewPanoramaReadyCallback, MapsInitializer

public class StreetViewPanoramaFragment extends Fragment
{
    static class zza
        implements StreetViewLifecycleDelegate
    {

        private final IStreetViewPanoramaFragmentDelegate zzaGr;
        private final Fragment zzamZ;

        public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
        {
            try
            {
                zzaGr.getStreetViewPanoramaAsync(new com.google.android.gms.maps.internal.zzv.zza(this, onstreetviewpanoramareadycallback) {

                    final OnStreetViewPanoramaReadyCallback zzaGs;
                    final zza zzaGt;

                    public void zza(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
                        throws RemoteException
                    {
                        zzaGs.onStreetViewPanoramaReady(new StreetViewPanorama(istreetviewpanoramadelegate));
                    }

            
            {
                zzaGt = zza1;
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
            bundle = zzamZ.getArguments();
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

        public zza(Fragment fragment, IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate)
        {
            zzaGr = (IStreetViewPanoramaFragmentDelegate)zzx.zzv(istreetviewpanoramafragmentdelegate);
            zzamZ = (Fragment)zzx.zzv(fragment);
        }
    }

    static class zzb extends com.google.android.gms.dynamic.zza
    {

        private Activity mActivity;
        protected zzf zzaFZ;
        private final List zzaGu = new ArrayList();
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

        public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
        {
            if (zzrn() != null)
            {
                ((zza)zzrn()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
                return;
            } else
            {
                zzaGu.add(onstreetviewpanoramareadycallback);
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
                break MISSING_BLOCK_LABEL_132;
            }
            try
            {
                MapsInitializer.initialize(mActivity);
                IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate = zzy.zzaF(mActivity).zzu(zze.zzx(mActivity));
                zzaFZ.zza(new zza(zzamZ, istreetviewpanoramafragmentdelegate));
                OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback;
                for (Iterator iterator = zzaGu.iterator(); iterator.hasNext(); ((zza)zzrn()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback))
                {
                    onstreetviewpanoramareadycallback = (OnStreetViewPanoramaReadyCallback)iterator.next();
                }

            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
            catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
            {
                return;
            }
            zzaGu.clear();
        }

        zzb(Fragment fragment)
        {
            zzamZ = fragment;
        }
    }


    private final zzb zzaGp = new zzb(this);
    private StreetViewPanorama zzaGq;

    public StreetViewPanoramaFragment()
    {
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
        zzaGp.getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
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
        zzb.zza(zzaGp, activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        zzaGp.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return zzaGp.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        zzaGp.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        zzaGp.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        zzb.zza(zzaGp, activity);
        attributeset = new Bundle();
        zzaGp.onInflate(activity, attributeset, bundle);
    }

    public void onLowMemory()
    {
        zzaGp.onLowMemory();
        super.onLowMemory();
    }

    public void onPause()
    {
        zzaGp.onPause();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        zzaGp.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/StreetViewPanoramaFragment.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        zzaGp.onSaveInstanceState(bundle);
    }

    public void setArguments(Bundle bundle)
    {
        super.setArguments(bundle);
    }

    protected IStreetViewPanoramaFragmentDelegate zzwS()
    {
        zzaGp.zzwP();
        if (zzaGp.zzrn() == null)
        {
            return null;
        } else
        {
            return ((zza)zzaGp.zzrn()).zzwS();
        }
    }
}
