// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanoramaView, StreetViewPanorama, OnStreetViewPanoramaReadyCallback

class zzaGs extends com.google.android.gms.maps.internal.
{

    final elegate zzaGF;
    final OnStreetViewPanoramaReadyCallback zzaGs;

    public void zza(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
        throws RemoteException
    {
        zzaGs.onStreetViewPanoramaReady(new StreetViewPanorama(istreetviewpanoramadelegate));
    }

    back(back back, OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
    {
        zzaGF = back;
        zzaGs = onstreetviewpanoramareadycallback;
        super();
    }
}
