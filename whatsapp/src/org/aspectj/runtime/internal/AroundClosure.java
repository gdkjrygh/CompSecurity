// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.internal;

import org.aspectj.lang.ProceedingJoinPoint;

public abstract class AroundClosure
{

    protected int bitflags;
    protected Object preInitializationState[];
    protected Object state[];

    public AroundClosure()
    {
        bitflags = 0x100000;
    }

    public AroundClosure(Object aobj[])
    {
        bitflags = 0x100000;
        state = aobj;
    }

    public int getFlags()
    {
        return bitflags;
    }

    public Object[] getPreInitializationState()
    {
        return preInitializationState;
    }

    public Object[] getState()
    {
        return state;
    }

    public ProceedingJoinPoint linkClosureAndJoinPoint()
    {
        ProceedingJoinPoint proceedingjoinpoint = (ProceedingJoinPoint)state[state.length - 1];
        proceedingjoinpoint.set$AroundClosure(this);
        return proceedingjoinpoint;
    }

    public ProceedingJoinPoint linkClosureAndJoinPoint(int i)
    {
        ProceedingJoinPoint proceedingjoinpoint = (ProceedingJoinPoint)state[state.length - 1];
        proceedingjoinpoint.set$AroundClosure(this);
        bitflags = i;
        return proceedingjoinpoint;
    }

    public abstract Object run(Object aobj[])
        throws Throwable;
}
