// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.network;

import io.fabric.sdk.android.DefaultLogger;
import io.fabric.sdk.android.Logger;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

// Referenced classes of package io.fabric.sdk.android.services.network:
//            HttpRequestFactory, NetworkUtils, HttpMethod, HttpRequest, 
//            PinningInfoProvider

public class DefaultHttpRequestFactory
    implements HttpRequestFactory
{

    private static final String HTTPS = "https";
    private boolean attemptedSslInit;
    private final Logger logger;
    private PinningInfoProvider pinningInfo;
    private SSLSocketFactory sslSocketFactory;

    public DefaultHttpRequestFactory()
    {
        this(((Logger) (new DefaultLogger())));
    }

    public DefaultHttpRequestFactory(Logger logger1)
    {
        logger = logger1;
    }

    private SSLSocketFactory getSSLSocketFactory()
    {
        this;
        JVM INSTR monitorenter ;
        SSLSocketFactory sslsocketfactory;
        if (sslSocketFactory == null && !attemptedSslInit)
        {
            sslSocketFactory = initSSLSocketFactory();
        }
        sslsocketfactory = sslSocketFactory;
        this;
        JVM INSTR monitorexit ;
        return sslsocketfactory;
        Exception exception;
        exception;
        throw exception;
    }

    private SSLSocketFactory initSSLSocketFactory()
    {
        this;
        JVM INSTR monitorenter ;
        attemptedSslInit = true;
        SSLSocketFactory sslsocketfactory;
        sslsocketfactory = NetworkUtils.getSSLSocketFactory(pinningInfo);
        logger.d("Fabric", "Custom SSL pinning enabled");
_L2:
        this;
        JVM INSTR monitorexit ;
        return sslsocketfactory;
        Object obj;
        obj;
        logger.e("Fabric", "Exception while validating pinned certs", ((Throwable) (obj)));
        obj = null;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
    }

    private boolean isHttps(String s)
    {
        return s != null && s.toLowerCase(Locale.US).startsWith("https");
    }

    private void resetSSLSocketFactory()
    {
        this;
        JVM INSTR monitorenter ;
        attemptedSslInit = false;
        sslSocketFactory = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public HttpRequest buildHttpRequest(HttpMethod httpmethod, String s)
    {
        return buildHttpRequest(httpmethod, s, Collections.emptyMap());
    }

    public HttpRequest buildHttpRequest(HttpMethod httpmethod, String s, Map map)
    {
        static class _cls1
        {

            static final int $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod[];

            static 
            {
                $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod = new int[HttpMethod.values().length];
                try
                {
                    $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod[HttpMethod.GET.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod[HttpMethod.POST.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod[HttpMethod.PUT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod[HttpMethod.DELETE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.io.fabric.sdk.android.services.network.HttpMethod[httpmethod.ordinal()];
        JVM INSTR tableswitch 1 4: default 40
    //                   1 50
    //                   2 94
    //                   3 104
    //                   4 112;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        throw new IllegalArgumentException("Unsupported HTTP method!");
_L2:
        httpmethod = HttpRequest.get(s, map, true);
_L7:
        if (isHttps(s) && pinningInfo != null)
        {
            s = getSSLSocketFactory();
            if (s != null)
            {
                ((HttpsURLConnection)httpmethod.getConnection()).setSSLSocketFactory(s);
            }
        }
        return httpmethod;
_L3:
        httpmethod = HttpRequest.post(s, map, true);
        continue; /* Loop/switch isn't completed */
_L4:
        httpmethod = HttpRequest.put(s);
        continue; /* Loop/switch isn't completed */
_L5:
        httpmethod = HttpRequest.delete(s);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public PinningInfoProvider getPinningInfoProvider()
    {
        return pinningInfo;
    }

    public void setPinningInfoProvider(PinningInfoProvider pinninginfoprovider)
    {
        if (pinningInfo != pinninginfoprovider)
        {
            pinningInfo = pinninginfoprovider;
            resetSSLSocketFactory();
        }
    }
}
