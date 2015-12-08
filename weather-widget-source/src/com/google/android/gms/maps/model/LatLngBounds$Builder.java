// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLngBounds, LatLng

public static final class zzaHp
{

    private double zzaHm;
    private double zzaHn;
    private double zzaHo;
    private double zzaHp;

    private boolean zzh(double d)
    {
        boolean flag = false;
        if (zzaHo <= zzaHp)
        {
            return zzaHo <= d && d <= zzaHp;
        }
        if (zzaHo <= d || d <= zzaHp)
        {
            flag = true;
        }
        return flag;
    }

    public LatLngBounds build()
    {
        boolean flag;
        if (!Double.isNaN(zzaHo))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, "no included points");
        return new LatLngBounds(new LatLng(zzaHm, zzaHo), new LatLng(zzaHn, zzaHp));
    }

    public zzaHp include(LatLng latlng)
    {
        zzaHm = Math.min(zzaHm, latlng.latitude);
        zzaHn = Math.max(zzaHn, latlng.latitude);
        double d = latlng.longitude;
        if (Double.isNaN(zzaHo))
        {
            zzaHo = d;
            zzaHp = d;
        } else
        if (!zzh(d))
        {
            if (LatLngBounds.zzd(zzaHo, d) < LatLngBounds.zze(zzaHp, d))
            {
                zzaHo = d;
                return this;
            } else
            {
                zzaHp = d;
                return this;
            }
        }
        return this;
    }

    public ()
    {
        zzaHm = (1.0D / 0.0D);
        zzaHn = (-1.0D / 0.0D);
        zzaHo = (0.0D / 0.0D);
        zzaHp = (0.0D / 0.0D);
    }
}
