// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push.alertmessageparsers;

import com.weather.commons.push.AlertResponseField;
import com.weather.commons.push.alertmessages.SevereWeatherAlertMessage;
import com.weather.util.json.JsonParser;
import org.json.JSONException;
import org.json.JSONObject;

public class SevereWeatherAlertMessageParser
    implements JsonParser
{

    public SevereWeatherAlertMessageParser()
    {
    }

    public SevereWeatherAlertMessage parse(JSONObject jsonobject)
        throws JSONException
    {
        return new SevereWeatherAlertMessage(jsonobject.getInt(AlertResponseField.SEVERITY_NUM.getName()), jsonobject.getString(AlertResponseField.ETNPHENOM.getName()), jsonobject.getString(AlertResponseField.SIGNIFICANCE.getName()), jsonobject.getString(AlertResponseField.PRODUCT.getName()), jsonobject.getString(AlertResponseField.COUNTRY_CODE.getName()), jsonobject.getString(AlertResponseField.CITY.getName()), jsonobject.getString(AlertResponseField.STATE.getName()), jsonobject.getString(AlertResponseField.COUNTRY.getName()), jsonobject.getString(AlertResponseField.DESCRIPTION.getName()), jsonobject.getString(AlertResponseField.TWC_EVENT_ID.getName()), jsonobject.getString(AlertResponseField.PRESENTATION_NAME.getName()), jsonobject.getString(AlertResponseField.LOC_TYPE.getName()), jsonobject.getString(AlertResponseField.LOCATION.getName()), jsonobject.getString(AlertResponseField.OFFICE_ID.getName()), jsonobject.getString(AlertResponseField.ETN.getName()));
    }

    public volatile Object parse(JSONObject jsonobject)
        throws JSONException
    {
        return parse(jsonobject);
    }
}
