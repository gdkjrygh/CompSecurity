// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class WishPromoBannerSpec
    implements Serializable
{

    private static final long serialVersionUID = 0xa26e1fc3db62abc2L;
    private String bigText;
    private String mediumText;
    private String smallText;

    public WishPromoBannerSpec(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            bigText = jsonobject.getString("big_text");
            mediumText = jsonobject.getString("medium_text");
            smallText = jsonobject.getString("small_text");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
    }

    public String getBigText()
    {
        return bigText;
    }

    public String getMediumText()
    {
        return mediumText;
    }

    public String getSmallText()
    {
        return smallText;
    }
}
