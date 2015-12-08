// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.util.Log;
import com.walmart.android.service.item.ItemPrice;
import com.walmart.android.util.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.walmart.android.app.item:
//            BundleSummaryPresenter, BundleConfiguration

public static class mFallbackPricing
    implements mFallbackPricing
{

    private BundleConfiguration mConfiguration;
    private ItemPrice mFallbackPricing;

    private float getFallbackBasePrice()
    {
        float f1 = 0.0F;
        float f = f1;
        if (mFallbackPricing != null)
        {
            Object obj = mFallbackPricing.getPriceString();
            obj = BundleSummaryPresenter.access$1900().matcher(((CharSequence) (obj)));
            f = f1;
            if (((Matcher) (obj)).matches())
            {
                try
                {
                    f = Float.parseFloat(((Matcher) (obj)).group(2));
                }
                catch (NumberFormatException numberformatexception)
                {
                    Log.w(BundleSummaryPresenter.access$2000(), (new StringBuilder()).append("Failed to parse: ").append(((Matcher) (obj)).group(2)).toString());
                    return 0.0F;
                }
            }
        }
        return f;
    }

    private int getFallbackBasePriceInCents()
    {
        return Math.round(getFallbackBasePrice() * 100F);
    }

    public String getBundlePrice()
    {
        int l;
        int i = 0;
        Object obj = new ArrayList(mConfiguration.getStandardGroupConfigurations());
        ((List) (obj)).addAll(mConfiguration.getRequiredGroupConfigurations());
        Iterator iterator = ((List) (obj)).iterator();
        do
        {
            l = i;
            if (!iterator.hasNext())
            {
                break;
            }
            getFallbackBasePrice getfallbackbaseprice = (s)iterator.next();
            i += getfallbackbaseprice.undleGroup().eGroup();
            if (!getfallbackbaseprice.undleGroup().eGroup())
            {
                continue;
            }
            l = getFallbackBasePriceInCents();
            break;
        } while (true);
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Iterator iterator1 = ((getFallbackBasePriceInCents)((Iterator) (obj)).next()).electedOptions().iterator();
            int j = l;
            do
            {
                l = j;
                if (!iterator1.hasNext())
                {
                    break;
                }
                j += ((com.walmart.android.service.item.tedOptions)iterator1.next()).tedOptions();
            } while (true);
        } while (true);
        obj = mConfiguration.getOptionalGroupConfigurations().iterator();
        do
        {
label0:
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                Iterator iterator2 = ((s)((Iterator) (obj)).next()).electedOptions().iterator();
                int k = l;
                do
                {
                    l = k;
                    if (!iterator2.hasNext())
                    {
                        break;
                    }
                    k += ((com.walmart.android.service.item.tedOptions)iterator2.next()).tedOptions();
                } while (true);
            }
        } while (true);
        return TextUtils.getPriceFromCents(l);
    }

    public (BundleConfiguration bundleconfiguration, ItemPrice itemprice)
    {
        mConfiguration = bundleconfiguration;
        mFallbackPricing = itemprice;
    }
}
