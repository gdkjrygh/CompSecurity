// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zza;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions, GoogleMap, OnMapReadyCallback, MapsInitializer

public class MapView extends FrameLayout
{
    static class zza
        implements MapLifecycleDelegate
    {

        private final ViewGroup zzaGc;
        private final IMapViewDelegate zzaGd;
        private View zzaGe;

        public void getMapAsync(OnMapReadyCallback onmapreadycallback)
        {
            try
            {
                zzaGd.getMapAsync(new com.google.android.gms.maps.internal.zzl.zza(this, onmapreadycallback) {

                    final OnMapReadyCallback zzaFX;
                    final zza zzaGf;

                    public void zza(IGoogleMapDelegate igooglemapdelegate)
                        throws RemoteException
                    {
                        zzaFX.onMapReady(new GoogleMap(igooglemapdelegate));
                    }

            
            {
                zzaGf = zza1;
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
            try
            {
                zzaGd.onCreate(bundle);
                zzaGe = (View)zze.zzp(zzaGd.getView());
                zzaGc.removeAllViews();
                zzaGc.addView(zzaGe);
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
                zzaGd.onDestroy();
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
                zzaGd.onLowMemory();
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
                zzaGd.onPause();
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
                zzaGd.onResume();
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
                zzaGd.onSaveInstanceState(bundle);
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

        public IMapViewDelegate zzwQ()
        {
            return zzaGd;
        }

        public zza(ViewGroup viewgroup, IMapViewDelegate imapviewdelegate)
        {
            zzaGd = (IMapViewDelegate)zzx.zzv(imapviewdelegate);
            zzaGc = (ViewGroup)zzx.zzv(viewgroup);
        }
    }

    static class zzb extends com.google.android.gms.dynamic.zza
    {

        private final Context mContext;
        protected zzf zzaFZ;
        private final List zzaGa = new ArrayList();
        private final ViewGroup zzaGg;
        private final GoogleMapOptions zzaGh;

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
            if (zzaFZ == null || zzrn() != null)
            {
                break MISSING_BLOCK_LABEL_136;
            }
            IMapViewDelegate imapviewdelegate;
            MapsInitializer.initialize(mContext);
            imapviewdelegate = zzy.zzaF(mContext).zza(zze.zzx(mContext), zzaGh);
            if (imapviewdelegate == null)
            {
                return;
            }
            RemoteException remoteexception;
            zzaFZ.zza(new zza(zzaGg, imapviewdelegate));
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

        zzb(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
        {
            zzaGg = viewgroup;
            mContext = context;
            zzaGh = googlemapoptions;
        }
    }


    private GoogleMap zzaFV;
    private final zzb zzaGb;

    public MapView(Context context)
    {
        super(context);
        zzaGb = new zzb(this, context, null);
        init();
    }

    public MapView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        zzaGb = new zzb(this, context, GoogleMapOptions.createFromAttributes(context, attributeset));
        init();
    }

    public MapView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        zzaGb = new zzb(this, context, GoogleMapOptions.createFromAttributes(context, attributeset));
        init();
    }

    public MapView(Context context, GoogleMapOptions googlemapoptions)
    {
        super(context);
        zzaGb = new zzb(this, context, googlemapoptions);
        init();
    }

    private void init()
    {
        setClickable(true);
    }

    public final GoogleMap getMap()
    {
        if (zzaFV != null)
        {
            return zzaFV;
        }
        zzaGb.zzwP();
        if (zzaGb.zzrn() == null)
        {
            return null;
        }
        try
        {
            zzaFV = new GoogleMap(((zza)zzaGb.zzrn()).zzwQ().getMap());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return zzaFV;
    }

    public void getMapAsync(OnMapReadyCallback onmapreadycallback)
    {
        zzx.zzch("getMapAsync() must be called on the main thread");
        zzaGb.getMapAsync(onmapreadycallback);
    }

    public final void onCreate(Bundle bundle)
    {
        zzaGb.onCreate(bundle);
        if (zzaGb.zzrn() == null)
        {
            com.google.android.gms.dynamic.zza.zzb(this);
        }
    }

    public final void onDestroy()
    {
        zzaGb.onDestroy();
    }

    public final void onLowMemory()
    {
        zzaGb.onLowMemory();
    }

    public final void onPause()
    {
        zzaGb.onPause();
    }

    public final void onResume()
    {
        zzaGb.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        zzaGb.onSaveInstanceState(bundle);
    }
}
