// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class WishBillingFamilyInfo
    implements Serializable
{

    private static final long serialVersionUID = 0x1b02950797125f65L;
    private String email;
    private String name;

    public WishBillingFamilyInfo(String s, String s1)
    {
        name = s;
        email = s1;
    }

    public WishBillingFamilyInfo(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            name = jsonobject.getString("name");
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

    public JSONObject getJSONObject()
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject();
            jsonobject.put("name", name);
            jsonobject.put("email", email);
        }
        catch (Throwable throwable)
        {
            return null;
        }
        return jsonobject;
    }

    public String getName()
    {
        return name;
    }
}
