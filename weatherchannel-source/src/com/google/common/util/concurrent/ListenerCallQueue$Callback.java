// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.Iterator;

// Referenced classes of package com.google.common.util.concurrent:
//            ListenerCallQueue

static abstract class methodCall
{

    private final String methodCall;

    abstract void call(Object obj);

    void enqueueOn(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); ((ListenerCallQueue)iterable.next()).add(this)) { }
    }


    (String s)
    {
        methodCall = s;
    }
}
