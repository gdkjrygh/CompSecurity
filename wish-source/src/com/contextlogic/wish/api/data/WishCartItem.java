// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.util.AddressUtil;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishLocalizedCurrencyValue, WishImage, WishPriceExpiryInfo

public class WishCartItem
    implements Serializable
{

    private static final long serialVersionUID = 0x30e688faee608b8bL;
    private double averageRating;
    private String color;
    private String fulfilledByText;
    private WishImage image;
    private int inventory;
    private boolean isCToCItem;
    private int maxShippingTime;
    private String merchantName;
    private int minShippingTime;
    private String name;
    private int numBought;
    private WishLocalizedCurrencyValue price;
    private WishLocalizedCurrencyValue priceBeforeDiscounts;
    private WishPriceExpiryInfo priceExpiryInfo;
    private String productId;
    private WishLocalizedCurrencyValue productSubtotal;
    private int quantity;
    private int ratingCount;
    private WishLocalizedCurrencyValue retailPrice;
    private String returnPolicyLongString;
    private String returnPolicyShortString;
    private String shippingCountriesString;
    private String shippingOptionId;
    private WishLocalizedCurrencyValue shippingPrice;
    private String shippingPriceCountry;
    private String shippingTimeString;
    private String size;
    private String urgencyText;
    private String variationId;
    private ArrayList warningMessages;

    public WishCartItem(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        price = new WishLocalizedCurrencyValue(jsonobject.getDouble("price"), jsonobject.optJSONObject("localized_price"));
        productId = jsonobject.getString("product_id");
        name = jsonobject.getString("name");
        variationId = jsonobject.getString("variation_id");
        image = new WishImage(jsonobject.getString("image_url"));
        quantity = jsonobject.getInt("quantity");
        inventory = jsonobject.getInt("inventory");
        retailPrice = new WishLocalizedCurrencyValue(jsonobject.optDouble("product_retail_subtotal"), jsonobject.optJSONObject("localized_product_retail_subtotal"));
        numBought = jsonobject.optInt("num_bought", 0);
        if (!jsonobject.has("product_rating"))
        {
            break MISSING_BLOCK_LABEL_600;
        }
        JSONObject jsonobject1 = jsonobject.getJSONObject("product_rating");
        ratingCount = jsonobject1.getInt("rating_count");
        averageRating = jsonobject1.getDouble("rating");
_L1:
        if (jsonobject.has("size") && !jsonobject.isNull("size"))
        {
            size = jsonobject.getString("size");
        }
        if (jsonobject.has("color") && !jsonobject.isNull("color"))
        {
            color = jsonobject.getString("color");
        }
        merchantName = jsonobject.getString("merchant_display_name");
        shippingCountriesString = jsonobject.getString("shipping_countries_string");
        shippingTimeString = jsonobject.getString("shipping_time_string");
        isCToCItem = jsonobject.optBoolean("is_c2c", false);
        shippingPrice = new WishLocalizedCurrencyValue(jsonobject.getDouble("shipping"), jsonobject.optJSONObject("localized_shipping"));
        if (jsonobject.has("shipping_price_country_code") && !jsonobject.isNull("shipping_price_country_code"))
        {
            shippingPriceCountry = AddressUtil.getCountryName(jsonobject.getString("shipping_price_country_code"));
        }
        if (jsonobject.has("return_policy_short") && !jsonobject.isNull("return_policy_short"))
        {
            returnPolicyShortString = jsonobject.getString("return_policy_short");
        }
        if (jsonobject.has("urgency_text") && !jsonobject.isNull("urgency_text"))
        {
            urgencyText = jsonobject.getString("urgency_text");
        }
        if (jsonobject.has("return_policy_long") && !jsonobject.isNull("return_policy_long"))
        {
            returnPolicyLongString = jsonobject.getString("return_policy_long");
        }
        if (jsonobject.has("fulfilled_by_text") && !jsonobject.isNull("fulfilled_by_text"))
        {
            fulfilledByText = jsonobject.getString("fulfilled_by_text");
        }
        if (jsonobject.has("price_expiry_info") && !jsonobject.isNull("price_expiry_info"))
        {
            priceExpiryInfo = new WishPriceExpiryInfo(jsonobject.getJSONObject("price_expiry_info"));
        }
        priceBeforeDiscounts = new WishLocalizedCurrencyValue(jsonobject.getDouble("price_before_personal_price"), jsonobject.optJSONObject("localized_price_before_personal_price"));
        productSubtotal = new WishLocalizedCurrencyValue(jsonobject.getDouble("product_subtotal"), jsonobject.optJSONObject("localized_product_subtotal"));
        minShippingTime = jsonobject.optInt("min_shipping_time", 7);
        maxShippingTime = jsonobject.optInt("max_shipping_time", 21);
        warningMessages = new ArrayList();
        if (!jsonobject.has("warning_messages") || jsonobject.isNull("warning_messages"))
        {
            break MISSING_BLOCK_LABEL_628;
        }
        jsonobject = jsonobject.getJSONArray("warning_messages");
        int i = 0;
        do
        {
            try
            {
                if (i >= jsonobject.length())
                {
                    break;
                }
                String s = jsonobject.getString(i);
                warningMessages.add(s);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new ApiMalformedDataException(jsonobject.getMessage());
            }
            i++;
        } while (true);
        break MISSING_BLOCK_LABEL_628;
        ratingCount = 0;
        averageRating = 5D;
          goto _L1
    }

    public String getColor()
    {
        return color;
    }

    public String getFulfilledByText()
    {
        return fulfilledByText;
    }

    public WishImage getImage()
    {
        return image;
    }

    public int getInventory()
    {
        return inventory;
    }

    public int getMaxShippingTime()
    {
        return maxShippingTime;
    }

    public String getMerchantName()
    {
        return merchantName;
    }

    public int getMinShippingTime()
    {
        return minShippingTime;
    }

    public String getName()
    {
        return name;
    }

    public int getNumBought()
    {
        return numBought;
    }

    public WishLocalizedCurrencyValue getPrice()
    {
        return price;
    }

    public WishLocalizedCurrencyValue getPriceBeforeDiscounts()
    {
        return priceBeforeDiscounts;
    }

    public WishPriceExpiryInfo getPriceExpiryInfo()
    {
        return priceExpiryInfo;
    }

    public String getProductId()
    {
        return productId;
    }

    public double getProductRating()
    {
        return averageRating;
    }

    public int getProductRatingCount()
    {
        return ratingCount;
    }

    public WishLocalizedCurrencyValue getProductSubtotal()
    {
        return productSubtotal;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public WishLocalizedCurrencyValue getRetailPrice()
    {
        return retailPrice;
    }

    public String getReturnPolicyLongString()
    {
        return returnPolicyLongString;
    }

    public String getReturnPolicyShortString()
    {
        return returnPolicyShortString;
    }

    public String getShippingCountriesString()
    {
        return shippingCountriesString;
    }

    public WishLocalizedCurrencyValue getShippingPrice()
    {
        return shippingPrice;
    }

    public String getShippingPriceCountry()
    {
        return shippingPriceCountry;
    }

    public String getShippingTimeString()
    {
        return shippingTimeString;
    }

    public String getSize()
    {
        return size;
    }

    public String getUrgencyText()
    {
        return urgencyText;
    }

    public String getVariationId()
    {
        return variationId;
    }

    public ArrayList getWarningMessages()
    {
        return warningMessages;
    }

    public boolean isCToCItem()
    {
        return isCToCItem;
    }
}
