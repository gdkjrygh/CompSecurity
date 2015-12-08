// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.StarsView;

public class RecommendedItemsView extends RelativeLayout
{

    private LinearLayout mThumbnailContainer;
    private TextView mTitle;

    public RecommendedItemsView(Context context)
    {
        super(context);
    }

    public RecommendedItemsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public RecommendedItemsView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public RecommendedItemsView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
    }

    private void setStarRating(ViewGroup viewgroup, float f)
    {
        viewgroup = (StarsView)ViewUtil.findViewById(viewgroup, 0x7f10046b);
        if (f > 0.0F)
        {
            viewgroup.setValue(f);
            viewgroup.setVisibility(0);
            return;
        } else
        {
            viewgroup.setVisibility(8);
            return;
        }
    }

    public void addRecommendedItem(final String productName, String s, final String price, final float rating, final android.view.View.OnClickListener onClickListener)
    {
        final ViewGroup recommendationView = (ViewGroup)ViewUtil.inflate(getContext(), 0x7f040140, this);
        ImageView imageview = (ImageView)ViewUtil.findViewById(recommendationView, 0x7f100468);
        Picasso.with(getContext()).load(s).tag(this).into(imageview, new Callback() {

            final RecommendedItemsView this$0;
            final android.view.View.OnClickListener val$onClickListener;
            final String val$price;
            final String val$productName;
            final float val$rating;
            final ViewGroup val$recommendationView;

            public void onError()
            {
            }

            public void onSuccess()
            {
                ViewUtil.setText(0x7f10046a, recommendationView, productName);
                ViewUtil.setText(0x7f100469, recommendationView, price);
                setStarRating(recommendationView, rating);
                recommendationView.setOnClickListener(onClickListener);
                int i = ViewUtil.dpToPixels(5, getResources().getDisplayMetrics());
                android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                layoutparams.leftMargin = i;
                layoutparams.rightMargin = i;
                mThumbnailContainer.addView(recommendationView);
            }

            
            {
                this$0 = RecommendedItemsView.this;
                recommendationView = viewgroup;
                productName = s;
                price = s1;
                rating = f;
                onClickListener = onclicklistener;
                super();
            }
        });
    }

    public void clearRecommendedItems()
    {
        mThumbnailContainer.removeAllViews();
        Picasso.with(getContext()).cancelTag(this);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mTitle = (TextView)ViewUtil.findViewById(this, 0x7f1001ee);
        mThumbnailContainer = (LinearLayout)ViewUtil.findViewById(this, 0x7f1001f0);
    }

    public void setTitle(String s)
    {
        mTitle.setText(s);
    }


}
