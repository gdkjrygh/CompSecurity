// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.internal.cflowstack;


public interface ThreadCounter
{

    public abstract void dec();

    public abstract void inc();

    public abstract boolean isNotZero();

    public abstract void removeThreadCounter();
}
