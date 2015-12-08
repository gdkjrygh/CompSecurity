// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

final class CharSequenceReader extends Reader
{

    private int mark;
    private int pos;
    private CharSequence seq;

    public CharSequenceReader(CharSequence charsequence)
    {
        seq = (CharSequence)Preconditions.checkNotNull(charsequence);
    }

    private void checkOpen()
        throws IOException
    {
        if (seq == null)
        {
            throw new IOException("reader closed");
        } else
        {
            return;
        }
    }

    private boolean hasRemaining()
    {
        return remaining() > 0;
    }

    private int remaining()
    {
        return seq.length() - pos;
    }

    public void close()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        seq = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void mark(int i)
        throws IOException
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (i < 0)
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "readAheadLimit (%s) may not be negative", new Object[] {
            Integer.valueOf(i)
        });
        checkOpen();
        mark = pos;
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
        this;
        JVM INSTR monitorenter ;
        checkOpen();
        if (!hasRemaining()) goto _L2; else goto _L1
_L1:
        int i;
        CharSequence charsequence = seq;
        i = pos;
        pos = i + 1;
        i = charsequence.charAt(i);
_L4:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        i = -1;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public int read(CharBuffer charbuffer)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        Preconditions.checkNotNull(charbuffer);
        checkOpen();
        flag = hasRemaining();
        if (flag) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return j;
_L2:
        int l = Math.min(charbuffer.remaining(), remaining());
        int i = 0;
_L5:
        j = l;
        if (i >= l) goto _L4; else goto _L3
_L3:
        CharSequence charsequence = seq;
        int k = pos;
        pos = k + 1;
        charbuffer.put(charsequence.charAt(k));
        i++;
          goto _L5
        charbuffer;
        throw charbuffer;
    }

    public int read(char ac[], int i, int j)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        Preconditions.checkPositionIndexes(i, i + j, ac.length);
        checkOpen();
        flag = hasRemaining();
        if (flag) goto _L2; else goto _L1
_L1:
        int k = -1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return k;
_L2:
        int i1 = Math.min(j, remaining());
        j = 0;
_L5:
        k = i1;
        if (j >= i1) goto _L4; else goto _L3
_L3:
        CharSequence charsequence = seq;
        int l = pos;
        pos = l + 1;
        ac[i + j] = charsequence.charAt(l);
        j++;
          goto _L5
        ac;
        throw ac;
    }

    public boolean ready()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        checkOpen();
        this;
        JVM INSTR monitorexit ;
        return true;
        Exception exception;
        exception;
        throw exception;
    }

    public void reset()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        checkOpen();
        pos = mark;
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
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        int i;
        if (l < 0L)
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "n (%s) may not be negative", new Object[] {
            Long.valueOf(l)
        });
        checkOpen();
        i = (int)Math.min(remaining(), l);
        pos = pos + i;
        l = i;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }
}
