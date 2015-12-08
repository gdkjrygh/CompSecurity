// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.pharmacy;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.recycler.BasicAdapter;
import com.walmartlabs.ui.recycler.BasicViewHolder;

public class RxFourDollarAdapter extends BasicAdapter
{
    public static class RxFourDollarViewHolder extends BasicViewHolder
    {

        public TextView drugName;
        public TextView qty;

        public RxFourDollarViewHolder(View view)
        {
            super(view);
            drugName = (TextView)view.findViewById(0x7f10046d);
            qty = (TextView)view.findViewById(0x7f10046e);
        }
    }


    private final Context mContext;
    private com.walmart.android.service.pharmacylegacy.FourDollarPrescriptions.DrugList.Drug mDrugList[];

    public RxFourDollarAdapter(Context context, com.walmart.android.service.pharmacylegacy.FourDollarPrescriptions.DrugList.Drug adrug[])
    {
        mContext = context;
        mDrugList = adrug;
    }

    public int getItemCount()
    {
        return mDrugList.length;
    }

    public RxFourDollarViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return new RxFourDollarViewHolder(ViewUtil.inflate(mContext, 0x7f040142, viewgroup));
    }

    public volatile BasicViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return onConstructViewHolder(viewgroup, i);
    }

    public void onPopulateViewHolder(RxFourDollarViewHolder rxfourdollarviewholder, int i)
    {
        com.walmart.android.service.pharmacylegacy.FourDollarPrescriptions.DrugList.Drug drug = mDrugList[i];
        rxfourdollarviewholder.drugName.setText(drug.getName());
        rxfourdollarviewholder.qty.setText(mContext.getString(0x7f09047a, new Object[] {
            drug.getQty30Day()
        }));
    }

    public volatile void onPopulateViewHolder(BasicViewHolder basicviewholder, int i)
    {
        onPopulateViewHolder((RxFourDollarViewHolder)basicviewholder, i);
    }
}
