// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.cast:
//            CastRemoteDisplay, CastDevice

public static final class Builder
    implements com.google.android.gms.common.api.r
{
    public static final class Builder
    {

        CastDevice zzQH;
        CastRemoteDisplay.CastRemoteDisplaySessionCallbacks zzQV;

        public CastRemoteDisplay.CastRemoteDisplayOptions build()
        {
            return new CastRemoteDisplay.CastRemoteDisplayOptions(this, null);
        }

        public Builder(CastDevice castdevice, CastRemoteDisplay.CastRemoteDisplaySessionCallbacks castremotedisplaysessioncallbacks)
        {
            zzu.zzb(castdevice, "CastDevice parameter cannot be null");
            zzQH = castdevice;
            zzQV = castremotedisplaysessioncallbacks;
        }
    }


    final CastDevice zzQE;
    final allbacks zzQU;

    private Builder(Builder builder)
    {
        zzQE = builder.zzQH;
        zzQU = builder.zzQV;
    }

    Builder(Builder builder, Builder builder1)
    {
        this(builder);
    }
}
