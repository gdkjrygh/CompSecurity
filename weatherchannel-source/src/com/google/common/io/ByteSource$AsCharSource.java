// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

// Referenced classes of package com.google.common.io:
//            CharSource, ByteSource

private final class <init> extends CharSource
{

    private final Charset charset;
    final ByteSource this$0;

    public Reader openStream()
        throws IOException
    {
        return new InputStreamReader(ByteSource.this.openStream(), charset);
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(Object.this.toString()));
        String s1 = String.valueOf(String.valueOf(charset));
        return (new StringBuilder(s.length() + 15 + s1.length())).append(s).append(".asCharSource(").append(s1).append(")").toString();
    }

    private (Charset charset1)
    {
        this$0 = ByteSource.this;
        super();
        charset = (Charset)Preconditions.checkNotNull(charset1);
    }

    Null(Charset charset1, Null null1)
    {
        this(charset1);
    }
}
