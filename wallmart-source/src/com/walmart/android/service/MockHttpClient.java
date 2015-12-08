// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import android.content.Context;
import com.walmart.android.utils.UrlUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.walmart.android.service:
//            MockComponentResolver, Utils, MockManager

public class MockHttpClient
    implements HttpClient
{

    private static final long MOCK_DELAY = 500L;
    private static final String TAG = com/walmart/android/service/MockHttpClient.getSimpleName();
    private static final Pattern sMockWithHttpStatusPattern = Pattern.compile("^.*_http(\\d+)\\..*$", 2);
    private Context mContext;
    private MockComponentResolver mMockComponentResolver;

    public MockHttpClient(Context context, MockComponentResolver mockcomponentresolver)
    {
        mContext = context;
        mMockComponentResolver = mockcomponentresolver;
    }

    private HttpResponse createFromUri(Context context, String s)
        throws IOException
    {
        return createHttpResponse(context, mMockComponentResolver.getServiceFromUri(s), mMockComponentResolver.getMethodFromUri(s), UrlUtils.extractParameters(s));
    }

    private static HttpEntity createHttpEntityFromFile(Context context, String s)
    {
        context = new InputStreamEntity(Utils.getFileAsInputStream(context, s), 0L);
        if (s.endsWith("html"))
        {
            context.setContentType("text/html; charset=utf-8");
        } else
        if (s.endsWith("json"))
        {
            context.setContentType("application/json; charset=utf-8");
            return context;
        }
        return context;
    }

    private static HttpResponse createHttpResponse(Context context, String s, String s1, HashMap hashmap)
        throws IOException
    {
        s = MockManager.getInstance(context).getMockResponseFileName(s, s1, hashmap);
        context = createHttpEntityFromFile(context, s);
        if (context == null)
        {
            throw new IOException();
        } else
        {
            int i = extractHttpStatusFromFilename(s);
            s = new BasicHttpResponse(new ProtocolVersion("HTTP", 1, 1), i, null);
            s.setEntity(context);
            s.addHeader(context.getContentType());
            return s;
        }
    }

    private static int extractHttpStatusFromFilename(String s)
    {
        int i = 200;
        s = sMockWithHttpStatusPattern.matcher(s);
        if (s.matches())
        {
            i = Integer.parseInt(s.group(1));
        }
        return i;
    }

    public Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler)
        throws IOException, ClientProtocolException
    {
        return null;
    }

    public Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler, HttpContext httpcontext)
        throws IOException, ClientProtocolException
    {
        return null;
    }

    public Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler)
        throws IOException, ClientProtocolException
    {
        try
        {
            Thread.sleep(500L);
        }
        catch (InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
        return responsehandler.handleResponse(createFromUri(mContext, UrlUtils.getRequestString(httpurirequest)));
    }

    public Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler, HttpContext httpcontext)
        throws IOException, ClientProtocolException
    {
        return null;
    }

    public HttpResponse execute(HttpHost httphost, HttpRequest httprequest)
        throws IOException, ClientProtocolException
    {
        return null;
    }

    public HttpResponse execute(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext)
        throws IOException, ClientProtocolException
    {
        return null;
    }

    public HttpResponse execute(HttpUriRequest httpurirequest)
        throws IOException, ClientProtocolException
    {
        return null;
    }

    public HttpResponse execute(HttpUriRequest httpurirequest, HttpContext httpcontext)
        throws IOException, ClientProtocolException
    {
        return null;
    }

    public ClientConnectionManager getConnectionManager()
    {
        return null;
    }

    public HttpParams getParams()
    {
        return null;
    }

}
