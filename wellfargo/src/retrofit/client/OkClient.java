// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.client;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.OkUrlFactory;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

// Referenced classes of package retrofit.client:
//            UrlConnectionClient, Request

public class OkClient extends UrlConnectionClient
{

    private final OkUrlFactory okUrlFactory;

    public OkClient()
    {
        this(generateDefaultOkHttp());
    }

    public OkClient(OkHttpClient okhttpclient)
    {
        okUrlFactory = new OkUrlFactory(okhttpclient);
    }

    private static OkHttpClient generateDefaultOkHttp()
    {
        OkHttpClient okhttpclient = new OkHttpClient();
        okhttpclient.setConnectTimeout(15000L, TimeUnit.MILLISECONDS);
        okhttpclient.setReadTimeout(20000L, TimeUnit.MILLISECONDS);
        return okhttpclient;
    }

    protected HttpURLConnection openConnection(Request request)
    {
        return okUrlFactory.open(new URL(request.getUrl()));
    }
}
