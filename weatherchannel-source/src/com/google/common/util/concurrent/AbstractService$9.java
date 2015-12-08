// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;


// Referenced classes of package com.google.common.util.concurrent:
//            AbstractService

class Callback extends Callback
{

    final AbstractService this$0;
    final Throwable val$cause;
    final call val$from;

    void call(Callback callback)
    {
        callback.ailed(val$from, val$cause);
    }

    volatile void call(Object obj)
    {
        call((call)obj);
    }

    Callback(Throwable throwable)
    {
        this$0 = final_abstractservice;
        val$from = val.from.this;
        val$cause = throwable;
        super(final_s);
    }
}
