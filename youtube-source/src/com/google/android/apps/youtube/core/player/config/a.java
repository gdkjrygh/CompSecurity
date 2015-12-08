// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.config;

import com.google.android.apps.youtube.core.au;
import java.util.HashMap;

// Referenced classes of package com.google.android.apps.youtube.core.player.config:
//            PlayerLibConfig

public final class a
    implements PlayerLibConfig
{

    private static final HashMap a;
    private final au b;

    public a(au au1)
    {
        b = au1;
    }

    public final PlayerLibConfig.PrecachedAdsLevel a()
    {
        String s = b.E();
        if (s == null || !a.containsKey(s))
        {
            return PlayerLibConfig.PrecachedAdsLevel.NONE;
        } else
        {
            return (PlayerLibConfig.PrecachedAdsLevel)a.get(s);
        }
    }

    static 
    {
        HashMap hashmap = new HashMap();
        a = hashmap;
        hashmap.put("12", PlayerLibConfig.PrecachedAdsLevel.SIMULATE_AD_LOAD);
        a.put("13", PlayerLibConfig.PrecachedAdsLevel.PRECACHE_AD_METADATA);
        a.put("14", PlayerLibConfig.PrecachedAdsLevel.PRECACHE_AD_STREAM);
    }
}
