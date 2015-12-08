// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

public class WriterOutputStream extends OutputStream
{

    private static final int DEFAULT_BUFFER_SIZE = 1024;
    private final CharsetDecoder decoder;
    private final ByteBuffer decoderIn;
    private final CharBuffer decoderOut;
    private final boolean writeImmediately;
    private final Writer writer;

    public WriterOutputStream(Writer writer1)
    {
        this(writer1, Charset.defaultCharset(), 1024, false);
    }

    public WriterOutputStream(Writer writer1, String s)
    {
        this(writer1, s, 1024, false);
    }

    public WriterOutputStream(Writer writer1, String s, int i, boolean flag)
    {
        this(writer1, Charset.forName(s), i, flag);
    }

    public WriterOutputStream(Writer writer1, Charset charset)
    {
        this(writer1, charset, 1024, false);
    }

    public WriterOutputStream(Writer writer1, Charset charset, int i, boolean flag)
    {
        this(writer1, charset.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).replaceWith("?"), i, flag);
    }

    public WriterOutputStream(Writer writer1, CharsetDecoder charsetdecoder)
    {
        this(writer1, charsetdecoder, 1024, false);
    }

    public WriterOutputStream(Writer writer1, CharsetDecoder charsetdecoder, int i, boolean flag)
    {
        decoderIn = ByteBuffer.allocate(128);
        writer = writer1;
        decoder = charsetdecoder;
        writeImmediately = flag;
        decoderOut = CharBuffer.allocate(i);
    }

    private void flushOutput()
        throws IOException
    {
        if (decoderOut.position() > 0)
        {
            writer.write(decoderOut.array(), 0, decoderOut.position());
            decoderOut.rewind();
        }
    }

    private void processInput(boolean flag)
        throws IOException
    {
        decoderIn.flip();
        CoderResult coderresult;
        do
        {
            coderresult = decoder.decode(decoderIn, decoderOut, flag);
            if (!coderresult.isOverflow())
            {
                break;
            }
            flushOutput();
        } while (true);
        if (coderresult.isUnderflow())
        {
            decoderIn.compact();
            return;
        } else
        {
            throw new IOException("Unexpected coder result");
        }
    }

    public void close()
        throws IOException
    {
        processInput(true);
        flushOutput();
        writer.close();
    }

    public void flush()
        throws IOException
    {
        flushOutput();
        writer.flush();
    }

    public void write(int i)
        throws IOException
    {
        write(new byte[] {
            (byte)i
        }, 0, 1);
    }

    public void write(byte abyte0[])
        throws IOException
    {
        write(abyte0, 0, abyte0.length);
    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        while (j > 0) 
        {
            int k = Math.min(j, decoderIn.remaining());
            decoderIn.put(abyte0, i, k);
            processInput(false);
            j -= k;
            i += k;
        }
        if (writeImmediately)
        {
            flushOutput();
        }
    }
}
