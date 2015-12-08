// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.factual;

import com.google.common.base.Joiner;
import com.weather.ads2.config.FactualConfig;
import com.weather.dal2.eventlog.logs.EventLog;
import java.util.Collection;
import java.util.LinkedHashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class Proximity
{

    private static final String LABEL_SEGMENT_NAME = "index";
    private static final String TAG = "Factual.Proximity";
    private final String proximityNames;

    public Proximity(String s, FactualConfig factualconfig)
    {
        proximityNames = getProximity(s, factualconfig.getMaxGeoSegments());
    }

    private static String getProximity(String s, int i)
    {
        Object obj;
        String s1;
        s1 = "nl";
        obj = s1;
        if (s.isEmpty())
        {
            break MISSING_BLOCK_LABEL_107;
        }
        obj = new JSONArray(s);
        s = new LinkedHashSet(Math.min(i, ((JSONArray) (obj)).length()));
        int j = 0;
        do
        {
            try
            {
                if (j >= ((JSONArray) (obj)).length() || s.size() >= i)
                {
                    break;
                }
                s.add(((JSONArray) (obj)).getJSONObject(j).getString("index"));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                EventLog.w("Factual.Proximity", (new StringBuilder()).append("Unable to parse proximity values: ").append(s.getMessage()).toString());
                return "nl";
            }
            j++;
        } while (true);
        obj = s1;
        if (!s.isEmpty())
        {
            obj = Joiner.on(',').join(s);
        }
        return ((String) (obj));
    }

    public String getProximityNames()
    {
        return proximityNames;
    }
}
