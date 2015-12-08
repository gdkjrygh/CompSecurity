// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.walmart.android.util.AvailabilityUtils;
import com.walmart.android.util.ItemUtils;
import com.walmart.android.util.PricePerUnitUtils;
import com.walmart.android.wmui.Typefaces;
import com.walmartlabs.ui.StarsView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.walmart.android.app.shop:
//            ShelfPriceView, ShelfUtils

public class ShelfItemView extends RelativeLayout
{

    public static final String TAG = com/walmart/android/app/shop/ShelfItemView.getSimpleName();
    private static final Pattern sPriceVariesByStorePattern = Pattern.compile("^Price varies by store.*$", 2);
    private TextView mAisleDepartmentView;
    private TextView mAisleLocationView;
    private View mBestSellerOverlay;
    private ImageView mImageView;
    private TextView mListPriceView;
    private View mLocationContainer;
    private TextView mPpuView;
    private TextView mPricePrefixView;
    private ShelfPriceView mPriceView;
    private TextView mReviewCountView;
    private TextView mSellerNameView;
    private TextView mSellerPrefixView;
    private View mShippingPassView;
    private View mSoldOutOverlay;
    private TextView mSpecialPriceTypeView;
    private StarsView mStarsView;
    private TextView mStockStatusView;
    private TextView mTitleView;

    public ShelfItemView(Context context)
    {
        super(context);
    }

    public ShelfItemView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ShelfItemView(Context context, AttributeSet attributeset, int i)
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
        mSellerNameView = (TextView)findViewById(0x7f100568);
        mSellerPrefixView = (TextView)findViewById(0x7f100567);
        mShippingPassView = findViewById(0x7f10017f);
        mAisleLocationView = (TextView)findViewById(0x7f100180);
        mAisleDepartmentView = (TextView)findViewById(0x7f100182);
        mPricePrefixView = (TextView)findViewById(0x7f10017b);
        mPriceView = (ShelfPriceView)findViewById(0x7f1000a8);
        mPpuView = (TextView)findViewById(0x7f10017c);
        mStockStatusView = (TextView)findViewById(0x7f100181);
        mListPriceView = (TextView)findViewById(0x7f100566);
        mSpecialPriceTypeView = (TextView)findViewById(0x7f10017d);
        mSoldOutOverlay = findViewById(0x7f1000b3);
        mBestSellerOverlay = findViewById(0x7f100565);
        mLocationContainer = findViewById(0x7f10017e);
        mSellerNameView.setTypeface(Typefaces.create(getContext(), com.walmart.android.wmui.Typefaces.Family.MEDIUM));
    }

    public void setInStoreItem(com.walmart.android.data.InStoreSearchResult.Result result)
    {
        if (result != null)
        {
            mPriceView.setPrice(result.getPriceString());
            mTitleView.setText(result.name);
            Object obj = result.getFirstAisle();
            float f;
            String s;
            ShelfPriceView shelfpriceview;
            int i;
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                mAisleLocationView.setText(getContext().getString(0x7f090551, new Object[] {
                    obj
                }));
                obj = result.getDepartmentName();
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    mAisleDepartmentView.setText(getContext().getString(0x7f090553, new Object[] {
                        obj
                    }));
                }
                mLocationContainer.setVisibility(0);
            } else
            {
                mLocationContainer.setVisibility(8);
            }
            obj = mTitleView;
            if (i != 0)
            {
                i = 2;
            } else
            {
                i = 3;
            }
            ((TextView) (obj)).setMaxLines(i);
            obj = result.getInventoryStatus();
            if (AvailabilityUtils.shouldDisplayStockStatus(getContext(), ((String) (obj))))
            {
                obj = AvailabilityUtils.getStockString(getContext(), ((String) (obj)));
                mStockStatusView.setVisibility(0);
                mStockStatusView.setText(((CharSequence) (obj)));
            } else
            {
                mStockStatusView.setVisibility(8);
            }
            mListPriceView.setVisibility(8);
            mSpecialPriceTypeView.setVisibility(8);
            f = result.getRating();
            if (f > 0.0F)
            {
                mStarsView.setVisibility(0);
                mStarsView.setValue(f);
            } else
            {
                mStarsView.setVisibility(4);
            }
            i = result.getNbrReviews();
            if (i > 0)
            {
                mReviewCountView.setText(getContext().getString(0x7f090557, new Object[] {
                    Integer.valueOf(result.getNbrReviews())
                }));
            }
            obj = mReviewCountView;
            if (i > 0)
            {
                i = 0;
            } else
            {
                i = 4;
            }
            ((TextView) (obj)).setVisibility(i);
            s = result.getPriceUnit();
            shelfpriceview = mPriceView;
            if (!TextUtils.isEmpty(s))
            {
                obj = result.getPriceUnit();
            } else
            {
                obj = null;
            }
            shelfpriceview.setUnit(((String) (obj)));
            if (TextUtils.isEmpty(s) && PricePerUnitUtils.shouldDisplayShelfPPU(result))
            {
                obj = result.getFormattedPricePerUnit();
                mPpuView.setText(((CharSequence) (obj)));
                TextView textview = mPpuView;
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    i = 0;
                } else
                {
                    i = 8;
                }
                textview.setVisibility(i);
            } else
            {
                mPpuView.setText("");
                mPpuView.setVisibility(8);
            }
            Picasso.with(getContext()).load(result.getThumbNailUrl()).error(0x7f02021b).into(mImageView);
        }
    }

    public void setItem(com.walmart.android.data.StoreQueryResult.Item item, boolean flag, boolean flag1)
    {
        mTitleView.setText(ShelfUtils.fromHtml(item.getName()));
        Object obj;
        int i;
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
        mStarsView.setValue(item.getRating());
        obj = mStarsView;
        if (item.getRating() > 0.0F)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        ((StarsView) (obj)).setVisibility(i);
        i = item.getNbrReviews();
        if (i > 0)
        {
            mReviewCountView.setText(getContext().getString(0x7f090557, new Object[] {
                Integer.valueOf(item.getNbrReviews())
            }));
        }
        obj = mReviewCountView;
        if (i > 0)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        ((TextView) (obj)).setVisibility(i);
        obj = mShippingPassView;
        if (flag1 && item.shippingPassEligible())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
        if (flag && !item.isAvailableOnline() && !item.isPutEligible())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        obj = mSoldOutOverlay;
        if (i != 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
        obj = mBestSellerOverlay;
        if (TextUtils.isEmpty(item.bestSellerSubcat))
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((View) (obj)).setVisibility(i);
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
                mSpecialPriceTypeView.setText(0x7f090561);
                mSpecialPriceTypeView.setTypeface(Typefaces.create(getContext(), com.walmart.android.wmui.Typefaces.Family.MEDIUM));
            } else
            if (flag)
            {
                mPriceView.setVisibility(8);
                mPricePrefixView.setVisibility(8);
                mSpecialPriceTypeView.setVisibility(0);
                mSpecialPriceTypeView.setText(0x7f09055b);
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
            obj = item.getFormattedPricePerUnit(true);
            mPpuView.setText(((CharSequence) (obj)));
            textview = mPpuView;
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                i = 0;
            } else
            {
                i = 8;
            }
            textview.setVisibility(i);
        } else
        {
            mPpuView.setText("");
            mPpuView.setVisibility(8);
        }
        Picasso.with(getContext()).load(ShelfUtils.getImageUrlFromThumbnailUrl(item.getImageThumbnailUrl())).error(0x7f02021b).tag(TAG).into(mImageView);
    }

}
