// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.walmart.android.ui.ImageViewExtended;
import com.walmart.android.util.ItemUtils;
import com.walmart.android.util.PricePerUnitUtils;
import com.walmart.android.wmui.Typefaces;
import com.walmartlabs.ui.StarsView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.walmart.android.app.shop:
//            ItemCardPriceView, ShelfUtils

public class ShelfItemCardView extends CardView
{

    public static final String TAG = com/walmart/android/app/shop/ShelfItemCardView.getSimpleName();
    private static final Pattern sPriceVariesByStorePattern = Pattern.compile("^Price varies by store.*$", 2);
    private ImageViewExtended mImageView;
    private TextView mListPriceView;
    private TextView mPpuView;
    private TextView mPricePrefixView;
    private ItemCardPriceView mPriceView;
    private TextView mReviewCountView;
    private TextView mSellerNameView;
    private TextView mSellerPrefixView;
    private View mShippingPassView;
    private TextView mSpecialPriceTypeView;
    private StarsView mStarsView;
    private TextView mTitleView;

    public ShelfItemCardView(Context context)
    {
        super(context);
    }

    public ShelfItemCardView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ShelfItemCardView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mImageView = (ImageViewExtended)findViewById(0x7f10056e);
        mTitleView = (TextView)findViewById(0x7f10056a);
        mStarsView = (StarsView)findViewById(0x7f1000a5);
        mPricePrefixView = (TextView)findViewById(0x7f100571);
        mPriceView = (ItemCardPriceView)findViewById(0x7f100570);
        mPpuView = (TextView)findViewById(0x7f10017c);
        mListPriceView = (TextView)findViewById(0x7f100573);
        mSpecialPriceTypeView = (TextView)findViewById(0x7f100572);
        mReviewCountView = (TextView)findViewById(0x7f10017a);
        mSellerNameView = (TextView)findViewById(0x7f100568);
        mSellerPrefixView = (TextView)findViewById(0x7f100567);
        mShippingPassView = findViewById(0x7f10017f);
        mSellerNameView.setTypeface(Typefaces.create(getContext(), com.walmart.android.wmui.Typefaces.Family.MEDIUM));
    }

    public void setInStoreItem(com.walmart.android.data.InStoreSearchResult.Result result)
    {
        throw new IllegalStateException("Not implemented");
    }

    public void setItem(com.walmart.android.data.StoreQueryResult.Item item)
    {
        setItem(item, false);
    }

    public void setItem(com.walmart.android.data.StoreQueryResult.Item item, boolean flag)
    {
        mTitleView.setText(ShelfUtils.fromHtml(item.getName()));
        mStarsView.setValue(item.getRating());
        Object obj = mStarsView;
        int i;
        int j;
        boolean flag1;
        if (item.getRating() > 0.0F)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        ((StarsView) (obj)).setVisibility(i);
        j = item.getNbrReviews();
        if (j > 0)
        {
            mReviewCountView.setText(getContext().getString(0x7f090557, new Object[] {
                Integer.valueOf(item.getNbrReviews())
            }));
        }
        obj = mReviewCountView;
        if (j > 0)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        ((TextView) (obj)).setVisibility(i);
        if (j > 0 || item.getRating() > 0.0F)
        {
            mTitleView.setMaxLines(2);
            mTitleView.setLines(2);
            findViewById(0x7f10056f).setVisibility(0);
        } else
        {
            mTitleView.setMaxLines(3);
            mTitleView.setLines(3);
            findViewById(0x7f10056f).setVisibility(8);
        }
        obj = mShippingPassView;
        if (flag && item.shippingPassEligible())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
        if (!TextUtils.isEmpty(item.getMarketPlaceSellerName()))
        {
            mSellerNameView.setText(item.getMarketPlaceSellerName());
            mSellerNameView.setVisibility(0);
            mSellerPrefixView.setVisibility(0);
        } else
        {
            mSellerNameView.setVisibility(8);
            mSellerPrefixView.setVisibility(8);
        }
        obj = item.getPrice();
        flag = false;
        flag1 = item.isSubMarketPrice();
        if (obj != null)
        {
            flag = sPriceVariesByStorePattern.matcher(((CharSequence) (obj))).matches();
            TextView textview;
            if (flag1)
            {
                mPriceView.setVisibility(8);
                mPricePrefixView.setVisibility(8);
                mSpecialPriceTypeView.setVisibility(0);
                mSpecialPriceTypeView.setText(0x7f090562);
                mSpecialPriceTypeView.setTypeface(Typefaces.create(getContext(), com.walmart.android.wmui.Typefaces.Family.MEDIUM));
            } else
            if (flag)
            {
                mPriceView.setVisibility(8);
                mPricePrefixView.setVisibility(8);
                mSpecialPriceTypeView.setVisibility(0);
                mSpecialPriceTypeView.setText(0x7f09055c);
                mSpecialPriceTypeView.setTypeface(Typefaces.create(getContext(), com.walmart.android.wmui.Typefaces.Family.MEDIUM));
            } else
            {
                mPriceView.setVisibility(0);
                mPriceView.setPrice(((String) (obj)));
                obj = mPriceView.getPrefix();
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    mPricePrefixView.setText(((CharSequence) (obj)));
                    mPricePrefixView.setVisibility(0);
                } else
                {
                    mPricePrefixView.setVisibility(8);
                }
                mSpecialPriceTypeView.setVisibility(8);
            }
        } else
        {
            mPriceView.setVisibility(8);
            mPricePrefixView.setVisibility(8);
            mSpecialPriceTypeView.setVisibility(8);
        }
        mListPriceView.setText("");
        mListPriceView.setVisibility(8);
        if (!flag && !flag1)
        {
            if (!TextUtils.isEmpty(item.getListPrice()))
            {
                mListPriceView.setVisibility(0);
                mListPriceView.setText(ItemUtils.applyListPriceStrikethrough(item.getListPrice()));
            } else
            if (!TextUtils.isEmpty(item.getRollbackPrice()))
            {
                mListPriceView.setVisibility(0);
                mListPriceView.setText(item.getRollbackPrice());
            }
        }
        if (PricePerUnitUtils.shouldDisplayShelfPPU(item))
        {
            obj = item.getFormattedPricePerUnit();
            mPpuView.setText(((CharSequence) (obj)));
            textview = mPpuView;
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                i = 0;
            } else
            {
                i = 4;
            }
            textview.setVisibility(i);
        } else
        {
            mPpuView.setText("");
            mPpuView.setVisibility(4);
        }
        Picasso.with(getContext()).load(ShelfUtils.getImageUrlFromThumbnailUrl(item.getImageThumbnailUrl())).error(0x7f02021b).tag(TAG).into(mImageView);
    }

}
