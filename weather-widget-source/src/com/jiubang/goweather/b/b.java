// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.b;

import android.text.TextUtils;
import com.jiubang.goweather.e.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.jiubang.goweather.b:
//            c, f, e

public class b extends c
{

    private HttpClient c;
    private HttpEntity d;
    private SimpleDateFormat e;

    public b()
    {
        e = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
    }

    private InputStream a(HttpResponse httpresponse, f f1)
    {
        d = httpresponse.getEntity();
        if (d == null) goto _L2; else goto _L1
_L1:
        httpresponse = d.getContent();
        f1.f(d.getContentLength());
_L9:
        if (httpresponse == null || !f1.a()) goto _L4; else goto _L3
_L3:
        GZIPInputStream gzipinputstream = new GZIPInputStream(httpresponse);
        return gzipinputstream;
        Object obj;
        obj;
        httpresponse = null;
_L7:
        ((IllegalStateException) (obj)).printStackTrace();
        continue; /* Loop/switch isn't completed */
        obj;
        httpresponse = null;
_L6:
        ((IOException) (obj)).printStackTrace();
        f1.b(11);
        f1.c(7);
        continue; /* Loop/switch isn't completed */
        obj;
        ((IOException) (obj)).printStackTrace();
        try
        {
            httpresponse.close();
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            httpresponse.printStackTrace();
        }
        f1.b(11);
        f1.c(9);
_L2:
        return null;
        obj;
        if (true) goto _L6; else goto _L5
_L5:
        obj;
        if (true) goto _L7; else goto _L4
_L4:
        return httpresponse;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private String b(HttpResponse httpresponse, f f1)
    {
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        obj2 = null;
        obj3 = null;
        obj4 = null;
        d = httpresponse.getEntity();
        obj1 = obj2;
        if (d == null) goto _L2; else goto _L1
_L1:
        Object obj;
        try
        {
            obj = d.getContent();
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            httpresponse.printStackTrace();
            f1.a(httpresponse);
            obj = null;
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            httpresponse.printStackTrace();
            f1.a(httpresponse);
            f1.b(11);
            f1.c(7);
            obj = null;
        }
        obj1 = obj2;
        if (obj == null) goto _L2; else goto _L3
_L3:
        if (!f1.a()) goto _L5; else goto _L4
_L4:
        obj2 = new GZIPInputStream(((InputStream) (obj)));
        httpresponse = ((HttpResponse) (obj2));
        obj1 = com.jiubang.goweather.e.a.a(((InputStream) (obj2)), null, f1);
        httpresponse = ((HttpResponse) (obj1));
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        ((GZIPInputStream) (obj2)).close();
        httpresponse = ((HttpResponse) (obj1));
_L7:
        IOException ioexception;
        obj1 = httpresponse;
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
                f1.a(((Throwable) (obj)));
                return httpresponse;
            }
            obj1 = httpresponse;
        }
_L2:
        return ((String) (obj1));
        ioexception;
        obj1 = null;
_L11:
        httpresponse = ((HttpResponse) (obj1));
        ioexception.printStackTrace();
        httpresponse = ((HttpResponse) (obj1));
        f1.a(ioexception);
        httpresponse = ((HttpResponse) (obj1));
        ((InputStream) (obj)).close();
_L8:
        httpresponse = ((HttpResponse) (obj1));
        f1.b(11);
        httpresponse = ((HttpResponse) (obj1));
        f1.c(9);
        httpresponse = obj4;
        if (obj1 == null) goto _L7; else goto _L6
_L6:
        ((GZIPInputStream) (obj1)).close();
        httpresponse = obj4;
          goto _L7
        obj1;
        ((IOException) (obj1)).printStackTrace();
        httpresponse = obj3;
_L9:
        f1.a(((Throwable) (obj1)));
          goto _L7
        obj2;
        httpresponse = ((HttpResponse) (obj1));
        ((IOException) (obj2)).printStackTrace();
        httpresponse = ((HttpResponse) (obj1));
        f1.a(((Throwable) (obj2)));
          goto _L8
        obj1;
        obj = httpresponse;
        httpresponse = ((HttpResponse) (obj1));
_L10:
        if (obj != null)
        {
            try
            {
                ((GZIPInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
                f1.a(((Throwable) (obj)));
            }
        }
        throw httpresponse;
_L5:
        httpresponse = com.jiubang.goweather.e.a.a(((InputStream) (obj)), null, f1);
          goto _L7
        obj2;
        ((IOException) (obj2)).printStackTrace();
        httpresponse = ((HttpResponse) (obj1));
        obj1 = obj2;
          goto _L9
        httpresponse;
        obj = null;
          goto _L10
        ioexception;
        obj1 = obj2;
          goto _L11
    }

    private void b()
    {
        if (d != null)
        {
            try
            {
                d.consumeContent();
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
            d = null;
        }
        if (c != null)
        {
            c.getConnectionManager().shutdown();
        }
    }

    public InputStream a(String s, e e1, f f1)
    {
        if (TextUtils.isEmpty(s) || !s.startsWith("http://") && !s.startsWith("https://")) goto _L2; else goto _L1
_L1:
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basichttpparams, e1.b());
        HttpConnectionParams.setSoTimeout(basichttpparams, e1.c());
        if (!TextUtils.isEmpty(a))
        {
            basichttpparams.setParameter("http.route.default-proxy", new HttpHost(a, b));
        }
        c = new DefaultHttpClient(basichttpparams);
        if (!e1.h().equalsIgnoreCase("GET")) goto _L4; else goto _L3
_L3:
        s = new HttpGet(s);
        java.util.Map.Entry entry;
        for (Iterator iterator = e1.d().entrySet().iterator(); iterator.hasNext(); s.addHeader((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        s.addHeader("accept-encoding", "gzip,deflate");
_L10:
        if (s == null) goto _L6; else goto _L5
_L5:
        if (e1.a())
        {
            s.addHeader("User-Agent", "Mozilla/5.0 (Linux; U; Android 2.2; en-us; Nexus One Build/FRF91) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1");
        }
        e1 = c.execute(s);
        s = e1;
_L8:
        if (s == null)
        {
            break; /* Loop/switch isn't completed */
        }
        e1 = s.headerIterator();
        String s1;
        Object obj;
        if (e1 != null)
        {
            do
            {
                if (!e1.hasNext())
                {
                    break;
                }
                obj = e1.nextHeader();
                s1 = ((Header) (obj)).getName().toLowerCase(Locale.US);
                obj = ((Header) (obj)).getValue();
                if (s1 == null || !s1.equalsIgnoreCase("Content-Encoding") && !s1.equalsIgnoreCase("X_Enc") || ((String) (obj)).indexOf("gzip") == -1 && ((String) (obj)).indexOf("x-gzip") == -1)
                {
                    continue;
                }
                f1.a(true);
                break;
            } while (true);
        }
        e1 = s.getFirstHeader("Date");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_376;
        }
        e1 = e.parse(e1.getValue());
        HttpPost httppost;
        java.util.Map.Entry entry1;
        if (e1 != null)
        {
            try
            {
                f1.e(e1.getTime());
            }
            // Misplaced declaration of an exception variable
            catch (e e1)
            {
                e1.printStackTrace();
            }
        }
        break MISSING_BLOCK_LABEL_376;
_L4:
        if (e1.h().equalsIgnoreCase("POST"))
        {
            httppost = new HttpPost(s);
            for (s = e1.d().entrySet().iterator(); s.hasNext(); httppost.addHeader((String)entry1.getKey(), (String)entry1.getValue()))
            {
                entry1 = (java.util.Map.Entry)s.next();
            }

            if (e1.e() != null)
            {
                s = new ByteArrayEntity(e1.e());
                ((HttpPost)httppost).setEntity(s);
                s = httppost;
                continue; /* Loop/switch isn't completed */
            }
            if (e1.f() != null)
            {
                try
                {
                    ((HttpPost)httppost).setEntity(new UrlEncodedFormEntity(e1.f(), "UTF-8"));
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    s.printStackTrace();
                    s = httppost;
                    continue; /* Loop/switch isn't completed */
                }
                s = httppost;
                continue; /* Loop/switch isn't completed */
            }
            s = httppost;
            if (e1.g() != null)
            {
                ((HttpPost)httppost).setEntity(e1.g());
                s = httppost;
            }
            continue; /* Loop/switch isn't completed */
        }
          goto _L7
        s;
        s.printStackTrace();
        f1.b(11);
        f1.c(5);
        f1.a(s.getMessage());
        s = null;
        continue; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        f1.b(11);
        f1.c(6);
        f1.a(s.getMessage());
        s = null;
        continue; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        f1.b(11);
        f1.c(12);
        f1.a(s.getMessage());
        s = null;
        continue; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        f1.b(11);
        f1.c(7);
        f1.a(s.getMessage());
        s = null;
        continue; /* Loop/switch isn't completed */
        e1;
        e1.printStackTrace();
        s.abort();
        f1.b(11);
        f1.c(13);
        f1.a(e1.getMessage());
        s = null;
        continue; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        s = null;
        continue; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        s = null;
        if (true) goto _L8; else goto _L6
        int i = s.getStatusLine().getStatusCode();
        if (i == 200)
        {
            return a(((HttpResponse) (s)), f1);
        }
        if (i >= 500 && i < 600)
        {
            f1.b(11);
            f1.c(-1);
            return null;
        }
        f1.b(11);
        f1.c(8);
_L6:
        return null;
_L2:
        f1.b(11);
        f1.c(4);
        if (true) goto _L6; else goto _L7
_L7:
        s = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void a()
    {
        if (d != null)
        {
            try
            {
                d.consumeContent();
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
            d = null;
        }
        if (c != null)
        {
            c.getConnectionManager().shutdown();
        }
    }

    public String b(String s, e e1, f f1)
    {
        if (TextUtils.isEmpty(s) || !s.startsWith("http://") && !s.startsWith("https://")) goto _L2; else goto _L1
_L1:
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basichttpparams, e1.b());
        HttpConnectionParams.setSoTimeout(basichttpparams, e1.c());
        if (!TextUtils.isEmpty(a))
        {
            basichttpparams.setParameter("http.route.default-proxy", new HttpHost(a, b));
        }
        c = new DefaultHttpClient(basichttpparams);
        if (!e1.h().equalsIgnoreCase("GET")) goto _L4; else goto _L3
_L3:
        s = new HttpGet(s);
        java.util.Map.Entry entry;
        for (Iterator iterator = e1.d().entrySet().iterator(); iterator.hasNext(); s.addHeader((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        s.addHeader("accept-encoding", "gzip,deflate");
_L11:
        if (s == null) goto _L6; else goto _L5
_L5:
        if (e1.a())
        {
            s.addHeader("User-Agent", "Mozilla/5.0 (Linux; U; Android 2.2; en-us; Nexus One Build/FRF91) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1");
        }
        e1 = c.execute(s);
        s = e1;
_L8:
        if (s == null) goto _L6; else goto _L7
_L7:
        e1 = s.headerIterator();
        Object obj;
        Object obj1;
        if (e1 != null)
        {
            do
            {
                if (!e1.hasNext())
                {
                    break;
                }
                obj1 = e1.nextHeader();
                obj = ((Header) (obj1)).getName().toLowerCase(Locale.US);
                obj1 = ((Header) (obj1)).getValue();
                if (obj == null || !((String) (obj)).equalsIgnoreCase("Content-Encoding") && !((String) (obj)).equalsIgnoreCase("X_Enc") || ((String) (obj1)).indexOf("gzip") == -1 && ((String) (obj1)).indexOf("x-gzip") == -1)
                {
                    continue;
                }
                f1.a(true);
                break;
            } while (true);
        }
        int i = s.getStatusLine().getStatusCode();
        f1.g(i);
        if (i == 200)
        {
            s = b(((HttpResponse) (s)), f1);
        } else
        {
label0:
            {
                if (i < 500 || i >= 600)
                {
                    break label0;
                }
                f1.b(11);
                f1.c(-1);
                s = null;
            }
        }
_L9:
        b();
        return s;
_L4:
        if (e1.h().equalsIgnoreCase("POST"))
        {
            obj = new HttpPost(s);
            for (s = e1.d().entrySet().iterator(); s.hasNext(); ((HttpRequestBase) (obj)).addHeader((String)((java.util.Map.Entry) (obj1)).getKey(), (String)((java.util.Map.Entry) (obj1)).getValue()))
            {
                obj1 = (java.util.Map.Entry)s.next();
            }

            if (e1.e() != null)
            {
                s = new ByteArrayEntity(e1.e());
                ((HttpPost)obj).setEntity(s);
                s = ((String) (obj));
                continue; /* Loop/switch isn't completed */
            }
            if (e1.f() != null)
            {
                try
                {
                    ((HttpPost)obj).setEntity(new UrlEncodedFormEntity(e1.f(), "UTF-8"));
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    s.printStackTrace();
                    f1.a(s);
                    s = ((String) (obj));
                    continue; /* Loop/switch isn't completed */
                }
                s = ((String) (obj));
                continue; /* Loop/switch isn't completed */
            }
            s = ((String) (obj));
            if (e1.g() != null)
            {
                ((HttpPost)obj).setEntity(e1.g());
                s = ((String) (obj));
            }
        } else
        {
            s = null;
        }
        continue; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        f1.b(11);
        f1.c(5);
        f1.a(s.getMessage());
        f1.a(s);
        s = null;
          goto _L8
        s;
        s.printStackTrace();
        f1.b(11);
        f1.c(6);
        f1.a(s.getMessage());
        f1.a(s);
        s = null;
          goto _L8
        s;
        s.printStackTrace();
        f1.b(11);
        f1.c(12);
        f1.a(s.getMessage());
        f1.a(s);
        s = null;
          goto _L8
        s;
        s.printStackTrace();
        f1.b(11);
        f1.c(7);
        f1.a(s.getMessage());
        f1.a(s);
        s = null;
          goto _L8
        e1;
        e1.printStackTrace();
        s.abort();
        f1.b(11);
        f1.c(13);
        f1.a(e1.getMessage());
        f1.a(e1);
        s = null;
          goto _L8
        s;
        s.printStackTrace();
        f1.a(s);
        s = null;
          goto _L8
        f1.b(11);
        f1.c(8);
_L6:
        s = null;
          goto _L9
_L2:
        f1.a((new StringBuilder()).append("\u8BF7\u6C42URL\u4E0D\u5408\u6CD5\uFF1A").append(s).toString());
        f1.b(11);
        f1.c(4);
          goto _L6
        if (true) goto _L11; else goto _L10
_L10:
    }
}
