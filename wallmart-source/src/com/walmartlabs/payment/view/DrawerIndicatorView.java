// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.walmart.android.utils.ViewUtil;
import java.util.HashMap;
import java.util.Map;

public class DrawerIndicatorView extends FrameLayout
{
    public static final class CreditCardType extends Enum
    {

        private static final CreditCardType $VALUES[];
        public static final CreditCardType AMEX;
        public static final CreditCardType DISCOVER;
        public static final CreditCardType MC;
        public static final CreditCardType NONE;
        public static final CreditCardType VISA;
        public static final CreditCardType WMMASTERCARD;
        public static final CreditCardType WMUSGESTORECARD;

        public static CreditCardType valueOf(String s)
        {
            return (CreditCardType)Enum.valueOf(com/walmartlabs/payment/view/DrawerIndicatorView$CreditCardType, s);
        }

        public static CreditCardType[] values()
        {
            return (CreditCardType[])$VALUES.clone();
        }

        static 
        {
            AMEX = new CreditCardType("AMEX", 0);
            DISCOVER = new CreditCardType("DISCOVER", 1);
            MC = new CreditCardType("MC", 2);
            VISA = new CreditCardType("VISA", 3);
            WMUSGESTORECARD = new CreditCardType("WMUSGESTORECARD", 4);
            WMMASTERCARD = new CreditCardType("WMMASTERCARD", 5);
            NONE = new CreditCardType("NONE", 6);
            $VALUES = (new CreditCardType[] {
                AMEX, DISCOVER, MC, VISA, WMUSGESTORECARD, WMMASTERCARD, NONE
            });
        }

        private CreditCardType(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class GiftCardType extends Enum
    {

        private static final GiftCardType $VALUES[];
        public static final GiftCardType GIFT_CARD;
        public static final GiftCardType GIFT_CARD_ZERO;
        public static final GiftCardType NONE;

        public static GiftCardType valueOf(String s)
        {
            return (GiftCardType)Enum.valueOf(com/walmartlabs/payment/view/DrawerIndicatorView$GiftCardType, s);
        }

        public static GiftCardType[] values()
        {
            return (GiftCardType[])$VALUES.clone();
        }

        static 
        {
            GIFT_CARD = new GiftCardType("GIFT_CARD", 0);
            GIFT_CARD_ZERO = new GiftCardType("GIFT_CARD_ZERO", 1);
            NONE = new GiftCardType("NONE", 2);
            $VALUES = (new GiftCardType[] {
                GIFT_CARD, GIFT_CARD_ZERO, NONE
            });
        }

        private GiftCardType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String TAG = com/walmartlabs/payment/view/DrawerIndicatorView.getSimpleName();
    private ImageView mCardFirst;
    private ImageView mCardOnly;
    private ImageView mCardSecond;
    private CreditCardType mCreditCard;
    private Map mCreditCardMap;
    private Drawable mDrawableError;
    private Drawable mDrawableGiftCard;
    private Drawable mDrawableGiftCardZero;
    private GiftCardType mGiftCard;

    public DrawerIndicatorView(Context context)
    {
        this(context, null);
    }

    public DrawerIndicatorView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DrawerIndicatorView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        View.inflate(context, com.walmartlabs.android.payment.R.layout.drawer_indicator_layout, this);
        attributeset = context.getResources().getDrawable(com.walmartlabs.android.payment.R.drawable.card_amex_small);
        Drawable drawable = context.getResources().getDrawable(com.walmartlabs.android.payment.R.drawable.card_discover_small);
        Drawable drawable1 = context.getResources().getDrawable(com.walmartlabs.android.payment.R.drawable.card_mc_small);
        Drawable drawable2 = context.getResources().getDrawable(com.walmartlabs.android.payment.R.drawable.card_visa_small);
        Drawable drawable3 = context.getResources().getDrawable(com.walmartlabs.android.payment.R.drawable.card_walmart_small);
        Drawable drawable4 = context.getResources().getDrawable(com.walmartlabs.android.payment.R.drawable.card_walmart_mc_small);
        mDrawableGiftCard = context.getResources().getDrawable(com.walmartlabs.android.payment.R.drawable.card_gc_small);
        mDrawableGiftCardZero = context.getResources().getDrawable(com.walmartlabs.android.payment.R.drawable.card_gc_zero_small);
        mDrawableError = context.getResources().getDrawable(com.walmartlabs.android.payment.R.drawable.card_error_small);
        mCreditCardMap = new HashMap(CreditCardType.values().length);
        mCreditCardMap.put(CreditCardType.AMEX, attributeset);
        mCreditCardMap.put(CreditCardType.DISCOVER, drawable);
        mCreditCardMap.put(CreditCardType.MC, drawable1);
        mCreditCardMap.put(CreditCardType.VISA, drawable2);
        mCreditCardMap.put(CreditCardType.WMUSGESTORECARD, drawable3);
        mCreditCardMap.put(CreditCardType.WMMASTERCARD, drawable4);
        mCreditCardMap.put(CreditCardType.NONE, null);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mCardFirst = (ImageView)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.indicator_card_front);
        mCardSecond = (ImageView)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.indicator_card_back);
        mCardOnly = (ImageView)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.indicator_card_center);
    }

    public void setCreditCard(CreditCardType creditcardtype, boolean flag)
    {
        if (flag)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        if (mCreditCard == CreditCardType.NONE || mGiftCard == GiftCardType.NONE) goto _L2; else goto _L1
_L1:
        mCreditCard = CreditCardType.NONE;
        mCardFirst.setImageDrawable(null);
        mCardSecond.setImageDrawable(null);
        ImageView imageview = mCardOnly;
        if (mGiftCard == GiftCardType.GIFT_CARD)
        {
            creditcardtype = mDrawableGiftCard;
        } else
        {
            creditcardtype = mDrawableGiftCardZero;
        }
        imageview.setImageDrawable(creditcardtype);
_L4:
        return;
_L2:
        if (mCreditCard == CreditCardType.NONE) goto _L4; else goto _L3
_L3:
        mCardOnly.setImageDrawable(mDrawableError);
        mCreditCard = CreditCardType.NONE;
        return;
        if (mGiftCard != GiftCardType.NONE)
        {
            mCardOnly.setImageDrawable(null);
            ImageView imageview1 = mCardFirst;
            Drawable drawable;
            if (mGiftCard == GiftCardType.GIFT_CARD)
            {
                drawable = mDrawableGiftCard;
            } else
            {
                drawable = mDrawableGiftCardZero;
            }
            imageview1.setImageDrawable(drawable);
            mCardSecond.setImageDrawable((Drawable)mCreditCardMap.get(creditcardtype));
        } else
        {
            mCardOnly.setImageDrawable((Drawable)mCreditCardMap.get(creditcardtype));
        }
        mCreditCard = creditcardtype;
        return;
    }

    public void setGiftCard(float f, boolean flag)
    {
        if (flag)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        if (mGiftCard == GiftCardType.NONE || mCreditCard == CreditCardType.NONE) goto _L2; else goto _L1
_L1:
        mGiftCard = GiftCardType.NONE;
        mCardFirst.setImageDrawable(null);
        mCardSecond.setImageDrawable(null);
        mCardOnly.setImageDrawable((Drawable)mCreditCardMap.get(mCreditCard));
_L4:
        return;
_L2:
        if (mGiftCard == GiftCardType.NONE) goto _L4; else goto _L3
_L3:
        mCardOnly.setImageDrawable(mDrawableError);
        mGiftCard = GiftCardType.NONE;
        return;
        Drawable drawable;
        if (f > 0.0F)
        {
            drawable = mDrawableGiftCard;
            mGiftCard = GiftCardType.GIFT_CARD;
        } else
        {
            drawable = mDrawableGiftCardZero;
            mGiftCard = GiftCardType.GIFT_CARD_ZERO;
        }
        if (mCreditCard != CreditCardType.NONE)
        {
            mCardOnly.setImageDrawable(null);
            mCardFirst.setImageDrawable(drawable);
            mCardSecond.setImageDrawable((Drawable)mCreditCardMap.get(mCreditCard));
            return;
        } else
        {
            mCardOnly.setImageDrawable(drawable);
            return;
        }
    }

}
