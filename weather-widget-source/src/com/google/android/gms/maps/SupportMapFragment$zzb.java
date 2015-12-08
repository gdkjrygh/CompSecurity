// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
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
//            SupportMapFragment, MapsInitializer, OnMapReadyCallback

static class zzadh extends zza
{

    private Activity mActivity;
    protected zzf zzaFZ;
    private final List zzaGa = new ArrayList();
    private final Fragment zzadh;

    private void setActivity(Activity activity)
    {
        mActivity = activity;
        zzwP();
    }

    static void zza(zzwP zzwp, Activity activity)
    {
        zzwp.setActivity(activity);
    }

    public void getMapAsync(OnMapReadyCallback onmapreadycallback)
    {
        if (zzrn() != null)
        {
            ((zzrn)zzrn()).getMapAsync(onmapreadycallback);
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
        if (mActivity == null || zzaFZ == null || zzrn() != null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        com.google.android.gms.maps.internal.IMapFragmentDelegate imapfragmentdelegate;
        MapsInitializer.initialize(mActivity);
        imapfragmentdelegate = zzy.zzaF(mActivity).zzt(zze.zzx(mActivity));
        if (imapfragmentdelegate == null)
        {
            return;
        }
        RemoteException remoteexception;
        zzaFZ.zza(new <init>(zzadh, imapfragmentdelegate));
        OnMapReadyCallback onmapreadycallback;
        for (Iterator iterator = zzaGa.iterator(); iterator.hasNext(); ((zzaGa)zzrn()).getMapAsync(onmapreadycallback))
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

    AvailableException(Fragment fragment)
    {
        zzadh = fragment;
    }
}
