// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.common;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.go.weatherex.common:
//            q, g

class i extends q
{

    final g a;

    i(g g1)
    {
        a = g1;
        super(null);
    }

    public Object call()
    {
        g.a(a).set(true);
        Process.setThreadPriority(10);
        return g.a(a, a.a(b));
    }
}
