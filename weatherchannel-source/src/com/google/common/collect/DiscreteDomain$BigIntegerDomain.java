// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.math.BigInteger;

// Referenced classes of package com.google.common.collect:
//            DiscreteDomain

private static final class  extends DiscreteDomain
    implements Serializable
{

    private static final previous INSTANCE = new <init>();
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



    private ()
    {
    }
}
