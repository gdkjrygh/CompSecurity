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

static class zzZX extends zza
{

    private Activity mActivity;
    private final Fragment zzZX;
    protected zzf zzaBZ;
    private final List zzaCa = new ArrayList();

    private void setActivity(Activity activity)
    {
        mActivity = activity;
        zzvu();
    }

    static void zza(zzvu zzvu1, Activity activity)
    {
        zzvu1.setActivity(activity);
    }

    public void getMapAsync(OnMapReadyCallback onmapreadycallback)
    {
        if (zzqj() != null)
        {
            ((zzqj)zzqj()).getMapAsync(onmapreadycallback);
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
        if (mActivity == null || zzaBZ == null || zzqj() != null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        com.google.android.gms.maps.internal.IMapFragmentDelegate imapfragmentdelegate;
        MapsInitializer.initialize(mActivity);
        imapfragmentdelegate = zzy.zzay(mActivity).zzr(zze.zzw(mActivity));
        if (imapfragmentdelegate == null)
        {
            return;
        }
        RemoteException remoteexception;
        zzaBZ.zza(new <init>(zzZX, imapfragmentdelegate));
        OnMapReadyCallback onmapreadycallback;
        for (Iterator iterator = zzaCa.iterator(); iterator.hasNext(); ((zzaCa)zzqj()).getMapAsync(onmapreadycallback))
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

    AvailableException(Fragment fragment)
    {
        zzZX = fragment;
    }
}
