// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.c;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class i extends WeakReference
{

    private final int a;

    public i(Object obj)
    {
        super(obj);
        a = obj.hashCode();
    }

    public final boolean equals(Object obj)
    {
        Object obj1 = get();
        if (obj1 != null && (obj instanceof Reference))
        {
            return obj1.equals(((Reference)obj).get());
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return a;
    }
}
