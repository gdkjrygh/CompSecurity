// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Throwables;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.common.util.concurrent:
//            WrappingExecutorService

class val.wrapped
    implements Runnable
{

    final WrappingExecutorService this$0;
    final Callable val$wrapped;

    public void run()
    {
        try
        {
            val$wrapped.call();
            return;
        }
        catch (Exception exception)
        {
            Throwables.propagate(exception);
        }
    }

    A()
    {
        this$0 = final_wrappingexecutorservice;
        val$wrapped = Callable.this;
        super();
    }
}
