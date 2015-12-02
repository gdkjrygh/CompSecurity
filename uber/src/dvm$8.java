// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ExecutorService;

final class ang.Object
    implements hst
{

    final dvn a;
    final dvm b;

    private ExecutorService b()
    {
        ExecutorService executorservice = dvn.a(a).h();
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

    (dvm dvm1, dvn dvn1)
    {
        b = dvm1;
        a = dvn1;
        super();
    }
}
