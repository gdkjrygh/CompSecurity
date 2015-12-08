// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push;

import android.util.Log;
import com.google.common.base.Preconditions;
import com.weather.commons.push.alertmessageparsers.BreakingNewsAlertMessageParser;
import com.weather.commons.push.alertmessageparsers.DenseFogAlertMessageParser;
import com.weather.commons.push.alertmessageparsers.ExtremeColdAlertMessageParser;
import com.weather.commons.push.alertmessageparsers.ExtremeHeatAlertMessageParser;
import com.weather.commons.push.alertmessageparsers.HeavyRainAlertMessageParser;
import com.weather.commons.push.alertmessageparsers.HeavySnowfallAlertMessageParser;
import com.weather.commons.push.alertmessageparsers.HighWindAlertMessageParser;
import com.weather.commons.push.alertmessageparsers.IceAlertMessageParser;
import com.weather.commons.push.alertmessageparsers.LightningStrikeAlertMessageParser;
import com.weather.commons.push.alertmessageparsers.PollenAlertMessageParser;
import com.weather.commons.push.alertmessageparsers.RainSnowAlertMessageParser;
import com.weather.commons.push.alertmessageparsers.RealTimeRainMessageParser;
import com.weather.commons.push.alertmessageparsers.SevereWeatherAlertMessageParser;
import com.weather.commons.push.alertmessageparsers.ThunderStormAlertMessageParser;
import com.weather.util.json.JsonParser;
import com.weather.util.json.JsonUtil;
import com.weather.util.prefs.Prefs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.commons.push:
//            AlertPrefs

public class AlertList
{

    private static final String TAG = "AlertList";
    public static final AlertList breakingNewsList;
    public static final AlertList denseFogAlertMessageList;
    public static final AlertList extremeColdAlertMessageList;
    public static final AlertList extremeHeatAlertMessageAlertList;
    public static final AlertList heavyRainAlertMessageList;
    public static final AlertList heavySnowfallAlertMessageList;
    public static final AlertList highWindAlertMessageAlertList;
    public static final AlertList iceAlertMessageList;
    public static final AlertList lightningStrikeAlertMessageList;
    public static final AlertList pollenList;
    public static final AlertList rainSnowList;
    public static final AlertList realTimeRainAlertMessageAlertList;
    public static final AlertList severeList;
    public static final AlertList thunderstormAlertMessageList;
    private JSONArray alertJsonArray;
    private final List alerts;
    private final JsonParser parser;
    private final AlertPrefs.Keys prefKey;
    private final Prefs prefs;

    public AlertList(JsonParser jsonparser, AlertPrefs.Keys keys)
    {
        this(jsonparser, keys, AlertPrefs.getInstance());
    }

    AlertList(JsonParser jsonparser, AlertPrefs.Keys keys, Prefs prefs1)
    {
        alerts = new ArrayList();
        prefKey = (AlertPrefs.Keys)Preconditions.checkNotNull(keys);
        parser = (JsonParser)Preconditions.checkNotNull(jsonparser);
        prefs = (Prefs)Preconditions.checkNotNull(prefs1);
    }

    private void initList()
    {
        boolean flag;
        if (alertJsonArray != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = prefs.getString(prefKey, "");
        if (((String) (obj)).isEmpty())
        {
            alertJsonArray = new JSONArray();
            return;
        }
        int i;
        int j;
        try
        {
            alertJsonArray = new JSONArray(((String) (obj)));
            j = alertJsonArray.length();
        }
        catch (JSONException jsonexception)
        {
            Log.e("AlertList", "Unable to parse persisted alerts", jsonexception);
            alerts.clear();
            alertJsonArray = new JSONArray();
            return;
        }
        i = 0;
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = alertJsonArray.getJSONObject(i);
        alerts.add(parser.parse(((JSONObject) (obj))));
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        break MISSING_BLOCK_LABEL_111;
_L4:
        break MISSING_BLOCK_LABEL_74;
        if (true) goto _L1; else goto _L5
_L5:
    }

    public List addAlert(String s)
        throws JSONException
    {
        this;
        JVM INSTR monitorenter ;
        initList();
        s = new JSONObject(s);
        alertJsonArray = JsonUtil.insertObjectIntoArray(alertJsonArray, 0, s);
        prefs.putString(prefKey, alertJsonArray.toString());
        alerts.add(0, parser.parse(s));
        s = Collections.unmodifiableList(alerts);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public void clearList()
    {
        this;
        JVM INSTR monitorenter ;
        prefs.remove(prefKey);
        alertJsonArray = new JSONArray();
        alerts.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static 
    {
        pollenList = new AlertList(new PollenAlertMessageParser(), AlertPrefs.Keys.POLLEN);
        severeList = new AlertList(new SevereWeatherAlertMessageParser(), AlertPrefs.Keys.SEVERE);
        rainSnowList = new AlertList(new RainSnowAlertMessageParser(), AlertPrefs.Keys.RAINSNOW);
        breakingNewsList = new AlertList(new BreakingNewsAlertMessageParser(), AlertPrefs.Keys.BREAKINGNEWS);
        realTimeRainAlertMessageAlertList = new AlertList(new RealTimeRainMessageParser(), AlertPrefs.Keys.REAL_TIME_RAIN);
        lightningStrikeAlertMessageList = new AlertList(new LightningStrikeAlertMessageParser(), AlertPrefs.Keys.LIGHTNING_STRIKE);
        heavyRainAlertMessageList = new AlertList(new HeavyRainAlertMessageParser(), AlertPrefs.Keys.HEAVY_RAIN);
        thunderstormAlertMessageList = new AlertList(new ThunderStormAlertMessageParser(), AlertPrefs.Keys.THUNDERSTORM);
        extremeHeatAlertMessageAlertList = new AlertList(new ExtremeHeatAlertMessageParser(), AlertPrefs.Keys.EXTREME_HEAT);
        highWindAlertMessageAlertList = new AlertList(new HighWindAlertMessageParser(), AlertPrefs.Keys.HIGH_WIND);
        denseFogAlertMessageList = new AlertList(new DenseFogAlertMessageParser(), AlertPrefs.Keys.DENSE_FOG);
        extremeColdAlertMessageList = new AlertList(new ExtremeColdAlertMessageParser(), AlertPrefs.Keys.EXTREME_COLD);
        heavySnowfallAlertMessageList = new AlertList(new HeavySnowfallAlertMessageParser(), AlertPrefs.Keys.HEAVY_SNOWFALL);
        iceAlertMessageList = new AlertList(new IceAlertMessageParser(), AlertPrefs.Keys.ICE);
    }
}
