// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class WishBoletoInfo
    implements Serializable
{

    private static final long serialVersionUID = 0xa7d05282948d9c99L;
    private String identityNumber;
    private String name;

    public WishBoletoInfo(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            name = jsonobject.getString("name");
            identityNumber = jsonobject.getString("identity_number");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
    }

    public String getLastFourDigits()
    {
        if (identityNumber == null)
        {
            return null;
        } else
        {
            int i = Math.max(0, identityNumber.length() - 4);
            return identityNumber.substring(i);
        }
    }

    public String getName()
    {
        return name;
    }
}
