// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.log.alerts;

import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.util.log.alerts:
//            CurLocDataLogEntry, AlertLogEntry, CurLocLogEntry

public class AlertsLogger
{

    private static final AlertsLogger INSTANCE = new AlertsLogger();
    private static final int MAX_LENGTH = 30;
    private static final String TAG = "AlertsLogger";
    private final Object lock = new Object();

    private AlertsLogger()
    {
    }

    public static AlertsLogger getInstance()
    {
        return INSTANCE;
    }

    private String getLog()
    {
        return TwcPrefs.getInstance().getString(com.weather.util.prefs.TwcPrefs.Keys.ALERTS_LOG, "");
    }

    private JSONArray throttleJsonLog(JSONArray jsonarray)
        throws JSONException
    {
        int j = jsonarray.length();
        JSONArray jsonarray1;
        if (j >= 30)
        {
            JSONArray jsonarray2 = new JSONArray();
            int i = j - 29;
            do
            {
                jsonarray1 = jsonarray2;
                if (i >= j)
                {
                    break;
                }
                jsonarray2.put(jsonarray.getJSONObject(i));
                i++;
            } while (true);
        } else
        {
            jsonarray1 = jsonarray;
        }
        return jsonarray1;
    }

    public boolean addLogEntry(CurLocDataLogEntry curlocdatalogentry)
    {
        Object obj1 = lock;
        obj1;
        JVM INSTR monitorenter ;
        boolean flag2 = TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.ALERTS_LOG_ENABLED, false);
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (!flag2) goto _L2; else goto _L1
_L1:
        Object obj = getLog();
        if (!((String) (obj)).isEmpty()) goto _L4; else goto _L3
_L3:
        obj = new JSONArray();
_L5:
        ((JSONArray) (obj)).put(curlocdatalogentry.toJsonObject());
        TwcPrefs.getInstance().putString(com.weather.util.prefs.TwcPrefs.Keys.ALERTS_LOG, ((JSONArray) (obj)).toString());
        flag = true;
_L2:
        obj1;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        obj = throttleJsonLog(new JSONArray(((String) (obj))));
          goto _L5
        curlocdatalogentry;
        LogUtil.e("AlertsLogger", LoggingMetaTags.TWC_ALERTS, curlocdatalogentry.getLocalizedMessage(), new Object[0]);
        flag = flag1;
          goto _L2
        curlocdatalogentry;
        obj1;
        JVM INSTR monitorexit ;
        throw curlocdatalogentry;
          goto _L5
    }

    public void clearLogs()
    {
        synchronized (lock)
        {
            TwcPrefs.getInstance().putString(com.weather.util.prefs.TwcPrefs.Keys.ALERTS_LOG, (new JSONArray()).toString());
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public List getAlertsLog()
    {
        ArrayList arraylist;
        Object obj;
        obj = getLog();
        arraylist = new ArrayList();
        if (!((String) (obj)).isEmpty()) goto _L2; else goto _L1
_L1:
        return arraylist;
_L2:
        int i;
        JSONObject jsonobject;
        try
        {
            obj = new JSONArray(((String) (obj)));
        }
        catch (JSONException jsonexception)
        {
            LogUtil.e("AlertsLogger", LoggingMetaTags.TWC_ALERTS, jsonexception.getLocalizedMessage(), new Object[0]);
            return arraylist;
        }
        i = 0;
_L4:
        if (i >= ((JSONArray) (obj)).length())
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonobject = ((JSONArray) (obj)).getJSONObject(i);
        if (jsonobject.has("alertLat"))
        {
            arraylist.add(new AlertLogEntry(jsonobject));
            break MISSING_BLOCK_LABEL_114;
        }
        arraylist.add(new CurLocLogEntry(jsonobject));
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
    }

    public String getLogEntriesAsRawJson()
    {
        return getLog();
    }

}
