// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.zza;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanoramaFragment, MapsInitializer, OnStreetViewPanoramaReadyCallback

static class zzamZ extends zza
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

    static void zza(zzwP zzwp, Activity activity)
    {
        zzwp.setActivity(activity);
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
    {
        if (zzrn() != null)
        {
            ((zzrn)zzrn()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
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
            com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate = zzy.zzaF(mActivity).zzu(zze.zzx(mActivity));
            zzaFZ.zza(new <init>(zzamZ, istreetviewpanoramafragmentdelegate));
            OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback;
            for (Iterator iterator = zzaGu.iterator(); iterator.hasNext(); ((zzaGu)zzrn()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback))
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

    eException(Fragment fragment)
    {
        zzamZ = fragment;
    }
}
