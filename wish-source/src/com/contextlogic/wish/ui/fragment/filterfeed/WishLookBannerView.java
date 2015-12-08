// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.filterfeed;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishWishLookBannerSpec;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.ui.activity.root.RootActivity;

public class WishLookBannerView extends LinearLayout
{

    private View socialArea;
    private TextView socialText;
    private TextView subtitle;
    private TextView title;
    private WishWishLookBannerSpec wishLookBannerSpec;

    public WishLookBannerView(Context context)
    {
        this(context, null);
    }

    public WishLookBannerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void handleClick()
    {
        if (wishLookBannerSpec.getSocialText() != null)
        {
            (new LogService()).requestService(Integer.toString(WishAnalyticsEvent.CLICK_WISHLOOK_BANNER.getValue()), null, null, null);
            ((RootActivity)getContext()).showShareDialog(null, wishLookBannerSpec.getShareContent());
        }
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0300d5, this);
        title = (TextView)view.findViewById(0x7f0d0438);
        subtitle = (TextView)view.findViewById(0x7f0d0439);
        socialText = (TextView)view.findViewById(0x7f0d043a);
        socialArea = view.findViewById(0x7f0d043b);
        setGravity(17);
        setBackgroundResource(0x7f0201ca);
        setOrientation(1);
        setOnClickListener(new android.view.View.OnClickListener() {

            final WishLookBannerView this$0;

            public void onClick(View view1)
            {
                handleClick();
            }

            
            {
                this$0 = WishLookBannerView.this;
                super();
            }
        });
    }

    public int getBannerHeight()
    {
        return (int)TypedValue.applyDimension(1, 189F, getResources().getDisplayMetrics());
    }

    public void setBannerSpec(WishWishLookBannerSpec wishwishlookbannerspec)
    {
        wishLookBannerSpec = wishwishlookbannerspec;
        title.setText(wishwishlookbannerspec.getTitle());
        subtitle.setText(wishwishlookbannerspec.getSubtitle());
        if (wishwishlookbannerspec.getSocialText() != null)
        {
            socialArea.setVisibility(0);
            socialText.setText(wishwishlookbannerspec.getSocialText());
            socialText.setVisibility(0);
            return;
        } else
        {
            socialArea.setVisibility(8);
            socialText.setVisibility(8);
            return;
        }
    }

}
