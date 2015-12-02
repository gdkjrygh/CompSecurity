// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Future;

final class ije
    implements icl
{

    final Future a;

    public ije(Future future)
    {
        a = future;
    }

    public final void b()
    {
        a.cancel(true);
    }

    public final boolean c()
    {
        return a.isCancelled();
    }
}
