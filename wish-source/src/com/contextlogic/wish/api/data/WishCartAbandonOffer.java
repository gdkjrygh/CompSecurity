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

public class WishCartAbandonOffer
    implements Serializable
{

    private static final long serialVersionUID = 0x387f59bb2128e7f1L;
    private String buttonText;
    private String dismissText;
    private Date expiry;
    private String imageUrl;
    private String message;
    private String offerId;
    private String title;

    public WishCartAbandonOffer(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            expiry = DateUtil.parseIsoDate(jsonobject.getString("expiry"));
            offerId = jsonobject.getString("id");
            title = jsonobject.getString("title");
            message = jsonobject.getString("message");
            buttonText = jsonobject.getString("button");
            dismissText = jsonobject.getString("dismiss");
            imageUrl = jsonobject.getString("image_url");
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

    public String getButtonText()
    {
        return buttonText;
    }

    public String getDismissText()
    {
        return dismissText;
    }

    public Date getExpiry()
    {
        return expiry;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }

    public String getMessage()
    {
        return message;
    }

    public String getOfferId()
    {
        return offerId;
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
