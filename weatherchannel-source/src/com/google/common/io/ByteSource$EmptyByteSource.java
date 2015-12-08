// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import java.nio.charset.Charset;

// Referenced classes of package com.google.common.io:
//            ByteSource, CharSource

private static final class rce extends rce
{

    private static final bytes INSTANCE = new <init>();

    public CharSource asCharSource(Charset charset)
    {
        Preconditions.checkNotNull(charset);
        return CharSource.empty();
    }

    public byte[] read()
    {
        return bytes;
    }

    public String toString()
    {
        return "ByteSource.empty()";
    }



    private rce()
    {
        super(new byte[0]);
    }
}
