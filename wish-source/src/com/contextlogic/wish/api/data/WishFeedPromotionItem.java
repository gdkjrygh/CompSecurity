// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class WishFeedPromotionItem
    implements Serializable
{
    public static final class FeedPromotionItemDisplayMode extends Enum
    {

        private static final FeedPromotionItemDisplayMode $VALUES[];
        public static final FeedPromotionItemDisplayMode Banner;
        public static final FeedPromotionItemDisplayMode Tile;
        public static final FeedPromotionItemDisplayMode Unknown;

        public static FeedPromotionItemDisplayMode valueOf(String s)
        {
            return (FeedPromotionItemDisplayMode)Enum.valueOf(com/contextlogic/wish/api/data/WishFeedPromotionItem$FeedPromotionItemDisplayMode, s);
        }

        public static FeedPromotionItemDisplayMode[] values()
        {
            return (FeedPromotionItemDisplayMode[])$VALUES.clone();
        }

        static 
        {
            Banner = new FeedPromotionItemDisplayMode("Banner", 0);
            Tile = new FeedPromotionItemDisplayMode("Tile", 1);
            Unknown = new FeedPromotionItemDisplayMode("Unknown", 2);
            $VALUES = (new FeedPromotionItemDisplayMode[] {
                Banner, Tile, Unknown
            });
        }

        private FeedPromotionItemDisplayMode(String s, int i)
        {
            super(s, i);
        }
    }


    private static final long serialVersionUID = 0x59eda7e085255998L;
    private String actionButtonText;
    private String actionUrl;
    private String campaignId;
    private String dismissButtonText;
    private FeedPromotionItemDisplayMode displayMode;
    private String imageUrl;
    private boolean impressionTracked;
    private String text;

    public WishFeedPromotionItem(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        impressionTracked = false;
        campaignId = jsonobject.getString("campaign_id");
        text = jsonobject.getString("text");
        imageUrl = jsonobject.getString("image_url");
        jsonobject.getInt("display_mode");
        JVM INSTR tableswitch 1 2: default 139
    //                   1 106
    //                   2 129;
           goto _L1 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_129;
_L1:
        displayMode = FeedPromotionItemDisplayMode.Unknown;
_L4:
        actionUrl = jsonobject.getString("action_url");
        actionButtonText = jsonobject.getString("action_button_text");
        dismissButtonText = jsonobject.optString("dismiss_button_text");
        return;
_L2:
        try
        {
            displayMode = FeedPromotionItemDisplayMode.Banner;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
          goto _L4
        displayMode = FeedPromotionItemDisplayMode.Tile;
          goto _L4
    }

    public String getActionButtonText()
    {
        return actionButtonText;
    }

    public String getActionUrl()
    {
        return actionUrl;
    }

    public String getCampaignId()
    {
        return campaignId;
    }

    public String getDismissButtonText()
    {
        return dismissButtonText;
    }

    public FeedPromotionItemDisplayMode getDisplayMode()
    {
        return displayMode;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }

    public String getText()
    {
        return text;
    }

    public boolean isImpressionTracked()
    {
        return impressionTracked;
    }

    public void setImpressionTracked(boolean flag)
    {
        impressionTracked = flag;
    }
}
