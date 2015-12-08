// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.content.SharedPreferences;
import com.kochava.android.util.Logging;
import com.kochava.android.util.StringUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONObject;

// Referenced classes of package com.kochava.android.tracker:
//            Feature

class val.source
    implements Runnable
{

    final Feature this$0;
    final String val$source;

    public void run()
    {
        Object obj;
        HashMap hashmap;
        Object obj1;
        Logging.Log((new StringBuilder()).append("Checking watchlist from ").append(val$source).append("...").toString());
        hashmap = new HashMap();
        Iterator iterator;
        String s;
        if (!Feature.access$800().contains("app_short_string"))
        {
            Logging.Log((new StringBuilder()).append("No previous app_short_string in watchlist, adding ").append(Feature.access$2100(Feature.this)).toString());
            Feature.access$800().edit().putString("app_short_string", Feature.access$2100(Feature.this)).commit();
        } else
        if (!Feature.access$800().getString("app_short_string", "").equals(Feature.access$2100(Feature.this)))
        {
            Logging.Log((new StringBuilder()).append("app_short_string changed! Is now ").append(Feature.access$2100(Feature.this)).toString());
            hashmap.put("app_short_string", (new StringBuilder()).append(Feature.access$2100(Feature.this)).append("").toString());
            Feature.access$800().edit().putString("app_short_string", Feature.access$2100(Feature.this)).commit();
        }
_L5:
        if (!Feature.access$800().contains("app_limit_tracking"))
        {
            Logging.Log((new StringBuilder()).append("No previous app_limit_tracking in watchlist, adding ").append(Feature.access$2200(Feature.this)).toString());
            Feature.access$800().edit().putBoolean("app_limit_tracking", Feature.access$2200(Feature.this)).commit();
        } else
        if (Feature.access$800().getBoolean("app_limit_tracking", false) != Feature.access$2200(Feature.this))
        {
            Logging.Log((new StringBuilder()).append("app_limit_tracking changed! Is now ").append(Feature.access$2200(Feature.this)).toString());
            hashmap.put("app_limit_tracking", (new StringBuilder()).append(Feature.access$2200(Feature.this)).append("").toString());
            Feature.access$800().edit().putBoolean("app_limit_tracking", Feature.access$2200(Feature.this)).commit();
        }
        if (!Feature.access$800().contains("app_version"))
        {
            Logging.Log((new StringBuilder()).append("No previous app_version in watchlist, adding ").append(Feature.access$2300(Feature.this)).toString());
            Feature.access$800().edit().putString("app_version", Feature.access$2300(Feature.this)).commit();
        } else
        if (!Feature.access$800().getString("app_version", "").equals(Feature.access$2300(Feature.this)))
        {
            Logging.Log((new StringBuilder()).append("app_version changed! Is now ").append(Feature.access$2300(Feature.this)).toString());
            hashmap.put("app_version", (new StringBuilder()).append(Feature.access$2300(Feature.this)).append("").toString());
            Feature.access$800().edit().putString("app_version", Feature.access$2300(Feature.this)).commit();
        }
        if (!Feature.access$800().contains("device_limit_tracking"))
        {
            Logging.Log((new StringBuilder()).append("No previous device_limit_tracking in watchlist, adding ").append(Feature.access$2400()).toString());
            Feature.access$800().edit().putBoolean("device_limit_tracking", Feature.access$2400()).commit();
        } else
        if (Feature.access$800().getBoolean("device_limit_tracking", false) != Feature.access$2400())
        {
            Logging.Log((new StringBuilder()).append("device_limit_tracking changed! Is now ").append(Feature.access$2400()).toString());
            hashmap.put("device_limit_tracking", (new StringBuilder()).append(Feature.access$2400()).append("").toString());
            Feature.access$800().edit().putBoolean("device_limit_tracking", Feature.access$2400()).commit();
        }
        if (!Feature.access$800().contains("adid"))
        {
            Logging.Log((new StringBuilder()).append("No previous adid in watchlist, adding ").append(Feature.access$100()).toString());
            Feature.access$800().edit().putString("adid", Feature.access$100()).commit();
        } else
        if (!Feature.access$800().getString("adid", "").equals(Feature.access$100()))
        {
            Logging.Log((new StringBuilder()).append("adid changed! Is now ").append(Feature.access$100()).toString());
            hashmap.put("adid", Feature.access$100());
            Feature.access$800().edit().putString("adid", Feature.access$100()).commit();
        }
        if (!Feature.access$800().contains("os_version"))
        {
            Logging.Log((new StringBuilder()).append("No previous os_version in watchlist, adding ").append(Feature.access$2500()).toString());
            Feature.access$800().edit().putString("os_version", Feature.access$2500()).commit();
        } else
        if (!Feature.access$800().getString("os_version", "").equals(Feature.access$2500()))
        {
            Logging.Log((new StringBuilder()).append("os_version changed! Is now ").append(Feature.access$2500()).toString());
            hashmap.put("os_version", Feature.access$2500());
            Feature.access$800().edit().putString("os_version", Feature.access$2500()).commit();
        }
        if (hashmap.keySet().isEmpty()) goto _L2; else goto _L1
_L1:
        obj = new JSONObject();
        ((JSONObject) (obj)).put("action", "update");
        ((JSONObject) (obj)).put("kochava_device_id", Feature.access$1800());
        ((JSONObject) (obj)).put("kochava_app_id", Feature.access$500());
        obj1 = new JSONObject();
        for (iterator = hashmap.keySet().iterator(); iterator.hasNext(); ((JSONObject) (obj1)).put(s, hashmap.get(s)))
        {
            s = (String)iterator.next();
        }

          goto _L3
        obj;
        Logging.LogError((new StringBuilder()).append("Update error: ").append(((Exception) (obj)).toString()).toString());
_L2:
        return;
_L3:
        ((JSONObject) (obj)).put("data", obj1);
        HttpClient httpclient = Feature.access$200(false);
        HttpProtocolParams.setUserAgent(httpclient.getParams(), Feature.access$300());
        if (Feature.access$400() == null || Feature.access$400().trim().isEmpty())
        {
            Feature.access$402("control.kochava.com");
        }
        Logging.Log((new StringBuilder()).append("posting update to ").append("https://").append(Feature.access$400()).append("/track/kvTracker.php").toString());
        obj1 = new HttpPost((new StringBuilder()).append("https://").append(Feature.access$400()).append("/track/kvTracker.php").toString());
        StringEntity stringentity = new StringEntity(((JSONObject) (obj)).toString(), "UTF-8");
        BasicHeader basicheader = new BasicHeader("Content-Type", "application/xml");
        ((HttpPost) (obj1)).getParams().setBooleanParameter("http.protocol.expect-continue", false);
        stringentity.setContentType(basicheader);
        ((HttpPost) (obj1)).setEntity(stringentity);
        Logging.Log((new StringBuilder()).append("Trying to post an update: ").append(((JSONObject) (obj)).toString()).toString());
        obj = httpclient.execute(((org.apache.http.client.methods.HttpUriRequest) (obj1))).getEntity();
        if (obj == null) goto _L2; else goto _L4
_L4:
        obj = StringUtils.inputStreamToString(((HttpEntity) (obj)).getContent());
        Logging.Log((new StringBuilder()).append("Update Result: ").append(((String) (obj))).toString());
        return;
          goto _L5
    }

    t()
    {
        this$0 = final_feature;
        val$source = String.this;
        super();
    }
}
