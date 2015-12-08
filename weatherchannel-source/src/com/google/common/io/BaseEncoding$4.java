// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.IOException;

// Referenced classes of package com.google.common.io:
//            BaseEncoding

static final class val.afterEveryChars
    implements CharOutput
{

    int charsUntilSeparator;
    final int val$afterEveryChars;
    final CharOutput val$delegate;
    final String val$separator;

    public void close()
        throws IOException
    {
        val$delegate.close();
    }

    public void flush()
        throws IOException
    {
        val$delegate.flush();
    }

    public void write(char c)
        throws IOException
    {
        if (charsUntilSeparator == 0)
        {
            for (int i = 0; i < val$separator.length(); i++)
            {
                val$delegate.write(val$separator.charAt(i));
            }

            charsUntilSeparator = val$afterEveryChars;
        }
        val$delegate.write(c);
        charsUntilSeparator = charsUntilSeparator - 1;
    }

    CharOutput(int i, String s, CharOutput charoutput)
    {
        val$afterEveryChars = i;
        val$separator = s;
        val$delegate = charoutput;
        super();
        charsUntilSeparator = val$afterEveryChars;
    }
}
