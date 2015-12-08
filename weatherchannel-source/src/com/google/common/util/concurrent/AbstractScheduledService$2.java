// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.google.common.util.concurrent:
//            AbstractScheduledService, MoreExecutors

class this._cls0
    implements ThreadFactory
{

    final AbstractScheduledService this$0;

    public Thread newThread(Runnable runnable)
    {
        return MoreExecutors.newThread(serviceName(), runnable);
    }

    ()
    {
        this$0 = AbstractScheduledService.this;
        super();
    }
}
