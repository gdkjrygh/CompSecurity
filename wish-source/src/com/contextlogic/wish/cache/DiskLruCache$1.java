// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.cache;

import java.util.concurrent.Callable;

// Referenced classes of package com.contextlogic.wish.cache:
//            DiskLruCache

class this._cls0
    implements Callable
{

    final DiskLruCache this$0;

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public Void call()
        throws Exception
    {
label0:
        {
            synchronized (DiskLruCache.this)
            {
                if (DiskLruCache.access$000(DiskLruCache.this) != null)
                {
                    break label0;
                }
            }
            return null;
        }
        DiskLruCache.access$100(DiskLruCache.this);
        if (DiskLruCache.access$200(DiskLruCache.this))
        {
            DiskLruCache.access$300(DiskLruCache.this);
            DiskLruCache.access$402(DiskLruCache.this, 0);
        }
        disklrucache;
        JVM INSTR monitorexit ;
        return null;
        exception;
        disklrucache;
        JVM INSTR monitorexit ;
        throw exception;
    }

    ()
    {
        this$0 = DiskLruCache.this;
        super();
    }
}
