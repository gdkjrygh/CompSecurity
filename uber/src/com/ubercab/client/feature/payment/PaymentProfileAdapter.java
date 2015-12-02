// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import cev;
import com.ubercab.client.core.vendor.google.GoogleWalletActivity;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.model.Profile;
import com.ubercab.rider.realtime.model.RewardInfo;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.ui.TextView;
import dui;
import eqk;
import eyy;
import java.util.ArrayList;
import java.util.List;

public final class PaymentProfileAdapter extends BaseAdapter
{

    private PaymentProfile a;
    private List b;
    private String c;
    private PaymentProfile d;
    private final cev e;
    private final Context f;
    private final boolean g;
    private final LayoutInflater h;
    private final int i;
    private final eyy j;
    private final boolean k;
    private final boolean l;
    private final boolean m;

    public PaymentProfileAdapter(cev cev, Context context, int i1, PaymentProfile paymentprofile, boolean flag, eyy eyy1)
    {
label0:
        {
            boolean flag1 = false;
            super();
            b = new ArrayList();
            e = cev;
            f = context;
            h = LayoutInflater.from(context);
            i = i1;
            a = paymentprofile;
            d = paymentprofile;
            g = flag;
            j = eyy1;
            if (i1 == 1 || i1 == 2 || i1 == 4 || i1 == 7)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l = flag;
            if (i1 == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            m = flag;
            if (!j.f() && !j.h())
            {
                flag = flag1;
                if (!j.g())
                {
                    break label0;
                }
            }
            flag = true;
        }
        k = flag;
    }

    static Context a(PaymentProfileAdapter paymentprofileadapter)
    {
        return paymentprofileadapter.f;
    }

    private View a(int i1, PaymentProfile paymentprofile, ViewGroup viewgroup)
    {
        if (dui.b(paymentprofile))
        {
            viewgroup = h.inflate(0x7f03011d, viewgroup, false);
            paymentprofile = new MobileWalletViewHolder(viewgroup, l, m);
        } else
        if (!c(paymentprofile))
        {
            viewgroup = h.inflate(0x7f03011c, viewgroup, false);
            paymentprofile = new ItemViewHolder(viewgroup, l, m);
        } else
        if (i1 == 1 && b(paymentprofile))
        {
            viewgroup = h.inflate(0x7f03011f, viewgroup, false);
            paymentprofile = new RewardsToggleViewHolder(viewgroup);
        } else
        if (i1 == 0)
        {
            viewgroup = h.inflate(0x7f03011e, viewgroup, false);
            paymentprofile = new EnrollmentStatusViewHolder(viewgroup);
        } else
        {
            viewgroup = h.inflate(0x7f03011c, viewgroup, false);
            paymentprofile = new ItemViewHolder(viewgroup, l, m);
        }
        viewgroup.setTag(paymentprofile);
        return viewgroup;
    }

    static void a(PaymentProfileAdapter paymentprofileadapter, PaymentProfile paymentprofile, TextView textview)
    {
        paymentprofileadapter.a(paymentprofile, textview);
    }

    private void a(PaymentProfile paymentprofile, TextView textview)
    {
        if (j.f() && (i == 1 || i == 2))
        {
            int i1;
            if (paymentprofile.getUuid().equals(j.b().getDefaultPaymentProfileUuid()))
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            textview.setVisibility(i1);
        }
    }

    private static boolean a(Context context)
    {
        return GoogleWalletActivity.a(context, null);
    }

    private int b()
    {
        return i;
    }

    static eyy b(PaymentProfileAdapter paymentprofileadapter)
    {
        return paymentprofileadapter.j;
    }

    private static boolean b(PaymentProfile paymentprofile)
    {
        paymentprofile = paymentprofile.getRewardInfo();
        return paymentprofile != null && paymentprofile.isEnrolled();
    }

    static String c(PaymentProfileAdapter paymentprofileadapter)
    {
        return paymentprofileadapter.c;
    }

    private static boolean c(PaymentProfile paymentprofile)
    {
        paymentprofile = paymentprofile.getRewardInfo();
        return paymentprofile != null && paymentprofile.isEligible();
    }

    static boolean d(PaymentProfileAdapter paymentprofileadapter)
    {
        return paymentprofileadapter.g;
    }

    static cev e(PaymentProfileAdapter paymentprofileadapter)
    {
        return paymentprofileadapter.e;
    }

    public final PaymentProfile a()
    {
        return d;
    }

    public final void a(Client client, Trip trip)
    {
        boolean flag;
        if (client != null && !TextUtils.isEmpty(client.getUuid()) && client.getPaymentProfiles() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        b.clear();
        notifyDataSetChanged();
_L4:
        return;
_L2:
        Object obj = new ArrayList(client.getPaymentProfiles());
        if (k)
        {
            obj = dui.a(client.getPaymentProfiles());
        }
        if (a(f) && b() != 5 && b() != 6)
        {
            ((List) (obj)).add(com.ubercab.client.core.model.PaymentProfile.GOOGLE_WALLET);
        }
        b = ((List) (obj));
        if (i != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (trip == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        trip = trip.getPaymentProfileUUID();
        if (TextUtils.isEmpty(trip))
        {
            d = null;
            a = null;
            notifyDataSetChanged();
            return;
        }
        boolean flag1;
        if (a == d)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (d == null || flag1)
        {
            client = client.findPaymentProfileByUuid(trip);
            if (client != null)
            {
                d = client;
            } else
            {
                d = com.ubercab.client.core.model.PaymentProfile.GOOGLE_WALLET;
            }
            a = d;
        }
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        notifyDataSetChanged();
        return;
    }

    public final void a(PaymentProfile paymentprofile)
    {
        d = paymentprofile;
        notifyDataSetChanged();
    }

    public final void a(String s)
    {
        c = s;
    }

    public final int getCount()
    {
        return b.size();
    }

    public final Object getItem(int i1)
    {
        return b.get(i1);
    }

    public final long getItemId(int i1)
    {
        return (long)i1;
    }

    public final int getItemViewType(int i1)
    {
        PaymentProfile paymentprofile = (PaymentProfile)getItem(i1);
        if (dui.b(paymentprofile))
        {
            return 1;
        }
        if (i == 0)
        {
            if (c(paymentprofile))
            {
                return 2;
            }
        } else
        if (i == 1 && b(paymentprofile))
        {
            return 3;
        }
        return 0;
    }

    public final View getView(int i1, View view, ViewGroup viewgroup)
    {
        PaymentProfile paymentprofile = (PaymentProfile)getItem(i1);
        View view1 = view;
        if (view == null)
        {
            view1 = a(i, paymentprofile, viewgroup);
        }
        ((eqk)view1.getTag()).a(paymentprofile, b, d);
        return view1;
    }

    public final int getViewTypeCount()
    {
        return 4;
    }

    private class MobileWalletViewHolder extends ItemViewHolder
        implements eqk
    {
        private class ItemViewHolder
            implements eqk
        {

            final PaymentProfileAdapter a;
            private boolean b;
            TextView mDefaultTextView;
            ImageView mImageViewCheck;
            RadioButton mRadioButtonItem;
            TextView mTextView;

            public void a(PaymentProfile paymentprofile, List list, PaymentProfile paymentprofile1)
            {
                boolean flag1 = true;
                int i1 = 0;
                Object obj = esj.a(mTextView.getContext(), paymentprofile.getCardType());
                mTextView.setCompoundDrawablesWithIntrinsicBounds(((android.graphics.drawable.Drawable) (obj)), null, null, null);
                obj = mTextView;
                Context context = PaymentProfileAdapter.a(a);
                boolean flag;
                if (!PaymentProfileAdapter.b(a).f())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((TextView) (obj)).setText(dui.a(context, paymentprofile, list, flag));
                PaymentProfileAdapter.a(a, paymentprofile, mDefaultTextView);
                if (paymentprofile1 != null && paymentprofile.getUuid().equals(paymentprofile1.getUuid()))
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                mRadioButtonItem.setChecked(flag);
                if (b)
                {
                    paymentprofile = mImageViewCheck;
                    if (!flag)
                    {
                        i1 = 8;
                    }
                    paymentprofile.setVisibility(i1);
                }
            }

            ItemViewHolder(View view, boolean flag, boolean flag1)
            {
                boolean flag2 = false;
                a = PaymentProfileAdapter.this;
                super();
                ButterKnife.inject(this, view);
                b = flag1;
                paymentprofileadapter = mRadioButtonItem;
                int i1;
                if (flag)
                {
                    i1 = 0;
                } else
                {
                    i1 = 8;
                }
                setVisibility(i1);
                paymentprofileadapter = mImageViewCheck;
                if (flag1)
                {
                    i1 = ((flag2) ? 1 : 0);
                } else
                {
                    i1 = 8;
                }
                setVisibility(i1);
            }
        }


        final PaymentProfileAdapter b;
        ProgressBar mProgressBarCurrentBalanceRequest;
        RadioButton mRadioButtonItem;
        TextView mTextViewCurrentBalanceValue;

        public final void a(PaymentProfile paymentprofile, List list, PaymentProfile paymentprofile1)
        {
            super.a(paymentprofile, list, paymentprofile1);
            if (PaymentProfileAdapter.c(b) != null)
            {
                mProgressBarCurrentBalanceRequest.setVisibility(8);
            } else
            {
                mProgressBarCurrentBalanceRequest.setVisibility(0);
            }
            mTextViewCurrentBalanceValue.setText(PaymentProfileAdapter.c(b));
            PaymentProfileAdapter.a(b, paymentprofile, mDefaultTextView);
        }

        MobileWalletViewHolder(View view, boolean flag, boolean flag1)
        {
            b = PaymentProfileAdapter.this;
            super(view, flag, flag1);
        }
    }


    private class RewardsToggleViewHolder
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

        RewardsToggleViewHolder(View view)
        {
            a = PaymentProfileAdapter.this;
            super();
            ButterKnife.inject(this, view);
        }
    }


    private class EnrollmentStatusViewHolder
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
            int i1 = 1;
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
                i1 = 0;
            }
            list = mImageViewCheck;
            if (i1 != 0)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            list.setVisibility(i1);
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

        EnrollmentStatusViewHolder(View view)
        {
            a = PaymentProfileAdapter.this;
            super();
            ButterKnife.inject(this, view);
        }
    }

}
