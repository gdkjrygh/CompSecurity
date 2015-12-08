// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.http;

import java.util.concurrent.TimeUnit;

// Referenced classes of package com.contextlogic.wish.http:
//            LinkedBlockingQueue, WishHttpClient

public class this._cls0 extends LinkedBlockingQueue
{

    private static final long serialVersionUID = 0xc8425b83a3be032eL;
    final WishHttpClient this$0;

    public boolean add(Object obj)
    {
        return super.offerFirst(obj);
    }

    public boolean offer(Object obj)
    {
        return super.offerFirst(obj);
    }

    public boolean offer(Object obj, long l, TimeUnit timeunit)
        throws InterruptedException
    {
        return super.offerFirst(obj, l, timeunit);
    }

    public void put(Object obj)
        throws InterruptedException
    {
        super.putFirst(obj);
    }

    public A()
    {
        this$0 = WishHttpClient.this;
        super();
    }
}
