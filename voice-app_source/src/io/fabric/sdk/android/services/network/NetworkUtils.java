// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.network;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

// Referenced classes of package io.fabric.sdk.android.services.network:
//            PinningTrustManager, SystemKeyStore, PinningInfoProvider

public final class NetworkUtils
{

    private NetworkUtils()
    {
    }

    public static final SSLSocketFactory getSSLSocketFactory(PinningInfoProvider pinninginfoprovider)
        throws KeyManagementException, NoSuchAlgorithmException
    {
        SSLContext sslcontext = SSLContext.getInstance("TLS");
        sslcontext.init(null, new TrustManager[] {
            new PinningTrustManager(new SystemKeyStore(pinninginfoprovider.getKeyStoreStream(), pinninginfoprovider.getKeyStorePassword()), pinninginfoprovider)
        }, null);
        return sslcontext.getSocketFactory();
    }
}
