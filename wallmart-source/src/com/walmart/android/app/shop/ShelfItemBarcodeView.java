// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.walmart.android.data.StoreAvailabilityData;
import com.walmart.android.ui.ImageViewExtended;
import com.walmart.android.util.AvailabilityUtils;
import com.walmart.android.wmui.Typefaces;
import com.walmartlabs.utils.WLog;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.walmart.android.app.shop:
//            ShelfPriceView, ShelfUtils

public class ShelfItemBarcodeView extends RelativeLayout
{

    public static final String TAG = com/walmart/android/app/shop/ShelfItemBarcodeView.getSimpleName();
    private static final Pattern sPriceVariesByStorePattern = Pattern.compile("^Price varies by store.*$", 2);
    private ImageViewExtended mImageView;
    private ShelfPriceView mPriceView;
    private View mSoldOutOverlay;
    private TextView mStockAddressView;
    private TextView mStockStatusView;
    private TextView mTitleView;

    public ShelfItemBarcodeView(Context context)
    {
        super(context);
    }

    public ShelfItemBarcodeView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ShelfItemBarcodeView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mImageView = (ImageViewExtended)findViewById(0x7f100569);
        mTitleView = (TextView)findViewById(0x7f10056a);
        mPriceView = (ShelfPriceView)findViewById(0x7f10056d);
        mStockStatusView = (TextView)findViewById(0x7f10056b);
        mStockAddressView = (TextView)findViewById(0x7f10056c);
        mSoldOutOverlay = findViewById(0x7f1000b3);
    }

    public void setItem(com.walmart.android.data.StoreQueryResult.Item item, boolean flag, StoreAvailabilityData storeavailabilitydata)
    {
        mTitleView.setText(ShelfUtils.fromHtml(item.getName()));
        Object obj;
        int i;
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
        obj = item.getPrice();
        if (obj != null)
        {
            if (item.isSubMarketPrice())
            {
                mPriceView.setVisibility(8);
            } else
            if (sPriceVariesByStorePattern.matcher(((CharSequence) (obj))).matches())
            {
                mPriceView.setVisibility(8);
            } else
            {
                mPriceView.setVisibility(0);
                mPriceView.setPrice(((String) (obj)));
            }
        } else
        {
            mPriceView.setVisibility(8);
        }
        if (storeavailabilitydata != null)
        {
            mStockStatusView.setText(AvailabilityUtils.getStockString(getContext(), storeavailabilitydata.stockStatus));
            mStockStatusView.setTypeface(Typefaces.create(getContext(), com.walmart.android.wmui.Typefaces.Family.MEDIUM));
            mStockStatusView.setVisibility(0);
            mStockAddressView.setText((new StringBuilder()).append(" at ").append(storeavailabilitydata.storeAddress).toString());
            mStockAddressView.setVisibility(0);
        } else
        {
            WLog.d(TAG, "not available");
            mPriceView.setVisibility(8);
            mStockStatusView.setVisibility(8);
            mStockAddressView.setVisibility(8);
        }
        Picasso.with(getContext()).load(item.getImageThumbnailUrl()).error(0x7f02021b).tag(TAG).into(mImageView);
    }

}
