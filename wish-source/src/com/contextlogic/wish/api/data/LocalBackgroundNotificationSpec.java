// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class LocalBackgroundNotificationSpec
    implements Serializable
{

    private static final long serialVersionUID = 0xb224e13d124ac51fL;
    private long delay;
    private String id;
    private long minimumInterval;
    private String target;
    private String text;
    private String type;

    public LocalBackgroundNotificationSpec(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            target = jsonobject.getString("target");
            id = jsonobject.getString("id");
            text = jsonobject.getString("text");
            delay = jsonobject.getLong("delay");
            type = jsonobject.getString("type");
            minimumInterval = jsonobject.getLong("interval") * 1000L;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
    }

    public long getDelay()
    {
        return delay;
    }

    public String getId()
    {
        return id;
    }

    public JSONObject getJSONObject()
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            jsonobject.put("type", type);
            jsonobject.put("target", target);
            jsonobject.put("id", id);
            jsonobject.put("text", text);
            jsonobject.put("delay", delay);
            jsonobject.put("interval", minimumInterval / 1000L);
        }
        catch (Throwable throwable)
        {
            return null;
        }
        return jsonobject;
    }

    public long getMinimumInterval()
    {
        return minimumInterval;
    }

    public String getTarget()
    {
        return target;
    }

    public String getText()
    {
        return text;
    }

    public String getType()
    {
        return type;
    }
}
