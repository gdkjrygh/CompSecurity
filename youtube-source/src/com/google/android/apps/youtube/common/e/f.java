// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.e;

import com.google.android.apps.youtube.common.fromguava.e;

public abstract class f
    implements e
{

    private volatile Object a;
    private volatile boolean b;

    public f()
    {
        b = false;
    }

    public abstract Object a();

    public final Object b()
    {
        if (b) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (!b)
        {
            a = a();
            b = true;
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return a;
        Exception exception;
        exception;
        throw exception;
    }
}
