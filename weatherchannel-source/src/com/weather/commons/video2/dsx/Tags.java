// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2.dsx;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Tags
{

    private static final String DMA_MARKER = "DMA";
    private static final String FIELD_NAME_GEO = "geo";
    public static final String UNKNOWN_LOCALE = "unknown";
    private static final Tags defaultInstance = new Tags("unknown");
    private final String dmaLocale;

    public Tags(String s)
    {
        dmaLocale = s;
    }

    public static Tags fromJson(JSONObject jsonobject)
        throws JSONException
    {
        Object obj = getDefault();
        if (!jsonobject.has("geo")) goto _L2; else goto _L1
_L1:
        JSONArray jsonarray;
        jsonarray = jsonobject.getJSONArray("geo");
        obj = "unknown";
        jsonobject = ((JSONObject) (obj));
        if (jsonarray == null) goto _L4; else goto _L3
_L3:
        jsonobject = ((JSONObject) (obj));
        if (jsonarray.length() <= 0) goto _L4; else goto _L5
_L5:
        int i;
        i = 0;
        jsonobject = ((JSONObject) (obj));
_L9:
        if (i >= jsonarray.length()) goto _L4; else goto _L6
_L6:
        jsonobject = jsonarray.get(i).toString();
        if (!jsonobject.contains("DMA")) goto _L7; else goto _L4
_L4:
        obj = new Tags(jsonobject);
_L2:
        return ((Tags) (obj));
_L7:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static Tags getDefault()
    {
        return defaultInstance;
    }

    public String getDmaLocale()
    {
        return dmaLocale;
    }

    public boolean hasDmaLocale()
    {
        return !getDmaLocale().equals("unknown");
    }

    public String toString()
    {
        return (new StringBuilder()).append("Tags{dmaLocale='").append(dmaLocale).append('\'').append('}').toString();
    }

}
