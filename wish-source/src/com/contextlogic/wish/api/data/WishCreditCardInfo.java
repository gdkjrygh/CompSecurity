// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishShippingInfo

public class WishCreditCardInfo
    implements Serializable
{

    private static final long serialVersionUID = 0x16eaac91b7d642bdL;
    private WishShippingInfo billingAddress;
    private String cardArt;
    private com.contextlogic.wish.util.CreditCardUtil.CardType cardType;
    private int expiryMonth;
    private int expiryYear;
    private String lastFourDigits;

    public WishCreditCardInfo(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        String s = jsonobject.getString("card_type").toLowerCase();
        if (!s.equals("discover")) goto _L2; else goto _L1
_L1:
        cardType = com.contextlogic.wish.util.CreditCardUtil.CardType.Discover;
_L6:
        lastFourDigits = jsonobject.getString("last_4_digits");
        expiryMonth = jsonobject.optInt("expiry_month");
        expiryYear = jsonobject.optInt("expiry_year");
        if (jsonobject.has("card_art") && !jsonobject.isNull("card_art"))
        {
            cardArt = jsonobject.getString("card_art");
        }
        if (!jsonobject.has("billing_address")) goto _L4; else goto _L3
_L3:
        boolean flag = jsonobject.isNull("billing_address");
        if (flag) goto _L4; else goto _L5
_L5:
        billingAddress = new WishShippingInfo(jsonobject.getJSONObject("billing_address"));
        if (billingAddress.getStreetAddressLineOne() == null || billingAddress.getStreetAddressLineOne().trim().equals(""))
        {
            billingAddress = null;
        }
_L4:
        return;
_L2:
label0:
        {
            if (!s.equals("mastercard"))
            {
                break label0;
            }
            cardType = com.contextlogic.wish.util.CreditCardUtil.CardType.MasterCard;
        }
          goto _L6
label1:
        {
            if (!s.equals("american express"))
            {
                break label1;
            }
            cardType = com.contextlogic.wish.util.CreditCardUtil.CardType.Amex;
        }
          goto _L6
label2:
        {
            if (!s.equals("visa"))
            {
                break label2;
            }
            cardType = com.contextlogic.wish.util.CreditCardUtil.CardType.Visa;
        }
          goto _L6
label3:
        {
            if (!s.equals("diners club"))
            {
                break label3;
            }
            cardType = com.contextlogic.wish.util.CreditCardUtil.CardType.DinersClub;
        }
          goto _L6
label4:
        {
            if (!s.equals("hipercard"))
            {
                break label4;
            }
            cardType = com.contextlogic.wish.util.CreditCardUtil.CardType.HiperCard;
        }
          goto _L6
        try
        {
            cardType = com.contextlogic.wish.util.CreditCardUtil.CardType.Invalid;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
          goto _L6
        jsonobject;
    }

    public WishShippingInfo getBillingAddress()
    {
        return billingAddress;
    }

    public String getCardArt()
    {
        return cardArt;
    }

    public com.contextlogic.wish.util.CreditCardUtil.CardType getCardType()
    {
        return cardType;
    }

    public int getExpiryMonth()
    {
        return expiryMonth;
    }

    public int getExpiryYear()
    {
        return expiryYear;
    }

    public String getLastFourDigits()
    {
        return lastFourDigits;
    }
}
