// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.network;

import com.google.android.apps.youtube.common.L;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;

// Referenced classes of package com.google.android.apps.youtube.common.network:
//            f, e, i

public final class l
{

    public static AbstractHttpClient a(String s)
    {
        L.e((new StringBuilder("HttpClient.UserAgent: ")).append(s).toString());
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setStaleCheckingEnabled(basichttpparams, false);
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 20000);
        HttpConnectionParams.setSoTimeout(basichttpparams, 20000);
        HttpConnectionParams.setSocketBufferSize(basichttpparams, 8192);
        HttpClientParams.setRedirecting(basichttpparams, true);
        HttpProtocolParams.setUserAgent(basichttpparams, (new StringBuilder()).append(s).append(" gzip").toString());
        s = new SchemeRegistry();
        s.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        s.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
        ConnManagerParams.setMaxConnectionsPerRoute(basichttpparams, new ConnPerRouteBean(16));
        s = new DefaultHttpClient(new ThreadSafeClientConnManager(basichttpparams, s), basichttpparams);
        s.addResponseInterceptor(new f());
        s.setCookieStore(new e());
        return s;
    }

    public static AbstractHttpClient b(String s)
    {
        s = a(s);
        s.setRedirectHandler(new i());
        s.setCookieStore(new e());
        return s;
    }
}
