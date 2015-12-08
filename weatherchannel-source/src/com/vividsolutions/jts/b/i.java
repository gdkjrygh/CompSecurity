// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.b;

import com.vividsolutions.jts.f.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.vividsolutions.jts.b:
//            d

public final class i
{

    private List a;
    private Map b;

    public i()
    {
        a = new ArrayList();
        b = new TreeMap();
    }

    public final List a()
    {
        return a;
    }

    public final void a(d d1)
    {
        a.add(d1);
        k k1 = new k(d1.a);
        b.put(k1, d1);
    }

    public final void a(Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext(); a((d)collection.next())) { }
    }

    public final d b(d d1)
    {
        d1 = new k(d1.a);
        return (d)b.get(d1);
    }

    public final Iterator b()
    {
        return a.iterator();
    }
}
