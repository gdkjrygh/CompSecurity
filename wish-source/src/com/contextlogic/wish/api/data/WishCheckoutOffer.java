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

public class WishCheckoutOffer
    implements Serializable
{

    private static final long serialVersionUID = 0x387f59bb2128e7f1L;
    private Date expiry;
    private String message;
    private String offerId;
    private String title;

    public WishCheckoutOffer(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            expiry = DateUtil.parseIsoDate(jsonobject.getString("expiry"));
            offerId = jsonobject.getString("id");
            title = jsonobject.getString("title");
            message = jsonobject.getString("message");
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

    public String getTitle()
    {
        return title;
    }

    public boolean isExpired()
    {
        return expiry.before(new Date());
    }
}
