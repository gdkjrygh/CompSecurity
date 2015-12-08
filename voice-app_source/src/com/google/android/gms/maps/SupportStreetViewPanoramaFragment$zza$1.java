// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;

// Referenced classes of package com.google.android.gms.maps:
//            SupportStreetViewPanoramaFragment, StreetViewPanorama, OnStreetViewPanoramaReadyCallback

class zzaCs extends com.google.android.gms.maps.internal._01_
{

    final etViewPanoramaReady zzaCK;
    final OnStreetViewPanoramaReadyCallback zzaCs;

    public void zza(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
        throws RemoteException
    {
        zzaCs.onStreetViewPanoramaReady(new StreetViewPanorama(istreetviewpanoramadelegate));
    }

    I(I i, OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
    {
        zzaCK = i;
        zzaCs = onstreetviewpanoramareadycallback;
        super();
    }
}
