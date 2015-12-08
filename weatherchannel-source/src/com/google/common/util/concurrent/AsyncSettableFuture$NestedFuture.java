// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;


// Referenced classes of package com.google.common.util.concurrent:
//            AbstractFuture, AsyncSettableFuture, ListenableFuture

private static final class <init> extends AbstractFuture
{

    boolean setFuture(ListenableFuture listenablefuture)
    {
        boolean flag = set(listenablefuture);
        if (isCancelled())
        {
            listenablefuture.cancel(wasInterrupted());
        }
        return flag;
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
