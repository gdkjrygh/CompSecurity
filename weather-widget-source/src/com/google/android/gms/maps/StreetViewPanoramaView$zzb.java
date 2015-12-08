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
//            StreetViewPanoramaView, OnStreetViewPanoramaReadyCallback, StreetViewPanoramaOptions

static class zzaGG extends zza
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
        if (zzaFZ == null || zzrn() != null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        try
        {
            com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate = zzy.zzaF(mContext).zza(zze.zzx(mContext), zzaGG);
            zzaFZ.zza(new <init>(zzaGg, istreetviewpanoramaviewdelegate));
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

    lableException(ViewGroup viewgroup, Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        zzaGg = viewgroup;
        mContext = context;
        zzaGG = streetviewpanoramaoptions;
    }
}
