// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.util.DateUtil;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishImage, WishProduct, WishLocalizedCurrencyValue

public class WishWalletItem
    implements Serializable
{
    public static final class WalletItemType extends Enum
    {

        private static final WalletItemType $VALUES[];
        public static final WalletItemType ExpiredGiftCard;
        public static final WalletItemType GiftCard;

        public static WalletItemType valueOf(String s)
        {
            return (WalletItemType)Enum.valueOf(com/contextlogic/wish/api/data/WishWalletItem$WalletItemType, s);
        }

        public static WalletItemType[] values()
        {
            return (WalletItemType[])$VALUES.clone();
        }

        static 
        {
            GiftCard = new WalletItemType("GiftCard", 0);
            ExpiredGiftCard = new WalletItemType("ExpiredGiftCard", 1);
            $VALUES = (new WalletItemType[] {
                GiftCard, ExpiredGiftCard
            });
        }

        private WalletItemType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final long serialVersionUID = 0xdfa571fe3f9db71eL;
    private String actionDeepLink;
    private String creditId;
    private double discountPercent;
    private WishLocalizedCurrencyValue discountValue;
    private boolean expired;
    private Date expiryDate;
    private ArrayList previewImages;
    private WishProduct product;
    private String rebateId;
    private String titleText;
    private WalletItemType type;

    public WishWalletItem(JSONObject jsonobject, WalletItemType walletitemtype)
        throws ApiMalformedDataException
    {
        double d;
        d = 0.0D;
        super();
        type = walletitemtype;
        if (jsonobject.has("deal_title") && !jsonobject.isNull("deal_title"))
        {
            titleText = jsonobject.getString("deal_title");
        }
        if (jsonobject.has("mobile_action_url") && !jsonobject.isNull("mobile_action_url"))
        {
            actionDeepLink = jsonobject.getString("mobile_action_url");
        }
        if (jsonobject.has("id") && !jsonobject.isNull("id"))
        {
            rebateId = jsonobject.getString("id");
            creditId = jsonobject.getString("id");
        }
        expired = jsonobject.optBoolean("expired", false);
        if (jsonobject.has("expiry_iso") && !jsonobject.isNull("expiry_iso"))
        {
            expiryDate = DateUtil.parseIsoDate(jsonobject.getString("expiry_iso"));
        }
        previewImages = new ArrayList();
        if (!jsonobject.has("image_urls") || jsonobject.isNull("image_urls")) goto _L2; else goto _L1
_L1:
        walletitemtype = jsonobject.getJSONArray("image_urls");
        int i = 0;
        do
        {
            WishProduct wishproduct;
            try
            {
                if (i >= walletitemtype.length())
                {
                    break;
                }
                WishImage wishimage = new WishImage(walletitemtype.getString(i));
                wishimage.setCanResize(false);
                previewImages.add(wishimage);
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
            i++;
        } while (true);
          goto _L3
_L2:
        if (!jsonobject.has("preview_contests") || jsonobject.isNull("preview_contests")) goto _L5; else goto _L4
_L4:
        walletitemtype = jsonobject.getJSONArray("preview_contests");
        i = 0;
_L6:
        if (i >= walletitemtype.length())
        {
            break; /* Loop/switch isn't completed */
        }
        wishproduct = new WishProduct(walletitemtype.getJSONObject(i));
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        product = wishproduct;
        previewImages.add(wishproduct.getImage());
        i++;
        if (true) goto _L6; else goto _L3
_L5:
        if (jsonobject.has("contest") && !jsonobject.isNull("contest"))
        {
            product = new WishProduct(jsonobject.getJSONObject("contest"));
            previewImages.add(product.getImage());
        }
_L3:
        walletitemtype = new WishLocalizedCurrencyValue(jsonobject.optDouble("maximum_value"), jsonobject.optJSONObject("localized_maximum_value"));
        if (walletitemtype.getValue() > 0.0D && product != null)
        {
            discountValue = walletitemtype;
            if (product.getValue().getValue() > 0.0D)
            {
                d = walletitemtype.divide(product.getValue()) * 100D;
            }
            discountPercent = d;
        }
        if (jsonobject.has("remaining_value") && !jsonobject.isNull("remaining_value"))
        {
            discountValue = new WishLocalizedCurrencyValue(jsonobject.getDouble("remaining_value"), jsonobject.optJSONObject("localized_remaining_value"));
        }
        return;
    }

    public String getActionDeepLink()
    {
        return actionDeepLink;
    }

    public String getCreditId()
    {
        return creditId;
    }

    public double getDiscountPercent()
    {
        return discountPercent;
    }

    public WishLocalizedCurrencyValue getDiscountValue()
    {
        return discountValue;
    }

    public Date getExpiryDate()
    {
        return expiryDate;
    }

    public ArrayList getPreviewImages()
    {
        return previewImages;
    }

    public WishProduct getProduct()
    {
        return product;
    }

    public String getRebateId()
    {
        return rebateId;
    }

    public String getTitleText()
    {
        return titleText;
    }

    public WalletItemType getType()
    {
        return type;
    }

    public boolean isExpired()
    {
        return expired;
    }
}
