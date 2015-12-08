// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class WishSignupFreeGiftsAbandon
    implements Serializable
{

    private static final long serialVersionUID = 0x61f9c15ba7ca8dc6L;
    private String actionButtonText;
    private String cancelButtonText;
    private String message;
    private String title;

    public WishSignupFreeGiftsAbandon(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            title = jsonobject.getString("title");
            message = jsonobject.getString("message");
            actionButtonText = jsonobject.getString("action_button_text");
            cancelButtonText = jsonobject.getString("cancel_button_text");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
    }

    public String getActionButtonText()
    {
        return actionButtonText;
    }

    public String getCancelButtonText()
    {
        return cancelButtonText;
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
