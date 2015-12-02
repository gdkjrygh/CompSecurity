// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.text.TextUtils;
import android.view.View;
import android.widget.Switch;
import butterknife.ButterKnife;
import com.ubercab.rider.realtime.model.CreditBalance;
import com.ubercab.ui.TextView;

class a
{

    private final android.widget.r a;
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

    public (View view, android.widget.r r)
    {
        ButterKnife.inject(this, view);
        a = r;
        mSwitchUseCredits.setOnCheckedChangeListener(a);
    }
}
