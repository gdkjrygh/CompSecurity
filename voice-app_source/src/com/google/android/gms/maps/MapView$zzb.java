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

static class zzaCh extends zza
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
        if (zzaBZ == null || zzqj() != null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        com.google.android.gms.maps.internal.IMapViewDelegate imapviewdelegate;
        MapsInitializer.initialize(mContext);
        imapviewdelegate = zzy.zzay(mContext).zza(zze.zzw(mContext), zzaCh);
        if (imapviewdelegate == null)
        {
            return;
        }
        RemoteException remoteexception;
        zzaBZ.zza(new <init>(zzaCg, imapviewdelegate));
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

    ions(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
    {
        zzaCg = viewgroup;
        mContext = context;
        zzaCh = googlemapoptions;
    }
}
