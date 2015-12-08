// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.cast:
//            Cast, CastDevice

public static final class zzQJ
{

    CastDevice zzQH;
    zzQJ zzQI;
    private int zzQJ;

    static int zza(zzQJ zzqj)
    {
        return zzqj.zzQJ;
    }

    public zzQJ build()
    {
        return new zzQJ(this, null);
    }

    public zzQJ setVerboseLoggingEnabled(boolean flag)
    {
        if (flag)
        {
            zzQJ = zzQJ | 1;
            return this;
        } else
        {
            zzQJ = zzQJ & -2;
            return this;
        }
    }

    public (CastDevice castdevice,  )
    {
        zzu.zzb(castdevice, "CastDevice parameter cannot be null");
        zzu.zzb(, "CastListener parameter cannot be null");
        zzQH = castdevice;
        zzQI = ;
        zzQJ = 0;
    }
}
