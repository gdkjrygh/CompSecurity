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
//            WishProduct

public class WishUpsellOffer
    implements Serializable
{

    private static final long serialVersionUID = 0xbfc779adbc7492d7L;
    private String message;
    private String title;
    private ArrayList upsellProducts;

    public WishUpsellOffer(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        JSONArray jsonarray;
        WishProduct wishproduct;
        int i;
        try
        {
            upsellProducts = new ArrayList();
            jsonarray = jsonobject.getJSONArray("items");
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
        wishproduct = new WishProduct(jsonarray.getJSONObject(i));
        upsellProducts.add(wishproduct);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_25;
_L1:
        title = jsonobject.getString("title");
        message = jsonobject.getString("message");
        return;
    }

    public String getMessage()
    {
        return message;
    }

    public String getTitle()
    {
        return title;
    }

    public ArrayList getUpsellProducts()
    {
        return upsellProducts;
    }
}
