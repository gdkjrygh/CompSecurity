// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.util.concurrent:
//            CheckedFuture, Futures

private static class value extends value
    implements CheckedFuture
{

    private final Object value;

    public Object checkedGet()
    {
        return value;
    }

    public Object checkedGet(long l, TimeUnit timeunit)
    {
        Preconditions.checkNotNull(timeunit);
        return value;
    }

    public Object get()
    {
        return value;
    }

    (Object obj)
    {
        super(null);
        value = obj;
    }
}
