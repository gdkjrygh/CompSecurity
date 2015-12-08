// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.output;

import java.io.IOException;
import java.io.Writer;

public class NullWriter extends Writer
{

    public static final NullWriter NULL_WRITER = new NullWriter();

    public NullWriter()
    {
    }

    public Writer append(char c)
    {
        return this;
    }

    public Writer append(CharSequence charsequence)
    {
        return this;
    }

    public Writer append(CharSequence charsequence, int i, int j)
    {
        return this;
    }

    public volatile Appendable append(char c)
        throws IOException
    {
        return append(c);
    }

    public volatile Appendable append(CharSequence charsequence)
        throws IOException
    {
        return append(charsequence);
    }

    public volatile Appendable append(CharSequence charsequence, int i, int j)
        throws IOException
    {
        return append(charsequence, i, j);
    }

    public void close()
    {
    }

    public void flush()
    {
    }

    public void write(int i)
    {
    }

    public void write(String s)
    {
    }

    public void write(String s, int i, int j)
    {
    }

    public void write(char ac[])
    {
    }

    public void write(char ac[], int i, int j)
    {
    }

}
