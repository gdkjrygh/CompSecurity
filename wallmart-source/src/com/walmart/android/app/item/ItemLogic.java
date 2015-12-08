// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.app.Activity;
import android.content.res.Resources;
import android.text.Html;
import android.text.TextUtils;
import com.walmart.android.app.registry.RegistryStatus;
import com.walmart.android.data.StoreAvailabilityData;
import com.walmart.android.service.item.BuyingOptionModel;
import com.walmart.android.service.item.DescriptionModel;
import com.walmart.android.service.item.ItemModel;
import com.walmart.android.service.item.ItemPrice;
import com.walmart.android.service.item.StoreItemModel;
import com.walmart.android.util.ShippingPassUtil;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

// Referenced classes of package com.walmart.android.app.item:
//            ItemState

public class ItemLogic
{
    public static class FlagValue
    {

        private int drawableResId;
        private int stringResId;

        public int getDrawableId()
        {
            return drawableResId;
        }

        public int getStringId()
        {
            return stringResId;
        }

        public FlagValue(int i, int j)
        {
            drawableResId = i;
            stringResId = j;
        }
    }


    private static final Pattern sOutOfStockPattern = Pattern.compile(".*Out of Stock.*", 2);
    private static final String sShippingDDMNotAvailable = "Not Available";
    private final ItemModel mItemModel;
    private final ItemState mState;

    public ItemLogic(ItemModel itemmodel, ItemState itemstate)
    {
        mItemModel = itemmodel;
        mState = itemstate;
    }

    private static void appendIfNotEmpty(StringBuilder stringbuilder, com.walmart.android.service.item.DescriptionModel.Description description)
    {
        if (description != null && description.hasText())
        {
            stringbuilder.append(description.getText());
        }
    }

    private static void appendIfNotEmpty(StringBuilder stringbuilder, CharSequence charsequence)
    {
        if (!TextUtils.isEmpty(charsequence))
        {
            stringbuilder.append(charsequence);
        }
    }

    public CharSequence getDetailedProductDescription()
    {
        DescriptionModel descriptionmodel = mItemModel.getDescriptionModel();
        StringBuilder stringbuilder = new StringBuilder();
        appendIfNotEmpty(stringbuilder, descriptionmodel.getProductInformation());
        appendIfNotEmpty(stringbuilder, descriptionmodel.getVideoGameInformation());
        appendIfNotEmpty(stringbuilder, descriptionmodel.getMovieInformation());
        appendIfNotEmpty(stringbuilder, descriptionmodel.getBookInformation());
        appendIfNotEmpty(stringbuilder, descriptionmodel.getAlbumInformation());
        boolean flag1 = false;
        boolean flag = flag1;
        if (stringbuilder.length() > 0)
        {
            flag = flag1;
            if (Html.fromHtml(stringbuilder.toString()).toString().trim().length() > 0)
            {
                flag = true;
            }
        }
        if (flag)
        {
            return stringbuilder;
        } else
        {
            return null;
        }
    }

    public ItemPrice getInStorePrice()
    {
        com.walmart.android.service.item.ItemPrice.Builder builder;
        ItemPrice itemprice;
        StoreAvailabilityData storeavailabilitydata;
        builder = new com.walmart.android.service.item.ItemPrice.Builder();
        itemprice = getOnlinePrice();
        storeavailabilitydata = mState.getStoreAvailabilityData();
        if (!itemprice.isSubmap()) goto _L2; else goto _L1
_L1:
        builder.submap(true).price(null);
_L4:
        return builder.build();
_L2:
        if (storeavailabilitydata != null)
        {
            builder.price(storeavailabilitydata.price);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String getItemAppUrl()
    {
        if (!TextUtils.isEmpty(mItemModel.getItemId()))
        {
            return (new StringBuilder()).append("walmart://ip/").append(mItemModel.getItemId()).toString();
        } else
        {
            return null;
        }
    }

    public String getItemWwwUrl()
    {
        String s = mItemModel.getUrlPath();
        if (!TextUtils.isEmpty(s))
        {
            return (new StringBuilder()).append("http://www.walmart.com").append(s).toString();
        } else
        {
            return null;
        }
    }

    public String getOnlineAvailabilityText(Resources resources)
    {
        if (!isAvailableOnline())
        {
            return resources.getString(0x7f09056e);
        } else
        {
            return null;
        }
    }

    public ItemPrice getOnlinePrice()
    {
        Object obj;
label0:
        {
            if (mState.isBundleItem())
            {
                int i = mState.getBundleOption().getPriceModifierInCents();
                Object obj1 = new com.walmart.android.service.item.ItemPrice.Builder();
                if (i != 0)
                {
                    obj = com.walmart.android.util.TextUtils.getPriceFromCents(i);
                } else
                {
                    obj = null;
                }
                obj = ((com.walmart.android.service.item.ItemPrice.Builder) (obj1)).price(((String) (obj))).build();
            } else
            if (mItemModel.hasVariants() && mState.hasSelectedVariant())
            {
                obj = mState.getSelectedVariantPrice();
            } else
            if (mState.getSelectedBuyingOption() != null)
            {
                obj = mState.getSelectedBuyingOption().getPrice();
            } else
            {
                obj = new ItemPrice();
            }
            obj1 = obj;
            if (((ItemPrice) (obj)).isSubmap())
            {
                if (!mState.isAddedToCart())
                {
                    break label0;
                }
                obj1 = ((ItemPrice) (obj)).buildUpon().submap(false).build();
            }
            return ((ItemPrice) (obj1));
        }
        return ((ItemPrice) (obj)).buildUpon().price(null).build();
    }

    public List getProductImageUrls()
    {
        Object obj = null;
        ArrayList arraylist = ((ArrayList) (obj));
        if (mItemModel.hasVariants())
        {
            arraylist = ((ArrayList) (obj));
            if (mState.hasSelectedVariant())
            {
                String s = mState.getSelectedVariantProductImageUrl();
                arraylist = ((ArrayList) (obj));
                if (!TextUtils.isEmpty(s))
                {
                    arraylist = new ArrayList();
                    arraylist.add(s);
                }
            }
        }
        obj = arraylist;
        if (arraylist == null)
        {
            obj = mItemModel.getProductImageUrls();
        }
        return ((List) (obj));
    }

    public FlagValue getResourceIdForFlag(com.walmart.android.service.item.ItemModel.PriceFlags priceflags)
    {
        static class _cls1
        {

            static final int $SwitchMap$com$walmart$android$service$item$ItemModel$PriceFlags[];

            static 
            {
                $SwitchMap$com$walmart$android$service$item$ItemModel$PriceFlags = new int[com.walmart.android.service.item.ItemModel.PriceFlags.values().length];
                try
                {
                    $SwitchMap$com$walmart$android$service$item$ItemModel$PriceFlags[com.walmart.android.service.item.ItemModel.PriceFlags.FREE_SHIPPING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$item$ItemModel$PriceFlags[com.walmart.android.service.item.ItemModel.PriceFlags.ROLLBACK.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$item$ItemModel$PriceFlags[com.walmart.android.service.item.ItemModel.PriceFlags.REDUCED_PRICE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$item$ItemModel$PriceFlags[com.walmart.android.service.item.ItemModel.PriceFlags.CLEARANCE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$item$ItemModel$PriceFlags[com.walmart.android.service.item.ItemModel.PriceFlags.DARE_TO_COMPARE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$item$ItemModel$PriceFlags[com.walmart.android.service.item.ItemModel.PriceFlags.SAME_DAY_DELIVERY.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$item$ItemModel$PriceFlags[com.walmart.android.service.item.ItemModel.PriceFlags.COMING_SOON.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$item$ItemModel$PriceFlags[com.walmart.android.service.item.ItemModel.PriceFlags.EXCLUSIVE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$item$ItemModel$PriceFlags[com.walmart.android.service.item.ItemModel.PriceFlags.PERSONALIZE_IT.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$item$ItemModel$PriceFlags[com.walmart.android.service.item.ItemModel.PriceFlags.SPECIAL_BUY.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$item$ItemModel$PriceFlags[com.walmart.android.service.item.ItemModel.PriceFlags.SAVE_ON_SHIPPING.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$item$ItemModel$PriceFlags[com.walmart.android.service.item.ItemModel.PriceFlags.REBATE_AVAILABLE.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$item$ItemModel$PriceFlags[com.walmart.android.service.item.ItemModel.PriceFlags.AS_ADVERTISED.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$item$ItemModel$PriceFlags[com.walmart.android.service.item.ItemModel.PriceFlags.AWARD_WINNING.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$item$ItemModel$PriceFlags[com.walmart.android.service.item.ItemModel.PriceFlags.NEW.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$item$ItemModel$PriceFlags[com.walmart.android.service.item.ItemModel.PriceFlags.NEW_ITEM.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$item$ItemModel$PriceFlags[com.walmart.android.service.item.ItemModel.PriceFlags.CERTIFIED_ITEM.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$walmart$android$service$item$ItemModel$PriceFlags[com.walmart.android.service.item.ItemModel.PriceFlags.AS_SEEN_ON_TV.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.walmart.android.service.item.ItemModel.PriceFlags[priceflags.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return new FlagValue(0x7f0201bf, 0x7f090183);

        case 2: // '\002'
            return new FlagValue(0x7f0201bf, 0x7f090189);

        case 3: // '\003'
            return new FlagValue(0x7f0201bf, 0x7f090188);

        case 4: // '\004'
            return new FlagValue(0x7f0201bf, 0x7f09017f);

        case 5: // '\005'
            return new FlagValue(0x7f0201c0, 0x7f090181);

        case 6: // '\006'
            return new FlagValue(0x7f0201bf, 0x7f09018a);

        case 7: // '\007'
            return new FlagValue(0x7f0201bf, 0x7f090180);

        case 8: // '\b'
            return new FlagValue(0x7f0201bf, 0x7f090182);

        case 9: // '\t'
            return new FlagValue(0x7f0201c0, 0x7f090186);

        case 10: // '\n'
            return new FlagValue(0x7f0201c0, 0x7f09018c);

        case 11: // '\013'
            return new FlagValue(0x7f0201bf, 0x7f09018b);

        case 12: // '\f'
            return new FlagValue(0x7f0201bf, 0x7f090187);

        case 13: // '\r'
            return new FlagValue(0x7f0201c1, 0x7f09017b);

        case 14: // '\016'
            return new FlagValue(0x7f0201c1, 0x7f09017d);

        case 15: // '\017'
            return new FlagValue(0x7f0201c1, 0x7f090184);

        case 16: // '\020'
            return new FlagValue(0x7f0201c1, 0x7f090185);

        case 17: // '\021'
            return new FlagValue(0x7f0201c0, 0x7f09017e);

        case 18: // '\022'
            return new FlagValue(0x7f0201c0, 0x7f09017c);
        }
    }

    public String getSelectedItemId()
    {
label0:
        {
            String s = mItemModel.getItemId();
            if (mItemModel.hasVariants())
            {
                if (!mState.hasSelectedVariant())
                {
                    break label0;
                }
                s = mState.getSelectedItemId();
            }
            return s;
        }
        return null;
    }

    public CharSequence getShippingMessage(Activity activity)
    {
        BuyingOptionModel buyingoptionmodel = mState.getSelectedBuyingOption();
        if (buyingoptionmodel == null)
        {
            return "";
        }
        if (buyingoptionmodel.isShippingPassEligible() && Services.get().getAuthentication().isShippingPassMember())
        {
            return ShippingPassUtil.getShippingPassImageText(activity, 0x7f090566);
        }
        if (buyingoptionmodel.isFreight())
        {
            return activity.getString(0x7f09018f);
        }
        if (buyingoptionmodel.hasFreeShipping())
        {
            return activity.getString(0x7f09018d);
        }
        if (buyingoptionmodel.hasFreeShippingThreshold())
        {
            return activity.getString(0x7f09018e, new Object[] {
                buyingoptionmodel.getFreeShippingThresholdPrice()
            });
        } else
        {
            return activity.getString(0x7f090570);
        }
    }

    public CharSequence getShortProductDescription()
    {
        Object obj1 = mItemModel.getDescriptionModel();
        CharSequence charsequence = ((DescriptionModel) (obj1)).getShortDescription();
        Object obj = ((DescriptionModel) (obj1)).getLongDescription();
        CharSequence charsequence1 = ((DescriptionModel) (obj1)).getProductInformationShort();
        obj1 = ((DescriptionModel) (obj1)).getProductInformation();
        if (!TextUtils.isEmpty(charsequence))
        {
            return charsequence;
        }
        if (!TextUtils.isEmpty(charsequence1))
        {
            return charsequence1;
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            return ((CharSequence) (obj1));
        }
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = "";
        }
        return ((CharSequence) (obj));
    }

    public StoreItemModel getStoreItemModelForStore(String s)
    {
label0:
        {
            if (TextUtils.isEmpty(s))
            {
                break label0;
            }
            Iterator iterator = mItemModel.getBuyingOptions().iterator();
            BuyingOptionModel buyingoptionmodel;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                buyingoptionmodel = (BuyingOptionModel)iterator.next();
            } while (!buyingoptionmodel.isWalmart());
            return buyingoptionmodel.getStoreItemModel(s);
        }
        return null;
    }

    public boolean isAvailableForCart()
    {
        return isAvailableOnline() && mState.getSelectedBuyingOption() != null && !mState.getSelectedBuyingOption().isPureStoreOnlyItem();
    }

    public boolean isAvailableOnline()
    {
        BuyingOptionModel buyingoptionmodel = mState.getSelectedBuyingOption();
        return buyingoptionmodel != null && buyingoptionmodel.isAvailable();
    }

    public boolean isEligibleForCart()
    {
        return mItemModel.isEligibleForCart();
    }

    public boolean isPickupOnly()
    {
        return (mItemModel.isPickupTodayEligible() || mItemModel.isShipToStoreEligible()) && !isShippable();
    }

    public boolean isPreorder()
    {
        BuyingOptionModel buyingoptionmodel = mState.getSelectedBuyingOption();
        return buyingoptionmodel != null && buyingoptionmodel.isPreorder();
    }

    public boolean isShippable()
    {
        BuyingOptionModel buyingoptionmodel = mState.getSelectedBuyingOption();
        return buyingoptionmodel != null && !buyingoptionmodel.isPureStoreOnlyItem() && !buyingoptionmodel.isStoreOnlyItem() && !mItemModel.isElectronicShipping() && isAvailableOnline() && (!buyingoptionmodel.isWalmart() || buyingoptionmodel.isShippable());
    }

    public boolean isValidForRegistry(Activity activity)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        if (!TextUtils.isEmpty(mItemModel.getUpc()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = RegistryStatus.get(activity).equals(RegistryStatus.ENABLED);
        flag2 = mItemModel.isGrouping();
        flag3 = mState.isBundleItem();
        flag4 = mItemModel.isPersonalized();
        return flag1 && !flag2 && flag && !flag3 && !flag4;
    }

    public boolean shouldHideOnlineSection()
    {
        BuyingOptionModel buyingoptionmodel = mState.getSelectedBuyingOption();
        return buyingoptionmodel == null || buyingoptionmodel.isWalmart() && buyingoptionmodel.isPureStoreOnlyItem();
    }

    public boolean shouldShowStoreSection()
    {
        return !mItemModel.isElectronicGiftCard() && !mItemModel.isPhysicalGiftCard() && !mItemModel.isGrouping() && !TextUtils.isEmpty(mItemModel.getUpc());
    }

}
