// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import java.io.Serializable;

// Referenced classes of package com.google.common.hash:
//            BloomFilter, Funnel

private static class strategy
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    final long data[];
    final Funnel funnel;
    final int numHashFunctions;
    final itArray strategy;

    Object readResolve()
    {
        return new BloomFilter(new itArray(data), numHashFunctions, funnel, strategy, null);
    }

    itArray(BloomFilter bloomfilter)
    {
        data = BloomFilter.access$000(bloomfilter).data;
        numHashFunctions = BloomFilter.access$100(bloomfilter);
        funnel = BloomFilter.access$200(bloomfilter);
        strategy = BloomFilter.access$300(bloomfilter);
    }
}
