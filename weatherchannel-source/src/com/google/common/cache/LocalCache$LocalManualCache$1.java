// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.common.cache:
//            CacheLoader, LocalCache

class val.valueLoader extends CacheLoader
{

    final val.valueLoader this$0;
    final Callable val$valueLoader;

    public Object load(Object obj)
        throws Exception
    {
        return val$valueLoader.call();
    }

    ()
    {
        this$0 = final_;
        val$valueLoader = Callable.this;
        super();
    }
}
