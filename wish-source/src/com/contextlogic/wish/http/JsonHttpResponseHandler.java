// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.http;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HttpEntity;
import ch.boye.httpclientandroidlib.HttpResponse;
import ch.boye.httpclientandroidlib.StatusLine;
import ch.boye.httpclientandroidlib.client.HttpResponseException;
import ch.boye.httpclientandroidlib.client.methods.HttpUriRequest;
import com.contextlogic.wish.api.core.JsonObjectStreamingParser;
import com.google.gson.stream.JsonReader;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.http:
//            StringHttpResponseHandler

public class JsonHttpResponseHandler extends StringHttpResponseHandler
{

    public JsonHttpResponseHandler()
    {
    }

    public void handleFailure(HttpUriRequest httpurirequest, Throwable throwable, Object obj)
    {
        onFailure(throwable, (JSONObject)obj);
    }

    public void handleSuccess(HttpUriRequest httpurirequest, Object obj)
    {
        if (obj == null)
        {
            onFailure(null, (JSONObject)obj);
            return;
        } else
        {
            onSuccess((JSONObject)obj);
            return;
        }
    }

    public void onFailure(Throwable throwable, JSONObject jsonobject)
    {
    }

    public void onSuccess(JSONObject jsonobject)
    {
    }

    public Object preprocessFailure(Throwable throwable, Object obj)
    {
        return obj;
    }

    public Object preprocessSuccess(Object obj)
    {
        return obj;
    }

    public void receiveResponse(HttpUriRequest httpurirequest, HttpResponse httpresponse)
    {
        Object obj;
        Object obj1;
        StatusLine statusline = httpresponse.getStatusLine();
        obj = null;
        Object obj2;
        try
        {
            obj1 = httpresponse.getEntity();
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            requestFailed(httpurirequest, null, null);
            return;
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        obj = ((HttpEntity) (obj1)).getContent();
        obj1 = httpresponse.getFirstHeader("Content-Encoding");
        httpresponse = ((HttpResponse) (obj));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        httpresponse = ((HttpResponse) (obj));
        if (((Header) (obj1)).getValue().equalsIgnoreCase("gzip"))
        {
            httpresponse = new GZIPInputStream(((java.io.InputStream) (obj)));
        }
        obj2 = null;
        obj1 = new JsonReader(new InputStreamReader(httpresponse, "UTF-8"));
        httpresponse = (new JsonObjectStreamingParser()).parseJsonObject(((JsonReader) (obj1)));
        obj = httpresponse;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        ((JsonReader) (obj1)).close();
        obj = httpresponse;
        if (statusline.getStatusCode() != 200)
        {
            requestFailed(httpurirequest, new HttpResponseException(statusline.getStatusCode(), statusline.getReasonPhrase()), obj);
            return;
        } else
        {
            requestSucceeded(httpurirequest, obj);
            return;
        }
        obj;
        httpresponse = obj2;
_L2:
        if (httpresponse == null)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        httpresponse.close();
        throw obj;
        obj;
        httpresponse = ((HttpResponse) (obj1));
        if (true) goto _L2; else goto _L1
_L1:
    }
}
