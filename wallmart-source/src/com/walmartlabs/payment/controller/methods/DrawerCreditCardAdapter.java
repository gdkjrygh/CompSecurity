// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.methods;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.payment.model.CreditCard;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.walmartlabs.payment.controller.methods:
//            CreditCardAdapter

public class DrawerCreditCardAdapter extends CreditCardAdapter
{

    private Map mCardTypeMap;
    private boolean mShowSelectedCard;

    public DrawerCreditCardAdapter(Context context, List list)
    {
        super(context, list);
        mShowSelectedCard = true;
        mFormatterCCNumber = context.getResources().getString(com.walmartlabs.android.payment.R.string.mpay_scan_cc_number);
        initializeCardTypeMap(context);
    }

    private void initializeCardTypeMap(Context context)
    {
        if (mCardTypeMap == null)
        {
            mCardTypeMap = new HashMap();
        }
        mCardTypeMap.put("VISA", context.getResources().getString(com.walmartlabs.android.payment.R.string.card_visa));
        mCardTypeMap.put("MASTERCARD", context.getResources().getString(com.walmartlabs.android.payment.R.string.card_mc));
        mCardTypeMap.put("AMEX", context.getResources().getString(com.walmartlabs.android.payment.R.string.card_amex));
        mCardTypeMap.put("DISCOVER", context.getResources().getString(com.walmartlabs.android.payment.R.string.card_discover));
        mCardTypeMap.put("WMMASTERCARD", context.getResources().getString(com.walmartlabs.android.payment.R.string.mpay_drawer_card_wm_mc));
        mCardTypeMap.put("WMUSGESTORECARD", context.getResources().getString(com.walmartlabs.android.payment.R.string.mpay_drawer_card_wm));
    }

    public CreditCardAdapter.CreditCardViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return new CreditCardAdapter.CreditCardViewHolder(ViewUtil.inflate(viewgroup.getContext(), com.walmartlabs.android.payment.R.layout.mpay_list_item_cc, viewgroup));
    }

    public volatile BasicViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return onConstructViewHolder(viewgroup, i);
    }

    public void onPopulateViewHolder(CreditCardAdapter.CreditCardViewHolder creditcardviewholder, int i)
    {
        super.onPopulateViewHolder(creditcardviewholder, i);
        creditcardviewholder.cardType.setText((CharSequence)mCardTypeMap.get(getItem(i).cardType));
        if (getSelectedItemIndex() == i && mShowSelectedCard)
        {
            creditcardviewholder.btnSelected.setVisibility(0);
            return;
        } else
        {
            creditcardviewholder.btnSelected.setVisibility(4);
            return;
        }
    }

    public volatile void onPopulateViewHolder(BasicViewHolder basicviewholder, int i)
    {
        onPopulateViewHolder((CreditCardAdapter.CreditCardViewHolder)basicviewholder, i);
    }

    public void setShowSelectedCard(boolean flag)
    {
        mShowSelectedCard = flag;
        notifyItemChanged(getSelectedItemIndex());
    }
}
