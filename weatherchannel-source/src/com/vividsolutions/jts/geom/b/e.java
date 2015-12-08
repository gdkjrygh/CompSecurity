// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom.b;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.f.c;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.o;

// Referenced classes of package com.vividsolutions.jts.geom.b:
//            b, f

public final class e extends b
{

    private c a;

    public e(o o)
    {
        super((i)o);
        a = null;
    }

    public final c c()
    {
        this;
        JVM INSTR monitorenter ;
        c c1;
        if (a == null)
        {
            a = new c(com.vividsolutions.jts.a.a.a(a()));
        }
        c1 = a;
        this;
        JVM INSTR monitorexit ;
        return c1;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean g(i j)
    {
        if (!b(j))
        {
            return false;
        } else
        {
            return (new f(this)).a(j);
        }
    }
}
