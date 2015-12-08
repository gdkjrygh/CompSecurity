// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Objects;

// Referenced classes of package com.google.common.collect:
//            ImmutableEntry, LinkedHashMultimap

static final class nextInValueBucket extends ImmutableEntry
    implements k
{

    successorInValueSet nextInValueBucket;
    successorInValueSet predecessorInMultimap;
    k predecessorInValueSet;
    final int smearedValueHash;
    k successorInMultimap;
    k successorInValueSet;

    public k getPredecessorInMultimap()
    {
        return predecessorInMultimap;
    }

    public k getPredecessorInValueSet()
    {
        return predecessorInValueSet;
    }

    public predecessorInValueSet getSuccessorInMultimap()
    {
        return successorInMultimap;
    }

    public k getSuccessorInValueSet()
    {
        return successorInValueSet;
    }

    boolean matchesValue(Object obj, int i)
    {
        return smearedValueHash == i && Objects.equal(getValue(), obj);
    }

    public void setPredecessorInMultimap(getValue getvalue)
    {
        predecessorInMultimap = getvalue;
    }

    public void setPredecessorInValueSet(k k)
    {
        predecessorInValueSet = k;
    }

    public void setSuccessorInMultimap(predecessorInValueSet predecessorinvalueset)
    {
        successorInMultimap = predecessorinvalueset;
    }

    public void setSuccessorInValueSet(k k)
    {
        successorInValueSet = k;
    }

    k(Object obj, Object obj1, int i, k k)
    {
        super(obj, obj1);
        smearedValueHash = i;
        nextInValueBucket = k;
    }
}
