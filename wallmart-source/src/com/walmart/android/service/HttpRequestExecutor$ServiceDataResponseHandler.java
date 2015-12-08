// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import android.util.Log;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

// Referenced classes of package com.walmart.android.service:
//            HttpRequestExecutor, Utils, ServiceData

private class <init>
    implements ResponseHandler
{

    final HttpRequestExecutor this$0;

    public ServiceData handleResponse(HttpResponse httpresponse)
        throws IOException
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = httpresponse.getFirstHeader("Content-Encoding");
        if (obj1 == null || !((Header) (obj1)).getValue().equalsIgnoreCase("gzip")) goto _L2; else goto _L1
_L1:
        obj = httpresponse.getEntity();
        GZIPInputStream gzipinputstream = new GZIPInputStream(((HttpEntity) (obj)).getContent());
        obj1 = EntityUtils.getContentCharSet(((HttpEntity) (obj)));
        obj = obj1;
        if (obj1 == null)
        {
            obj = "ISO-8859-1";
        }
        obj = Utils.inputStreamToString(gzipinputstream, ((String) (obj)));
        gzipinputstream.close();
_L4:
        httpresponse = new ServiceData(httpresponse, ((String) (obj)));
        HttpRequestExecutor.access$202(HttpRequestExecutor.this, httpresponse.getResponseDate());
        return httpresponse;
_L2:
        obj1 = httpresponse.getEntity();
        if (obj1 == null)
        {
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
        obj1 = EntityUtils.toString(((HttpEntity) (obj1)));
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        Object obj2;
        obj2;
        Log.w(HttpRequestExecutor.access$100(), "Found ParseException when handling the response", ((Throwable) (obj2)));
        continue; /* Loop/switch isn't completed */
        obj2;
        Log.w(HttpRequestExecutor.access$100(), "Found IOException when handling the response", ((Throwable) (obj2)));
        if (true) goto _L4; else goto _L3
_L3:
    }

    public volatile Object handleResponse(HttpResponse httpresponse)
        throws ClientProtocolException, IOException
    {
        return handleResponse(httpresponse);
    }

    private ()
    {
        this$0 = HttpRequestExecutor.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
