// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.expense;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.RiderTripExpenseInfo;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.TripExpenseInfo;
import com.ubercab.ui.TextView;
import cwz;
import czb;
import czj;
import dal;
import dbf;
import dfp;
import djb;
import ery;
import erz;
import esd;
import gmg;
import hkr;
import l;

public class ExpenseInfoFragment extends czb
{

    public chp c;
    public cev d;
    public hkr e;
    public gmg f;
    public dal g;
    private ActionViewHolder h;
    private TripExpenseInfo i;
    private TripExpenseInfo j;
    private boolean k;
    com.ubercab.ui.EditText mEditTextCode;
    com.ubercab.ui.EditText mEditTextMemo;
    TextView mTextExpenseInfoDescription;
    TextView mTextUseLastExpenseInfo;

    public ExpenseInfoFragment()
    {
    }

    static ActionViewHolder a(ExpenseInfoFragment expenseinfofragment)
    {
        return expenseinfofragment.h;
    }

    public static ExpenseInfoFragment a(boolean flag, TripExpenseInfo tripexpenseinfo)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_SHOW_SKIP_BUTTON", flag);
        bundle.putParcelable("com.ubercab.EXPENSE_INFO", RiderTripExpenseInfo.create(tripexpenseinfo));
        tripexpenseinfo = new ExpenseInfoFragment();
        tripexpenseinfo.setArguments(bundle);
        return tripexpenseinfo;
    }

    private static void a(EditText edittext, String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            edittext.setText(s);
            edittext.setSelection(edittext.length());
        }
    }

    private void a(esd esd1)
    {
        esd1.a(this);
    }

    private esd b(dfp dfp)
    {
        return ery.a().a(new djb(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((esd)czj);
    }

    public final cic f()
    {
        return l.bs;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (getArguments() != null)
        {
            j = (TripExpenseInfo)getArguments().getParcelable("com.ubercab.EXPENSE_INFO");
            k = getArguments().getBoolean("EXTRA_SHOW_SKIP_BUTTON");
            return;
        } else
        {
            j = RiderTripExpenseInfo.create();
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(0x7f03010a, viewgroup, false);
        ButterKnife.inject(this, viewgroup);
        layoutinflater = layoutinflater.inflate(0x7f0300ee, null);
        h = new ActionViewHolder(layoutinflater, k);
        mEditTextMemo.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final ExpenseInfoFragment a;

            public final boolean onEditorAction(android.widget.TextView textview, int i1, KeyEvent keyevent)
            {
                if (i1 == 6)
                {
                    ExpenseInfoFragment.a(a).onConfirmClicked();
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                a = ExpenseInfoFragment.this;
                super();
            }
        });
        bundle = d().b();
        bundle.a(16, 26);
        bundle.a(layoutinflater, new android.support.v7.app.ActionBar.LayoutParams(-1, -1));
        bundle.b(false);
        layoutinflater = e.c();
        if (layoutinflater != null)
        {
            i = layoutinflater.getLastExpenseInfo();
        }
        return viewgroup;
    }

    void onExpenseCodeTextChanged()
    {
        h.a();
    }

    void onExpenseMemoTextChanged()
    {
        h.a();
    }

    void onUseLastExpenseInfoClicked()
    {
        if (i != null)
        {
            mEditTextCode.setText(i.getCode());
            mEditTextMemo.setText(i.getMemo());
        }
        mEditTextCode.setSelection(mEditTextCode.length());
        mEditTextMemo.setSelection(mEditTextMemo.length());
        if (TextUtils.isEmpty(mEditTextCode.getText().toString()))
        {
            mEditTextCode.requestFocus();
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        if (f.a(dbf.bZ) && g.k())
        {
            mTextExpenseInfoDescription.setText(getString(0x7f07022a));
        } else
        {
            mTextExpenseInfoDescription.setText(getString(0x7f070229));
        }
        if (i == null || !TextUtils.isEmpty(i.getCode()) || !TextUtils.isEmpty(i.getMemo()))
        {
            mTextUseLastExpenseInfo.setText(getString(0x7f07063f));
        }
        if (j != null)
        {
            a(mEditTextMemo, j.getMemo());
            a(mEditTextCode, j.getCode());
            mEditTextCode.requestFocus();
        }
        cwz.a(getActivity());
        h.a();
    }

    private class ActionViewHolder
    {

        boolean a;
        View actionButtonCancel;
        View actionButtonConfirm;
        boolean b;
        final ExpenseInfoFragment c;
        TextView textViewCancel;
        TextView textViewConfirm;

        private void b()
        {
            textViewConfirm.setText(c.getString(0x7f0703ca));
            textViewConfirm.setTextColor(c.getResources().getColor(0x7f0d0078));
            b = false;
        }

        private void c()
        {
            if (a)
            {
                textViewConfirm.setText(c.getString(0x7f07043a));
                textViewConfirm.setTextColor(c.getResources().getColor(0x7f0d004b));
                b = true;
                return;
            } else
            {
                b();
                return;
            }
        }

        final void a()
        {
            if (TextUtils.isEmpty(c.mEditTextCode.getText()) && TextUtils.isEmpty(c.mEditTextMemo.getText()))
            {
                c();
                return;
            } else
            {
                b();
                return;
            }
        }

        final void onCancelClicked()
        {
            c.d.c(new erf());
            cwz.a(c.getActivity());
        }

        final void onConfirmClicked()
        {
            c.d.c(new ern(c.mEditTextCode.getText().toString(), c.mEditTextMemo.getText().toString()));
            cwz.a(c.getActivity());
            if (b)
            {
                c.c.a(n.ai);
            }
        }

        ActionViewHolder(View view, boolean flag)
        {
            c = ExpenseInfoFragment.this;
            super();
            b = false;
            ButterKnife.inject(this, view);
            a = flag;
            a();
            textViewCancel.setText(getString(0x7f07007b));
        }
    }

}
