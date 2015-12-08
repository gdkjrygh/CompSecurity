// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class WishProductDescription
    implements Serializable
{

    private static final long serialVersionUID = 0xb2c09877b2e24edL;
    private String title;
    private String value;

    public WishProductDescription(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            title = jsonobject.getString("key");
            value = jsonobject.getString("value");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
    }

    public String getTitle()
    {
        return title;
    }

    public String getValue()
    {
        return value;
    }
}
