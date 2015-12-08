// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;


// Referenced classes of package com.google.common.util.concurrent:
//            AbstractService

static final class Callback extends Callback
{

    final call val$from;

    void call(Callback callback)
    {
        callback.topping(val$from);
    }

    volatile void call(Object obj)
    {
        call((call)obj);
    }

    Callback(String s, Callback callback)
    {
        val$from = callback;
        super(s);
    }
}
