// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.eventlog.post;

import android.content.Context;
import com.weather.dal2.aws.services.AmazonServices;
import com.weather.dal2.config.DalConfig;
import com.weather.dal2.config.DalConfigManager;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.device.DeviceUtils;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import com.weather.util.ui.UIUtil;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.dal2.eventlog.post:
//            DsxLogServices, DeviceJson

public class DsxLog
{

    public static final String AD_ID = "adId";
    public static final String DEVICE_DATA = "deviceData";
    public static final String EVENT_DATA = "eventData";
    public static final String EVENT_TYPE = "eventType";
    public static final String FACTUAL_ID = "factualId";
    public static final String MSG = "msg";
    public static final String PLATFORM = "platform";
    public static final String PLATFORM_NAME = "ANDROID ";
    public static final String TAG = "tag";
    public static final String TIME = "time";
    public static final String USER_ID = "userId";
    public static final String VERSION = "version";
    public static final String WXD_ID = "wxdId";
    private final Context context;
    private final DalConfig dalConfig;
    private final DsxLogServices dsxLogServices;
    private final Prefs prefs;

    public DsxLog()
    {
        this(AbstractTwcApplication.getRootContext(), TwcPrefs.getInstance(), new DsxLogServices(), DalConfigManager.INSTANCE.getDalConfig());
    }

    DsxLog(Context context1, Prefs prefs1, DsxLogServices dsxlogservices, DalConfig dalconfig)
    {
        context = context1;
        prefs = prefs1;
        dsxLogServices = dsxlogservices;
        dalConfig = dalconfig;
    }

    private boolean isEventLoggingEnabled()
    {
        return dalConfig.isEventLoggingEnabled();
    }

    private boolean tagMatchesFilter(String s)
    {
        return s.matches(dalConfig.getTagFilter());
    }

    String buildLogMessage(String s, String s1, int i, String s2, JSONObject jsonobject, long l)
        throws JSONException
    {
        JSONObject jsonobject1 = new JSONObject();
        jsonobject1.put("adId", s);
        jsonobject1.put("userId", prefs.getString(com.weather.util.prefs.TwcPrefs.Keys.UPS_USER_ID, ""));
        jsonobject1.put("wxdId", DeviceUtils.getUUID(context));
        jsonobject1.put("platform", "ANDROID ");
        jsonobject1.put("eventType", s2);
        jsonobject1.put("version", i);
        jsonobject1.put("factualId", prefs.getString(com.weather.util.prefs.TwcPrefs.Keys.FILTERED_ID, ""));
        jsonobject.put("tag", s1);
        jsonobject.put("time", l);
        s = jsonobject.optJSONArray("eventData");
        if (s == null)
        {
            s = jsonobject;
        }
        jsonobject1.put("eventData", s);
        jsonobject1.put("deviceData", (new DeviceJson()).getJsonObject());
        return jsonobject1.toString();
    }

    String getAdvertisementId()
    {
        if (UIUtil.isAmazon(context))
        {
            return prefs.getString(com.weather.util.prefs.TwcPrefs.Keys.FILTERED_ID, "");
        } else
        {
            return prefs.getString(com.weather.util.prefs.TwcPrefs.Keys.ADVERTISING_ID, "");
        }
    }

    public void send(String s, int i, String s1, String s2)
    {
        send(s, i, s1, s2, System.currentTimeMillis());
    }

    void send(String s, int i, String s1, String s2, long l)
    {
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("msg", s2);
            send(s, i, s1, jsonobject, l);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public void send(String s, int i, String s1, Map map)
    {
        send(s, i, s1, map, System.currentTimeMillis());
    }

    void send(String s, int i, String s1, Map map, long l)
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); jsonobject.put((String)entry.getKey(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        send(s, i, s1, jsonobject, l);
        return;
    }

    public void send(String s, int i, String s1, JSONObject jsonobject)
    {
        send(s, i, s1, jsonobject, System.currentTimeMillis());
    }

    void send(String s, int i, String s1, JSONObject jsonobject, long l)
    {
        try
        {
            if (!isEventLoggingEnabled() || !tagMatchesFilter(s))
            {
                break MISSING_BLOCK_LABEL_116;
            }
            String s2 = prefs.getString(com.weather.util.prefs.TwcPrefs.Keys.UPS_USER_ID, "");
            String s3 = getAdvertisementId();
            LogUtil.logToFile((new StringBuilder()).append("DsxLog:send:userId: ").append(s2).append(" advertisementId: ").append(s3).toString());
            if (s3.isEmpty() || s2.isEmpty())
            {
                break MISSING_BLOCK_LABEL_116;
            }
            s = buildLogMessage(s3, s, i, s1, jsonobject, l);
            s1 = dsxLogServices.getAmazonService(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            LogUtil.method("DsxLogs", LoggingMetaTags.TWC_DSX_LOG, "Error creating Json Object:  %s", new Object[] {
                s.getMessage()
            });
            return;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        s1.send(s);
    }
}
