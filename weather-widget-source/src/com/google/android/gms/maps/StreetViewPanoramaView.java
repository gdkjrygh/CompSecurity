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
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanorama, StreetViewPanoramaOptions, OnStreetViewPanoramaReadyCallback

public class StreetViewPanoramaView extends FrameLayout
{
    static class zza
        implements StreetViewLifecycleDelegate
    {

        private final IStreetViewPanoramaViewDelegate zzaGD;
        private View zzaGE;
        private final ViewGroup zzaGc;

        public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
        {
            try
            {
                zzaGD.getStreetViewPanoramaAsync(new com.google.android.gms.maps.internal.zzv.zza(this, onstreetviewpanoramareadycallback) {

                    final zza zzaGF;
                    final OnStreetViewPanoramaReadyCallback zzaGs;

                    public void zza(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
                        throws RemoteException
                    {
                        zzaGs.onStreetViewPanoramaReady(new StreetViewPanorama(istreetviewpanoramadelegate));
                    }

            
            {
                zzaGF = zza1;
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
            try
            {
                zzaGD.onCreate(bundle);
                zzaGE = (View)zze.zzp(zzaGD.getView());
                zzaGc.removeAllViews();
                zzaGc.addView(zzaGE);
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
            throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
        }

        public void onDestroy()
        {
            try
            {
                zzaGD.onDestroy();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeRemoteException(remoteexception);
            }
        }

        public void onDestroyView()
        {
            throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
        {
            throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
        }

        public void onLowMemory()
        {
            try
            {
                zzaGD.onLowMemory();
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
                zzaGD.onPause();
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
                zzaGD.onResume();
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
                zzaGD.onSaveInstanceState(bundle);
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

        public IStreetViewPanoramaViewDelegate zzwW()
        {
            return zzaGD;
        }

        public zza(ViewGroup viewgroup, IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate)
        {
            zzaGD = (IStreetViewPanoramaViewDelegate)zzx.zzv(istreetviewpanoramaviewdelegate);
            zzaGc = (ViewGroup)zzx.zzv(viewgroup);
        }
    }

    static class zzb extends com.google.android.gms.dynamic.zza
    {

        private final Context mContext;
        protected zzf zzaFZ;
        private final StreetViewPanoramaOptions zzaGG;
        private final ViewGroup zzaGg;
        private final List zzaGu = new ArrayList();

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
            if (zzaFZ == null || zzrn() != null)
            {
                break MISSING_BLOCK_LABEL_121;
            }
            try
            {
                IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate = zzy.zzaF(mContext).zza(zze.zzx(mContext), zzaGG);
                zzaFZ.zza(new zza(zzaGg, istreetviewpanoramaviewdelegate));
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

        zzb(ViewGroup viewgroup, Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
        {
            zzaGg = viewgroup;
            mContext = context;
            zzaGG = streetviewpanoramaoptions;
        }
    }


    private final zzb zzaGC;
    private StreetViewPanorama zzaGq;

    public StreetViewPanoramaView(Context context)
    {
        super(context);
        zzaGC = new zzb(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        zzaGC = new zzb(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        zzaGC = new zzb(this, context, null);
    }

    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        super(context);
        zzaGC = new zzb(this, context, streetviewpanoramaoptions);
    }

    public final StreetViewPanorama getStreetViewPanorama()
    {
        if (zzaGq != null)
        {
            return zzaGq;
        }
        zzaGC.zzwP();
        if (zzaGC.zzrn() == null)
        {
            return null;
        }
        try
        {
            zzaGq = new StreetViewPanorama(((zza)zzaGC.zzrn()).zzwW().getStreetViewPanorama());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return zzaGq;
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
    {
        zzx.zzch("getStreetViewPanoramaAsync() must be called on the main thread");
        zzaGC.getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
    }

    public final void onCreate(Bundle bundle)
    {
        zzaGC.onCreate(bundle);
        if (zzaGC.zzrn() == null)
        {
            com.google.android.gms.dynamic.zza.zzb(this);
        }
    }

    public final void onDestroy()
    {
        zzaGC.onDestroy();
    }

    public final void onLowMemory()
    {
        zzaGC.onLowMemory();
    }

    public final void onPause()
    {
        zzaGC.onPause();
    }

    public final void onResume()
    {
        zzaGC.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        zzaGC.onSaveInstanceState(bundle);
    }
}
