// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.promo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.ubercab.rider.realtime.model.TripBalance;
import java.util.ArrayList;
import java.util.List;

public final class TripBalancesAdapter extends BaseAdapter
{

    private List a;
    private LayoutInflater b;

    public TripBalancesAdapter(Context context)
    {
        a = new ArrayList();
        b = LayoutInflater.from(context);
    }

    private TripBalance a(int i)
    {
        return (TripBalance)a.get(i);
    }

    public final void a(List list)
    {
        if (list == null)
        {
            a.clear();
        } else
        {
            a = new ArrayList(list);
        }
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.size();
        }
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = b.inflate(0x7f030091, viewgroup, false);
            view1.setTag(new TripBalancesViewHolder(view1));
        }
        ((TripBalancesViewHolder)view1.getTag()).a(a(i));
        return view1;
    }

    public final boolean isEnabled(int i)
    {
        return false;
    }

    private class TripBalancesViewHolder
    {

        TextView mDetails;
        TextView mLabel;

        public final void a(TripBalance tripbalance)
        {
            mLabel.setText(tripbalance.getLabel());
            mDetails.setText(tripbalance.getDetail());
        }

        public TripBalancesViewHolder(View view)
        {
            ButterKnife.inject(this, view);
        }
    }

}
