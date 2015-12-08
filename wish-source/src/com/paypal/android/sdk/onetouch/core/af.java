// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public final class af
    implements X509TrustManager
{

    private X509TrustManager a;

    public af(KeyStore keystore)
    {
        a = null;
        keystore = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        keystore.init(null);
        keystore = keystore.getTrustManagers();
        if (keystore.length == 0)
        {
            throw new NoSuchAlgorithmException("no trust manager found");
        } else
        {
            a = (X509TrustManager)keystore[0];
            return;
        }
    }

    public final void checkClientTrusted(X509Certificate ax509certificate[], String s)
    {
        a.checkClientTrusted(ax509certificate, s);
    }

    public final void checkServerTrusted(X509Certificate ax509certificate[], String s)
    {
        if (ax509certificate != null && ax509certificate.length == 1)
        {
            ax509certificate[0].checkValidity();
            return;
        } else
        {
            a.checkServerTrusted(ax509certificate, s);
            return;
        }
    }

    public final X509Certificate[] getAcceptedIssuers()
    {
        return a.getAcceptedIssuers();
    }
}
