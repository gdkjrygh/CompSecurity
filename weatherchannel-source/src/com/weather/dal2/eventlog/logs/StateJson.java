// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.eventlog.logs;

import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.dal2.eventlog.logs:
//            LocationJson, NetworkJson, LbsJson

class StateJson
{

    static final String LBS = "lbs";
    static final String LOCALE = "locale";
    static final String LOCATIONS = "locations";
    static final String NETWORK = "network";
    static final String TAG = "StateJson";
    private final JSONObject jsonObject = new JSONObject();

    StateJson()
        throws JSONException
    {
        jsonObject.put("locale", Locale.getDefault());
        jsonObject.put("locations", (new LocationJson()).getJsonObject());
        jsonObject.put("network", (new NetworkJson()).getJsonObject());
        jsonObject.put("lbs", (new LbsJson()).getJsonObject());
    }

    public JSONObject getJsonObject()
    {
        return jsonObject;
    }
}
