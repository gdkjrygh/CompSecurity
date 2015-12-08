// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
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
//            MapView, MapsInitializer, OnMapReadyCallback, GoogleMapOptions

static class zzaGh extends zza
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
        if (zzaFZ == null || zzrn() != null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        com.google.android.gms.maps.internal.IMapViewDelegate imapviewdelegate;
        MapsInitializer.initialize(mContext);
        imapviewdelegate = zzy.zzaF(mContext).zza(zze.zzx(mContext), zzaGh);
        if (imapviewdelegate == null)
        {
            return;
        }
        RemoteException remoteexception;
        zzaFZ.zza(new <init>(zzaGg, imapviewdelegate));
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

    ions(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
    {
        zzaGg = viewgroup;
        mContext = context;
        zzaGh = googlemapoptions;
    }
}
