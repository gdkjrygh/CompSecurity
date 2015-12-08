// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class WishWishLookBannerSpec
    implements Serializable
{

    private static final long serialVersionUID = 0xadb40836bed5acbaL;
    private String shareContent;
    private String socialText;
    private String subtitle;
    private String title;

    public WishWishLookBannerSpec(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            title = jsonobject.getString("title");
            subtitle = jsonobject.getString("subtitle");
            if (jsonobject.has("social_text") && !jsonobject.isNull("social_text"))
            {
                socialText = jsonobject.getString("social_text");
            }
            if (jsonobject.has("share_content") && !jsonobject.isNull("share_content"))
            {
                shareContent = jsonobject.getString("share_content");
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
    }

    public String getShareContent()
    {
        return shareContent;
    }

    public String getSocialText()
    {
        return socialText;
    }

    public String getSubtitle()
    {
        return subtitle;
    }

    public String getTitle()
    {
        return title;
    }
}
