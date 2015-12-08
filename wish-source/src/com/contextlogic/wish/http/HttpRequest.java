// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.http;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.client.HttpClient;
import ch.boye.httpclientandroidlib.client.methods.HttpGet;
import ch.boye.httpclientandroidlib.client.methods.HttpPost;
import ch.boye.httpclientandroidlib.client.methods.HttpRequestBase;
import ch.boye.httpclientandroidlib.protocol.HttpContext;
import ch.boye.httpclientandroidlib.util.EntityUtils;
import com.contextlogic.wish.analytics.Analytics;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiConfig;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;

// Referenced classes of package com.contextlogic.wish.http:
//            HttpResponseHandler, WishHttpClient, ImageHttpResponseHandler, StringHttpResponseHandler, 
//            HttpRequestParams

public class HttpRequest
    implements Runnable
{
    public static final class RequestType extends Enum
    {

        private static final RequestType $VALUES[];
        public static final RequestType Get;
        public static final RequestType Post;

        public static RequestType valueOf(String s)
        {
            return (RequestType)Enum.valueOf(com/contextlogic/wish/http/HttpRequest$RequestType, s);
        }

        public static RequestType[] values()
        {
            return (RequestType[])$VALUES.clone();
        }

        static 
        {
            Get = new RequestType("Get", 0);
            Post = new RequestType("Post", 1);
            $VALUES = (new RequestType[] {
                Get, Post
            });
        }

        private RequestType(String s, int i)
        {
            super(s, i);
        }
    }


    private final HttpClient httpClient;
    private final HttpContext httpContext;
    private final HttpRequestParams params;
    private HttpRequestBase request;
    private final RequestType requestType;
    private String requestUrl;
    private final HttpResponseHandler responseHandler;

    public HttpRequest(HttpClient httpclient, HttpContext httpcontext, String s, RequestType requesttype, HttpRequestParams httprequestparams, HttpResponseHandler httpresponsehandler)
    {
        httpClient = httpclient;
        httpContext = httpcontext;
        requestUrl = s;
        responseHandler = httpresponsehandler;
        requestType = requesttype;
        params = httprequestparams;
    }

    private void executeRequest()
        throws IOException
    {
        if (!Thread.currentThread().isInterrupted() && (responseHandler == null || !responseHandler.loadResponseFromCache(request.getURI().toString()))) goto _L2; else goto _L1
_L1:
        return;
_L2:
        HttpResponse httpresponse;
        WishHttpClient.getInstance().closeIdleConnections();
        httpresponse = httpClient.execute(request, httpContext);
        if (Thread.currentThread().isInterrupted())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (httpresponse.getStatusLine() != null && httpresponse.getStatusLine().getStatusCode() != 200 && request != null && request.getURI() != null && request.getURI().getHost() != null && request.getURI().getHost().contains("wish.com"))
        {
            Analytics.getInstance().trackPageView(Integer.toString(httpresponse.getStatusLine().getStatusCode()));
            Analytics.getInstance().trackRawEvent(Integer.toString(httpresponse.getStatusLine().getStatusCode()), com.contextlogic.wish.analytics.Analytics.PageViewType.Api, request.getURI().toString());
        }
        if (responseHandler == null) goto _L1; else goto _L3
_L3:
        if (!(responseHandler instanceof ImageHttpResponseHandler))
        {
            Object obj = getResponseCookies(httpresponse);
            responseHandler.setResponseCookies(((HashMap) (obj)));
            obj = (String)((HashMap) (obj)).get("bsid");
            if (obj != null && request.getURI().getHost().contains("wish.com"))
            {
                WishHttpClient.getInstance().addBsidCookie(((String) (obj)), WishApi.getInstance().getConfig().getApiBaseUrlString());
            }
        }
        responseHandler.receiveResponse(request, httpresponse);
        return;
        if (httpresponse == null || httpresponse.getEntity() == null) goto _L1; else goto _L4
_L4:
        EntityUtils.consume(httpresponse.getEntity());
        return;
    }

    private HashMap getResponseCookies(HttpResponse httpresponse)
    {
        HashMap hashmap = new HashMap();
        Header aheader[] = httpresponse.getHeaders("Set-Cookie");
        if (aheader != null && aheader.length > 0)
        {
            int j = aheader.length;
            for (int i = 0; i < j; i++)
            {
                String s = aheader[i].getValue();
                int k = s.indexOf(";");
                int l = s.indexOf("=");
                httpresponse = s;
                if (k > 0)
                {
                    httpresponse = s.substring(0, k);
                }
                if (l > 0)
                {
                    hashmap.put(httpresponse.substring(0, l), httpresponse.substring(l + 1));
                }
            }

        }
        return hashmap;
    }

    public void cancelRequest()
    {
        if (request == null || request.isAborted())
        {
            break MISSING_BLOCK_LABEL_24;
        }
        request.abort();
        return;
        Exception exception;
        exception;
    }

    public void run()
    {
        if (requestType != RequestType.Get) goto _L2; else goto _L1
_L1:
        request = new HttpGet(requestUrl);
_L4:
        if (responseHandler != null && (responseHandler instanceof StringHttpResponseHandler))
        {
            request.setHeader("Accept-Encoding", "gzip");
        }
        WishHttpClient.getInstance().registerSchemes();
        if (responseHandler != null)
        {
            responseHandler.requestStarted(request);
        }
        executeRequest();
        if (responseHandler != null)
        {
            responseHandler.requestFinished(request);
            return;
        }
        break MISSING_BLOCK_LABEL_175;
_L2:
        if (requestType != RequestType.Post) goto _L4; else goto _L3
_L3:
        HttpPost httppost;
        ch.boye.httpclientandroidlib.HttpEntity httpentity;
        httppost = new HttpPost(requestUrl);
        if (params == null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        httpentity = params.toEntity();
        if (httpentity == null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        httppost.setEntity(httpentity);
        request = httppost;
          goto _L4
        IOException ioexception;
        ioexception;
        if (responseHandler != null)
        {
            responseHandler.requestFailed(request, ioexception, null);
        }
    }
}
