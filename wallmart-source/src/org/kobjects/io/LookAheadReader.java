// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.kobjects.io;

import java.io.IOException;
import java.io.Reader;

public class LookAheadReader extends Reader
{

    char buf[];
    int bufPos;
    int bufValid;
    Reader reader;

    public LookAheadReader(Reader reader1)
    {
        char c;
        if (Runtime.getRuntime().freeMemory() > 0xf4240L)
        {
            c = '\u4000';
        } else
        {
            c = '\200';
        }
        buf = new char[c];
        bufPos = 0;
        bufValid = 0;
        reader = reader1;
    }

    public void close()
        throws IOException
    {
        reader.close();
    }

    public int peek(int i)
        throws IOException
    {
        int j;
        if (i > 127)
        {
            throw new RuntimeException("peek > 127 not supported!");
        }
_L3:
        if (i >= bufValid)
        {
            j = (bufPos + bufValid) % buf.length;
            int k = Math.min(buf.length - j, buf.length - bufValid);
            j = reader.read(buf, j, k);
            if (j == -1)
            {
                return -1;
            }
        } else
        {
            return buf[bufPos + i % buf.length];
        }
        if (true) goto _L2; else goto _L1
_L2:
        bufValid = bufValid + j;
        if (true) goto _L3; else goto _L1
_L1:
    }

    public int read()
        throws IOException
    {
        int i = peek(0);
        if (i != -1)
        {
            int j = bufPos + 1;
            bufPos = j;
            if (j == buf.length)
            {
                bufPos = 0;
            }
            bufValid = bufValid - 1;
        }
        return i;
    }

    public int read(char ac[], int i, int j)
        throws IOException
    {
        if (bufValid == 0 && peek(0) == -1)
        {
            return -1;
        }
        int k = j;
        if (j > bufValid)
        {
            k = bufValid;
        }
        j = k;
        if (k > buf.length - bufPos)
        {
            j = buf.length - bufPos;
        }
        System.arraycopy(buf, bufPos, ac, i, j);
        bufValid = bufValid - j;
        bufPos = bufPos + j;
        if (bufPos > buf.length)
        {
            bufPos = bufPos - buf.length;
        }
        return j;
    }

    public String readLine()
        throws IOException
    {
        String s;
        if (peek(0) == -1)
        {
            s = null;
        } else
        {
            String s1 = readTo("\r\n");
            s = s1;
            if (read() == 13)
            {
                s = s1;
                if (peek(0) == 10)
                {
                    read();
                    return s1;
                }
            }
        }
        return s;
    }

    public String readTo(char c)
        throws IOException
    {
        StringBuffer stringbuffer = new StringBuffer();
        for (; peek(0) != -1 && peek(0) != c; stringbuffer.append((char)read())) { }
        return stringbuffer.toString();
    }

    public String readTo(String s)
        throws IOException
    {
        StringBuffer stringbuffer = new StringBuffer();
        for (; peek(0) != -1 && s.indexOf((char)peek(0)) == -1; stringbuffer.append((char)read())) { }
        return stringbuffer.toString();
    }

    public String readWhile(String s)
        throws IOException
    {
        StringBuffer stringbuffer = new StringBuffer();
        for (; peek(0) != -1 && s.indexOf((char)peek(0)) != -1; stringbuffer.append((char)read())) { }
        return stringbuffer.toString();
    }

    public void skip(String s)
        throws IOException
    {
        new StringBuffer();
        for (; peek(0) != -1 && s.indexOf((char)peek(0)) != -1; read()) { }
    }
}
