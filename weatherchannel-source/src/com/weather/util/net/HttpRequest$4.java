// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.net;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.weather.util.net:
//            HttpRequest

class oseOperation extends oseOperation
{

    final HttpRequest this$0;
    final OutputStream val$outputStream;

    protected HttpRequest run()
        throws tpRequestException, IOException
    {
        return receive(val$outputStream);
    }

    protected volatile Object run()
        throws tpRequestException, IOException
    {
        return run();
    }

    tpRequestException(boolean flag, OutputStream outputstream)
    {
        this$0 = final_httprequest;
        val$outputStream = outputstream;
        super(Closeable.this, flag);
    }
}
