// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.internal.zzi;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMap

class zza extends com.google.android.gms.maps.internal.>
{

    final arkerDragListener zzaBE;
    final GoogleMap zzaBs;

    public void zzb(zzi zzi)
    {
        zzaBE.onMarkerDragStart(new Marker(zzi));
    }

    public void zzc(zzi zzi)
    {
        zzaBE.onMarkerDragEnd(new Marker(zzi));
    }

    public void zzd(zzi zzi)
    {
        zzaBE.onMarkerDrag(new Marker(zzi));
    }

    arkerDragListener(GoogleMap googlemap, arkerDragListener arkerdraglistener)
    {
        zzaBs = googlemap;
        zzaBE = arkerdraglistener;
        super();
    }
}
