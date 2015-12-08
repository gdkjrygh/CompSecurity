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
//            WishImage

public class WishAddToCartOfferApplied
    implements Serializable
{

    private static final long serialVersionUID = 0xb2adfc65af568f6fL;
    private Date expiry;
    private String message;
    private String offerId;
    private WishImage productImage;
    private String title;

    public WishAddToCartOfferApplied(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            offerId = jsonobject.getString("id");
            title = jsonobject.getString("title");
            message = jsonobject.getString("message");
            productImage = new WishImage(jsonobject.getString("product_image_url"));
            if (jsonobject.has("expiry") && !jsonobject.isNull("expiry"))
            {
                expiry = DateUtil.parseIsoDate(jsonobject.getString("expiry"));
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

    public Date getExpiry()
    {
        return expiry;
    }

    public String getMessage()
    {
        return message;
    }

    public String getOfferId()
    {
        return offerId;
    }

    public WishImage getProductImage()
    {
        return productImage;
    }

    public String getTitle()
    {
        return title;
    }

    public boolean isExpired()
    {
        return expiry.before(new Date());
    }
}
