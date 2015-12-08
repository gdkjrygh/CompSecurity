// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.common.hash:
//            AbstractStreamingHashFunction, Hasher, HashCode

final class SipHashFunction extends AbstractStreamingHashFunction
    implements Serializable
{
    private static final class SipHasher extends AbstractStreamingHashFunction.AbstractStreamingHasher
    {

        private static final int CHUNK_SIZE = 8;
        private long b;
        private final int c;
        private final int d;
        private long finalM;
        private long v0;
        private long v1;
        private long v2;
        private long v3;

        private void processM(long l)
        {
            v3 = v3 ^ l;
            sipRound(c);
            v0 = v0 ^ l;
        }

        private void sipRound(int i)
        {
            for (int j = 0; j < i; j++)
            {
                v0 = v0 + v1;
                v2 = v2 + v3;
                v1 = Long.rotateLeft(v1, 13);
                v3 = Long.rotateLeft(v3, 16);
                v1 = v1 ^ v0;
                v3 = v3 ^ v2;
                v0 = Long.rotateLeft(v0, 32);
                v2 = v2 + v1;
                v0 = v0 + v3;
                v1 = Long.rotateLeft(v1, 17);
                v3 = Long.rotateLeft(v3, 21);
                v1 = v1 ^ v2;
                v3 = v3 ^ v0;
                v2 = Long.rotateLeft(v2, 32);
            }

        }

        public HashCode makeHash()
        {
            finalM = finalM ^ b << 56;
            processM(finalM);
            v2 = v2 ^ 255L;
            sipRound(d);
            return HashCode.fromLong(v0 ^ v1 ^ v2 ^ v3);
        }

        protected void process(ByteBuffer bytebuffer)
        {
            b = b + 8L;
            processM(bytebuffer.getLong());
        }

        protected void processRemaining(ByteBuffer bytebuffer)
        {
            b = b + (long)bytebuffer.remaining();
            for (int i = 0; bytebuffer.hasRemaining(); i += 8)
            {
                finalM = finalM ^ ((long)bytebuffer.get() & 255L) << i;
            }

        }

        SipHasher(int i, int j, long l, long l1)
        {
            super(8);
            v0 = 0x736f6d6570736575L;
            v1 = 0x646f72616e646f6dL;
            v2 = 0x6c7967656e657261L;
            v3 = 0x7465646279746573L;
            b = 0L;
            finalM = 0L;
            c = i;
            d = j;
            v0 = v0 ^ l;
            v1 = v1 ^ l1;
            v2 = v2 ^ l;
            v3 = v3 ^ l1;
        }
    }


    private static final long serialVersionUID = 0L;
    private final int c;
    private final int d;
    private final long k0;
    private final long k1;

    SipHashFunction(int i, int j, long l, long l1)
    {
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "The number of SipRound iterations (c=%s) during Compression must be positive.", new Object[] {
            Integer.valueOf(i)
        });
        if (j > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "The number of SipRound iterations (d=%s) during Finalization must be positive.", new Object[] {
            Integer.valueOf(j)
        });
        c = i;
        d = j;
        k0 = l;
        k1 = l1;
    }

    public int bits()
    {
        return 64;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof SipHashFunction)
        {
            obj = (SipHashFunction)obj;
            flag = flag1;
            if (c == ((SipHashFunction) (obj)).c)
            {
                flag = flag1;
                if (d == ((SipHashFunction) (obj)).d)
                {
                    flag = flag1;
                    if (k0 == ((SipHashFunction) (obj)).k0)
                    {
                        flag = flag1;
                        if (k1 == ((SipHashFunction) (obj)).k1)
                        {
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (int)((long)(getClass().hashCode() ^ c ^ d) ^ k0 ^ k1);
    }

    public Hasher newHasher()
    {
        return new SipHasher(c, d, k0, k1);
    }

    public String toString()
    {
        int i = c;
        int j = d;
        long l = k0;
        long l1 = k1;
        return (new StringBuilder(81)).append("Hashing.sipHash").append(i).append(j).append("(").append(l).append(", ").append(l1).append(")").toString();
    }
}
