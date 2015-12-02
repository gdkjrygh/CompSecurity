// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.internal;

import org.aspectj.runtime.CFlow;

public class CFlowPlusState extends CFlow
{

    private Object state[];

    public CFlowPlusState(Object aobj[])
    {
        state = aobj;
    }

    public CFlowPlusState(Object aobj[], Object obj)
    {
        super(obj);
        state = aobj;
    }

    public Object get(int i)
    {
        return state[i];
    }
}
