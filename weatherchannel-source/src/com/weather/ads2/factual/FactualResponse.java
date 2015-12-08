// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.factual;

import com.weather.ads2.config.FactualConfig;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.ads2.factual:
//            Audience, Proximity

public final class FactualResponse
{

    private static final String KEY_AUDIENCE = "set";
    private static final String KEY_PROXIMITY = "proximity";
    private final Audience audience;
    private final Proximity proximity;

    public FactualResponse(FactualConfig factualconfig, String s)
        throws JSONException
    {
        Object obj = new JSONObject(s);
        s = ((JSONObject) (obj)).optString("set");
        obj = ((JSONObject) (obj)).optString("proximity");
        audience = new Audience(s, factualconfig);
        proximity = new Proximity(((String) (obj)), factualconfig);
    }

    public String getAudienceSegments()
    {
        return audience.getSegments();
    }

    public String getProximitySegments()
    {
        return proximity.getProximityNames();
    }
}
