// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishTag

public class WishMerchant
    implements Serializable
{

    private static final long serialVersionUID = 0x6fbadefe3b332a4aL;
    private String displayName;
    private String imageUrl;
    private String merchantId;
    private int productCount;
    private double rating;
    private int ratingCount;
    private ArrayList tags;
    private String uniqueName;

    public WishMerchant(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        imageUrl = jsonobject.getString("display_pic");
        merchantId = jsonobject.getString("id");
        uniqueName = jsonobject.getString("name");
        displayName = jsonobject.getString("display_name");
        rating = jsonobject.getDouble("avg_rating");
        ratingCount = jsonobject.getInt("rating_count");
        productCount = jsonobject.getInt("product_count");
        tags = new ArrayList();
        if (!jsonobject.has("top_tags"))
        {
            break MISSING_BLOCK_LABEL_151;
        }
        jsonobject = jsonobject.getJSONArray("top_tags");
        int i = 0;
        do
        {
            try
            {
                if (i >= jsonobject.length())
                {
                    break;
                }
                tags.add(new WishTag(jsonobject.getJSONObject(i)));
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new ApiMalformedDataException(jsonobject.getMessage());
            }
            i++;
        } while (true);
    }

    public String getDisplayName()
    {
        return displayName;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }

    public String getMerchantId()
    {
        return merchantId;
    }

    public int getProductCount()
    {
        return productCount;
    }

    public double getRating()
    {
        return rating;
    }

    public int getRatingCount()
    {
        return ratingCount;
    }

    public ArrayList getTags()
    {
        return tags;
    }

    public String getUniqueName()
    {
        return uniqueName;
    }
}
