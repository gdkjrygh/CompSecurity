// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.common.util.concurrent:
//            ListenableFuture

public interface CheckedFuture
    extends ListenableFuture
{

    public abstract Object checkedGet()
        throws Exception;

    public abstract Object checkedGet(long l, TimeUnit timeunit)
        throws TimeoutException, Exception;
}
