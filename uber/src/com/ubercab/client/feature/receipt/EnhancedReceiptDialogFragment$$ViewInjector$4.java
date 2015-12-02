// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.receipt;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.ubercab.client.feature.receipt:
//            EnhancedReceiptDialogFragment

final class a
    implements android.view.gment..ViewInjector._cls4
{

    final EnhancedReceiptDialogFragment a;
    final uch b;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        return a.onBottomDrawerTouch();
    }

    ( , EnhancedReceiptDialogFragment enhancedreceiptdialogfragment)
    {
        b = ;
        a = enhancedreceiptdialogfragment;
        super();
    }
}
