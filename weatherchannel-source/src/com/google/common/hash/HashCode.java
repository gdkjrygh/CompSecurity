// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedInts;
import java.io.Serializable;
import java.security.MessageDigest;

public abstract class HashCode
{
    private static final class BytesHashCode extends HashCode
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final byte bytes[];

        public byte[] asBytes()
        {
            return (byte[])bytes.clone();
        }

        public int asInt()
        {
            boolean flag;
            if (bytes.length >= 4)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", new Object[] {
                Integer.valueOf(bytes.length)
            });
            return bytes[0] & 0xff | (bytes[1] & 0xff) << 8 | (bytes[2] & 0xff) << 16 | (bytes[3] & 0xff) << 24;
        }

        public long asLong()
        {
            boolean flag;
            if (bytes.length >= 8)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", new Object[] {
                Integer.valueOf(bytes.length)
            });
            return padToLong();
        }

        public int bits()
        {
            return bytes.length * 8;
        }

        boolean equalsSameBits(HashCode hashcode)
        {
            return MessageDigest.isEqual(bytes, hashcode.getBytesInternal());
        }

        byte[] getBytesInternal()
        {
            return bytes;
        }

        public long padToLong()
        {
            long l = bytes[0] & 0xff;
            for (int i = 1; i < Math.min(bytes.length, 8); i++)
            {
                l |= ((long)bytes[i] & 255L) << i * 8;
            }

            return l;
        }

        void writeBytesToImpl(byte abyte0[], int i, int j)
        {
            System.arraycopy(bytes, 0, abyte0, i, j);
        }

        BytesHashCode(byte abyte0[])
        {
            bytes = (byte[])Preconditions.checkNotNull(abyte0);
        }
    }

    private static final class IntHashCode extends HashCode
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final int hash;

        public byte[] asBytes()
        {
            return (new byte[] {
                (byte)hash, (byte)(hash >> 8), (byte)(hash >> 16), (byte)(hash >> 24)
            });
        }

        public int asInt()
        {
            return hash;
        }

        public long asLong()
        {
            throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
        }

        public int bits()
        {
            return 32;
        }

        boolean equalsSameBits(HashCode hashcode)
        {
            return hash == hashcode.asInt();
        }

        public long padToLong()
        {
            return UnsignedInts.toLong(hash);
        }

        void writeBytesToImpl(byte abyte0[], int i, int j)
        {
            for (int k = 0; k < j; k++)
            {
                abyte0[i + k] = (byte)(hash >> k * 8);
            }

        }

        IntHashCode(int i)
        {
            hash = i;
        }
    }

    private static final class LongHashCode extends HashCode
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final long hash;

        public byte[] asBytes()
        {
            return (new byte[] {
                (byte)(int)hash, (byte)(int)(hash >> 8), (byte)(int)(hash >> 16), (byte)(int)(hash >> 24), (byte)(int)(hash >> 32), (byte)(int)(hash >> 40), (byte)(int)(hash >> 48), (byte)(int)(hash >> 56)
            });
        }

        public int asInt()
        {
            return (int)hash;
        }

        public long asLong()
        {
            return hash;
        }

        public int bits()
        {
            return 64;
        }

        boolean equalsSameBits(HashCode hashcode)
        {
            return hash == hashcode.asLong();
        }

        public long padToLong()
        {
            return hash;
        }

        void writeBytesToImpl(byte abyte0[], int i, int j)
        {
            for (int k = 0; k < j; k++)
            {
                abyte0[i + k] = (byte)(int)(hash >> k * 8);
            }

        }

        LongHashCode(long l)
        {
            hash = l;
        }
    }


    private static final char hexDigits[] = "0123456789abcdef".toCharArray();

    HashCode()
    {
    }

    private static int decode(char c)
    {
        if (c >= '0' && c <= '9')
        {
            return c - 48;
        }
        if (c >= 'a' && c <= 'f')
        {
            return (c - 97) + 10;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder(32)).append("Illegal hexadecimal character: ").append(c).toString());
        }
    }

    public static HashCode fromBytes(byte abyte0[])
    {
        boolean flag = true;
        if (abyte0.length < 1)
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "A HashCode must contain at least 1 byte.");
        return fromBytesNoCopy((byte[])abyte0.clone());
    }

    static HashCode fromBytesNoCopy(byte abyte0[])
    {
        return new BytesHashCode(abyte0);
    }

    public static HashCode fromInt(int i)
    {
        return new IntHashCode(i);
    }

    public static HashCode fromLong(long l)
    {
        return new LongHashCode(l);
    }

    public static HashCode fromString(String s)
    {
        byte abyte0[];
        boolean flag;
        if (s.length() >= 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "input string (%s) must have at least 2 characters", new Object[] {
            s
        });
        if (s.length() % 2 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "input string (%s) must have an even number of characters", new Object[] {
            s
        });
        abyte0 = new byte[s.length() / 2];
        for (int i = 0; i < s.length(); i += 2)
        {
            int j = decode(s.charAt(i));
            int k = decode(s.charAt(i + 1));
            abyte0[i / 2] = (byte)((j << 4) + k);
        }

        return fromBytesNoCopy(abyte0);
    }

    public abstract byte[] asBytes();

    public abstract int asInt();

    public abstract long asLong();

    public abstract int bits();

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof HashCode)
        {
            obj = (HashCode)obj;
            flag = flag1;
            if (bits() == ((HashCode) (obj)).bits())
            {
                flag = flag1;
                if (equalsSameBits(((HashCode) (obj))))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    abstract boolean equalsSameBits(HashCode hashcode);

    byte[] getBytesInternal()
    {
        return asBytes();
    }

    public final int hashCode()
    {
        if (bits() < 32) goto _L2; else goto _L1
_L1:
        int k = asInt();
_L4:
        return k;
_L2:
        byte abyte0[] = asBytes();
        int i = abyte0[0] & 0xff;
        int j = 1;
        do
        {
            k = i;
            if (j >= abyte0.length)
            {
                continue;
            }
            i |= (abyte0[j] & 0xff) << j * 8;
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public abstract long padToLong();

    public final String toString()
    {
        byte abyte0[] = asBytes();
        StringBuilder stringbuilder = new StringBuilder(abyte0.length * 2);
        int j = abyte0.length;
        for (int i = 0; i < j; i++)
        {
            byte byte0 = abyte0[i];
            stringbuilder.append(hexDigits[byte0 >> 4 & 0xf]).append(hexDigits[byte0 & 0xf]);
        }

        return stringbuilder.toString();
    }

    public int writeBytesTo(byte abyte0[], int i, int j)
    {
        j = Ints.min(new int[] {
            j, bits() / 8
        });
        Preconditions.checkPositionIndexes(i, i + j, abyte0.length);
        writeBytesToImpl(abyte0, i, j);
        return j;
    }

    abstract void writeBytesToImpl(byte abyte0[], int i, int j);

}
