// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;

// Referenced classes of package com.google.android.gms.maps:
//            MapFragment, GoogleMap, OnMapReadyCallback

class init> extends com.google.android.gms.maps.internal.
{

    final OnMapReadyCallback zzaFX;
    final  zzaFY;

    public void zza(IGoogleMapDelegate igooglemapdelegate)
        throws RemoteException
    {
        zzaFX.onMapReady(new GoogleMap(igooglemapdelegate));
    }

    ( , OnMapReadyCallback onmapreadycallback)
    {
        zzaFY = ;
        zzaFX = onmapreadycallback;
        super();
    }
}
