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
//            WishFilter, WishImage

public class Collection
    implements Serializable
{

    private static final long serialVersionUID = 0x3aeb5773f9cc0acL;
    private ArrayList categories;
    private ArrayList images;
    private String tagId;
    private String title;

    public Collection(JSONObject jsonobject)
    {
        categories = new ArrayList();
        images = new ArrayList();
        JSONArray jsonarray;
        WishImage wishimage;
        int i;
        try
        {
            jsonarray = jsonobject.getJSONArray("categories");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
        i = 0;
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        categories.add(new WishFilter(jsonarray.getJSONObject(i)));
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_36;
_L1:
        jsonarray = jsonobject.getJSONArray("images");
        i = 0;
_L4:
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        wishimage = new WishImage(jsonarray.getJSONObject(i).getString("display_picture"));
        wishimage.setUrlString(jsonarray.getJSONObject(i).getString("contest_page_picture"), WishImage.ImageSize.Large);
        images.add(wishimage);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        tagId = jsonobject.getString("id");
        title = jsonobject.getString("title");
        return;
    }

    public ArrayList getCategories()
    {
        return categories;
    }

    public String getInitialCategory()
    {
        return ((WishFilter)categories.get(0)).getFilterId();
    }

    public String getTitle()
    {
        return title;
    }

    public WishImage primaryImage()
    {
        return (WishImage)images.get(0);
    }

    public WishImage secondaryImageOne()
    {
        return (WishImage)images.get(1);
    }

    public WishImage secondaryImageTwo()
    {
        return (WishImage)images.get(2);
    }
}
