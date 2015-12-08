// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.c.e;

import com.vividsolutions.jts.geom.h;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.c.e:
//            a, e, c

static final class <init> extends a
{

    protected final Object b()
    {
        Iterator iterator = a().iterator();
        h h1 = null;
        while (iterator.hasNext()) 
        {
            c c1 = (c)iterator.next();
            if (h1 == null)
            {
                h1 = new h((h)c1.c());
            } else
            {
                h1.a((h)c1.c());
            }
        }
        return h1;
    }

    private (int i)
    {
        super(i);
    }

    nit>(int i, byte byte0)
    {
        this(i);
    }
}
