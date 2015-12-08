// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Writer;

// Referenced classes of package com.google.common.io:
//            CharStreams

private static final class  extends Writer
{

    private static final sitionIndexes INSTANCE = new <init>();

    public Writer append(char c)
    {
        return this;
    }

    public Writer append(CharSequence charsequence)
    {
        Preconditions.checkNotNull(charsequence);
        return this;
    }

    public Writer append(CharSequence charsequence, int i, int j)
    {
        Preconditions.checkPositionIndexes(i, j, charsequence.length());
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

    public String toString()
    {
        return "CharStreams.nullWriter()";
    }

    public void write(int i)
    {
    }

    public void write(String s)
    {
        Preconditions.checkNotNull(s);
    }

    public void write(String s, int i, int j)
    {
        Preconditions.checkPositionIndexes(i, i + j, s.length());
    }

    public void write(char ac[])
    {
        Preconditions.checkNotNull(ac);
    }

    public void write(char ac[], int i, int j)
    {
        Preconditions.checkPositionIndexes(i, i + j, ac.length);
    }



    private ()
    {
    }
}
