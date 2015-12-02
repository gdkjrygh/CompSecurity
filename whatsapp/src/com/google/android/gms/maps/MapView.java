// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions, GoogleMap

public class MapView extends FrameLayout
{

    public static int a;
    private GoogleMap akS;
    private final b akY;

    public MapView(Context context)
    {
        super(context);
        akY = new b(this, context, null);
    }

    public MapView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        akY = new b(this, context, GoogleMapOptions.createFromAttributes(context, attributeset));
    }

    public MapView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        akY = new b(this, context, GoogleMapOptions.createFromAttributes(context, attributeset));
    }

    public MapView(Context context, GoogleMapOptions googlemapoptions)
    {
        super(context);
        akY = new b(this, context, googlemapoptions);
    }

    public final GoogleMap getMap()
    {
label0:
        {
            GoogleMap googlemap;
            try
            {
                if (akS == null)
                {
                    break label0;
                }
                googlemap = akS;
            }
            catch (RemoteException remoteexception)
            {
                throw remoteexception;
            }
            return googlemap;
        }
        com.google.android.gms.dynamic.LifecycleDelegate lifecycledelegate;
        try
        {
            akY.nO();
            lifecycledelegate = akY.je();
        }
        catch (RemoteException remoteexception1)
        {
            throw remoteexception1;
        }
        if (lifecycledelegate == null)
        {
            return null;
        }
        try
        {
            akS = new GoogleMap(((a)akY.je()).nP().getMap());
        }
        catch (RemoteException remoteexception2)
        {
            throw new RuntimeRemoteException(remoteexception2);
        }
        return akS;
    }

    public final void onCreate(Bundle bundle)
    {
        try
        {
            akY.onCreate(bundle);
            if (akY.je() == null)
            {
                com.google.android.gms.dynamic.a.b(this);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
    }

    public final void onDestroy()
    {
        akY.onDestroy();
    }

    public final void onLowMemory()
    {
        akY.onLowMemory();
    }

    public final void onPause()
    {
        akY.onPause();
    }

    public final void onResume()
    {
        akY.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        akY.onSaveInstanceState(bundle);
    }

    private class b extends com.google.android.gms.dynamic.a
    {

        protected f akW;
        private final List akX = new ArrayList();
        private final ViewGroup ald;
        private final GoogleMapOptions ale;
        private final Context mContext;

        protected void a(f f1)
        {
            akW = f1;
            nO();
        }

        public void nO()
        {
            int i = com.google.android.gms.maps.MapView.a;
            Object obj;
            OnMapReadyCallback onmapreadycallback;
            try
            {
                if (akW == null)
                {
                    break MISSING_BLOCK_LABEL_118;
                }
                obj = je();
            }
            catch (RemoteException remoteexception)
            {
                throw remoteexception;
            }
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_118;
            }
            obj = x.S(mContext).a(e.k(mContext), ale);
            akW.a(new a(ald, ((IMapViewDelegate) (obj))));
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
            Object obj1;
            obj1;
            throw new RuntimeRemoteException(((RemoteException) (obj1)));
            obj1;
        }

        b(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
        {
            ald = viewgroup;
            mContext = context;
            ale = googlemapoptions;
        }
    }


    private class a
        implements MapLifecycleDelegate
    {

        private final ViewGroup akZ;
        private final IMapViewDelegate ala;
        private View alb;

        public void getMapAsync(OnMapReadyCallback onmapreadycallback)
        {
            try
            {
                class _cls1 extends com.google.android.gms.maps.internal.m.a
                {

                    final OnMapReadyCallback akU;
                    final a alc;

                    public void a(IGoogleMapDelegate igooglemapdelegate)
                    {
                        akU.onMapReady(new GoogleMap(igooglemapdelegate));
                    }

                _cls1(OnMapReadyCallback onmapreadycallback)
                {
                    alc = a.this;
                    akU = onmapreadycallback;
                    super();
                }
                }

                ala.getMapAsync(new _cls1(onmapreadycallback));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OnMapReadyCallback onmapreadycallback)
            {
                throw new RuntimeRemoteException(onmapreadycallback);
            }
        }

        public IMapViewDelegate nP()
        {
            return ala;
        }

        public void onCreate(Bundle bundle)
        {
            try
            {
                ala.onCreate(bundle);
                alb = (View)e.f(ala.getView());
                akZ.removeAllViews();
                akZ.addView(alb);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw new RuntimeRemoteException(bundle);
            }
        }

        public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
        {
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }

        public void onDestroy()
        {
            try
            {
                ala.onDestroy();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public void onDestroyView()
        {
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
        {
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        public void onLowMemory()
        {
            try
            {
                ala.onLowMemory();
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
                ala.onPause();
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
                ala.onResume();
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
                ala.onSaveInstanceState(bundle);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw new RuntimeRemoteException(bundle);
            }
        }

        public a(ViewGroup viewgroup, IMapViewDelegate imapviewdelegate)
        {
            ala = (IMapViewDelegate)jx.i(imapviewdelegate);
            akZ = (ViewGroup)jx.i(viewgroup);
        }
    }

}
