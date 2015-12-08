// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.wishlist.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.walmart.android.service.wishlist.ListItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ListItemModel
{
    public static final class BundleComponent
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public BundleComponent createFromParcel(Parcel parcel)
            {
                return new BundleComponent(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public BundleComponent[] newArray(int i)
            {
                return new BundleComponent[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        private final String mImageUrl;
        private final String mName;
        private final String mOfferId;
        private final int mQuantity;

        public int describeContents()
        {
            return 0;
        }

        public String getImageUrl()
        {
            return mImageUrl;
        }

        public String getName()
        {
            return mName;
        }

        public String getOfferId()
        {
            return mOfferId;
        }

        public int getQuantity()
        {
            return mQuantity;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(mName);
            parcel.writeString(mImageUrl);
            parcel.writeString(mOfferId);
            parcel.writeInt(mQuantity);
        }


        private BundleComponent(Parcel parcel)
        {
            mName = parcel.readString();
            mImageUrl = parcel.readString();
            mOfferId = parcel.readString();
            mQuantity = parcel.readInt();
        }


        private BundleComponent(String s, String s1, String s2, int i)
        {
            mName = s;
            mImageUrl = s1;
            mOfferId = s2;
            mQuantity = i;
        }

    }

    public static final class Flag extends Enum
    {

        private static final Flag $VALUES[];
        public static final Flag BEST_SELLER;
        public static final Flag CLEARANCE;
        public static final Flag NEW;
        public static final Flag ROLLBACK;
        public static final Flag SPECIAL_BUY;
        public static final Flag WALMART_ONLY;

        public static Flag valueOf(String s)
        {
            return (Flag)Enum.valueOf(com/walmart/android/service/wishlist/models/ListItemModel$Flag, s);
        }

        public static Flag[] values()
        {
            return (Flag[])$VALUES.clone();
        }

        static 
        {
            ROLLBACK = new Flag("ROLLBACK", 0);
            CLEARANCE = new Flag("CLEARANCE", 1);
            WALMART_ONLY = new Flag("WALMART_ONLY", 2);
            SPECIAL_BUY = new Flag("SPECIAL_BUY", 3);
            NEW = new Flag("NEW", 4);
            BEST_SELLER = new Flag("BEST_SELLER", 5);
            $VALUES = (new Flag[] {
                ROLLBACK, CLEARANCE, WALMART_ONLY, SPECIAL_BUY, NEW, BEST_SELLER
            });
        }

        private Flag(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class OfferType extends Enum
    {

        private static final OfferType $VALUES[];
        public static final OfferType ONLINE_AND_STORE;
        public static final OfferType ONLINE_ONLY;
        public static final OfferType STORE_ONLY;
        private final String mOfferType;

        public static OfferType from(String s)
        {
            OfferType aoffertype[] = values();
            int j = aoffertype.length;
            for (int i = 0; i < j; i++)
            {
                OfferType offertype = aoffertype[i];
                if (offertype.mOfferType.equalsIgnoreCase(s))
                {
                    return offertype;
                }
            }

            return STORE_ONLY;
        }

        public static OfferType valueOf(String s)
        {
            return (OfferType)Enum.valueOf(com/walmart/android/service/wishlist/models/ListItemModel$OfferType, s);
        }

        public static OfferType[] values()
        {
            return (OfferType[])$VALUES.clone();
        }

        static 
        {
            STORE_ONLY = new OfferType("STORE_ONLY", 0, "Store only");
            ONLINE_ONLY = new OfferType("ONLINE_ONLY", 1, "Online only");
            ONLINE_AND_STORE = new OfferType("ONLINE_AND_STORE", 2, "Online and store");
            $VALUES = (new OfferType[] {
                STORE_ONLY, ONLINE_ONLY, ONLINE_AND_STORE
            });
        }

        private OfferType(String s, int i, String s1)
        {
            super(s, i);
            mOfferType = s1;
        }
    }

    public static final class Variant
    {

        private final String mName;
        private final String mValue;

        public String getName()
        {
            return mName;
        }

        public String getValue()
        {
            return mValue;
        }

        Variant(String s, String s1)
        {
            mName = s;
            mValue = s1;
        }
    }


    private final List mBundleComponents;
    private final String mGroupId;
    private final int mHasQuantity;
    private final boolean mHasSubmapPrice;
    private final String mId;
    private final String mImageUrl;
    private final boolean mIsAvailable;
    private final boolean mIsPreorder;
    private final boolean mIsShippingPassEligible;
    private final String mListId;
    private final String mListType;
    private final String mName;
    private final String mOfferId;
    private final OfferType mOfferType;
    private final String mPrice;
    private final Flag mPrimaryFlag;
    private final double mRating;
    private final int mRatingCount;
    private final String mReceiptPrice;
    private final int mReceiptQuantity;
    private final String mUsItemId;
    private final List mVariants;
    private final int mWantsQuantity;

    public ListItemModel(ListItem listitem)
    {
        mId = listitem.id;
        mName = listitem.name;
        mRatingCount = extractRatingCount(listitem);
        mRating = extractRating(listitem);
        mWantsQuantity = extractWants(listitem);
        mHasQuantity = extractHas(listitem);
        mReceiptQuantity = extractReceiptQuantity(listitem);
        mPrice = extractPrice(listitem);
        mReceiptPrice = extractReceiptPrice(listitem);
        mIsAvailable = listitem.available;
        mOfferType = OfferType.from(listitem.offerType);
        mUsItemId = listitem.usItemId;
        mOfferId = listitem.offerId;
        mImageUrl = extractImageUrl(listitem);
        mIsPreorder = listitem.preOrder;
        mListId = listitem.listId;
        mListType = listitem.listType;
        mHasSubmapPrice = extractHasSubmapPrice(listitem);
        mPrimaryFlag = extractPrimaryFlag(listitem);
        mVariants = extractVariants(listitem);
        mGroupId = listitem.groupId;
        mBundleComponents = extractBundleComponents(listitem);
        mIsShippingPassEligible = listitem.shippingPass;
    }

    private List extractBundleComponents(ListItem listitem)
    {
        if (listitem.bundle != null && listitem.bundle.length > 0)
        {
            ArrayList arraylist = new ArrayList(listitem.bundle.length);
            listitem = listitem.bundle;
            int j = listitem.length;
            for (int i = 0; i < j; i++)
            {
                Object obj = listitem[i];
                String s = validateImageUrl(((com.walmart.android.service.wishlist.ListItem.BundleComponent) (obj)).imageUrl);
                arraylist.add(new BundleComponent(((com.walmart.android.service.wishlist.ListItem.BundleComponent) (obj)).name, s, ((com.walmart.android.service.wishlist.ListItem.BundleComponent) (obj)).offerId, ((com.walmart.android.service.wishlist.ListItem.BundleComponent) (obj)).quantity));
            }

            return Collections.unmodifiableList(arraylist);
        } else
        {
            return Collections.emptyList();
        }
    }

    private int extractHas(ListItem listitem)
    {
        if (listitem.quantity != null)
        {
            return listitem.quantity.received;
        } else
        {
            return 0;
        }
    }

    private boolean extractHasSubmapPrice(ListItem listitem)
    {
        return listitem.price != null && listitem.price.hidden;
    }

    private String extractImageUrl(ListItem listitem)
    {
        return validateImageUrl(listitem.imageUrl);
    }

    private String extractPrice(ListItem listitem)
    {
        if (listitem.price != null && !TextUtils.isEmpty(listitem.price.current))
        {
            return listitem.price.current;
        } else
        {
            return null;
        }
    }

    private Flag extractPrimaryFlag(ListItem listitem)
    {
        String s;
        if (listitem.price != null)
        {
            s = listitem.price.type;
        } else
        {
            s = "";
        }
        if ("ROLLBACK".equals(s))
        {
            return Flag.ROLLBACK;
        }
        if ("CLEARANCE".equals(s))
        {
            return Flag.CLEARANCE;
        }
        if (listitem.walmartOnly)
        {
            return Flag.WALMART_ONLY;
        }
        if (listitem.specialBuy)
        {
            return Flag.SPECIAL_BUY;
        }
        if (listitem.isNew)
        {
            return Flag.NEW;
        }
        if ("BESTSELLER".equals(s))
        {
            return Flag.BEST_SELLER;
        } else
        {
            return null;
        }
    }

    private double extractRating(ListItem listitem)
    {
        double d;
        double d1;
        d1 = 0.0D;
        d = d1;
        if (listitem.rating != null)
        {
            d = d1;
            try
            {
                if (!TextUtils.isEmpty(listitem.rating.average))
                {
                    d = Double.valueOf(listitem.rating.average).doubleValue();
                }
            }
            // Misplaced declaration of an exception variable
            catch (ListItem listitem)
            {
                return 0.0D;
            }
        }
        return d;
    }

    private int extractRatingCount(ListItem listitem)
    {
        int i;
        boolean flag;
        flag = false;
        i = ((flag) ? 1 : 0);
        if (listitem.rating != null)
        {
            i = ((flag) ? 1 : 0);
            try
            {
                if (!TextUtils.isEmpty(listitem.rating.count))
                {
                    i = Integer.valueOf(listitem.rating.count).intValue();
                }
            }
            // Misplaced declaration of an exception variable
            catch (ListItem listitem)
            {
                return 0;
            }
        }
        return i;
    }

    private String extractReceiptPrice(ListItem listitem)
    {
        if (listitem.price != null && !TextUtils.isEmpty(listitem.price.receiptPrice))
        {
            return listitem.price.receiptPrice;
        } else
        {
            return null;
        }
    }

    private int extractReceiptQuantity(ListItem listitem)
    {
        if (listitem.quantity != null)
        {
            return listitem.quantity.receiptQuantity;
        } else
        {
            return 0;
        }
    }

    private List extractVariants(ListItem listitem)
    {
        if (listitem.variantAttributes != null && listitem.variantAttributes.length > 0)
        {
            ArrayList arraylist = new ArrayList(listitem.variantAttributes.length);
            listitem = listitem.variantAttributes;
            int j = listitem.length;
            for (int i = 0; i < j; i++)
            {
                Object obj = listitem[i];
                if (!TextUtils.isEmpty(((com.walmart.android.service.wishlist.ListItem.VariantAttribute) (obj)).name) && !TextUtils.isEmpty(((com.walmart.android.service.wishlist.ListItem.VariantAttribute) (obj)).value))
                {
                    arraylist.add(new Variant(((com.walmart.android.service.wishlist.ListItem.VariantAttribute) (obj)).name, ((com.walmart.android.service.wishlist.ListItem.VariantAttribute) (obj)).value));
                }
            }

            return Collections.unmodifiableList(arraylist);
        } else
        {
            return Collections.emptyList();
        }
    }

    private int extractWants(ListItem listitem)
    {
        if (listitem.quantity != null)
        {
            return listitem.quantity.requested;
        } else
        {
            return 0;
        }
    }

    static String validateImageUrl(String s)
    {
label0:
        {
            String s1;
label1:
            {
                if (TextUtils.isEmpty(s))
                {
                    break label0;
                }
                if (s.startsWith("http:"))
                {
                    s1 = s;
                    if (s.startsWith("https:"))
                    {
                        break label1;
                    }
                }
                s1 = (new StringBuilder()).append("https:").append(s).toString();
            }
            return s1;
        }
        return null;
    }

    public boolean canAddToCart()
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (mIsAvailable && (mOfferType == OfferType.ONLINE_AND_STORE || mOfferType == OfferType.ONLINE_ONLY))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!TextUtils.isEmpty(mName))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!TextUtils.isEmpty(mOfferId))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (!TextUtils.isEmpty(mGroupId) && isBundle())
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        return !isFullFilled() && flag && flag1 && (flag2 || flag3);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ListItemModel)obj;
            if (!mId.equals(((ListItemModel) (obj)).mId) || !mListId.equals(((ListItemModel) (obj)).mListId) || !mListType.equals(((ListItemModel) (obj)).mListType))
            {
                return false;
            }
        }
        return true;
    }

    public List getBundleComponents()
    {
        return mBundleComponents;
    }

    public String getGroupId()
    {
        return mGroupId;
    }

    public int getHasQuantity()
    {
        return mHasQuantity;
    }

    public String getId()
    {
        return mId;
    }

    public String getImageUrl()
    {
        return mImageUrl;
    }

    public String getListId()
    {
        return mListId;
    }

    public String getListType()
    {
        return mListType;
    }

    public String getName()
    {
        return mName;
    }

    public String getOfferId()
    {
        return mOfferId;
    }

    public OfferType getOfferType()
    {
        return mOfferType;
    }

    public String getPrice()
    {
        return mPrice;
    }

    public Flag getPrimaryFlag()
    {
        return mPrimaryFlag;
    }

    public double getRating()
    {
        return mRating;
    }

    public String getReceiptPrice()
    {
        return mReceiptPrice;
    }

    public int getReceiptQuantity()
    {
        return mReceiptQuantity;
    }

    public String getUsItemId()
    {
        return mUsItemId;
    }

    public List getVariants()
    {
        return mVariants;
    }

    public int getWantsQuantity()
    {
        return mWantsQuantity;
    }

    public boolean hasPrice()
    {
        return mPrice != null;
    }

    public boolean hasPrimaryFlag()
    {
        return mPrimaryFlag != null;
    }

    public boolean hasRating()
    {
        return mRatingCount > 0;
    }

    public boolean hasSubmapPrice()
    {
        return mHasSubmapPrice;
    }

    public boolean hasVariants()
    {
        return !mVariants.isEmpty();
    }

    public int hashCode()
    {
        return (mId.hashCode() * 31 + mListId.hashCode()) * 31 + mListType.hashCode();
    }

    public boolean isAvailable()
    {
        return mIsAvailable;
    }

    public boolean isBundle()
    {
        return !mBundleComponents.isEmpty();
    }

    public boolean isFullFilled()
    {
        return mWantsQuantity > 0 && mHasQuantity >= mWantsQuantity;
    }

    public boolean isPreorder()
    {
        return mIsPreorder;
    }

    public boolean isShippingPassEligible()
    {
        return false;
    }
}
