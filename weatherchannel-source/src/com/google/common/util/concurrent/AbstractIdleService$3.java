// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.common.util.concurrent:
//            AbstractIdleService, MoreExecutors

class this._cls0
    implements Executor
{

    final AbstractIdleService this$0;

    public void execute(Runnable runnable)
    {
        MoreExecutors.newThread((String)AbstractIdleService.access$000(AbstractIdleService.this).get(), runnable).start();
    }

    ()
    {
        this$0 = AbstractIdleService.this;
        super();
    }
}
