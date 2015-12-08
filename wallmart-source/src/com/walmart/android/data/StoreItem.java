// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;


public class StoreItem
{

    private boolean availableInStore;
    private boolean availableOnline;
    private String description;
    private String iD;
    private String imageThumbnailUrl;
    private String name;
    private String price;
    private String productImageUrl;
    private String rating;
    private String ratingUrl;
    private boolean s2SEnabled;
    private String shelfDescription;
    private boolean storeOnly;
    private String uPC;
    private String url;

    public StoreItem()
    {
    }

    public String getDescription()
    {
        return description;
    }

    public String getImageThumbnailUrl()
    {
        return imageThumbnailUrl;
    }

    public String getName()
    {
        return name;
    }

    public String getPrice()
    {
        return price;
    }

    public String getProductImageUrl()
    {
        return productImageUrl;
    }

    public String getRating()
    {
        return rating;
    }

    public String getRatingUrl()
    {
        return ratingUrl;
    }

    public String getShelfDescription()
    {
        return shelfDescription;
    }

    public String getUrl()
    {
        return url;
    }

    public String getiD()
    {
        return iD;
    }

    public String getuPC()
    {
        return uPC;
    }

    public boolean isAvailableInStore()
    {
        return availableInStore;
    }

    public boolean isAvailableOnline()
    {
        return availableOnline;
    }

    public boolean isS2SEnabled()
    {
        return s2SEnabled;
    }

    public boolean isStoreOnly()
    {
        return storeOnly;
    }

    public void setAvailableInStore(boolean flag)
    {
        availableInStore = flag;
    }

    public void setAvailableOnline(boolean flag)
    {
        availableOnline = flag;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setImageThumbnailUrl(String s)
    {
        imageThumbnailUrl = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setPrice(String s)
    {
        price = s;
    }

    public void setProductImageUrl(String s)
    {
        productImageUrl = s;
    }

    public void setRating(String s)
    {
        rating = s;
    }

    public void setRatingUrl(String s)
    {
        ratingUrl = s;
    }

    public void setS2SEnabled(boolean flag)
    {
        s2SEnabled = flag;
    }

    public void setShelfDescription(String s)
    {
        shelfDescription = s;
    }

    public void setStoreOnly(boolean flag)
    {
        storeOnly = flag;
    }

    public void setUrl(String s)
    {
        url = s;
    }

    public void setiD(String s)
    {
        iD = s;
    }

    public void setuPC(String s)
    {
        uPC = s;
    }
}
