// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import android.graphics.Color;
import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class WishCrossPromoBanner
    implements Serializable
{

    private static final long serialVersionUID = 0x64b568f3c2841247L;
    private String action;
    private int actionButtonColor;
    private String actionButtonText;
    private String imageUrl;
    private String message;
    private String productId;
    private String promoId;
    private String title;

    public WishCrossPromoBanner(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            title = jsonobject.optString("title", null);
            message = jsonobject.optString("message", null);
            promoId = jsonobject.getString("id");
            imageUrl = jsonobject.getString("image_url");
            actionButtonText = jsonobject.optString("action_button_text", null);
            if (jsonobject.has("action_button_color") && !jsonobject.isNull("action_button_color"))
            {
                actionButtonColor = Color.parseColor(jsonobject.getString("action_button_color"));
            }
            action = jsonobject.getString("action");
            productId = jsonobject.optString("product_id", null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
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

    public int getActionButtonColor()
    {
        return actionButtonColor;
    }

    public String getActionButtonText()
    {
        return actionButtonText;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }

    public String getMessage()
    {
        return message;
    }

    public String getProductId()
    {
        return productId;
    }

    public String getPromoId()
    {
        return promoId;
    }

    public String getTitle()
    {
        return title;
    }
}
