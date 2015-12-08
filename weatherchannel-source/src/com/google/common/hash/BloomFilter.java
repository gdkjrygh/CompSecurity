// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;

// Referenced classes of package com.google.common.hash:
//            BloomFilterStrategies, Funnel

public final class BloomFilter
    implements Predicate, Serializable
{
    private static class SerialForm
        implements Serializable
    {

        private static final long serialVersionUID = 1L;
        final long data[];
        final Funnel funnel;
        final int numHashFunctions;
        final Strategy strategy;

        Object readResolve()
        {
            return new BloomFilter(new BloomFilterStrategies.BitArray(data), numHashFunctions, funnel, strategy);
        }

        SerialForm(BloomFilter bloomfilter)
        {
            data = bloomfilter.bits.data;
            numHashFunctions = bloomfilter.numHashFunctions;
            funnel = bloomfilter.funnel;
            strategy = bloomfilter.strategy;
        }
    }

    static interface Strategy
        extends Serializable
    {

        public abstract boolean mightContain(Object obj, Funnel funnel1, int i, BloomFilterStrategies.BitArray bitarray);

        public abstract int ordinal();

        public abstract boolean put(Object obj, Funnel funnel1, int i, BloomFilterStrategies.BitArray bitarray);
    }


    private static final Strategy DEFAULT_STRATEGY;
    private final BloomFilterStrategies.BitArray bits;
    private final Funnel funnel;
    private final int numHashFunctions;
    private final Strategy strategy;

    private BloomFilter(BloomFilterStrategies.BitArray bitarray, int i, Funnel funnel1, Strategy strategy1)
    {
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "numHashFunctions (%s) must be > 0", new Object[] {
            Integer.valueOf(i)
        });
        if (i <= 255)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "numHashFunctions (%s) must be <= 255", new Object[] {
            Integer.valueOf(i)
        });
        bits = (BloomFilterStrategies.BitArray)Preconditions.checkNotNull(bitarray);
        numHashFunctions = i;
        funnel = (Funnel)Preconditions.checkNotNull(funnel1);
        strategy = (Strategy)Preconditions.checkNotNull(strategy1);
    }


    public static BloomFilter create(Funnel funnel1, int i)
    {
        return create(funnel1, i, 0.029999999999999999D);
    }

    public static BloomFilter create(Funnel funnel1, int i, double d)
    {
        return create(funnel1, i, d, DEFAULT_STRATEGY);
    }

    static BloomFilter create(Funnel funnel1, int i, double d, Strategy strategy1)
    {
        Preconditions.checkNotNull(funnel1);
        int j;
        long l;
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Expected insertions (%s) must be >= 0", new Object[] {
            Integer.valueOf(i)
        });
        if (d > 0.0D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "False positive probability (%s) must be > 0.0", new Object[] {
            Double.valueOf(d)
        });
        if (d < 1.0D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "False positive probability (%s) must be < 1.0", new Object[] {
            Double.valueOf(d)
        });
        Preconditions.checkNotNull(strategy1);
        j = i;
        if (i == 0)
        {
            j = 1;
        }
        l = optimalNumOfBits(j, d);
        i = optimalNumOfHashFunctions(j, l);
        try
        {
            funnel1 = new BloomFilter(new BloomFilterStrategies.BitArray(l), i, funnel1, strategy1);
        }
        // Misplaced declaration of an exception variable
        catch (Funnel funnel1)
        {
            throw new IllegalArgumentException((new StringBuilder(57)).append("Could not create BloomFilter of ").append(l).append(" bits").toString(), funnel1);
        }
        return funnel1;
    }

    static long optimalNumOfBits(long l, double d)
    {
        double d1 = d;
        if (d == 0.0D)
        {
            d1 = 4.9406564584124654E-324D;
        }
        return (long)(((double)(-l) * Math.log(d1)) / (Math.log(2D) * Math.log(2D)));
    }

    static int optimalNumOfHashFunctions(long l, long l1)
    {
        return Math.max(1, (int)Math.round(((double)l1 / (double)l) * Math.log(2D)));
    }

    public static BloomFilter readFrom(InputStream inputstream, Funnel funnel1)
        throws IOException
    {
        Preconditions.checkNotNull(inputstream, "InputStream");
        Preconditions.checkNotNull(funnel1, "Funnel");
        byte byte1 = -1;
        int l = -1;
        int k = -1;
        int i = k;
        int j = l;
        byte byte0 = byte1;
        BloomFilterStrategies bloomfilterstrategies;
        long al[];
        int i1;
        try
        {
            inputstream = new DataInputStream(inputstream);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            funnel1 = String.valueOf(String.valueOf("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: "));
            funnel1 = new IOException((new StringBuilder(funnel1.length() + 65)).append(funnel1).append(byte0).append(" numHashFunctions: ").append(j).append(" dataLength: ").append(i).toString());
            funnel1.initCause(inputstream);
            throw funnel1;
        }
        i = k;
        j = l;
        byte0 = byte1;
        byte1 = inputstream.readByte();
        i = k;
        j = l;
        byte0 = byte1;
        l = UnsignedBytes.toInt(inputstream.readByte());
        i = k;
        j = l;
        byte0 = byte1;
        i1 = inputstream.readInt();
        i = i1;
        j = l;
        byte0 = byte1;
        bloomfilterstrategies = BloomFilterStrategies.values()[byte1];
        i = i1;
        j = l;
        byte0 = byte1;
        al = new long[i1];
        k = 0;
_L2:
        i = i1;
        j = l;
        byte0 = byte1;
        if (k >= al.length)
        {
            break; /* Loop/switch isn't completed */
        }
        i = i1;
        j = l;
        byte0 = byte1;
        al[k] = inputstream.readLong();
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        i = i1;
        j = l;
        byte0 = byte1;
        inputstream = new BloomFilter(new BloomFilterStrategies.BitArray(al), l, funnel1, bloomfilterstrategies);
        return inputstream;
    }

    private Object writeReplace()
    {
        return new SerialForm(this);
    }

    public boolean apply(Object obj)
    {
        return mightContain(obj);
    }

    long bitSize()
    {
        return bits.bitSize();
    }

    public BloomFilter copy()
    {
        return new BloomFilter(bits.copy(), numHashFunctions, funnel, strategy);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof BloomFilter)
            {
                if (numHashFunctions != ((BloomFilter) (obj = (BloomFilter)obj)).numHashFunctions || !funnel.equals(((BloomFilter) (obj)).funnel) || !bits.equals(((BloomFilter) (obj)).bits) || !strategy.equals(((BloomFilter) (obj)).strategy))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public double expectedFpp()
    {
        return Math.pow((double)bits.bitCount() / (double)bitSize(), numHashFunctions);
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            Integer.valueOf(numHashFunctions), funnel, strategy, bits
        });
    }

    public boolean isCompatible(BloomFilter bloomfilter)
    {
        Preconditions.checkNotNull(bloomfilter);
        return this != bloomfilter && numHashFunctions == bloomfilter.numHashFunctions && bitSize() == bloomfilter.bitSize() && strategy.equals(bloomfilter.strategy) && funnel.equals(bloomfilter.funnel);
    }

    public boolean mightContain(Object obj)
    {
        return strategy.mightContain(obj, funnel, numHashFunctions, bits);
    }

    public boolean put(Object obj)
    {
        return strategy.put(obj, funnel, numHashFunctions, bits);
    }

    public void putAll(BloomFilter bloomfilter)
    {
        Preconditions.checkNotNull(bloomfilter);
        boolean flag;
        if (this != bloomfilter)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Cannot combine a BloomFilter with itself.");
        if (numHashFunctions == bloomfilter.numHashFunctions)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "BloomFilters must have the same number of hash functions (%s != %s)", new Object[] {
            Integer.valueOf(numHashFunctions), Integer.valueOf(bloomfilter.numHashFunctions)
        });
        if (bitSize() == bloomfilter.bitSize())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "BloomFilters must have the same size underlying bit arrays (%s != %s)", new Object[] {
            Long.valueOf(bitSize()), Long.valueOf(bloomfilter.bitSize())
        });
        Preconditions.checkArgument(strategy.equals(bloomfilter.strategy), "BloomFilters must have equal strategies (%s != %s)", new Object[] {
            strategy, bloomfilter.strategy
        });
        Preconditions.checkArgument(funnel.equals(bloomfilter.funnel), "BloomFilters must have equal funnels (%s != %s)", new Object[] {
            funnel, bloomfilter.funnel
        });
        bits.putAll(bloomfilter.bits);
    }

    public void writeTo(OutputStream outputstream)
        throws IOException
    {
        outputstream = new DataOutputStream(outputstream);
        outputstream.writeByte(SignedBytes.checkedCast(strategy.ordinal()));
        outputstream.writeByte(UnsignedBytes.checkedCast(numHashFunctions));
        outputstream.writeInt(bits.data.length);
        long al[] = bits.data;
        int j = al.length;
        for (int i = 0; i < j; i++)
        {
            outputstream.writeLong(al[i]);
        }

    }

    static 
    {
        DEFAULT_STRATEGY = BloomFilterStrategies.MURMUR128_MITZ_64;
    }




}
