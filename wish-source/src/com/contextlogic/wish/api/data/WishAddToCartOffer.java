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

public class WishAddToCartOffer
    implements Serializable
{

    private static final long serialVersionUID = 0x5b12d17b1ac75d9eL;
    private Date expiry;
    private String offerId;
    private String title;

    public WishAddToCartOffer(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            expiry = DateUtil.parseIsoDate(jsonobject.getString("expiry"));
            offerId = jsonobject.getString("id");
            title = jsonobject.getString("title");
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
