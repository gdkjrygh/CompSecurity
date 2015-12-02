// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import com.ubercab.client.core.model.RiderTripExpenseInfo;
import com.ubercab.rider.realtime.model.Client;
import epo;
import esf;
import esh;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ExpenseAdapter extends BaseAdapter
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    private final boolean a;
    private LayoutInflater b;
    private epo c;
    private String d;
    private RiderTripExpenseInfo e;
    private boolean f;

    public ExpenseAdapter(Context context, int i, RiderTripExpenseInfo ridertripexpenseinfo)
    {
        boolean flag1 = true;
        super();
        e = RiderTripExpenseInfo.create();
        f = true;
        b = LayoutInflater.from(context);
        e = ridertripexpenseinfo;
        boolean flag = flag1;
        if (i != 1)
        {
            if (i == 2)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        a = flag;
        f = a;
    }

    private static String a(Client client)
    {
        for (client = client.getThirdPartyIdentities().keySet().iterator(); client.hasNext();)
        {
            String s = (String)client.next();
            if (esf.a(s))
            {
                return s;
            }
        }

        return null;
    }

    public final void a(Context context, Client client)
    {
        if (a && client != null)
        {
            d = a(client);
            boolean flag;
            if (esh.a(context.getResources(), d) != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f = flag;
            notifyDataSetChanged();
        }
    }

    final void a(epo epo1)
    {
        c = epo1;
    }

    public final int getCount()
    {
        return !f ? 0 : 1;
    }

    public final Object getItem(int i)
    {
        return e;
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
            view1 = b.inflate(0x7f030120, viewgroup, false);
            view1.setTag(new ExpenseLinkItemViewHolder(view1, this));
        }
        ((ExpenseLinkItemViewHolder)view1.getTag()).a(d, e, viewgroup);
        return view1;
    }

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        e.setExpenseTrip(flag);
        if (c != null)
        {
            c.b(flag);
        }
    }

    private class ExpenseLinkItemViewHolder
    {

        private final android.widget.CompoundButton.OnCheckedChangeListener a;
        Switch mSwitchSendToExpense;
        TextView mTextViewExpense;

        final void a(String s, TripExpenseInfo tripexpenseinfo, ViewGroup viewgroup)
        {
            s = esh.a(viewgroup.getResources(), s);
            if (s == null)
            {
                viewgroup.setVisibility(8);
                return;
            } else
            {
                int i = s.c();
                s = s.a();
                mTextViewExpense.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
                mTextViewExpense.setText(s);
                mSwitchSendToExpense.setOnCheckedChangeListener(null);
                mSwitchSendToExpense.setChecked(tripexpenseinfo.isExpenseTrip());
                mSwitchSendToExpense.setOnCheckedChangeListener(a);
                return;
            }
        }

        ExpenseLinkItemViewHolder(View view, android.widget.CompoundButton.OnCheckedChangeListener oncheckedchangelistener)
        {
            ButterKnife.inject(this, view);
            a = oncheckedchangelistener;
            mSwitchSendToExpense.setOnCheckedChangeListener(a);
        }
    }

}
