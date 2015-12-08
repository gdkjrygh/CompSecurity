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

public class WishPriceExpiryInfo
    implements Serializable
{

    private static final long serialVersionUID = 0x3c30f1f99ce35f75L;
    private String buttonText;
    private Date expiry;
    private String message;
    private String title;

    public WishPriceExpiryInfo(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            expiry = DateUtil.parseIsoDate(jsonobject.getString("expiry"));
            title = jsonobject.getString("title");
            message = jsonobject.getString("message");
            buttonText = jsonobject.getString("button");
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

    public Date getExpiry()
    {
        return expiry;
    }

    public String getMessage()
    {
        return message;
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
