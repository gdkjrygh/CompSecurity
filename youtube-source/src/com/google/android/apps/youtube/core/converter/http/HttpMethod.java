// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.net.Uri;
import org.apache.http.client.methods.HttpUriRequest;

public abstract class HttpMethod extends Enum
{

    private static final HttpMethod $VALUES[];
    public static final HttpMethod DELETE;
    public static final HttpMethod GET;
    public static final HttpMethod HEAD;
    public static final HttpMethod PATCH;
    public static final HttpMethod POST;
    public static final HttpMethod PUT;

    private HttpMethod(String s, int i)
    {
        super(s, i);
    }

    HttpMethod(String s, int i, _cls1 _pcls1)
    {
        this(s, i);
    }

    public static HttpMethod valueOf(String s)
    {
        return (HttpMethod)Enum.valueOf(com/google/android/apps/youtube/core/converter/http/HttpMethod, s);
    }

    public static HttpMethod[] values()
    {
        return (HttpMethod[])$VALUES.clone();
    }

    public abstract HttpUriRequest createHttpRequest(Uri uri);

    public boolean supportsPayload()
    {
        return this == POST || this == PUT || this == PATCH;
    }

    static 
    {
        HEAD = new _cls1("HEAD", 0);
        GET = new _cls2("GET", 1);
        POST = new _cls3("POST", 2);
        PUT = new _cls4("PUT", 3);
        PATCH = new _cls5("PATCH", 4);
        DELETE = new _cls6("DELETE", 5);
        $VALUES = (new HttpMethod[] {
            HEAD, GET, POST, PUT, PATCH, DELETE
        });
    }

    private class _cls1 extends HttpMethod
    {

        public final HttpUriRequest createHttpRequest(Uri uri)
        {
            return new HttpHead(uri.toString());
        }

        _cls1(String s, int i)
        {
            super(s, i, null);
        }
    }


    private class _cls2 extends HttpMethod
    {

        public final HttpUriRequest createHttpRequest(Uri uri)
        {
            return new HttpGet(uri.toString());
        }

        _cls2(String s, int i)
        {
            super(s, i, null);
        }
    }


    private class _cls3 extends HttpMethod
    {

        public final HttpUriRequest createHttpRequest(Uri uri)
        {
            return new HttpPost(uri.toString());
        }

        _cls3(String s, int i)
        {
            super(s, i, null);
        }
    }


    private class _cls4 extends HttpMethod
    {

        public final HttpUriRequest createHttpRequest(Uri uri)
        {
            return new HttpPut(uri.toString());
        }

        _cls4(String s, int i)
        {
            super(s, i, null);
        }
    }


    private class _cls5 extends HttpMethod
    {

        public final HttpUriRequest createHttpRequest(Uri uri)
        {
            return new ax(uri.toString());
        }

        _cls5(String s, int i)
        {
            super(s, i, null);
        }
    }


    private class _cls6 extends HttpMethod
    {

        public final HttpUriRequest createHttpRequest(Uri uri)
        {
            return new HttpDelete(uri.toString());
        }

        _cls6(String s, int i)
        {
            super(s, i, null);
        }
    }

}
