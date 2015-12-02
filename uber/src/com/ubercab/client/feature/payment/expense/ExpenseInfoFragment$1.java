// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.expense;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.ubercab.client.feature.payment.expense:
//            ExpenseInfoFragment

final class a
    implements android.widget.nListener
{

    final ExpenseInfoFragment a;

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            ExpenseInfoFragment.a(a).onConfirmClicked();
            return true;
        } else
        {
            return false;
        }
    }

    tionViewHolder(ExpenseInfoFragment expenseinfofragment)
    {
        a = expenseinfofragment;
        super();
    }
}
