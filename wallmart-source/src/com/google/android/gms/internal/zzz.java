// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

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

// Referenced classes of package com.google.android.gms.internal:
//            zzy, zzk, zza

public class zzz
    implements zzy
{
    public static interface zza
    {

        public abstract String zzh(String s);
    }


    private final zza zzaE;
    private final SSLSocketFactory zzaF;

    public zzz()
    {
        this(null);
    }

    public zzz(zza zza1)
    {
        this(zza1, null);
    }

    public zzz(zza zza1, SSLSocketFactory sslsocketfactory)
    {
        zzaE = zza1;
        zzaF = sslsocketfactory;
    }

    private HttpURLConnection zza(URL url, zzk zzk1)
        throws IOException
    {
        HttpURLConnection httpurlconnection = zza(url);
        int i = zzk1.zzt();
        httpurlconnection.setConnectTimeout(i);
        httpurlconnection.setReadTimeout(i);
        httpurlconnection.setUseCaches(false);
        httpurlconnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && zzaF != null)
        {
            ((HttpsURLConnection)httpurlconnection).setSSLSocketFactory(zzaF);
        }
        return httpurlconnection;
    }

    private static HttpEntity zza(HttpURLConnection httpurlconnection)
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

    static void zza(HttpURLConnection httpurlconnection, zzk zzk1)
        throws IOException, com.google.android.gms.internal.zza
    {
        switch (zzk1.getMethod())
        {
        default:
            throw new IllegalStateException("Unknown method type.");

        case -1: 
            byte abyte0[] = zzk1.zzm();
            if (abyte0 != null)
            {
                httpurlconnection.setDoOutput(true);
                httpurlconnection.setRequestMethod("POST");
                httpurlconnection.addRequestProperty("Content-Type", zzk1.zzl());
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
            zzb(httpurlconnection, zzk1);
            return;

        case 2: // '\002'
            httpurlconnection.setRequestMethod("PUT");
            zzb(httpurlconnection, zzk1);
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
            httpurlconnection.setRequestMethod("PATCH");
            zzb(httpurlconnection, zzk1);
            return;
        }
    }

    private static void zzb(HttpURLConnection httpurlconnection, zzk zzk1)
        throws IOException, com.google.android.gms.internal.zza
    {
        byte abyte0[] = zzk1.zzq();
        if (abyte0 != null)
        {
            httpurlconnection.setDoOutput(true);
            httpurlconnection.addRequestProperty("Content-Type", zzk1.zzp());
            httpurlconnection = new DataOutputStream(httpurlconnection.getOutputStream());
            httpurlconnection.write(abyte0);
            httpurlconnection.close();
        }
    }

    protected HttpURLConnection zza(URL url)
        throws IOException
    {
        return (HttpURLConnection)url.openConnection();
    }

    public HttpResponse zza(zzk zzk1, Map map)
        throws IOException, com.google.android.gms.internal.zza
    {
        String s = zzk1.getUrl();
        HashMap hashmap = new HashMap();
        hashmap.putAll(zzk1.getHeaders());
        hashmap.putAll(map);
        if (zzaE != null)
        {
            String s1 = zzaE.zzh(s);
            map = s1;
            if (s1 == null)
            {
                throw new IOException((new StringBuilder()).append("URL blocked by rewriter: ").append(s).toString());
            }
        } else
        {
            map = s;
        }
        map = zza(new URL(map), zzk1);
        String s2;
        for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); map.addRequestProperty(s2, (String)hashmap.get(s2)))
        {
            s2 = (String)iterator.next();
        }

        zza(((HttpURLConnection) (map)), zzk1);
        zzk1 = new ProtocolVersion("HTTP", 1, 1);
        if (map.getResponseCode() == -1)
        {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        zzk1 = new BasicHttpResponse(new BasicStatusLine(zzk1, map.getResponseCode(), map.getResponseMessage()));
        zzk1.setEntity(zza(((HttpURLConnection) (map))));
        map = map.getHeaderFields().entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            if (entry.getKey() != null)
            {
                zzk1.addHeader(new BasicHeader((String)entry.getKey(), (String)((List)entry.getValue()).get(0)));
            }
        } while (true);
        return zzk1;
    }
}
