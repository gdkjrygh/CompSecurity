// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.shape.jts;

import com.vividsolutions.jts.geom.d;
import com.vividsolutions.jts.geom.g;

// Referenced classes of package com.spatial4j.core.shape.jts:
//            JtsGeometry

static final class a
    implements g
{

    private int a;

    public final void a(d d1, int i)
    {
        d1.a(i, 0, d1.c(i) + (double)a);
    }

    public final boolean a()
    {
        return true;
    }

    (int i)
    {
        a = i;
        super();
    }
}
