// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.NamedRunnable;
import java.io.IOException;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            SpdyConnection, IncomingStreamHandler, SpdyStream

class val.newStream extends NamedRunnable
{

    final val.newStream this$1;
    final SpdyStream val$newStream;

    public void execute()
    {
        try
        {
            SpdyConnection.access$1800(_fld0).receive(val$newStream);
            return;
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
    }

    transient (Object aobj[], SpdyStream spdystream)
    {
        this$1 = final_;
        val$newStream = spdystream;
        super(String.this, aobj);
    }
}
