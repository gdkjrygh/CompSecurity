// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class WishFeedEndedButtonSpec
    implements Serializable
{

    private static final long serialVersionUID = 0x68d2fefcadcbb457L;
    private String actionDeepLink;
    private com.contextlogic.wish.ui.components.list.LoadingListRow.ButtonColor buttonColor;
    private String buttonText;
    private String message;

    public WishFeedEndedButtonSpec(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        String s;
        String s1;
        try
        {
            buttonText = jsonobject.getString("button_text");
            message = jsonobject.getString("message");
            actionDeepLink = jsonobject.getString("action_deep_link");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
        s1 = "gray";
        s = s1;
        if (!jsonobject.has("button_color"))
        {
            break MISSING_BLOCK_LABEL_66;
        }
        s = s1;
        if (!jsonobject.isNull("button_color"))
        {
            s = jsonobject.getString("button_color");
        }
        if (s.equals("blue"))
        {
            buttonColor = com.contextlogic.wish.ui.components.list.LoadingListRow.ButtonColor.Blue;
            return;
        }
        if (s.equals("orange"))
        {
            buttonColor = com.contextlogic.wish.ui.components.list.LoadingListRow.ButtonColor.Orange;
            return;
        }
        buttonColor = com.contextlogic.wish.ui.components.list.LoadingListRow.ButtonColor.Gray;
        return;
    }

    public String getActionDeepLink()
    {
        return actionDeepLink;
    }

    public com.contextlogic.wish.ui.components.list.LoadingListRow.ButtonColor getButtonColor()
    {
        return buttonColor;
    }

    public String getButtonText()
    {
        return buttonText;
    }

    public String getMessage()
    {
        return message;
    }
}
