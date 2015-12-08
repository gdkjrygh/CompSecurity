// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;

// Referenced classes of package com.google.analytics.tracking.android:
//            Dispatcher, Utils, Log, Hit, 
//            HttpClientFactory, HitBuilder, AnalyticsStore

class SimpleNetworkDispatcher
    implements Dispatcher
{

    private static final String USER_AGENT_TEMPLATE = "%s/%s (Linux; U; Android %s; %s; %s Build/%s)";
    private final Context ctx;
    private final HttpClientFactory httpClientFactory;
    private final String userAgent;

    SimpleNetworkDispatcher(AnalyticsStore analyticsstore, HttpClientFactory httpclientfactory, Context context)
    {
        this(httpclientfactory, context);
    }

    SimpleNetworkDispatcher(HttpClientFactory httpclientfactory, Context context)
    {
        ctx = context.getApplicationContext();
        userAgent = createUserAgentString("GoogleAnalytics", "2.0", android.os.Build.VERSION.RELEASE, Utils.getLanguage(Locale.getDefault()), Build.MODEL, Build.ID);
        httpClientFactory = httpclientfactory;
    }

    private HttpEntityEnclosingRequest buildRequest(String s, String s1)
    {
        String s2;
        if (TextUtils.isEmpty(s))
        {
            Log.w("Empty hit, discarding.");
            return null;
        }
        s2 = (new StringBuilder()).append(s1).append("?").append(s).toString();
        if (s2.length() >= 2036) goto _L2; else goto _L1
_L1:
        s = new BasicHttpEntityEnclosingRequest("GET", s2);
_L4:
        s.addHeader("User-Agent", userAgent);
        return s;
_L2:
        s1 = new BasicHttpEntityEnclosingRequest("POST", s1);
        try
        {
            s1.setEntity(new StringEntity(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w("Encoding error, discarding hit");
            return null;
        }
        s = s1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private URL getUrl(Hit hit)
    {
        if (TextUtils.isEmpty(hit.getHitUrl()))
        {
            return null;
        }
        try
        {
            hit = new URL(hit.getHitUrl());
        }
        // Misplaced declaration of an exception variable
        catch (Hit hit)
        {
            try
            {
                hit = new URL("http://www.google-analytics.com/collect");
            }
            // Misplaced declaration of an exception variable
            catch (Hit hit)
            {
                return null;
            }
            return hit;
        }
        return hit;
    }

    private void logDebugInformation(boolean flag, HttpEntityEnclosingRequest httpentityenclosingrequest)
    {
        StringBuffer stringbuffer;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        stringbuffer = new StringBuffer();
        org.apache.http.Header aheader[] = httpentityenclosingrequest.getAllHeaders();
        int k = aheader.length;
        for (int i = 0; i < k; i++)
        {
            stringbuffer.append(aheader[i].toString()).append("\n");
        }

        stringbuffer.append(httpentityenclosingrequest.getRequestLine().toString()).append("\n");
        if (httpentityenclosingrequest.getEntity() == null)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        httpentityenclosingrequest = httpentityenclosingrequest.getEntity().getContent();
        if (httpentityenclosingrequest == null)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        int j = httpentityenclosingrequest.available();
        if (j > 0)
        {
            try
            {
                byte abyte0[] = new byte[j];
                httpentityenclosingrequest.read(abyte0);
                stringbuffer.append("POST:\n");
                stringbuffer.append(new String(abyte0)).append("\n");
            }
            // Misplaced declaration of an exception variable
            catch (HttpEntityEnclosingRequest httpentityenclosingrequest)
            {
                Log.w("Error Writing hit to log...");
            }
        }
        Log.i(stringbuffer.toString());
    }

    String createUserAgentString(String s, String s1, String s2, String s3, String s4, String s5)
    {
        return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] {
            s, s1, s2, s3, s4, s5
        });
    }

    public int dispatchHits(List list)
    {
        int i;
        int j;
        int k;
        i = 0;
        k = Math.min(list.size(), 40);
        j = 0;
_L2:
        Object obj;
        HttpClient httpclient;
        HttpHost httphost;
        Object obj1;
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        httpclient = httpClientFactory.newInstance();
        obj = (Hit)list.get(j);
        obj1 = getUrl(((Hit) (obj)));
        if (obj1 == null)
        {
            if (Log.debugEnabled())
            {
                Log.w((new StringBuilder()).append("No destination: discarding hit: ").append(((Hit) (obj)).getHitParams()).toString());
            } else
            {
                Log.w("No destination: discarding hit.");
            }
            i++;
        } else
        {
label0:
            {
                httphost = new HttpHost(((URL) (obj1)).getHost(), ((URL) (obj1)).getPort(), ((URL) (obj1)).getProtocol());
                obj1 = ((URL) (obj1)).getPath();
                if (TextUtils.isEmpty(((Hit) (obj)).getHitParams()))
                {
                    obj = "";
                } else
                {
                    obj = HitBuilder.postProcessHit(((Hit) (obj)), System.currentTimeMillis());
                }
                obj1 = buildRequest(((String) (obj)), ((String) (obj1)));
                if (obj1 != null)
                {
                    break label0;
                }
                i++;
            }
        }
_L5:
        j++;
        if (true) goto _L2; else goto _L1
        ((HttpEntityEnclosingRequest) (obj1)).addHeader("Host", httphost.toHostString());
        logDebugInformation(Log.debugEnabled(), ((HttpEntityEnclosingRequest) (obj1)));
        if (((String) (obj)).length() <= 8192) goto _L4; else goto _L3
_L3:
        Log.w("Hit too long (> 8192 bytes)--not sent");
_L7:
        i++;
          goto _L5
_L4:
        obj = httpclient.execute(httphost, ((org.apache.http.HttpRequest) (obj1)));
        if (((HttpResponse) (obj)).getStatusLine().getStatusCode() == 200) goto _L7; else goto _L6
_L6:
        Log.w((new StringBuilder()).append("Bad response: ").append(((HttpResponse) (obj)).getStatusLine().getStatusCode()).toString());
_L1:
        return i;
        ClientProtocolException clientprotocolexception;
        clientprotocolexception;
        Log.w("ClientProtocolException sending hit; discarding hit...");
          goto _L7
        list;
        Log.w((new StringBuilder()).append("Exception sending hit: ").append(list.getClass().getSimpleName()).toString());
        Log.w(list.getMessage());
        return i;
    }

    public boolean okToDispatch()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)ctx.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            Log.vDebug("...no network connectivity");
            return false;
        } else
        {
            return true;
        }
    }
}
