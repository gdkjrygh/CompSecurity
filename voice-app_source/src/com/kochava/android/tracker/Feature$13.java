// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import com.kochava.android.util.Logging;
import com.kochava.android.util.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONObject;

// Referenced classes of package com.kochava.android.tracker:
//            Feature

static final class val.e extends Thread
{

    final Exception val$e;

    public void run()
    {
        Object obj;
        Feature.access$1402(true);
        Object obj1 = val$e.getMessage();
        obj = new JSONObject();
        ((JSONObject) (obj)).put("message", obj1);
        ((JSONObject) (obj)).put("os_version", Feature.access$2500());
        ((JSONObject) (obj)).put("device", (new StringBuilder()).append(Feature.access$4300()).append("-").append(Feature.access$4400()).toString());
        obj1 = new JSONObject();
        ((JSONObject) (obj1)).put("kochava_device_id", Feature.access$1800());
        ((JSONObject) (obj1)).put("action", "error");
        ((JSONObject) (obj1)).put("data", obj);
        ((JSONObject) (obj1)).put("kochava_app_id", Feature.access$500());
        ((JSONObject) (obj1)).put("sdk_version", (new StringBuilder()).append("Android20150511").append(Feature.versionExtension).toString());
        obj = new DefaultHttpClient();
        HttpProtocolParams.setUserAgent(((DefaultHttpClient) (obj)).getParams(), Feature.access$300());
        Object obj2 = ((JSONObject) (obj1)).toString();
        Logging.Log((new StringBuilder()).append("https log - posting to ").append("http://").append(Feature.access$400()).append("/track/kvTracker.php").toString());
        Logging.Log((new StringBuilder()).append("https log data: ").append(((String) (obj2))).toString());
        obj1 = new HttpPost((new StringBuilder()).append("http://").append(Feature.access$400()).append("/track/kvTracker.php").toString());
        obj2 = new StringEntity((new StringBuilder()).append("[").append(((String) (obj2))).append("]").toString(), "UTF-8");
        BasicHeader basicheader = new BasicHeader("Content-Type", "application/xml");
        ((HttpPost) (obj1)).getParams().setBooleanParameter("http.protocol.expect-continue", false);
        ((StringEntity) (obj2)).setContentType(basicheader);
        ((HttpPost) (obj1)).setEntity(((HttpEntity) (obj2)));
        Logging.Log("Trying to post an https failure log.");
        obj = ((DefaultHttpClient) (obj)).execute(((org.apache.http.client.methods.HttpUriRequest) (obj1))).getEntity();
        if (obj == null)
        {
            try
            {
                Logging.Log("https failure - did not get response back");
                return;
            }
            catch (Exception exception)
            {
                Logging.LogError((new StringBuilder()).append("httpsFail ").append(exception).toString());
            }
            break MISSING_BLOCK_LABEL_417;
        }
        Logging.Log("https failure log, Grabbing Result...");
        obj = StringUtils.inputStreamToString(((HttpEntity) (obj)).getContent());
        Logging.Log((new StringBuilder()).append("https failure log, Result: ").append(((String) (obj))).toString());
        return;
    }

    (Exception exception)
    {
        val$e = exception;
        super();
    }
}
