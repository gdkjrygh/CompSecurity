// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SupportStreetViewPanoramaFragment extends Fragment
{

    private final b alF = new b(this);

    public SupportStreetViewPanoramaFragment()
    {
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
        com.google.android.gms.maps.b.a(alF, activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        alF.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return alF.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        alF.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        alF.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        com.google.android.gms.maps.b.a(alF, activity);
        attributeset = new Bundle();
        alF.onInflate(activity, attributeset, bundle);
    }

    public void onLowMemory()
    {
        alF.onLowMemory();
        super.onLowMemory();
    }

    public void onPause()
    {
        alF.onPause();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        alF.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/SupportStreetViewPanoramaFragment.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        alF.onSaveInstanceState(bundle);
    }

    public void setArguments(Bundle bundle)
    {
        super.setArguments(bundle);
    }

    private class b extends a
    {

        private final Fragment Mx;
        protected f akW;
        private final List alq = new ArrayList();
        private Activity nB;

        static void a(b b1, Activity activity)
        {
            b1.setActivity(activity);
        }

        private void setActivity(Activity activity)
        {
            nB = activity;
            nO();
        }

        protected void a(f f1)
        {
            akW = f1;
            nO();
        }

        public void nO()
        {
            int i = com.google.android.gms.maps.MapView.a;
            Object obj;
            if (nB == null)
            {
                break MISSING_BLOCK_LABEL_131;
            }
            obj = akW;
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_131;
            }
            RemoteException remoteexception;
            OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback;
            try
            {
                obj = je();
            }
            catch (RemoteException remoteexception1)
            {
                throw remoteexception1;
            }
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_131;
            }
            MapsInitializer.initialize(nB);
            obj = x.S(nB).k(e.k(nB));
            akW.a(new a(Mx, ((IStreetViewPanoramaFragmentDelegate) (obj))));
            obj = alq.iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                onstreetviewpanoramareadycallback = (OnStreetViewPanoramaReadyCallback)((Iterator) (obj)).next();
                ((a)je()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
            } while (i == 0);
            alq.clear();
            return;
            remoteexception;
            throw remoteexception;
            Object obj1;
            obj1;
            throw new RuntimeRemoteException(((RemoteException) (obj1)));
            obj1;
        }

        b(Fragment fragment)
        {
            Mx = fragment;
        }

        private class a
            implements StreetViewLifecycleDelegate
        {

            private final Fragment Mx;
            private final IStreetViewPanoramaFragmentDelegate aln;

            public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
            {
                try
                {
                    class _cls1 extends com.google.android.gms.maps.internal.u.a
                    {

                        final a alG;
                        final OnStreetViewPanoramaReadyCallback alo;

                        public void a(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
                        {
                            alo.onStreetViewPanoramaReady(new StreetViewPanorama(istreetviewpanoramadelegate));
                        }

                    _cls1(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
                    {
                        alG = a.this;
                        alo = onstreetviewpanoramareadycallback;
                        super();
                    }
                    }

                    aln.getStreetViewPanoramaAsync(new _cls1(onstreetviewpanoramareadycallback));
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
                bundle = Mx.getArguments();
                if (bundle == null)
                {
                    break MISSING_BLOCK_LABEL_49;
                }
                boolean flag = bundle.containsKey("StreetViewPanoramaOptions");
                if (!flag)
                {
                    break MISSING_BLOCK_LABEL_49;
                }
                w.a(bundle1, "StreetViewPanoramaOptions", bundle.getParcelable("StreetViewPanoramaOptions"));
                try
                {
                    aln.onCreate(bundle1);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    throw new RuntimeRemoteException(bundle);
                }
                bundle;
                try
                {
                    throw bundle;
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle) { }
                throw bundle;
            }

            public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
            {
                try
                {
                    layoutinflater = aln.onCreateView(e.k(layoutinflater), e.k(viewgroup), bundle);
                }
                // Misplaced declaration of an exception variable
                catch (LayoutInflater layoutinflater)
                {
                    throw new RuntimeRemoteException(layoutinflater);
                }
                return (View)e.f(layoutinflater);
            }

            public void onDestroy()
            {
                try
                {
                    aln.onDestroy();
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
                    aln.onDestroyView();
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
                    aln.onInflate(e.k(activity), null, bundle1);
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
                    aln.onLowMemory();
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
                    aln.onPause();
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
                    aln.onResume();
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
                    aln.onSaveInstanceState(bundle);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    throw new RuntimeRemoteException(bundle);
                }
            }

            public a(Fragment fragment, IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate)
            {
                aln = (IStreetViewPanoramaFragmentDelegate)jx.i(istreetviewpanoramafragmentdelegate);
                Mx = (Fragment)jx.i(fragment);
            }
        }

    }

}
