// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;

import ch.boye.httpclientandroidlib.HttpVersion;
import ch.boye.httpclientandroidlib.client.protocol.RequestAddCookies;
import ch.boye.httpclientandroidlib.client.protocol.RequestAuthCache;
import ch.boye.httpclientandroidlib.client.protocol.RequestClientConnControl;
import ch.boye.httpclientandroidlib.client.protocol.RequestDefaultHeaders;
import ch.boye.httpclientandroidlib.client.protocol.RequestProxyAuthentication;
import ch.boye.httpclientandroidlib.client.protocol.RequestTargetAuthentication;
import ch.boye.httpclientandroidlib.client.protocol.ResponseProcessCookies;
import ch.boye.httpclientandroidlib.conn.ClientConnectionManager;
import ch.boye.httpclientandroidlib.params.HttpConnectionParams;
import ch.boye.httpclientandroidlib.params.HttpParams;
import ch.boye.httpclientandroidlib.params.HttpProtocolParams;
import ch.boye.httpclientandroidlib.params.SyncBasicHttpParams;
import ch.boye.httpclientandroidlib.protocol.BasicHttpProcessor;
import ch.boye.httpclientandroidlib.protocol.HTTP;
import ch.boye.httpclientandroidlib.protocol.RequestContent;
import ch.boye.httpclientandroidlib.protocol.RequestExpectContinue;
import ch.boye.httpclientandroidlib.protocol.RequestTargetHost;
import ch.boye.httpclientandroidlib.protocol.RequestUserAgent;
import ch.boye.httpclientandroidlib.util.VersionInfo;
import java.nio.charset.Charset;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client:
//            AbstractHttpClient

public class DefaultHttpClient extends AbstractHttpClient
{

    public DefaultHttpClient()
    {
        super(null, null);
    }

    public DefaultHttpClient(ClientConnectionManager clientconnectionmanager)
    {
        super(clientconnectionmanager, null);
    }

    public DefaultHttpClient(ClientConnectionManager clientconnectionmanager, HttpParams httpparams)
    {
        super(clientconnectionmanager, httpparams);
    }

    public DefaultHttpClient(HttpParams httpparams)
    {
        super(null, httpparams);
    }

    public static void setDefaultHttpParams(HttpParams httpparams)
    {
        HttpProtocolParams.setVersion(httpparams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setContentCharset(httpparams, HTTP.DEF_CONTENT_CHARSET.name());
        HttpConnectionParams.setTcpNoDelay(httpparams, true);
        HttpConnectionParams.setSocketBufferSize(httpparams, 8192);
        Object obj = VersionInfo.loadVersionInfo("ch.boye.httpclientandroidlib.client", ch/boye/httpclientandroidlib/impl/client/DefaultHttpClient.getClassLoader());
        if (obj != null)
        {
            obj = ((VersionInfo) (obj)).getRelease();
        } else
        {
            obj = "UNAVAILABLE";
        }
        HttpProtocolParams.setUserAgent(httpparams, (new StringBuilder()).append("Apache-HttpClient/").append(((String) (obj))).append(" (java 1.5)").toString());
    }

    protected HttpParams createHttpParams()
    {
        SyncBasicHttpParams syncbasichttpparams = new SyncBasicHttpParams();
        setDefaultHttpParams(syncbasichttpparams);
        return syncbasichttpparams;
    }

    protected BasicHttpProcessor createHttpProcessor()
    {
        BasicHttpProcessor basichttpprocessor = new BasicHttpProcessor();
        basichttpprocessor.addInterceptor(new RequestDefaultHeaders());
        basichttpprocessor.addInterceptor(new RequestContent());
        basichttpprocessor.addInterceptor(new RequestTargetHost());
        basichttpprocessor.addInterceptor(new RequestClientConnControl());
        basichttpprocessor.addInterceptor(new RequestUserAgent());
        basichttpprocessor.addInterceptor(new RequestExpectContinue());
        basichttpprocessor.addInterceptor(new RequestAddCookies());
        basichttpprocessor.addInterceptor(new ResponseProcessCookies());
        basichttpprocessor.addInterceptor(new RequestAuthCache());
        basichttpprocessor.addInterceptor(new RequestTargetAuthentication());
        basichttpprocessor.addInterceptor(new RequestProxyAuthentication());
        return basichttpprocessor;
    }
}
