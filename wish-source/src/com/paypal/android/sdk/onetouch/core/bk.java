// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.util.Log;
import java.net.Socket;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.apache.http.conn.ssl.AllowAllHostnameVerifier;
import org.apache.http.conn.ssl.SSLSocketFactory;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            bj

public final class bk extends SSLSocketFactory
{

    private javax.net.ssl.SSLSocketFactory a;

    public bk()
    {
        super(null);
        try
        {
            SSLContext sslcontext = SSLContext.getInstance("TLS");
            sslcontext.init(null, new TrustManager[] {
                new bj()
            }, null);
            a = sslcontext.getSocketFactory();
            setHostnameVerifier(new AllowAllHostnameVerifier());
            return;
        }
        catch (Exception exception)
        {
            Log.e("paypal.sdk", (new StringBuilder("TrustAllSSLSocketFactory caught exception ")).append(exception.getMessage()).toString());
        }
    }

    public final Socket createSocket()
    {
        return a.createSocket();
    }

    public final Socket createSocket(Socket socket, String s, int i, boolean flag)
    {
        return a.createSocket(socket, s, i, flag);
    }
}
