// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.walmart.android.app.item.HtmlListTagHandler;
import com.walmart.android.service.item.model.Track;
import com.walmart.android.util.ItemUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.ArrayUtils;

// Referenced classes of package com.walmart.android.service.item:
//            ItemResponse, BundleModel, StringPair, ItemPrice, 
//            VariantsModel, DescriptionModel, BuyingOptionModel, ItemModel

public class ItemDataConverter
{
    private static class ItemResponseItemModelBuilder extends ItemModel.Builder
    {

        public ItemResponseItemModelBuilder(ItemResponse itemresponse)
        {
            ItemResponse.Product product;
            product = null;
            Object obj = null;
            if (itemresponse != null)
            {
                ItemResponse.ImageAsset imageasset;
                int i;
                int k;
                if (itemresponse.choice != null)
                {
                    obj = itemresponse.choice;
                } else
                {
                    obj = itemresponse.nonConfig;
                }
                if (obj != null)
                {
                    product = ((ItemResponse.Grouping) (obj)).product;
                } else
                {
                    product = itemresponse.product;
                }
            }
            if (product == null) goto _L2; else goto _L1
_L1:
            mProductId = product.productId;
            mIsGrouping = "BUNDLE".equals(product.productClassType);
            boolean flag;
            if (obj != null && "CHOICE_BUNDLE".equals(((ItemResponse.Grouping) (obj)).type))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mIsConfigurableBundle = flag;
            if (obj != null && "NON_CONFIG".equals(((ItemResponse.Grouping) (obj)).type))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mIsNonConfigurableBundle = flag;
            mItemId = product.usItemId;
            if ("VARIANT".equals(product.productClassType) && product.variantInformation != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mHasVariants = flag;
            mIsElectronicGiftCard = "31".equals(product.itemClassId);
            mIsPhysicalGiftCard = "48".equals(product.itemClassId);
            mProductName = product.productName;
            if (product.imageAssets != null)
            {
                obj = product.imageAssets;
                k = obj.length;
                for (i = 0; i < k; i++)
                {
                    imageasset = obj[i];
                    if (!TextUtils.isEmpty(imageasset.versions.hero))
                    {
                        mProductImageUrls.add(imageasset.versions.hero);
                    }
                    if (mThumbnailImage == null && !TextUtils.isEmpty(imageasset.versions.tile))
                    {
                        mThumbnailImage = imageasset.versions.tile;
                    }
                }

            }
            mUrlPath = product.canonicalUrl;
            mUpc = product.wupc;
            if (product.reviewData != null)
            {
                ReviewData.Builder builder = new ReviewData.Builder();
                builder.mAverageOverallRating = product.reviewData.averageOverallRating;
                builder.mRatingDistribution = new HashMap();
                builder.mRatingDistribution.put(Integer.valueOf(5), Integer.valueOf(product.reviewData.ratingValueFiveCount));
                builder.mRatingDistribution.put(Integer.valueOf(4), Integer.valueOf(product.reviewData.ratingValueFourCount));
                builder.mRatingDistribution.put(Integer.valueOf(3), Integer.valueOf(product.reviewData.ratingValueThreeCount));
                builder.mRatingDistribution.put(Integer.valueOf(2), Integer.valueOf(product.reviewData.ratingValueTwoCount));
                builder.mRatingDistribution.put(Integer.valueOf(1), Integer.valueOf(product.reviewData.ratingValueOneCount));
                builder.mRecommendedPercentage = product.reviewData.recommendedPercentage;
                builder.mTotalReviewCount = product.reviewData.totalReviewCount;
                mReviewData = builder.build();
            }
            if (product.buyingOptions == null) goto _L2; else goto _L3
_L3:
            ItemResponse.BuyingOption buyingoption;
            int j;
            boolean flag1;
            ItemResponse.BuyingOption buyingoption1;
            ItemResponse.BuyingOption buyingoption2;
            ItemResponse.BuyingOption abuyingoption[];
            int l;
            if (product.buyingOptions.inflexibleKitId != null && product.buyingOptions.inflexibleKitGroupComponents != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            mIsInflexibleKit = flag1;
            buyingoption = null;
            buyingoption1 = buyingoption;
            if (product.buyingOptions.seller != null)
            {
                buyingoption1 = buyingoption;
                if (product.buyingOptions.seller.catalogSellerId == 0)
                {
                    buyingoption1 = product.buyingOptions;
                }
            }
            abuyingoption = product.buyingOptions.marketplaceOptions;
            buyingoption = buyingoption1;
            if (buyingoption1 != null) goto _L5; else goto _L4
_L4:
            buyingoption = buyingoption1;
            if (ArrayUtils.isEmpty(abuyingoption)) goto _L5; else goto _L6
_L6:
            l = abuyingoption.length;
            j = 0;
_L10:
            buyingoption = buyingoption1;
            if (j >= l) goto _L5; else goto _L7
_L7:
            buyingoption = abuyingoption[j];
            if (buyingoption.seller == null || buyingoption.seller.catalogSellerId != 0) goto _L8; else goto _L5
_L5:
            Object obj1;
            if (buyingoption == null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            mIsMarketPlaceOnlyItem = flag1;
            if (ArrayUtils.isEmpty(abuyingoption))
            {
                break; /* Loop/switch isn't completed */
            }
            if (abuyingoption[0].seller != null)
            {
                obj1 = Integer.toString(abuyingoption[0].seller.catalogSellerId);
            } else
            {
                obj1 = null;
            }
            mPrimarySellerId = ((String) (obj1));
            l = abuyingoption.length;
            for (j = 0; j < l; j++)
            {
                buyingoption2 = abuyingoption[j];
                obj1 = buyingoption2;
                if (buyingoption != null)
                {
                    obj1 = buyingoption2;
                    if (buyingoption2.seller.sellerId.equals(buyingoption.seller.sellerId))
                    {
                        obj1 = buyingoption;
                    }
                }
                mBuyingOptions.add(ItemDataConverter.buyingOptionModelFromBuyingOption(((ItemResponse.BuyingOption) (obj1))));
            }

            break MISSING_BLOCK_LABEL_873;
_L8:
            j++;
            if (true) goto _L10; else goto _L9
_L9:
            Object obj2;
            int i1;
            boolean flag2;
            if (product.buyingOptions.seller != null)
            {
                obj2 = Integer.toString(product.buyingOptions.seller.catalogSellerId);
            } else
            {
                obj2 = null;
            }
            mPrimarySellerId = ((String) (obj2));
            mBuyingOptions.add(ItemDataConverter.buyingOptionModelFromBuyingOption(product.buyingOptions, product));
            if (product.buyingOptions.freeShipping)
            {
                mPriceFlags.add(ItemModel.PriceFlags.FREE_SHIPPING);
            }
            if (product.buyingOptions.clearance)
            {
                mPriceFlags.add(ItemModel.PriceFlags.CLEARANCE);
            }
            if (product.buyingOptions.rollback)
            {
                mPriceFlags.add(ItemModel.PriceFlags.ROLLBACK);
            }
            if (product.buyingOptions.isNew)
            {
                mPriceFlags.add(ItemModel.PriceFlags.NEW);
            }
            if (product.buyingOptions.specialBuy)
            {
                mPriceFlags.add(ItemModel.PriceFlags.SPECIAL_BUY);
            }
            if (product.buyingOptions.rebateAvailable)
            {
                mPriceFlags.add(ItemModel.PriceFlags.REBATE_AVAILABLE);
            }
            if (product.buyingOptions.asAdvertised)
            {
                mPriceFlags.add(ItemModel.PriceFlags.AS_ADVERTISED);
            }
            if (product.buyingOptions.reducedPrice)
            {
                mPriceFlags.add(ItemModel.PriceFlags.REDUCED_PRICE);
            }
            if (product.buyingOptions.exclusive)
            {
                mPriceFlags.add(ItemModel.PriceFlags.EXCLUSIVE);
            }
            flag2 = product.buyingOptions.pickupTodayOption;
            mCanPickupToday = flag2;
            mIsPickupTodayEligible = flag2;
            if (product.buyingOptions.fulfillmentOptionsAvailable != null)
            {
                obj2 = product.buyingOptions.fulfillmentOptionsAvailable;
                i1 = obj2.length;
                j = 0;
                while (j < i1) 
                {
                    String s = obj2[j];
                    if ("ELECTRONIC".equals(s))
                    {
                        mIsElectronicShipping = true;
                    } else
                    if ("S2H".equals(s))
                    {
                        mIsShipToHomeEligible = true;
                    } else
                    if ("S2S".equals(s))
                    {
                        mIsShipToStoreEligible = true;
                    } else
                    if ("PUT".equals(s))
                    {
                        mIsPickupTodayEligible = true;
                    }
                    j++;
                }
            }
            if (mCanPickupToday || buyingoption == null || buyingoption.pickupOptions == null || buyingoption.pickupOptions.length <= 0) goto _L12; else goto _L11
_L11:
            ItemResponse.BuyingOption.PickupOption apickupoption[];
            int j1;
            apickupoption = buyingoption.pickupOptions;
            j1 = apickupoption.length;
            j = 0;
_L17:
            if (j >= j1) goto _L12; else goto _L13
_L13:
            ItemResponse.BuyingOption.PickupOption pickupoption = apickupoption[j];
            if (!"PUT".equals(pickupoption.type) || !"AVAILABLE".equals(pickupoption.inStoreAvailability)) goto _L15; else goto _L14
_L14:
            mCanPickupToday = true;
_L12:
            if (buyingoption != null && !buyingoption.onlineOnly)
            {
                mIsAvailableInSomeStore = true;
            }
            mShipToStoreDeliveryDateMessaging = null;
            mShipToHomeDeliveryDateMessaging = null;
            mPreorderMessage = null;
            mIsEligibleForCart = product.buyingOptions.nativeAddableToCart;
            boolean flag3;
            if (mBuyingOptions.size() != 1 || buyingoption == null || !buyingoption.pureSoi)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            mIsEligibleToBuyOnline = flag3;
            mVariantsModel = ItemDataConverter.variantsModelFromItemResponse(mHasVariants, itemresponse);
            mBundleModel = ItemDataConverter.bundleModelFromItemResponse(itemresponse);
            mDescriptionModel = ItemDataConverter.descriptionModelFromItemResponse(itemresponse);
_L2:
            return;
_L15:
            j++;
            if (true) goto _L17; else goto _L16
_L16:
        }
    }

    private static class PangaeaBundleGroupBuilder extends BundleModel.BundleGroup.Builder
    {

        public PangaeaBundleGroupBuilder(ItemResponse.Grouping.Group group)
        {
            mGroupType = ItemDataConverter.groupTypeFromComponentTypeString(group.type);
            mTitle = group.title;
            mMinRequired = group.minRequired;
            ArrayList arraylist;
            int i;
            int j;
            if (group.minRequired > 0)
            {
                i = group.minRequired;
            } else
            {
                i = 0x7fffffff;
            }
            mMaxSelectionsAllowed = i;
            arraylist = new ArrayList();
            group = group.components;
            j = group.length;
            for (i = 0; i < j; i++)
            {
                ItemResponse.Grouping.Component component = group[i];
                if (component.product != null && component.product.usItemId != null)
                {
                    arraylist.add((new PangaeaGroupOptionBuilder(component)).build());
                }
            }

            mOptions = Collections.unmodifiableList(arraylist);
            mIsBasePriceInvalid = true;
        }
    }

    private static class PangaeaGroupOptionBuilder extends BundleModel.GroupOption.Builder
    {

        public PangaeaGroupOptionBuilder(ItemResponse.Grouping.Component component)
        {
            int i;
            i = 0;
            super();
            if (component.product.buyingOptions != null)
            {
                mPriceModifierCents = Math.round(component.product.buyingOptions.addPrice * 100F);
                if (component.product.buyingOptions.price != null)
                {
                    mCurrencyAmountCents = Math.round(Float.parseFloat(component.product.buyingOptions.price.currencyAmount) * 100F);
                }
                isAvailable = component.product.buyingOptions.available;
            }
            itemId = component.product.usItemId;
            itemName = component.product.productName;
            float f;
            String s;
            int j;
            boolean flag;
            if (component.product.reviewData != null)
            {
                f = component.product.reviewData.averageOverallRating;
            } else
            {
                f = 0.0F;
            }
            customerRating = f;
            if (component.product.variantInformation != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            isVariant = flag;
            ranking = component.componentIndex;
            quantity = component.quantity;
            if (component.product.buyingOptions != null)
            {
                s = component.product.buyingOptions.offerId;
            } else
            {
                s = null;
            }
            offerId = s;
            if (component.product.imageAssets == null) goto _L2; else goto _L1
_L1:
            component = component.product.imageAssets;
            j = component.length;
_L7:
            if (i >= j) goto _L2; else goto _L3
_L3:
            s = component[i];
            if (TextUtils.isEmpty(((ItemResponse.ImageAsset) (s)).versions.thumbnail)) goto _L5; else goto _L4
_L4:
            productImageUrl = ((ItemResponse.ImageAsset) (s)).versions.thumbnail;
_L2:
            return;
_L5:
            i++;
            if (true) goto _L7; else goto _L6
_L6:
        }
    }


    public static final String E_GIFT_CARD_CLASS_ID = "31";
    public static final String PHYSICAL_GIFT_CARD_CLASS_ID = "48";
    private static android.text.Html.TagHandler sTagHandler = new HtmlListTagHandler();

    public ItemDataConverter()
    {
    }

    public static BundleModel bundleModelFromItemResponse(ItemResponse itemresponse)
    {
        boolean flag = false;
        if (itemresponse != null)
        {
            if (itemresponse.choice != null)
            {
                itemresponse = itemresponse.choice;
            } else
            {
                itemresponse = itemresponse.nonConfig;
            }
            if (itemresponse != null)
            {
                ArrayList arraylist = new ArrayList();
                ArrayList arraylist1 = new ArrayList();
                ArrayList arraylist2 = new ArrayList();
                ItemResponse.Grouping.Group agroup[] = ((ItemResponse.Grouping) (itemresponse)).standard;
                int l = agroup.length;
                for (int i = 0; i < l; i++)
                {
                    arraylist.add((new PangaeaBundleGroupBuilder(agroup[i])).build());
                }

                agroup = ((ItemResponse.Grouping) (itemresponse)).required;
                l = agroup.length;
                for (int j = 0; j < l; j++)
                {
                    arraylist1.add((new PangaeaBundleGroupBuilder(agroup[j])).build());
                }

                agroup = ((ItemResponse.Grouping) (itemresponse)).optional;
                l = agroup.length;
                for (int k = ((flag) ? 1 : 0); k < l; k++)
                {
                    ItemResponse.Grouping.Group group = agroup[k];
                    if (group.components != null && group.components.length > 0)
                    {
                        arraylist2.add((new PangaeaBundleGroupBuilder(group)).build());
                    }
                }

                return new BundleModel(arraylist, arraylist1, arraylist2, ((ItemResponse.Grouping) (itemresponse)).id);
            } else
            {
                return new BundleModel();
            }
        } else
        {
            return new BundleModel();
        }
    }

    public static BuyingOptionModel buyingOptionModelFromBuyingOption(ItemResponse.BuyingOption buyingoption)
    {
        return buyingOptionModelFromBuyingOption(buyingoption, null);
    }

    public static BuyingOptionModel buyingOptionModelFromBuyingOption(ItemResponse.BuyingOption buyingoption, ItemResponse.Product product)
    {
        BuyingOptionModel.Builder builder = new BuyingOptionModel.Builder();
        builder.mAvailable = buyingoption.available;
        builder.mPreorder = buyingoption.preorder;
        builder.mShippable = buyingoption.shippable;
        builder.mDisplayPreorderStreetDate = buyingoption.displayPreorderStreetDate;
        builder.mOfferId = buyingoption.offerId;
        boolean flag;
        if (product != null)
        {
            flag = product.buyingOptions.offerShippingPassEligible;
        } else
        {
            flag = buyingoption.offerShippingPassEligible;
        }
        builder.mShippingPassEligible = flag;
        if (product != null)
        {
            product = itemPriceFromProduct(product);
        } else
        {
            product = itemPriceFromBuyingOption(buyingoption);
        }
        builder.mPrice = product;
        builder.mSellerId = buyingoption.seller.sellerId;
        builder.mCatalogSellerId = buyingoption.seller.catalogSellerId;
        builder.mSellerName = buyingoption.seller.displayName;
        builder.mSellerUrl = buyingoption.seller.url;
        builder.mUsItemId = buyingoption.usItemId;
        builder.mIsFreight = buyingoption.freight;
        builder.mShippingDeliveryDateMessage = buyingoption.shippingDeliveryDateMessage;
        builder.mInflexibleKitId = buyingoption.inflexibleKitId;
        builder.mHasFreeShipping = buyingoption.freeShipping;
        builder.mPureSoi = buyingoption.pureSoi;
        builder.mStoreOnlyItem = buyingoption.storeOnlyItem;
        builder.mHasFreeShippingThreshold = buyingoption.freeShippingThresholdEligible;
        builder.mFreeShippingThresholdPrice = buyingoption.displayFreeShippingThresholdPrice;
        builder.mStoreItemModels = storeItemModelsFromBuyingOption(buyingoption);
        builder.mInflexibleKitConfiguration = inflexibleGroupModelItemsFromBuyingOption(buyingoption);
        return builder.build();
    }

    private static DescriptionModel descriptionModelFromItemResponse(ItemResponse itemresponse)
    {
        DescriptionModel.Builder builder = new DescriptionModel.Builder();
        ItemResponse.Idml idml = itemresponse.idml;
        if (idml != null && idml.idmlMap != null && idml.idmlMap.modules != null)
        {
            builder.mSpecifications = idml.idmlMap.modules.specifications;
            builder.mNutrition = idml.idmlMap.modules.nutrition;
            builder.mSupplementFacts = idml.idmlMap.modules.mSupplementFacts;
            builder.mDrugFacts = idml.idmlMap.modules.drugFacts;
            StringPair stringpair;
            for (Iterator iterator = idml.idmlMap.modules.warnings.iterator(); iterator.hasNext(); builder.mWarnings.add(fromHtml(stringpair.value)))
            {
                stringpair = (StringPair)iterator.next();
            }

            StringPair stringpair1;
            for (Iterator iterator1 = idml.idmlMap.modules.indications.iterator(); iterator1.hasNext(); builder.mIndications.add(new DescriptionModel.Description(stringpair1, false, true)))
            {
                stringpair1 = (StringPair)iterator1.next();
            }

            StringPair stringpair2;
            for (Iterator iterator2 = idml.idmlMap.modules.directions.iterator(); iterator2.hasNext(); builder.mDirections.add(fromHtml(stringpair2.value)))
            {
                stringpair2 = (StringPair)iterator2.next();
            }

            StringPair stringpair3;
            for (Iterator iterator3 = idml.idmlMap.modules.ingredients.iterator(); iterator3.hasNext(); builder.mIngredients.add(fromHtml(stringpair3.value)))
            {
                stringpair3 = (StringPair)iterator3.next();
            }

            StringPair stringpair4;
            for (Iterator iterator4 = idml.idmlMap.modules.whatsIncluded.iterator(); iterator4.hasNext(); builder.mWhatsIncluded.add(new DescriptionModel.Description(stringpair4, false, true)))
            {
                stringpair4 = (StringPair)iterator4.next();
            }

            StringPair stringpair5;
            for (Iterator iterator5 = idml.idmlMap.modules.warranties.iterator(); iterator5.hasNext(); builder.mWarranties.add(new DescriptionModel.Description(stringpair5, false, true)))
            {
                stringpair5 = (StringPair)iterator5.next();
            }

            if (!idml.idmlMap.modules.shortDescription.isEmpty() && idml.idmlMap.modules.shortDescription.get(0) != null)
            {
                builder.mShortDescription = fromHtml(((StringPair)idml.idmlMap.modules.shortDescription.get(0)).value);
            }
            if (!idml.idmlMap.modules.longDescription.isEmpty() && idml.idmlMap.modules.longDescription.get(0) != null)
            {
                builder.mLongDescription = fromHtml(((StringPair)idml.idmlMap.modules.longDescription.get(0)).value);
            }
            Track track;
            for (Iterator iterator6 = idml.idmlMap.modules.trackListing.iterator(); iterator6.hasNext(); builder.mTrackListing.add(track.title))
            {
                track = (Track)iterator6.next();
            }

            ItemResponse.Idml.IdmlMap.DisplayabilityMatrix.Item item;
            for (Iterator iterator7 = idml.idmlMap.displayabilityMatrix.getAllLegalBadges().iterator(); iterator7.hasNext(); builder.mLegalBadges.add(new DescriptionModel.IconDescription(item.headline, item.message, item.image)))
            {
                item = (ItemResponse.Idml.IdmlMap.DisplayabilityMatrix.Item)iterator7.next();
            }

            if (!idml.idmlMap.modules.esrbRating.isEmpty())
            {
                Object obj = null;
                Object obj1 = null;
                String s1 = obj1;
                String s = obj;
                if (itemresponse.product != null)
                {
                    s1 = obj1;
                    s = obj;
                    if (itemresponse.product.legalContent != null)
                    {
                        s = itemresponse.product.legalContent.headline;
                        s1 = itemresponse.product.legalContent.message;
                    }
                }
                StringPair stringpair7;
                for (Iterator iterator9 = idml.idmlMap.modules.esrbRating.iterator(); iterator9.hasNext(); builder.mLegalBadges.add(new DescriptionModel.IconDescription(s, s1, stringpair7.value)))
                {
                    stringpair7 = (StringPair)iterator9.next();
                }

            }
            if (!idml.idmlMap.modules.mpaaRating.isEmpty())
            {
                StringPair stringpair6;
                for (Iterator iterator8 = idml.idmlMap.modules.mpaaRating.iterator(); iterator8.hasNext(); builder.mLegalBadges.add(new DescriptionModel.IconDescription(stringpair6.name, null, stringpair6.value)))
                {
                    stringpair6 = (StringPair)iterator8.next();
                }

            }
        }
        ItemResponse.Product product = getProductFromResponse(itemresponse);
        if (product != null)
        {
            if (product.shortDescription != null)
            {
                itemresponse = fromHtml(product.shortDescription);
            } else
            {
                itemresponse = null;
            }
            builder.mProductInformationShort = itemresponse;
            if (product.longDescription != null)
            {
                itemresponse = fromHtml(product.longDescription);
            } else
            {
                itemresponse = null;
            }
            builder.mProductInformation = itemresponse;
        }
        return builder.build();
    }

    private static CharSequence fromHtml(String s)
    {
        return Html.fromHtml(s, null, sTagHandler);
    }

    private static ItemResponse.Product getProductFromResponse(ItemResponse itemresponse)
    {
        if (itemresponse.product == null)
        {
            if (itemresponse.choice != null)
            {
                itemresponse = itemresponse.choice;
            } else
            {
                itemresponse = itemresponse.nonConfig;
            }
            if (itemresponse != null)
            {
                return ((ItemResponse.Grouping) (itemresponse)).product;
            } else
            {
                return null;
            }
        } else
        {
            return itemresponse.product;
        }
    }

    private static BundleModel.GroupType groupTypeFromComponentTypeString(String s)
    {
        if ("standard".equalsIgnoreCase(s))
        {
            return BundleModel.GroupType.STANDARD;
        }
        if ("required".equalsIgnoreCase(s))
        {
            return BundleModel.GroupType.REQUIRED;
        } else
        {
            return BundleModel.GroupType.OPTIONAL;
        }
    }

    private static List inflexibleGroupModelItemsFromBuyingOption(ItemResponse.BuyingOption buyingoption)
    {
        ArrayList arraylist = new ArrayList();
        if (buyingoption.inflexibleKitId != null && buyingoption.inflexibleKitGroupComponents != null)
        {
            buyingoption = buyingoption.inflexibleKitGroupComponents.groupComponents;
            int j = buyingoption.length;
            for (int i = 0; i < j; i++)
            {
                Object obj = buyingoption[i];
                arraylist.add(new com.walmart.android.service.cart.CartService.OfferConfiguration(((ItemResponse.BuyingOption.GroupComponents) (obj)).offerId, ((ItemResponse.BuyingOption.GroupComponents) (obj)).quantity));
            }

        }
        return arraylist;
    }

    public static ItemModel itemModelFromItemResponse(ItemResponse itemresponse)
    {
        return (new ItemResponseItemModelBuilder(itemresponse)).build();
    }

    public static ItemPrice itemPriceFromBuyingOption(ItemResponse.BuyingOption buyingoption)
    {
        ItemPrice.Builder builder = new ItemPrice.Builder();
        if (buyingoption != null)
        {
            ItemResponse.BuyingOption.Price price = buyingoption.price;
            if (price != null)
            {
                builder.price(price.currencyAmount).submap(price.subMap);
                ItemResponse.BuyingOption.Price price2 = buyingoption.listPrice;
                Object obj = buyingoption.wasPrice;
                ItemResponse.BuyingOption.Price price1 = buyingoption.savingsAmount;
                boolean flag = ItemUtils.isValidSavingsPrice(price1);
                if (price2 != null && !TextUtils.isEmpty(price2.displayPrice))
                {
                    obj = new SpannableStringBuilder();
                    ((SpannableStringBuilder) (obj)).append(ItemUtils.asListPriceString(price2.displayPrice));
                    if (!TextUtils.isEmpty(buyingoption.displaySavings) && !price.subMap)
                    {
                        ((SpannableStringBuilder) (obj)).append("\n").append(ItemUtils.asYouSavePriceString(buyingoption.displaySavings));
                    } else
                    if (flag)
                    {
                        ((SpannableStringBuilder) (obj)).append("\n").append(ItemUtils.asYouSavePriceString(price1.displayPrice));
                    }
                    builder.listPrice(((CharSequence) (obj)));
                } else
                if (obj != null && !TextUtils.isEmpty(((ItemResponse.BuyingOption.Price) (obj)).displayPrice))
                {
                    SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
                    spannablestringbuilder.append(ItemUtils.asWasPriceString(((ItemResponse.BuyingOption.Price) (obj)).displayPrice));
                    if (!TextUtils.isEmpty(buyingoption.displaySavings) && !price.subMap)
                    {
                        spannablestringbuilder.append("\n").append(ItemUtils.asYouSavePriceString(buyingoption.displaySavings));
                    } else
                    if (flag)
                    {
                        spannablestringbuilder.append("\n").append(ItemUtils.asYouSavePriceString(price1.displayPrice));
                    }
                    builder.listPrice(spannablestringbuilder);
                } else
                if (flag)
                {
                    builder.listPrice(ItemUtils.asYouSavePriceString(price1.displayPrice));
                }
            } else
            if (buyingoption.minPrice != null)
            {
                builder.price(ItemUtils.asFromPriceString(buyingoption.minPrice.currencyAmount));
            }
            if (buyingoption.unitPrice != null && buyingoption.unitPrice.displayPricePerUnit != null)
            {
                builder.pricePerUnit(buyingoption.unitPrice.displayPricePerUnit);
            }
        }
        return builder.build();
    }

    private static ItemPrice itemPriceFromProduct(ItemResponse.Product product)
    {
        if (product != null && product.variantInformation == null)
        {
            return itemPriceFromBuyingOption(product.buyingOptions);
        } else
        {
            return new ItemPrice();
        }
    }

    private static List storeItemModelsFromBuyingOption(ItemResponse.BuyingOption buyingoption)
    {
        ArrayList arraylist = new ArrayList();
        if (buyingoption.pickupOptions != null)
        {
            buyingoption = buyingoption.pickupOptions;
            int j = buyingoption.length;
            int i = 0;
            while (i < j) 
            {
                Object obj = buyingoption[i];
                StoreItemModel.Builder builder = new StoreItemModel.Builder();
                builder.mStoreId = ((ItemResponse.BuyingOption.PickupOption) (obj)).storeId;
                builder.mStoreAddress = ((ItemResponse.BuyingOption.PickupOption) (obj)).displayStreetAddress;
                builder.mIsPutAvailable = "PUT".equals(((ItemResponse.BuyingOption.PickupOption) (obj)).type);
                ItemPrice.Builder builder1;
                if (((ItemResponse.BuyingOption.PickupOption) (obj)).inStoreAvailability != null)
                {
                    if ("AVAILABLE".equals(((ItemResponse.BuyingOption.PickupOption) (obj)).inStoreAvailability))
                    {
                        builder.mStockStatus = StoreItemModel.StockStatus.AVAILABLE;
                    } else
                    if ("LIMITED".equals(((ItemResponse.BuyingOption.PickupOption) (obj)).inStoreAvailability))
                    {
                        builder.mStockStatus = StoreItemModel.StockStatus.LIMITED;
                    } else
                    if ("NOT_AVAILABLE".equals(((ItemResponse.BuyingOption.PickupOption) (obj)).inStoreAvailability))
                    {
                        builder.mStockStatus = StoreItemModel.StockStatus.UNAVAILABLE;
                    }
                }
                builder1 = new ItemPrice.Builder();
                if (((ItemResponse.BuyingOption.PickupOption) (obj)).inStoreProductPrice != null)
                {
                    builder1.price(((ItemResponse.BuyingOption.PickupOption) (obj)).inStoreProductPrice.currencyAmount).submap(((ItemResponse.BuyingOption.PickupOption) (obj)).inStoreProductPrice.subMap);
                }
                builder.mPrice = builder1.build();
                arraylist.add(builder.build());
                i++;
            }
        }
        return arraylist;
    }

    private static VariantsModel variantsModelFromItemResponse(boolean flag, ItemResponse itemresponse)
    {
        if (flag)
        {
            ItemResponse.VariantInformation variantinformation = itemresponse.product.variantInformation;
            ArrayList arraylist = new ArrayList();
            HashMap hashmap = new HashMap();
            LinkedHashMap linkedhashmap = new LinkedHashMap();
            ItemResponse.VariantInformation.VariantType avarianttype[] = variantinformation.variantTypes;
            int j1 = avarianttype.length;
            for (int i = 0; i < j1; i++)
            {
                ItemResponse.VariantInformation.VariantType varianttype = avarianttype[i];
                arraylist.add(new VariantsModel.VariantType(varianttype.id, varianttype.name));
                ItemResponse.VariantInformation.VariantValue avariantvalue[] = varianttype.variants;
                int k1 = avariantvalue.length;
                ItemResponse.ImageAsset imageasset;
                for (int k = 0; k < k1; k++)
                {
                    ItemResponse.VariantInformation.VariantValue variantvalue = avariantvalue[k];
                    if (variantvalue.type != null && variantvalue.name != null)
                    {
                        VariantsModel.Value value = new VariantsModel.Value(variantvalue.type, variantvalue.name, variantvalue.valueRank, variantvalue.imageUrl);
                        linkedhashmap.put(variantvalue.id, value);
                    }
                    String as[];
                    int l1;
                    if (!ArrayUtils.isEmpty(variantvalue.imageAssets))
                    {
                        imageasset = variantvalue.imageAssets[0];
                    } else
                    {
                        imageasset = null;
                    }
                    if (imageasset == null || TextUtils.isEmpty(imageasset.versions.hero))
                    {
                        continue;
                    }
                    as = variantvalue.productIds;
                    l1 = as.length;
                    for (int i1 = 0; i1 < l1; i1++)
                    {
                        hashmap.put(as[i1], imageasset.versions.hero);
                    }

                }

            }

            ArrayList arraylist1 = new ArrayList();
            ItemResponse.VariantInformation.VariantProduct avariantproduct[] = variantinformation.variantProducts;
            int l = avariantproduct.length;
            for (int j = 0; j < l; j++)
            {
                ItemResponse.VariantInformation.VariantProduct variantproduct = avariantproduct[j];
                ArrayList arraylist2 = new ArrayList();
                if (variantproduct.variants != null)
                {
                    Iterator iterator = variantproduct.variants.values().iterator();
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        ItemResponse.VariantInformation.VariantValue variantvalue1 = (ItemResponse.VariantInformation.VariantValue)iterator.next();
                        if (linkedhashmap.containsKey(variantvalue1.id))
                        {
                            arraylist2.add(linkedhashmap.get(variantvalue1.id));
                        }
                    } while (true);
                }
                if (arraylist2.size() != arraylist.size() || variantproduct.buyingOptions == null || !variantproduct.buyingOptions.available || TextUtils.isEmpty(variantproduct.id))
                {
                    continue;
                }
                String s = (String)hashmap.get(variantproduct.id);
                BuyingOptionModel buyingoptionmodel = null;
                if (variantproduct.buyingOptions.price != null)
                {
                    buyingoptionmodel = buyingOptionModelFromBuyingOption(variantproduct.buyingOptions);
                }
                arraylist1.add(new VariantsModel.VariantItem(variantproduct.id, buyingoptionmodel, arraylist2, s));
            }

            return new VariantsModel(arraylist, arraylist1, itemresponse.product.variantInformation.primaryProductId);
        } else
        {
            return new VariantsModel();
        }
    }




}
