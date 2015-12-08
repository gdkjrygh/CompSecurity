// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.primitives.Booleans;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.util.Comparator;

public abstract class ComparisonChain
{
    private static final class InactiveComparisonChain extends ComparisonChain
    {

        final int result;

        public ComparisonChain compare(double d, double d1)
        {
            return this;
        }

        public ComparisonChain compare(float f, float f1)
        {
            return this;
        }

        public ComparisonChain compare(int i, int j)
        {
            return this;
        }

        public ComparisonChain compare(long l, long l1)
        {
            return this;
        }

        public ComparisonChain compare(Comparable comparable, Comparable comparable1)
        {
            return this;
        }

        public ComparisonChain compare(Object obj, Object obj1, Comparator comparator)
        {
            return this;
        }

        public ComparisonChain compareFalseFirst(boolean flag, boolean flag1)
        {
            return this;
        }

        public ComparisonChain compareTrueFirst(boolean flag, boolean flag1)
        {
            return this;
        }

        public int result()
        {
            return result;
        }

        InactiveComparisonChain(int i)
        {
            result = i;
        }
    }


    private static final ComparisonChain ACTIVE = new ComparisonChain() {

        ComparisonChain classify(int i)
        {
            if (i < 0)
            {
                return ComparisonChain.LESS;
            }
            if (i > 0)
            {
                return ComparisonChain.GREATER;
            } else
            {
                return ComparisonChain.ACTIVE;
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

    };
    private static final ComparisonChain GREATER = new InactiveComparisonChain(1);
    private static final ComparisonChain LESS = new InactiveComparisonChain(-1);

    private ComparisonChain()
    {
    }


    public static ComparisonChain start()
    {
        return ACTIVE;
    }

    public abstract ComparisonChain compare(double d, double d1);

    public abstract ComparisonChain compare(float f, float f1);

    public abstract ComparisonChain compare(int i, int j);

    public abstract ComparisonChain compare(long l, long l1);

    public abstract ComparisonChain compare(Comparable comparable, Comparable comparable1);

    public abstract ComparisonChain compare(Object obj, Object obj1, Comparator comparator);

    public abstract ComparisonChain compareFalseFirst(boolean flag, boolean flag1);

    public abstract ComparisonChain compareTrueFirst(boolean flag, boolean flag1);

    public abstract int result();




}
