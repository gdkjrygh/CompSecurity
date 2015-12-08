// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.internal.zzi;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMap

class zza extends com.google.android.gms.maps.internal.>
{

    final oWindowAdapter zzaBG;
    final GoogleMap zzaBs;

    public zzd zzf(zzi zzi)
    {
        return zze.zzw(zzaBG.getInfoWindow(new Marker(zzi)));
    }

    public zzd zzg(zzi zzi)
    {
        return zze.zzw(zzaBG.getInfoContents(new Marker(zzi)));
    }

    oWindowAdapter(GoogleMap googlemap, oWindowAdapter owindowadapter)
    {
        zzaBs = googlemap;
        zzaBG = owindowadapter;
        super();
    }
}
