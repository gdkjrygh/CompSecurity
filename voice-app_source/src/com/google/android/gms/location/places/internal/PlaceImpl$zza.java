// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlaceImpl, PlaceLocalization

public static class zzCY
{

    private String mName;
    private int zzCY;
    private String zzKI;
    private long zzaAA;
    private String zzaAC;
    private List zzaAD;
    private boolean zzaAE;
    private Bundle zzaAI;
    private List zzaAJ;
    private float zzaAu;
    private LatLngBounds zzaAv;
    private String zzaAw;
    private boolean zzaAx;
    private float zzaAy;
    private int zzaAz;
    private String zzajO;
    private LatLng zzazn;
    private String zzazp;
    private Uri zzazq;

    public zzCY zza(LatLng latlng)
    {
        zzazn = latlng;
        return this;
    }

    public zzazn zza(LatLngBounds latlngbounds)
    {
        zzaAv = latlngbounds;
        return this;
    }

    public zzaAv zzad(boolean flag)
    {
        zzaAx = flag;
        return this;
    }

    public zzaAx zzae(boolean flag)
    {
        zzaAE = flag;
        return this;
    }

    public zzaAE zzdq(String s)
    {
        zzKI = s;
        return this;
    }

    public zzKI zzdr(String s)
    {
        mName = s;
        return this;
    }

    public mName zzds(String s)
    {
        zzajO = s;
        return this;
    }

    public zzajO zzdt(String s)
    {
        zzazp = s;
        return this;
    }

    public zzazp zzf(float f)
    {
        zzaAu = f;
        return this;
    }

    public zzaAu zzg(float f)
    {
        zzaAy = f;
        return this;
    }

    public zzaAy zzgX(int i)
    {
        zzaAz = i;
        return this;
    }

    public zzaAz zzk(Uri uri)
    {
        zzazq = uri;
        return this;
    }

    public zzazq zzm(List list)
    {
        zzaAJ = list;
        return this;
    }

    public zzaAJ zzn(List list)
    {
        zzaAD = list;
        return this;
    }

    public PlaceImpl zzuX()
    {
        return new PlaceImpl(zzCY, zzKI, zzaAJ, Collections.emptyList(), zzaAI, mName, zzajO, zzazp, zzaAC, zzaAD, zzazn, zzaAu, zzaAv, zzaAw, zzazq, zzaAx, zzaAy, zzaAz, zzaAA, zzaAE, PlaceLocalization.zza(mName, zzajO, zzazp, zzaAC, zzaAD));
    }

    public ion()
    {
        zzCY = 0;
    }
}
