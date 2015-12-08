// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push.alertmessageparsers;

import com.weather.commons.push.AlertResponseField;
import com.weather.commons.push.alertmessages.PollenAlertMessage;
import com.weather.util.json.JsonParser;
import org.json.JSONException;
import org.json.JSONObject;

public class PollenAlertMessageParser
    implements JsonParser
{

    public PollenAlertMessageParser()
    {
    }

    public PollenAlertMessage parse(JSONObject jsonobject)
        throws JSONException
    {
        return new PollenAlertMessage(jsonobject.getString(AlertResponseField.PRODUCT.getName()), jsonobject.getString(AlertResponseField.LOCATION_CODE.getName()), jsonobject.getString(AlertResponseField.TREE_LEVEL.getName()), jsonobject.getString(AlertResponseField.GRASS_LEVEL.getName()), jsonobject.getString(AlertResponseField.WEEDS_LEVEL.getName()), jsonobject.getString(AlertResponseField.PRESENTATION_NAME.getName()));
    }

    public volatile Object parse(JSONObject jsonobject)
        throws JSONException
    {
        return parse(jsonobject);
    }
}
