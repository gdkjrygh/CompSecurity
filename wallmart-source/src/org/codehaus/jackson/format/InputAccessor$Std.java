// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.format;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.codehaus.jackson.JsonFactory;

// Referenced classes of package org.codehaus.jackson.format:
//            InputAccessor, DataFormatMatcher, MatchStrength

public static class _bufferedAmount
    implements InputAccessor
{

    protected final byte _buffer[];
    protected int _bufferedAmount;
    protected final InputStream _in;
    protected int _ptr;

    public DataFormatMatcher createMatcher(JsonFactory jsonfactory, MatchStrength matchstrength)
    {
        return new DataFormatMatcher(_in, _buffer, _bufferedAmount, jsonfactory, matchstrength);
    }

    public boolean hasMoreBytes()
        throws IOException
    {
        if (_ptr < _bufferedAmount)
        {
            return true;
        }
        int i = _buffer.length - _ptr;
        if (i < 1)
        {
            return false;
        }
        i = _in.read(_buffer, _ptr, i);
        if (i <= 0)
        {
            return false;
        } else
        {
            _bufferedAmount = _bufferedAmount + i;
            return true;
        }
    }

    public byte nextByte()
        throws IOException
    {
        if (_ptr > -_bufferedAmount && !hasMoreBytes())
        {
            throw new EOFException((new StringBuilder()).append("Could not read more than ").append(_ptr).append(" bytes (max buffer size: ").append(_buffer.length).append(")").toString());
        } else
        {
            byte abyte0[] = _buffer;
            int i = _ptr;
            _ptr = i + 1;
            return abyte0[i];
        }
    }

    public void reset()
    {
        _ptr = 0;
    }

    public (InputStream inputstream, byte abyte0[])
    {
        _in = inputstream;
        _buffer = abyte0;
        _bufferedAmount = 0;
    }

    public _bufferedAmount(byte abyte0[])
    {
        _in = null;
        _buffer = abyte0;
        _bufferedAmount = abyte0.length;
    }
}
