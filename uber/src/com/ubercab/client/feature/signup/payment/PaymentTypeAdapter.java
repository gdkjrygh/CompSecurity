// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup.payment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import gsa;
import java.util.Iterator;
import java.util.List;

public final class PaymentTypeAdapter extends ArrayAdapter
{

    private boolean a;

    public PaymentTypeAdapter(Context context, List list)
    {
        super(context, 0, list);
        a = false;
        a = a(list);
    }

    private static boolean a(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            if (((gsa)list.next()).a().equals("lianlian"))
            {
                return true;
            }
        }

        return false;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(getContext()).inflate(0x7f030126, viewgroup, false);
            view1.setTag(new ViewHolder(view1));
        }
        view = (gsa)getItem(i);
        ((ViewHolder)view1.getTag()).a(view, a);
        return view1;
    }

    private class ViewHolder
    {

        private final Resources a;
        TextView mTextViewType;

        public final void a(gsa gsa1, boolean flag)
        {
            if (flag && gsa1.a().equals("braintree"))
            {
                mTextViewType.setText(0x7f070281);
            } else
            {
                mTextViewType.setText(gsa1.b());
            }
            mTextViewType.setCompoundDrawablesWithIntrinsicBounds(gsa1.c(), null, null, null);
        }

        public ViewHolder(View view)
        {
            a = view.getResources();
            ButterKnife.inject(this, view);
        }
    }

}
