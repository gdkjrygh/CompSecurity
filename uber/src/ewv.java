// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Map;

class ewv
{

    private final cev a;
    private final gju b;
    private final Map c = new HashMap();
    private final Map d = new HashMap();
    private final long e;
    private Object f;

    ewv(cev cev1, gju gju1, long l)
    {
        a = cev1;
        b = gju1;
        e = l;
    }

    private boolean b(Object obj)
    {
        if (!c.containsKey(obj))
        {
            return false;
        }
        dmx dmx1 = (dmx)c.get(obj);
        if (dmx1 == null)
        {
            return true;
        }
        if (!dmx1.i())
        {
            Long long1 = (Long)d.get(obj);
            if (long1 == null || long1.longValue() < gju.a())
            {
                c.remove(obj);
                d.remove(obj);
                return false;
            }
        }
        a.c(dmx1);
        f = null;
        return true;
    }

    public final void a(Object obj, dmx dmx1)
    {
        c.put(obj, dmx1);
        if (obj.equals(f))
        {
            a.c(dmx1);
            f = null;
        }
    }

    public final boolean a(Object obj)
    {
        if (b(obj))
        {
            return true;
        } else
        {
            c.put(obj, null);
            f = obj;
            return false;
        }
    }

    public final void b(Object obj, dmx dmx1)
    {
        c.put(obj, dmx1);
        int i = dmx1.n();
        long l;
        if (i >= 400 && i < 500)
        {
            l = 0x7fffffffffffffffL;
        } else
        {
            l = gju.a() + e;
        }
        d.put(obj, Long.valueOf(l));
        if (obj.equals(f))
        {
            a.c(dmx1);
            f = null;
        }
    }
}
