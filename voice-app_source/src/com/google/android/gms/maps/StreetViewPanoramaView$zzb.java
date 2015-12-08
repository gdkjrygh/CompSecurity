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

static class zzaCG extends zza
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
        if (zzaBZ == null || zzqj() != null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        try
        {
            com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate istreetviewpanoramaviewdelegate = zzy.zzay(mContext).zza(zze.zzw(mContext), zzaCG);
            zzaBZ.zza(new <init>(zzaCg, istreetviewpanoramaviewdelegate));
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

    lableException(ViewGroup viewgroup, Context context, StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        zzaCg = viewgroup;
        mContext = context;
        zzaCG = streetviewpanoramaoptions;
    }
}
