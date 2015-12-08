// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import com.walmart.android.service.item.BuyingOptionModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.walmart.android.app.item:
//            BundleConfiguration

public static class mBundleGroup
{

    private final com.walmart.android.service.item.ionVariantItemMap mBundleGroup;
    private Map mOptionVariantItemMap;
    private Map mOptionVariantTypeMap;
    private final List mSelections = new ArrayList();

    public boolean canMakeAdditionalSelections()
    {
        return mSelections.size() < mBundleGroup.llowed();
    }

    public boolean canSelectionBeReplaced()
    {
        return mBundleGroup.llowed() == 1;
    }

    public void deselect(com.walmart.android.service.item.llowed llowed)
    {
        mSelections.remove(llowed);
        mOptionVariantTypeMap.remove(llowed);
        mOptionVariantItemMap.remove(llowed);
    }

    public com.walmart.android.service.item.ionVariantItemMap getBundleGroup()
    {
        return mBundleGroup;
    }

    public String getOfferId(com.walmart.android.service.item.dleGroup dlegroup)
    {
        com.walmart.android.service.item.dleGroup dlegroup1 = (com.walmart.android.service.item.dleGroup)mOptionVariantItemMap.get(dlegroup);
        if (dlegroup1 != null && dlegroup1.l() != null)
        {
            return dlegroup1.l().getOfferId();
        } else
        {
            return dlegroup.l();
        }
    }

    public List getSelectedOptions()
    {
        return Collections.unmodifiableList(mSelections);
    }

    public com.walmart.android.service.item.ections getSelectedVariantItem(com.walmart.android.service.item.ections ections)
    {
        return (com.walmart.android.service.item.ections)mOptionVariantItemMap.get(ections);
    }

    public List getSelectedVariantTypes(com.walmart.android.service.item.ionVariantItemMap ionvariantitemmap)
    {
        return (List)mOptionVariantTypeMap.get(ionvariantitemmap);
    }

    public int getTotalAdditionalPriceInCents()
    {
        int i = 0;
        for (Iterator iterator = mSelections.iterator(); iterator.hasNext();)
        {
            i += ((com.walmart.android.service.item.ections)iterator.next()).ts();
        }

        return i;
    }

    public boolean hasMadeAnySelections()
    {
        return !mSelections.isEmpty();
    }

    public boolean hasMadeRequiredSelections()
    {
        return mSelections.size() >= mBundleGroup.equired();
    }

    public boolean isSelected(com.walmart.android.service.item.equired equired)
    {
        return mSelections.contains(equired);
    }

    public boolean isVariantSelected(com.walmart.android.service.item.ections ections, String s)
    {
        return mOptionVariantItemMap.containsKey(ections) && ((com.walmart.android.service.item.ionVariantItemMap)mOptionVariantItemMap.get(ections)).ionVariantItemMap().equals(s);
    }

    public void replace(com.walmart.android.service.item.ionVariantItemMap ionvariantitemmap)
    {
        mSelections.clear();
        select(ionvariantitemmap);
    }

    public void replace(com.walmart.android.service.item.ct ct, List list, com.walmart.android.service.item.ct ct1)
    {
        mSelections.clear();
        select(ct, list, ct1);
    }

    public void select(com.walmart.android.service.item.ct ct)
    {
        mSelections.add(ct);
    }

    public void select(com.walmart.android.service.item.ections ections, List list, com.walmart.android.service.item.ections ections1)
    {
        select(ections);
        mOptionVariantTypeMap.put(ections, Collections.unmodifiableList(list));
        mOptionVariantItemMap.put(ections, ections1);
    }

    public (com.walmart.android.service.item. )
    {
        mOptionVariantTypeMap = new HashMap();
        mOptionVariantItemMap = new HashMap();
        mBundleGroup = ;
    }
}
