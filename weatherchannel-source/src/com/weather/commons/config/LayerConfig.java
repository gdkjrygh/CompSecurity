// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.config;

import org.json.JSONException;
import org.json.JSONObject;

public class LayerConfig
{

    private static final String ALERT_TYPE = "alerttype";
    private static final String DESCRIPTION = "description";
    private static final String LAYER_KEY = "id";
    private static final String LAYER_NAME = "layername";
    public final String alertType;
    public final String description;
    public final String layerId;
    public final String layerName;

    public LayerConfig(JSONObject jsonobject)
        throws JSONException
    {
        layerId = jsonobject.getString("id");
        description = jsonobject.getString("description");
        alertType = jsonobject.getString("alerttype");
        layerName = jsonobject.getString("layername");
    }
}
