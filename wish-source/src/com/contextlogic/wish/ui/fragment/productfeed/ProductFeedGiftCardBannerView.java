// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishCredit;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.util.BitmapUtil;
import com.contextlogic.wish.util.DateUtil;

public class ProductFeedGiftCardBannerView extends FrameLayout
{

    private TextView giftCardValueText;

    public ProductFeedGiftCardBannerView(Context context)
    {
        this(context, null);
    }

    public ProductFeedGiftCardBannerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ProductFeedGiftCardBannerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030084, this);
        setBackgroundColor(getResources().getColor(0x7f0c00a9));
        giftCardValueText = (TextView)view.findViewById(0x7f0d0271);
        BitmapUtil.safeSetImageResource((ImageView)view.findViewById(0x7f0d0270), 0x7f0200ef);
    }

    public void handlePause()
    {
    }

    public void handleResume()
    {
    }

    public void setCredit(WishCredit wishcredit)
    {
        (new LogService()).requestService(Integer.toString(WishAnalyticsEvent.IMPRESSION_MOBILE_CREDIT_BANNER.getValue()), null, null, null);
        boolean flag;
        if (wishcredit.getValue().getValue() >= 1.0D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (wishcredit.getCustomTitle() != null && !wishcredit.getCustomTitle().trim().equals(""))
        {
            giftCardValueText.setText(wishcredit.getCustomTitle());
            return;
        }
        if (wishcredit.getExpiryDate() != null && wishcredit.getMinimumPurchase() != null && wishcredit.getMinimumPurchase().getValue() > 0.0D)
        {
            CharSequence charsequence = DateUtil.format("MMM d", wishcredit.getExpiryDate());
            giftCardValueText.setText(String.format(getContext().getString(0x7f060211), new Object[] {
                wishcredit.getValue().toFormattedString(false, flag), charsequence, wishcredit.getMinimumPurchase().toFormattedString()
            }));
            return;
        }
        if (wishcredit.getExpiryDate() != null)
        {
            CharSequence charsequence1 = DateUtil.format("MMM d", wishcredit.getExpiryDate());
            giftCardValueText.setText(String.format(getContext().getString(0x7f06020f), new Object[] {
                wishcredit.getValue().toFormattedString(false, flag), charsequence1
            }));
            return;
        }
        if (wishcredit.getMinimumPurchase() != null && wishcredit.getMinimumPurchase().getValue() > 0.0D)
        {
            giftCardValueText.setText(String.format(getContext().getString(0x7f060212), new Object[] {
                wishcredit.getValue().toFormattedString(false, flag), wishcredit.getMinimumPurchase().toFormattedString()
            }));
            return;
        } else
        {
            giftCardValueText.setText(String.format(getContext().getString(0x7f06020e), new Object[] {
                wishcredit.getValue().toFormattedString(false, flag)
            }));
            return;
        }
    }
}
