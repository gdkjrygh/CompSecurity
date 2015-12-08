// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishProduct;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.product.tabbeddetails:
//            TabbedProductDetailsPagerView, TabbedProductDetailsOverviewView, TabbedProductDetailsFragment, TabbedProductDetailsDescriptionView, 
//            TabbedProductDetailsProductRatingsView, TabbedProductDetailsMerchantRatingsView, TabbedProductDetailsShippingView, TabbedProductDetailsRelatedProductsView

public class TabbedProductDetailsPagerAdapter extends PagerAdapter
{
    public static final class ProductDetailSection extends Enum
    {

        private static final ProductDetailSection $VALUES[];
        public static final ProductDetailSection DESCRIPTION;
        public static final ProductDetailSection OVERVIEW;
        public static final ProductDetailSection PRODUCT_RATINGS;
        public static final ProductDetailSection RELATED_PRODUCTS;
        public static final ProductDetailSection SHIPPING_INFO;
        public static final ProductDetailSection STORE_RATINGS;

        public static ProductDetailSection valueOf(String s)
        {
            return (ProductDetailSection)Enum.valueOf(com/contextlogic/wish/ui/fragment/product/tabbeddetails/TabbedProductDetailsPagerAdapter$ProductDetailSection, s);
        }

        public static ProductDetailSection[] values()
        {
            return (ProductDetailSection[])$VALUES.clone();
        }

        static 
        {
            OVERVIEW = new ProductDetailSection("OVERVIEW", 0);
            DESCRIPTION = new ProductDetailSection("DESCRIPTION", 1);
            PRODUCT_RATINGS = new ProductDetailSection("PRODUCT_RATINGS", 2);
            STORE_RATINGS = new ProductDetailSection("STORE_RATINGS", 3);
            SHIPPING_INFO = new ProductDetailSection("SHIPPING_INFO", 4);
            RELATED_PRODUCTS = new ProductDetailSection("RELATED_PRODUCTS", 5);
            $VALUES = (new ProductDetailSection[] {
                OVERVIEW, DESCRIPTION, PRODUCT_RATINGS, STORE_RATINGS, SHIPPING_INFO, RELATED_PRODUCTS
            });
        }

        private ProductDetailSection(String s, int i)
        {
            super(s, i);
        }
    }


    private Context context;
    private TabbedProductDetailsFragment fragment;
    private boolean productRatingsTracked;
    private ArrayList sections;
    private boolean storeRatingsTracked;
    private ViewPager viewPager;

    public TabbedProductDetailsPagerAdapter(Context context1, TabbedProductDetailsFragment tabbedproductdetailsfragment, ViewPager viewpager)
    {
        viewPager = viewpager;
        context = context1;
        fragment = tabbedproductdetailsfragment;
    }

    public void cleanup()
    {
        for (int i = 0; i < getCount(); i++)
        {
            TabbedProductDetailsPagerView tabbedproductdetailspagerview = (TabbedProductDetailsPagerView)viewPager.findViewWithTag(Integer.valueOf(i));
            if (tabbedproductdetailspagerview != null)
            {
                tabbedproductdetailspagerview.cleanup();
            }
        }

    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        obj = (TabbedProductDetailsPagerView)obj;
        ((TabbedProductDetailsPagerView) (obj)).cleanup();
        viewgroup.removeView(((View) (obj)));
    }

    public int getCount()
    {
        if (sections == null)
        {
            return 0;
        } else
        {
            return sections.size();
        }
    }

    public volatile CharSequence getPageTitle(int i)
    {
        return getPageTitle(i);
    }

    public String getPageTitle(int i)
    {
        if (sections == null || i >= sections.size())
        {
            return "";
        }
        ProductDetailSection productdetailsection = (ProductDetailSection)sections.get(i);
        static class _cls1
        {

            static final int $SwitchMap$com$contextlogic$wish$ui$fragment$product$tabbeddetails$TabbedProductDetailsPagerAdapter$ProductDetailSection[];

            static 
            {
                $SwitchMap$com$contextlogic$wish$ui$fragment$product$tabbeddetails$TabbedProductDetailsPagerAdapter$ProductDetailSection = new int[ProductDetailSection.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$product$tabbeddetails$TabbedProductDetailsPagerAdapter$ProductDetailSection[ProductDetailSection.OVERVIEW.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$product$tabbeddetails$TabbedProductDetailsPagerAdapter$ProductDetailSection[ProductDetailSection.DESCRIPTION.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$product$tabbeddetails$TabbedProductDetailsPagerAdapter$ProductDetailSection[ProductDetailSection.PRODUCT_RATINGS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$product$tabbeddetails$TabbedProductDetailsPagerAdapter$ProductDetailSection[ProductDetailSection.STORE_RATINGS.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$product$tabbeddetails$TabbedProductDetailsPagerAdapter$ProductDetailSection[ProductDetailSection.SHIPPING_INFO.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$product$tabbeddetails$TabbedProductDetailsPagerAdapter$ProductDetailSection[ProductDetailSection.RELATED_PRODUCTS.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.contextlogic.wish.ui.fragment.product.tabbeddetails.TabbedProductDetailsPagerAdapter.ProductDetailSection[productdetailsection.ordinal()])
        {
        default:
            return "";

        case 1: // '\001'
            return context.getString(0x7f060319);

        case 2: // '\002'
            return context.getString(0x7f06019d);

        case 3: // '\003'
            return context.getString(0x7f06011c);

        case 4: // '\004'
            return context.getString(0x7f06011d);

        case 5: // '\005'
            return context.getString(0x7f0603d5);

        case 6: // '\006'
            return context.getString(0x7f06036b);
        }
    }

    public int getSectionIndex(ProductDetailSection productdetailsection)
    {
        int j;
        byte byte0;
        byte0 = -1;
        j = byte0;
        if (sections == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L7:
        j = byte0;
        if (i >= sections.size()) goto _L2; else goto _L3
_L3:
        if (sections.get(i) != productdetailsection) goto _L5; else goto _L4
_L4:
        j = i;
_L2:
        return j;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void handleOrientationChanged()
    {
        for (int i = 0; i < getCount(); i++)
        {
            TabbedProductDetailsPagerView tabbedproductdetailspagerview = (TabbedProductDetailsPagerView)viewPager.findViewWithTag(Integer.valueOf(i));
            if (tabbedproductdetailspagerview != null)
            {
                tabbedproductdetailspagerview.handleOrientationChanged();
            }
        }

    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        Object obj = (ProductDetailSection)sections.get(i);
        _cls1..SwitchMap.com.contextlogic.wish.ui.fragment.product.tabbeddetails.TabbedProductDetailsPagerAdapter.ProductDetailSection[((ProductDetailSection) (obj)).ordinal()];
        JVM INSTR tableswitch 1 6: default 60
    //                   1 86
    //                   2 117
    //                   3 148
    //                   4 179
    //                   5 210
    //                   6 241;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        obj = null;
_L9:
        ((TabbedProductDetailsPagerView) (obj)).setTag(Integer.valueOf(i));
        viewgroup.addView(((View) (obj)), new android.view.ViewGroup.LayoutParams(-1, -1));
        return obj;
_L2:
        obj = new TabbedProductDetailsOverviewView(context);
        ((TabbedProductDetailsPagerView) (obj)).setup(fragment.getLoadedProduct(), i, fragment);
        continue; /* Loop/switch isn't completed */
_L3:
        obj = new TabbedProductDetailsDescriptionView(context);
        ((TabbedProductDetailsPagerView) (obj)).setup(fragment.getLoadedProduct(), i, fragment);
        continue; /* Loop/switch isn't completed */
_L4:
        obj = new TabbedProductDetailsProductRatingsView(context);
        ((TabbedProductDetailsPagerView) (obj)).setup(fragment.getLoadedProduct(), i, fragment);
        continue; /* Loop/switch isn't completed */
_L5:
        obj = new TabbedProductDetailsMerchantRatingsView(context);
        ((TabbedProductDetailsPagerView) (obj)).setup(fragment.getLoadedProduct(), i, fragment);
        continue; /* Loop/switch isn't completed */
_L6:
        obj = new TabbedProductDetailsShippingView(context);
        ((TabbedProductDetailsPagerView) (obj)).setup(fragment.getLoadedProduct(), i, fragment);
        continue; /* Loop/switch isn't completed */
_L7:
        obj = new TabbedProductDetailsRelatedProductsView(context);
        ((TabbedProductDetailsPagerView) (obj)).setup(fragment.getLoadedProduct(), i, fragment);
        if (true) goto _L9; else goto _L8
_L8:
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

    public void onPagerScrollSettled()
    {
        int j;
        for (int i = 0; i < getCount(); i++)
        {
            TabbedProductDetailsPagerView tabbedproductdetailspagerview = (TabbedProductDetailsPagerView)viewPager.findViewWithTag(Integer.valueOf(i));
            if (tabbedproductdetailspagerview != null)
            {
                tabbedproductdetailspagerview.onPagerScrollSettled();
            }
        }

        j = fragment.getCurrentIndex();
        if (sections == null || j >= sections.size()) goto _L2; else goto _L1
_L1:
        ProductDetailSection productdetailsection = (ProductDetailSection)sections.get(j);
        _cls1..SwitchMap.com.contextlogic.wish.ui.fragment.product.tabbeddetails.TabbedProductDetailsPagerAdapter.ProductDetailSection[productdetailsection.ordinal()];
        JVM INSTR tableswitch 3 4: default 108
    //                   3 109
    //                   4 132;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        if (!productRatingsTracked)
        {
            productRatingsTracked = true;
            fragment.trackClick(WishAnalyticsEvent.IMPRESSION_MOBILE_NATIVE_PRODUCT_RATINGS);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (!storeRatingsTracked)
        {
            storeRatingsTracked = true;
            fragment.trackClick(WishAnalyticsEvent.IMPRESSION_MOBILE_NATIVE_MERCHANT_RATINGS);
            return;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void onPagerScrollUnsettled()
    {
        for (int i = 0; i < getCount(); i++)
        {
            TabbedProductDetailsPagerView tabbedproductdetailspagerview = (TabbedProductDetailsPagerView)viewPager.findViewWithTag(Integer.valueOf(i));
            if (tabbedproductdetailspagerview != null)
            {
                tabbedproductdetailspagerview.onPagerScrollUnsettled();
            }
        }

    }

    public void refreshWishStates(boolean flag)
    {
        for (int i = 0; i < getCount(); i++)
        {
            TabbedProductDetailsPagerView tabbedproductdetailspagerview = (TabbedProductDetailsPagerView)viewPager.findViewWithTag(Integer.valueOf(i));
            if (tabbedproductdetailspagerview != null)
            {
                tabbedproductdetailspagerview.refreshWishStates(flag);
            }
        }

    }

    public void releaseImages()
    {
        for (int i = 0; i < getCount(); i++)
        {
            TabbedProductDetailsPagerView tabbedproductdetailspagerview = (TabbedProductDetailsPagerView)viewPager.findViewWithTag(Integer.valueOf(i));
            if (tabbedproductdetailspagerview != null)
            {
                tabbedproductdetailspagerview.releaseImages();
            }
        }

    }

    public void restoreImages()
    {
        for (int i = 0; i < getCount(); i++)
        {
            TabbedProductDetailsPagerView tabbedproductdetailspagerview = (TabbedProductDetailsPagerView)viewPager.findViewWithTag(Integer.valueOf(i));
            if (tabbedproductdetailspagerview != null)
            {
                tabbedproductdetailspagerview.restoreImages();
            }
        }

    }

    public void updatePages()
    {
        WishProduct wishproduct = fragment.getLoadedProduct();
        if (wishproduct != null)
        {
            if (wishproduct.isCommerceProduct())
            {
                sections = new ArrayList();
                sections.add(ProductDetailSection.OVERVIEW);
                sections.add(ProductDetailSection.RELATED_PRODUCTS);
                if (wishproduct.getDescription() != null && !wishproduct.getDescription().trim().equals(""))
                {
                    sections.add(ProductDetailSection.DESCRIPTION);
                }
                if (wishproduct.getProductRatingCount() > 0)
                {
                    sections.add(ProductDetailSection.PRODUCT_RATINGS);
                }
                if (wishproduct.getMerchantRatingCount() > 0)
                {
                    sections.add(ProductDetailSection.STORE_RATINGS);
                }
                sections.add(ProductDetailSection.SHIPPING_INFO);
            } else
            {
                sections = new ArrayList();
                sections.add(ProductDetailSection.OVERVIEW);
                if (wishproduct.getDescription() != null && !wishproduct.getDescription().trim().equals(""))
                {
                    sections.add(ProductDetailSection.DESCRIPTION);
                }
                sections.add(ProductDetailSection.RELATED_PRODUCTS);
            }
        } else
        {
            sections = null;
        }
        notifyDataSetChanged();
    }
}
