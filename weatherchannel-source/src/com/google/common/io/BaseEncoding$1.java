// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.common.io:
//            ByteSink, BaseEncoding, CharSink

class  extends ByteSink
{

    final BaseEncoding this$0;
    final CharSink val$encodedSink;

    public OutputStream openStream()
        throws IOException
    {
        return encodingStream(val$encodedSink.openStream());
    }

    ()
    {
        this$0 = final_baseencoding;
        val$encodedSink = CharSink.this;
        super();
    }
}
