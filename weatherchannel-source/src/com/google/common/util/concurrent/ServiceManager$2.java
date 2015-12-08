// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;


// Referenced classes of package com.google.common.util.concurrent:
//            ServiceManager

static final class .Callback extends .Callback
{

    void call(stener stener)
    {
        stener.stopped();
    }

    volatile void call(Object obj)
    {
        call((stener)obj);
    }

    stener(String s)
    {
        super(s);
    }
}
