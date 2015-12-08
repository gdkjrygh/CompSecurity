// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.util.StringUtil;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public class WishTag
    implements Serializable
{

    private static final long serialVersionUID = 0x633163af6c5fccb8L;
    private String name;
    private ArrayList previewImages;
    private String tagId;

    public WishTag(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        previewImages = new ArrayList();
        tagId = jsonobject.optString("id");
        if (!jsonobject.has("name"))
        {
            break MISSING_BLOCK_LABEL_56;
        }
        name = jsonobject.getString("name");
_L1:
        name = StringUtil.toTitleCase(name);
        return;
        try
        {
            name = jsonobject.getString("tag");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
          goto _L1
    }

    public String getName()
    {
        return name;
    }

    public ArrayList getPreviewPictures()
    {
        return previewImages;
    }

    public String getTagId()
    {
        return tagId;
    }

    public void setPreviewImages(ArrayList arraylist)
    {
        if (arraylist != null)
        {
            previewImages = arraylist;
            return;
        } else
        {
            previewImages = new ArrayList();
            return;
        }
    }
}
