// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.network;

import java.io.Flushable;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

// Referenced classes of package io.fabric.sdk.android.services.network:
//            HttpRequest

class ushOperation extends ushOperation
{

    final HttpRequest this$0;
    final Reader val$input;
    final Writer val$writer;

    protected HttpRequest run()
        throws IOException
    {
        return copy(val$input, val$writer);
    }

    protected volatile Object run()
        throws tpRequestException, IOException
    {
        return run();
    }

    tpRequestException(Writer writer1)
    {
        this$0 = final_httprequest;
        val$input = Reader.this;
        val$writer = writer1;
        super(final_flushable);
    }
}
