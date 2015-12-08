// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.walmart.android.app.item.ItemLogic;
import com.walmart.android.app.shop.ShelfPriceView;
import com.walmart.android.data.StoreAvailabilityData;
import com.walmart.android.service.item.ItemModel;
import com.walmart.android.service.item.ItemPrice;
import com.walmart.android.service.item.ReviewData;
import com.walmart.android.util.AvailabilityUtils;
import com.walmart.android.util.PricePerUnitUtils;
import com.walmart.android.wmui.Typefaces;
import com.walmartlabs.ui.StarsView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MapCardView extends RelativeLayout
{

    public static final String TAG = com/walmart/android/app/shop/map/MapCardView.getSimpleName();
    private static final Pattern sPriceVariesByStorePattern = Pattern.compile("^Price varies by store.*$", 2);
    private TextView mAisleDepartmentView;
    private TextView mAisleLocationView;
    private ImageView mImageView;
    private View mLocationContainer;
    private TextView mPpuView;
    private TextView mPricePrefixView;
    private ShelfPriceView mPriceView;
    private TextView mReviewCountView;
    private TextView mSpecialPriceTypeView;
    private StarsView mStarsView;
    private TextView mStockStatusView;
    private TextView mTitleView;

    public MapCardView(Context context)
    {
        super(context);
    }

    public MapCardView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public MapCardView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mImageView = (ImageView)findViewById(0x7f10004b);
        mTitleView = (TextView)findViewById(0x7f10004f);
        mStarsView = (StarsView)findViewById(0x7f1000a5);
        mReviewCountView = (TextView)findViewById(0x7f10017a);
        mAisleLocationView = (TextView)findViewById(0x7f100180);
        mAisleDepartmentView = (TextView)findViewById(0x7f100182);
        mPricePrefixView = (TextView)findViewById(0x7f10017b);
        mPriceView = (ShelfPriceView)findViewById(0x7f1000a8);
        mPpuView = (TextView)findViewById(0x7f10017c);
        mStockStatusView = (TextView)findViewById(0x7f100181);
        mSpecialPriceTypeView = (TextView)findViewById(0x7f10017d);
        mLocationContainer = findViewById(0x7f10017e);
        mSpecialPriceTypeView.setVisibility(8);
        mSpecialPriceTypeView.setTypeface(Typefaces.create(getContext(), com.walmart.android.wmui.Typefaces.Family.MEDIUM));
    }

    protected void setAisle(CharSequence charsequence)
    {
        if (!TextUtils.isEmpty(charsequence))
        {
            mAisleLocationView.setText(getContext().getString(0x7f090551, new Object[] {
                charsequence
            }));
            mAisleLocationView.setVisibility(0);
            return;
        } else
        {
            mAisleLocationView.setVisibility(8);
            return;
        }
    }

    protected void setAisle(CharSequence charsequence, CharSequence charsequence1)
    {
        if (showAisleContainer(charsequence, charsequence1))
        {
            mTitleView.setMaxLines(2);
            setAisle(charsequence);
            setAisleDepartment(charsequence1);
            mLocationContainer.setVisibility(0);
            return;
        } else
        {
            mTitleView.setMaxLines(3);
            mLocationContainer.setVisibility(8);
            return;
        }
    }

    protected void setAisleDepartment(CharSequence charsequence)
    {
        if (!TextUtils.isEmpty(charsequence))
        {
            mAisleDepartmentView.setText(getContext().getString(0x7f090553, new Object[] {
                charsequence
            }));
            mAisleDepartmentView.setVisibility(0);
            return;
        } else
        {
            mAisleDepartmentView.setVisibility(8);
            return;
        }
    }

    public void setInStoreItem(com.walmart.android.data.InStoreSearchResult.Result result)
    {
        if (result != null)
        {
            String s1 = result.getPriceUnit();
            String s = null;
            if (PricePerUnitUtils.shouldDisplayShelfPPU(result))
            {
                s = result.getFormattedPricePerUnit();
            }
            setPrice(result.getPriceString(), false, s1, s);
            setTitle(result.name);
            setAisle(result.getFirstAisle(), result.getDepartmentName());
            setStockStatus(result.getInventoryStatus());
            setReviewData(result.getRating(), result.getNbrReviews());
            setThumbNailUrl(result.getThumbNailUrl());
        }
    }

    public void setItem(ItemModel itemmodel, ItemLogic itemlogic, StoreAvailabilityData storeavailabilitydata)
    {
        itemlogic = itemlogic.getInStorePrice();
        setPrice(itemlogic.getPriceString(), itemlogic.isSubmap(), storeavailabilitydata.priceUnitString, storeavailabilitydata.ppuDisplayString);
        setTitle(itemmodel.getProductName());
        setStockStatus(storeavailabilitydata.stockStatus);
        itemlogic = itemmodel.getReviewData();
        setReviewData(itemlogic.getAverageOverallRating(), itemlogic.getTotalReviewCount());
        setThumbNailUrl(itemmodel.getThumbnailImage());
    }

    protected void setPrefix(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            mPricePrefixView.setText(s);
            mPricePrefixView.setVisibility(0);
            return;
        } else
        {
            mPricePrefixView.setVisibility(8);
            return;
        }
    }

    protected void setPrice(CharSequence charsequence, boolean flag, String s, String s1)
    {
        Object obj = null;
        if (charsequence != null)
        {
            boolean flag1 = sPriceVariesByStorePattern.matcher(charsequence).matches();
            ShelfPriceView shelfpriceview;
            if (flag)
            {
                mSpecialPriceTypeView.setVisibility(0);
                mSpecialPriceTypeView.setText(0x7f090561);
            } else
            if (flag1)
            {
                mSpecialPriceTypeView.setVisibility(0);
                mSpecialPriceTypeView.setText(0x7f09055b);
            } else
            {
                mSpecialPriceTypeView.setVisibility(8);
            }
        } else
        {
            mSpecialPriceTypeView.setVisibility(8);
        }
        if (TextUtils.isEmpty(charsequence))
        {
            mPriceView.setVisibility(8);
            mPriceView.setPrice(null);
        } else
        {
            mPriceView.setVisibility(0);
            mPriceView.setPrice(charsequence.toString());
        }
        setPrefix(mPriceView.getPrefix());
        shelfpriceview = mPriceView;
        charsequence = obj;
        if (!TextUtils.isEmpty(s))
        {
            charsequence = s;
        }
        shelfpriceview.setUnit(charsequence);
        if (TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1))
        {
            mPpuView.setText(s1);
            mPpuView.setVisibility(0);
            return;
        } else
        {
            mPpuView.setText("");
            mPpuView.setVisibility(8);
            return;
        }
    }

    protected void setReviewData(float f, int i)
    {
        boolean flag = false;
        TextView textview;
        if (f > 0.0F)
        {
            mStarsView.setVisibility(0);
            mStarsView.setValue(f);
        } else
        {
            mStarsView.setVisibility(4);
        }
        if (i > 0)
        {
            mReviewCountView.setText(getContext().getString(0x7f090557, new Object[] {
                Integer.valueOf(i)
            }));
        }
        textview = mReviewCountView;
        if (i > 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 4;
        }
        textview.setVisibility(i);
    }

    protected void setStockStatus(String s)
    {
        if (AvailabilityUtils.shouldDisplayStockStatus(getContext(), s))
        {
            s = AvailabilityUtils.getStockString(getContext(), s);
            mStockStatusView.setVisibility(0);
            mStockStatusView.setText(s);
            return;
        } else
        {
            mStockStatusView.setVisibility(8);
            return;
        }
    }

    protected void setThumbNailUrl(String s)
    {
        Picasso.with(getContext()).load(s).error(0x7f02021b).tag(TAG).into(mImageView);
    }

    protected void setTitle(CharSequence charsequence)
    {
        mTitleView.setText(charsequence);
    }

    protected boolean showAisleContainer(CharSequence charsequence, CharSequence charsequence1)
    {
        return !TextUtils.isEmpty(charsequence) || !TextUtils.isEmpty(charsequence1);
    }

}
