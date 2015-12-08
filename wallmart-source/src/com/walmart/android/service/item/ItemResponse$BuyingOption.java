// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import java.util.Map;

// Referenced classes of package com.walmart.android.service.item:
//            ItemResponse

public static class marketplaceOptions
{
    public static class GroupComponents
    {

        public String offerId;
        public int quantity;

        public GroupComponents()
        {
        }
    }

    public static class InflexibleKitGroupComponents
    {

        public GroupComponents groupComponents[];

        public InflexibleKitGroupComponents()
        {
            groupComponents = new GroupComponents[0];
        }
    }

    public static class PickupOption
    {

        public String displayStreetAddress;
        public String inStoreAvailability;
        public Price inStoreProductPrice;
        public String storeId;
        public String type;

        public PickupOption()
        {
        }
    }

    public static class Price
    {

        public String currencyAmount;
        public String displayPrice;
        public boolean displaySubMapPrice;
        public String priceType;
        public boolean subMap;

        public Price()
        {
        }
    }

    public static class Seller
    {

        public int catalogSellerId;
        public String displayName;
        public String sellerId;
        public String url;
        public boolean walmartOnline;

        public Seller()
        {
        }
    }

    public static class UnitPrice
    {

        public String displayPricePerUnit;
        public Price price;

        public UnitPrice()
        {
        }
    }


    public float addPrice;
    public boolean asAdvertised;
    public boolean available;
    public boolean blitzItem;
    public boolean cellCoverageLookupRequired;
    public boolean clearance;
    public boolean cslServiceDown;
    public boolean dayOfBlitz;
    public String defaultLocationName;
    public boolean deliverableByHoliday;
    public String displayArrivalDate;
    public String displayFreeShippingThresholdPrice;
    public String displayOtherSellersCount;
    public String displayPreorderStreetDate;
    public String displaySavings;
    public boolean electronicDelivery;
    public boolean exclusive;
    public boolean freeShipping;
    public boolean freeShippingThresholdEligible;
    public boolean freight;
    public boolean fulfillmentAjaxEnabled;
    public String fulfillmentOptionsAvailable[];
    public boolean giftMessageEligible;
    public boolean giftReceiptEligible;
    public boolean hasShippingRestrictions;
    public InflexibleKitGroupComponents inflexibleKitGroupComponents;
    public String inflexibleKitId;
    public boolean isNew;
    public Price listPrice;
    public boolean locationPromptRequired;
    public Price marketplaceOptions[];
    public Price maxPrice;
    public Price minPrice;
    public boolean nativeAddableToCart;
    public String offerId;
    public boolean offerShippingPassEligible;
    public boolean onlineOnly;
    public boolean onlyAtWalmart;
    public int otherSellersCount;
    public boolean pickupDatesFetchable;
    public PickupOption pickupOptions[];
    public boolean pickupTodayOption;
    public boolean pickupable;
    public boolean preorder;
    public Price price;
    public Map priceFlags;
    public boolean priceMismatch;
    public boolean pureSoi;
    public int quantityOptions[];
    public boolean rebateAvailable;
    public boolean reducedPrice;
    public boolean retired;
    public boolean rollback;
    public Price savingsAmount;
    public Seller seller;
    public int sellerIds[];
    public boolean shippable;
    public boolean shippingDatesFetchable;
    public String shippingDeliveryDateMessage;
    public Price shippingPrice;
    public boolean soiOfferNotAvailable;
    public boolean specialBuy;
    public boolean storeNameDisplayed;
    public boolean storeOnlyItem;
    public boolean strikethrough;
    public boolean strikethroughComparisonPrice;
    public UnitPrice unitPrice;
    public String usItemId;
    public Price wasPrice;

    public UnitPrice()
    {
        marketplaceOptions = new marketplaceOptions[0];
    }
}
