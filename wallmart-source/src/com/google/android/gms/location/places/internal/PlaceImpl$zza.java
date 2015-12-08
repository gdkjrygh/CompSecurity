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

public static class mVersionCode
{

    private String mName;
    private int mVersionCode;
    private LatLng zzaDh;
    private String zzaDj;
    private Uri zzaDk;
    private String zzaEA;
    private List zzaEB;
    private boolean zzaEC;
    private Bundle zzaEG;
    private List zzaEH;
    private float zzaEs;
    private LatLngBounds zzaEt;
    private String zzaEu;
    private boolean zzaEv;
    private float zzaEw;
    private int zzaEx;
    private long zzaEy;
    private String zzanu;
    private String zzwj;

    public mVersionCode zza(LatLng latlng)
    {
        zzaDh = latlng;
        return this;
    }

    public zzaDh zza(LatLngBounds latlngbounds)
    {
        zzaEt = latlngbounds;
        return this;
    }

    public zzaEt zzah(boolean flag)
    {
        zzaEv = flag;
        return this;
    }

    public zzaEv zzai(boolean flag)
    {
        zzaEC = flag;
        return this;
    }

    public zzaEC zzdB(String s)
    {
        zzwj = s;
        return this;
    }

    public zzwj zzdC(String s)
    {
        mName = s;
        return this;
    }

    public mName zzdD(String s)
    {
        zzanu = s;
        return this;
    }

    public zzanu zzdE(String s)
    {
        zzaDj = s;
        return this;
    }

    public zzaDj zzf(float f)
    {
        zzaEs = f;
        return this;
    }

    public zzaEs zzg(float f)
    {
        zzaEw = f;
        return this;
    }

    public zzaEw zzhj(int i)
    {
        zzaEx = i;
        return this;
    }

    public zzaEx zzl(Uri uri)
    {
        zzaDk = uri;
        return this;
    }

    public zzaDk zzm(List list)
    {
        zzaEH = list;
        return this;
    }

    public zzaEH zzn(List list)
    {
        zzaEB = list;
        return this;
    }

    public PlaceImpl zzws()
    {
        return new PlaceImpl(mVersionCode, zzwj, zzaEH, Collections.emptyList(), zzaEG, mName, zzanu, zzaDj, zzaEA, zzaEB, zzaDh, zzaEs, zzaEt, zzaEu, zzaDk, zzaEv, zzaEw, zzaEx, zzaEy, zzaEC, PlaceLocalization.zza(mName, zzanu, zzaDj, zzaEA, zzaEB));
    }

    public ion()
    {
        mVersionCode = 0;
    }
}
