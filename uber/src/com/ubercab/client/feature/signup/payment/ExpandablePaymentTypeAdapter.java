// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup.payment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import duh;
import gsa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ExpandablePaymentTypeAdapter extends ArrayAdapter
{

    private boolean a;
    private List b;

    public ExpandablePaymentTypeAdapter(Context context, List list)
    {
        super(context, 0, new ArrayList());
        a = true;
        b = new ArrayList();
        for (context = list.iterator(); context.hasNext();)
        {
            list = (gsa)context.next();
            if (duh.a(list))
            {
                add(list);
            } else
            {
                b.add(list);
            }
        }

    }

    public final void a()
    {
        a = false;
        addAll(b);
        notifyDataSetChanged();
    }

    public final boolean a(int i)
    {
        return a && i == getCount() - 1;
    }

    public final int getCount()
    {
        int j = super.getCount();
        int i = j;
        if (a)
        {
            i = j + 1;
        }
        return i;
    }

    public final int getItemViewType(int i)
    {
        return !a(i) ? 0 : 1;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        int j;
        j = getItemViewType(i);
        view1 = view;
        if (view != null) goto _L2; else goto _L1
_L1:
        j;
        JVM INSTR tableswitch 0 1: default 40
    //                   0 104
    //                   1 71;
           goto _L3 _L4 _L5
_L4:
        break MISSING_BLOCK_LABEL_104;
_L3:
        view1 = view;
_L2:
        switch (j)
        {
        default:
            return view1;

        case 1: // '\001'
            ((ExpandButtonViewHolder)view1.getTag()).a(getContext().getString(0x7f0702bc));
            return view1;

        case 0: // '\0'
            ((ViewHolder)view1.getTag()).a((gsa)getItem(i));
            return view1;
        }
_L5:
        view1 = LayoutInflater.from(getContext()).inflate(0x7f030127, viewgroup, false);
        view1.setTag(new ExpandButtonViewHolder(view1));
          goto _L2
        view1 = LayoutInflater.from(getContext()).inflate(0x7f030126, viewgroup, false);
        view1.setTag(new ViewHolder(view1));
          goto _L2
    }

    public final int getViewTypeCount()
    {
        return 2;
    }

    private class ExpandButtonViewHolder
    {

        TextView mTextViewExpandButtonType;

        public final void a(String s)
        {
            mTextViewExpandButtonType.setText(s);
        }

        public ExpandButtonViewHolder(View view)
        {
            ButterKnife.inject(this, view);
        }
    }


    private class ViewHolder
    {

        private final Resources a;
        TextView mTextViewType;

        public final void a(gsa gsa1)
        {
            mTextViewType.setText(gsa1.b());
            mTextViewType.setCompoundDrawablesWithIntrinsicBounds(gsa1.c(), null, null, null);
        }

        public ViewHolder(View view)
        {
            a = view.getResources();
            ButterKnife.inject(this, view);
        }
    }

}
