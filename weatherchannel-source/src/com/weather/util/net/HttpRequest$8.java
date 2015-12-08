// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.net;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

// Referenced classes of package com.weather.util.net:
//            HttpRequest

class oseOperation extends oseOperation
{

    final HttpRequest this$0;
    final Reader val$input;
    final Writer val$output;

    public HttpRequest run()
        throws IOException
    {
        char ac[] = new char[HttpRequest.access$100(HttpRequest.this)];
        do
        {
            int i = val$input.read(ac);
            if (i != -1)
            {
                val$output.write(ac, 0, i);
                HttpRequest.access$202(HttpRequest.this, HttpRequest.access$200(HttpRequest.this) + (long)i);
                HttpRequest.access$400(HttpRequest.this).onUpload(HttpRequest.access$200(HttpRequest.this), -1L);
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

    tpRequestException(Reader reader, Writer writer)
    {
        this$0 = final_httprequest;
        val$input = reader;
        val$output = writer;
        super(final_closeable, Z.this);
    }
}
