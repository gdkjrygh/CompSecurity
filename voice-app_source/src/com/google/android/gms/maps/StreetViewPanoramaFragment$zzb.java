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

static class zzajt extends zza
{

    private Activity mActivity;
    protected zzf zzaBZ;
    private final List zzaCu = new ArrayList();
    private final Fragment zzajt;

    private void setActivity(Activity activity)
    {
        mActivity = activity;
        zzvu();
    }

    static void zza(zzvu zzvu1, Activity activity)
    {
        zzvu1.setActivity(activity);
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
    {
        if (zzqj() != null)
        {
            ((zzqj)zzqj()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback);
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
            com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate = zzy.zzay(mActivity).zzs(zze.zzw(mActivity));
            zzaBZ.zza(new <init>(zzajt, istreetviewpanoramafragmentdelegate));
            OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback;
            for (Iterator iterator = zzaCu.iterator(); iterator.hasNext(); ((zzaCu)zzqj()).getStreetViewPanoramaAsync(onstreetviewpanoramareadycallback))
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

    eException(Fragment fragment)
    {
        zzajt = fragment;
    }
}
