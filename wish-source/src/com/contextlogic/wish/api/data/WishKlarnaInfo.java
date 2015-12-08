// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class WishKlarnaInfo
    implements Serializable
{

    private static final long serialVersionUID = 0x7ead6169c29083faL;
    private String email;

    public WishKlarnaInfo(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            email = jsonobject.getString("email");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
    }

    public String getEmail()
    {
        return email;
    }
}
