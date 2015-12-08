// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.methods;

import java.net.URI;

// Referenced classes of package ch.boye.httpclientandroidlib.client.methods:
//            HttpEntityEnclosingRequestBase

public class HttpPost extends HttpEntityEnclosingRequestBase
{

    public static final String METHOD_NAME = "POST";

    public HttpPost()
    {
    }

    public HttpPost(String s)
    {
        setURI(URI.create(s));
    }

    public HttpPost(URI uri)
    {
        setURI(uri);
    }

    public String getMethod()
    {
        return "POST";
    }
}
