// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class WishETrustBadge
    implements Serializable
{

    private static final long serialVersionUID = 0x740f083104b9edeaL;
    private String logoText;
    private String message;
    private String title;

    public WishETrustBadge(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            logoText = jsonobject.getString("logo_text").toUpperCase(Locale.getDefault());
            title = jsonobject.getString("title");
            message = jsonobject.getString("message");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
    }

    public String getLogoText()
    {
        return logoText;
    }

    public String getMessage()
    {
        return message;
    }

    public String getTitle()
    {
        return title;
    }
}
