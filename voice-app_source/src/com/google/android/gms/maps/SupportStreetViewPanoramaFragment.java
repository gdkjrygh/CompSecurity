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
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.internal.zzx;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanorama, StreetViewPanoramaOptions, OnStreetViewPanoramaReadyCallback, MapsInitializer

public class SupportStreetViewPanoramaFragment extends Fragment
{
    static class zza
        implements StreetViewLifecycleDelegate
    {

        private final Fragment zzZX;
        private final IStreetViewPanoramaFragmentDelegate zzaCr;

        public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
        {
            try
            {
                zzaCr.getStreetViewPanoramaAsync(new com.google.android.gms.maps.internal.zzv.zza(this, onstreetviewpanoramareadycallback) {

                    final zza zzaCK;
                    final OnStreetViewPanoramaReadyCallback zzaCs;

                    public void zza(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
                        throws RemoteException
                    {
                        zzaCs.onStreetViewPanoramaReady(new StreetViewPanorama(istreetviewpanoramadelegate));
                    }

            
            {
                zzaCK = zza1;
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

        public zza(Fragment fragment, IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate)
        {
            zzaCr = (IStreetViewPanoramaFragmentDelegate)zzu.zzu(istreetviewpanoramafragmentdelegate);
            zzZX = (Fragment)zzu.zzu(fragment);
        }
    }

    static class zzb extends com.google.android.gms.dynamic.zza
    {

        private Activity mActivity;
        private final Fragment zzZX;
        protected zzf zzaBZ;
        private final List zzaCu = new ArrayList();

        private void setActivity(Activity activity)
        {
            mActivity = activity;
            zzvu();
        }

        static void zza(zzb zzb1, Activity activity)
        {
            zzb1.setActivity(activity);
        }

        public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
        {
            if (zzqj() != null)
            {
                ((zza)zzqj()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
                return;
            } else
            {
                zzaCu.add(onstreetviewpanoramareadycallback);
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
                break MISSING_BLOCK_LABEL_132;
            }
            try
            {
                MapsInitializer.initialize(mActivity);
                IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate = zzy.zzay(mActivity).zzs(zze.zzw(mActivity));
                zzaBZ.zza(new zza(zzZX, istreetviewpanoramafragmentdelegate));
                OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback;
                for (Iterator iterator = zzaCu.iterator(); iterator.hasNext(); ((zza)zzqj()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback))
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
            zzaCu.clear();
        }

        zzb(Fragment fragment)
        {
            zzZX = fragment;
        }
    }


    private final zzb zzaCJ = new zzb(this);
    private StreetViewPanorama zzaCq;

    public SupportStreetViewPanoramaFragment()
    {
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
        if (zzaCJ.zzqj() == null)
        {
            return null;
        } else
        {
            return ((zza)zzaCJ.zzqj()).zzvx();
        }
    }
}
