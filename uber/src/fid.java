// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

final class fid
{

    private final String a;
    private final int b;
    private final Map c;

    fid(String s, int i)
    {
        c = new HashMap();
        a = s;
        b = i;
    }

    fid(String s, int i, String s1, int j)
    {
        this(s, i);
        c.put(s1, Integer.valueOf(j));
    }

    private int b()
    {
        return b;
    }

    final int a(String s)
    {
        s = (Integer)c.get(s);
        if (s != null)
        {
            return s.intValue();
        } else
        {
            return b();
        }
    }

    final String a()
    {
        return a;
    }
}
