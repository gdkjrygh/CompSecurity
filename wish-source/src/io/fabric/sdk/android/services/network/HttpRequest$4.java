// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.network;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.nio.CharBuffer;

// Referenced classes of package io.fabric.sdk.android.services.network:
//            HttpRequest

class oseOperation extends oseOperation
{

    final HttpRequest this$0;
    final Appendable val$appendable;
    final BufferedReader val$reader;

    public HttpRequest run()
        throws IOException
    {
        CharBuffer charbuffer = CharBuffer.allocate(HttpRequest.access$100(HttpRequest.this));
        do
        {
            int i = val$reader.read(charbuffer);
            if (i != -1)
            {
                charbuffer.rewind();
                val$appendable.append(charbuffer, 0, i);
                charbuffer.rewind();
            } else
            {
                return HttpRequest.this;
            }
        } while (true);
    }

    public volatile Object run()
        throws tpRequestException, IOException
    {
        return run();
    }

    tpRequestException(BufferedReader bufferedreader, Appendable appendable1)
    {
        this$0 = final_httprequest;
        val$reader = bufferedreader;
        val$appendable = appendable1;
        super(final_closeable, Z.this);
    }
}
