// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.factual;

import com.google.common.base.Joiner;
import com.weather.ads2.config.FactualConfig;
import com.weather.dal2.eventlog.logs.EventLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class Audience
{

    private static final String SEGMENT_NAME_KEY = "group";
    private static final String TAG = "Factual.Audience";
    private final String confidentSegments;

    public Audience(String s, FactualConfig factualconfig)
    {
        confidentSegments = calculateSegments(s, factualconfig);
    }

    private static String calculateSegments(String s, FactualConfig factualconfig)
    {
        String s1 = "nl";
        if (!s.isEmpty())
        {
            try
            {
                s1 = getSegments(new JSONArray(s), factualconfig.getMaxSetSegments());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                EventLog.e("Factual.Audience", (new StringBuilder()).append("parsing audience json error: ").append(s.getMessage()).toString());
                return "nl";
            }
        }
        return s1;
    }

    private static String getSegments(JSONArray jsonarray, int i)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        int j = 0;
        while (j < jsonarray.length()) 
        {
            Object obj = jsonarray.getJSONObject(j);
            if (((JSONObject) (obj)).isNull("group"))
            {
                obj = "";
            } else
            {
                obj = ((JSONObject) (obj)).optString("group");
            }
            if (!((String) (obj)).isEmpty())
            {
                arraylist.add(obj);
            }
            j++;
        }
        Collections.shuffle(arraylist);
        jsonarray = arraylist;
        if (arraylist.size() > i)
        {
            jsonarray = arraylist.subList(0, i);
        }
        if (jsonarray.isEmpty())
        {
            return "nl";
        } else
        {
            return Joiner.on(',').join(jsonarray);
        }
    }

    public String getSegments()
    {
        return confidentSegments;
    }
}
