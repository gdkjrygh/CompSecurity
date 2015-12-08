// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Platform;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.http.HttpMethod;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

// Referenced classes of package com.squareup.okhttp:
//            CacheControl, Headers, RequestBody

public final class Request
{
    public static class Builder
    {

        private RequestBody body;
        private Headers.Builder headers;
        private String method;
        private Object tag;
        private URL url;
        private String urlString;

        public Builder addHeader(String s, String s1)
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
                return new Request(this);
            }
        }

        public Builder cacheControl(CacheControl cachecontrol)
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

        public Builder delete()
        {
            return method("DELETE", null);
        }

        public Builder delete(RequestBody requestbody)
        {
            return method("DELETE", requestbody);
        }

        public Builder get()
        {
            return method("GET", null);
        }

        public Builder head()
        {
            return method("HEAD", null);
        }

        public Builder header(String s, String s1)
        {
            headers.set(s, s1);
            return this;
        }

        public Builder headers(Headers headers1)
        {
            headers = headers1.newBuilder();
            return this;
        }

        public Builder method(String s, RequestBody requestbody)
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

        public Builder patch(RequestBody requestbody)
        {
            return method("PATCH", requestbody);
        }

        public Builder post(RequestBody requestbody)
        {
            return method("POST", requestbody);
        }

        public Builder put(RequestBody requestbody)
        {
            return method("PUT", requestbody);
        }

        public Builder removeHeader(String s)
        {
            headers.removeAll(s);
            return this;
        }

        public Builder tag(Object obj)
        {
            tag = obj;
            return this;
        }

        public Builder url(String s)
        {
            if (s == null)
            {
                throw new IllegalArgumentException("url == null");
            } else
            {
                urlString = s;
                url = null;
                return this;
            }
        }

        public Builder url(URL url1)
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







        public Builder()
        {
            method = "GET";
            headers = new Headers.Builder();
        }

        private Builder(Request request)
        {
            urlString = request.urlString;
            url = request.url;
            method = request.method;
            body = request.body;
            tag = request.tag;
            headers = request.headers.newBuilder();
        }

    }


    private final RequestBody body;
    private volatile CacheControl cacheControl;
    private final Headers headers;
    private final String method;
    private final Object tag;
    private volatile URI uri;
    private volatile URL url;
    private final String urlString;

    private Request(Builder builder)
    {
        urlString = builder.urlString;
        method = builder.method;
        headers = builder.headers.build();
        body = builder.body;
        Object obj;
        if (builder.tag != null)
        {
            obj = builder.tag;
        } else
        {
            obj = this;
        }
        tag = obj;
        url = builder.url;
    }


    public RequestBody body()
    {
        return body;
    }

    public CacheControl cacheControl()
    {
        CacheControl cachecontrol = cacheControl;
        if (cachecontrol != null)
        {
            return cachecontrol;
        } else
        {
            CacheControl cachecontrol1 = CacheControl.parse(headers);
            cacheControl = cachecontrol1;
            return cachecontrol1;
        }
    }

    public String header(String s)
    {
        return headers.get(s);
    }

    public Headers headers()
    {
        return headers;
    }

    public List headers(String s)
    {
        return headers.values(s);
    }

    public boolean isHttps()
    {
        return url().getProtocol().equals("https");
    }

    public String method()
    {
        return method;
    }

    public Builder newBuilder()
    {
        return new Builder(this);
    }

    public Object tag()
    {
        return tag;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("Request{method=").append(method).append(", url=").append(urlString).append(", tag=");
        Object obj;
        if (tag != this)
        {
            obj = tag;
        } else
        {
            obj = null;
        }
        return stringbuilder.append(obj).append('}').toString();
    }

    public URI uri()
        throws IOException
    {
        URI uri1;
        try
        {
            uri1 = uri;
        }
        catch (URISyntaxException urisyntaxexception)
        {
            throw new IOException(urisyntaxexception.getMessage());
        }
        if (uri1 != null)
        {
            return uri1;
        }
        uri1 = Platform.get().toUriLenient(url());
        uri = uri1;
        return uri1;
    }

    public URL url()
    {
        URL url1;
        try
        {
            url1 = url;
        }
        catch (MalformedURLException malformedurlexception)
        {
            throw new RuntimeException((new StringBuilder()).append("Malformed URL: ").append(urlString).toString(), malformedurlexception);
        }
        if (url1 != null)
        {
            return url1;
        }
        url1 = new URL(urlString);
        url = url1;
        return url1;
    }

    public String urlString()
    {
        return urlString;
    }






}
