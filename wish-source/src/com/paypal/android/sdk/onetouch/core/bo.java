// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;

final class bo extends HttpEntityWrapper
{

    public bo(HttpEntity httpentity)
    {
        super(httpentity);
    }

    public final InputStream getContent()
    {
        return new GZIPInputStream(wrappedEntity.getContent());
    }

    public final long getContentLength()
    {
        return -1L;
    }
}
