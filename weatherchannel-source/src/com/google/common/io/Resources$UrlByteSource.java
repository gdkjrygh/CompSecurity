// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

// Referenced classes of package com.google.common.io:
//            ByteSource, Resources

private static final class <init> extends ByteSource
{

    private final URL url;

    public InputStream openStream()
        throws IOException
    {
        return url.openStream();
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(url));
        return (new StringBuilder(s.length() + 24)).append("Resources.asByteSource(").append(s).append(")").toString();
    }

    private (URL url1)
    {
        url = (URL)Preconditions.checkNotNull(url1);
    }

    Null(URL url1, Null null1)
    {
        this(url1);
    }
}
