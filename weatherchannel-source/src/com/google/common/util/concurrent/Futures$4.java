// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;


// Referenced classes of package com.google.common.util.concurrent:
//            AsyncFunction, Futures, ListenableFuture

static final class Future
    implements AsyncFunction
{

    public ListenableFuture apply(ListenableFuture listenablefuture)
    {
        return listenablefuture;
    }

    public volatile ListenableFuture apply(Object obj)
        throws Exception
    {
        return apply((ListenableFuture)obj);
    }

    Future()
    {
    }
}
