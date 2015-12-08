// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class WishRatingImage
    implements Serializable
{

    private static final long serialVersionUID = 0x62d14a878108b85L;
    private String imageLargeUrlString;
    private String imageThumbnailUrlString;

    public WishRatingImage(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            imageLargeUrlString = jsonobject.getString("image_large_url");
            imageThumbnailUrlString = jsonobject.getString("image_thumbnail_url");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
    }

    public String getImageLargeUrlString()
    {
        return imageLargeUrlString;
    }

    public String getImageThumbnailUrlString()
    {
        return imageThumbnailUrlString;
    }
}
