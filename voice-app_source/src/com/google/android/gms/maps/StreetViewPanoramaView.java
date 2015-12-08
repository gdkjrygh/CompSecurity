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

        private final IStreetViewPanoramaViewDelegate zzaCD;
        private View zzaCE;
        private final ViewGroup zzaCc;

        public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
        {
            try
            {
                zzaCD.getStreetViewPanoramaAsync(new com.google.android.gms.maps.internal.zzv.zza(this, onstreetviewpanoramareadycallback) {

                    final zza zzaCF;
                    final OnStreetViewPanoramaReadyCallback zzaCs;

                    public void zza(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
                        throws RemoteException
                    {
                        zzaCs.onStreetViewPanoramaReady(new StreetViewPanorama(istreetviewpanoramadelegate));
                    }

            
            {
                zzaCF = zza1;
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
            try
            {
                zzaCD.onCreate(bundle);
                zzaCE = (View)zze.zzn(zzaCD.getView());
                zzaCc.removeAllViews();
                zzaCc.addView(zzaCE);
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
                zzaCD.onDestroy();
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
                zzaCD.onLowMemory();
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
                zzaCD.onPause();
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
                zzaCD.onResume();
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
                zzaCD.onSaveInstanceState(bundle);
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

        public IStreetViewPanoramaViewDelegate zzvB()
        {
            return zzaCD;
        }

        public zza(ViewGroup viewgroup, IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate)
        {
            zzaCD = (IStreetViewPanoramaViewDelegate)zzu.zzu(istreetviewpanoramaviewdelegate);
            zzaCc = (ViewGroup)zzu.zzu(viewgroup);
        }
    }

    static class zzb extends com.google.android.gms.dynamic.zza
    {

        private final Context mContext;
        protected zzf zzaBZ;
        private final StreetViewPanoramaOptions zzaCG;
        private final ViewGroup zzaCg;
        private final List zzaCu = new ArrayList();

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
            if (zzaBZ == null || zzqj() != null)
            {
                break MISSING_BLOCK_LABEL_121;
            }
            try
            {
                IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate = zzy.zzay(mContext).zza(zze.zzw(mContext), zzaCG);
                zzaBZ.zza(new zza(zzaCg, istreetviewpanoramaviewdelegate));
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

        zzb(ViewGroup viewgroup, Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
        {
            zzaCg = viewgroup;
            mContext = context;
            zzaCG = streetviewpanoramaoptions;
        }
    }


    private final zzb zzaCC;
    private StreetViewPanorama zzaCq;

    public StreetViewPanoramaView(Context context)
    {
        super(context);
        zzaCC = new zzb(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        zzaCC = new zzb(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        zzaCC = new zzb(this, context, null);
    }

    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        super(context);
        zzaCC = new zzb(this, context, streetviewpanoramaoptions);
    }

    public final StreetViewPanorama getStreetViewPanorama()
    {
        if (zzaCq != null)
        {
            return zzaCq;
        }
        zzaCC.zzvu();
        if (zzaCC.zzqj() == null)
        {
            return null;
        }
        try
        {
            zzaCq = new StreetViewPanorama(((zza)zzaCC.zzqj()).zzvB().getStreetViewPanorama());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return zzaCq;
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
    {
        zzu.zzbY("getStreetViewPanoramaAsync() must be called on the main thread");
        zzaCC.getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
    }

    public final void onCreate(Bundle bundle)
    {
        zzaCC.onCreate(bundle);
        if (zzaCC.zzqj() == null)
        {
            com.google.android.gms.dynamic.zza.zzb(this);
        }
    }

    public final void onDestroy()
    {
        zzaCC.onDestroy();
    }

    public final void onLowMemory()
    {
        zzaCC.onLowMemory();
    }

    public final void onPause()
    {
        zzaCC.onPause();
    }

    public final void onResume()
    {
        zzaCC.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        zzaCC.onSaveInstanceState(bundle);
    }
}
