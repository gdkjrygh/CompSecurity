// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class WishTopSearchSpec
    implements Serializable
{

    private static final long serialVersionUID = 0xbfbdd436088680f9L;
    private String action;
    private String query;

    public WishTopSearchSpec(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            query = jsonobject.getString("query");
            action = jsonobject.getString("action");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
    }

    public String getAction()
    {
        return action;
    }

    public JSONObject getJSONObject()
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            jsonobject.put("query", query);
            jsonobject.put("action", action);
        }
        catch (Throwable throwable)
        {
            return null;
        }
        return jsonobject;
    }

    public String getQuery()
    {
        return query;
    }
}
