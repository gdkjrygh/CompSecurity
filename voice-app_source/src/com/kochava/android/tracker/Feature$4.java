// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.kochava.android.util.Logging;
import com.kochava.android.util.StringUtils;
import java.io.IOException;
import javax.net.ssl.SSLException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kochava.android.tracker:
//            Feature

static final class xception
    implements Runnable
{

    public void run()
    {
        int i;
        int j;
        j = 60;
        i = j;
        Object obj = Feature.access$200(true);
        i = j;
        HttpProtocolParams.setUserAgent(((HttpClient) (obj)).getParams(), Feature.access$300());
        i = j;
        if (Feature.access$400() == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        i = j;
        if (!Feature.access$400().trim().isEmpty())
        {
            break MISSING_BLOCK_LABEL_74;
        }
        i = j;
        Logging.Log("KVquery - hostControl was empty, using default");
        i = j;
        Feature.access$402("control.kochava.com");
        i = j;
        Object obj2 = (new StringBuilder()).append("https://").append(Feature.access$400()).append("/track/kvquery").toString();
        i = j;
        Logging.Log((new StringBuilder()).append("KVquery - posting to ").append(((String) (obj2))).toString());
        i = j;
        obj2 = new HttpPost(((String) (obj2)));
        i = j;
        Object obj3 = new JSONObject();
        i = j;
        ((JSONObject) (obj3)).put("action", "get_attribution");
        i = j;
        ((JSONObject) (obj3)).put("kochava_app_id", Feature.access$500());
        i = j;
        ((JSONObject) (obj3)).put("kochava_device_id", Feature.access$1800());
        i = j;
        ((JSONObject) (obj3)).put("sdk_version", (new StringBuilder()).append("Android20150511").append(Feature.versionExtension).toString());
        i = j;
        ((JSONObject) (obj3)).put("sdk_protocol", "3");
        i = j;
        obj3 = ((JSONObject) (obj3)).toString();
        i = j;
        Logging.Log((new StringBuilder()).append("KVquery data:").append(((String) (obj3))).toString());
        i = j;
        obj3 = new StringEntity(((String) (obj3)), "UTF-8");
        i = j;
        BasicHeader basicheader = new BasicHeader("Content-Type", "application/xml");
        i = j;
        ((HttpPost) (obj2)).getParams().setBooleanParameter("http.protocol.expect-continue", false);
        i = j;
        ((StringEntity) (obj3)).setContentType(basicheader);
        i = j;
        ((HttpPost) (obj2)).setEntity(((HttpEntity) (obj3)));
        i = j;
        Logging.Log("Trying to post to KVquery.");
        i = j;
        obj = ((HttpClient) (obj)).execute(((org.apache.http.client.methods.HttpUriRequest) (obj2))).getEntity();
        if (obj != null) goto _L2; else goto _L1
_L1:
        i = j;
        Logging.LogError("Could not get a response entity from KVquery.");
_L8:
        return;
_L2:
        int i1;
        int j1;
        i1 = j;
        j1 = j;
        i = j;
        Logging.Log("(KVquery) Grabbing Result...");
        i1 = j;
        j1 = j;
        i = j;
        obj = StringUtils.inputStreamToString(((HttpEntity) (obj)).getContent());
        i1 = j;
        j1 = j;
        i = j;
        Logging.Log((new StringBuilder()).append("(KVquery) Result: ").append(((String) (obj))).toString());
        obj2 = null;
        i1 = j;
        j1 = j;
        i = j;
        obj = new JSONObject(((String) (obj)));
        obj2 = obj;
_L9:
        int l = j;
        if (obj2 == null) goto _L4; else goto _L3
_L3:
        i1 = j;
        j1 = j;
        i = j;
        Logging.Log((new StringBuilder()).append("(KVquery) Parsed result: ").append(((JSONObject) (obj2)).toString()).toString());
        obj = null;
        i1 = j;
        j1 = j;
        i = j;
        obj2 = ((JSONObject) (obj2)).getJSONObject("data");
        i1 = j;
        obj = obj2;
        j1 = j;
        i = j;
        Logging.Log((new StringBuilder()).append("(KVquery) return data: ").append(((JSONObject) (obj2)).toString()).toString());
        obj = obj2;
_L10:
        l = j;
        if (obj == null) goto _L4; else goto _L5
_L5:
        obj2 = "";
        i1 = j;
        j1 = j;
        i = j;
        obj3 = ((JSONObject) (obj)).getString("attribution");
        obj2 = obj3;
_L11:
        i1 = j;
        j1 = j;
        i = j;
        int k = ((JSONObject) (obj)).getInt("retry");
        l = k;
        if (k >= 0) goto _L4; else goto _L6
_L6:
        i1 = k;
        j1 = k;
        i = k;
        j = k;
        Feature.access$1900().edit().putString("attributionData", ((String) (obj2))).commit();
        l = k;
        i1 = k;
        j1 = k;
        i = k;
        j = k;
        if (Feature.access$2000() == null) goto _L4; else goto _L7
_L7:
        i1 = k;
        j1 = k;
        i = k;
        j = k;
        obj = Message.obtain();
        i1 = k;
        j1 = k;
        i = k;
        j = k;
        obj3 = new Bundle();
        i1 = k;
        j1 = k;
        i = k;
        j = k;
        ((Bundle) (obj3)).putString("attributionData", ((String) (obj2)).toString());
        i1 = k;
        j1 = k;
        i = k;
        j = k;
        ((Message) (obj)).setData(((Bundle) (obj3)));
        i1 = k;
        j1 = k;
        i = k;
        j = k;
        Feature.access$2000().sendMessage(((Message) (obj)));
        l = k;
_L4:
        if (l > 0)
        {
            Feature.sendKVQuery(l);
            return;
        }
          goto _L8
        Object obj1;
        obj1;
        i1 = j;
        j1 = j;
        i = j;
        Logging.LogError((new StringBuilder()).append("(KVquery) Error while parsing result json: ").append(((JSONException) (obj1)).toString()).toString());
          goto _L9
        obj1;
        i = i1;
        if (!obj1.getClass().equals(javax/net/ssl/SSLException))
        {
            break MISSING_BLOCK_LABEL_1138;
        }
        i = i1;
        Logging.LogError((new StringBuilder()).append("SSLException! Shutting down SDK and sending report.").append(obj1).toString());
        i = i1;
        JSONException jsonexception;
        JSONException jsonexception1;
        try
        {
            Feature.access$1500(((Exception) (obj1)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            Logging.LogError((new StringBuilder()).append("KVquery ClientProtocolException: ").append(obj1).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            if (obj1.getClass().equals(javax/net/ssl/SSLException))
            {
                Logging.LogError((new StringBuilder()).append("SSLException! Shutting down SDK and sending report.").append(obj1).toString());
                Feature.access$1500(((Exception) (obj1)));
                return;
            }
            break MISSING_BLOCK_LABEL_1166;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            Logging.LogError((new StringBuilder()).append("Unexpected error during KVquery communication. ").append(obj1).toString());
            l = i;
        }
          goto _L4
        jsonexception;
        i1 = j;
        j1 = j;
        i = j;
        Logging.Log("KVquery response did not contain data.");
          goto _L10
        obj1;
        i = j1;
        Logging.LogError((new StringBuilder()).append("KVquery OutOfMemoryError: ").append(obj1).toString());
        return;
        jsonexception1;
        i1 = j;
        j1 = j;
        i = j;
        Logging.LogError("KVquery response did not contain attribution data, or JSON was invalid.");
          goto _L11
        obj1;
        i1 = j;
        j1 = j;
        i = j;
        Logging.LogError("KVquery response did not contain a retry value, or JSON was invalid.");
        l = j;
          goto _L4
        i = i1;
        Logging.LogError((new StringBuilder()).append("KVquery IOException: ").append(obj1).toString());
        return;
        Logging.LogError((new StringBuilder()).append("KVquery IOException: ").append(obj1).toString());
        return;
          goto _L9
    }

    xception()
    {
    }
}
