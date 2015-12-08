// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.primitives.Longs;

// Referenced classes of package com.google.common.hash:
//            BloomFilterStrategies, Hashing, HashFunction, HashCode, 
//            Funnel

static final class nit> extends BloomFilterStrategies
{

    private long lowerEight(byte abyte0[])
    {
        return Longs.fromBytes(abyte0[7], abyte0[6], abyte0[5], abyte0[4], abyte0[3], abyte0[2], abyte0[1], abyte0[0]);
    }

    private long upperEight(byte abyte0[])
    {
        return Longs.fromBytes(abyte0[15], abyte0[14], abyte0[13], abyte0[12], abyte0[11], abyte0[10], abyte0[9], abyte0[8]);
    }

    public boolean mightContain(Object obj, Funnel funnel, int i, tArray tarray)
    {
        long l1 = tarray.bitSize();
        obj = Hashing.murmur3_128().hashObject(obj, funnel).getBytesInternal();
        long l = lowerEight(((byte []) (obj)));
        long l2 = upperEight(((byte []) (obj)));
        for (int j = 0; j < i; j++)
        {
            if (!tarray.get((0x7fffffffffffffffL & l) % l1))
            {
                return false;
            }
            l += l2;
        }

        return true;
    }

    public boolean put(Object obj, Funnel funnel, int i, tArray tarray)
    {
        long l1 = tarray.bitSize();
        obj = Hashing.murmur3_128().hashObject(obj, funnel).getBytesInternal();
        long l = lowerEight(((byte []) (obj)));
        long l2 = upperEight(((byte []) (obj)));
        boolean flag = false;
        for (int j = 0; j < i; j++)
        {
            flag |= tarray.set((0x7fffffffffffffffL & l) % l1);
            l += l2;
        }

        return flag;
    }

    tArray(String s, int i)
    {
        super(s, i, null);
    }
}
