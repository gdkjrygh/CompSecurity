// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            as, c, x, aq

public class t
{

    private static final String a = com/paypal/android/sdk/onetouch/core/t.getSimpleName();
    private Context b;
    private String c;
    private JSONObject d;

    public t(Context context)
    {
        b = context;
        c = null;
        d = j();
        as.a(a, "Configuation initialize, dumping config");
        as.a(a, d);
    }

    public t(Context context, String s)
    {
        this(context, s, (byte)0);
    }

    private t(Context context, String s, byte byte0)
    {
        as.a(a, "entering Configuration url loading");
        b = context;
        c = s;
        context = o();
        if ("".equals(context))
        {
            throw new IOException((new StringBuilder("No valid config found for ")).append(s).toString());
        }
        as.a(a, "entering saveConfigDataToDisk");
        try
        {
            s = new File(b.getFilesDir(), "CONFIG_DATA");
            File file = new File(b.getFilesDir(), "CONFIG_TIME");
            com.paypal.android.sdk.onetouch.core.c.a(s, context);
            com.paypal.android.sdk.onetouch.core.c.a(file, String.valueOf(System.currentTimeMillis()));
            as.a(a, "leaving saveConfigDataToDisk successfully");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            (new StringBuilder("Failed to write config data: ")).append(s.toString());
        }
        d = new JSONObject(context);
        as.a(a, "leaving Configuration url loading");
    }

    private JSONObject a(String s)
    {
        JSONObject jsonobject;
        try
        {
            as.a(a, "entering getIncrementalConfig");
            jsonobject = new JSONObject(as.b(b, s));
            as.a(a, "leaving getIncrementalConfig");
        }
        catch (Exception exception)
        {
            as.a(6, "PRD", (new StringBuilder("Error while loading prdc Config ")).append(s).toString(), exception);
            return null;
        }
        return jsonobject;
    }

    private static JSONObject a(JSONObject jsonobject, JSONObject jsonobject1)
    {
        try
        {
            as.a(a, "entering mergeConfig");
            String s;
            for (Iterator iterator = jsonobject1.keys(); iterator.hasNext(); jsonobject.put(s, jsonobject1.get(s)))
            {
                s = (String)iterator.next();
                as.a(a, (new StringBuilder("overridding ")).append(s).toString());
            }

        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            as.a(6, "PRD", "Error encountered while applying prdc Config", jsonobject);
            return null;
        }
        as.a(a, "leaving mergeConfig");
        return jsonobject;
    }

    private JSONObject j()
    {
        JSONObject jsonobject;
        long l1;
        long l2;
        try
        {
            jsonobject = l();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            as.a(6, "PRD", "Severe Error while loading config, using hard code version", ((Throwable) (obj)));
            return m();
        }
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        if (!as.b(jsonobject.optString("conf_version", ""), "3.0"))
        {
            break MISSING_BLOCK_LABEL_78;
        }
        l1 = Long.parseLong(r());
        l2 = jsonobject.optLong("conf_refresh_time_interval", 0L);
        Object obj;
        Object obj1;
        boolean flag;
        if (System.currentTimeMillis() > l1 + l2 * 1000L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        n();
        as.a(a, "Using cached config");
        return jsonobject;
        q();
        obj = k();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        Log.e(a, "default Configuration loading failed,Using hardcoded config");
        return m();
        obj1 = as.a(b, "prdc", null);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        n();
        as.a(3, "PRD", "prdc field not configured, using default config");
        return ((JSONObject) (obj));
        as.a(3, "PRD", (new StringBuilder("prdc field is configured, loading path:")).append(((String) (obj1))).toString());
        obj1 = a(((String) (obj1)));
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        as.a(6, "PRD", "prdc Configuration loading failed, using default config");
        return ((JSONObject) (obj));
        obj1 = a(((JSONObject) (obj)), ((JSONObject) (obj1)));
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        as.a(6, "PRD", "applying prdc Configuration failed, using default config");
        return ((JSONObject) (obj));
        as.a(3, "PRD", "prdc configuration loaded successfully");
        return ((JSONObject) (obj1));
    }

    private static JSONObject k()
    {
        as.a(a, "entering getDefaultConfigurations");
        Object obj;
        try
        {
            obj = new String(Base64.decode("eyAiY29uZl92ZXJzaW9uIjogIjMuMCIsImFzeW5jX3VwZGF0ZV90aW1lX2ludGVydmFsIjogMzYwMCwgImZvcmNlZF9mdWxsX3VwZGF0ZV90aW1lX2ludGVydmFsIjogMTgwMCwgImNvbmZfcmVmcmVzaF90aW1lX2ludGVydmFsIjogODY0MDAsICJhbmRyb2lkX2FwcHNfdG9fY2hlY2siOiBbICJjb20uZWJheS5jbGFzc2lmaWVkcy9jb20uZWJheS5hcHAuTWFpblRhYkFjdGl2aXR5IiwgImNvbS5lYmF5Lm1vYmlsZS9jb20uZWJheS5tb2JpbGUuYWN0aXZpdGllcy5lQmF5IiwgImNvbS5lYmF5LnJlZGxhc2VyL2NvbS5lYmF5LnJlZGxhc2VyLlNjYW5uZWRJdGVtc0FjdGl2aXR5IiwgImNvbS5taWxvLmFuZHJvaWQvY29tLm1pbG8uYW5kcm9pZC5hY3Rpdml0eS5Ib21lQWN0aXZpdHkiLCAiY29tLnBheXBhbC5hbmRyb2lkLnAycG1vYmlsZS9jb20ucGF5cGFsLmFuZHJvaWQucDJwbW9iaWxlLmFjdGl2aXR5LlNlbmRNb25leUFjdGl2aXR5IiwgImNvbS5yZW50L2NvbS5yZW50LmFjdGl2aXRpZXMuc2Vzc2lvbi5BY3Rpdml0eUhvbWUiLCAiY29tLnN0dWJodWIvY29tLnN0dWJodWIuQWJvdXQiLCAiY29tLnVsb2NhdGUvY29tLnVsb2NhdGUuYWN0aXZpdGllcy5TZXR0aW5ncyIsICJjb20ubm9zaHVmb3UuYW5kcm9pZC5zdS9jb20ubm9zaHVmb3UuYW5kcm9pZC5zdS5TdSIsICJzdGVyaWNzb24uYnVzeWJveC9zdGVyaWNzb24uYnVzeWJveC5BY3Rpdml0eS5NYWluQWN0aXZpdHkiLCAib3JnLnByb3h5ZHJvaWQvb3JnLnByb3h5ZHJvaWQuUHJveHlEcm9pZCIsICJjb20uYWVkLmRyb2lkdnBuL2NvbS5hZWQuZHJvaWR2cG4uTWFpbkdVSSIsICJuZXQub3BlbnZwbi5vcGVudnBuL25ldC5vcGVudnBuLm9wZW52cG4uT3BlblZQTkNsaWVudCIsICJjb20ucGhvbmVhcHBzOTkuYWFiaXByb3h5L2NvbS5waG9uZWFwcHM5OS5hYWJpcHJveHkuT3Jib3QiLCAiY29tLmV2YW5oZS5wcm94eW1hbmFnZXIucHJvL2NvbS5ldmFuaGUucHJveHltYW5hZ2VyLk1haW5BY3Rpdml0eSIsICJjb20uZXZhbmhlLnByb3h5bWFuYWdlci9jb20uZXZhbmhlLnByb3h5bWFuYWdlci5NYWluQWN0aXZpdHkiLCAiY29tLmFuZHJvbW8uZGV2MzA5MzYuYXBwNzYxOTgvY29tLmFuZHJvbW8uZGV2MzA5MzYuYXBwNzYxOTguQW5kcm9tb0Rhc2hib2FyZEFjdGl2aXR5IiwgImNvbS5tZ3JhbmphLmF1dG9wcm94eV9saXRlL2NvbS5tZ3JhbmphLmF1dG9wcm94eV9saXRlLlByb3h5TGlzdEFjdGl2aXR5IiwgImNvbS52cG5vbmVjbGljay5hbmRyb2lkL2NvbS52cG5vbmVjbGljay5hbmRyb2lkLk1haW5BY3Rpdml0eSIsICJuZXQuaGlkZW1hbi9uZXQuaGlkZW1hbi5TdGFydGVyQWN0aXZpdHkiLCAiY29tLmRvZW50ZXIuYW5kcm9pZC52cG4uZml2ZXZwbi9jb20uZG9lbnRlci5hbmRyb2lkLnZwbi5maXZldnBuLkZpdmVWcG4iLCAiY29tLnRpZ2VydnBucy5hbmRyb2lkL2NvbS50aWdlcnZwbnMuYW5kcm9pZC5NYWluQWN0aXZpdHkiLCAiY29tLnBhbmRhcG93LnZwbi9jb20ucGFuZGFwb3cudnBuLlBhbmRhUG93IiwgImNvbS5leHByZXNzdnBuLnZwbi9jb20uZXhwcmVzc3Zwbi52cG4uTWFpbkFjdGl2aXR5IiwgImNvbS5sb25kb250cnVzdG1lZGlhLnZwbi9jb20ubG9uZG9udHJ1c3RtZWRpYS52cG4uVnBuU2VydmljZUFjdGl2aXR5IiwgImZyLm1lbGVjb20uVlBOUFBUUC52MTAxL2ZyLm1lbGVjb20uVlBOUFBUUC52MTAxLlNwbGFzaFNjcmVlbiIsICJjb20uY2hlY2twb2ludC5WUE4vY29tLmNoZWNrcG9pbnQuVlBOLk1haW5IYW5kbGVyIiwgImNvbS50dW5uZWxiZWFyLmFuZHJvaWQvY29tLnR1bm5lbGJlYXIuYW5kcm9pZC5UYmVhck1haW5BY3Rpdml0eSIsICJkZS5ibGlua3Qub3BlbnZwbi9kZS5ibGlua3Qub3BlbnZwbi5NYWluQWN0aXZpdHkiLCAib3JnLmFqZWplLmZha2Vsb2NhdGlvbi9vcmcuYWplamUuZmFrZWxvY2F0aW9uLkZha2UiLCAiY29tLmxleGEuZmFrZWdwcy9jb20ubGV4YS5mYWtlZ3BzLlBpY2tQb2ludCIsICJjb20uZm9yZ290dGVucHJvamVjdHMubW9ja2xvY2F0aW9ucy9jb20uZm9yZ290dGVucHJvamVjdHMubW9ja2xvY2F0aW9ucy5NYWluIiwgImtyLndvb3QwcGlhLmdwcy9rci53b290MHBpYS5ncHMuQ2F0Y2hNZUlmVUNhbiIsICJjb20ubXkuZmFrZS5sb2NhdGlvbi9jb20ubXkuZmFrZS5sb2NhdGlvbi5jb20ubXkuZmFrZS5sb2NhdGlvbiIsICJqcC5uZXRhcnQuYXJzdGFsa2luZy9qcC5uZXRhcnQuYXJzdGFsa2luZy5NeVByZWZlcmVuY2VBY3Rpdml0eSIsICJsb2NhdGlvblBsYXkuR1BTQ2hlYXRGcmVlL2xvY2F0aW9uUGxheS5HUFNDaGVhdEZyZWUuQWN0aXZpdHlTbWFydExvY2F0aW9uIiwgIm9yZy5nb29kZXYubGF0aXR1ZGUvb3JnLmdvb2Rldi5sYXRpdHVkZS5MYXRpdHVkZUFjdGl2aXR5IiwgImNvbS5zY2hlZmZzYmxlbmQuZGV2aWNlc3Bvb2YvY29tLnNjaGVmZnNibGVuZC5kZXZpY2VzcG9vZi5EZXZpY2VTcG9vZkFjdGl2aXR5IiwgImNvbS5wcm94eUJyb3dzZXIvY29tLnByb3h5QnJvd3Nlci5OZXdQcm94eUJyb3dzZXJBY3Rpdml0eSIsICJjb20uaWNlY29sZGFwcHMucHJveHlzZXJ2ZXJwcm8vY29tLmljZWNvbGRhcHBzLnByb3h5c2VydmVycHJvLnZpZXdTdGFydCIsICJob3RzcG90c2hpZWxkLmFuZHJvaWQudnBuL2NvbS5hbmNob3JmcmVlLnVpLkhvdFNwb3RTaGllbGQiLCAiY29tLmRvZW50ZXIub25ldnBuL2NvbS5kb2VudGVyLm9uZXZwbi5WcG5TZXR0aW5ncyIsICJjb20ueWVzdnBuLmVuL2NvbS55ZXN2cG4uTWFpblRhYiIsICJjb20ub2ZmaWNld3l6ZS5wbHV0b3Zwbi9jb20ub2ZmaWNld3l6ZS5wbHV0b3Zwbi5Ib21lQWN0aXZpdHkiLCAib3JnLmFqZWplLmxvY2F0aW9uc3Bvb2ZlcnByby9vcmcuYWplamUubG9jYXRpb25zcG9vZmVycHJvLkZha2UiLCAibG9jYXRpb25QbGF5LkdQU0NoZWF0L2xvY2F0aW9uUGxheS5HUFNDaGVhdC5BY3Rpdml0eVNtYXJ0TG9jYXRpb24iIF0sICJsb2NhdGlvbl9taW5fYWNjdXJhY3kiOiA1MDAsICJsb2NhdGlvbl9tYXhfY2FjaGVfYWdlIjogMTgwMCwgInNlbmRfb25fYXBwX3N0YXJ0IjogMSwgImVuZHBvaW50X3VybCI6ICJodHRwczovL3N2Y3MucGF5cGFsLmNvbS9BY2Nlc3NDb250cm9sL0xvZ1Jpc2tNZXRhZGF0YSIsICJpbnRlcm5hbF9jYWNoZV9tYXhfYWdlIjogMzAsICJjb21wX3RpbWVvdXQiOiA2MDAgfQ==", 0), "UTF-8");
            as.a(a, "leaving getDefaultConfigurations, Default Conf load succeed");
            obj = new JSONObject(((String) (obj)));
        }
        catch (Exception exception)
        {
            as.a(6, "PRD", "Read default config file exception.", exception);
            as.a(a, "leaving getDefaultConfigurations,returning null");
            return null;
        }
        return ((JSONObject) (obj));
    }

    private JSONObject l()
    {
        as.a(a, "entering getCachedConfiguration");
        Object obj;
        obj = p();
        if ("".equals(obj))
        {
            break MISSING_BLOCK_LABEL_54;
        }
        as.a(a, "leaving getCachedConfiguration,cached config load succeed");
        obj = new JSONObject(((String) (obj)));
        return ((JSONObject) (obj));
        Exception exception;
        exception;
        as.a(a, "JSON Exception in creating config file", exception);
        as.a(a, "leaving getCachedConfiguration,cached config load failed");
        return null;
    }

    private static JSONObject m()
    {
        as.a(a, "entering getHardcodedConfig");
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("conf_version", "3.0");
            jsonobject.put("async_update_time_interval", 3600);
            jsonobject.put("forced_full_update_time_interval", 1800);
            jsonobject.put("conf_refresh_time_interval", 0x15180);
            jsonobject.put("location_min_accuracy", 500);
            jsonobject.put("location_max_cache_age", 1800);
            jsonobject.put("endpoint_url", "https://svcs.paypal.com/AccessControl/LogRiskMetadata");
        }
        catch (JSONException jsonexception) { }
        as.a(a, "leaving getHardcodedConfig");
        return jsonobject;
    }

    private static void n()
    {
        as.a(a, "Loading web config");
        x.a().b();
    }

    private String o()
    {
        Object obj1;
        Object obj2;
        obj1 = null;
        as.a(a, "entering getRemoteConfig");
        obj2 = new StringBuilder();
        Object obj = (new URL(c)).openStream();
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(((java.io.InputStream) (obj)), "UTF-8"));
_L3:
        obj1 = bufferedreader.readLine();
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        ((StringBuilder) (obj2)).append(((String) (obj1)));
          goto _L3
        obj2;
        obj1 = obj;
        obj = obj2;
_L5:
        com.paypal.android.sdk.onetouch.core.c.a(((java.io.Closeable) (obj1)));
        com.paypal.android.sdk.onetouch.core.c.a(bufferedreader);
        throw obj;
_L2:
        com.paypal.android.sdk.onetouch.core.c.a(((java.io.Closeable) (obj)));
        com.paypal.android.sdk.onetouch.core.c.a(bufferedreader);
        as.a(a, "leaving getRemoteConfig successfully");
        return ((StringBuilder) (obj2)).toString();
        obj;
        bufferedreader = null;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        bufferedreader = null;
        obj1 = obj;
        obj = exception;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private String p()
    {
        Object obj = new File(b.getFilesDir(), "CONFIG_DATA");
        try
        {
            obj = com.paypal.android.sdk.onetouch.core.c.a(((File) (obj)));
        }
        catch (IOException ioexception)
        {
            as.a(a, "Load cached config failed", ioexception);
            return "";
        }
        return ((String) (obj));
    }

    private boolean q()
    {
        try
        {
            as.a(a, "entering deleteCachedConfigDataFromDisk");
            File file = new File(b.getFilesDir(), "CONFIG_DATA");
            File file1 = new File(b.getFilesDir(), "CONFIG_TIME");
            if (file.exists())
            {
                as.a(a, "cached Config Data found, deleting");
                file.delete();
            }
            if (file1.exists())
            {
                as.a(a, "cached Config Time found, deleting");
                file.delete();
            }
            as.a(a, "leaving deleteCachedConfigDataFromDisk");
        }
        catch (Exception exception)
        {
            as.a(a, "error encountered while deleteCachedConfigData", exception);
            return false;
        }
        return true;
    }

    private String r()
    {
        Object obj = new File(b.getFilesDir(), "CONFIG_TIME");
        try
        {
            obj = com.paypal.android.sdk.onetouch.core.c.a(((File) (obj)));
        }
        catch (IOException ioexception)
        {
            return "";
        }
        return ((String) (obj));
    }

    public final String a()
    {
        return c;
    }

    public final String b()
    {
        return d.optString("conf_version", "");
    }

    public final long c()
    {
        return d.optLong("async_update_time_interval", 0L);
    }

    public final long d()
    {
        return d.optLong("forced_full_update_time_interval", 0L);
    }

    public final long e()
    {
        return d.optLong("comp_timeout", 0L);
    }

    public final List f()
    {
        ArrayList arraylist = new ArrayList();
        JSONArray jsonarray = d.optJSONArray("android_apps_to_check");
        for (int i1 = 0; jsonarray != null && i1 < jsonarray.length(); i1++)
        {
            arraylist.add(jsonarray.getString(i1));
        }

        return arraylist;
    }

    public final String g()
    {
        return d.optString("endpoint_url", null);
    }

    public final boolean h()
    {
        return d.optBoolean("endpoint_is_stage", false);
    }

    public final aq i()
    {
        Object obj;
        try
        {
            obj = d.optString("CDS", "");
        }
        catch (Exception exception)
        {
            as.a(6, "PRD", "Failed to decode CDS", exception);
            return aq.a;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        if (!"".equals(obj))
        {
            break MISSING_BLOCK_LABEL_39;
        }
        as.a(3, "PRD", "No CDS is configured, enabling all variables");
        return aq.a;
        as.a(3, "PRD", "CDS field was found");
        obj = new aq(((String) (obj)).trim());
        return ((aq) (obj));
    }

}
