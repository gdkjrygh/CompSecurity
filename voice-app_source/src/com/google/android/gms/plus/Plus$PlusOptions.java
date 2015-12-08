// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import com.google.android.gms.common.internal.zzu;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus:
//            Plus

public static final class Builder
    implements com.google.android.gms.common.api.tional
{
    public static final class Builder
    {

        String zzaHb;
        final Set zzaHc = new HashSet();

        public transient Builder addActivityTypes(String as[])
        {
            zzu.zzb(as, "activityTypes may not be null.");
            for (int i = 0; i < as.length; i++)
            {
                zzaHc.add(as[i]);
            }

            return this;
        }

        public Plus.PlusOptions build()
        {
            return new Plus.PlusOptions(this, null);
        }

        public Builder setServerClientId(String s)
        {
            zzaHb = s;
            return this;
        }

        public Builder()
        {
        }
    }


    final String zzaHb;
    final Set zzaHc;

    public static Builder builder()
    {
        return new Builder();
    }

    private Builder()
    {
        zzaHb = null;
        zzaHc = new HashSet();
    }

    zzaHc(zzaHc zzahc)
    {
        this();
    }

    private Builder(Builder builder1)
    {
        zzaHb = builder1.zzaHb;
        zzaHc = builder1.zzaHc;
    }

    Builder(Builder builder1, Builder builder2)
    {
        this(builder1);
    }
}
