// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.util.List;
import okio.BufferedSink;
import okio.ByteString;

// Referenced classes of package com.squareup.okhttp:
//            RequestBody, MultipartBuilder, MediaType, Headers

private static final class partBodies extends RequestBody
{

    private final ByteString boundary;
    private final MediaType contentType;
    private final List partBodies;
    private final List partHeaders;

    public long contentLength()
        throws IOException
    {
        return -1L;
    }

    public MediaType contentType()
    {
        return contentType;
    }

    public void writeTo(BufferedSink bufferedsink)
        throws IOException
    {
        int i = 0;
        for (int k = partHeaders.size(); i < k; i++)
        {
            Object obj = (Headers)partHeaders.get(i);
            RequestBody requestbody = (RequestBody)partBodies.get(i);
            bufferedsink.write(MultipartBuilder.access$000());
            bufferedsink.write(boundary);
            bufferedsink.write(MultipartBuilder.access$100());
            if (obj != null)
            {
                int j = 0;
                for (int l = ((Headers) (obj)).size(); j < l; j++)
                {
                    bufferedsink.writeUtf8(((Headers) (obj)).name(j)).write(MultipartBuilder.access$200()).writeUtf8(((Headers) (obj)).value(j)).write(MultipartBuilder.access$100());
                }

            }
            obj = requestbody.contentType();
            if (obj != null)
            {
                bufferedsink.writeUtf8("Content-Type: ").writeUtf8(((MediaType) (obj)).toString()).write(MultipartBuilder.access$100());
            }
            long l1 = requestbody.contentLength();
            if (l1 != -1L)
            {
                bufferedsink.writeUtf8("Content-Length: ").writeUtf8(Long.toString(l1)).write(MultipartBuilder.access$100());
            }
            bufferedsink.write(MultipartBuilder.access$100());
            ((RequestBody)partBodies.get(i)).writeTo(bufferedsink);
            bufferedsink.write(MultipartBuilder.access$100());
        }

        bufferedsink.write(MultipartBuilder.access$000());
        bufferedsink.write(boundary);
        bufferedsink.write(MultipartBuilder.access$000());
        bufferedsink.write(MultipartBuilder.access$100());
    }

    public (MediaType mediatype, ByteString bytestring, List list, List list1)
    {
        if (mediatype == null)
        {
            throw new NullPointerException("type == null");
        } else
        {
            boundary = bytestring;
            contentType = MediaType.parse((new StringBuilder()).append(mediatype).append("; boundary=").append(bytestring.utf8()).toString());
            partHeaders = Util.immutableList(list);
            partBodies = Util.immutableList(list1);
            return;
        }
    }
}
