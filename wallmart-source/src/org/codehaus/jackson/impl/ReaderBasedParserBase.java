// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.impl;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.io.IOContext;

// Referenced classes of package org.codehaus.jackson.impl:
//            JsonParserBase

public abstract class ReaderBasedParserBase extends JsonParserBase
{

    protected char _inputBuffer[];
    protected Reader _reader;

    protected ReaderBasedParserBase(IOContext iocontext, int i, Reader reader)
    {
        super(iocontext, i);
        _reader = reader;
        _inputBuffer = iocontext.allocTokenBuffer();
    }

    protected void _closeInput()
        throws IOException
    {
        if (_reader != null)
        {
            if (_ioContext.isResourceManaged() || isEnabled(org.codehaus.jackson.JsonParser.Feature.AUTO_CLOSE_SOURCE))
            {
                _reader.close();
            }
            _reader = null;
        }
    }

    protected final boolean _matchToken(String s, int i)
        throws IOException, JsonParseException
    {
        int k = s.length();
        int j;
        do
        {
            if (_inputPtr >= _inputEnd && !loadMore())
            {
                _reportInvalidEOFInValue();
            }
            if (_inputBuffer[_inputPtr] != s.charAt(i))
            {
                _reportInvalidToken(s.substring(0, i), "'null', 'true', 'false' or NaN");
            }
            _inputPtr = _inputPtr + 1;
            j = i + 1;
            i = j;
        } while (j < k);
        while (_inputPtr >= _inputEnd && !loadMore() || !Character.isJavaIdentifierPart(_inputBuffer[_inputPtr])) 
        {
            return true;
        }
        _inputPtr = _inputPtr + 1;
        _reportInvalidToken(s.substring(0, j), "'null', 'true', 'false' or NaN");
        return true;
    }

    protected void _releaseBuffers()
        throws IOException
    {
        super._releaseBuffers();
        char ac[] = _inputBuffer;
        if (ac != null)
        {
            _inputBuffer = null;
            _ioContext.releaseTokenBuffer(ac);
        }
    }

    protected void _reportInvalidToken(String s, String s1)
        throws IOException, JsonParseException
    {
        s = new StringBuilder(s);
_L5:
        if (_inputPtr < _inputEnd || loadMore()) goto _L2; else goto _L1
_L1:
        char c;
        _reportError((new StringBuilder()).append("Unrecognized token '").append(s.toString()).append("': was expecting ").toString());
        return;
_L2:
        if (!Character.isJavaIdentifierPart(c = _inputBuffer[_inputPtr])) goto _L1; else goto _L3
_L3:
        _inputPtr = _inputPtr + 1;
        s.append(c);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public Object getInputSource()
    {
        return _reader;
    }

    protected char getNextChar(String s)
        throws IOException, JsonParseException
    {
        if (_inputPtr >= _inputEnd && !loadMore())
        {
            _reportInvalidEOF(s);
        }
        s = _inputBuffer;
        int i = _inputPtr;
        _inputPtr = i + 1;
        return s[i];
    }

    protected final boolean loadMore()
        throws IOException
    {
        boolean flag1 = false;
        _currInputProcessed = _currInputProcessed + (long)_inputEnd;
        _currInputRowStart = _currInputRowStart - _inputEnd;
        boolean flag = flag1;
        if (_reader != null)
        {
            int i = _reader.read(_inputBuffer, 0, _inputBuffer.length);
            if (i > 0)
            {
                _inputPtr = 0;
                _inputEnd = i;
                flag = true;
            } else
            {
                _closeInput();
                flag = flag1;
                if (i == 0)
                {
                    throw new IOException((new StringBuilder()).append("Reader returned 0 characters when trying to read ").append(_inputEnd).toString());
                }
            }
        }
        return flag;
    }

    public int releaseBuffered(Writer writer)
        throws IOException
    {
        int i = _inputEnd - _inputPtr;
        if (i < 1)
        {
            return 0;
        } else
        {
            int j = _inputPtr;
            writer.write(_inputBuffer, j, i);
            return i;
        }
    }
}
