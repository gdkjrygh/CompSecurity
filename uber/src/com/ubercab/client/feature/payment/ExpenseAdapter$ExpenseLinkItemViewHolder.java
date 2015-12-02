// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import butterknife.ButterKnife;
import com.ubercab.rider.realtime.model.TripExpenseInfo;
import com.ubercab.ui.TextView;
import esg;
import esh;

class a
{

    private final android.widget.eLinkItemViewHolder.a a;
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

    Q(View view, android.widget.eLinkItemViewHolder elinkitemviewholder)
    {
        ButterKnife.inject(this, view);
        a = elinkitemviewholder;
        mSwitchSendToExpense.setOnCheckedChangeListener(a);
    }
}
