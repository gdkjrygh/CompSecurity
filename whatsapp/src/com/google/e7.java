// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.Map;

// Referenced classes of package com.google:
//            e9, es, c6, S, 
//            gd, bQ, by

public final class e7 extends e9
{

    private final e9 i = new es();

    public e7()
    {
    }

    private static c6 a(c6 c6_1)
    {
        String s = c6_1.e();
        if (s.charAt(0) == '0')
        {
            return new c6(s.substring(1), null, c6_1.a(), S.UPC_A);
        } else
        {
            throw gd.a();
        }
    }

    protected int a(bQ bq, int ai[], StringBuilder stringbuilder)
    {
        return i.a(bq, ai, stringbuilder);
    }

    S a()
    {
        return S.UPC_A;
    }

    public c6 a(int j, bQ bq, Map map)
    {
        return a(i.a(j, bq, map));
    }

    public c6 a(int j, bQ bq, int ai[], Map map)
    {
        return a(i.a(j, bq, ai, map));
    }

    public c6 a(by by, Map map)
    {
        return a(i.a(by, map));
    }
}
