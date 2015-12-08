// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import okio.BufferedSource;

// Referenced classes of package com.squareup.okhttp:
//            ResponseBody, MediaType

static final class nit> extends ResponseBody
{

    final BufferedSource val$content;
    final long val$contentLength;
    final MediaType val$contentType;

    public long contentLength()
    {
        return val$contentLength;
    }

    public MediaType contentType()
    {
        return val$contentType;
    }

    public BufferedSource source()
    {
        return val$content;
    }

    (MediaType mediatype, long l, BufferedSource bufferedsource)
    {
        val$contentType = mediatype;
        val$contentLength = l;
        val$content = bufferedsource;
        super();
    }
}
