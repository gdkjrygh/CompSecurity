// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            HitBuilders

public static class set extends set
{

    public volatile Map build()
    {
        return super.ld();
    }

    public ld setAction(String s)
    {
        set("&sa", s);
        return this;
    }

    public set setNetwork(String s)
    {
        set("&sn", s);
        return this;
    }

    public set setTarget(String s)
    {
        set("&st", s);
        return this;
    }

    public ()
    {
        set("&t", "social");
    }
}
