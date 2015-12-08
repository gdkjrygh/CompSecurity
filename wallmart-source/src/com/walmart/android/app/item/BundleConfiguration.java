// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import com.walmart.android.service.item.BundleModel;
import com.walmart.android.service.item.BuyingOptionModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BundleConfiguration
{
    public static class BundleGroupConfiguration
    {

        private final com.walmart.android.service.item.BundleModel.BundleGroup mBundleGroup;
        private Map mOptionVariantItemMap;
        private Map mOptionVariantTypeMap;
        private final List mSelections = new ArrayList();

        public boolean canMakeAdditionalSelections()
        {
            return mSelections.size() < mBundleGroup.getMaximumSelectionsAllowed();
        }

        public boolean canSelectionBeReplaced()
        {
            return mBundleGroup.getMaximumSelectionsAllowed() == 1;
        }

        public void deselect(com.walmart.android.service.item.BundleModel.GroupOption groupoption)
        {
            mSelections.remove(groupoption);
            mOptionVariantTypeMap.remove(groupoption);
            mOptionVariantItemMap.remove(groupoption);
        }

        public com.walmart.android.service.item.BundleModel.BundleGroup getBundleGroup()
        {
            return mBundleGroup;
        }

        public String getOfferId(com.walmart.android.service.item.BundleModel.GroupOption groupoption)
        {
            com.walmart.android.service.item.VariantsModel.VariantItem variantitem = (com.walmart.android.service.item.VariantsModel.VariantItem)mOptionVariantItemMap.get(groupoption);
            if (variantitem != null && variantitem.getBuyingOptionModel() != null)
            {
                return variantitem.getBuyingOptionModel().getOfferId();
            } else
            {
                return groupoption.getOfferId();
            }
        }

        public List getSelectedOptions()
        {
            return Collections.unmodifiableList(mSelections);
        }

        public com.walmart.android.service.item.VariantsModel.VariantItem getSelectedVariantItem(com.walmart.android.service.item.BundleModel.GroupOption groupoption)
        {
            return (com.walmart.android.service.item.VariantsModel.VariantItem)mOptionVariantItemMap.get(groupoption);
        }

        public List getSelectedVariantTypes(com.walmart.android.service.item.BundleModel.GroupOption groupoption)
        {
            return (List)mOptionVariantTypeMap.get(groupoption);
        }

        public int getTotalAdditionalPriceInCents()
        {
            int i = 0;
            for (Iterator iterator = mSelections.iterator(); iterator.hasNext();)
            {
                i += ((com.walmart.android.service.item.BundleModel.GroupOption)iterator.next()).getPriceModifierInCents();
            }

            return i;
        }

        public boolean hasMadeAnySelections()
        {
            return !mSelections.isEmpty();
        }

        public boolean hasMadeRequiredSelections()
        {
            return mSelections.size() >= mBundleGroup.getMinimumSelectionsRequired();
        }

        public boolean isSelected(com.walmart.android.service.item.BundleModel.GroupOption groupoption)
        {
            return mSelections.contains(groupoption);
        }

        public boolean isVariantSelected(com.walmart.android.service.item.BundleModel.GroupOption groupoption, String s)
        {
            return mOptionVariantItemMap.containsKey(groupoption) && ((com.walmart.android.service.item.VariantsModel.VariantItem)mOptionVariantItemMap.get(groupoption)).getItemId().equals(s);
        }

        public void replace(com.walmart.android.service.item.BundleModel.GroupOption groupoption)
        {
            mSelections.clear();
            select(groupoption);
        }

        public void replace(com.walmart.android.service.item.BundleModel.GroupOption groupoption, List list, com.walmart.android.service.item.VariantsModel.VariantItem variantitem)
        {
            mSelections.clear();
            select(groupoption, list, variantitem);
        }

        public void select(com.walmart.android.service.item.BundleModel.GroupOption groupoption)
        {
            mSelections.add(groupoption);
        }

        public void select(com.walmart.android.service.item.BundleModel.GroupOption groupoption, List list, com.walmart.android.service.item.VariantsModel.VariantItem variantitem)
        {
            select(groupoption);
            mOptionVariantTypeMap.put(groupoption, Collections.unmodifiableList(list));
            mOptionVariantItemMap.put(groupoption, variantitem);
        }

        public BundleGroupConfiguration(com.walmart.android.service.item.BundleModel.BundleGroup bundlegroup)
        {
            mOptionVariantTypeMap = new HashMap();
            mOptionVariantItemMap = new HashMap();
            mBundleGroup = bundlegroup;
        }
    }


    private final List mOptionalConfigurations;
    private final List mRequiredConfigurations;
    private final List mStandardConfigurations;

    public BundleConfiguration(BundleModel bundlemodel)
    {
        ArrayList arraylist = new ArrayList();
        BundleGroupConfiguration bundlegroupconfiguration;
        for (Iterator iterator = bundlemodel.getStandardGroups().iterator(); iterator.hasNext(); arraylist.add(bundlegroupconfiguration))
        {
            Object obj = (com.walmart.android.service.item.BundleModel.BundleGroup)iterator.next();
            bundlegroupconfiguration = new BundleGroupConfiguration(((com.walmart.android.service.item.BundleModel.BundleGroup) (obj)));
            for (obj = ((com.walmart.android.service.item.BundleModel.BundleGroup) (obj)).getOptions().iterator(); ((Iterator) (obj)).hasNext(); bundlegroupconfiguration.select((com.walmart.android.service.item.BundleModel.GroupOption)((Iterator) (obj)).next())) { }
        }

        ArrayList arraylist1 = new ArrayList();
        for (Iterator iterator1 = bundlemodel.getRequiredGroups().iterator(); iterator1.hasNext(); arraylist1.add(new BundleGroupConfiguration((com.walmart.android.service.item.BundleModel.BundleGroup)iterator1.next()))) { }
        ArrayList arraylist2 = new ArrayList();
        for (bundlemodel = bundlemodel.getOptionalGroups().iterator(); bundlemodel.hasNext(); arraylist2.add(new BundleGroupConfiguration((com.walmart.android.service.item.BundleModel.BundleGroup)bundlemodel.next()))) { }
        mStandardConfigurations = Collections.unmodifiableList(arraylist);
        mRequiredConfigurations = Collections.unmodifiableList(arraylist1);
        mOptionalConfigurations = Collections.unmodifiableList(arraylist2);
    }

    public List getOptionalGroupConfigurations()
    {
        return mOptionalConfigurations;
    }

    public List getRequiredGroupConfigurations()
    {
        return mRequiredConfigurations;
    }

    public List getStandardGroupConfigurations()
    {
        return mStandardConfigurations;
    }
}
