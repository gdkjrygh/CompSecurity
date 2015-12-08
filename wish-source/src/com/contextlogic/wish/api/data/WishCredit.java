// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.util.DateUtil;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishLocalizedCurrencyValue

public class WishCredit
    implements Serializable
{

    private static final long serialVersionUID = 0x2c9190c2aee5d1b0L;
    private String creditId;
    private String customTitle;
    private Date expiryDate;
    private WishLocalizedCurrencyValue minimumPurchase;
    private WishLocalizedCurrencyValue value;

    public WishCredit(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            creditId = jsonobject.getString("id");
            value = new WishLocalizedCurrencyValue(jsonobject.getDouble("remaining_value"), jsonobject.optJSONObject("localized_remaining_value"));
            if (jsonobject.has("expiry_iso") && !jsonobject.isNull("expiry_iso"))
            {
                expiryDate = DateUtil.parseIsoDate(jsonobject.getString("expiry_iso"));
            }
            if (jsonobject.has("minimum_purchase") && !jsonobject.isNull("minimum_purchase"))
            {
                minimumPurchase = new WishLocalizedCurrencyValue(jsonobject.getDouble("minimum_purchase"), jsonobject.optJSONObject("localized_minimum_purchase"));
            }
            if (jsonobject.has("custom_title") && !jsonobject.isNull("custom_title"))
            {
                customTitle = jsonobject.getString("custom_title");
            }
            return;
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
    }

    public String getCreditId()
    {
        return creditId;
    }

    public String getCustomTitle()
    {
        return customTitle;
    }

    public Date getExpiryDate()
    {
        return expiryDate;
    }

    public WishLocalizedCurrencyValue getMinimumPurchase()
    {
        return minimumPurchase;
    }

    public WishLocalizedCurrencyValue getValue()
    {
        return value;
    }
}
