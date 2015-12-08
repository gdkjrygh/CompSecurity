// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom.b;


// Referenced classes of package com.vividsolutions.jts.geom.b:
//            a, h

final class i extends a
{

    public i(h h1)
    {
        super(h1);
        a = false;
    }

    protected final boolean b(com.vividsolutions.jts.geom.i j)
    {
        return b.a().covers(j);
    }

    public final boolean c(com.vividsolutions.jts.geom.i j)
    {
        return a(j);
    }
}
