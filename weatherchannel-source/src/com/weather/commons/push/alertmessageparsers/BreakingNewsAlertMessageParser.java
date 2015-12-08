// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push.alertmessageparsers;

import com.weather.commons.push.AlertResponseField;
import com.weather.commons.push.alertmessages.BreakingNewsAlertMessage;
import com.weather.util.json.JsonParser;
import org.json.JSONException;
import org.json.JSONObject;

public class BreakingNewsAlertMessageParser
    implements JsonParser
{

    public BreakingNewsAlertMessageParser()
    {
    }

    public BreakingNewsAlertMessage parse(JSONObject jsonobject)
        throws JSONException
    {
        return new BreakingNewsAlertMessage(jsonobject.getString(AlertResponseField.PRODUCT.getName()), jsonobject.getString(AlertResponseField.ARTICLE_ID.getName()), jsonobject.getString(AlertResponseField.ARTICLE_URL.getName()), jsonobject.getString(AlertResponseField.IMG_SRC.getName()), jsonobject.getString(AlertResponseField.TITLE.getName()));
    }

    public volatile Object parse(JSONObject jsonobject)
        throws JSONException
    {
        return parse(jsonobject);
    }
}
