// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import gsa;
import java.util.List;

public final class PaymentTypeV2Adapter extends ArrayAdapter
{

    public PaymentTypeV2Adapter(Context context, List list)
    {
        super(context, 0, list);
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(getContext()).inflate(0x7f030128, viewgroup, false);
            view1.setTag(new ViewHolder(view1));
        }
        ((ViewHolder)view1.getTag()).a((gsa)getItem(i));
        return view1;
    }

    private class ViewHolder
    {

        ImageView imageViewIcon;
        TextView textViewTitle;

        public final void a(gsa gsa1)
        {
            imageViewIcon.setImageDrawable(gsa1.c());
            textViewTitle.setText(gsa1.b());
        }

        public ViewHolder(View view)
        {
            ButterKnife.inject(this, view);
        }
    }

}
