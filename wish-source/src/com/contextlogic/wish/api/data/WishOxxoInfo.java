// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class WishOxxoInfo
    implements Serializable
{

    private static final long serialVersionUID = 0x9847e9834a2f6f11L;
    private String email;
    private String name;

    public WishOxxoInfo(JSONObject jsonobject)
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

    public String getName()
    {
        return name;
    }
}
