// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.methods;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.recycler.BasicAdapter;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import java.util.ArrayList;
import java.util.List;

public class AddressAdapter extends BasicAdapter
{
    public static class AddressViewHolder extends BasicViewHolder
    {

        public final RadioButton addressSelectedRadioButton;
        public final TextView addressText;

        public AddressViewHolder(View view)
        {
            super(view);
            addressText = (TextView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.R.id.pm_list_item_address_text);
            addressSelectedRadioButton = (RadioButton)ViewUtil.findViewById(view, com.walmartlabs.android.payment.R.id.pm_list_item_address_radio);
        }
    }


    private final List mAddresses = new ArrayList();
    private final Context mContext;
    private int mSelectedAddress;

    public AddressAdapter(Context context)
    {
        mSelectedAddress = 0;
        mContext = context;
    }

    public int getItemCount()
    {
        return mAddresses.size();
    }

    public com.walmartlabs.payment.model.CreditCardsModel.BillingAddress getSelectedAddress()
    {
        if (mSelectedAddress >= 0 && mSelectedAddress < mAddresses.size())
        {
            return (com.walmartlabs.payment.model.CreditCardsModel.BillingAddress)mAddresses.get(mSelectedAddress);
        } else
        {
            return null;
        }
    }

    public AddressViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return new AddressViewHolder(LayoutInflater.from(mContext).inflate(com.walmartlabs.android.payment.R.layout.pm_list_item_address, viewgroup, false));
    }

    public volatile BasicViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return onConstructViewHolder(viewgroup, i);
    }

    public void onPopulateViewHolder(AddressViewHolder addressviewholder, final int position)
    {
        boolean flag = true;
        com.walmartlabs.payment.model.CreditCardsModel.BillingAddress billingaddress = (com.walmartlabs.payment.model.CreditCardsModel.BillingAddress)mAddresses.get(position);
        if (billingaddress.addressLineTwo.isEmpty())
        {
            addressviewholder.addressText.setText(String.format("%s\n%s, %s %s", new Object[] {
                billingaddress.addressLineOne, billingaddress.city, billingaddress.state, billingaddress.postalCode
            }));
        } else
        {
            addressviewholder.addressText.setText(String.format("%s\n%s\n%s, %s %s", new Object[] {
                billingaddress.addressLineOne, billingaddress.addressLineTwo, billingaddress.city, billingaddress.state, billingaddress.postalCode
            }));
        }
        addressviewholder.addressSelectedRadioButton.setOnClickListener(new android.view.View.OnClickListener() {

            final AddressAdapter this$0;
            final int val$position;

            public void onClick(View view)
            {
                if (position != mSelectedAddress)
                {
                    setSelectedAddress(position);
                }
            }

            
            {
                this$0 = AddressAdapter.this;
                position = i;
                super();
            }
        });
        addressviewholder = addressviewholder.addressSelectedRadioButton;
        if (position != mSelectedAddress)
        {
            flag = false;
        }
        addressviewholder.setChecked(flag);
    }

    public volatile void onPopulateViewHolder(BasicViewHolder basicviewholder, int i)
    {
        onPopulateViewHolder((AddressViewHolder)basicviewholder, i);
    }

    public void setAddresses(List list)
    {
        mAddresses.clear();
        mAddresses.addAll(list);
        notifyDataSetChanged();
    }

    public void setSelectedAddress(int i)
    {
        if (i < mAddresses.size())
        {
            int j = mSelectedAddress;
            mSelectedAddress = i;
            notifyItemChanged(j);
            notifyItemChanged(mSelectedAddress);
        }
    }

}
