// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.apps.youtube.common.fromguava.c;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            af, c

public final class b
    implements af
{

    private final Executor a;
    private final af b;

    private b(Executor executor, af af1)
    {
        a = executor;
        b = af1;
    }

    static af a(b b1)
    {
        return b1.b;
    }

    public static b a(Executor executor, af af1)
    {
        c.a(executor);
        c.a(af1);
        return new b(executor, af1);
    }

    public final void a(Object obj, com.google.android.apps.youtube.common.a.b b1)
    {
        c.a(obj);
        c.a(b1);
        try
        {
            a.execute(new com.google.android.apps.youtube.core.async.c(this, obj, b1));
            return;
        }
        catch (RejectedExecutionException rejectedexecutionexception)
        {
            b1.a(obj, rejectedexecutionexception);
        }
    }
}
