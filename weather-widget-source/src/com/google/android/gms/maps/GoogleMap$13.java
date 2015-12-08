// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.internal.zzf;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMap

class zza extends com.google.android.gms.maps.internal.>
{

    final oWindowAdapter zzaFG;
    final GoogleMap zzaFs;

    public zzd zzf(zzf zzf1)
    {
        return zze.zzx(zzaFG.getInfoWindow(new Marker(zzf1)));
    }

    public zzd zzg(zzf zzf1)
    {
        return zze.zzx(zzaFG.getInfoContents(new Marker(zzf1)));
    }

    oWindowAdapter(GoogleMap googlemap, oWindowAdapter owindowadapter)
    {
        zzaFs = googlemap;
        zzaFG = owindowadapter;
        super();
    }
}
