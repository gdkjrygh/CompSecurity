// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.beacons.config;

import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BeaconParameters
{

    private static final String DYNAMIC_PARAMETERS_KEY = "dynamicParameters";
    private static final String STATIC_PARAMETERS_KEY = "staticParameters";
    private static final String TAG = "BeaconParameters";
    private final Set dynamicParameters;
    private final Map staticParameters;

    public BeaconParameters(JSONObject jsonobject)
        throws JSONException
    {
        dynamicParameters = parseDynamicParameters(jsonobject.getJSONArray("dynamicParameters"));
        staticParameters = parseStaticParameters(jsonobject.getJSONObject("staticParameters"));
    }

    private Set parseDynamicParameters(JSONArray jsonarray)
        throws JSONException
    {
        HashSet hashset = new HashSet();
        for (int i = 0; i < jsonarray.length(); i++)
        {
            String s = (String)jsonarray.get(i);
            hashset.add(s);
            LogUtil.d("BeaconParameters", LoggingMetaTags.TWC_AD, "encountered unknown beacon parameter:%s", new Object[] {
                s
            });
        }

        return hashset;
    }

    private Map parseStaticParameters(JSONObject jsonobject)
        throws JSONException
    {
        Iterator iterator = jsonobject.keys();
        HashMap hashmap = new HashMap();
        String s;
        for (; iterator.hasNext(); hashmap.put(s, (String)jsonobject.get(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    public Set getDynamicParameters()
    {
        return dynamicParameters;
    }

    public Map getStaticParameters()
    {
        return staticParameters;
    }
}
