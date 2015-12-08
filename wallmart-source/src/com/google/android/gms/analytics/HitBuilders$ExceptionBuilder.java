// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.zzam;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            HitBuilders

public static class set extends set
{

    public volatile Map build()
    {
        return super.set();
    }

    public set setDescription(String s)
    {
        set("&exd", s);
        return this;
    }

    public set setFatal(boolean flag)
    {
        set("&exf", zzam.zzJ(flag));
        return this;
    }

    public ()
    {
        set("&t", "exception");
    }
}
