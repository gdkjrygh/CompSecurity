// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.net;

import android.content.Context;
import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.util.PhotoMACUtils;
import com.walmartlabs.android.photo.util.PhotoObjectMapper;
import com.walmartlabs.android.photo.util.integration.AppIntegration;
import com.walmartlabs.android.photo.util.integration.AppIntegrationFactory;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;

// Referenced classes of package com.walmartlabs.android.photo.net:
//            PhotoResponse

class PhotoNetworkServices
{

    private static final String CONTENT_TYPE_JSON = "application/json";
    private static final String TAG = com/walmartlabs/android/photo/net/PhotoNetworkServices.getSimpleName();
    private static PhotoNetworkServices sInstance;
    private Context mContext;
    private DefaultHttpClient mHttpClient;

    private PhotoNetworkServices(Context context)
    {
        mContext = context;
        context = new SchemeRegistry();
        context.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        context.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 10000);
        HttpConnectionParams.setSoTimeout(basichttpparams, 30000);
        mHttpClient = new DefaultHttpClient(new ThreadSafeClientConnManager(basichttpparams, context), basichttpparams);
        mHttpClient.setHttpRequestRetryHandler(new DefaultHttpRequestRetryHandler(0, false));
    }

    public static String asString(Cookie cookie)
    {
        return (new StringBuilder()).append("===[ Cookie ]===").append("\n    Class: ").append(cookie.getClass()).append("\n     Name: ").append(cookie.getName()).append("\n    Value: ").append(cookie.getValue()).append("\n   Domain: ").append(cookie.getDomain()).append("\n     Path: ").append(cookie.getPath()).append("\n  Expires: ").append(cookie.getExpiryDate()).append("\n   Secure: ").append(cookie.isSecure()).append("\n================").toString();
    }

    private PhotoResponse execute(HttpUriRequest httpurirequest)
        throws IOException
    {
        PhotoResponse photoresponse = new PhotoResponse();
        Cookie cookie;
        for (Iterator iterator = AppIntegrationFactory.create(mContext).getCookies().iterator(); iterator.hasNext(); mHttpClient.getCookieStore().addCookie(cookie))
        {
            cookie = (Cookie)iterator.next();
        }

        PhotoLogger.get().d(TAG, (new StringBuilder()).append("execute(-->): ").append(httpurirequest.getRequestLine()).toString());
        String s;
        Exception exception;
        Map map;
        int i;
        try
        {
            httpurirequest = mHttpClient.execute(httpurirequest);
            PhotoLogger.get().d(TAG, (new StringBuilder()).append("execute(<--): ").append(httpurirequest.getStatusLine()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (HttpUriRequest httpurirequest)
        {
            photoresponse.setException(httpurirequest);
            httpurirequest.printStackTrace();
            return photoresponse;
        }
        // Misplaced declaration of an exception variable
        catch (HttpUriRequest httpurirequest)
        {
            photoresponse.setException(httpurirequest);
            httpurirequest.printStackTrace();
            return photoresponse;
        }
        if (httpurirequest == null)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        i = httpurirequest.getStatusLine().getStatusCode();
        s = httpurirequest.getStatusLine().getReasonPhrase();
        map = mapHeaders(httpurirequest.getAllHeaders());
        httpurirequest = httpurirequest.getEntity();
        photoresponse.setValid(true);
        photoresponse.setHttpStatus(i);
        photoresponse.setHttpReason(s);
        photoresponse.setHttpHeaders(map);
        if (httpurirequest == null)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        s = EntityUtils.toString(httpurirequest);
        photoresponse.setEntity(s);
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("execute(): Response body:\n").append(s).toString());
        httpurirequest.consumeContent();
        return photoresponse;
        httpurirequest;
        httpurirequest.printStackTrace();
        return photoresponse;
        exception;
        httpurirequest.consumeContent();
_L1:
        throw exception;
        httpurirequest;
        httpurirequest.printStackTrace();
          goto _L1
    }

    public static PhotoNetworkServices get(Context context)
    {
        com/walmartlabs/android/photo/net/PhotoNetworkServices;
        JVM INSTR monitorenter ;
        if (sInstance == null)
        {
            sInstance = new PhotoNetworkServices(context.getApplicationContext());
        }
        context = sInstance;
        com/walmartlabs/android/photo/net/PhotoNetworkServices;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private Map mapHeaders(Header aheader[])
    {
        HashMap hashmap = new HashMap();
        if (aheader != null)
        {
            int j = aheader.length;
            for (int i = 0; i < j; i++)
            {
                Header header = aheader[i];
                hashmap.put(header.getName(), header.getValue());
            }

        }
        return hashmap;
    }

    private StringEntity toStringEntityOrNull(String s)
    {
        try
        {
            s = new StringEntity(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            PhotoLogger.get().d(TAG, (new StringBuilder()).append("Failed to create StringEntity from body: ").append(s).toString());
            return null;
        }
        return s;
    }

    public PhotoResponse get(String s)
        throws IOException
    {
        return execute(new HttpGet(s));
    }

    public PhotoResponse head(String s)
        throws IOException
    {
        return execute(new HttpHead(s));
    }

    public PhotoResponse postJSON(String s, Object obj)
        throws IOException
    {
        s = new HttpPost(s);
        obj = PhotoObjectMapper.get().writeAsString(obj);
        s.setHeader("Content-Type", "application/json");
        s.setEntity(toStringEntityOrNull(((String) (obj))));
        return execute((HttpPost)PhotoMACUtils.addSignature(s, ((String) (obj))));
    }

    public PhotoResponse putBytes(HttpPut httpput, String s)
        throws IOException
    {
        return execute((HttpPut)PhotoMACUtils.addSignature(httpput, new File(s)));
    }

}
