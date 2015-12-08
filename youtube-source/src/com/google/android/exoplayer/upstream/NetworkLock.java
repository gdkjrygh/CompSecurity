// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import java.util.PriorityQueue;

public final class NetworkLock
{

    public static final NetworkLock a = new NetworkLock();
    private final PriorityQueue b = new PriorityQueue();

    private NetworkLock()
    {
    }

    public final void a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        b.add(Integer.valueOf(0));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b(int i)
    {
        this;
        JVM INSTR monitorenter ;
        b.remove(Integer.valueOf(0));
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
