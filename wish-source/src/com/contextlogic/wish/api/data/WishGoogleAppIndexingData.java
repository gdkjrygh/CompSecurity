// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import org.json.JSONException;
import org.json.JSONObject;

public class WishGoogleAppIndexingData
{

    private static final long serialVersionUID = 0xe41a30b6be21befaL;
    private String appUri;
    private String webUrl;

    public WishGoogleAppIndexingData(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            appUri = jsonobject.getString("google_appindexing_base_app_uri");
            webUrl = jsonobject.getString("google_appindexing_base_web_url");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
    }

    public String getAppUri()
    {
        return appUri;
    }

    public JSONObject getJSONObject()
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            jsonobject.put("google_appindexing_base_app_uri", appUri);
            jsonobject.put("google_appindexing_base_web_url", webUrl);
        }
        catch (Throwable throwable)
        {
            return null;
        }
        return jsonobject;
    }

    public String getWebURL()
    {
        return webUrl;
    }
}
