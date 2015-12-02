// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.lang;

import org.aspectj.runtime.internal.AroundClosure;

// Referenced classes of package org.aspectj.lang:
//            JoinPoint

public interface ProceedingJoinPoint
    extends JoinPoint
{

    public abstract Object proceed()
        throws Throwable;

    public abstract Object proceed(Object aobj[])
        throws Throwable;

    public abstract void set$AroundClosure(AroundClosure aroundclosure);
}
