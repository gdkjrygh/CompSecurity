// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push.alertmessageparsers;

import com.weather.commons.push.AlertResponseField;
import com.weather.commons.push.alertmessages.HighWindAlertMessage;
import com.weather.util.json.JsonParser;
import org.json.JSONException;
import org.json.JSONObject;

public class HighWindAlertMessageParser
    implements JsonParser
{

    public HighWindAlertMessageParser()
    {
    }

    public HighWindAlertMessage parse(JSONObject jsonobject)
        throws JSONException
    {
        return new HighWindAlertMessage(jsonobject.getString(AlertResponseField.SIGNIFICANT_WEATHER_ALERT_LOCALIZED_TEXT.getName()));
    }

    public volatile Object parse(JSONObject jsonobject)
        throws JSONException
    {
        return parse(jsonobject);
    }
}
