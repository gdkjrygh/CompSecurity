// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import java.util.Locale;

// Referenced classes of package com.facebook.ads.a:
//            ag

public final class g extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    private static final g d[];

    private g(String s, int i)
    {
        super(s, i);
    }

    public static g a(String s)
    {
        if (ag.a(s))
        {
            return a;
        }
        try
        {
            s = valueOf(s.toUpperCase(Locale.US));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return a;
        }
        return s;
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/facebook/ads/a/g, s);
    }

    public static g[] values()
    {
        return (g[])d.clone();
    }

    static 
    {
        a = new g("NONE", 0);
        b = new g("INSTALLED", 1);
        c = new g("NOT_INSTALLED", 2);
        d = (new g[] {
            a, b, c
        });
    }
}
