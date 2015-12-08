// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;


class SynchronizedReference
{

    private Object mContents;

    public SynchronizedReference()
    {
        mContents = null;
    }

    public Object get()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = mContents;
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        throw exception;
    }

    public Object getAndClear()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = mContents;
        mContents = null;
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        throw exception;
    }

    public void set(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        mContents = obj;
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }
}
