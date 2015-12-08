// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.cache;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.weather.dal2.net.Receiver;
import java.util.concurrent.Executors;

public abstract class AbstractFetcher
{

    private final ListeningExecutorService service = MoreExecutors.listeningDecorator(Executors.newCachedThreadPool());

    public AbstractFetcher()
    {
    }

    public void asyncFetch(Object obj, Receiver receiver, Object obj1)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(receiver);
        Futures.addCallback(service.submit(new _cls1(obj)), new _cls2(receiver, obj1));
    }

    protected abstract Object fetch(Object obj)
        throws Exception;

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
