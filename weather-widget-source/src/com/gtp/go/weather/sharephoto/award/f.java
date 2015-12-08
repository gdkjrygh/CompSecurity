// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.award;

import com.gtp.go.weather.sharephoto.b.d;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.gtp.go.weather.sharephoto.award:
//            o, c

class f extends o
{

    final c a;

    f(c c1)
    {
        a = c1;
        super();
    }

    public void a(d d1, List list)
    {
        c.h(a).put(Long.valueOf(d1.a()), list);
        c.a(a, list);
        c.a(a, false);
        c.i(a);
    }
}
