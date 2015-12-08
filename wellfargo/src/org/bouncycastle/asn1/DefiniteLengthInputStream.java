// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.InputStream;
import org.bouncycastle.util.io.Streams;

// Referenced classes of package org.bouncycastle.asn1:
//            LimitedInputStream

class DefiniteLengthInputStream extends LimitedInputStream
{

    private static final byte EMPTY_BYTES[] = new byte[0];
    private final int _originalLength;
    private int _remaining;

    DefiniteLengthInputStream(InputStream inputstream, int i)
    {
        super(inputstream, i);
        if (i < 0)
        {
            throw new IllegalArgumentException("negative lengths not allowed");
        }
        _originalLength = i;
        _remaining = i;
        if (i == 0)
        {
            setParentEofDetect(true);
        }
    }

    int getRemaining()
    {
        return _remaining;
    }

    public int read()
    {
        int i;
        if (_remaining == 0)
        {
            i = -1;
        } else
        {
            int j = _in.read();
            if (j < 0)
            {
                throw new EOFException((new StringBuilder()).append("DEF length ").append(_originalLength).append(" object truncated by ").append(_remaining).toString());
            }
            int k = _remaining - 1;
            _remaining = k;
            i = j;
            if (k == 0)
            {
                setParentEofDetect(true);
                return j;
            }
        }
        return i;
    }

    public int read(byte abyte0[], int i, int j)
    {
        if (_remaining == 0)
        {
            i = -1;
        } else
        {
            j = Math.min(j, _remaining);
            j = _in.read(abyte0, i, j);
            if (j < 0)
            {
                throw new EOFException((new StringBuilder()).append("DEF length ").append(_originalLength).append(" object truncated by ").append(_remaining).toString());
            }
            int k = _remaining - j;
            _remaining = k;
            i = j;
            if (k == 0)
            {
                setParentEofDetect(true);
                return j;
            }
        }
        return i;
    }

    byte[] toByteArray()
    {
        if (_remaining == 0)
        {
            return EMPTY_BYTES;
        }
        byte abyte0[] = new byte[_remaining];
        int i = _remaining - Streams.readFully(_in, abyte0);
        _remaining = i;
        if (i != 0)
        {
            throw new EOFException((new StringBuilder()).append("DEF length ").append(_originalLength).append(" object truncated by ").append(_remaining).toString());
        } else
        {
            setParentEofDetect(true);
            return abyte0;
        }
    }

}
