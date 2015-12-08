// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.utils;

import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

public class ConnectionManager
{
    private static class ConnectionManagerHolder
    {

        public static final ConnectionManager INSTANCE = new ConnectionManager();


        private ConnectionManagerHolder()
        {
        }
    }


    private HttpClient httpClient;

    private ConnectionManager()
    {
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basichttpparams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(basichttpparams, "utf-8");
        basichttpparams.setBooleanParameter("http.protocol.expect-continue", false);
        basichttpparams.setParameter("http.useragent", "HockeySDK/Android");
        SchemeRegistry schemeregistry = new SchemeRegistry();
        schemeregistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        SSLSocketFactory sslsocketfactory = SSLSocketFactory.getSocketFactory();
        sslsocketfactory.setHostnameVerifier(SSLSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
        schemeregistry.register(new Scheme("https", sslsocketfactory, 443));
        httpClient = new DefaultHttpClient(new ThreadSafeClientConnManager(basichttpparams, schemeregistry), basichttpparams);
    }


    public static ConnectionManager getInstance()
    {
        return ConnectionManagerHolder.INSTANCE;
    }

    public HttpClient getHttpClient()
    {
        return httpClient;
    }
}
