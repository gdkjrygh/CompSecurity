// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.io;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HttpException;
import ch.boye.httpclientandroidlib.MalformedChunkCodingException;
import ch.boye.httpclientandroidlib.TruncatedChunkException;
import ch.boye.httpclientandroidlib.io.BufferInfo;
import ch.boye.httpclientandroidlib.io.SessionInputBuffer;
import ch.boye.httpclientandroidlib.util.CharArrayBuffer;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.io:
//            AbstractMessageParser

public class ChunkedInputStream extends InputStream
{

    private static final int BUFFER_SIZE = 2048;
    private static final int CHUNK_CRLF = 3;
    private static final int CHUNK_DATA = 2;
    private static final int CHUNK_LEN = 1;
    private final CharArrayBuffer buffer;
    private int chunkSize;
    private boolean closed;
    private boolean eof;
    private Header footers[];
    private final SessionInputBuffer in;
    private int pos;
    private int state;

    public ChunkedInputStream(SessionInputBuffer sessioninputbuffer)
    {
        eof = false;
        closed = false;
        footers = new Header[0];
        if (sessioninputbuffer == null)
        {
            throw new IllegalArgumentException("Session input buffer may not be null");
        } else
        {
            in = sessioninputbuffer;
            pos = 0;
            buffer = new CharArrayBuffer(16);
            state = 1;
            return;
        }
    }

    private int getChunkSize()
        throws IOException
    {
        state;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 93
    //                   2 32
    //                   3 42;
           goto _L1 _L2 _L1 _L3
_L1:
        throw new IllegalStateException("Inconsistent codec state");
_L3:
        buffer.clear();
        if (in.readLine(buffer) != -1) goto _L5; else goto _L4
_L4:
        return 0;
_L5:
        if (!buffer.isEmpty())
        {
            throw new MalformedChunkCodingException("Unexpected content at the end of chunk");
        }
        state = 1;
_L2:
        buffer.clear();
        if (in.readLine(buffer) != -1)
        {
            int j = buffer.indexOf(59);
            int i = j;
            if (j < 0)
            {
                i = buffer.length();
            }
            try
            {
                i = Integer.parseInt(buffer.substringTrimmed(0, i), 16);
            }
            catch (NumberFormatException numberformatexception)
            {
                throw new MalformedChunkCodingException("Bad chunk header");
            }
            return i;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    private void nextChunk()
        throws IOException
    {
        chunkSize = getChunkSize();
        if (chunkSize < 0)
        {
            throw new MalformedChunkCodingException("Negative chunk size");
        }
        state = 2;
        pos = 0;
        if (chunkSize == 0)
        {
            eof = true;
            parseTrailerHeaders();
        }
    }

    private void parseTrailerHeaders()
        throws IOException
    {
        try
        {
            footers = AbstractMessageParser.parseHeaders(in, -1, -1, null);
            return;
        }
        catch (HttpException httpexception)
        {
            MalformedChunkCodingException malformedchunkcodingexception = new MalformedChunkCodingException((new StringBuilder()).append("Invalid footer: ").append(httpexception.getMessage()).toString());
            malformedchunkcodingexception.initCause(httpexception);
            throw malformedchunkcodingexception;
        }
    }

    public int available()
        throws IOException
    {
        if (in instanceof BufferInfo)
        {
            return Math.min(((BufferInfo)in).length(), chunkSize - pos);
        } else
        {
            return 0;
        }
    }

    public void close()
        throws IOException
    {
        if (closed)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        byte abyte0[];
        if (eof)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        abyte0 = new byte[2048];
        int i;
        do
        {
            i = read(abyte0);
        } while (i >= 0);
        eof = true;
        closed = true;
        return;
        Exception exception;
        exception;
        eof = true;
        closed = true;
        throw exception;
    }

    public Header[] getFooters()
    {
        return (Header[])footers.clone();
    }

    public int read()
        throws IOException
    {
        if (closed)
        {
            throw new IOException("Attempted read from closed stream.");
        }
        int i;
        if (eof)
        {
            i = -1;
        } else
        {
            if (state != 2)
            {
                nextChunk();
                if (eof)
                {
                    return -1;
                }
            }
            int j = in.read();
            i = j;
            if (j != -1)
            {
                pos = pos + 1;
                i = j;
                if (pos >= chunkSize)
                {
                    state = 3;
                    return j;
                }
            }
        }
        return i;
    }

    public int read(byte abyte0[])
        throws IOException
    {
        return read(abyte0, 0, abyte0.length);
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        if (closed)
        {
            throw new IOException("Attempted read from closed stream.");
        }
        if (eof)
        {
            i = -1;
        } else
        {
            if (state != 2)
            {
                nextChunk();
                if (eof)
                {
                    return -1;
                }
            }
            j = Math.min(j, chunkSize - pos);
            j = in.read(abyte0, i, j);
            if (j != -1)
            {
                pos = pos + j;
                i = j;
                if (pos >= chunkSize)
                {
                    state = 3;
                    return j;
                }
            } else
            {
                eof = true;
                throw new TruncatedChunkException((new StringBuilder()).append("Truncated chunk ( expected size: ").append(chunkSize).append("; actual size: ").append(pos).append(")").toString());
            }
        }
        return i;
    }
}
