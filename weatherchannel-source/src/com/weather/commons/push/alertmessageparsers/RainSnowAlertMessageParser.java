// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push.alertmessageparsers;

import com.weather.commons.push.AlertResponseField;
import com.weather.commons.push.alertmessages.RainSnowAlertMessage;
import com.weather.util.json.JsonParser;
import org.json.JSONException;
import org.json.JSONObject;

public class RainSnowAlertMessageParser
    implements JsonParser
{

    public RainSnowAlertMessageParser()
    {
    }

    public RainSnowAlertMessage parse(JSONObject jsonobject)
        throws JSONException
    {
        return new RainSnowAlertMessage(jsonobject.getString(AlertResponseField.LOCALIZED_HEADLINE.getName()), jsonobject.getString(AlertResponseField.LOCATION_CODE.getName()), jsonobject.getString(AlertResponseField.PRODUCT.getName()));
    }

    public volatile Object parse(JSONObject jsonobject)
        throws JSONException
    {
        return parse(jsonobject);
    }
}
