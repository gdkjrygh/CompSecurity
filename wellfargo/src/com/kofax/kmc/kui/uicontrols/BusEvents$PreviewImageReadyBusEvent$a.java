// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

class <init>
    implements Lock
{

    final <init> a;

    public void lock()
    {
    }

    public void lockInterruptibly()
    {
    }

    public Condition newCondition()
    {
        return null;
    }

    public boolean tryLock()
    {
        return true;
    }

    public boolean tryLock(long l, TimeUnit timeunit)
    {
        return true;
    }

    public void unlock()
    {
    }

    private ( )
    {
        a = ;
        super();
    }

    a(a a1, a a2)
    {
        this(a1);
    }
}
