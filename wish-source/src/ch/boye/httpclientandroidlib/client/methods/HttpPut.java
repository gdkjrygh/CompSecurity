// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.methods;

import java.net.URI;

// Referenced classes of package ch.boye.httpclientandroidlib.client.methods:
//            HttpEntityEnclosingRequestBase

public class HttpPut extends HttpEntityEnclosingRequestBase
{

    public static final String METHOD_NAME = "PUT";

    public HttpPut()
    {
    }

    public HttpPut(String s)
    {
        setURI(URI.create(s));
    }

    public HttpPut(URI uri)
    {
        setURI(uri);
    }

    public String getMethod()
    {
        return "PUT";
    }
}
