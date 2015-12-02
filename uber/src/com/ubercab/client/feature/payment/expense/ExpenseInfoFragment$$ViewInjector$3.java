// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.expense;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.ubercab.client.feature.payment.expense:
//            ExpenseInfoFragment

final class a extends DebouncingOnClickListener
{

    final ExpenseInfoFragment a;
    final InfoClicked b;

    public final void doClick(View view)
    {
        a.onUseLastExpenseInfoClicked();
    }

    ( , ExpenseInfoFragment expenseinfofragment)
    {
        b = ;
        a = expenseinfofragment;
        super();
    }
}
