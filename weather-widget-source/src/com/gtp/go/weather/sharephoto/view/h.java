// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.view;

import com.gtp.go.weather.sharephoto.b.e;
import com.gtp.go.weather.sharephoto.b.p;
import com.gtp.go.weather.sharephoto.c.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

// Referenced classes of package com.gtp.go.weather.sharephoto.view:
//            g

class h
    implements a
{

    final g a;

    h(g g1)
    {
        a = g1;
        super();
    }

    public void a(e e1)
    {
    }

    public void b(e e1)
    {
        Iterator iterator;
        long l;
        l = e1.f();
        iterator = com.gtp.go.weather.sharephoto.view.g.a(a).iterator();
_L2:
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_101;
        }
        iterator1 = ((com.gtp.go.weather.sharephoto.b.h)iterator.next()).b().values().iterator();
_L4:
        if (!iterator1.hasNext()) goto _L2; else goto _L1
_L1:
        p p1 = (p)iterator1.next();
        if (p1.c() != l || !p1.b()) goto _L4; else goto _L3
_L3:
        p1.a(e1);
        a.notifyDataSetChanged();
    }
}
