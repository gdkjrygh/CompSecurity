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
import com.google.android.gms.common.internal.zzu;
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

        private final ViewGroup zzaCc;
        private final IMapViewDelegate zzaCd;
        private View zzaCe;

        public void getMapAsync(OnMapReadyCallback onmapreadycallback)
        {
            try
            {
                zzaCd.getMapAsync(new com.google.android.gms.maps.internal.zzm.zza(this, onmapreadycallback) {

                    final OnMapReadyCallback zzaBX;
                    final zza zzaCf;

                    public void zza(IGoogleMapDelegate igooglemapdelegate)
                        throws RemoteException
                    {
                        zzaBX.onMapReady(new GoogleMap(igooglemapdelegate));
                    }

            
            {
                zzaCf = zza1;
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
            try
            {
                zzaCd.onCreate(bundle);
                zzaCe = (View)zze.zzn(zzaCd.getView());
                zzaCc.removeAllViews();
                zzaCc.addView(zzaCe);
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
                zzaCd.onDestroy();
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
                zzaCd.onLowMemory();
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
                zzaCd.onPause();
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
                zzaCd.onResume();
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
                zzaCd.onSaveInstanceState(bundle);
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

        public IMapViewDelegate zzvv()
        {
            return zzaCd;
        }

        public zza(ViewGroup viewgroup, IMapViewDelegate imapviewdelegate)
        {
            zzaCd = (IMapViewDelegate)zzu.zzu(imapviewdelegate);
            zzaCc = (ViewGroup)zzu.zzu(viewgroup);
        }
    }

    static class zzb extends com.google.android.gms.dynamic.zza
    {

        private final Context mContext;
        protected zzf zzaBZ;
        private final List zzaCa = new ArrayList();
        private final ViewGroup zzaCg;
        private final GoogleMapOptions zzaCh;

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
            if (zzaBZ == null || zzqj() != null)
            {
                break MISSING_BLOCK_LABEL_136;
            }
            IMapViewDelegate imapviewdelegate;
            MapsInitializer.initialize(mContext);
            imapviewdelegate = zzy.zzay(mContext).zza(zze.zzw(mContext), zzaCh);
            if (imapviewdelegate == null)
            {
                return;
            }
            RemoteException remoteexception;
            zzaBZ.zza(new zza(zzaCg, imapviewdelegate));
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

        zzb(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
        {
            zzaCg = viewgroup;
            mContext = context;
            zzaCh = googlemapoptions;
        }
    }


    private GoogleMap zzaBV;
    private final zzb zzaCb;

    public MapView(Context context)
    {
        super(context);
        zzaCb = new zzb(this, context, null);
        init();
    }

    public MapView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        zzaCb = new zzb(this, context, GoogleMapOptions.createFromAttributes(context, attributeset));
        init();
    }

    public MapView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        zzaCb = new zzb(this, context, GoogleMapOptions.createFromAttributes(context, attributeset));
        init();
    }

    public MapView(Context context, GoogleMapOptions googlemapoptions)
    {
        super(context);
        zzaCb = new zzb(this, context, googlemapoptions);
        init();
    }

    private void init()
    {
        setClickable(true);
    }

    public final GoogleMap getMap()
    {
        if (zzaBV != null)
        {
            return zzaBV;
        }
        zzaCb.zzvu();
        if (zzaCb.zzqj() == null)
        {
            return null;
        }
        try
        {
            zzaBV = new GoogleMap(((zza)zzaCb.zzqj()).zzvv().getMap());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return zzaBV;
    }

    public void getMapAsync(OnMapReadyCallback onmapreadycallback)
    {
        zzu.zzbY("getMapAsync() must be called on the main thread");
        zzaCb.getMapAsync(onmapreadycallback);
    }

    public final void onCreate(Bundle bundle)
    {
        zzaCb.onCreate(bundle);
        if (zzaCb.zzqj() == null)
        {
            com.google.android.gms.dynamic.zza.zzb(this);
        }
    }

    public final void onDestroy()
    {
        zzaCb.onDestroy();
    }

    public final void onLowMemory()
    {
        zzaCb.onLowMemory();
    }

    public final void onPause()
    {
        zzaCb.onPause();
    }

    public final void onResume()
    {
        zzaCb.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        zzaCb.onSaveInstanceState(bundle);
    }
}
