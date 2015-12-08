// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.HttpMethod;
import java.net.URL;

// Referenced classes of package com.squareup.okhttp:
//            Request, Headers, CacheControl, RequestBody

public static class <init>
{

    private RequestBody body;
    private urlString headers;
    private String method;
    private Object tag;
    private URL url;
    private String urlString;

    public <init> addHeader(String s, String s1)
    {
        headers.add(s, s1);
        return this;
    }

    public Request build()
    {
        if (urlString == null)
        {
            throw new IllegalStateException("url == null");
        } else
        {
            return new Request(this, null);
        }
    }

    public t> cacheControl(CacheControl cachecontrol)
    {
        cachecontrol = cachecontrol.toString();
        if (cachecontrol.isEmpty())
        {
            return removeHeader("Cache-Control");
        } else
        {
            return header("Cache-Control", cachecontrol);
        }
    }

    public header delete()
    {
        return method("DELETE", null);
    }

    public method get()
    {
        return method("GET", null);
    }

    public method head()
    {
        return method("HEAD", null);
    }

    public method header(String s, String s1)
    {
        headers.set(s, s1);
        return this;
    }

    public set headers(Headers headers1)
    {
        headers = headers1.newBuilder();
        return this;
    }

    public er method(String s, RequestBody requestbody)
    {
        if (s == null || s.length() == 0)
        {
            throw new IllegalArgumentException("method == null || method.length() == 0");
        }
        if (requestbody != null && !HttpMethod.permitsRequestBody(s))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("method ").append(s).append(" must not have a request body.").toString());
        }
        RequestBody requestbody1 = requestbody;
        if (requestbody == null)
        {
            requestbody1 = requestbody;
            if (HttpMethod.permitsRequestBody(s))
            {
                requestbody1 = RequestBody.create(null, Util.EMPTY_BYTE_ARRAY);
            }
        }
        method = s;
        body = requestbody1;
        return this;
    }

    public body patch(RequestBody requestbody)
    {
        return method("PATCH", requestbody);
    }

    public method post(RequestBody requestbody)
    {
        return method("POST", requestbody);
    }

    public method put(RequestBody requestbody)
    {
        return method("PUT", requestbody);
    }

    public method removeHeader(String s)
    {
        headers.removeAll(s);
        return this;
    }

    public removeAll tag(Object obj)
    {
        tag = obj;
        return this;
    }

    public tag url(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("url == null");
        } else
        {
            urlString = s;
            return this;
        }
    }

    public urlString url(URL url1)
    {
        if (url1 == null)
        {
            throw new IllegalArgumentException("url == null");
        } else
        {
            url = url1;
            urlString = url1.toString();
            return this;
        }
    }







    public tpMethod()
    {
        method = "GET";
        headers = new <init>();
    }

    private <init>(Request request)
    {
        urlString = Request.access$700(request);
        url = Request.access$800(request);
        method = Request.access$900(request);
        body = Request.access$1000(request);
        tag = Request.access$1100(request);
        headers = Request.access$1200(request).newBuilder();
    }

    er(Request request, er er)
    {
        this(request);
    }
}
