// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.album;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.walmartlabs.android.photo.view.album:
//            PhotoExecutors

static final class  extends LinkedBlockingDeque
{

    public volatile boolean offer(Object obj)
    {
        return offer((Runnable)obj);
    }

    public volatile boolean offer(Object obj, long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return offer((Runnable)obj, l, timeunit);
    }

    public boolean offer(Runnable runnable)
    {
        return super.offerFirst(runnable);
    }

    public boolean offer(Runnable runnable, long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return super.offerFirst(runnable, l, timeunit);
    }

    (int i)
    {
        super(i);
    }
}
