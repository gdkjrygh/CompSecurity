// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.methods;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.payment.model.CreditCard;
import com.walmartlabs.payment.model.CreditCardsModel;
import com.walmartlabs.payment.view.CreditCardIconView;
import com.walmartlabs.ui.recycler.BasicAdapter;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import java.util.Collections;
import java.util.List;

public class CreditCardAdapter extends BasicAdapter
{
    public static class CreditCardViewHolder extends BasicViewHolder
    {

        public final ImageView btnSelected;
        public final TextView cardCustomer;
        public final TextView cardDigits;
        public final TextView cardExpiryDate;
        public final CreditCardIconView cardImage;
        public final TextView cardType;
        public final RadioButton radioSelected;

        public CreditCardViewHolder(View view)
        {
            super(view);
            cardImage = (CreditCardIconView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.R.id.pm_list_item_cc_icon);
            cardType = (TextView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.R.id.pm_list_item_cc_type);
            cardDigits = (TextView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.R.id.pm_list_item_cc_digits);
            cardExpiryDate = (TextView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.R.id.pm_list_item_cc_expiry);
            cardCustomer = (TextView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.R.id.pm_list_item_cc_customer);
            btnSelected = (ImageView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.R.id.pm_list_item_cc_check);
            radioSelected = (RadioButton)ViewUtil.findViewById(view, com.walmartlabs.android.payment.R.id.pm_list_item_cc_radio);
        }
    }


    private List mCreditCards;
    private final String mFormatterCCExpy;
    private final String mFormatterCCName;
    protected String mFormatterCCNumber;
    private final Handler mHandler;
    private int mSelectedIndex;

    public CreditCardAdapter(Context context)
    {
        this(context, Collections.emptyList());
    }

    public CreditCardAdapter(Context context, List list)
    {
        mCreditCards = Collections.emptyList();
        mSelectedIndex = 0;
        mCreditCards = list;
        mFormatterCCNumber = context.getResources().getString(com.walmartlabs.android.payment.R.string.pm_credit_card_number_masked_short);
        mFormatterCCName = context.getResources().getString(com.walmartlabs.android.payment.R.string.pm_methods_cc_name);
        mFormatterCCExpy = context.getResources().getString(com.walmartlabs.android.payment.R.string.pm_methods_cc_expy);
        mHandler = new Handler();
    }

    private String makeExpiryString(CreditCard creditcard)
    {
        creditcard = CreditCardsModel.createExpiryDate(creditcard);
        if (!TextUtils.isEmpty(creditcard))
        {
            return String.format(mFormatterCCExpy, new Object[] {
                creditcard
            });
        } else
        {
            return "";
        }
    }

    public CreditCard getItem(int i)
    {
        return (CreditCard)mCreditCards.get(i);
    }

    public int getItemCount()
    {
        if (mCreditCards != null)
        {
            return mCreditCards.size();
        } else
        {
            return 0;
        }
    }

    public CreditCard getSelectedItem()
    {
        if (mSelectedIndex < getItemCount())
        {
            return getItem(mSelectedIndex);
        } else
        {
            return null;
        }
    }

    public int getSelectedItemIndex()
    {
        return mSelectedIndex;
    }

    public CreditCardViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return new CreditCardViewHolder(ViewUtil.inflate(viewgroup.getContext(), com.walmartlabs.android.payment.R.layout.pm_list_item_cc, viewgroup));
    }

    public volatile BasicViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return onConstructViewHolder(viewgroup, i);
    }

    public void onPopulateViewHolder(CreditCardViewHolder creditcardviewholder, int i)
    {
        CreditCard creditcard = (CreditCard)mCreditCards.get(i);
        if (creditcardviewholder.cardDigits != null)
        {
            creditcardviewholder.cardDigits.setText(String.format(mFormatterCCNumber, new Object[] {
                creditcard.getLastFour()
            }));
        }
        if (creditcardviewholder.cardExpiryDate != null)
        {
            creditcardviewholder.cardExpiryDate.setText(makeExpiryString(creditcard));
        }
        if (creditcardviewholder.cardCustomer != null)
        {
            creditcardviewholder.cardCustomer.setText(String.format(mFormatterCCName, new Object[] {
                creditcard.getFirstName(), creditcard.getLastName()
            }));
        }
        if (creditcardviewholder.cardImage != null)
        {
            creditcardviewholder.cardImage.setCardType(creditcard.getCardType());
        }
    }

    public volatile void onPopulateViewHolder(BasicViewHolder basicviewholder, int i)
    {
        onPopulateViewHolder((CreditCardViewHolder)basicviewholder, i);
    }

    public void setCreditCards(List list)
    {
        mCreditCards = list;
        notifyDataSetChanged();
    }

    public void setSelectedItem(int i)
    {
        if (i != mSelectedIndex && i < getItemCount())
        {
            final int prevIndex = mSelectedIndex;
            mSelectedIndex = i;
            mHandler.post(new Runnable() {

                final CreditCardAdapter this$0;
                final int val$prevIndex;

                public void run()
                {
                    notifyItemChanged(prevIndex);
                    notifyItemChanged(mSelectedIndex);
                }

            
            {
                this$0 = CreditCardAdapter.this;
                prevIndex = i;
                super();
            }
            });
        }
    }

    public void setSelectedItem(CreditCard creditcard)
    {
        int i = 0;
        do
        {
            if (i >= mCreditCards.size() || ((CreditCard)mCreditCards.get(i)).getId().equals(creditcard.getId()))
            {
                if (i >= mCreditCards.size())
                {
                    i = 0;
                }
                setSelectedItem(i);
                return;
            }
            i++;
        } while (true);
    }

}
