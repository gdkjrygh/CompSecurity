// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.cast:
//            Cast, CastDevice

public static final class Builder
    implements com.google.android.gms.common.api.sOptions
{
    public static final class Builder
    {

        CastDevice zzQH;
        Cast.Listener zzQI;
        private int zzQJ;

        static int zza(Builder builder1)
        {
            return builder1.zzQJ;
        }

        public Cast.CastOptions build()
        {
            return new Cast.CastOptions(this, null);
        }

        public Builder setVerboseLoggingEnabled(boolean flag)
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

        public Builder(CastDevice castdevice, Cast.Listener listener)
        {
            zzu.zzb(castdevice, "CastDevice parameter cannot be null");
            zzu.zzb(listener, "CastListener parameter cannot be null");
            zzQH = castdevice;
            zzQI = listener;
            zzQJ = 0;
        }
    }


    final CastDevice zzQE;
    final zzQG zzQF;
    private final int zzQG;

    public static Builder builder(CastDevice castdevice, Builder.zzQJ zzqj)
    {
        return new Builder(castdevice, zzqj);
    }

    static int zza(Builder builder1)
    {
        return builder1.zzQG;
    }

    private Builder(Builder builder1)
    {
        zzQE = builder1.zzQH;
        zzQF = builder1.zzQI;
        zzQG = Builder.zza(builder1);
    }

    Builder(Builder builder1, Builder builder2)
    {
        this(builder1);
    }
}
