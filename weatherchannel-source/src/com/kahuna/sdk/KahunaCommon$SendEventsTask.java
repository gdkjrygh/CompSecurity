// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.util.Log;
import com.kahuna.sdk.http.AsyncHttpClient;
import com.kahuna.sdk.http.RequestParams;
import com.kahuna.sdk.location.KahunaActivityRecognitionManager;
import com.kahuna.sdk.location.KahunaIBeaconManager;
import com.kahuna.sdk.location.KahunaRegionManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.kahuna.sdk:
//            KahunaCommon, KahunaUtils, KahunaSDKConfiguration, Event, 
//            EventBucketManager, KahunaInternalDebugManager

private class <init> extends TimerTask
{

    final KahunaCommon this$0;

    public void run()
    {
        synchronized (KahunaCommon.access$2500(KahunaCommon.this))
        {
            KahunaCommon.access$2602(KahunaCommon.this, true);
        }
        obj1 = new RequestParams();
        ((RequestParams) (obj1)).put("key", KahunaCommon.access$1100(KahunaCommon.this));
        ((RequestParams) (obj1)).put("dev_id", KahunaCommon.access$1200(KahunaCommon.this));
        ((RequestParams) (obj1)).put("app_name", KahunaCommon.access$2700(KahunaCommon.this));
        ((RequestParams) (obj1)).put("app_ver", KahunaCommon.access$2800(KahunaCommon.this));
        ((RequestParams) (obj1)).put("os_version", KahunaCommon.access$2900(KahunaCommon.this));
        ((RequestParams) (obj1)).put("os_name", KahunaCommon.access$3000(KahunaCommon.this));
        ((RequestParams) (obj1)).put("dev_name", KahunaCommon.access$3100(KahunaCommon.this));
        ((RequestParams) (obj1)).put("client_time", (new StringBuilder()).append("").append(System.currentTimeMillis() / 1000L).toString());
        ((RequestParams) (obj1)).put("sdk_version", "2.0.3");
        if (!KahunaUtils.isNullOrEmpty(KahunaCommon.access$3200(KahunaCommon.this)))
        {
            ((RequestParams) (obj1)).put("push_token", KahunaCommon.access$3200(KahunaCommon.this));
        }
        if (!KahunaUtils.isNullOrEmpty(KahunaCommon.access$3300(KahunaCommon.this)) && !KahunaUtils.isNullOrEmpty(KahunaCommon.access$3400(KahunaCommon.this)))
        {
            ((RequestParams) (obj1)).put("sdk_wrapper", KahunaCommon.access$3300(KahunaCommon.this));
            ((RequestParams) (obj1)).put("sdk_wrapper_version", KahunaCommon.access$3400(KahunaCommon.this));
        }
        Object obj2;
        Object obj3;
        int i;
        int j;
        if (KahunaCommon.access$800(KahunaCommon.this))
        {
            obj = "s";
        } else
        {
            obj = "p";
        }
        ((RequestParams) (obj1)).put("env", ((String) (obj)));
        ((RequestParams) (obj1)).put("c", (new StringBuilder()).append("").append(KahunaCommon.access$3500(KahunaCommon.this).getVersion()).toString());
        obj = new JSONArray();
        if (KahunaCommon.access$3600())
        {
            ((JSONArray) (obj)).put("iam");
        }
        if (!KahunaCommon.access$3700() || !KahunaRegionManager.isDeviceReadyForRegionMonitoring()) goto _L2; else goto _L1
_L1:
        ((JSONArray) (obj)).put("rm");
        obj3 = KahunaRegionManager.getCurrentlyMonitoredRegions(KahunaCommon.this);
        if (((Set) (obj3)).size() <= 0) goto _L2; else goto _L3
_L3:
        obj2 = new JSONArray();
        for (obj3 = ((Set) (obj3)).iterator(); ((Iterator) (obj3)).hasNext(); ((JSONArray) (obj2)).put((String)((Iterator) (obj3)).next())) { }
          goto _L4
        obj2;
_L10:
        if (!KahunaUtils.isNullOrEmpty(((JSONArray) (obj))))
        {
            ((RequestParams) (obj1)).put("fsupported", ((JSONArray) (obj)).toString());
        }
        obj2 = new JSONArray();
        KahunaCommon.access$3902(KahunaCommon.this, new ArrayList());
        obj = KahunaCommon.access$300(KahunaCommon.this);
        obj;
        JVM INSTR monitorenter ;
        if (KahunaCommon.access$4000(KahunaCommon.this).get() <= 0)
        {
            KahunaCommon.access$4000(KahunaCommon.this).set(KahunaCommon.access$400(KahunaCommon.this).size());
        }
        i = KahunaCommon.access$3500(KahunaCommon.this).getBatchSize();
        if (i < KahunaCommon.access$400(KahunaCommon.this).size())
        {
            break MISSING_BLOCK_LABEL_1434;
        }
          goto _L5
_L8:
        if (j >= i) goto _L7; else goto _L6
_L6:
        obj3 = (Event)KahunaCommon.access$400(KahunaCommon.this).get(j);
        KahunaCommon.access$3900(KahunaCommon.this).add(obj3);
        obj3 = ((Event) (obj3)).getJSONRepresentation();
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_573;
        }
        ((JSONArray) (obj2)).put(obj3);
        j++;
          goto _L8
        obj1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw obj1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Caught exception in Send Events Task handler: ").append(obj).toString());
            ((Exception) (obj)).printStackTrace();
        }
        synchronized (KahunaCommon.access$1800(KahunaCommon.this))
        {
            if (KahunaCommon.access$1900(KahunaCommon.this) != null)
            {
                KahunaCommon.access$1900(KahunaCommon.this).cel();
                KahunaCommon.access$1902(KahunaCommon.this, null);
            }
        }
_L13:
        return;
_L4:
        ((RequestParams) (obj1)).put("rm", ((JSONArray) (obj2)).toString());
_L2:
        if (android.os. < 18 || !KahunaCommon.access$3800() || !KahunaActivityRecognitionManager.isDeviceReadyForActivityRecognition() || !KahunaIBeaconManager.isDeviceReadyForIBeaconMonitoring(KahunaCommon.this)) goto _L10; else goto _L9
_L9:
        ((JSONArray) (obj)).put("bm");
        obj3 = KahunaIBeaconManager.getCurrentlyMonitorediBeacons(KahunaCommon.this);
        if (((Set) (obj3)).size() <= 0) goto _L10; else goto _L11
_L11:
        obj2 = new JSONArray();
        for (obj3 = ((Set) (obj3)).iterator(); ((Iterator) (obj3)).hasNext(); ((JSONArray) (obj2)).put((String)((Iterator) (obj3)).next())) { }
        ((RequestParams) (obj1)).put("bm", ((JSONArray) (obj2)).toString());
          goto _L10
_L5:
        i = KahunaCommon.access$400(KahunaCommon.this).size();
        break MISSING_BLOCK_LABEL_1434;
_L7:
        obj;
        JVM INSTR monitorexit ;
        EventBucketManager.clearBucketMappings();
        if (KahunaCommon.access$3900(KahunaCommon.this).size() != 0)
        {
            break MISSING_BLOCK_LABEL_914;
        }
        synchronized (KahunaCommon.access$2500(KahunaCommon.this))
        {
            KahunaCommon.access$2602(KahunaCommon.this, false);
        }
        synchronized (KahunaCommon.access$1800(KahunaCommon.this))
        {
            if (KahunaCommon.access$1900(KahunaCommon.this) != null)
            {
                KahunaCommon.access$1900(KahunaCommon.this).cel();
                KahunaCommon.access$1902(KahunaCommon.this, null);
            }
        }
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj = ((JSONArray) (obj2)).toString();
        ((RequestParams) (obj1)).put("events_cksum", KahunaUtils.getHashForString(((String) (obj)), "MD5", false));
        ((RequestParams) (obj1)).put("events", ((String) (obj)));
        if (!KahunaUtils.isNullOrEmpty(KahunaCommon.access$600(KahunaCommon.this)))
        {
            ((RequestParams) (obj1)).put("archive_corrupt_raw_data", KahunaCommon.access$600(KahunaCommon.this));
        }
        if (!KahunaUtils.isNullOrEmpty(KahunaCommon.access$700(KahunaCommon.this)))
        {
            ((RequestParams) (obj1)).put("archive_corrupt_event_names", KahunaCommon.access$700(KahunaCommon.this).toString());
        }
        obj = KahunaUtils.getHashForString(EntityUtils.toString(((RequestParams) (obj1)).getEntity(), "UTF-8"), "MD5", false);
        if (KahunaCommon.mDebugEnabled)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Top Level Checksum was: ").append(((String) (obj))).toString());
        }
        obj = new BasicHeader("top_level_checksum", ((String) (obj)));
        obj2 = KahunaCommon.access$4500(KahunaCommon.this);
        obj3 = KahunaCommon.access$4100(KahunaCommon.this);
    /* block-local class not found */
    class _cls1 {}

        _cls1 _lcls1 = new _cls1();
        ((AsyncHttpClient) (obj2)).post(null, ((String) (obj3)), new Header[] {
            obj
        }, ((RequestParams) (obj1)), "application/x-www-form-urlencoded", _lcls1);
        if (!KahunaCommon.mDebugEnabled) goto _L13; else goto _L12
_L12:
        if (!KahunaInternalDebugManager.getIsDebugEnabled(KahunaCommon.access$000(KahunaCommon.this)))
        {
            break MISSING_BLOCK_LABEL_1402;
        }
        Log.d("Kahuna", "filtering some parameters");
        obj = ((RequestParams) (obj1)).getUrlParams();
        obj1 = new StringBuilder();
        obj2 = ((Map) (obj)).keySet().iterator();
_L16:
        do
        {
            if (!((Iterator) (obj2)).hasNext())
            {
                break MISSING_BLOCK_LABEL_1372;
            }
            obj3 = (String)((Iterator) (obj2)).next();
        } while ("key".equals(obj3));
        if (((StringBuilder) (obj1)).length() > 0)
        {
            ((StringBuilder) (obj1)).append("&");
        }
        if (!"events".equals(obj3))
        {
            break MISSING_BLOCK_LABEL_1329;
        }
        ((StringBuilder) (obj1)).append((new StringBuilder()).append(((String) (obj3))).append("=[").toString());
        j = KahunaCommon.access$3900(KahunaCommon.this).size();
        i = 0;
_L15:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj3 = ((Event)KahunaCommon.access$3900(KahunaCommon.this).get(i)).getJSONRepresentation();
        ((JSONObject) (obj3)).remove("credentials");
        ((StringBuilder) (obj1)).append(((JSONObject) (obj3)).toString());
        i++;
        if (true) goto _L15; else goto _L14
_L14:
        ((StringBuilder) (obj1)).append("]");
          goto _L16
        ((StringBuilder) (obj1)).append((new StringBuilder()).append(((String) (obj3))).append("=").append((String)((Map) (obj)).get(obj3)).toString());
          goto _L16
        Log.d("Kahuna", (new StringBuilder()).append("Sending request: ").append(((StringBuilder) (obj1)).toString()).toString());
        return;
        Log.d("Kahuna", (new StringBuilder()).append("Sending request: ").append(obj1).toString());
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        j = 0;
          goto _L8
    }

    private _cls1()
    {
        this$0 = KahunaCommon.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
