// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions

public class MapFragment extends Fragment
{

    private final b akR = new b(this);

    public MapFragment()
    {
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
        com.google.android.gms.maps.b.a(akR, activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        akR.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return akR.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        akR.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView()
    {
        akR.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        com.google.android.gms.maps.b.a(akR, activity);
        attributeset = GoogleMapOptions.createFromAttributes(activity, attributeset);
        Bundle bundle1 = new Bundle();
        bundle1.putParcelable("MapOptions", attributeset);
        akR.onInflate(activity, bundle1, bundle);
    }

    public void onLowMemory()
    {
        akR.onLowMemory();
        super.onLowMemory();
    }

    public void onPause()
    {
        akR.onPause();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        akR.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/maps/MapFragment.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        akR.onSaveInstanceState(bundle);
    }

    public void setArguments(Bundle bundle)
    {
        super.setArguments(bundle);
    }

    private class b extends a
    {

        private final Fragment TG;
        protected f akW;
        private final List akX = new ArrayList();
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
            OnMapReadyCallback onmapreadycallback;
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
            obj = x.S(nB).j(e.k(nB));
            akW.a(new a(TG, ((IMapFragmentDelegate) (obj))));
            obj = akX.iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                onmapreadycallback = (OnMapReadyCallback)((Iterator) (obj)).next();
                ((a)je()).getMapAsync(onmapreadycallback);
            } while (i == 0);
            akX.clear();
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
            TG = fragment;
        }

        private class a
            implements MapLifecycleDelegate
        {

            private final Fragment TG;
            private final IMapFragmentDelegate akT;

            public void getMapAsync(OnMapReadyCallback onmapreadycallback)
            {
                try
                {
                    class _cls1 extends com.google.android.gms.maps.internal.m.a
                    {

                        final OnMapReadyCallback akU;
                        final a akV;

                        public void a(IGoogleMapDelegate igooglemapdelegate)
                        {
                            akU.onMapReady(new GoogleMap(igooglemapdelegate));
                        }

                    _cls1(OnMapReadyCallback onmapreadycallback)
                    {
                        akV = a.this;
                        akU = onmapreadycallback;
                        super();
                    }
                    }

                    akT.getMapAsync(new _cls1(onmapreadycallback));
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
                bundle = TG.getArguments();
                if (bundle == null)
                {
                    break MISSING_BLOCK_LABEL_49;
                }
                boolean flag = bundle.containsKey("MapOptions");
                if (!flag)
                {
                    break MISSING_BLOCK_LABEL_49;
                }
                w.a(bundle1, "MapOptions", bundle.getParcelable("MapOptions"));
                try
                {
                    akT.onCreate(bundle1);
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
                    layoutinflater = akT.onCreateView(e.k(layoutinflater), e.k(viewgroup), bundle);
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
                    akT.onDestroy();
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
                    akT.onDestroyView();
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
                    akT.onInflate(e.k(activity), bundle, bundle1);
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
                    akT.onLowMemory();
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
                    akT.onPause();
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
                    akT.onResume();
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
                    akT.onSaveInstanceState(bundle);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    throw new RuntimeRemoteException(bundle);
                }
            }

            public a(Fragment fragment, IMapFragmentDelegate imapfragmentdelegate)
            {
                akT = (IMapFragmentDelegate)jx.i(imapfragmentdelegate);
                TG = (Fragment)jx.i(fragment);
            }
        }

    }

}
