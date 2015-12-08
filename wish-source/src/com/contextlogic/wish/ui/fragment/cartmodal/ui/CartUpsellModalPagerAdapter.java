// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.components.text.UnifiedFontTextView;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class CartUpsellModalPagerAdapter extends PagerAdapter
{

    private Context context;
    private ArrayList products;

    public CartUpsellModalPagerAdapter(Context context1)
    {
        context = context1;
        products = new ArrayList();
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((View)obj);
    }

    public int getCount()
    {
        if (products != null)
        {
            return products.size();
        } else
        {
            return 0;
        }
    }

    public WishProduct getProductInPosition(int i)
    {
        if (i >= products.size())
        {
            return null;
        } else
        {
            return (WishProduct)products.get(i);
        }
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        View view = ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f030047, null);
        Object obj1 = (BorderedImageView)view.findViewById(0x7f0d0198);
        Object obj = (WishProduct)products.get(i);
        ((BorderedImageView) (obj1)).getImageView().setImageUrl(((WishProduct) (obj)).getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Medium));
        ((BorderedImageView) (obj1)).getImageView().setRequestedImageWidth(150);
        ((BorderedImageView) (obj1)).getImageView().setRequestedImageHeight(150);
        ((UnifiedFontTextView)view.findViewById(0x7f0d0199)).setText(((WishProduct) (obj)).getName());
        obj1 = (ImageView)view.findViewById(0x7f0d019b);
        Object obj2 = (ImageView)view.findViewById(0x7f0d019c);
        Object obj3 = (ImageView)view.findViewById(0x7f0d019d);
        Object obj4 = (ImageView)view.findViewById(0x7f0d019e);
        Object obj5 = (ImageView)view.findViewById(0x7f0d019f);
        UnifiedFontTextView unifiedfonttextview = (UnifiedFontTextView)view.findViewById(0x7f0d01a0);
        double d;
        int ai[];
        if (((WishProduct) (obj)).getProductRatingCount() > 0)
        {
            d = ((WishProduct) (obj)).getProductRating();
        } else
        {
            d = 5D;
        }
        ai = new int[5];
        i = 0;
        while (i < 5) 
        {
            if (d >= (double)(i + 1))
            {
                ai[i] = 0x7f0201ce;
            } else
            {
                double d1 = (double)(i + 1) - d;
                if (d1 <= 0.25D)
                {
                    ai[i] = 0x7f0201ce;
                } else
                if (d1 <= 0.75D)
                {
                    ai[i] = 0x7f0200dc;
                } else
                {
                    ai[i] = 0x7f0200d8;
                }
            }
            i++;
        }
        ((ImageView) (obj1)).setImageResource(ai[0]);
        ((ImageView) (obj2)).setImageResource(ai[1]);
        ((ImageView) (obj3)).setImageResource(ai[2]);
        ((ImageView) (obj4)).setImageResource(ai[3]);
        ((ImageView) (obj5)).setImageResource(ai[4]);
        unifiedfonttextview.setText(String.format("(%1$s)", new Object[] {
            NumberFormat.getInstance().format(((WishProduct) (obj)).getProductRatingCount())
        }));
        obj1 = (UnifiedFontTextView)view.findViewById(0x7f0d01a2);
        obj2 = (UnifiedFontTextView)view.findViewById(0x7f0d01a3);
        obj5 = (UnifiedFontTextView)view.findViewById(0x7f0d01a4);
        ((UnifiedFontTextView) (obj1)).setPaintFlags(((UnifiedFontTextView) (obj1)).getPaintFlags() | 0x10);
        ((UnifiedFontTextView) (obj2)).setPaintFlags(((UnifiedFontTextView) (obj2)).getPaintFlags() | 0x10);
        obj4 = ((WishProduct) (obj)).getDefaultCommerceVariationId();
        obj3 = ((WishProduct) (obj)).getVariationPrice(((String) (obj4)));
        if (((WishLocalizedCurrencyValue) (obj3)).getValue() > 0.0D)
        {
            ((UnifiedFontTextView) (obj5)).setText(((WishLocalizedCurrencyValue) (obj3)).toFormattedString());
        } else
        {
            ((UnifiedFontTextView) (obj5)).setText(context.getString(0x7f0601e1));
        }
        obj5 = ((WishProduct) (obj)).getVariationRetailPrice(((String) (obj4)));
        obj = ((WishProduct) (obj)).getVariationPriceBeforeDiscounts(((String) (obj4)));
        if (((WishLocalizedCurrencyValue) (obj)).getValue() > ((WishLocalizedCurrencyValue) (obj3)).getValue())
        {
            ((UnifiedFontTextView) (obj2)).setVisibility(0);
            if (((WishLocalizedCurrencyValue) (obj)).getValue() > 0.0D)
            {
                ((UnifiedFontTextView) (obj2)).setText(((WishLocalizedCurrencyValue) (obj)).toFormattedString());
            } else
            {
                ((UnifiedFontTextView) (obj2)).setText(context.getString(0x7f0601e1));
            }
        } else
        {
            ((UnifiedFontTextView) (obj2)).setVisibility(8);
        }
        if (((WishLocalizedCurrencyValue) (obj5)).getValue() > ((WishLocalizedCurrencyValue) (obj)).getValue())
        {
            ((UnifiedFontTextView) (obj1)).setVisibility(0);
            if (((WishLocalizedCurrencyValue) (obj5)).getValue() > 0.0D)
            {
                ((UnifiedFontTextView) (obj1)).setText(((WishLocalizedCurrencyValue) (obj5)).toFormattedString());
            } else
            {
                ((UnifiedFontTextView) (obj1)).setText(context.getString(0x7f0601e1));
            }
        } else
        {
            ((UnifiedFontTextView) (obj1)).setVisibility(8);
        }
        viewgroup.addView(view);
        return view;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

    public void updateProducts(ArrayList arraylist)
    {
        products.clear();
        WishProduct wishproduct;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); products.add(wishproduct))
        {
            wishproduct = (WishProduct)arraylist.next();
        }

    }
}
