// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.config;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.commons.config:
//            LayerConfig

public class LayersConfig
{

    public final String application;
    private final Map layerConfigMap = Maps.newHashMap();
    public final List layers;

    public LayersConfig(JSONObject jsonobject)
        throws JSONException
    {
        application = jsonobject.getString("application");
        jsonobject = jsonobject.getJSONArray("layers");
        com.google.common.collect.ImmutableList.Builder builder = ImmutableList.builder();
        for (int i = 0; i < jsonobject.length(); i++)
        {
            LayerConfig layerconfig = new LayerConfig(jsonobject.getJSONObject(i));
            builder.add(layerconfig);
            layerConfigMap.put(layerconfig.layerId, layerconfig);
        }

        layers = builder.build();
    }
}
