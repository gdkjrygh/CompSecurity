// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmart.android.service.item:
//            VariantsModel, BuyingOptionModel, ItemPrice

public static class <init>
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

    public mProductImageUrl getValue(mProductImageUrl mproductimageurl)
    {
        return getValue(mproductimageurl.getId());
    }

    public getId getValue(String s)
    {
        for (Iterator iterator = mValues.iterator(); iterator.hasNext();)
        {
            getId getid = (mValues)iterator.next();
            if (._mth000(getid).equals(s))
            {
                return getid;
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
            mBuyingOptionModel mbuyingoptionmodel = (mBuyingOptionModel)collection.next();
            flag = false;
            Iterator iterator = mValues.iterator();
            while (iterator.hasNext()) 
            {
                if (((mValues)iterator.next()).(mbuyingoptionmodel))
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


    public (String s, BuyingOptionModel buyingoptionmodel, List list, String s1)
    {
        mItemId = s;
        mBuyingOptionModel = buyingoptionmodel;
        mValues = Collections.unmodifiableList(list);
        mProductImageUrl = s1;
    }

    public mProductImageUrl(String s, List list, String s1)
    {
        this(s, null, list, s1);
    }
}
