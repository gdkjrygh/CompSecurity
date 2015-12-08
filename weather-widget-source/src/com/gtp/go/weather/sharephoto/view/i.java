// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.view;

import com.gtp.go.weather.sharephoto.b.h;
import java.util.Comparator;

// Referenced classes of package com.gtp.go.weather.sharephoto.view:
//            g

class i
    implements Comparator
{

    final g a;

    i(g g)
    {
        a = g;
        super();
    }

    public int a(h h1, h h2)
    {
        if (h1.e())
        {
            return -1;
        }
        if (h2.e())
        {
            return 1;
        } else
        {
            return -h1.a().compareTo(h2.a());
        }
    }

    public int compare(Object obj, Object obj1)
    {
        return a((h)obj, (h)obj1);
    }
}
