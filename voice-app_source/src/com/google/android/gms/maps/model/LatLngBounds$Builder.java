// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLngBounds, LatLng

public static final class zzaDq
{

    private double zzaDn;
    private double zzaDo;
    private double zzaDp;
    private double zzaDq;

    private boolean zzg(double d)
    {
        boolean flag = false;
        if (zzaDp <= zzaDq)
        {
            return zzaDp <= d && d <= zzaDq;
        }
        if (zzaDp <= d || d <= zzaDq)
        {
            flag = true;
        }
        return flag;
    }

    public LatLngBounds build()
    {
        boolean flag;
        if (!Double.isNaN(zzaDp))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "no included points");
        return new LatLngBounds(new LatLng(zzaDn, zzaDp), new LatLng(zzaDo, zzaDq));
    }

    public zzaDq include(LatLng latlng)
    {
        zzaDn = Math.min(zzaDn, latlng.latitude);
        zzaDo = Math.max(zzaDo, latlng.latitude);
        double d = latlng.longitude;
        if (Double.isNaN(zzaDp))
        {
            zzaDp = d;
            zzaDq = d;
        } else
        if (!zzg(d))
        {
            if (LatLngBounds.zzd(zzaDp, d) < LatLngBounds.zze(zzaDq, d))
            {
                zzaDp = d;
                return this;
            } else
            {
                zzaDq = d;
                return this;
            }
        }
        return this;
    }

    public ()
    {
        zzaDn = (1.0D / 0.0D);
        zzaDo = (-1.0D / 0.0D);
        zzaDp = (0.0D / 0.0D);
        zzaDq = (0.0D / 0.0D);
    }
}
