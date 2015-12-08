// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Iterator;

// Referenced classes of package com.google.common.hash:
//            Funnel, Funnels, PrimitiveSink

private static class l
    implements Funnel, Serializable
{

    private final Funnel elementFunnel;

    public boolean equals(Object obj)
    {
        if (obj instanceof l)
        {
            obj = (l)obj;
            return elementFunnel.equals(((elementFunnel) (obj)).elementFunnel);
        } else
        {
            return false;
        }
    }

    public void funnel(Iterable iterable, PrimitiveSink primitivesink)
    {
        Object obj;
        for (iterable = iterable.iterator(); iterable.hasNext(); elementFunnel.funnel(obj, primitivesink))
        {
            obj = iterable.next();
        }

    }

    public volatile void funnel(Object obj, PrimitiveSink primitivesink)
    {
        funnel((Iterable)obj, primitivesink);
    }

    public int hashCode()
    {
        return com/google/common/hash/Funnels$SequentialFunnel.hashCode() ^ elementFunnel.hashCode();
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(elementFunnel));
        return (new StringBuilder(s.length() + 26)).append("Funnels.sequentialFunnel(").append(s).append(")").toString();
    }

    (Funnel funnel1)
    {
        elementFunnel = (Funnel)Preconditions.checkNotNull(funnel1);
    }
}
