// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.utils;

import java.security.KeyStore;
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

// Referenced classes of package com.jiubang.commerce.utils:
//            m

public class c
{

    public static HttpClient a(HttpParams httpparams)
    {
        Object obj;
        m m1;
        try
        {
            KeyStore keystore = KeyStore.getInstance(KeyStore.getDefaultType());
            keystore.load(null, null);
            m1 = new m(keystore);
            m1.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
        }
        // Misplaced declaration of an exception variable
        catch (HttpParams httpparams)
        {
            return new DefaultHttpClient();
        }
        obj = httpparams;
        if (httpparams != null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        obj = new BasicHttpParams();
        HttpProtocolParams.setVersion(((HttpParams) (obj)), HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(((HttpParams) (obj)), "UTF-8");
        httpparams = new SchemeRegistry();
        httpparams.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        httpparams.register(new Scheme("https", m1, 443));
        httpparams = new DefaultHttpClient(new ThreadSafeClientConnManager(((HttpParams) (obj)), httpparams), ((HttpParams) (obj)));
        return httpparams;
    }
}
