// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.internal.zzof;
import com.google.android.gms.internal.zzok;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zzan, zzf

public class zzk extends zzd
{

    private final zzok zzMm = new zzok();

    zzk(zzf zzf)
    {
        super(zzf);
    }

    protected void zzhB()
    {
        zzig().zzxu().zza(zzMm);
        zzhw();
    }

    public void zzhw()
    {
        Object obj = zzhA();
        String s = ((zzan) (obj)).zzjZ();
        if (s != null)
        {
            zzMm.setAppName(s);
        }
        obj = ((zzan) (obj)).zzkb();
        if (obj != null)
        {
            zzMm.setAppVersion(((String) (obj)));
        }
    }

    public zzok zziL()
    {
        zzio();
        return zzMm;
    }
}
