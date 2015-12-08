// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

public class ReaderInputStream extends InputStream
{

    private static final int DEFAULT_BUFFER_SIZE = 1024;
    private final CharsetEncoder encoder;
    private final CharBuffer encoderIn;
    private final ByteBuffer encoderOut;
    private boolean endOfInput;
    private CoderResult lastCoderResult;
    private final Reader reader;

    public ReaderInputStream(Reader reader1)
    {
        this(reader1, Charset.defaultCharset());
    }

    public ReaderInputStream(Reader reader1, String s)
    {
        this(reader1, s, 1024);
    }

    public ReaderInputStream(Reader reader1, String s, int i)
    {
        this(reader1, Charset.forName(s), i);
    }

    public ReaderInputStream(Reader reader1, Charset charset)
    {
        this(reader1, charset, 1024);
    }

    public ReaderInputStream(Reader reader1, Charset charset, int i)
    {
        this(reader1, charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE), i);
    }

    public ReaderInputStream(Reader reader1, CharsetEncoder charsetencoder)
    {
        this(reader1, charsetencoder, 1024);
    }

    public ReaderInputStream(Reader reader1, CharsetEncoder charsetencoder, int i)
    {
        reader = reader1;
        encoder = charsetencoder;
        encoderIn = CharBuffer.allocate(i);
        encoderIn.flip();
        encoderOut = ByteBuffer.allocate(128);
        encoderOut.flip();
    }

    private void fillBuffer()
        throws IOException
    {
        if (!endOfInput && (lastCoderResult == null || lastCoderResult.isUnderflow()))
        {
            encoderIn.compact();
            int i = encoderIn.position();
            int j = reader.read(encoderIn.array(), i, encoderIn.remaining());
            if (j == -1)
            {
                endOfInput = true;
            } else
            {
                encoderIn.position(i + j);
            }
            encoderIn.flip();
        }
        encoderOut.compact();
        lastCoderResult = encoder.encode(encoderIn, encoderOut, endOfInput);
        encoderOut.flip();
    }

    public void close()
        throws IOException
    {
        reader.close();
    }

    public int read()
        throws IOException
    {
        do
        {
            if (encoderOut.hasRemaining())
            {
                return encoderOut.get() & 0xff;
            }
            fillBuffer();
        } while (!endOfInput || encoderOut.hasRemaining());
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
        if (abyte0 == null)
        {
            throw new NullPointerException("Byte array must not be null");
        }
        if (j < 0 || i < 0 || i + j > abyte0.length)
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("Array Size=").append(abyte0.length).append(", offset=").append(i).append(", length=").append(j).toString());
        }
        int k = 0;
        int l = j;
        if (j == 0)
        {
            return 0;
        }
label0:
        do
        {
            do
            {
                if (l <= 0)
                {
                    break label0;
                }
                if (!encoderOut.hasRemaining())
                {
                    break;
                }
                j = Math.min(encoderOut.remaining(), l);
                encoderOut.get(abyte0, i, j);
                i += j;
                l -= j;
                k += j;
            } while (true);
            fillBuffer();
        } while (!endOfInput || encoderOut.hasRemaining());
        if (k == 0 && endOfInput)
        {
            return -1;
        } else
        {
            return k;
        }
    }
}
