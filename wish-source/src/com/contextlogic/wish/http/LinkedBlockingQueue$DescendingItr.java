// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.http;

import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.contextlogic.wish.http:
//            LinkedBlockingQueue

private class <init> extends <init>
{

    final LinkedBlockingQueue this$0;

    void advance()
    {
        ReentrantLock reentrantlock;
        reentrantlock = LinkedBlockingQueue.access$200(LinkedBlockingQueue.this);
        reentrantlock.lock();
        if (next != null) goto _L2; else goto _L1
_L1:
        Object obj = LinkedBlockingQueue.access$400(LinkedBlockingQueue.this);
_L5:
        next = ((next) (obj));
        if (next != null) goto _L4; else goto _L3
_L3:
        obj = null;
_L6:
        nextItem = obj;
        reentrantlock.unlock();
        return;
_L2:
        obj = next.next;
          goto _L5
_L4:
        obj = next.next;
          goto _L6
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
          goto _L5
    }

    private ()
    {
        this$0 = LinkedBlockingQueue.this;
        super(LinkedBlockingQueue.this);
    }

    nit>(nit> nit>)
    {
        this();
    }
}
