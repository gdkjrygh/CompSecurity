// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.output;

import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;

public class StringBuilderWriter extends Writer
    implements Serializable
{

    private final StringBuilder builder;

    public StringBuilderWriter()
    {
        builder = new StringBuilder();
    }

    public StringBuilderWriter(int i)
    {
        builder = new StringBuilder(i);
    }

    public StringBuilderWriter(StringBuilder stringbuilder)
    {
        if (stringbuilder == null)
        {
            stringbuilder = new StringBuilder();
        }
        builder = stringbuilder;
    }

    public Writer append(char c)
    {
        builder.append(c);
        return this;
    }

    public Writer append(CharSequence charsequence)
    {
        builder.append(charsequence);
        return this;
    }

    public Writer append(CharSequence charsequence, int i, int j)
    {
        builder.append(charsequence, i, j);
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

    public StringBuilder getBuilder()
    {
        return builder;
    }

    public String toString()
    {
        return builder.toString();
    }

    public void write(String s)
    {
        if (s != null)
        {
            builder.append(s);
        }
    }

    public void write(char ac[], int i, int j)
    {
        if (ac != null)
        {
            builder.append(ac, i, j);
        }
    }
}
