// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

// Referenced classes of package com.google.common.hash:
//            HashFunction, Hasher, HashCode, Funnel, 
//            AbstractHasher, PrimitiveSink

abstract class AbstractNonStreamingHashFunction
    implements HashFunction
{
    private final class BufferingHasher extends AbstractHasher
    {

        static final int BOTTOM_BYTE = 255;
        final ExposedByteArrayOutputStream stream;
        final AbstractNonStreamingHashFunction this$0;

        public HashCode hash()
        {
            return hashBytes(stream.byteArray(), 0, stream.length());
        }

        public Hasher putByte(byte byte0)
        {
            stream.write(byte0);
            return this;
        }

        public volatile PrimitiveSink putByte(byte byte0)
        {
            return putByte(byte0);
        }

        public Hasher putBytes(byte abyte0[])
        {
            try
            {
                stream.write(abyte0);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new RuntimeException(abyte0);
            }
            return this;
        }

        public Hasher putBytes(byte abyte0[], int i, int j)
        {
            stream.write(abyte0, i, j);
            return this;
        }

        public volatile PrimitiveSink putBytes(byte abyte0[])
        {
            return putBytes(abyte0);
        }

        public volatile PrimitiveSink putBytes(byte abyte0[], int i, int j)
        {
            return putBytes(abyte0, i, j);
        }

        public Hasher putChar(char c)
        {
            stream.write(c & 0xff);
            stream.write(c >>> 8 & 0xff);
            return this;
        }

        public volatile PrimitiveSink putChar(char c)
        {
            return putChar(c);
        }

        public Hasher putInt(int i)
        {
            stream.write(i & 0xff);
            stream.write(i >>> 8 & 0xff);
            stream.write(i >>> 16 & 0xff);
            stream.write(i >>> 24 & 0xff);
            return this;
        }

        public volatile PrimitiveSink putInt(int i)
        {
            return putInt(i);
        }

        public Hasher putLong(long l)
        {
            for (int i = 0; i < 64; i += 8)
            {
                stream.write((byte)(int)(l >>> i & 255L));
            }

            return this;
        }

        public volatile PrimitiveSink putLong(long l)
        {
            return putLong(l);
        }

        public Hasher putObject(Object obj, Funnel funnel)
        {
            funnel.funnel(obj, this);
            return this;
        }

        public Hasher putShort(short word0)
        {
            stream.write(word0 & 0xff);
            stream.write(word0 >>> 8 & 0xff);
            return this;
        }

        public volatile PrimitiveSink putShort(short word0)
        {
            return putShort(word0);
        }

        BufferingHasher(int i)
        {
            this$0 = AbstractNonStreamingHashFunction.this;
            super();
            stream = new ExposedByteArrayOutputStream(i);
        }
    }

    private static final class ExposedByteArrayOutputStream extends ByteArrayOutputStream
    {

        byte[] byteArray()
        {
            return buf;
        }

        int length()
        {
            return count;
        }

        ExposedByteArrayOutputStream(int i)
        {
            super(i);
        }
    }


    AbstractNonStreamingHashFunction()
    {
    }

    public HashCode hashBytes(byte abyte0[])
    {
        return hashBytes(abyte0, 0, abyte0.length);
    }

    public HashCode hashInt(int i)
    {
        return newHasher(4).putInt(i).hash();
    }

    public HashCode hashLong(long l)
    {
        return newHasher(8).putLong(l).hash();
    }

    public HashCode hashObject(Object obj, Funnel funnel)
    {
        return newHasher().putObject(obj, funnel).hash();
    }

    public HashCode hashString(CharSequence charsequence, Charset charset)
    {
        return hashBytes(charsequence.toString().getBytes(charset));
    }

    public HashCode hashUnencodedChars(CharSequence charsequence)
    {
        int j = charsequence.length();
        Hasher hasher = newHasher(j * 2);
        for (int i = 0; i < j; i++)
        {
            hasher.putChar(charsequence.charAt(i));
        }

        return hasher.hash();
    }

    public Hasher newHasher()
    {
        return new BufferingHasher(32);
    }

    public Hasher newHasher(int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return new BufferingHasher(i);
    }
}
