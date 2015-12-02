// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ExecutorService;

final class ng.Object
    implements hst
{

    final fpx a;
    final fpw b;

    private ExecutorService b()
    {
        ExecutorService executorservice = fpx.a(a).h();
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

    ct(fpw fpw1, fpx fpx1)
    {
        b = fpw1;
        a = fpx1;
        super();
    }
}
