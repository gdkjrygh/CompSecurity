// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

public class CharSequenceInputStream extends InputStream
{

    private final ByteBuffer bbuf;
    private final CharBuffer cbuf;
    private final CharsetEncoder encoder;
    private int mark;

    public CharSequenceInputStream(CharSequence charsequence, String s)
    {
        this(charsequence, s, 2048);
    }

    public CharSequenceInputStream(CharSequence charsequence, String s, int i)
    {
        this(charsequence, Charset.forName(s), i);
    }

    public CharSequenceInputStream(CharSequence charsequence, Charset charset)
    {
        this(charsequence, charset, 2048);
    }

    public CharSequenceInputStream(CharSequence charsequence, Charset charset, int i)
    {
        encoder = charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
        bbuf = ByteBuffer.allocate(i);
        bbuf.flip();
        cbuf = CharBuffer.wrap(charsequence);
        mark = -1;
    }

    private void fillBuffer()
        throws CharacterCodingException
    {
        bbuf.compact();
        CoderResult coderresult = encoder.encode(cbuf, bbuf, true);
        if (coderresult.isError())
        {
            coderresult.throwException();
        }
        bbuf.flip();
    }

    public int available()
        throws IOException
    {
        return cbuf.remaining();
    }

    public void close()
        throws IOException
    {
    }

    public void mark(int i)
    {
        this;
        JVM INSTR monitorenter ;
        mark = cbuf.position();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean markSupported()
    {
        return true;
    }

    public int read()
        throws IOException
    {
        do
        {
            if (bbuf.hasRemaining())
            {
                return bbuf.get() & 0xff;
            }
            fillBuffer();
        } while (bbuf.hasRemaining() || cbuf.hasRemaining());
        return -1;
    }

    public int read(byte abyte0[])
        throws IOException
    {
        return read(abyte0, 0, abyte0.length);
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        byte byte0 = -1;
        if (abyte0 == null)
        {
            throw new NullPointerException("Byte array is null");
        }
        if (j < 0 || i + j > abyte0.length)
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("Array Size=").append(abyte0.length).append(", offset=").append(i).append(", length=").append(j).toString());
        }
        if (j == 0)
        {
            byte0 = 0;
        } else
        if (bbuf.hasRemaining() || cbuf.hasRemaining())
        {
            boolean flag = false;
            int k = i;
            i = ((flag) ? 1 : 0);
label0:
            do
            {
                do
                {
                    if (j <= 0)
                    {
                        break label0;
                    }
                    if (!bbuf.hasRemaining())
                    {
                        break;
                    }
                    int l = Math.min(bbuf.remaining(), j);
                    bbuf.get(abyte0, k, l);
                    k += l;
                    j -= l;
                    i += l;
                } while (true);
                fillBuffer();
            } while (bbuf.hasRemaining() || cbuf.hasRemaining());
            j = i;
            if (i == 0)
            {
                j = i;
                if (!cbuf.hasRemaining())
                {
                    j = -1;
                }
            }
            return j;
        }
        return byte0;
    }

    public void reset()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (mark != -1)
        {
            cbuf.position(mark);
            mark = -1;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public long skip(long l)
        throws IOException
    {
        int i;
        for (i = 0; l > 0L && cbuf.hasRemaining(); i++)
        {
            cbuf.get();
            l--;
        }

        return (long)i;
    }
}
