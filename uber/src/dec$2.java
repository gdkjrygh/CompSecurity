// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ExecutorService;

final class ang.Object
    implements hst
{

    final ded a;
    final dec b;

    private ExecutorService b()
    {
        ExecutorService executorservice = ded.d(a).c();
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

    (dec dec1, ded ded1)
    {
        b = dec1;
        a = ded1;
        super();
    }
}
