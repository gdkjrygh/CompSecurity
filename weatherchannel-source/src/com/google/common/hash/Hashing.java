// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.util.Iterator;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

// Referenced classes of package com.google.common.hash:
//            ChecksumHashFunction, HashCode, HashFunction, Murmur3_128HashFunction, 
//            Murmur3_32HashFunction, SipHashFunction, AbstractCompositeHashFunction, Hasher, 
//            Crc32cHashFunction, MessageDigestHashFunction

public final class Hashing
{
    private static class Adler32Holder
    {

        static final HashFunction ADLER_32;

        static 
        {
            ADLER_32 = Hashing.checksumHashFunction(ChecksumType.ADLER_32, "Hashing.adler32()");
        }

        private Adler32Holder()
        {
        }
    }

    static abstract class ChecksumType extends Enum
        implements Supplier
    {

        private static final ChecksumType $VALUES[];
        public static final ChecksumType ADLER_32;
        public static final ChecksumType CRC_32;
        private final int bits;

        public static ChecksumType valueOf(String s)
        {
            return (ChecksumType)Enum.valueOf(com/google/common/hash/Hashing$ChecksumType, s);
        }

        public static ChecksumType[] values()
        {
            return (ChecksumType[])$VALUES.clone();
        }

        public volatile Object get()
        {
            return get();
        }

        public abstract Checksum get();

        static 
        {
            CRC_32 = new ChecksumType("CRC_32", 0, 32) {

                public volatile Object get()
                {
                    return get();
                }

                public Checksum get()
                {
                    return new CRC32();
                }

            };
            ADLER_32 = new ChecksumType("ADLER_32", 1, 32) {

                public volatile Object get()
                {
                    return get();
                }

                public Checksum get()
                {
                    return new Adler32();
                }

            };
            $VALUES = (new ChecksumType[] {
                CRC_32, ADLER_32
            });
        }


        private ChecksumType(String s, int i, int j)
        {
            super(s, i);
            bits = j;
        }

    }

    static final class ConcatenatedHashFunction extends AbstractCompositeHashFunction
    {

        private final int bits;

        public int bits()
        {
            return bits;
        }

        public boolean equals(Object obj)
        {
            if (!(obj instanceof ConcatenatedHashFunction)) goto _L2; else goto _L1
_L1:
            obj = (ConcatenatedHashFunction)obj;
            if (bits == ((ConcatenatedHashFunction) (obj)).bits && functions.length == ((ConcatenatedHashFunction) (obj)).functions.length) goto _L3; else goto _L2
_L2:
            return false;
_L3:
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= functions.length)
                    {
                        break label1;
                    }
                    if (!functions[i].equals(((ConcatenatedHashFunction) (obj)).functions[i]))
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
            if (true) goto _L2; else goto _L4
_L4:
            return true;
        }

        public int hashCode()
        {
            int j = bits;
            HashFunction ahashfunction[] = functions;
            int k = ahashfunction.length;
            for (int i = 0; i < k; i++)
            {
                j ^= ahashfunction[i].hashCode();
            }

            return j;
        }

        HashCode makeHash(Hasher ahasher[])
        {
            byte abyte0[] = new byte[bits / 8];
            int j = 0;
            int k = ahasher.length;
            for (int i = 0; i < k; i++)
            {
                HashCode hashcode = ahasher[i].hash();
                j += hashcode.writeBytesTo(abyte0, j, hashcode.bits() / 8);
            }

            return HashCode.fromBytesNoCopy(abyte0);
        }

        transient ConcatenatedHashFunction(HashFunction ahashfunction[])
        {
            super(ahashfunction);
            int j = 0;
            int k = ahashfunction.length;
            for (int i = 0; i < k; i++)
            {
                j += ahashfunction[i].bits();
            }

            bits = j;
        }
    }

    private static class Crc32Holder
    {

        static final HashFunction CRC_32;

        static 
        {
            CRC_32 = Hashing.checksumHashFunction(ChecksumType.CRC_32, "Hashing.crc32()");
        }

        private Crc32Holder()
        {
        }
    }

    private static final class Crc32cHolder
    {

        static final HashFunction CRC_32_C = new Crc32cHashFunction();


        private Crc32cHolder()
        {
        }
    }

    private static final class LinearCongruentialGenerator
    {

        private long state;

        public double nextDouble()
        {
            state = 0x27bb2ee687b0b0fdL * state + 1L;
            return (double)((int)(state >>> 33) + 1) / 2147483648D;
        }

        public LinearCongruentialGenerator(long l)
        {
            state = l;
        }
    }

    private static class Md5Holder
    {

        static final HashFunction MD5 = new MessageDigestHashFunction("MD5", "Hashing.md5()");


        private Md5Holder()
        {
        }
    }

    private static class Murmur3_128Holder
    {

        static final HashFunction GOOD_FAST_HASH_FUNCTION_128 = Hashing.murmur3_128(Hashing.GOOD_FAST_HASH_SEED);
        static final HashFunction MURMUR3_128 = new Murmur3_128HashFunction(0);


        private Murmur3_128Holder()
        {
        }
    }

    private static class Murmur3_32Holder
    {

        static final HashFunction GOOD_FAST_HASH_FUNCTION_32 = Hashing.murmur3_32(Hashing.GOOD_FAST_HASH_SEED);
        static final HashFunction MURMUR3_32 = new Murmur3_32HashFunction(0);


        private Murmur3_32Holder()
        {
        }
    }

    private static class Sha1Holder
    {

        static final HashFunction SHA_1 = new MessageDigestHashFunction("SHA-1", "Hashing.sha1()");


        private Sha1Holder()
        {
        }
    }

    private static class Sha256Holder
    {

        static final HashFunction SHA_256 = new MessageDigestHashFunction("SHA-256", "Hashing.sha256()");


        private Sha256Holder()
        {
        }
    }

    private static class Sha512Holder
    {

        static final HashFunction SHA_512 = new MessageDigestHashFunction("SHA-512", "Hashing.sha512()");


        private Sha512Holder()
        {
        }
    }

    private static class SipHash24Holder
    {

        static final HashFunction SIP_HASH_24 = new SipHashFunction(2, 4, 0x706050403020100L, 0xf0e0d0c0b0a0908L);


        private SipHash24Holder()
        {
        }
    }


    private static final int GOOD_FAST_HASH_SEED = (int)System.currentTimeMillis();

    private Hashing()
    {
    }

    public static HashFunction adler32()
    {
        return Adler32Holder.ADLER_32;
    }

    static int checkPositiveAndMakeMultipleOf32(int i)
    {
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Number of bits must be positive");
        return i + 31 & 0xffffffe0;
    }

    private static HashFunction checksumHashFunction(ChecksumType checksumtype, String s)
    {
        return new ChecksumHashFunction(checksumtype, checksumtype.bits, s);
    }

    public static HashCode combineOrdered(Iterable iterable)
    {
        Iterator iterator = iterable.iterator();
        Preconditions.checkArgument(iterator.hasNext(), "Must be at least 1 hash code to combine.");
        byte abyte0[] = new byte[((HashCode)iterator.next()).bits() / 8];
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            byte abyte1[] = ((HashCode)iterable.next()).asBytes();
            int i;
            boolean flag;
            if (abyte1.length == abyte0.length)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "All hashcodes must have the same bit length.");
            i = 0;
            while (i < abyte1.length) 
            {
                abyte0[i] = (byte)(abyte0[i] * 37 ^ abyte1[i]);
                i++;
            }
        }

        return HashCode.fromBytesNoCopy(abyte0);
    }

    public static HashCode combineUnordered(Iterable iterable)
    {
        Iterator iterator = iterable.iterator();
        Preconditions.checkArgument(iterator.hasNext(), "Must be at least 1 hash code to combine.");
        byte abyte0[] = new byte[((HashCode)iterator.next()).bits() / 8];
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            byte abyte1[] = ((HashCode)iterable.next()).asBytes();
            int i;
            boolean flag;
            if (abyte1.length == abyte0.length)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "All hashcodes must have the same bit length.");
            i = 0;
            while (i < abyte1.length) 
            {
                abyte0[i] = (byte)(abyte0[i] + abyte1[i]);
                i++;
            }
        }

        return HashCode.fromBytesNoCopy(abyte0);
    }

    public static int consistentHash(long l, int i)
    {
        LinearCongruentialGenerator linearcongruentialgenerator;
        int j;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "buckets must be positive: %s", new Object[] {
            Integer.valueOf(i)
        });
        linearcongruentialgenerator = new LinearCongruentialGenerator(l);
        j = 0;
        do
        {
            int k = (int)((double)(j + 1) / linearcongruentialgenerator.nextDouble());
            if (k >= 0 && k < i)
            {
                j = k;
            } else
            {
                return j;
            }
        } while (true);
    }

    public static int consistentHash(HashCode hashcode, int i)
    {
        return consistentHash(hashcode.padToLong(), i);
    }

    public static HashFunction crc32()
    {
        return Crc32Holder.CRC_32;
    }

    public static HashFunction crc32c()
    {
        return Crc32cHolder.CRC_32_C;
    }

    public static HashFunction goodFastHash(int i)
    {
        i = checkPositiveAndMakeMultipleOf32(i);
        if (i == 32)
        {
            return Murmur3_32Holder.GOOD_FAST_HASH_FUNCTION_32;
        }
        if (i <= 128)
        {
            return Murmur3_128Holder.GOOD_FAST_HASH_FUNCTION_128;
        }
        int k = (i + 127) / 128;
        HashFunction ahashfunction[] = new HashFunction[k];
        ahashfunction[0] = Murmur3_128Holder.GOOD_FAST_HASH_FUNCTION_128;
        int j = GOOD_FAST_HASH_SEED;
        for (i = 1; i < k; i++)
        {
            j += 0x596f0ddf;
            ahashfunction[i] = murmur3_128(j);
        }

        return new ConcatenatedHashFunction(ahashfunction);
    }

    public static HashFunction md5()
    {
        return Md5Holder.MD5;
    }

    public static HashFunction murmur3_128()
    {
        return Murmur3_128Holder.MURMUR3_128;
    }

    public static HashFunction murmur3_128(int i)
    {
        return new Murmur3_128HashFunction(i);
    }

    public static HashFunction murmur3_32()
    {
        return Murmur3_32Holder.MURMUR3_32;
    }

    public static HashFunction murmur3_32(int i)
    {
        return new Murmur3_32HashFunction(i);
    }

    public static HashFunction sha1()
    {
        return Sha1Holder.SHA_1;
    }

    public static HashFunction sha256()
    {
        return Sha256Holder.SHA_256;
    }

    public static HashFunction sha512()
    {
        return Sha512Holder.SHA_512;
    }

    public static HashFunction sipHash24()
    {
        return SipHash24Holder.SIP_HASH_24;
    }

    public static HashFunction sipHash24(long l, long l1)
    {
        return new SipHashFunction(2, 4, l, l1);
    }



}
