// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


public abstract class ForwardingObject
{

    protected ForwardingObject()
    {
    }

    protected abstract Object _mthdelegate();

    public String toString()
    {
        return _mthdelegate().toString();
    }
}
