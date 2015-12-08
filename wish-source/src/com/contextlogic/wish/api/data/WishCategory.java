// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import org.json.JSONObject;

public class WishCategory
    implements Serializable
{

    private static final long serialVersionUID = 0x633163af6c5fccb9L;
    private String collectionsTitle;
    private String feedTitle;
    private String id;
    private String imageUrl;
    private String navigationTitle;
    private String title;

    public WishCategory(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        id = jsonobject.optString("id");
        title = jsonobject.optString("title", null);
        imageUrl = jsonobject.optString("image_url", null);
        collectionsTitle = jsonobject.optString("collections_title", null);
        feedTitle = jsonobject.optString("feed_title", null);
        navigationTitle = jsonobject.optString("navigation_title", null);
    }

    public String getCollectionsTitle()
    {
        return collectionsTitle;
    }

    public String getFeedTitle()
    {
        return feedTitle;
    }

    public String getId()
    {
        return id;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }

    public String getNavigationTitle()
    {
        return navigationTitle;
    }

    public String getTitle()
    {
        return title;
    }
}
