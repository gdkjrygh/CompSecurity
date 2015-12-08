// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.cast:
//            CastRemoteDisplay, CastDevice

public static final class zzQV
{

    CastDevice zzQH;
     zzQV;

    public zzQV build()
    {
        return new zzQV(this, null);
    }

    public (CastDevice castdevice,  )
    {
        zzu.zzb(castdevice, "CastDevice parameter cannot be null");
        zzQH = castdevice;
        zzQV = ;
    }
}
