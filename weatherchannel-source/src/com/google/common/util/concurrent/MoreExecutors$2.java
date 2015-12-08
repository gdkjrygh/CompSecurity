// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.common.util.concurrent:
//            MoreExecutors, Callables

static final class val.nameSupplier
    implements Executor
{

    final Executor val$executor;
    final Supplier val$nameSupplier;

    public void execute(Runnable runnable)
    {
        val$executor.execute(Callables.threadRenaming(runnable, val$nameSupplier));
    }

    (Executor executor1, Supplier supplier)
    {
        val$executor = executor1;
        val$nameSupplier = supplier;
        super();
    }
}
