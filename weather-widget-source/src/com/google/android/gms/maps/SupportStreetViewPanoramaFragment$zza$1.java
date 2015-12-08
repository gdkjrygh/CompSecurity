// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;

// Referenced classes of package com.google.android.gms.maps:
//            SupportStreetViewPanoramaFragment, StreetViewPanorama, OnStreetViewPanoramaReadyCallback

class zzaGs extends com.google.android.gms.maps.internal._01_
{

    final etViewPanoramaReady zzaGK;
    final OnStreetViewPanoramaReadyCallback zzaGs;

    public void zza(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
        throws RemoteException
    {
        zzaGs.onStreetViewPanoramaReady(new StreetViewPanorama(istreetviewpanoramadelegate));
    }

    I(I i, OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
    {
        zzaGK = i;
        zzaGs = onstreetviewpanoramareadycallback;
        super();
    }
}
