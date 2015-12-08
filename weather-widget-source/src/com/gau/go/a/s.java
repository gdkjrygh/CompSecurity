// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a;

import com.gau.go.a.c.h;
import java.util.Map;

// Referenced classes of package com.gau.go.a:
//            e, t

class s
    implements Runnable
{

    final Map a;
    final e b;

    s(e e1, Map map)
    {
        b = e1;
        a = map;
        super();
    }

    public void run()
    {
        e.f(b).a(a, new t(this));
    }
}
