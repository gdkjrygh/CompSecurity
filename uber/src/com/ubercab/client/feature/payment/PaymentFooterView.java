// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import cev;
import chp;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.ui.Button;
import dfp;
import epy;
import err;
import gmg;
import ijg;
import n;

public class PaymentFooterView extends LinearLayout
{

    public chp a;
    public cev b;
    public gmg c;
    private epy d;
    Button mExpenseInfoButton;
    Button mPromoButton;

    public PaymentFooterView(Context context)
    {
        this(context, null);
    }

    public PaymentFooterView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PaymentFooterView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (!isInEditMode())
        {
            ((RiderApplication)context.getApplicationContext()).b().a(this);
        }
    }

    final void a()
    {
        if (mExpenseInfoButton.getVisibility() == 0)
        {
            int i = mExpenseInfoButton.getPaddingLeft();
            int j = mExpenseInfoButton.getPaddingRight();
            int k = mExpenseInfoButton.getPaddingTop();
            int l = mExpenseInfoButton.getPaddingBottom();
            mExpenseInfoButton.setBackgroundResource(0x7f0200e8);
            mExpenseInfoButton.setPadding(i, k, j, l);
        }
        mPromoButton.setVisibility(8);
    }

    public final void a(epy epy1)
    {
        d = epy1;
    }

    public void onClickExpenseInfo()
    {
        a.a(n.af);
        if (d != null)
        {
            d.a();
            return;
        } else
        {
            ijg.b("Expense info clicked in PaymentFooterView but no listener attached", new Object[0]);
            return;
        }
    }

    public void onClickPromoApply()
    {
        a.a(n.dO);
        b.c(new err());
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.inject(this);
            mPromoButton.setText(getContext().getString(0x7f070382));
            return;
        }
    }
}
