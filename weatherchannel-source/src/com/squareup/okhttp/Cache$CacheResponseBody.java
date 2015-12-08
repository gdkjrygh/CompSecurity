// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.io.IOException;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

// Referenced classes of package com.squareup.okhttp:
//            ResponseBody, Cache, MediaType

private static class apshot extends ResponseBody
{

    private final BufferedSource bodySource;
    private final String contentLength;
    private final String contentType;
    private final com.squareup.okhttp.internal.e snapshot;

    public long contentLength()
    {
        long l = -1L;
        try
        {
            if (contentLength != null)
            {
                l = Long.parseLong(contentLength);
            }
        }
        catch (NumberFormatException numberformatexception)
        {
            return -1L;
        }
        return l;
    }

    public MediaType contentType()
    {
        if (contentType != null)
        {
            return MediaType.parse(contentType);
        } else
        {
            return null;
        }
    }

    public BufferedSource source()
    {
        return bodySource;
    }


    public apshot(com.squareup.okhttp.internal.pshot pshot, String s, String s1)
    {
        snapshot = pshot;
        contentType = s;
        contentLength = s1;
        bodySource = Okio.buffer(new ForwardingSource(pshot) {

            final Cache.CacheResponseBody this$0;
            final com.squareup.okhttp.internal.DiskLruCache.Snapshot val$snapshot;

            public void close()
                throws IOException
            {
                snapshot.close();
                super.close();
            }

            
            {
                this$0 = Cache.CacheResponseBody.this;
                snapshot = snapshot1;
                super(final_source1);
            }
        });
    }
}
