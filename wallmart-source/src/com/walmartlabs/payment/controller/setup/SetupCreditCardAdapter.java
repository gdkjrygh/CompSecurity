// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.setup;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import com.walmartlabs.payment.controller.methods.CreditCardAdapter;
import com.walmartlabs.ui.recycler.BasicViewHolder;

public class SetupCreditCardAdapter extends CreditCardAdapter
{

    private final Context mContext;

    public SetupCreditCardAdapter(Context context)
    {
        super(context);
        mContext = context;
        mFormatterCCNumber = mContext.getResources().getString(com.walmartlabs.android.payment.R.string.mpay_setup_cc_digit_formatter);
    }

    public com.walmartlabs.payment.controller.methods.CreditCardAdapter.CreditCardViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return new com.walmartlabs.payment.controller.methods.CreditCardAdapter.CreditCardViewHolder(LayoutInflater.from(mContext).inflate(com.walmartlabs.android.payment.R.layout.mpay_setup_item_cc, viewgroup, false));
    }

    public volatile BasicViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return onConstructViewHolder(viewgroup, i);
    }

    public void onPopulateViewHolder(com.walmartlabs.payment.controller.methods.CreditCardAdapter.CreditCardViewHolder creditcardviewholder, final int position)
    {
        super.onPopulateViewHolder(creditcardviewholder, position);
        RadioButton radiobutton = creditcardviewholder.radioSelected;
        boolean flag;
        if (getSelectedItemIndex() == position)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        radiobutton.setChecked(flag);
        creditcardviewholder.radioSelected.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final SetupCreditCardAdapter this$0;
            final int val$position;

            public void onCheckedChanged(CompoundButton compoundbutton, boolean flag1)
            {
                if (flag1)
                {
                    setSelectedItem(position);
                }
            }

            
            {
                this$0 = SetupCreditCardAdapter.this;
                position = i;
                super();
            }
        });
    }

    public volatile void onPopulateViewHolder(BasicViewHolder basicviewholder, int i)
    {
        onPopulateViewHolder((com.walmartlabs.payment.controller.methods.CreditCardAdapter.CreditCardViewHolder)basicviewholder, i);
    }
}
