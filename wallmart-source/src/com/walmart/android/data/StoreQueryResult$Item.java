// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;

import android.text.TextUtils;
import com.walmart.android.app.shop.ShelfUtils;
import com.walmart.android.service.item.ItemAvailability;
import com.walmart.android.util.PricePerUnitUtils;

// Referenced classes of package com.walmart.android.data:
//            StoreQueryResult

public static class availableOnline
{
    public static class PricingInformation
    {

        public String listPrice;
        public String price;
        public String rollback;
        public String submap;
        public String youSave;

        public PricingInformation()
        {
        }
    }

    public static class Seller
    {

        public static final String WALMART_ID = "F55CDC31AB754BB68FE0B39041159D63";
        public String id;
        public String name;

        public Seller()
        {
        }
    }


    private ItemAvailability availability;
    private String availableInStore;
    private boolean availableOnline;
    public boolean baseVariantItem;
    public String bestSellerSubcat;
    public int cRRNumReviews;
    private String dealInfo;
    private String description;
    public String fromPPU;
    public String fromPPUM;
    private String iD;
    private String imageThumbnailUrl;
    public boolean isBrowseToken;
    public boolean isManualShelf;
    public String listingId;
    private String name;
    public String offerId;
    public String pPU;
    public String pPUM;
    public String price;
    private String priceDisplaySubtext;
    public PricingInformation pricingInformation;
    public String productId;
    private String productImageUrl;
    private boolean putEligible;
    private float rating;
    private String ratingUrl;
    private boolean s2SEnabled;
    public Seller seller;
    private String shelfDescription;
    public boolean shippingPassEligible;
    public boolean showOnWebsite;
    private boolean storeOnly;
    public String storePrice;
    public String uOM;
    private String url;
    public boolean variantItem;

    public String getAvailableInStore()
    {
        return availableInStore;
    }

    public String getDealInfo()
    {
        return dealInfo;
    }

    public String getDescription()
    {
        return description;
    }

    public String getFormattedPricePerUnit()
    {
        return getFormattedPricePerUnit(false);
    }

    public String getFormattedPricePerUnit(boolean flag)
    {
        if (hasPricePerUnitRange())
        {
            return PricePerUnitUtils.getPricePerUnitRangeDisplayString(fromPPU, fromPPUM, pPU, pPUM, uOM, flag);
        }
        if (hasPricePerUnit())
        {
            return PricePerUnitUtils.getPricePerUnitDisplayString(pPU, pPUM, uOM);
        } else
        {
            return "";
        }
    }

    public String getImageThumbnailUrl()
    {
        return imageThumbnailUrl;
    }

    public String getItemAvailability()
    {
        if (availability != null)
        {
            return availability.getAvailability();
        } else
        {
            return "";
        }
    }

    public String getListPrice()
    {
        if (pricingInformation != null)
        {
            return ShelfUtils.fromHtml(pricingInformation.listPrice);
        } else
        {
            return null;
        }
    }

    public String getMarketPlaceSellerName()
    {
        if (!TextUtils.isEmpty(getSellerName()) && !"F55CDC31AB754BB68FE0B39041159D63".equals(getSellerId()))
        {
            return getSellerName();
        } else
        {
            return null;
        }
    }

    public String getName()
    {
        return name;
    }

    public int getNbrReviews()
    {
        return cRRNumReviews;
    }

    public String getOfferId()
    {
        return offerId;
    }

    public String getPrice()
    {
        if (pricingInformation != null)
        {
            return pricingInformation.price;
        } else
        {
            return price;
        }
    }

    public String getPriceDisplaySubtext()
    {
        return priceDisplaySubtext;
    }

    public String getProductId()
    {
        return productId;
    }

    public String getProductImageUrl()
    {
        return productImageUrl;
    }

    public float getRating()
    {
        return rating;
    }

    public String getRatingUrl()
    {
        return ratingUrl;
    }

    public String getRollbackPrice()
    {
        if (pricingInformation != null)
        {
            return ShelfUtils.fromHtml(pricingInformation.rollback);
        } else
        {
            return null;
        }
    }

    public String getSellerId()
    {
        if (seller != null)
        {
            return seller.id;
        } else
        {
            return null;
        }
    }

    public String getSellerName()
    {
        if (seller != null)
        {
            return seller.name;
        } else
        {
            return null;
        }
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

    public boolean hasPricePerUnit()
    {
        return !TextUtils.isEmpty(pPU) && !TextUtils.isEmpty(pPUM) && !TextUtils.isEmpty(uOM);
    }

    public boolean hasPricePerUnitRange()
    {
        return hasPricePerUnit() && !TextUtils.isEmpty(fromPPU) && !TextUtils.isEmpty(fromPPUM) && !fromPPU.equalsIgnoreCase(pPU);
    }

    public boolean hasUrl()
    {
        return !TextUtils.isEmpty(url);
    }

    public boolean isAvailableOnline()
    {
        return availableOnline;
    }

    public boolean isBaseVariantItem()
    {
        return baseVariantItem;
    }

    public boolean isPutEligible()
    {
        return putEligible;
    }

    public boolean isS2SEnabled()
    {
        return s2SEnabled;
    }

    public boolean isStoreOnly()
    {
        return storeOnly;
    }

    public boolean isSubMarketPrice()
    {
        return pricingInformation != null && !TextUtils.isEmpty(pricingInformation.submap);
    }

    public boolean isVariantItem()
    {
        return variantItem;
    }

    public void setAvailableInStore(String s)
    {
        availableInStore = s;
    }

    public void setBaseVariantItem(boolean flag)
    {
        baseVariantItem = flag;
    }

    public void setDealInfo(String s)
    {
        dealInfo = s;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setImageThumbnailUrl(String s)
    {
        imageThumbnailUrl = s;
    }

    public void setItemAvailability(ItemAvailability itemavailability)
    {
        if (!"in stock".equalsIgnoreCase(itemavailability.availability) && !"preorder now".equalsIgnoreCase(itemavailability.availability))
        {
            availableOnline = false;
        }
        availability = itemavailability;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setPrice(String s)
    {
        price = s;
    }

    public void setPriceDisplaySubtext(String s)
    {
        if (s != null && !s.startsWith("Final price depends"))
        {
            priceDisplaySubtext = s;
        }
    }

    public void setProductImageUrl(String s)
    {
        productImageUrl = s;
    }

    public void setPutEligible(boolean flag)
    {
        putEligible = flag;
    }

    public void setRating(float f)
    {
        rating = f;
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

    public void setVariantItem(boolean flag)
    {
        variantItem = flag;
    }

    public void setiD(String s)
    {
        iD = s;
    }

    public boolean shippingPassEligible()
    {
        return shippingPassEligible;
    }

    public boolean showOnWebsite()
    {
        return showOnWebsite;
    }


    public Seller()
    {
        availableOnline = true;
    }
}
