// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.anivia;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.walmartlabs.anivia:
//            HttpSender

public class HttpClientSender
    implements HttpSender
{

    private final HttpClient mHttpClient = createHttpClient();

    public HttpClientSender()
    {
    }

    private static HttpClient createHttpClient()
    {
        Object obj = new Scheme("http", PlainSocketFactory.getSocketFactory(), 80);
        Scheme scheme = new Scheme("https", SSLSocketFactory.getSocketFactory(), 443);
        SchemeRegistry schemeregistry = new SchemeRegistry();
        schemeregistry.register(((Scheme) (obj)));
        schemeregistry.register(scheme);
        obj = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj)), 7000);
        return new DefaultHttpClient(new ThreadSafeClientConnManager(((org.apache.http.params.HttpParams) (obj)), schemeregistry), ((org.apache.http.params.HttpParams) (obj)));
    }

    private HttpUriRequest createRequest(String s, String s1, String s2)
    {
        s = new HttpPost(s);
        try
        {
            s2 = new StringEntity(s2);
            s2.setContentType(s1);
            s.setEntity(s2);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return s;
        }
        return s;
    }

    private HttpSender.Response handleResponse(HttpResponse httpresponse)
    {
        Object obj = httpresponse.getEntity();
        obj = IOUtils.toString(((HttpEntity) (obj)).getContent());
        httpresponse = new HttpSender.Response(httpresponse.getStatusLine().getStatusCode(), ((String) (obj)));
        return httpresponse;
        httpresponse;
        httpresponse.printStackTrace();
_L2:
        return null;
        httpresponse;
        httpresponse.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public HttpSender.Response post(String s, String s1, String s2)
    {
        s = createRequest(s, s1, s2);
        try
        {
            s = handleResponse(mHttpClient.execute(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }
}
