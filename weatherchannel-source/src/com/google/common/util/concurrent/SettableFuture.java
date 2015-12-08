// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;


// Referenced classes of package com.google.common.util.concurrent:
//            AbstractFuture

public final class SettableFuture extends AbstractFuture
{

    private SettableFuture()
    {
    }

    public static SettableFuture create()
    {
        return new SettableFuture();
    }

    public boolean set(Object obj)
    {
        return super.set(obj);
    }

    public boolean setException(Throwable throwable)
    {
        return super.setException(throwable);
    }
}
