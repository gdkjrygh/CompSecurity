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

public class WishCollection
    implements Serializable
{

    private static final long serialVersionUID = 0xea7c521247cf2985L;
    private String actionUrl;
    private String id;
    private ArrayList previewImages;

    public WishCollection(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        previewImages = new ArrayList();
        JSONArray jsonarray;
        int i;
        try
        {
            jsonarray = jsonobject.getJSONArray("preview_images");
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
        previewImages.add(new WishImage(jsonarray.getString(i)));
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_24;
_L1:
        id = jsonobject.getString("id");
        actionUrl = jsonobject.getString("action_url");
        return;
    }

    public String getActionUrl()
    {
        return actionUrl;
    }

    public String getId()
    {
        return id;
    }

    public ArrayList getPreviewImages()
    {
        return previewImages;
    }
}
