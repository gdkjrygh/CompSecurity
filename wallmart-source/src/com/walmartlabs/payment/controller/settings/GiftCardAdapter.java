// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.settings;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.payment.model.GiftCard;
import com.walmartlabs.ui.recycler.BasicAdapter;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

class GiftCardAdapter extends BasicAdapter
{
    public static class GiftCardViewHolder extends BasicViewHolder
    {

        public final TextView cardBalance;
        public final TextView cardDigits;
        public final SwitchCompat cardSwitch;

        public GiftCardViewHolder(View view)
        {
            super(view);
            cardDigits = (TextView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.R.id.mpay_gc_digits);
            cardBalance = (TextView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.R.id.mpay_gc_balance);
            cardSwitch = (SwitchCompat)ViewUtil.findViewById(view, com.walmartlabs.android.payment.R.id.mpay_gc_switch);
        }
    }

    public static interface OnSwitchedListener
    {

        public abstract void onSwitched(int i, boolean flag);
    }


    private final Context mContext;
    private List mGiftCards;
    private OnSwitchedListener mOnSwitchedListener;
    private boolean mSwitchEnable;

    public GiftCardAdapter(Context context)
    {
        mContext = context;
    }

    public GiftCard getItem(int i)
    {
        return (GiftCard)mGiftCards.get(i);
    }

    public int getItemCount()
    {
        return mGiftCards.size();
    }

    public GiftCardViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return new GiftCardViewHolder(LayoutInflater.from(mContext).inflate(com.walmartlabs.android.payment.R.layout.mpay_gift_card_switch, viewgroup, false));
    }

    public volatile BasicViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return onConstructViewHolder(viewgroup, i);
    }

    public void onPopulateViewHolder(GiftCardViewHolder giftcardviewholder, final int position)
    {
        boolean flag = true;
        GiftCard giftcard = (GiftCard)mGiftCards.get(position);
        if (giftcard != null)
        {
            giftcardviewholder.cardBalance.setText(NumberFormat.getCurrencyInstance(Locale.US).format(giftcard.balance));
            giftcardviewholder.cardDigits.setText(mContext.getResources().getString(com.walmartlabs.android.payment.R.string.pm_credit_card_number_masked_short, new Object[] {
                giftcard.lastFour
            }));
            giftcardviewholder.cardSwitch.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

                final GiftCardAdapter this$0;
                final int val$position;

                public void onCheckedChanged(CompoundButton compoundbutton, boolean flag1)
                {
                    if (mOnSwitchedListener != null)
                    {
                        mOnSwitchedListener.onSwitched(position, flag1);
                    }
                }

            
            {
                this$0 = GiftCardAdapter.this;
                position = i;
                super();
            }
            });
            SwitchCompat switchcompat = giftcardviewholder.cardSwitch;
            if (giftcard.optOut)
            {
                flag = false;
            }
            switchcompat.setChecked(flag);
            giftcardviewholder.cardSwitch.setEnabled(mSwitchEnable);
        }
    }

    public volatile void onPopulateViewHolder(BasicViewHolder basicviewholder, int i)
    {
        onPopulateViewHolder((GiftCardViewHolder)basicviewholder, i);
    }

    public void setGiftCards(List list)
    {
        mGiftCards = list;
        notifyDataSetChanged();
    }

    public void setOnSwitchedListener(OnSwitchedListener onswitchedlistener)
    {
        mOnSwitchedListener = onswitchedlistener;
    }

    public void setSwitchEnable(boolean flag)
    {
        mSwitchEnable = flag;
        notifyDataSetChanged();
    }

}
