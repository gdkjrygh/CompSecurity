// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.util;


public class BufferRecycler
{

    public static final int DEFAULT_WRITE_CONCAT_BUFFER_LEN = 2000;
    protected final byte _byteBuffers[][] = new byte[ByteBufferType.values().length][];
    protected final char _charBuffers[][] = new char[CharBufferType.values().length][];

    public BufferRecycler()
    {
    /* block-local class not found */
    class ByteBufferType {}

    /* block-local class not found */
    class CharBufferType {}

    }

    private final byte[] balloc(int i)
    {
        return new byte[i];
    }

    private final char[] calloc(int i)
    {
        return new char[i];
    }

    public final byte[] allocByteBuffer(ByteBufferType bytebuffertype)
    {
        int i = bytebuffertype.ordinal();
        byte abyte0[] = _byteBuffers[i];
        if (abyte0 == null)
        {
            return balloc(ByteBufferType.access._mth000(bytebuffertype));
        } else
        {
            _byteBuffers[i] = null;
            return abyte0;
        }
    }

    public final char[] allocCharBuffer(CharBufferType charbuffertype)
    {
        return allocCharBuffer(charbuffertype, 0);
    }

    public final char[] allocCharBuffer(CharBufferType charbuffertype, int i)
    {
        int j = i;
        if (CharBufferType.access._mth100(charbuffertype) > i)
        {
            j = CharBufferType.access._mth100(charbuffertype);
        }
        i = charbuffertype.ordinal();
        charbuffertype = _charBuffers[i];
        if (charbuffertype == null || charbuffertype.length < j)
        {
            return calloc(j);
        } else
        {
            _charBuffers[i] = null;
            return charbuffertype;
        }
    }

    public final void releaseByteBuffer(ByteBufferType bytebuffertype, byte abyte0[])
    {
        _byteBuffers[bytebuffertype.ordinal()] = abyte0;
    }

    public final void releaseCharBuffer(CharBufferType charbuffertype, char ac[])
    {
        _charBuffers[charbuffertype.ordinal()] = ac;
    }
}
