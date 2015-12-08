// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.config;

import org.json.JSONException;
import org.json.JSONObject;

public final class FactualConfig
{

    private static final String LABEL_MAX_GEO = "geo";
    private static final String LABEL_MAX_SEGMENTS = "maxSegments";
    private static final String LABEL_MAX_SET = "set";
    private final int maxGeoSegments;
    private final int maxSetSegments;

    public FactualConfig(int i, int j)
    {
        maxGeoSegments = i;
        maxSetSegments = j;
    }

    public FactualConfig(String s)
        throws JSONException
    {
        s = (new JSONObject(s)).getJSONObject("maxSegments");
        maxGeoSegments = s.getInt("geo");
        maxSetSegments = s.getInt("set");
        if (maxGeoSegments < 0 || maxSetSegments < 0)
        {
            throw new JSONException((new StringBuilder()).append("something has negative value maxGeoSegments :").append(maxGeoSegments).append(", maxSetSegments :").append(maxSetSegments).toString());
        } else
        {
            return;
        }
    }

    public int getMaxGeoSegments()
    {
        return maxGeoSegments;
    }

    public int getMaxSetSegments()
    {
        return maxSetSegments;
    }

    public String toString()
    {
        return (new StringBuilder()).append("FactualConfig{maxGeoSegments=").append(maxGeoSegments).append(", maxSetSegments=").append(maxSetSegments).append('}').toString();
    }
}
