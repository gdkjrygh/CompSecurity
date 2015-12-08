// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.c.e;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.c.e:
//            c

public abstract class a
    implements c, Serializable
{

    private static final long serialVersionUID = 0x5a1e55ec4136984cL;
    private ArrayList a;
    private Object b;

    public a()
    {
        a = new ArrayList();
        b = null;
    }

    public a(int i)
    {
        a = new ArrayList();
        b = null;
    }

    public final List a()
    {
        return a;
    }

    public final void a(c c1)
    {
        boolean flag;
        if (b == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.vividsolutions.jts.a.a.a(flag, null);
        a.add(c1);
    }

    protected abstract Object b();

    public final Object c()
    {
        if (b == null)
        {
            b = b();
        }
        return b;
    }

    public final boolean d()
    {
        return a.isEmpty();
    }
}
