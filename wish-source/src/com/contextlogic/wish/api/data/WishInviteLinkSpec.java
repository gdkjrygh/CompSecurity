// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class WishInviteLinkSpec
    implements Serializable
{

    private static final long serialVersionUID = 0xadb40836bed5acbaL;
    private String detailText;
    private String menuText;
    private String shareLink;
    private String shareMessage;
    private String shareShortMessage;
    private String shareSubject;

    public WishInviteLinkSpec(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            menuText = jsonobject.getString("menu_text");
            detailText = jsonobject.getString("detail_text");
            shareLink = jsonobject.getString("share_link");
            shareSubject = jsonobject.getString("share_subject");
            shareMessage = jsonobject.getString("share_message");
            shareShortMessage = jsonobject.getString("share_short_message");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
    }

    public String getDetailText()
    {
        return detailText;
    }

    public JSONObject getJSONObject()
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            jsonobject.put("menu_text", menuText);
            jsonobject.put("detail_text", detailText);
            jsonobject.put("share_link", shareLink);
            jsonobject.put("share_subject", shareSubject);
            jsonobject.put("share_message", shareMessage);
            jsonobject.put("share_short_message", shareShortMessage);
        }
        catch (Throwable throwable)
        {
            return null;
        }
        return jsonobject;
    }

    public String getMenuText()
    {
        return menuText;
    }

    public String getShareLink()
    {
        return shareLink;
    }

    public String getShareMessage()
    {
        return shareMessage;
    }

    public String getShareShortMessage()
    {
        return shareShortMessage;
    }

    public String getShareSubject()
    {
        return shareSubject;
    }
}
