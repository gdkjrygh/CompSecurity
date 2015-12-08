// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.ArrayUtils;

// Referenced classes of package com.walmart.android.service.item:
//            ItemDataConverter, ItemResponse

private static class mDescriptionModel extends mDescriptionModel
{

    public (ItemResponse itemresponse)
    {
         ;
         = null;
        Object obj = null;
        if (itemresponse != null)
        {
             3;
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
                 = (() (obj)).;
            } else
            {
                 = itemresponse.product;
            }
        }
        if ( == null) goto _L2; else goto _L1
_L1:
        mProductId = .mProductId;
        mIsGrouping = "BUNDLE".equals(.mIsGrouping);
        boolean flag;
        if (obj != null && "CHOICE_BUNDLE".equals(((mIsGrouping) (obj)).mIsGrouping))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsConfigurableBundle = flag;
        if (obj != null && "NON_CONFIG".equals(((mIsConfigurableBundle) (obj)).mIsConfigurableBundle))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsNonConfigurableBundle = flag;
        mItemId = .mItemId;
        if ("VARIANT".equals(.mItemId) && .mItemId != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mHasVariants = flag;
        mIsElectronicGiftCard = "31".equals(.mIsElectronicGiftCard);
        mIsPhysicalGiftCard = "48".equals(.mIsPhysicalGiftCard);
        mProductName = .mProductName;
        if (.mProductName != null)
        {
            obj = .mProductName;
            k = obj.length;
            for (i = 0; i < k; i++)
            {
                3 = obj[i];
                if (!TextUtils.isEmpty(3.mProductName.mProductName))
                {
                    mProductImageUrls.add(3.mProductImageUrls.mProductImageUrls);
                }
                if (mThumbnailImage == null && !TextUtils.isEmpty(3.mThumbnailImage.mThumbnailImage))
                {
                    mThumbnailImage = 3.mThumbnailImage.mThumbnailImage;
                }
            }

        }
        mUrlPath = .mUrlPath;
        mUpc = .mUpc;
        if (.mUpc != null)
        {
             1 = new mUpc();
            1.mUpc = .mUpc.mUpc;
            1.mUpc = new HashMap();
            1.mUpc.put(Integer.valueOf(5), Integer.valueOf(.mUpc.mUpc));
            1.mUpc.put(Integer.valueOf(4), Integer.valueOf(.mUpc.mUpc));
            1.mUpc.put(Integer.valueOf(3), Integer.valueOf(.mUpc.mUpc));
            1.mUpc.put(Integer.valueOf(2), Integer.valueOf(.mUpc.mUpc));
            1.mUpc.put(Integer.valueOf(1), Integer.valueOf(.mUpc.mUpc));
            1.mUpc = .mUpc.mUpc;
            1.mUpc = .mUpc.mUpc;
            mReviewData = 1.mReviewData();
        }
        if (.mReviewData == null) goto _L2; else goto _L3
_L3:
         2;
        int j;
        boolean flag1;
         4;
         5;
         a1[];
        int l;
        if (.mReviewData.mReviewData != null && .mReviewData.ponents != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        mIsInflexibleKit = flag1;
        2 = null;
        4 = 2;
        if (.mIsInflexibleKit.mIsInflexibleKit != null)
        {
            4 = 2;
            if (.mIsInflexibleKit.mIsInflexibleKit.d == 0)
            {
                4 = .d;
            }
        }
        a1 = .d.d;
        2 = 4;
        if (4 != null) goto _L5; else goto _L4
_L4:
        2 = 4;
        if (ArrayUtils.isEmpty(a1)) goto _L5; else goto _L6
_L6:
        l = a1.length;
        j = 0;
_L10:
        2 = 4;
        if (j >= l) goto _L5; else goto _L7
_L7:
        2 = a1[j];
        if (2.d == null || 2.d.d != 0) goto _L8; else goto _L5
_L5:
        Object obj1;
        if (2 == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        mIsMarketPlaceOnlyItem = flag1;
        if (ArrayUtils.isEmpty(a1))
        {
            break; /* Loop/switch isn't completed */
        }
        if (a1[0].mIsMarketPlaceOnlyItem != null)
        {
            obj1 = Integer.toString(a1[0].mIsMarketPlaceOnlyItem.d);
        } else
        {
            obj1 = null;
        }
        mPrimarySellerId = ((String) (obj1));
        l = a1.length;
        for (j = 0; j < l; j++)
        {
            5 = a1[j];
            obj1 = 5;
            if (2 != null)
            {
                obj1 = 5;
                if (5.mPrimarySellerId.mPrimarySellerId.equals(2.mPrimarySellerId.mPrimarySellerId))
                {
                    obj1 = 2;
                }
            }
            mBuyingOptions.add(ItemDataConverter.buyingOptionModelFromBuyingOption(((tion) (obj1))));
        }

        break MISSING_BLOCK_LABEL_873;
_L8:
        j++;
        if (true) goto _L10; else goto _L9
_L9:
        Object obj2;
        int i1;
        boolean flag2;
        if (.tion.tion != null)
        {
            obj2 = Integer.toString(.tion.tion.d);
        } else
        {
            obj2 = null;
        }
        mPrimarySellerId = ((String) (obj2));
        mBuyingOptions.add(ItemDataConverter.buyingOptionModelFromBuyingOption(.tion, ));
        if (.tion.tion)
        {
            mPriceFlags.add(mPriceFlags);
        }
        if (.mPriceFlags.mPriceFlags)
        {
            mPriceFlags.add(mPriceFlags);
        }
        if (.mPriceFlags.mPriceFlags)
        {
            mPriceFlags.add(mPriceFlags);
        }
        if (.mPriceFlags.mPriceFlags)
        {
            mPriceFlags.add(mPriceFlags);
        }
        if (.mPriceFlags.mPriceFlags)
        {
            mPriceFlags.add(mPriceFlags);
        }
        if (.mPriceFlags.mPriceFlags)
        {
            mPriceFlags.add(mPriceFlags);
        }
        if (.mPriceFlags.mPriceFlags)
        {
            mPriceFlags.add(mPriceFlags);
        }
        if (.mPriceFlags.mPriceFlags)
        {
            mPriceFlags.add(mPriceFlags);
        }
        if (.mPriceFlags.mPriceFlags)
        {
            mPriceFlags.add(mPriceFlags);
        }
        flag2 = .mPriceFlags.mPriceFlags;
        mCanPickupToday = flag2;
        mIsPickupTodayEligible = flag2;
        if (.mIsPickupTodayEligible.ilable != null)
        {
            obj2 = .ilable.ilable;
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
        if (mCanPickupToday || 2 == null || 2.mCanPickupToday == null || 2.mCanPickupToday.length <= 0) goto _L12; else goto _L11
_L11:
         a[];
        int j1;
        a = 2.mCanPickupToday;
        j1 = a.length;
        j = 0;
_L17:
        if (j >= j1) goto _L12; else goto _L13
_L13:
         6 = a[j];
        if (!"PUT".equals(6.mCanPickupToday) || !"AVAILABLE".equals(6.vailability)) goto _L15; else goto _L14
_L14:
        mCanPickupToday = true;
_L12:
        if (2 != null && !2.mCanPickupToday)
        {
            mIsAvailableInSomeStore = true;
        }
        mShipToStoreDeliveryDateMessaging = null;
        mShipToHomeDeliveryDateMessaging = null;
        mPreorderMessage = null;
        mIsEligibleForCart = .mIsEligibleForCart.mIsEligibleForCart;
        boolean flag3;
        if (mBuyingOptions.size() != 1 || 2 == null || !2.mBuyingOptions)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        mIsEligibleToBuyOnline = flag3;
        mVariantsModel = ItemDataConverter.access$100(mHasVariants, itemresponse);
        mBundleModel = ItemDataConverter.bundleModelFromItemResponse(itemresponse);
        mDescriptionModel = ItemDataConverter.access$200(itemresponse);
_L2:
        return;
_L15:
        j++;
        if (true) goto _L17; else goto _L16
_L16:
    }
}
