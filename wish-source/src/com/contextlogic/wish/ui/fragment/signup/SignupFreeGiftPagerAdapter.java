// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.PagerAdapter;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishSignupFreeGifts;
import com.contextlogic.wish.ui.components.button.UnifiedFontButton;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.components.text.UnifiedFontTextView;
import java.util.ArrayList;
import java.util.Iterator;

public class SignupFreeGiftPagerAdapter extends PagerAdapter
{

    private final android.view.View.OnClickListener buyListener;
    private String claimGiftText;
    private Context context;
    private ArrayList products;

    public SignupFreeGiftPagerAdapter(Context context1, android.view.View.OnClickListener onclicklistener)
    {
        context = context1;
        products = new ArrayList();
        buyListener = onclicklistener;
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

    public float getPageWidth(int i)
    {
        return 0.9F;
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
        View view = ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f0300a6, null);
        Object obj = (BorderedImageView)view.findViewById(0x7f0d0351);
        UnifiedFontTextView unifiedfonttextview = (UnifiedFontTextView)view.findViewById(0x7f0d0354);
        UnifiedFontTextView unifiedfonttextview1 = (UnifiedFontTextView)view.findViewById(0x7f0d0353);
        unifiedfonttextview1.setPaintFlags(unifiedfonttextview1.getPaintFlags() | 0x10);
        Object obj2 = (UnifiedFontButton)view.findViewById(0x7f0d0355);
        Object obj3 = (android.widget.LinearLayout.LayoutParams)((UnifiedFontButton) (obj2)).getLayoutParams();
        Object obj1 = context.getResources().getDisplayMetrics();
        int j = (int)TypedValue.applyDimension(1, 10F, ((DisplayMetrics) (obj1)));
        ((android.widget.LinearLayout.LayoutParams) (obj3)).setMargins(j, j, j, j);
        view.setOnClickListener(buyListener);
        ((UnifiedFontButton) (obj2)).setOnClickListener(buyListener);
        if (claimGiftText != null)
        {
            ((UnifiedFontButton) (obj2)).setText(claimGiftText);
        }
        obj2 = (WishProduct)products.get(i);
        float f = (float)((DisplayMetrics) (obj1)).heightPixels / ((DisplayMetrics) (obj1)).density;
        float f1 = (float)((DisplayMetrics) (obj1)).widthPixels / ((DisplayMetrics) (obj1)).density;
        i = Math.max(150, Math.round(f - 365F));
        j = (int)Math.round((double)f1 * 0.73999999999999999D);
        obj3 = ((BorderedImageView) (obj)).getLayoutParams();
        obj3.width = (int)TypedValue.applyDimension(1, j, ((DisplayMetrics) (obj1)));
        obj3.height = (int)TypedValue.applyDimension(1, i, ((DisplayMetrics) (obj1)));
        ((BorderedImageView) (obj)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj3)));
        ((BorderedImageView) (obj)).getImageView().setImageUrl(((WishProduct) (obj2)).getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Medium));
        ((BorderedImageView) (obj)).getImageView().setRequestedImageWidth(j);
        ((BorderedImageView) (obj)).getImageView().setRequestedImageHeight(i);
        obj = ((WishProduct) (obj2)).getSignupGiftPrice();
        obj1 = ((WishProduct) (obj2)).getVariationRetailPrice(((WishProduct) (obj2)).getCommerceDefaultVariationId());
        if (((WishLocalizedCurrencyValue) (obj)).getValue() > 0.0D)
        {
            unifiedfonttextview.setText(((WishLocalizedCurrencyValue) (obj)).toFormattedString());
        } else
        {
            unifiedfonttextview.setText(context.getString(0x7f0601e1));
        }
        if (((WishLocalizedCurrencyValue) (obj1)).getValue() > ((WishLocalizedCurrencyValue) (obj)).getValue())
        {
            unifiedfonttextview1.setVisibility(0);
            if (((WishLocalizedCurrencyValue) (obj1)).getValue() > 0.0D)
            {
                unifiedfonttextview1.setText(((WishLocalizedCurrencyValue) (obj1)).toFormattedString());
            } else
            {
                unifiedfonttextview1.setText(context.getString(0x7f0601e1));
            }
        } else
        {
            unifiedfonttextview1.setVisibility(8);
        }
        viewgroup.addView(view);
        return view;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

    public void updateProducts(WishSignupFreeGifts wishsignupfreegifts)
    {
        claimGiftText = wishsignupfreegifts.getClaimGiftText();
        products.clear();
        WishProduct wishproduct;
        for (wishsignupfreegifts = wishsignupfreegifts.getSignupGiftProducts().iterator(); wishsignupfreegifts.hasNext(); products.add(wishproduct))
        {
            wishproduct = (WishProduct)wishsignupfreegifts.next();
        }

    }
}
