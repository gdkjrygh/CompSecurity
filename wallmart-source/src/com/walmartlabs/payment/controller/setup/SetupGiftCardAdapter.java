// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.setup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.walmartlabs.payment.controller.methods.GiftCardAdapter;
import com.walmartlabs.ui.recycler.BasicViewHolder;

public class SetupGiftCardAdapter extends GiftCardAdapter
{

    private final Context mContext;

    public SetupGiftCardAdapter(Context context)
    {
        super(context);
        mContext = context;
    }

    public com.walmartlabs.payment.controller.methods.GiftCardAdapter.GiftCardViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return new com.walmartlabs.payment.controller.methods.GiftCardAdapter.GiftCardViewHolder(LayoutInflater.from(mContext).inflate(com.walmartlabs.android.payment.R.layout.mpay_setup_item_gc, viewgroup, false));
    }

    public volatile BasicViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
    {
        return onConstructViewHolder(viewgroup, i);
    }
}
