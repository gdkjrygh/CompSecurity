// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ExecutorService;

final class ang.Object
    implements hst
{

    final def a;
    final dee b;

    private ExecutorService b()
    {
        ExecutorService executorservice = def.e(a).c();
        if (executorservice == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return executorservice;
        }
    }

    public final Object a()
    {
        return b();
    }

    (dee dee1, def def1)
    {
        b = dee1;
        a = def1;
        super();
    }
}
