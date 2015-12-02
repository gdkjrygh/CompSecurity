// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.expense;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import butterknife.ButterKnife;
import cev;
import chp;
import com.ubercab.ui.EditText;
import com.ubercab.ui.TextView;
import cwz;
import erf;
import ern;
import n;

// Referenced classes of package com.ubercab.client.feature.payment.expense:
//            ExpenseInfoFragment

final class textViewCancel
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

    (ExpenseInfoFragment expenseinfofragment, View view, boolean flag)
    {
        c = expenseinfofragment;
        super();
        b = false;
        ButterKnife.inject(this, view);
        a = flag;
        a();
        textViewCancel.setText(expenseinfofragment.getString(0x7f07007b));
    }
}
