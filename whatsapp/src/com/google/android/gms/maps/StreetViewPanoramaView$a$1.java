// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanorama, OnStreetViewPanoramaReadyCallback

class alo extends com.google.android.gms.maps.internal.
{

    final aDelegate alB;
    final OnStreetViewPanoramaReadyCallback alo;

    public void a(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
    {
        alo.onStreetViewPanoramaReady(new StreetViewPanorama(istreetviewpanoramadelegate));
    }

    llback(llback llback, OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback)
    {
        alB = llback;
        alo = onstreetviewpanoramareadycallback;
        super();
    }
}
