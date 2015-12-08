// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import com.walmart.android.service.item.model.DrugFacts;
import com.walmart.android.service.item.model.Nutrition;
import com.walmart.android.service.item.model.SupplementFacts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ItemResponse
{
    public static class BuyingOption
    {

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
        public BuyingOption marketplaceOptions[];
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

        public BuyingOption()
        {
            marketplaceOptions = new BuyingOption[0];
        }
    }

    public static class BuyingOption.GroupComponents
    {

        public String offerId;
        public int quantity;

        public BuyingOption.GroupComponents()
        {
        }
    }

    public static class BuyingOption.InflexibleKitGroupComponents
    {

        public BuyingOption.GroupComponents groupComponents[];

        public BuyingOption.InflexibleKitGroupComponents()
        {
            groupComponents = new BuyingOption.GroupComponents[0];
        }
    }

    public static class BuyingOption.PickupOption
    {

        public String displayStreetAddress;
        public String inStoreAvailability;
        public BuyingOption.Price inStoreProductPrice;
        public String storeId;
        public String type;

        public BuyingOption.PickupOption()
        {
        }
    }

    public static class BuyingOption.Price
    {

        public String currencyAmount;
        public String displayPrice;
        public boolean displaySubMapPrice;
        public String priceType;
        public boolean subMap;

        public BuyingOption.Price()
        {
        }
    }

    public static class BuyingOption.Seller
    {

        public int catalogSellerId;
        public String displayName;
        public String sellerId;
        public String url;
        public boolean walmartOnline;

        public BuyingOption.Seller()
        {
        }
    }

    public static class BuyingOption.UnitPrice
    {

        public String displayPricePerUnit;
        public BuyingOption.Price price;

        public BuyingOption.UnitPrice()
        {
        }
    }

    public static class Grouping
    {

        public String id;
        public Group optional[];
        public Product product;
        public Group required[];
        public Group standard[];
        public String type;

        public Grouping()
        {
            standard = new Group[0];
            required = new Group[0];
            optional = new Group[0];
        }
    }

    public static class Grouping.Component
    {

        public int componentIndex;
        public Product product;
        public int quantity;
        public boolean selected;

        public Grouping.Component()
        {
        }
    }

    public static class Grouping.Group
    {

        public Grouping.Component components[];
        public int minRequired;
        public String title;
        public String type;

        public Grouping.Group()
        {
        }
    }

    public static class Idml
    {

        public IdmlMap idmlMap;

        public Idml()
        {
        }
    }

    public static class Idml.IdmlMap
    {

        public DisplayabilityMatrix displayabilityMatrix;
        public Modules modules;

        public Idml.IdmlMap()
        {
        }
    }

    public static class Idml.IdmlMap.DisplayabilityMatrix
    {

        public LegalBadges legalBadges;
        public LegalBadges legalBadgesChokingHazard;

        public List getAllLegalBadges()
        {
            ArrayList arraylist = new ArrayList();
            if (legalBadgesChokingHazard != null && legalBadgesChokingHazard.legalContentList != null)
            {
                arraylist.addAll(legalBadgesChokingHazard.legalContentList);
            }
            if (legalBadges != null && legalBadges.legalContentList != null)
            {
                arraylist.addAll(legalBadges.legalContentList);
            }
            return arraylist;
        }

        public Idml.IdmlMap.DisplayabilityMatrix()
        {
        }
    }

    public static class Idml.IdmlMap.DisplayabilityMatrix.Item
    {

        public String headline;
        public String image;
        public String message;

        public Idml.IdmlMap.DisplayabilityMatrix.Item()
        {
        }
    }

    public static class Idml.IdmlMap.DisplayabilityMatrix.LegalBadges
    {

        public List legalContentList;

        public boolean isEmpty()
        {
            return legalContentList == null || legalContentList.isEmpty();
        }

        public Idml.IdmlMap.DisplayabilityMatrix.LegalBadges()
        {
            legalContentList = Collections.emptyList();
        }
    }

    public static class Idml.IdmlMap.Modules
    {

        public List directions;
        public DrugFacts drugFacts;
        public List esrbRating;
        public List indications;
        public List ingredients;
        public List longDescription;
        public SupplementFacts mSupplementFacts;
        public List mpaaRating;
        public Nutrition nutrition;
        public List shortDescription;
        public List specifications;
        public List trackListing;
        public List warnings;
        public List warranties;
        public List whatsIncluded;

        public Idml.IdmlMap.Modules()
        {
            specifications = Collections.emptyList();
            ingredients = Collections.emptyList();
            directions = Collections.emptyList();
            warnings = Collections.emptyList();
            indications = Collections.emptyList();
            trackListing = Collections.emptyList();
            whatsIncluded = Collections.emptyList();
            longDescription = Collections.emptyList();
            shortDescription = Collections.emptyList();
            esrbRating = Collections.emptyList();
            mpaaRating = Collections.emptyList();
            warranties = Collections.emptyList();
        }
    }

    public static class ImageAsset
    {

        public Versions versions;

        public ImageAsset()
        {
        }
    }

    public static class ImageAsset.Versions
    {

        public String hero;
        public String thumbnail;
        public String tile;
        public String zoom;

        public ImageAsset.Versions()
        {
        }
    }

    public static class LegalContent
    {

        public String headline;
        public String image;
        public String message;

        public LegalContent()
        {
        }
    }

    public static class Product
    {

        public BuyingOption buyingOptions;
        public String canonicalUrl;
        public ImageAsset imageAssets[];
        public String itemClassId;
        public LegalContent legalContent;
        public String longDescription;
        public String primaryImageUrl;
        public String productClassType;
        public String productId;
        public String productName;
        public ReviewData reviewData;
        public String shortDescription;
        public String upc;
        public String usItemId;
        public VariantInformation variantInformation;
        public String wupc;

        public Product()
        {
            imageAssets = new ImageAsset[0];
        }
    }

    public static class ReviewData
    {

        public float averageOverallRating;
        public int overallRatingRange;
        public int ratingValueFiveCount;
        public int ratingValueFourCount;
        public int ratingValueOneCount;
        public int ratingValueThreeCount;
        public int ratingValueTwoCount;
        public int recommendedPercentage;
        public int totalReviewCount;

        public ReviewData()
        {
        }
    }

    public static class VariantInformation
    {

        public String primaryProductId;
        public VariantProduct variantProducts[];
        public VariantType variantTypes[];

        public VariantInformation()
        {
        }
    }

    public static class VariantInformation.VariantProduct
    {

        public BuyingOption buyingOptions;
        public boolean fetched;
        public String id;
        public Map variants;

        public VariantInformation.VariantProduct()
        {
        }
    }

    public static class VariantInformation.VariantType
    {

        public boolean dropdown;
        public String id;
        public String name;
        public boolean product;
        public boolean radiobutton;
        public boolean swatch;
        public VariantInformation.VariantValue variants[];

        public VariantInformation.VariantType()
        {
            variants = new VariantInformation.VariantValue[0];
        }
    }

    public static class VariantInformation.VariantValue
    {

        public boolean available;
        public String id;
        public ImageAsset imageAssets[];
        public String imageUrl;
        public String name;
        public String productIds[];
        public boolean retired;
        public boolean selected;
        public String status;
        public String type;
        public int valueRank;

        public VariantInformation.VariantValue()
        {
            productIds = new String[0];
            imageAssets = new ImageAsset[0];
        }
    }


    public Grouping choice;
    public Idml idml;
    public Grouping nonConfig;
    public Product product;

    public ItemResponse()
    {
    }
}
