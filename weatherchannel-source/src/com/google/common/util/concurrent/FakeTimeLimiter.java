// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.util.concurrent:
//            TimeLimiter

public final class FakeTimeLimiter
    implements TimeLimiter
{

    public FakeTimeLimiter()
    {
    }

    public Object callWithTimeout(Callable callable, long l, TimeUnit timeunit, boolean flag)
        throws Exception
    {
        Preconditions.checkNotNull(timeunit);
        return callable.call();
    }

    public Object newProxy(Object obj, Class class1, long l, TimeUnit timeunit)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(class1);
        Preconditions.checkNotNull(timeunit);
        return obj;
    }
}
