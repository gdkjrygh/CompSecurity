// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.d;

import android.content.Context;
import android.util.Log;
import com.wf.wellsfargomobile.WFApp;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.a.b.a.a.a.e;
import org.a.b.a.a.h;
import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONObject;

// Referenced classes of package com.wf.wellsfargomobile.d:
//            d, e, b, c

public class a
{

    private final c a;
    private final String b;
    private final Map c;
    private final Map d;
    private boolean e;
    private boolean f;
    private h g;
    private final Context h;
    private int i;

    public a(c c1, String s, Map map, Map map1, Context context)
    {
        e = true;
        f = false;
        i = 0;
        a = c1;
        b = s;
        c = map;
        d = map1;
        e = true;
        h = context;
    }

    public a(c c1, String s, Map map, Map map1, Context context, boolean flag)
    {
        this(c1, s, map, map1, context);
        e = flag;
    }

    private void a(HttpURLConnection httpurlconnection)
    {
        httpurlconnection.setRequestProperty("nativeApp", WFApp.af());
        httpurlconnection.setRequestProperty("User-Agent", com.wf.wellsfargomobile.d.d.a(h));
        if (d != null)
        {
            Iterator iterator = d.entrySet().iterator();
            while (iterator.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                String s;
                if (entry.getValue() == null)
                {
                    s = "";
                } else
                {
                    s = (String)entry.getValue();
                }
                httpurlconnection.setRequestProperty((String)entry.getKey(), s);
            }
        }
    }

    private void b(HttpURLConnection httpurlconnection)
    {
        String s;
        httpurlconnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        s = c();
        DataOutputStream dataoutputstream = new DataOutputStream(httpurlconnection.getOutputStream());
        dataoutputstream.write(s.getBytes());
        if (dataoutputstream != null)
        {
            dataoutputstream.flush();
            dataoutputstream.close();
        }
        return;
        httpurlconnection;
        dataoutputstream = null;
_L2:
        if (dataoutputstream != null)
        {
            dataoutputstream.flush();
            dataoutputstream.close();
        }
        throw httpurlconnection;
        httpurlconnection;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private String c()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        if (c != null)
        {
            Iterator iterator = c.entrySet().iterator();
            boolean flag = true;
            while (iterator.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                String s;
                if (entry.getValue() == null)
                {
                    s = "";
                } else
                {
                    s = (String)entry.getValue();
                }
                if (!flag)
                {
                    stringbuilder.append("&");
                }
                stringbuilder.append(URLEncoder.encode((String)entry.getKey(), "UTF-8"));
                stringbuilder.append("=");
                stringbuilder.append(URLEncoder.encode(s, "UTF-8"));
                flag = false;
            }
        }
        return stringbuilder.toString();
    }

    private void c(HttpURLConnection httpurlconnection)
    {
        DataOutputStream dataoutputstream1;
        h h1;
        if (g == null)
        {
            h1 = new h();
            java.util.Map.Entry entry;
            for (Iterator iterator = c.entrySet().iterator(); iterator.hasNext(); h1.a((String)entry.getKey(), new e((String)entry.getValue(), Charset.forName("UTF-8"))))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

        } else
        {
            h1 = g;
        }
        httpurlconnection.addRequestProperty(h1.getContentType().getName(), h1.getContentType().getValue());
        dataoutputstream1 = new DataOutputStream(httpurlconnection.getOutputStream());
        h1.writeTo(dataoutputstream1);
        if (dataoutputstream1 != null)
        {
            dataoutputstream1.flush();
            dataoutputstream1.close();
        }
        return;
        httpurlconnection;
        DataOutputStream dataoutputstream = null;
_L2:
        if (dataoutputstream != null)
        {
            dataoutputstream.flush();
            dataoutputstream.close();
        }
        throw httpurlconnection;
        httpurlconnection;
        dataoutputstream = dataoutputstream1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public a a(h h1)
    {
        f = true;
        g = h1;
        return this;
    }

    public a a(boolean flag)
    {
        f = flag;
        return this;
    }

    public CharSequence a()
    {
        return b().b();
    }

    public com.wf.wellsfargomobile.d.e b()
    {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        BufferedReader bufferedreader;
        Object obj16;
        Object obj17;
        Object obj18;
        Object obj19;
        Object obj20;
        Object obj21;
        Object obj22;
        Object obj23;
        Object obj24;
        Object obj25;
        Object obj26;
        obj2 = new com.wf.wellsfargomobile.d.e();
        obj15 = new StringBuilder(512);
        obj16 = null;
        obj17 = null;
        obj18 = null;
        obj19 = null;
        obj20 = null;
        obj21 = null;
        obj22 = null;
        obj23 = null;
        obj24 = null;
        obj25 = null;
        obj26 = null;
        bufferedreader = null;
        obj4 = bufferedreader;
        obj5 = obj16;
        obj6 = obj17;
        obj7 = obj18;
        obj8 = obj19;
        obj9 = obj20;
        obj10 = obj21;
        obj11 = obj22;
        obj12 = obj23;
        obj14 = obj24;
        obj3 = obj25;
        obj13 = obj26;
        b.a[a.ordinal()];
        JVM INSTR tableswitch 1 2: default 3412
    //                   1 333
    //                   2 1468;
           goto _L1 _L2 _L3
_L1:
        obj4 = bufferedreader;
        obj5 = obj16;
        obj6 = obj17;
        obj7 = obj18;
        obj8 = obj19;
        obj9 = obj20;
        obj10 = obj21;
        obj11 = obj22;
        obj12 = obj23;
        obj14 = obj24;
        obj3 = obj25;
        obj13 = obj26;
        throw new UnsupportedOperationException((new StringBuilder()).append("method: ").append(a).append(" is not ").append("supported").toString());
        Object obj;
        obj;
_L37:
        obj3 = obj4;
        Log.e("NetworkCommunication", (new StringBuilder()).append("IllegalCharsetNameException e: ").append(obj).append(" url: ").append(b).toString());
        obj3 = obj4;
        obj5 = new StringBuilder((new StringBuilder()).append("{\"status\":\"error\", \"errorCode\": \"-1\", \"errorMessage\": ").append(JSONObject.quote(((IllegalCharsetNameException) (obj)).getMessage())).append(" }").toString());
        Object obj1;
        obj1 = obj5;
        if (obj4 != null)
        {
            ((HttpURLConnection) (obj4)).disconnect();
            obj1 = obj5;
        }
_L9:
        ((com.wf.wellsfargomobile.d.e) (obj2)).b(((CharSequence) (obj1)));
        return ((com.wf.wellsfargomobile.d.e) (obj2));
_L2:
        obj4 = bufferedreader;
        obj5 = obj16;
        obj6 = obj17;
        obj7 = obj18;
        obj8 = obj19;
        obj9 = obj20;
        obj10 = obj21;
        obj11 = obj22;
        obj12 = obj23;
        obj14 = obj24;
        obj3 = obj25;
        obj13 = obj26;
        if (c == null) goto _L5; else goto _L4
_L4:
        obj4 = bufferedreader;
        obj5 = obj16;
        obj6 = obj17;
        obj7 = obj18;
        obj8 = obj19;
        obj9 = obj20;
        obj10 = obj21;
        obj11 = obj22;
        obj12 = obj23;
        obj14 = obj24;
        obj3 = obj25;
        obj13 = obj26;
        obj1 = new URL((new StringBuilder()).append(b).append("?").append(c()).toString());
_L10:
        obj4 = bufferedreader;
        obj5 = obj16;
        obj6 = obj17;
        obj7 = obj18;
        obj8 = obj19;
        obj9 = obj20;
        obj10 = obj21;
        obj11 = obj22;
        obj12 = obj23;
        obj14 = obj24;
        obj3 = obj25;
        obj13 = obj26;
        obj1 = (HttpURLConnection)((URL) (obj1)).openConnection();
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj13 = obj1;
        obj14 = obj1;
        a(((HttpURLConnection) (obj1)));
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj13 = obj1;
        obj14 = obj1;
        ((HttpURLConnection) (obj1)).setInstanceFollowRedirects(e);
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj13 = obj1;
        obj14 = obj1;
        ((HttpURLConnection) (obj1)).setDoInput(true);
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj13 = obj1;
        obj14 = obj1;
        ((HttpURLConnection) (obj1)).setUseCaches(false);
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj13 = obj1;
        obj14 = obj1;
        ((HttpURLConnection) (obj1)).setConnectTimeout(30000);
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj13 = obj1;
        obj14 = obj1;
        ((HttpURLConnection) (obj1)).setReadTimeout(30000);
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj13 = obj1;
        obj14 = obj1;
        if (android.os.Build.VERSION.SDK_INT <= 13)
        {
            break MISSING_BLOCK_LABEL_862;
        }
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj13 = obj1;
        obj14 = obj1;
        ((HttpURLConnection) (obj1)).setRequestProperty("Connection", "close");
_L15:
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj14 = obj1;
        obj3 = obj1;
        obj13 = obj1;
        bufferedreader = new BufferedReader(new InputStreamReader(((HttpURLConnection) (obj1)).getInputStream(), "UTF-8"));
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj14 = obj1;
        obj3 = obj1;
        obj13 = obj1;
        ((com.wf.wellsfargomobile.d.e) (obj2)).a(((HttpURLConnection) (obj1)).getResponseCode());
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj14 = obj1;
        obj3 = obj1;
        obj13 = obj1;
        ((com.wf.wellsfargomobile.d.e) (obj2)).a(((HttpURLConnection) (obj1)).getResponseMessage());
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj14 = obj1;
        obj3 = obj1;
        obj13 = obj1;
        ((com.wf.wellsfargomobile.d.e) (obj2)).a(((HttpURLConnection) (obj1)).getHeaderFields());
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj14 = obj1;
        obj3 = obj1;
        obj13 = obj1;
        ((com.wf.wellsfargomobile.d.e) (obj2)).a(((HttpURLConnection) (obj1)).getURL());
_L8:
        obj3 = bufferedreader.readLine();
        if (obj3 == null) goto _L7; else goto _L6
_L6:
        ((StringBuilder) (obj15)).append(((String) (obj3))).append("\n");
          goto _L8
        obj15;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj14 = obj1;
        obj3 = obj1;
        bufferedreader.close();
_L25:
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj14 = obj1;
        obj3 = obj1;
        obj13 = obj1;
        throw obj15;
        obj1;
_L36:
        obj3 = obj5;
        Log.e("NetworkCommunication", (new StringBuilder()).append("UnsupportedCharsetException e: ").append(obj1).append(" url: ").append(b).toString());
        obj3 = obj5;
        obj4 = new StringBuilder((new StringBuilder()).append("{\"status\":\"error\", \"errorCode\": \"-1\", \"errorMessage\": ").append(JSONObject.quote(((UnsupportedCharsetException) (obj1)).getMessage())).append(" }").toString());
        obj1 = obj4;
        if (obj5 != null)
        {
            ((HttpURLConnection) (obj5)).disconnect();
            obj1 = obj4;
        }
          goto _L9
_L5:
        obj4 = bufferedreader;
        obj5 = obj16;
        obj6 = obj17;
        obj7 = obj18;
        obj8 = obj19;
        obj9 = obj20;
        obj10 = obj21;
        obj11 = obj22;
        obj12 = obj23;
        obj14 = obj24;
        obj3 = obj25;
        obj13 = obj26;
        obj1 = new URL(b);
          goto _L10
        obj1;
_L35:
        obj3 = obj6;
        Log.e("NetworkCommunication", (new StringBuilder()).append("UnsupportedEncodingException e: ").append(obj1).append(" url: ").append(b).toString());
        obj3 = obj6;
        obj4 = new StringBuilder((new StringBuilder()).append("{\"status\":\"error\", \"errorCode\": \"-1\", \"errorMessage\": \"").append(JSONObject.quote(((UnsupportedEncodingException) (obj1)).getMessage())).append("\" }").toString());
        obj1 = obj4;
        if (obj6 != null)
        {
            ((HttpURLConnection) (obj6)).disconnect();
            obj1 = obj4;
        }
          goto _L9
_L3:
        obj4 = bufferedreader;
        obj5 = obj16;
        obj6 = obj17;
        obj7 = obj18;
        obj8 = obj19;
        obj9 = obj20;
        obj10 = obj21;
        obj11 = obj22;
        obj12 = obj23;
        obj14 = obj24;
        obj3 = obj25;
        obj13 = obj26;
        obj1 = (HttpURLConnection)(new URL(b)).openConnection();
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj13 = obj1;
        obj14 = obj1;
        a(((HttpURLConnection) (obj1)));
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj13 = obj1;
        obj14 = obj1;
        ((HttpURLConnection) (obj1)).setInstanceFollowRedirects(e);
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj13 = obj1;
        obj14 = obj1;
        ((HttpURLConnection) (obj1)).setDoInput(true);
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj13 = obj1;
        obj14 = obj1;
        ((HttpURLConnection) (obj1)).setUseCaches(false);
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj13 = obj1;
        obj14 = obj1;
        ((HttpURLConnection) (obj1)).setDoOutput(true);
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj13 = obj1;
        obj14 = obj1;
        ((HttpURLConnection) (obj1)).setChunkedStreamingMode(0);
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj13 = obj1;
        obj14 = obj1;
        ((HttpURLConnection) (obj1)).setRequestMethod("POST");
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj13 = obj1;
        obj14 = obj1;
        ((HttpURLConnection) (obj1)).setRequestProperty("charset", "utf-8");
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj13 = obj1;
        obj14 = obj1;
        ((HttpURLConnection) (obj1)).setConnectTimeout(30000);
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj13 = obj1;
        obj14 = obj1;
        ((HttpURLConnection) (obj1)).setReadTimeout(30000);
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj13 = obj1;
        obj14 = obj1;
        if (android.os.Build.VERSION.SDK_INT <= 13) goto _L12; else goto _L11
_L11:
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj13 = obj1;
        obj14 = obj1;
        ((HttpURLConnection) (obj1)).setRequestProperty("Connection", "close");
_L12:
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj13 = obj1;
        obj14 = obj1;
        if (!f) goto _L14; else goto _L13
_L13:
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj13 = obj1;
        obj14 = obj1;
        c(((HttpURLConnection) (obj1)));
          goto _L15
_L14:
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj13 = obj1;
        obj14 = obj1;
        b(((HttpURLConnection) (obj1)));
          goto _L15
_L7:
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj7 = obj1;
        obj8 = obj1;
        obj9 = obj1;
        obj10 = obj1;
        obj11 = obj1;
        obj12 = obj1;
        obj14 = obj1;
        obj3 = obj1;
        bufferedreader.close();
_L24:
        IOException ioexception;
        if (obj1 != null)
        {
            ((HttpURLConnection) (obj1)).disconnect();
            obj1 = obj15;
        } else
        {
            obj1 = obj15;
        }
          goto _L9
        obj1;
_L34:
        obj3 = obj7;
        Log.e("NetworkCommunication", (new StringBuilder()).append("ConnectTimeoutException  e: ").append(obj1).append(" url: ").append(b).toString());
        obj3 = obj7;
        obj4 = new StringBuilder((new StringBuilder()).append("{\"status\":\"error\", \"errorCode\": \"39663355873975\", \"errorMessage\": ").append(JSONObject.quote(((ConnectTimeoutException) (obj1)).getMessage())).append(" }").toString());
        obj1 = obj4;
        if (obj7 != null)
        {
            ((HttpURLConnection) (obj7)).disconnect();
            obj1 = obj4;
        }
          goto _L9
        obj1;
_L33:
        obj3 = obj8;
        Log.e("NetworkCommunication", (new StringBuilder()).append("ClientProtocolException e: ").append(obj1).append(" url: ").append(b).toString());
        obj3 = obj8;
        obj4 = new StringBuilder((new StringBuilder()).append("{\"status\":\"error\", \"errorCode\": \"39836504959399323305896\", \"errorMessage\": ").append(JSONObject.quote(((ClientProtocolException) (obj1)).getMessage())).append(" }").toString());
        obj1 = obj4;
        if (obj8 != null)
        {
            ((HttpURLConnection) (obj8)).disconnect();
            obj1 = obj4;
        }
          goto _L9
        obj1;
_L32:
        obj3 = obj9;
        Log.e("NetworkCommunication", (new StringBuilder()).append("SocketTimeoutException e: ").append(obj1).append(" url: ").append(b).toString());
        obj3 = obj9;
        obj4 = new StringBuilder((new StringBuilder()).append("{\"status\":\"error\", \"errorCode\": \"5873975\", \"errorMessage\": ").append(JSONObject.quote(((SocketTimeoutException) (obj1)).getMessage())).append(" }").toString());
        obj1 = obj4;
        if (obj9 != null)
        {
            ((HttpURLConnection) (obj9)).disconnect();
            obj1 = obj4;
        }
          goto _L9
        obj1;
_L31:
        obj3 = obj10;
        Log.e("NetworkCommunication", (new StringBuilder()).append("SSLPeerUnverifiedException e: ").append(obj1).append(" url: ").append(b).toString());
        obj3 = obj10;
        obj4 = new StringBuilder((new StringBuilder()).append("{\"status\":\"error\", \"errorCode\": \"2297643484833\", \"errorMessage\": ").append(JSONObject.quote(((SSLPeerUnverifiedException) (obj1)).getMessage())).append(" }").toString());
        obj1 = obj4;
        if (obj10 != null)
        {
            ((HttpURLConnection) (obj10)).disconnect();
            obj1 = obj4;
        }
          goto _L9
        obj1;
_L30:
        obj3 = obj11;
        Log.e("NetworkCommunication", (new StringBuilder()).append("UnknownHostException e: ").append(obj1).append(" url: ").append(b).toString());
        obj3 = obj11;
        obj4 = new StringBuilder((new StringBuilder()).append("{\"status\":\"error\", \"errorCode\": \"76869266925\", \"errorMessage\": ").append(JSONObject.quote(((UnknownHostException) (obj1)).getMessage())).append(" }").toString());
        obj1 = obj4;
        if (obj11 != null)
        {
            ((HttpURLConnection) (obj11)).disconnect();
            obj1 = obj4;
        }
          goto _L9
        obj1;
_L29:
        obj3 = obj12;
        Log.e("NetworkCommunication", (new StringBuilder()).append("SSLHandshakeException e: ").append(obj1).append(" url: ").append(b).toString());
        obj3 = obj12;
        obj4 = new StringBuilder((new StringBuilder()).append("{\"status\":\"error\", \"errorCode\": \"22961632618\", \"errorMessage\": ").append(JSONObject.quote(((SSLHandshakeException) (obj1)).getMessage())).append(" }").toString());
        obj1 = obj4;
        if (obj12 != null)
        {
            ((HttpURLConnection) (obj12)).disconnect();
            obj1 = obj4;
        }
          goto _L9
        obj1;
_L28:
        obj3 = obj14;
        Log.e("NetworkCommunication", (new StringBuilder()).append("EOFException e: ").append(obj1).append(" url: ").append(b).toString());
        obj3 = obj14;
        if (i >= 3) goto _L17; else goto _L16
_L16:
        obj3 = obj14;
        Log.w("NetworkCommunication", (new StringBuilder()).append("retry due to EOFException: tryCount: ").append(i).append(" MAX_TRIES: ").append(3).toString());
        obj3 = obj14;
        i = i + 1;
        obj3 = obj14;
        obj4 = b();
        obj3 = obj14;
        obj1 = new StringBuilder(((com.wf.wellsfargomobile.d.e) (obj4)).b());
        obj3 = obj1;
_L18:
        obj1 = obj3;
        obj2 = obj4;
        if (obj14 != null)
        {
            ((HttpURLConnection) (obj14)).disconnect();
            obj1 = obj3;
            obj2 = obj4;
        }
          goto _L9
_L17:
        obj3 = obj14;
        obj1 = new StringBuilder((new StringBuilder()).append("{\"status\":\"error\", \"errorCode\": \"394\", \"errorMessage\": ").append(JSONObject.quote(((EOFException) (obj1)).getMessage())).append(" }").toString());
        obj3 = obj1;
        obj4 = obj2;
          goto _L18
_L27:
        obj3 = obj13;
        Log.e("NetworkCommunication", (new StringBuilder()).append("IOException: ").append(((IOException) (obj1)).getMessage()).append(" actual exception: ").append(obj1.getClass().getCanonicalName()).append(" url: ").append(b).toString(), ((Throwable) (obj1)));
        obj4 = "-1";
        obj3 = obj13;
        obj5 = ((IOException) (obj1)).getMessage();
        obj1 = obj4;
        if (obj5 == null) goto _L20; else goto _L19
_L19:
        obj3 = obj13;
        if (!((String) (obj5)).contains("Hostname")) goto _L22; else goto _L21
_L21:
        obj3 = obj13;
        if (!((String) (obj5)).contains("was not verified")) goto _L22; else goto _L23
_L23:
        obj1 = "6925617369543484833";
_L38:
        obj3 = obj13;
        if (((String) (obj5)).contains("I/O error during system call, Connection reset by peer actual exception: javax.net.ssl.SSLException"))
        {
            obj1 = "396633589643235560334229";
        }
_L20:
        obj3 = obj13;
        obj4 = new StringBuilder((new StringBuilder()).append("{\"status\":\"error\", \"errorCode\": \"").append(((String) (obj1))).append("\", ").append("\"").append("errorMessage").append("\": ").append(JSONObject.quote(((String) (obj5)))).append(" }").toString());
        obj1 = obj4;
        if (obj13 != null)
        {
            ((HttpURLConnection) (obj13)).disconnect();
            obj1 = obj4;
        }
          goto _L9
        obj1;
_L26:
        if (obj3 != null)
        {
            ((HttpURLConnection) (obj3)).disconnect();
        }
        throw obj1;
        ioexception;
          goto _L24
        ioexception;
          goto _L25
        obj1;
          goto _L26
        obj1;
        obj13 = obj4;
          goto _L27
        obj1;
        obj14 = obj5;
          goto _L28
        obj1;
        obj12 = obj6;
          goto _L29
        obj1;
        obj11 = obj7;
          goto _L30
        obj1;
        obj10 = obj8;
          goto _L31
        obj1;
          goto _L32
        obj1;
        obj8 = obj10;
          goto _L33
        obj1;
        obj7 = obj11;
          goto _L34
        obj1;
        obj6 = obj12;
          goto _L35
        obj1;
        obj5 = obj13;
          goto _L36
        obj1;
        obj4 = obj14;
          goto _L37
_L22:
        obj1 = "-1";
          goto _L38
        obj1;
          goto _L27
    }
}
