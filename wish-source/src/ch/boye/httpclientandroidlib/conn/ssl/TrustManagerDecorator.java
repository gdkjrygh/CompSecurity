// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn.ssl;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

// Referenced classes of package ch.boye.httpclientandroidlib.conn.ssl:
//            TrustStrategy

class TrustManagerDecorator
    implements X509TrustManager
{

    private final X509TrustManager trustManager;
    private final TrustStrategy trustStrategy;

    TrustManagerDecorator(X509TrustManager x509trustmanager, TrustStrategy truststrategy)
    {
        trustManager = x509trustmanager;
        trustStrategy = truststrategy;
    }

    public void checkClientTrusted(X509Certificate ax509certificate[], String s)
        throws CertificateException
    {
        trustManager.checkClientTrusted(ax509certificate, s);
    }

    public void checkServerTrusted(X509Certificate ax509certificate[], String s)
        throws CertificateException
    {
        if (!trustStrategy.isTrusted(ax509certificate, s))
        {
            trustManager.checkServerTrusted(ax509certificate, s);
        }
    }

    public X509Certificate[] getAcceptedIssuers()
    {
        return trustManager.getAcceptedIssuers();
    }
}
