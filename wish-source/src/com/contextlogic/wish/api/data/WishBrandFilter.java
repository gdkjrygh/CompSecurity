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
//            WishImage

public class WishBrandFilter
    implements Serializable
{

    private static final long serialVersionUID = 0x270e3d73a1a374b2L;
    private String credit;
    private boolean isCommerce;
    private boolean isMerchant;
    private ArrayList previews;
    private String price;
    private String products;
    private String query;
    private String tag;
    private String title;

    public WishBrandFilter(String s)
    {
        this(s, null, null, null, null, null, false, false);
    }

    public WishBrandFilter(String s, String s1, String s2, String s3, String s4, String s5, boolean flag, 
            boolean flag1)
    {
        previews = new ArrayList();
        query = s;
        title = s1;
        isCommerce = flag;
        isMerchant = flag1;
        credit = s5;
        price = s2;
        tag = s3;
        products = s4;
        if (title == null)
        {
            title = query;
        }
    }

    public WishBrandFilter(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        query = jsonobject.getString("brand");
        title = query;
        isCommerce = jsonobject.optBoolean("is_commerce", false);
        if (!isCommerce && jsonobject.has("is_commerce") && jsonobject.optInt("is_commerce") == 1)
        {
            isCommerce = true;
        }
        if (jsonobject.has("price") && !jsonobject.isNull("price"))
        {
            price = jsonobject.getString("price");
        }
        if (jsonobject.has("tag") && !jsonobject.isNull("tag"))
        {
            tag = jsonobject.getString("tag");
        }
        if (jsonobject.has("cids") && !jsonobject.isNull("cids"))
        {
            products = jsonobject.getString("cids");
        }
        if (jsonobject.has("force_title") && !jsonobject.isNull("force_title"))
        {
            title = jsonobject.getString("force_title");
        }
        if (jsonobject.has("is_merchant") && !jsonobject.isNull("is_merchant"))
        {
            isMerchant = jsonobject.getBoolean("is_merchant");
        }
        if (jsonobject.has("credit") && !jsonobject.isNull("credit"))
        {
            credit = jsonobject.getString("credit");
        }
        previews = new ArrayList();
        if (!jsonobject.has("preview"))
        {
            break MISSING_BLOCK_LABEL_309;
        }
        jsonobject = jsonobject.getJSONArray("preview");
        int i = 0;
        do
        {
            try
            {
                if (i >= jsonobject.length())
                {
                    break;
                }
                previews.add(new WishImage(jsonobject.getString(i)));
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                throw new ApiMalformedDataException(jsonobject.getMessage());
            }
            i++;
        } while (true);
    }

    public String getCredit()
    {
        return credit;
    }

    public ArrayList getPreviews()
    {
        return previews;
    }

    public String getPrice()
    {
        return price;
    }

    public String getProducts()
    {
        return products;
    }

    public String getQuery()
    {
        return query;
    }

    public String getTag()
    {
        return tag;
    }

    public String getTitle()
    {
        return title;
    }

    public boolean isCommerce()
    {
        return isCommerce;
    }

    public boolean isMerchant()
    {
        return isMerchant;
    }

    public void setPrice(String s)
    {
        price = s;
    }

    public void setProducts(String s)
    {
        products = s;
    }

    public void setTag(String s)
    {
        tag = s;
    }
}
