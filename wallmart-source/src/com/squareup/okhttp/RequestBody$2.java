// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import java.io.File;
import java.io.IOException;
import okio.BufferedSink;
import okio.Okio;

// Referenced classes of package com.squareup.okhttp:
//            RequestBody, MediaType

static final class nit> extends RequestBody
{

    final MediaType val$contentType;
    final File val$file;

    public long contentLength()
    {
        return val$file.length();
    }

    public MediaType contentType()
    {
        return val$contentType;
    }

    public void writeTo(BufferedSink bufferedsink)
        throws IOException
    {
        okio.Source source = null;
        okio.Source source1 = Okio.source(val$file);
        source = source1;
        bufferedsink.writeAll(source1);
        Util.closeQuietly(source1);
        return;
        bufferedsink;
        Util.closeQuietly(source);
        throw bufferedsink;
    }

    (MediaType mediatype, File file1)
    {
        val$contentType = mediatype;
        val$file = file1;
        super();
    }
}
