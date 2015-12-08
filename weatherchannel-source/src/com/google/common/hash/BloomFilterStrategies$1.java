// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;


// Referenced classes of package com.google.common.hash:
//            BloomFilterStrategies, Hashing, HashFunction, HashCode, 
//            Funnel

static final class nit> extends BloomFilterStrategies
{

    public boolean mightContain(Object obj, Funnel funnel, int i, tArray tarray)
    {
        long l1 = tarray.bitSize();
        long l2 = Hashing.murmur3_128().hashObject(obj, funnel).asLong();
        int i1 = (int)l2;
        int j1 = (int)(l2 >>> 32);
        for (int j = 1; j <= i; j++)
        {
            int l = i1 + j * j1;
            int k = l;
            if (l < 0)
            {
                k = ~l;
            }
            if (!tarray.get((long)k % l1))
            {
                return false;
            }
        }

        return true;
    }

    public boolean put(Object obj, Funnel funnel, int i, tArray tarray)
    {
        long l1 = tarray.bitSize();
        long l2 = Hashing.murmur3_128().hashObject(obj, funnel).asLong();
        int i1 = (int)l2;
        int j1 = (int)(l2 >>> 32);
        boolean flag = false;
        for (int j = 1; j <= i; j++)
        {
            int l = i1 + j * j1;
            int k = l;
            if (l < 0)
            {
                k = ~l;
            }
            flag |= tarray.set((long)k % l1);
        }

        return flag;
    }

    tArray(String s, int i)
    {
        super(s, i, null);
    }
}
