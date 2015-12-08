// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// Referenced classes of package com.google.common.hash:
//            AbstractHasher, Funnel, Hasher, PrimitiveSink

abstract class AbstractByteHasher extends AbstractHasher
{

    private final ByteBuffer scratch;

    AbstractByteHasher()
    {
        scratch = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
    }

    private Hasher update(int i)
    {
        update(scratch.array(), 0, i);
        scratch.clear();
        return this;
        Exception exception;
        exception;
        scratch.clear();
        throw exception;
    }

    public Hasher putByte(byte byte0)
    {
        update(byte0);
        return this;
    }

    public volatile PrimitiveSink putByte(byte byte0)
    {
        return putByte(byte0);
    }

    public Hasher putBytes(byte abyte0[])
    {
        Preconditions.checkNotNull(abyte0);
        update(abyte0);
        return this;
    }

    public Hasher putBytes(byte abyte0[], int i, int j)
    {
        Preconditions.checkPositionIndexes(i, i + j, abyte0.length);
        update(abyte0, i, j);
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
        scratch.putChar(c);
        return update(2);
    }

    public volatile PrimitiveSink putChar(char c)
    {
        return putChar(c);
    }

    public Hasher putInt(int i)
    {
        scratch.putInt(i);
        return update(4);
    }

    public volatile PrimitiveSink putInt(int i)
    {
        return putInt(i);
    }

    public Hasher putLong(long l)
    {
        scratch.putLong(l);
        return update(8);
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
        scratch.putShort(word0);
        return update(2);
    }

    public volatile PrimitiveSink putShort(short word0)
    {
        return putShort(word0);
    }

    protected abstract void update(byte byte0);

    protected void update(byte abyte0[])
    {
        update(abyte0, 0, abyte0.length);
    }

    protected void update(byte abyte0[], int i, int j)
    {
        for (int k = i; k < i + j; k++)
        {
            update(abyte0[k]);
        }

    }
}
