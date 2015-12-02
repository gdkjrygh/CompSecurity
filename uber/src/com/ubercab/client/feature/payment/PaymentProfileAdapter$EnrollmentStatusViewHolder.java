// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.model.RewardInfo;
import com.ubercab.ui.TextView;
import dui;
import eqk;
import esj;
import eyy;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.payment:
//            PaymentProfileAdapter

class a
    implements eqk
{

    final PaymentProfileAdapter a;
    ImageView mImageViewCheck;
    ImageView mImageViewRewardsStatus;
    TextView mTextViewLearnMore;
    TextView mTextViewPaymentName;
    TextView mTextViewRewardsStatus;
    View mViewDivider;
    ViewGroup mViewGroupRewards;

    public final void a(PaymentProfile paymentprofile, List list, PaymentProfile paymentprofile1)
    {
        int i = 1;
        Context context = mTextViewPaymentName.getContext();
        Object obj = esj.a(context, paymentprofile.getCardType());
        mTextViewPaymentName.setCompoundDrawablesWithIntrinsicBounds(((android.graphics.drawable.Drawable) (obj)), null, null, null);
        obj = mTextViewPaymentName;
        Context context1 = PaymentProfileAdapter.a(a);
        boolean flag;
        if (!PaymentProfileAdapter.b(a).f())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((TextView) (obj)).setText(dui.a(context1, paymentprofile, list, flag));
        if (paymentprofile1 == null || !paymentprofile.getUuid().equals(paymentprofile1.getUuid()))
        {
            i = 0;
        }
        list = mImageViewCheck;
        if (i != 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        list.setVisibility(i);
        paymentprofile = paymentprofile.getRewardInfo();
        if (paymentprofile != null && paymentprofile.isEnrolled())
        {
            list = context.getResources().getDrawable(0x7f02026a);
            mImageViewRewardsStatus.setImageDrawable(list);
            mImageViewRewardsStatus.setVisibility(0);
            if (paymentprofile.isEarnOnly() || paymentprofile.usePointsDisabled())
            {
                mTextViewRewardsStatus.setText(context.getString(0x7f0701f0));
            } else
            {
                mTextViewRewardsStatus.setText(context.getString(0x7f0701ee));
            }
            mTextViewRewardsStatus.setVisibility(0);
            mTextViewLearnMore.setVisibility(8);
            mViewGroupRewards.setVisibility(0);
            return;
        }
        if (paymentprofile != null && paymentprofile.isEligible())
        {
            mImageViewRewardsStatus.setVisibility(8);
            mTextViewRewardsStatus.setText(context.getString(0x7f070255).toUpperCase());
            mTextViewRewardsStatus.setVisibility(0);
            mTextViewLearnMore.setText(context.getString(0x7f070290));
            mTextViewLearnMore.setVisibility(0);
            mViewDivider.setVisibility(0);
            mViewGroupRewards.setVisibility(0);
            return;
        } else
        {
            mViewDivider.setVisibility(8);
            mViewGroupRewards.setVisibility(8);
            return;
        }
    }

    Y(PaymentProfileAdapter paymentprofileadapter, View view)
    {
        a = paymentprofileadapter;
        super();
        ButterKnife.inject(this, view);
    }
}
