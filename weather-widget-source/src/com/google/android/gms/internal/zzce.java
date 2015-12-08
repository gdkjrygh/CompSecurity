// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;

public final class zzce extends zzcg.zza
{

    private final zzg zzvv;
    private final String zzvw;
    private final String zzvx;

    public zzce(zzg zzg1, String s, String s1)
    {
        zzvv = zzg1;
        zzvw = s;
        zzvx = s1;
    }

    public String getContent()
    {
        return zzvx;
    }

    public void recordClick()
    {
        zzvv.recordClick();
    }

    public void recordImpression()
    {
        zzvv.recordImpression();
    }

    public void zza(zzd zzd)
    {
        if (zzd == null)
        {
            return;
        } else
        {
            zzvv.zzc((View)zze.zzp(zzd));
            return;
        }
    }

    public String zzdp()
    {
        return zzvw;
    }
}
