// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.receipt;

import cjn;
import cjw;
import cka;

// Referenced classes of package com.ubercab.client.feature.receipt:
//            EnhancedReceiptDialogFragment

final class a
    implements cka
{

    final EnhancedReceiptDialogFragment a;

    public final void a(cjn cjn1)
    {
        a.r = cjn1;
        a.r.a(a.p);
        cjn1.e();
        cjn1.c().c();
        if (a.d())
        {
            EnhancedReceiptDialogFragment.a(a, EnhancedReceiptDialogFragment.e(a));
            EnhancedReceiptDialogFragment.f(a);
        }
    }

    (EnhancedReceiptDialogFragment enhancedreceiptdialogfragment)
    {
        a = enhancedreceiptdialogfragment;
        super();
    }
}
