// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.nearby.messages:
//            Strategy

public static class zzaFX
{

    private int zzaFU;
    private int zzaFV;
    private int zzaFX;
    private int zzaFY;

    public zzaFX zzie(int i)
    {
        zzaFX = i;
        return this;
    }

    public zzaFX zzif(int i)
    {
        boolean flag;
        if (i == 0x7fffffff || i > 0 && i <= 0x15180)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "ttlSeconds(%d) must either be TTL_SECONDS_INFINITE, or it must be between 1 and TTL_SECONDS_MAX(%d) inclusive", new Object[] {
            Integer.valueOf(i), Integer.valueOf(0x15180)
        });
        zzaFU = i;
        return this;
    }

    public Strategy zzwZ()
    {
        if (zzaFX == 2)
        {
            if (zzaFY != 3)
            {
                throw new IllegalStateException("Discovery mode must be DISCOVERY_MODE_DEFAULT.");
            }
            if (zzaFV == 1)
            {
                throw new IllegalStateException("Cannot set EARSHOT with BLE only mode.");
            }
        }
        return new Strategy(2, 0, zzaFU, zzaFV, false, zzaFX, zzaFY);
    }

    public _cls9()
    {
        zzaFY = 3;
        zzaFU = 300;
        zzaFV = 0;
        zzaFX = 1;
    }
}
