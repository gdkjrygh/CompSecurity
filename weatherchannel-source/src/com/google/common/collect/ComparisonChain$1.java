// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.primitives.Booleans;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.util.Comparator;

// Referenced classes of package com.google.common.collect:
//            ComparisonChain

static final class nit> extends ComparisonChain
{

    ComparisonChain classify(int i)
    {
        if (i < 0)
        {
            return ComparisonChain.access$100();
        }
        if (i > 0)
        {
            return ComparisonChain.access$200();
        } else
        {
            return ComparisonChain.access$300();
        }
    }

    public ComparisonChain compare(double d, double d1)
    {
        return classify(Double.compare(d, d1));
    }

    public ComparisonChain compare(float f, float f1)
    {
        return classify(Float.compare(f, f1));
    }

    public ComparisonChain compare(int i, int j)
    {
        return classify(Ints.compare(i, j));
    }

    public ComparisonChain compare(long l, long l1)
    {
        return classify(Longs.compare(l, l1));
    }

    public ComparisonChain compare(Comparable comparable, Comparable comparable1)
    {
        return classify(comparable.compareTo(comparable1));
    }

    public ComparisonChain compare(Object obj, Object obj1, Comparator comparator)
    {
        return classify(comparator.compare(obj, obj1));
    }

    public ComparisonChain compareFalseFirst(boolean flag, boolean flag1)
    {
        return classify(Booleans.compare(flag, flag1));
    }

    public ComparisonChain compareTrueFirst(boolean flag, boolean flag1)
    {
        return classify(Booleans.compare(flag1, flag));
    }

    public int result()
    {
        return 0;
    }

    ()
    {
        super(null);
    }
}
