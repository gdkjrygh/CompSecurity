// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.methods;

import java.net.URI;

// Referenced classes of package ch.boye.httpclientandroidlib.client.methods:
//            HttpRequestBase

public class HttpGet extends HttpRequestBase
{

    public static final String METHOD_NAME = "GET";

    public HttpGet()
    {
    }

    public HttpGet(String s)
    {
        setURI(URI.create(s));
    }

    public HttpGet(URI uri)
    {
        setURI(uri);
    }

    public String getMethod()
    {
        return "GET";
    }
}
