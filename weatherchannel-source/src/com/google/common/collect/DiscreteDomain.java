// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.NoSuchElementException;

public abstract class DiscreteDomain
{
    private static final class BigIntegerDomain extends DiscreteDomain
        implements Serializable
    {

        private static final BigIntegerDomain INSTANCE = new BigIntegerDomain();
        private static final BigInteger MAX_LONG = BigInteger.valueOf(0x7fffffffffffffffL);
        private static final BigInteger MIN_LONG = BigInteger.valueOf(0x8000000000000000L);
        private static final long serialVersionUID = 0L;

        private Object readResolve()
        {
            return INSTANCE;
        }

        public volatile long distance(Comparable comparable, Comparable comparable1)
        {
            return distance((BigInteger)comparable, (BigInteger)comparable1);
        }

        public long distance(BigInteger biginteger, BigInteger biginteger1)
        {
            return biginteger1.subtract(biginteger).max(MIN_LONG).min(MAX_LONG).longValue();
        }

        public volatile Comparable next(Comparable comparable)
        {
            return next((BigInteger)comparable);
        }

        public BigInteger next(BigInteger biginteger)
        {
            return biginteger.add(BigInteger.ONE);
        }

        public volatile Comparable previous(Comparable comparable)
        {
            return previous((BigInteger)comparable);
        }

        public BigInteger previous(BigInteger biginteger)
        {
            return biginteger.subtract(BigInteger.ONE);
        }

        public String toString()
        {
            return "DiscreteDomain.bigIntegers()";
        }



        private BigIntegerDomain()
        {
        }
    }

    private static final class IntegerDomain extends DiscreteDomain
        implements Serializable
    {

        private static final IntegerDomain INSTANCE = new IntegerDomain();
        private static final long serialVersionUID = 0L;

        private Object readResolve()
        {
            return INSTANCE;
        }

        public volatile long distance(Comparable comparable, Comparable comparable1)
        {
            return distance((Integer)comparable, (Integer)comparable1);
        }

        public long distance(Integer integer, Integer integer1)
        {
            return (long)integer1.intValue() - (long)integer.intValue();
        }

        public volatile Comparable maxValue()
        {
            return maxValue();
        }

        public Integer maxValue()
        {
            return Integer.valueOf(0x7fffffff);
        }

        public volatile Comparable minValue()
        {
            return minValue();
        }

        public Integer minValue()
        {
            return Integer.valueOf(0x80000000);
        }

        public volatile Comparable next(Comparable comparable)
        {
            return next((Integer)comparable);
        }

        public Integer next(Integer integer)
        {
            int i = integer.intValue();
            if (i == 0x7fffffff)
            {
                return null;
            } else
            {
                return Integer.valueOf(i + 1);
            }
        }

        public volatile Comparable previous(Comparable comparable)
        {
            return previous((Integer)comparable);
        }

        public Integer previous(Integer integer)
        {
            int i = integer.intValue();
            if (i == 0x80000000)
            {
                return null;
            } else
            {
                return Integer.valueOf(i - 1);
            }
        }

        public String toString()
        {
            return "DiscreteDomain.integers()";
        }



        private IntegerDomain()
        {
        }
    }

    private static final class LongDomain extends DiscreteDomain
        implements Serializable
    {

        private static final LongDomain INSTANCE = new LongDomain();
        private static final long serialVersionUID = 0L;

        private Object readResolve()
        {
            return INSTANCE;
        }

        public volatile long distance(Comparable comparable, Comparable comparable1)
        {
            return distance((Long)comparable, (Long)comparable1);
        }

        public long distance(Long long1, Long long2)
        {
            long l1 = long2.longValue() - long1.longValue();
            long l;
            if (long2.longValue() > long1.longValue() && l1 < 0L)
            {
                l = 0x7fffffffffffffffL;
            } else
            {
                l = l1;
                if (long2.longValue() < long1.longValue())
                {
                    l = l1;
                    if (l1 > 0L)
                    {
                        return 0x8000000000000000L;
                    }
                }
            }
            return l;
        }

        public volatile Comparable maxValue()
        {
            return maxValue();
        }

        public Long maxValue()
        {
            return Long.valueOf(0x7fffffffffffffffL);
        }

        public volatile Comparable minValue()
        {
            return minValue();
        }

        public Long minValue()
        {
            return Long.valueOf(0x8000000000000000L);
        }

        public volatile Comparable next(Comparable comparable)
        {
            return next((Long)comparable);
        }

        public Long next(Long long1)
        {
            long l = long1.longValue();
            if (l == 0x7fffffffffffffffL)
            {
                return null;
            } else
            {
                return Long.valueOf(1L + l);
            }
        }

        public volatile Comparable previous(Comparable comparable)
        {
            return previous((Long)comparable);
        }

        public Long previous(Long long1)
        {
            long l = long1.longValue();
            if (l == 0x8000000000000000L)
            {
                return null;
            } else
            {
                return Long.valueOf(l - 1L);
            }
        }

        public String toString()
        {
            return "DiscreteDomain.longs()";
        }



        private LongDomain()
        {
        }
    }


    protected DiscreteDomain()
    {
    }

    public static DiscreteDomain bigIntegers()
    {
        return BigIntegerDomain.INSTANCE;
    }

    public static DiscreteDomain integers()
    {
        return IntegerDomain.INSTANCE;
    }

    public static DiscreteDomain longs()
    {
        return LongDomain.INSTANCE;
    }

    public abstract long distance(Comparable comparable, Comparable comparable1);

    public Comparable maxValue()
    {
        throw new NoSuchElementException();
    }

    public Comparable minValue()
    {
        throw new NoSuchElementException();
    }

    public abstract Comparable next(Comparable comparable);

    public abstract Comparable previous(Comparable comparable);
}
