// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.view;

import com.gtp.go.weather.sharephoto.b.h;
import java.util.List;

// Referenced classes of package com.gtp.go.weather.sharephoto.view:
//            d, g

class j
    implements d
{

    final h a;
    final g b;

    j(g g1, h h)
    {
        b = g1;
        a = h;
        super();
    }

    public void a()
    {
        g.a(b).remove(a);
        b.notifyDataSetChanged();
    }
}
