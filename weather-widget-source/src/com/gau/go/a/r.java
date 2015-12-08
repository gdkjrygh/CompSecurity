// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a;

import com.gau.go.a.c.h;
import java.util.Map;

// Referenced classes of package com.gau.go.a:
//            e

class r
    implements Runnable
{

    final e a;

    r(e e1)
    {
        a = e1;
        super();
    }

    public void run()
    {
        e.i(a).clear();
        if (e.f(a) != null)
        {
            e.b(a, e.f(a).a());
        }
    }
}
