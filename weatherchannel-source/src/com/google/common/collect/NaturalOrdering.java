// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;

// Referenced classes of package com.google.common.collect:
//            Ordering, ReverseNaturalOrdering

final class NaturalOrdering extends Ordering
    implements Serializable
{

    static final NaturalOrdering INSTANCE = new NaturalOrdering();
    private static final long serialVersionUID = 0L;

    private NaturalOrdering()
    {
    }

    private Object readResolve()
    {
        return INSTANCE;
    }

    public int compare(Comparable comparable, Comparable comparable1)
    {
        Preconditions.checkNotNull(comparable);
        Preconditions.checkNotNull(comparable1);
        return comparable.compareTo(comparable1);
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((Comparable)obj, (Comparable)obj1);
    }

    public Ordering reverse()
    {
        return ReverseNaturalOrdering.INSTANCE;
    }

    public String toString()
    {
        return "Ordering.natural()";
    }

}
