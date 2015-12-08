// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class Atomics
{

    private Atomics()
    {
    }

    public static AtomicReference newReference()
    {
        return new AtomicReference();
    }

    public static AtomicReference newReference(Object obj)
    {
        return new AtomicReference(obj);
    }

    public static AtomicReferenceArray newReferenceArray(int i)
    {
        return new AtomicReferenceArray(i);
    }

    public static AtomicReferenceArray newReferenceArray(Object aobj[])
    {
        return new AtomicReferenceArray(aobj);
    }
}
