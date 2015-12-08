// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.net;

import com.google.common.base.Preconditions;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.OkUrlFactory;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

public class OkConnectionFactory
    implements HttpRequest.ConnectionFactory
{

    private final OkUrlFactory okUrlFactory;

    public OkConnectionFactory(OkHttpClient okhttpclient)
    {
        okUrlFactory = new OkUrlFactory((OkHttpClient)Preconditions.checkNotNull(okhttpclient));
    }

    public HttpURLConnection create(URL url)
        throws IOException
    {
        return okUrlFactory.open(url);
    }

    public HttpURLConnection create(URL url, Proxy proxy)
        throws IOException
    {
        throw new UnsupportedOperationException("Per-connection proxy is not supported. Use OkHttpClient's setProxy instead.");
    }
}
