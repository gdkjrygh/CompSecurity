// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishCart

public class WishSignupFreeGiftCart
    implements Serializable
{

    private static final long serialVersionUID = 0xc1c646453f48f557L;
    private String almostDone;
    private WishCart cart;
    private String freeGiftShippingText;
    private String modalButtonText;
    private String modalMessage;
    private String modalTitle;
    private String redeemGiftText;
    private String whereToShipTitle;

    public WishSignupFreeGiftCart(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            cart = new WishCart(jsonobject.getJSONObject("cart").getJSONObject("cart_info"));
            freeGiftShippingText = jsonobject.getString("free_gift_shipping_text");
            modalTitle = jsonobject.getString("free_gift_modal_title");
            modalMessage = jsonobject.getString("free_gift_modal_message");
            modalButtonText = jsonobject.getString("free_gift_modal_button_text");
            redeemGiftText = jsonobject.getString("free_gift_redeem_gift_text");
            whereToShipTitle = jsonobject.getString("free_gift_where_to_ship_title");
            almostDone = jsonobject.getString("free_gift_almost_done_text");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
    }

    public String getAlmostDone()
    {
        return almostDone;
    }

    public WishCart getCart()
    {
        return cart;
    }

    public String getFreeGiftShippingText()
    {
        return freeGiftShippingText;
    }

    public String getModalButtonText()
    {
        return modalButtonText;
    }

    public String getModalMessage()
    {
        return modalMessage;
    }

    public String getModalTitle()
    {
        return modalTitle;
    }

    public String getRedeemGiftText()
    {
        return redeemGiftText;
    }

    public String getWhereToShipTitle()
    {
        return whereToShipTitle;
    }
}
