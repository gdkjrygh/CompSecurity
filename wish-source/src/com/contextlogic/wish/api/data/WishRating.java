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

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishUser

public class WishRating
    implements Serializable
{

    private static final long serialVersionUID = 0x2253a5c852090c7L;
    private WishUser author;
    private String comment;
    private String imageLargeUrlString;
    private String imageThumbnailUrlString;
    private int rating;
    private Date timestamp;

    public WishRating(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            author = new WishUser(jsonobject.getJSONObject("user"));
            timestamp = DateUtil.parseIsoDate(jsonobject.getString("time"));
            rating = jsonobject.getInt("rating");
            comment = jsonobject.optString("comment");
            if (jsonobject.has("image_large_url") && !jsonobject.isNull("image_large_url"))
            {
                imageLargeUrlString = jsonobject.getString("image_large_url");
            }
            if (jsonobject.has("image_thumbnail_url") && !jsonobject.isNull("image_thumbnail_url"))
            {
                imageThumbnailUrlString = jsonobject.getString("image_thumbnail_url");
            }
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

    public WishUser getAuthor()
    {
        return author;
    }

    public String getComment()
    {
        return comment;
    }

    public String getImageLargeUrlString()
    {
        return imageLargeUrlString;
    }

    public String getImageThumbnailUrlString()
    {
        return imageThumbnailUrlString;
    }

    public int getRating()
    {
        return rating;
    }

    public Date getTimestamp()
    {
        return timestamp;
    }
}
