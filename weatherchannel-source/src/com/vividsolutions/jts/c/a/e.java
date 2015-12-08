// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.c.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.c.a:
//            d, b

public abstract class e
{

    protected d a[];
    private List b;

    public e()
    {
        b = new ArrayList();
        a = new d[2];
    }

    public static int a(b b1, double d1)
    {
        byte byte0 = -1;
        if (b1.a >= d1)
        {
            byte0 = 1;
        }
        if (b1.b <= d1)
        {
            byte0 = 0;
        }
        return byte0;
    }

    public final void a(b b1, Collection collection)
    {
        Object obj = this;
_L5:
        if (b1 == null || ((e) (obj)).a(b1)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        collection.addAll(((e) (obj)).b);
        if (((e) (obj)).a[0] != null)
        {
            ((e) (obj)).a[0].a(b1, collection);
        }
        if (((e) (obj)).a[1] == null) goto _L1; else goto _L3
_L3:
        obj = ((e) (obj)).a[1];
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(Object obj)
    {
        b.add(obj);
    }

    protected abstract boolean a(b b1);
}
