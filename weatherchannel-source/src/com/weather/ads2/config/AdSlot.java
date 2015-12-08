// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.config;

import com.google.android.gms.ads.AdSize;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.weather.util.CollectionsUtil;
import com.weather.util.json.JsonUtil;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AdSlot
{

    private static final String KEY_AD_UNIT_SUFFIX = "adUnitSuffix";
    private static final String KEY_PARAMETERS = "parameters";
    private static final String KEY_SIZES = "sizes";
    private static final String KEY_SLOT_NAME = "slotName";
    private final List adSizes;
    private final String adUnitSuffix;
    private final Map parameters;
    private final String slotName;

    private AdSlot(String s, String s1, List list, Map map)
    {
        slotName = (String)Preconditions.checkNotNull(s);
        adUnitSuffix = (String)Preconditions.checkNotNull(s1);
        adSizes = ImmutableList.copyOf(list);
        parameters = ImmutableMap.copyOf(map);
    }

    public AdSlot(JSONObject jsonobject)
        throws JSONException
    {
        slotName = jsonobject.getString("slotName");
        adUnitSuffix = jsonobject.getString("adUnitSuffix");
        adSizes = parseAdSizes(jsonobject);
        parameters = parseParameters(jsonobject);
    }

    private static List parseAdSizes(JSONObject jsonobject)
        throws JSONException
    {
        JSONArray jsonarray = jsonobject.optJSONArray("sizes");
        if (jsonarray == null)
        {
            return ImmutableList.of();
        }
        com.google.common.collect.ImmutableList.Builder builder = ImmutableList.builder();
        int j = jsonarray.length();
        int i = 0;
        while (i < j) 
        {
            jsonobject = (String)jsonarray.get(i);
            int k = jsonobject.indexOf("x");
            if (k > 0)
            {
                try
                {
                    builder.add(new AdSize(Integer.parseInt(jsonobject.substring(0, k)), Integer.parseInt(jsonobject.substring(k + 1))));
                }
                catch (NumberFormatException numberformatexception)
                {
                    throw new JSONException((new StringBuilder()).append("Invalid ad size ").append(jsonobject).toString());
                }
            }
            i++;
        }
        return builder.build();
    }

    private static Map parseParameters(JSONObject jsonobject)
        throws JSONException
    {
        Map map = JsonUtil.getFieldsAsStringMap(jsonobject, "parameters", null);
        jsonobject = map;
        if (map == null)
        {
            jsonobject = ImmutableMap.of();
        }
        return jsonobject;
    }

    public AdSlot addTargetingParameters(Map map)
    {
        return new AdSlot(slotName, adUnitSuffix, adSizes, CollectionsUtil.mergeMaps(parameters, map, ","));
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AdSlot)obj;
            if (adSizes == null ? ((AdSlot) (obj)).adSizes != null : !adSizes.equals(((AdSlot) (obj)).adSizes))
            {
                return false;
            }
            if (adUnitSuffix == null ? ((AdSlot) (obj)).adUnitSuffix != null : !adUnitSuffix.equals(((AdSlot) (obj)).adUnitSuffix))
            {
                return false;
            }
            if (parameters == null ? ((AdSlot) (obj)).parameters != null : !parameters.equals(((AdSlot) (obj)).parameters))
            {
                return false;
            }
            if (slotName == null ? ((AdSlot) (obj)).slotName != null : !slotName.equals(((AdSlot) (obj)).slotName))
            {
                return false;
            }
        }
        return true;
    }

    public List getAllowedAdSizes(AdSize adsize)
    {
        if (adSizes.isEmpty())
        {
            return ImmutableList.of(adsize);
        } else
        {
            return adSizes;
        }
    }

    public Map getParameters()
    {
        return parameters;
    }

    public String getSlotName()
    {
        return slotName;
    }

    public String getSuffix()
    {
        return adUnitSuffix;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (slotName != null)
        {
            i = slotName.hashCode();
        } else
        {
            i = 0;
        }
        if (adUnitSuffix != null)
        {
            j = adUnitSuffix.hashCode();
        } else
        {
            j = 0;
        }
        if (adSizes != null)
        {
            k = adSizes.hashCode();
        } else
        {
            k = 0;
        }
        if (parameters != null)
        {
            l = parameters.hashCode();
        }
        return ((i * 31 + j) * 31 + k) * 31 + l;
    }

    public boolean isMatched(String s)
    {
        return slotName.contains(s);
    }
}
