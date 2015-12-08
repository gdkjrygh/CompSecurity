// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.converter.ConverterException;
import com.google.android.apps.youtube.core.converter.d;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            af, h

public class g
    implements af
{

    private final af a;
    private final com.google.android.apps.youtube.core.converter.c b;
    private final d c;
    private final Executor d;

    private g(af af1, com.google.android.apps.youtube.core.converter.c c1, d d1, Executor executor)
    {
        a = (af)com.google.android.apps.youtube.common.fromguava.c.a(af1);
        b = null;
        c = d1;
        d = executor;
    }

    protected g(com.google.android.apps.youtube.core.converter.c c1, d d1)
    {
        a = null;
        b = c1;
        c = d1;
        d = null;
    }

    public static af a(af af1, d d1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(d1);
        return new g(af1, null, d1, null);
    }

    public static af a(af af1, d d1, Executor executor)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(d1);
        com.google.android.apps.youtube.common.fromguava.c.a(d1);
        return new g(af1, null, d1, executor);
    }

    static d a(g g1)
    {
        return g1.c;
    }

    static Executor b(g g1)
    {
        return g1.d;
    }

    public final void a(Object obj, b b1)
    {
        Object obj1;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        obj1 = b.a(obj);
_L1:
        b(obj1, new h(this, obj, obj1, b1));
        return;
        obj1 = obj;
          goto _L1
        ConverterException converterexception;
        converterexception;
        a(obj, null, b1, ((Exception) (converterexception)));
        return;
    }

    protected void a(Object obj, Object obj1, b b1, Exception exception)
    {
        b1.a(obj, exception);
    }

    protected void b(Object obj, b b1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(a);
        a.a(obj, b1);
    }
}
