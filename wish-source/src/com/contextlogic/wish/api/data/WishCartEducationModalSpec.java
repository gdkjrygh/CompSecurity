// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class WishCartEducationModalSpec
    implements Serializable
{

    private static final long serialVersionUID = 0x4cca3e01627a4fc0L;
    private String buttonText;
    private String imageUrl;
    private String message;
    private String title;

    public WishCartEducationModalSpec(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            title = jsonobject.getString("title");
            message = jsonobject.getString("message");
            buttonText = jsonobject.getString("button");
            if (jsonobject.has("product_image_url") && !jsonobject.isNull("product_image_url"))
            {
                imageUrl = jsonobject.getString("product_image_url");
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
    }

    public String getButtonText()
    {
        return buttonText;
    }

    public String getImageUrl()
    {
        return imageUrl;
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
