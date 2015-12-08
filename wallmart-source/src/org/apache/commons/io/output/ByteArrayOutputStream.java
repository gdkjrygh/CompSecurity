// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.output;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.input.ClosedInputStream;

public class ByteArrayOutputStream extends OutputStream
{

    private static final byte EMPTY_BYTE_ARRAY[] = new byte[0];
    private final List buffers;
    private int count;
    private byte currentBuffer[];
    private int currentBufferIndex;
    private int filledBufferSum;

    public ByteArrayOutputStream()
    {
        this(1024);
    }

    public ByteArrayOutputStream(int i)
    {
        buffers = new ArrayList();
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Negative initial size: ").append(i).toString());
        }
        this;
        JVM INSTR monitorenter ;
        needNewBuffer(i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void needNewBuffer(int i)
    {
        if (currentBufferIndex < buffers.size() - 1)
        {
            filledBufferSum = filledBufferSum + currentBuffer.length;
            currentBufferIndex = currentBufferIndex + 1;
            currentBuffer = (byte[])buffers.get(currentBufferIndex);
            return;
        }
        if (currentBuffer == null)
        {
            filledBufferSum = 0;
        } else
        {
            i = Math.max(currentBuffer.length << 1, i - filledBufferSum);
            filledBufferSum = filledBufferSum + currentBuffer.length;
        }
        currentBufferIndex = currentBufferIndex + 1;
        currentBuffer = new byte[i];
        buffers.add(currentBuffer);
    }

    private InputStream toBufferedInputStream()
    {
        int i = count;
        if (i == 0)
        {
            return new ClosedInputStream();
        }
        ArrayList arraylist = new ArrayList(buffers.size());
        Iterator iterator = buffers.iterator();
        int j;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            byte abyte0[] = (byte[])iterator.next();
            j = Math.min(abyte0.length, i);
            arraylist.add(new ByteArrayInputStream(abyte0, 0, j));
            j = i - j;
            i = j;
        } while (j != 0);
        return new SequenceInputStream(Collections.enumeration(arraylist));
    }

    public static InputStream toBufferedInputStream(InputStream inputstream)
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bytearrayoutputstream.write(inputstream);
        return bytearrayoutputstream.toBufferedInputStream();
    }

    public void close()
        throws IOException
    {
    }

    public void reset()
    {
        this;
        JVM INSTR monitorenter ;
        count = 0;
        filledBufferSum = 0;
        currentBufferIndex = 0;
        currentBuffer = (byte[])buffers.get(currentBufferIndex);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public int size()
    {
        this;
        JVM INSTR monitorenter ;
        int i = count;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public byte[] toByteArray()
    {
        this;
        JVM INSTR monitorenter ;
        int i = count;
        if (i != 0) goto _L2; else goto _L1
_L1:
        byte abyte0[] = EMPTY_BYTE_ARRAY;
_L6:
        this;
        JVM INSTR monitorexit ;
        return abyte0;
_L2:
        byte abyte1[] = new byte[i];
        int j = 0;
        Iterator iterator = buffers.iterator();
_L4:
        abyte0 = abyte1;
        int k;
        if (!iterator.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        abyte0 = (byte[])iterator.next();
        k = Math.min(abyte0.length, i);
        System.arraycopy(abyte0, 0, abyte1, j, k);
        j += k;
        k = i - k;
        i = k;
        if (k != 0) goto _L4; else goto _L3
_L3:
        abyte0 = abyte1;
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public String toString()
    {
        return new String(toByteArray());
    }

    public String toString(String s)
        throws UnsupportedEncodingException
    {
        return new String(toByteArray(), s);
    }

    public int write(InputStream inputstream)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        int k = 0;
        int i;
        int j;
        j = count - filledBufferSum;
        i = inputstream.read(currentBuffer, j, currentBuffer.length - j);
_L2:
        int l;
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        l = k + i;
        j += i;
        count = count + i;
        i = j;
        if (j != currentBuffer.length)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        needNewBuffer(currentBuffer.length);
        i = 0;
        k = inputstream.read(currentBuffer, i, currentBuffer.length - i);
        j = i;
        i = k;
        k = l;
        if (true) goto _L2; else goto _L1
_L1:
        return k;
        inputstream;
        throw inputstream;
    }

    public void write(int i)
    {
        this;
        JVM INSTR monitorenter ;
        int k = count - filledBufferSum;
        int j = k;
        if (k != currentBuffer.length)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        needNewBuffer(count + 1);
        j = 0;
        currentBuffer[j] = (byte)i;
        count = count + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void write(byte abyte0[], int i, int j)
    {
        if (i < 0 || i > abyte0.length || j < 0 || i + j > abyte0.length || i + j < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        if (j == 0)
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        int j1 = count + j;
        int k = j;
        int l = count - filledBufferSum;
_L2:
        if (k <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        int i1;
        i1 = Math.min(k, currentBuffer.length - l);
        System.arraycopy(abyte0, (i + j) - k, currentBuffer, l, i1);
        i1 = k - i1;
        k = i1;
        if (i1 <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        needNewBuffer(j1);
        l = 0;
        k = i1;
        if (true) goto _L2; else goto _L1
_L1:
        count = j1;
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        this;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public void writeTo(OutputStream outputstream)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator;
        int i;
        i = count;
        iterator = buffers.iterator();
_L2:
        int j;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        byte abyte0[] = (byte[])iterator.next();
        j = Math.min(abyte0.length, i);
        outputstream.write(abyte0, 0, j);
        j = i - j;
        i = j;
        if (j != 0) goto _L2; else goto _L1
_L1:
        return;
        outputstream;
        throw outputstream;
    }

}
