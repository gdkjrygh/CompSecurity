// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishProduct, WishSignupFreeGiftsAbandon

public class WishSignupFreeGifts
    implements Serializable
{
    public static final class SIGNUP_FLOW extends Enum
    {

        private static final SIGNUP_FLOW $VALUES[];
        public static final SIGNUP_FLOW FREE_GIFT;

        public static SIGNUP_FLOW valueOf(String s)
        {
            return (SIGNUP_FLOW)Enum.valueOf(com/contextlogic/wish/api/data/WishSignupFreeGifts$SIGNUP_FLOW, s);
        }

        public static SIGNUP_FLOW[] values()
        {
            return (SIGNUP_FLOW[])$VALUES.clone();
        }

        static 
        {
            FREE_GIFT = new SIGNUP_FLOW("FREE_GIFT", 0);
            $VALUES = (new SIGNUP_FLOW[] {
                FREE_GIFT
            });
        }

        private SIGNUP_FLOW(String s, int i)
        {
            super(s, i);
        }
    }


    private static final long serialVersionUID = 0xdcc6b299e7d6f2c5L;
    private WishSignupFreeGiftsAbandon abandonInfo;
    private String claimGiftText;
    private String message;
    private SIGNUP_FLOW signupFlow;
    private ArrayList signupGifts;
    private String subtitle;
    private String title;

    public WishSignupFreeGifts(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        JSONArray jsonarray;
        WishProduct wishproduct;
        int i;
        try
        {
            signupGifts = new ArrayList();
            jsonarray = jsonobject.getJSONArray("items");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
        i = 0;
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        wishproduct = new WishProduct(jsonarray.getJSONObject(i));
        signupGifts.add(wishproduct);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_25;
_L1:
        title = jsonobject.getString("title");
        subtitle = jsonobject.getString("subtitle");
        message = jsonobject.getString("message");
        claimGiftText = jsonobject.getString("claim_gift_text");
        signupFlow = SIGNUP_FLOW.FREE_GIFT;
        if (jsonobject.has("abandon_modal") && !jsonobject.isNull("abandon_modal"))
        {
            abandonInfo = new WishSignupFreeGiftsAbandon(jsonobject.getJSONObject("abandon_modal"));
        }
        return;
    }

    public WishSignupFreeGiftsAbandon getAbandonInfo()
    {
        return abandonInfo;
    }

    public String getClaimGiftText()
    {
        return claimGiftText;
    }

    public String getMessage()
    {
        return message;
    }

    public SIGNUP_FLOW getSignupFlow()
    {
        return signupFlow;
    }

    public ArrayList getSignupGiftProducts()
    {
        return signupGifts;
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
