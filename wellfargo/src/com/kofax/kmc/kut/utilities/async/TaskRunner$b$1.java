// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.async;


class a
    implements Runnable
{

    final Long a;
    final b b;

    public void run()
    {
        CompletedEvent(b).onTaskCompleted(new CompletedEvent(b.b, this, a.longValue(), a(b), b(b)));
    }

    CompletedListener(CompletedListener completedlistener, Long long1)
    {
        b = completedlistener;
        a = long1;
        super();
    }
}
