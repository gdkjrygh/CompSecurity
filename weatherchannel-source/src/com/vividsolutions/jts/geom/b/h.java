// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom.b;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.a.a.b;
import com.vividsolutions.jts.f.c;
import com.vividsolutions.jts.g.d.d;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.t;

// Referenced classes of package com.vividsolutions.jts.geom.b:
//            b, i, j

public final class h extends com.vividsolutions.jts.geom.b.b
{

    private boolean a;
    private c b;
    private b c;

    public h(t t)
    {
        super((i)t);
        a = false;
        b = null;
        c = null;
        a = a().isRectangle();
    }

    public final c c()
    {
        this;
        JVM INSTR monitorenter ;
        c c1;
        if (b == null)
        {
            b = new c(com.vividsolutions.jts.a.a.a(a()));
        }
        c1 = b;
        this;
        JVM INSTR monitorexit ;
        return c1;
        Exception exception;
        exception;
        throw exception;
    }

    public final b d()
    {
        this;
        JVM INSTR monitorenter ;
        b b1;
        if (c == null)
        {
            c = new com.vividsolutions.jts.a.a.a(a());
        }
        b1 = c;
        this;
        JVM INSTR monitorexit ;
        return b1;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean e(i k)
    {
        if (!c(k))
        {
            return false;
        }
        if (a)
        {
            return true;
        } else
        {
            return (new com.vividsolutions.jts.geom.b.i(this)).c(k);
        }
    }

    public final boolean g(i k)
    {
        if (!b(k))
        {
            return false;
        }
        if (a)
        {
            return com.vividsolutions.jts.g.d.d.a((Polygon)a(), k);
        } else
        {
            return (new j(this)).a(k);
        }
    }
}
