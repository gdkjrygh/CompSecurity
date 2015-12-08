// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.payment.model.CreditCard;
import com.walmartlabs.payment.model.CreditCardsModel;

// Referenced classes of package com.walmartlabs.payment.view:
//            CreditCardIconView

public class OneLineCreditCardView extends LinearLayout
{

    private TextView mDigits;
    private TextView mExpires;
    private CreditCardIconView mIcon;

    public OneLineCreditCardView(Context context)
    {
        super(context);
    }

    public OneLineCreditCardView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public OneLineCreditCardView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public OneLineCreditCardView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (getChildCount() == 0)
        {
            View.inflate(getContext(), com.walmartlabs.android.payment.R.layout.pm_one_line_credit_card, this);
        }
        mIcon = (CreditCardIconView)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_cc_icon);
        mDigits = (TextView)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_cc_digits);
        mExpires = (TextView)ViewUtil.findViewById(this, com.walmartlabs.android.payment.R.id.pm_cc_expiry);
    }

    public void setCreditCard(CreditCard creditcard)
    {
        mIcon.setCardType(creditcard.getCardType());
        mDigits.setText(getContext().getString(com.walmartlabs.android.payment.R.string.pm_credit_card_number_masked_short, new Object[] {
            creditcard.getLastFour()
        }));
        creditcard = CreditCardsModel.createExpiryDate(creditcard);
        if (TextUtils.isEmpty(creditcard))
        {
            mExpires.setVisibility(8);
            return;
        } else
        {
            mExpires.setVisibility(0);
            mExpires.setText(getContext().getString(com.walmartlabs.android.payment.R.string.pm_methods_cc_expy, new Object[] {
                creditcard
            }));
            return;
        }
    }
}
