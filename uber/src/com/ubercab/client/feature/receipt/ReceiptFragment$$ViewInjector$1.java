// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.receipt;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.ubercab.client.feature.receipt:
//            ReceiptFragment

final class a extends DebouncingOnClickListener
{

    final ReceiptFragment a;
    final a b;

    public final void doClick(View view)
    {
        a.onClickSubmit();
    }

    ( , ReceiptFragment receiptfragment)
    {
        b = ;
        a = receiptfragment;
        super();
    }
}
