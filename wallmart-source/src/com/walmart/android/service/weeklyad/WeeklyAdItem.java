// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.weeklyad;

import android.text.TextUtils;
import android.util.Pair;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.walmart.android.service.weeklyad:
//            WeeklyAdWireItem

public class WeeklyAdItem
{

    private static final DateFormat API_DATE_FORMAT;
    private static final DateFormat DISPLAY_DATE_FORMAT;
    private String mCategory;
    private String mDescription;
    private String mDisclaimer;
    private String mDollarsOff;
    private List mFeatures;
    private String mImageUrl;
    private String mName;
    private String mOriginalPrice;
    private String mPercentOff;
    private String mPrice;
    private String mPricePrefix;
    private String mPriceRange;
    private String mPriceSuffix;
    private String mSaleStory;
    private List mSpecs;
    private String mValidFrom;
    private String mValidTo;

    public WeeklyAdItem()
    {
        mSpecs = new ArrayList();
        mFeatures = new ArrayList();
    }

    public static WeeklyAdItem from(WeeklyAdWireItem weeklyadwireitem)
    {
        boolean flag = false;
        WeeklyAdItem weeklyaditem = new WeeklyAdItem();
        weeklyaditem.setName(weeklyadwireitem.name);
        weeklyaditem.setDescription(weeklyadwireitem.description);
        weeklyaditem.setDisclaimer(weeklyadwireitem.disclaimer_text);
        weeklyaditem.setPrice(weeklyadwireitem.current_price);
        weeklyaditem.setPriceRange(weeklyadwireitem.current_price_range);
        weeklyaditem.setOriginalPrice(weeklyadwireitem.original_price);
        weeklyaditem.setImageUrl(weeklyadwireitem.image_url);
        weeklyaditem.setCategory(weeklyadwireitem.category);
        weeklyaditem.setDollarsOff(weeklyadwireitem.dollars_off);
        weeklyaditem.setPercentOff(weeklyadwireitem.percent_off);
        weeklyaditem.setPricePrefix(weeklyadwireitem.pre_price_text);
        weeklyaditem.setPriceSuffix(weeklyadwireitem.post_price_text);
        weeklyaditem.setSaleStory(weeklyadwireitem.sale_story);
        weeklyaditem.setValidFrom(weeklyadwireitem.valid_from);
        weeklyaditem.setValidTo(weeklyadwireitem.valid_to);
        if (weeklyadwireitem.specs != null && weeklyadwireitem.specs.length > 0)
        {
            ArrayList arraylist = new ArrayList();
            WeeklyAdWireItem.Spec aspec[] = weeklyadwireitem.specs;
            int k = aspec.length;
            for (int i = 0; i < k; i++)
            {
                WeeklyAdWireItem.Spec spec = aspec[i];
                if (!TextUtils.isEmpty(spec.name) && !TextUtils.isEmpty(spec.value))
                {
                    arraylist.add(new Pair(spec.name, spec.value));
                }
            }

            if (!arraylist.isEmpty())
            {
                weeklyaditem.setSpecs(arraylist);
            }
        }
        if (weeklyadwireitem.features != null && weeklyadwireitem.features.length > 0)
        {
            ArrayList arraylist1 = new ArrayList();
            weeklyadwireitem = weeklyadwireitem.features;
            int l = weeklyadwireitem.length;
            for (int j = ((flag) ? 1 : 0); j < l; j++)
            {
                Object obj = weeklyadwireitem[j];
                if (!TextUtils.isEmpty(((WeeklyAdWireItem.Feature) (obj)).text))
                {
                    arraylist1.add(((WeeklyAdWireItem.Feature) (obj)).text);
                }
            }

            if (!arraylist1.isEmpty())
            {
                weeklyaditem.setFeatures(arraylist1);
            }
        }
        return weeklyaditem;
    }

    public String getCategory()
    {
        return mCategory;
    }

    public String getDescription()
    {
        return mDescription;
    }

    public String getDisclaimer()
    {
        return mDisclaimer;
    }

    public String getDisplayPrice()
    {
        if (!TextUtils.isEmpty(getPriceRange()))
        {
            return getPriceRange();
        } else
        {
            return getPrice();
        }
    }

    public String getDollarsOff()
    {
        return mDollarsOff;
    }

    public List getFeatures()
    {
        if (mFeatures != null)
        {
            return mFeatures;
        } else
        {
            return new ArrayList();
        }
    }

    public String getImageUrl()
    {
        return mImageUrl;
    }

    public String getName()
    {
        return mName;
    }

    public String getOriginalPrice()
    {
        return mOriginalPrice;
    }

    public String getPercentOff()
    {
        return mPercentOff;
    }

    public String getPrice()
    {
        return mPrice;
    }

    public String getPricePrefix()
    {
        return mPricePrefix;
    }

    public String getPriceRange()
    {
        return mPriceRange;
    }

    public String getPriceSuffix()
    {
        return mPriceSuffix;
    }

    public String getSaleStory()
    {
        return mSaleStory;
    }

    public List getSpecs()
    {
        if (mSpecs != null)
        {
            return mSpecs;
        } else
        {
            return new ArrayList();
        }
    }

    public String getValidFrom()
    {
        return mValidFrom;
    }

    public String getValidTo()
    {
        return mValidTo;
    }

    public String getValidityPeriodDisplayString()
    {
        Object obj = null;
        String s = obj;
        if (!TextUtils.isEmpty(getValidFrom()))
        {
            s = obj;
            if (!TextUtils.isEmpty(getValidTo()))
            {
                try
                {
                    s = DISPLAY_DATE_FORMAT.format(API_DATE_FORMAT.parse(getValidFrom()));
                    String s1 = DISPLAY_DATE_FORMAT.format(API_DATE_FORMAT.parse(getValidTo()));
                    s = (new StringBuilder()).append(s).append(" - ").append(s1).toString();
                }
                catch (Exception exception)
                {
                    return null;
                }
            }
        }
        return s;
    }

    void setCategory(String s)
    {
        mCategory = s;
    }

    void setDescription(String s)
    {
        mDescription = s;
    }

    void setDisclaimer(String s)
    {
        mDisclaimer = s;
    }

    void setDollarsOff(String s)
    {
        mDollarsOff = s;
    }

    void setFeatures(List list)
    {
        mFeatures = list;
    }

    void setImageUrl(String s)
    {
        mImageUrl = s;
    }

    void setName(String s)
    {
        mName = s;
    }

    void setOriginalPrice(String s)
    {
        mOriginalPrice = s;
    }

    void setPercentOff(String s)
    {
        mPercentOff = s;
    }

    void setPrice(String s)
    {
        mPrice = s;
    }

    void setPricePrefix(String s)
    {
        mPricePrefix = s;
    }

    void setPriceRange(String s)
    {
        mPriceRange = s;
    }

    void setPriceSuffix(String s)
    {
        mPriceSuffix = s;
    }

    void setSaleStory(String s)
    {
        mSaleStory = s;
    }

    void setSpecs(List list)
    {
        mSpecs = list;
    }

    void setValidFrom(String s)
    {
        mValidFrom = s;
    }

    void setValidTo(String s)
    {
        mValidTo = s;
    }

    static 
    {
        API_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        DISPLAY_DATE_FORMAT = new SimpleDateFormat("MMM d, yyyy", Locale.US);
    }
}
