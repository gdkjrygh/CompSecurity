// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.utils;

import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.client.HttpClient;
import ch.boye.httpclientandroidlib.conn.ClientConnectionManager;
import ch.boye.httpclientandroidlib.util.EntityUtils;
import java.io.IOException;

public class HttpClientUtils
{

    private HttpClientUtils()
    {
    }

    public static void closeQuietly(HttpResponse httpresponse)
    {
        if (httpresponse == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        httpresponse = httpresponse.getEntity();
        if (httpresponse == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        EntityUtils.consume(httpresponse);
        return;
        httpresponse;
    }

    public static void closeQuietly(HttpClient httpclient)
    {
        if (httpclient != null)
        {
            httpclient.getConnectionManager().shutdown();
        }
    }
}
