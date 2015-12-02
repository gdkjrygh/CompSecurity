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
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.Ping;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.CreditBalance;
import com.ubercab.rider.realtime.model.Trip;
import dtv;
import dul;
import eob;
import gke;
import java.util.ArrayList;
import java.util.List;

public final class CreditsAdapter extends BaseAdapter
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    private boolean a;
    private LayoutInflater b;
    private List c;
    private eob d;
    private boolean e;
    private boolean f;

    public CreditsAdapter(Context context, boolean flag, boolean flag1)
    {
        c = new ArrayList();
        b = LayoutInflater.from(context);
        f = flag;
        a = flag1;
    }

    private void a(boolean flag)
    {
        boolean flag1;
        if (flag != a)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        a = flag;
        e = true;
        if (d != null && flag1)
        {
            d.a(flag);
        }
    }

    public final void a(Ping ping)
    {
        com.ubercab.client.core.model.City city = ping.getCity();
        boolean flag1 = dul.i(ping);
        boolean flag;
        if (ping.getTrip() == null)
        {
            flag = false;
        } else
        {
            flag = ping.getTrip().getUseCredits();
        }
        if (ping.getClient() == null)
        {
            ping = null;
        } else
        {
            ping = ping.getClient().getCreditBalances();
        }
        a(((City) (city)), flag1, flag, ((List) (ping)));
    }

    public final void a(City city, boolean flag, boolean flag1, List list)
    {
        if (list == null || list.isEmpty())
        {
            c.clear();
            notifyDataSetChanged();
            return;
        }
        if (f)
        {
            city = dtv.a(city.getCurrencyCode(), list);
            if (city != null)
            {
                c = gke.a(city);
                if (flag && !e)
                {
                    a = flag1;
                }
            }
        } else
        {
            c = list;
        }
        notifyDataSetChanged();
    }

    public final void a(eob eob1)
    {
        d = eob1;
    }

    public final int getCount()
    {
        return c.size();
    }

    public final Object getItem(int i)
    {
        return c.get(i);
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
            view1 = b.inflate(0x7f03011b, viewgroup, false);
            view1.setTag(new CreditsItemViewHolder(view1, this));
        }
        view = (CreditBalance)getItem(i);
        ((CreditsItemViewHolder)view1.getTag()).a(view, f, a);
        return view1;
    }

    public final boolean isEnabled(int i)
    {
        return false;
    }

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        a(flag);
    }

    private class CreditsItemViewHolder
    {

        private final android.widget.CompoundButton.OnCheckedChangeListener a;
        Switch mSwitchUseCredits;
        TextView mTextViewCredit;

        public final void a(CreditBalance creditbalance, boolean flag, boolean flag1)
        {
            Object obj = mSwitchUseCredits;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            ((Switch) (obj)).setVisibility(i);
            mSwitchUseCredits.setOnCheckedChangeListener(null);
            mSwitchUseCredits.setChecked(flag1);
            mSwitchUseCredits.setOnCheckedChangeListener(a);
            obj = creditbalance.getAmountString();
            creditbalance = creditbalance.getDisplayName();
            if (TextUtils.isEmpty(((CharSequence) (obj))) || TextUtils.isEmpty(creditbalance))
            {
                return;
            } else
            {
                mTextViewCredit.setText(String.format("%s %s", new Object[] {
                    creditbalance, obj
                }));
                return;
            }
        }

        public CreditsItemViewHolder(View view, android.widget.CompoundButton.OnCheckedChangeListener oncheckedchangelistener)
        {
            ButterKnife.inject(this, view);
            a = oncheckedchangelistener;
            mSwitchUseCredits.setOnCheckedChangeListener(a);
        }
    }

}
