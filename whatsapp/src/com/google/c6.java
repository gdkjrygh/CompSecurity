// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.EnumMap;
import java.util.Map;

// Referenced classes of package com.google:
//            bC, fw, S

public final class c6
{

    private Map a;
    private final byte b[];
    private final String c;
    private final long d;
    private fw e[];
    private final S f;

    public c6(String s, byte abyte0[], fw afw[], S s1)
    {
        this(s, abyte0, afw, s1, System.currentTimeMillis());
    }

    public c6(String s, byte abyte0[], fw afw[], S s1, long l)
    {
        c = s;
        b = abyte0;
        e = afw;
        f = s1;
        a = null;
        d = l;
    }

    public void a(bC bc, Object obj)
    {
        if (a == null)
        {
            a = new EnumMap(com/google/bC);
        }
        a.put(bc, obj);
    }

    public void a(Map map)
    {
label0:
        {
            if (map == null)
            {
                break label0;
            }
            if (a == null)
            {
                a = map;
                if (!fw.b)
                {
                    break label0;
                }
            }
            a.putAll(map);
        }
    }

    public void a(fw afw[])
    {
label0:
        {
            fw afw1[] = e;
            if (afw1 == null)
            {
                e = afw;
                if (!fw.b)
                {
                    break label0;
                }
            }
            if (afw != null && afw.length > 0)
            {
                fw afw2[] = new fw[afw1.length + afw.length];
                System.arraycopy(afw1, 0, afw2, 0, afw1.length);
                System.arraycopy(afw, 0, afw2, afw1.length, afw.length);
                e = afw2;
            }
        }
    }

    public fw[] a()
    {
        return e;
    }

    public Map b()
    {
        return a;
    }

    public byte[] c()
    {
        return b;
    }

    public S d()
    {
        return f;
    }

    public String e()
    {
        return c;
    }

    public String toString()
    {
        return c;
    }
}
