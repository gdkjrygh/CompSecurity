// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

// Referenced classes of package com.google.common.io:
//            CharSink, ByteSink

private final class <init> extends CharSink
{

    private final Charset charset;
    final ByteSink this$0;

    public Writer openStream()
        throws IOException
    {
        return new OutputStreamWriter(ByteSink.this.openStream(), charset);
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(Object.this.toString()));
        String s1 = String.valueOf(String.valueOf(charset));
        return (new StringBuilder(s.length() + 13 + s1.length())).append(s).append(".asCharSink(").append(s1).append(")").toString();
    }

    private (Charset charset1)
    {
        this$0 = ByteSink.this;
        super();
        charset = (Charset)Preconditions.checkNotNull(charset1);
    }

    kNotNull(Charset charset1, kNotNull knotnull)
    {
        this(charset1);
    }
}
