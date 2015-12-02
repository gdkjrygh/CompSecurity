// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

public final class dba
    implements dcp
{

    private final gmg a;
    private final Map b = new HashMap();

    public transient dba(gmg gmg1, gmv agmv[])
    {
        a = gmg1;
        for (int i = 0; i < 4; i++)
        {
            gmg1 = agmv[i];
            b.put(gmg1.name(), gmg1);
        }

    }

    public final boolean a(int i, String s)
    {
        if (s == null || s.isEmpty())
        {
            return false;
        }
        s = (gmv)b.get(s);
        if (s == null || a.b(s))
        {
            return false;
        }
        long l = a.a(s, "log_level", 0L);
        return (long)i >= l;
    }
}
