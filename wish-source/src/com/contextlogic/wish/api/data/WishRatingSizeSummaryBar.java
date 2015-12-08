// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class WishRatingSizeSummaryBar
    implements Serializable
{

    private static final long serialVersionUID = 0xc39fe14626dd1f45L;
    private String name;
    private double ratio;

    public WishRatingSizeSummaryBar(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            ratio = jsonobject.getDouble("ratio");
            name = jsonobject.getString("name");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
    }

    public String getName()
    {
        return name;
    }

    public double getRatio()
    {
        return ratio;
    }
}
