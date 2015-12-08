// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.a;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.android.a:
//            g

class h
    implements Executor
{

    final g a;
    private final Handler b;

    h(g g, Handler handler)
    {
        a = g;
        b = handler;
        super();
    }

    public void execute(Runnable runnable)
    {
        b.post(runnable);
    }
}
