// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public class WishRatingSummary
    implements Serializable
{

    private static final long serialVersionUID = 0x1e5d15dce116e3b9L;
    private String displayName;
    private String imageUrl;
    private String name;
    private double rating;
    private long ratingCount;
    private ArrayList ratingSpreads;

    public WishRatingSummary(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        if (jsonobject.getString("display_picture_url") != null)
        {
            imageUrl = jsonobject.getString("display_picture_url");
        }
        name = jsonobject.getString("name");
        if (!jsonobject.has("display_name"))
        {
            break MISSING_BLOCK_LABEL_186;
        }
        setDisplayName(jsonobject.getString("display_name"));
_L1:
        if (jsonobject.has("rating_spread"))
        {
            ratingSpreads = new ArrayList(5);
            JSONObject jsonobject1 = jsonobject.getJSONObject("rating_spread");
            ratingSpreads.add(Integer.valueOf(jsonobject1.optInt("star_one_rating_count")));
            ratingSpreads.add(Integer.valueOf(jsonobject1.optInt("star_two_rating_count")));
            ratingSpreads.add(Integer.valueOf(jsonobject1.optInt("star_three_rating_count")));
            ratingSpreads.add(Integer.valueOf(jsonobject1.optInt("star_four_rating_count")));
            ratingSpreads.add(Integer.valueOf(jsonobject1.optInt("star_five_rating_count")));
        }
        rating = jsonobject.getDouble("rating");
        ratingCount = jsonobject.getLong("rating_count");
        return;
        try
        {
            setDisplayName(getName());
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
          goto _L1
    }

    public String getDisplayName()
    {
        return displayName;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }

    public String getName()
    {
        return name;
    }

    public double getRating()
    {
        return rating;
    }

    public long getRatingCount()
    {
        return ratingCount;
    }

    public ArrayList getRatingSpreads()
    {
        if (ratingSpreads == null)
        {
            ratingSpreads = new ArrayList(5);
            for (int i = 0; i < 5; i++)
            {
                ratingSpreads.add(Integer.valueOf(0));
            }

        }
        return ratingSpreads;
    }

    public void setDisplayName(String s)
    {
        displayName = s;
    }

    public void setImageUrl(String s)
    {
        imageUrl = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setRating(double d)
    {
        rating = d;
    }

    public void setRatingCount(long l)
    {
        ratingCount = l;
    }

    public void setRatingSpreads(ArrayList arraylist)
    {
        ratingSpreads = arraylist;
    }
}
