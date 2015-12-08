// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.walmart.android.service.item:
//            BuyingOptionModel, ItemPrice

public class VariantsModel
{
    public static class Value
        implements Comparable
    {

        private final String mName;
        private final int mRank;
        private final String mSwatchUrl;
        private String mType;

        public int compareTo(Value value)
        {
            return mRank - value.mRank;
        }

        public volatile int compareTo(Object obj)
        {
            return compareTo((Value)obj);
        }

        public boolean equals(Object obj)
        {
            if (this != obj) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Value)obj;
            if (!mName.equals(((Value) (obj)).mName))
            {
                return false;
            }
            if (mType == null) goto _L4; else goto _L3
_L3:
            if (mType.equals(((Value) (obj)).mType)) goto _L1; else goto _L5
_L5:
            return false;
_L4:
            if (((Value) (obj)).mType == null)
            {
                return true;
            }
            if (true) goto _L5; else goto _L6
_L6:
        }

        public String getName()
        {
            return mName;
        }

        public String getSwatchUrl()
        {
            return mSwatchUrl;
        }

        public String getType()
        {
            return mType;
        }

        public String getVariantTypeId()
        {
            return mType;
        }

        public int hashCode()
        {
            int j = mName.hashCode();
            int i;
            if (mType != null)
            {
                i = mType.hashCode();
            } else
            {
                i = 0;
            }
            return j * 31 + i;
        }

        void setType(String s)
        {
            mType = s;
        }

        public String toString()
        {
            return String.format(Locale.US, "%s/%s", new Object[] {
                mType, mName
            });
        }


        public Value(String s, int i, String s1)
        {
            this(null, s, i, s1);
        }

        public Value(String s, String s1, int i, String s2)
        {
            mType = s;
            mName = s1;
            mRank = i;
            mSwatchUrl = s2;
        }
    }

    public static class VariantItem
    {

        private BuyingOptionModel mBuyingOptionModel;
        private final String mItemId;
        private final String mProductImageUrl;
        private final List mValues;

        public BuyingOptionModel getBuyingOptionModel()
        {
            return mBuyingOptionModel;
        }

        public String getItemId()
        {
            return mItemId;
        }

        public ItemPrice getPrice()
        {
            if (mBuyingOptionModel != null)
            {
                return mBuyingOptionModel.getPrice();
            } else
            {
                return null;
            }
        }

        public String getProductImageUrl()
        {
            return mProductImageUrl;
        }

        public Value getValue(VariantType varianttype)
        {
            return getValue(varianttype.getId());
        }

        public Value getValue(String s)
        {
            for (Iterator iterator = mValues.iterator(); iterator.hasNext();)
            {
                Value value = (Value)iterator.next();
                if (value.mType.equals(s))
                {
                    return value;
                }
            }

            return null;
        }

        public Collection getValues()
        {
            return mValues;
        }

        public boolean hasBuyingOption()
        {
            return mBuyingOptionModel != null;
        }

        public boolean match(Collection collection)
        {
            boolean flag = true;
            for (collection = collection.iterator(); collection.hasNext() && flag;)
            {
                Value value = (Value)collection.next();
                flag = false;
                Iterator iterator = mValues.iterator();
                while (iterator.hasNext()) 
                {
                    if (((Value)iterator.next()).equals(value))
                    {
                        flag = true;
                    }
                }
            }

            return flag;
        }

        void updateBuyingOptionModel(BuyingOptionModel buyingoptionmodel)
        {
            mBuyingOptionModel = buyingoptionmodel;
        }


        public VariantItem(String s, BuyingOptionModel buyingoptionmodel, List list, String s1)
        {
            mItemId = s;
            mBuyingOptionModel = buyingoptionmodel;
            mValues = Collections.unmodifiableList(list);
            mProductImageUrl = s1;
        }

        public VariantItem(String s, List list, String s1)
        {
            this(s, null, list, s1);
        }
    }

    public static class VariantType
    {

        private final String mId;
        private final String mName;

        public String getId()
        {
            return mId;
        }

        public String getName()
        {
            return mName;
        }

        public VariantType(String s, String s1)
        {
            mId = s;
            mName = s1;
        }
    }


    private final List mItems;
    private final String mPrimaryItemId;
    private final List mVariantTypes;

    public VariantsModel()
    {
        mVariantTypes = Collections.emptyList();
        mItems = Collections.emptyList();
        mPrimaryItemId = null;
    }

    public VariantsModel(List list, List list1, String s)
    {
        mVariantTypes = Collections.unmodifiableList(list);
        mItems = Collections.unmodifiableList(list1);
        boolean flag = false;
        list = mItems.iterator();
        do
        {
            if (flag || !list.hasNext() || s == null)
            {
                break;
            }
            if (s.equals(((VariantItem)list.next()).getItemId()))
            {
                flag = true;
            }
        } while (true);
        if (flag)
        {
            mPrimaryItemId = s;
            return;
        }
        if (!mItems.isEmpty())
        {
            list = ((VariantItem)mItems.get(0)).getItemId();
        } else
        {
            list = null;
        }
        mPrimaryItemId = list;
    }

    public VariantItem getPrimaryVariantItem()
    {
        if (mPrimaryItemId != null)
        {
            return getVariantItemWithId(mPrimaryItemId);
        } else
        {
            return null;
        }
    }

    public List getVariantItemIds()
    {
        ArrayList arraylist = new ArrayList(mItems.size());
        for (Iterator iterator = getVariantItems().iterator(); iterator.hasNext(); arraylist.add(((VariantItem)iterator.next()).getItemId())) { }
        return arraylist;
    }

    public VariantItem getVariantItemWithId(String s)
    {
        Object obj = null;
        Iterator iterator = mItems.iterator();
        VariantItem variantitem;
        do
        {
            variantitem = obj;
            if (!iterator.hasNext())
            {
                break;
            }
            variantitem = (VariantItem)iterator.next();
        } while (!variantitem.mItemId.equals(s));
        return variantitem;
    }

    public List getVariantItems()
    {
        return mItems;
    }

    public int getVariantTypeCount()
    {
        return mVariantTypes.size();
    }

    public List getVariantTypes()
    {
        return mVariantTypes;
    }

    public boolean hasVariantItems()
    {
        return !mItems.isEmpty();
    }

    public void updateVariantBuyingOption(String s, BuyingOptionModel buyingoptionmodel)
    {
        s = getVariantItemWithId(s);
        if (s != null)
        {
            s.updateBuyingOptionModel(buyingoptionmodel);
        }
    }
}
