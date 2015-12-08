// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.a.d;

import com.google.android.apps.ytremote.util.c;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

// Referenced classes of package com.google.android.apps.ytremote.a.d:
//            c

public final class a
{

    private static DefaultHttpClient a;
    private static DefaultHttpClient b;
    private static DefaultHttpClient c;
    private static String d;

    public static DefaultHttpClient a()
    {
        com/google/android/apps/ytremote/a/d/a;
        JVM INSTR monitorenter ;
        DefaultHttpClient defaulthttpclient;
        if (a == null)
        {
            com.google.android.apps.ytremote.util.c.a(d);
            a = a(3000, 5000);
        }
        defaulthttpclient = a;
        com/google/android/apps/ytremote/a/d/a;
        JVM INSTR monitorexit ;
        return defaulthttpclient;
        Exception exception;
        exception;
        throw exception;
    }

    private static DefaultHttpClient a(int i, int j)
    {
        Object obj = SSLSocketFactory.getSocketFactory();
        ((SSLSocketFactory) (obj)).setHostnameVerifier(new com.google.android.apps.ytremote.a.d.c());
        DefaultHttpClient defaulthttpclient = new DefaultHttpClient();
        ClientConnectionManager clientconnectionmanager = defaulthttpclient.getConnectionManager();
        clientconnectionmanager.getSchemeRegistry().register(new Scheme("https", ((org.apache.http.conn.scheme.SocketFactory) (obj)), 443));
        clientconnectionmanager.getSchemeRegistry().register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        obj = defaulthttpclient.getParams();
        ((HttpParams) (obj)).setParameter("http.conn-manager.max-total", Integer.valueOf(30));
        HttpConnectionParams.setConnectionTimeout(((HttpParams) (obj)), i);
        HttpConnectionParams.setSoTimeout(((HttpParams) (obj)), j);
        HttpProtocolParams.setUserAgent(((HttpParams) (obj)), d);
        return new DefaultHttpClient(new ThreadSafeClientConnManager(((HttpParams) (obj)), clientconnectionmanager.getSchemeRegistry()), ((HttpParams) (obj)));
    }

    public static void a(String s)
    {
        d = s;
    }

    public static DefaultHttpClient b()
    {
        com/google/android/apps/ytremote/a/d/a;
        JVM INSTR monitorenter ;
        DefaultHttpClient defaulthttpclient;
        if (b == null)
        {
            com.google.android.apps.ytremote.util.c.a(d);
            b = a(15000, 20000);
        }
        defaulthttpclient = b;
        com/google/android/apps/ytremote/a/d/a;
        JVM INSTR monitorexit ;
        return defaulthttpclient;
        Exception exception;
        exception;
        throw exception;
    }

    public static DefaultHttpClient c()
    {
        com/google/android/apps/ytremote/a/d/a;
        JVM INSTR monitorenter ;
        DefaultHttpClient defaulthttpclient;
        if (c == null)
        {
            com.google.android.apps.ytremote.util.c.a(d);
            c = a(1800, 1800);
        }
        defaulthttpclient = c;
        com/google/android/apps/ytremote/a/d/a;
        JVM INSTR monitorexit ;
        return defaulthttpclient;
        Exception exception;
        exception;
        throw exception;
    }
}
