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

public class PharmacyFourDollarAdapter extends BasicAdapter
{
    public static class FourDollarCategoryViewHolder extends BasicViewHolder
    {

        public TextView prescriptionType;

        public FourDollarCategoryViewHolder(View view)
        {
            super(view);
            prescriptionType = (TextView)ViewUtil.findViewById(view, 0x7f10046f);
        }
    }


    private final Context mContext;
    private String mPrescriptionCategories[];

    public PharmacyFourDollarAdapter(Context context, String as[])
    {
        mContext = context;
        mPrescriptionCategories = as;
    }

    public int getItemCount()
    {
        return mPrescriptionCategories.length;
    }

    public FourDollarCategoryViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return new FourDollarCategoryViewHolder(ViewUtil.inflate(mContext, 0x7f040144, viewgroup));
    }

    public volatile BasicViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return onConstructViewHolder(viewgroup, i);
    }

    public void onPopulateViewHolder(FourDollarCategoryViewHolder fourdollarcategoryviewholder, int i)
    {
        fourdollarcategoryviewholder.prescriptionType.setText(mPrescriptionCategories[i]);
    }

    public volatile void onPopulateViewHolder(BasicViewHolder basicviewholder, int i)
    {
        onPopulateViewHolder((FourDollarCategoryViewHolder)basicviewholder, i);
    }
}
