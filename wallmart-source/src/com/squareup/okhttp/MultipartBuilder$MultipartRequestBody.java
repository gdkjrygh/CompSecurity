// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.util.List;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

// Referenced classes of package com.squareup.okhttp:
//            RequestBody, MultipartBuilder, MediaType, Headers

private static final class partBodies extends RequestBody
{

    private final ByteString boundary;
    private long contentLength;
    private final MediaType contentType;
    private final List partBodies;
    private final List partHeaders;

    private long writeOrCountBytes(BufferedSink bufferedsink, boolean flag)
        throws IOException
    {
        Buffer buffer;
        int i;
        int k;
        long l1;
        l1 = 0L;
        buffer = null;
        if (flag)
        {
            buffer = new Buffer();
            bufferedsink = buffer;
        }
        i = 0;
        k = partHeaders.size();
_L3:
        long l2;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_328;
        }
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
        l2 = requestbody.contentLength();
        if (l2 == -1L) goto _L2; else goto _L1
_L1:
        bufferedsink.writeUtf8("Content-Length: ").writeDecimalLong(l2).write(MultipartBuilder.access$100());
_L5:
        bufferedsink.write(MultipartBuilder.access$100());
        if (flag)
        {
            l1 += l2;
        } else
        {
            ((RequestBody)partBodies.get(i)).writeTo(bufferedsink);
        }
        bufferedsink.write(MultipartBuilder.access$100());
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        if (!flag) goto _L5; else goto _L4
_L4:
        buffer.clear();
        return -1L;
        bufferedsink.write(MultipartBuilder.access$000());
        bufferedsink.write(boundary);
        bufferedsink.write(MultipartBuilder.access$000());
        bufferedsink.write(MultipartBuilder.access$100());
        long l3 = l1;
        if (flag)
        {
            l3 = l1 + buffer.size();
            buffer.clear();
        }
        return l3;
    }

    public long contentLength()
        throws IOException
    {
        long l = contentLength;
        if (l != -1L)
        {
            return l;
        } else
        {
            long l1 = writeOrCountBytes(null, true);
            contentLength = l1;
            return l1;
        }
    }

    public MediaType contentType()
    {
        return contentType;
    }

    public void writeTo(BufferedSink bufferedsink)
        throws IOException
    {
        writeOrCountBytes(bufferedsink, false);
    }

    public (MediaType mediatype, ByteString bytestring, List list, List list1)
    {
        contentLength = -1L;
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
