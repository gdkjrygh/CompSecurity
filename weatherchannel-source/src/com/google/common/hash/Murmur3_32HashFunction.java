// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.primitives.UnsignedBytes;
import java.io.Serializable;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.common.hash:
//            AbstractStreamingHashFunction, HashCode, Hasher

final class Murmur3_32HashFunction extends AbstractStreamingHashFunction
    implements Serializable
{
    private static final class Murmur3_32Hasher extends AbstractStreamingHashFunction.AbstractStreamingHasher
    {

        private static final int CHUNK_SIZE = 4;
        private int h1;
        private int length;

        public HashCode makeHash()
        {
            return Murmur3_32HashFunction.fmix(h1, length);
        }

        protected void process(ByteBuffer bytebuffer)
        {
            int i = Murmur3_32HashFunction.mixK1(bytebuffer.getInt());
            h1 = Murmur3_32HashFunction.mixH1(h1, i);
            length = length + 4;
        }

        protected void processRemaining(ByteBuffer bytebuffer)
        {
            length = length + bytebuffer.remaining();
            int j = 0;
            for (int i = 0; bytebuffer.hasRemaining(); i += 8)
            {
                j ^= UnsignedBytes.toInt(bytebuffer.get()) << i;
            }

            h1 = h1 ^ Murmur3_32HashFunction.mixK1(j);
        }

        Murmur3_32Hasher(int i)
        {
            super(4);
            h1 = i;
            length = 0;
        }
    }


    private static final int C1 = 0xcc9e2d51;
    private static final int C2 = 0x1b873593;
    private static final long serialVersionUID = 0L;
    private final int seed;

    Murmur3_32HashFunction(int i)
    {
        seed = i;
    }

    private static HashCode fmix(int i, int j)
    {
        i ^= j;
        i = (i ^ i >>> 16) * 0x85ebca6b;
        i = (i ^ i >>> 13) * 0xc2b2ae35;
        return HashCode.fromInt(i ^ i >>> 16);
    }

    private static int mixH1(int i, int j)
    {
        return Integer.rotateLeft(i ^ j, 13) * 5 - 0x19ab949c;
    }

    private static int mixK1(int i)
    {
        return Integer.rotateLeft(i * 0xcc9e2d51, 15) * 0x1b873593;
    }

    public int bits()
    {
        return 32;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof Murmur3_32HashFunction)
        {
            obj = (Murmur3_32HashFunction)obj;
            flag = flag1;
            if (seed == ((Murmur3_32HashFunction) (obj)).seed)
            {
                flag = true;
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return getClass().hashCode() ^ seed;
    }

    public HashCode hashInt(int i)
    {
        i = mixK1(i);
        return fmix(mixH1(seed, i), 4);
    }

    public HashCode hashLong(long l)
    {
        int j = (int)l;
        int i = (int)(l >>> 32);
        j = mixK1(j);
        return fmix(mixH1(mixH1(seed, j), mixK1(i)), 8);
    }

    public HashCode hashUnencodedChars(CharSequence charsequence)
    {
        int i = seed;
        for (int j = 1; j < charsequence.length(); j += 2)
        {
            i = mixH1(i, mixK1(charsequence.charAt(j - 1) | charsequence.charAt(j) << 16));
        }

        int k = i;
        if ((charsequence.length() & 1) == 1)
        {
            k = i ^ mixK1(charsequence.charAt(charsequence.length() - 1));
        }
        return fmix(k, charsequence.length() * 2);
    }

    public Hasher newHasher()
    {
        return new Murmur3_32Hasher(seed);
    }

    public String toString()
    {
        int i = seed;
        return (new StringBuilder(31)).append("Hashing.murmur3_32(").append(i).append(")").toString();
    }



}
