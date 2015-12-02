// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

public final class gqg
{

    private final int a;
    private final String b;
    private final boolean c;
    private final Map d;
    private final gqk e;

    private gqg(int i, String s, boolean flag, Map map, gqk gqk)
    {
        a = i;
        e = gqk;
        d = map;
        b = s;
        c = flag;
    }

    gqg(int i, String s, boolean flag, Map map, gqk gqk, byte byte0)
    {
        this(i, s, flag, map, gqk);
    }

    public final int a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    public final boolean c()
    {
        return c;
    }

    public final Map d()
    {
        return d;
    }

    public final gqk e()
    {
        return e;
    }
}
