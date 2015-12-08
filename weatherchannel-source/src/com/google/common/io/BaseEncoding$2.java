// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.common.io:
//            ByteSource, BaseEncoding, CharSource

class t> extends ByteSource
{

    final BaseEncoding this$0;
    final CharSource val$encodedSource;

    public InputStream openStream()
        throws IOException
    {
        return decodingStream(val$encodedSource.openStream());
    }

    ()
    {
        this$0 = final_baseencoding;
        val$encodedSource = CharSource.this;
        super();
    }
}
