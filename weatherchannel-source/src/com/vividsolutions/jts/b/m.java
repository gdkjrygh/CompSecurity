// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.b;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.geom.IntersectionMatrix;

// Referenced classes of package com.vividsolutions.jts.b:
//            n

public abstract class m
{

    private boolean a;
    private boolean b;
    protected n c;
    private boolean d;
    private boolean e;

    public m()
    {
        a = false;
        b = false;
        d = false;
        e = false;
    }

    protected abstract void a(IntersectionMatrix intersectionmatrix);

    public final void b(IntersectionMatrix intersectionmatrix)
    {
        boolean flag;
        if (c.b() >= 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.vividsolutions.jts.a.a.a(flag, "found partial label");
        a(intersectionmatrix);
    }

    public final void b(boolean flag)
    {
        a = true;
    }

    public final void c(boolean flag)
    {
        b = flag;
        d = true;
    }

    public final void d(boolean flag)
    {
        e = true;
    }

    public final n m()
    {
        return c;
    }

    public final boolean n()
    {
        return a;
    }

    public final boolean o()
    {
        return b;
    }

    public final boolean p()
    {
        return d;
    }

    public final boolean q()
    {
        return e;
    }
}
