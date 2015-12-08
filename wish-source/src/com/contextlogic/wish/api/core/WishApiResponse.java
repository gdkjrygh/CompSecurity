// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.core;

import org.json.JSONException;
import org.json.JSONObject;

public class WishApiResponse
{

    public static final int DEFAULT_CODE = -1;
    private int code;
    private JSONObject data;
    private String message;

    public WishApiResponse(JSONObject jsonobject)
    {
        try
        {
            if (!jsonobject.isNull("msg"))
            {
                message = jsonobject.getString("msg");
            }
            code = jsonobject.getInt("code");
            if (!jsonobject.isNull("data"))
            {
                data = jsonobject.getJSONObject("data");
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            message = null;
        }
        code = -1;
        data = null;
    }

    public int getCode()
    {
        return code;
    }

    public JSONObject getData()
    {
        return data;
    }

    public String getMessage()
    {
        return message;
    }

    public boolean hasData()
    {
        return data != null;
    }

    public boolean isErrorResponse()
    {
        return code != 0;
    }
}
