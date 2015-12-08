// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.a.a;

import com.android.a.p;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

// Referenced classes of package com.android.a.a:
//            j, l

public class k
    implements j
{

    private final l a;
    private final SSLSocketFactory b;

    public k()
    {
        this(null);
    }

    public k(l l1)
    {
        this(l1, null);
    }

    public k(l l1, SSLSocketFactory sslsocketfactory)
    {
        a = l1;
        b = sslsocketfactory;
    }

    private HttpURLConnection a(URL url, p p1)
    {
        HttpURLConnection httpurlconnection = a(url);
        int i = p1.t();
        httpurlconnection.setConnectTimeout(i);
        httpurlconnection.setReadTimeout(i);
        httpurlconnection.setUseCaches(false);
        httpurlconnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && b != null)
        {
            ((HttpsURLConnection)httpurlconnection).setSSLSocketFactory(b);
        }
        return httpurlconnection;
    }

    private static HttpEntity a(HttpURLConnection httpurlconnection)
    {
        BasicHttpEntity basichttpentity = new BasicHttpEntity();
        java.io.InputStream inputstream;
        try
        {
            inputstream = httpurlconnection.getInputStream();
        }
        catch (IOException ioexception)
        {
            ioexception = httpurlconnection.getErrorStream();
        }
        basichttpentity.setContent(inputstream);
        basichttpentity.setContentLength(httpurlconnection.getContentLength());
        basichttpentity.setContentEncoding(httpurlconnection.getContentEncoding());
        basichttpentity.setContentType(httpurlconnection.getContentType());
        return basichttpentity;
    }

    static void a(HttpURLConnection httpurlconnection, p p1)
    {
        switch (p1.a())
        {
        default:
            throw new IllegalStateException("Unknown method type.");

        case -1: 
            byte abyte0[] = p1.m();
            if (abyte0 != null)
            {
                httpurlconnection.setDoOutput(true);
                httpurlconnection.setRequestMethod("POST");
                httpurlconnection.addRequestProperty("Content-Type", p1.l());
                httpurlconnection = new DataOutputStream(httpurlconnection.getOutputStream());
                httpurlconnection.write(abyte0);
                httpurlconnection.close();
            }
            return;

        case 0: // '\0'
            httpurlconnection.setRequestMethod("GET");
            return;

        case 3: // '\003'
            httpurlconnection.setRequestMethod("DELETE");
            return;

        case 1: // '\001'
            httpurlconnection.setRequestMethod("POST");
            b(httpurlconnection, p1);
            return;

        case 2: // '\002'
            httpurlconnection.setRequestMethod("PUT");
            b(httpurlconnection, p1);
            return;

        case 4: // '\004'
            httpurlconnection.setRequestMethod("HEAD");
            return;

        case 5: // '\005'
            httpurlconnection.setRequestMethod("OPTIONS");
            return;

        case 6: // '\006'
            httpurlconnection.setRequestMethod("TRACE");
            return;

        case 7: // '\007'
            b(httpurlconnection, p1);
            httpurlconnection.setRequestMethod("PATCH");
            return;
        }
    }

    private static void b(HttpURLConnection httpurlconnection, p p1)
    {
        byte abyte0[] = p1.q();
        if (abyte0 != null)
        {
            httpurlconnection.setDoOutput(true);
            httpurlconnection.addRequestProperty("Content-Type", p1.p());
            httpurlconnection = new DataOutputStream(httpurlconnection.getOutputStream());
            httpurlconnection.write(abyte0);
            httpurlconnection.close();
        }
    }

    protected HttpURLConnection a(URL url)
    {
        return (HttpURLConnection)url.openConnection();
    }

    public HttpResponse a(p p1, Map map)
    {
        Object obj = p1.d();
        HashMap hashmap = new HashMap();
        hashmap.putAll(p1.i());
        hashmap.putAll(map);
        if (a != null)
        {
            String s = a.a(((String) (obj)));
            map = s;
            if (s == null)
            {
                throw new IOException((new StringBuilder("URL blocked by rewriter: ")).append(((String) (obj))).toString());
            }
        } else
        {
            map = ((Map) (obj));
        }
        map = a(new URL(map), p1);
        obj = hashmap.keySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                a(((HttpURLConnection) (map)), p1);
                p1 = new ProtocolVersion("HTTP", 1, 1);
                if (map.getResponseCode() == -1)
                {
                    throw new IOException("Could not retrieve response code from HttpUrlConnection.");
                }
                break;
            }
            String s1 = (String)((Iterator) (obj)).next();
            map.addRequestProperty(s1, (String)hashmap.get(s1));
        } while (true);
        p1 = new BasicHttpResponse(new BasicStatusLine(p1, map.getResponseCode(), map.getResponseMessage()));
        p1.setEntity(a(((HttpURLConnection) (map))));
        map = map.getHeaderFields().entrySet().iterator();
        do
        {
            java.util.Map.Entry entry;
            do
            {
                if (!map.hasNext())
                {
                    return p1;
                }
                entry = (java.util.Map.Entry)map.next();
            } while (entry.getKey() == null);
            p1.addHeader(new BasicHeader((String)entry.getKey(), (String)((List)entry.getValue()).get(0)));
        } while (true);
    }
}
