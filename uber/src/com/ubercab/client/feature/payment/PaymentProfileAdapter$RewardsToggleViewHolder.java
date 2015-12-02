// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.RadioButton;
import butterknife.ButterKnife;
import cev;
import com.ubercab.rider.realtime.model.Balance;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.model.RewardInfo;
import com.ubercab.ui.TextView;
import dui;
import eqk;
import eqv;
import erm;
import esj;
import eyy;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.payment:
//            PaymentProfileAdapter

class a
    implements eqk
{

    final PaymentProfileAdapter a;
    private boolean b;
    private PaymentProfile c;
    CheckedTextView mCheckedTextViewEarn;
    CheckedTextView mCheckedTextViewUse;
    TextView mDefaultTextView;
    ImageView mImageViewCreditCard;
    ImageView mImageViewRewardsEarn;
    ImageView mImageViewRewardsStatus;
    RadioButton mRadioButtonOfTextViewEarning;
    TextView mTextViewEarning;
    TextView mTextViewPaymentName;
    TextView mTextViewPointBalance;
    TextView mTextViewRewardsEarn;
    ViewGroup mViewGroupListItem;
    ViewGroup mViewGroupRewardsEarn;
    ViewGroup mViewGroupRewardsUse;
    View mViewSeparator;

    private String a(Balance balance)
    {
        return (new eqv(PaymentProfileAdapter.a(a))).a(balance);
    }

    private void a()
    {
        mViewGroupListItem.setBackgroundResource(0x7f02025e);
        mViewGroupRewardsEarn.setBackgroundResource(0);
        mTextViewEarning.setVisibility(0);
        mImageViewRewardsStatus.setVisibility(8);
        mImageViewRewardsEarn.setVisibility(0);
        mCheckedTextViewEarn.setVisibility(8);
        mRadioButtonOfTextViewEarning.setVisibility(0);
        mViewGroupRewardsEarn.setClickable(false);
    }

    private void b()
    {
        mViewGroupListItem.setBackgroundResource(0);
        mViewGroupRewardsEarn.setBackgroundResource(0x7f02025e);
        mTextViewEarning.setVisibility(8);
        mImageViewRewardsStatus.setVisibility(0);
        mImageViewRewardsEarn.setVisibility(8);
        mCheckedTextViewEarn.setVisibility(0);
        mRadioButtonOfTextViewEarning.setVisibility(4);
        mViewGroupRewardsEarn.setClickable(true);
    }

    private void c()
    {
        mCheckedTextViewEarn.setChecked(false);
        mCheckedTextViewUse.setChecked(false);
        mRadioButtonOfTextViewEarning.setChecked(false);
    }

    public final void a(PaymentProfile paymentprofile, List list, PaymentProfile paymentprofile1)
    {
        c = paymentprofile;
        Context context = mTextViewPaymentName.getContext();
        Object obj = esj.a(context, paymentprofile.getCardType());
        mImageViewCreditCard.setImageDrawable(((android.graphics.drawable.Drawable) (obj)));
        obj = mTextViewPaymentName;
        Context context1 = PaymentProfileAdapter.a(a);
        boolean flag;
        boolean flag1;
        if (!PaymentProfileAdapter.b(a).f())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((TextView) (obj)).setText(dui.a(context1, paymentprofile, list, flag1));
        PaymentProfileAdapter.a(a, paymentprofile, mDefaultTextView);
        list = paymentprofile.getRewardInfo();
        if (list != null && (list.isEarnOnly() || list.usePointsDisabled()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        b = flag1;
        if (paymentprofile1 != null && paymentprofile.getUuid().equals(paymentprofile1.getUuid()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && b)
        {
            mRadioButtonOfTextViewEarning.setChecked(true);
        } else
        if (flag)
        {
            if (PaymentProfileAdapter.d(a))
            {
                mCheckedTextViewUse.setChecked(true);
            } else
            {
                mCheckedTextViewEarn.setChecked(true);
            }
        } else
        {
            c();
        }
        if (b)
        {
            mTextViewRewardsEarn.setText(context.getString(0x7f0701f0));
            a();
            mViewSeparator.setVisibility(8);
            mViewGroupRewardsUse.setVisibility(8);
            return;
        }
        mTextViewRewardsEarn.setText(context.getString(0x7f0701ed).toUpperCase());
        b();
        mCheckedTextViewUse.setText(context.getString(0x7f070640));
        mViewSeparator.setVisibility(0);
        mViewGroupRewardsUse.setVisibility(0);
        if (list.hasBalance())
        {
            paymentprofile = list.getBalance();
            mTextViewPointBalance.setText(a(((Balance) (paymentprofile))));
            return;
        } else
        {
            mTextViewPointBalance.setText(context.getString(0x7f070072));
            return;
        }
    }

    public void onClickEarn()
    {
        mCheckedTextViewEarn.setChecked(true);
        mCheckedTextViewUse.setChecked(false);
        PaymentProfileAdapter.e(a).c(new erm(c, false));
    }

    public void onClickPayment()
    {
        if (b)
        {
            mRadioButtonOfTextViewEarning.setChecked(true);
            PaymentProfileAdapter.e(a).c(new erm(c, false));
        }
    }

    public void onClickUse()
    {
        mCheckedTextViewEarn.setChecked(false);
        mCheckedTextViewUse.setChecked(true);
        PaymentProfileAdapter.e(a).c(new erm(c, true));
    }

    (PaymentProfileAdapter paymentprofileadapter, View view)
    {
        a = paymentprofileadapter;
        super();
        ButterKnife.inject(this, view);
    }
}
