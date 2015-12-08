// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.math.LongMath;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.math.RoundingMode;
import java.util.Arrays;

// Referenced classes of package com.google.common.hash:
//            Hashing, HashFunction, HashCode, Funnel

abstract class BloomFilterStrategies extends Enum
    implements BloomFilter.Strategy
{
    static final class BitArray
    {

        long bitCount;
        final long data[];

        long bitCount()
        {
            return bitCount;
        }

        long bitSize()
        {
            return (long)data.length * 64L;
        }

        BitArray copy()
        {
            return new BitArray((long[])data.clone());
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof BitArray)
            {
                obj = (BitArray)obj;
                return Arrays.equals(data, ((BitArray) (obj)).data);
            } else
            {
                return false;
            }
        }

        boolean get(long l)
        {
            return (data[(int)(l >>> 6)] & 1L << (int)l) != 0L;
        }

        public int hashCode()
        {
            return Arrays.hashCode(data);
        }

        void putAll(BitArray bitarray)
        {
            boolean flag;
            if (data.length == bitarray.data.length)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "BitArrays must be of equal length (%s != %s)", new Object[] {
                Integer.valueOf(data.length), Integer.valueOf(bitarray.data.length)
            });
            bitCount = 0L;
            for (int i = 0; i < data.length; i++)
            {
                long al[] = data;
                al[i] = al[i] | bitarray.data[i];
                bitCount = bitCount + (long)Long.bitCount(data[i]);
            }

        }

        boolean set(long l)
        {
            if (!get(l))
            {
                long al[] = data;
                int i = (int)(l >>> 6);
                al[i] = al[i] | 1L << (int)l;
                bitCount = bitCount + 1L;
                return true;
            } else
            {
                return false;
            }
        }

        BitArray(long l)
        {
            this(new long[Ints.checkedCast(LongMath.divide(l, 64L, RoundingMode.CEILING))]);
        }

        BitArray(long al[])
        {
            int j;
            long l;
            boolean flag;
            if (al.length > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "data length is zero!");
            data = al;
            l = 0L;
            j = al.length;
            for (int i = 0; i < j; i++)
            {
                l += Long.bitCount(al[i]);
            }

            bitCount = l;
        }
    }


    private static final BloomFilterStrategies $VALUES[];
    public static final BloomFilterStrategies MURMUR128_MITZ_32;
    public static final BloomFilterStrategies MURMUR128_MITZ_64;

    private BloomFilterStrategies(String s, int i)
    {
        super(s, i);
    }


    public static BloomFilterStrategies valueOf(String s)
    {
        return (BloomFilterStrategies)Enum.valueOf(com/google/common/hash/BloomFilterStrategies, s);
    }

    public static BloomFilterStrategies[] values()
    {
        return (BloomFilterStrategies[])$VALUES.clone();
    }

    static 
    {
        MURMUR128_MITZ_32 = new BloomFilterStrategies("MURMUR128_MITZ_32", 0) {

            public boolean mightContain(Object obj, Funnel funnel, int i, BitArray bitarray)
            {
                long l1 = bitarray.bitSize();
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
                    if (!bitarray.get((long)k % l1))
                    {
                        return false;
                    }
                }

                return true;
            }

            public boolean put(Object obj, Funnel funnel, int i, BitArray bitarray)
            {
                long l1 = bitarray.bitSize();
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
                    flag |= bitarray.set((long)k % l1);
                }

                return flag;
            }

        };
        MURMUR128_MITZ_64 = new BloomFilterStrategies("MURMUR128_MITZ_64", 1) {

            private long lowerEight(byte abyte0[])
            {
                return Longs.fromBytes(abyte0[7], abyte0[6], abyte0[5], abyte0[4], abyte0[3], abyte0[2], abyte0[1], abyte0[0]);
            }

            private long upperEight(byte abyte0[])
            {
                return Longs.fromBytes(abyte0[15], abyte0[14], abyte0[13], abyte0[12], abyte0[11], abyte0[10], abyte0[9], abyte0[8]);
            }

            public boolean mightContain(Object obj, Funnel funnel, int i, BitArray bitarray)
            {
                long l1 = bitarray.bitSize();
                obj = Hashing.murmur3_128().hashObject(obj, funnel).getBytesInternal();
                long l = lowerEight(((byte []) (obj)));
                long l2 = upperEight(((byte []) (obj)));
                for (int j = 0; j < i; j++)
                {
                    if (!bitarray.get((0x7fffffffffffffffL & l) % l1))
                    {
                        return false;
                    }
                    l += l2;
                }

                return true;
            }

            public boolean put(Object obj, Funnel funnel, int i, BitArray bitarray)
            {
                long l1 = bitarray.bitSize();
                obj = Hashing.murmur3_128().hashObject(obj, funnel).getBytesInternal();
                long l = lowerEight(((byte []) (obj)));
                long l2 = upperEight(((byte []) (obj)));
                boolean flag = false;
                for (int j = 0; j < i; j++)
                {
                    flag |= bitarray.set((0x7fffffffffffffffL & l) % l1);
                    l += l2;
                }

                return flag;
            }

        };
        $VALUES = (new BloomFilterStrategies[] {
            MURMUR128_MITZ_32, MURMUR128_MITZ_64
        });
    }
}
