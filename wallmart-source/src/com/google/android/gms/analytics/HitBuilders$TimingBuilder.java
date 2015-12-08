// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            HitBuilders

public static class setCategory extends setCategory
{

    public volatile Map build()
    {
        return super.ld();
    }

    public ld setCategory(String s)
    {
        set("&utc", s);
        return this;
    }

    public set setLabel(String s)
    {
        set("&utl", s);
        return this;
    }

    public set setValue(long l)
    {
        set("&utt", Long.toString(l));
        return this;
    }

    public set setVariable(String s)
    {
        set("&utv", s);
        return this;
    }

    public ()
    {
        set("&t", "timing");
    }

    public set(String s, String s1, long l)
    {
        this();
        setVariable(s1);
        setValue(l);
        setCategory(s);
    }
}
