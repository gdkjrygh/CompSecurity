// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus:
//            Plus

public static final class Builder
    implements com.google.android.gms.common.api.tional
{
    public static final class Builder
    {

        String zzayN;
        final Set zzayO = new HashSet();

        public Plus.PlusOptions build()
        {
            return new Plus.PlusOptions(this, null);
        }

        public Builder()
        {
        }
    }


    final String zzayN;
    final Set zzayO;

    private Builder()
    {
        zzayN = null;
        zzayO = new HashSet();
    }

    zzayO(zzayO zzayo)
    {
        this();
    }

    private Builder(Builder builder)
    {
        zzayN = builder.zzayN;
        zzayO = builder.zzayO;
    }

    Builder(Builder builder, Builder builder1)
    {
        this(builder);
    }
}
