// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.receipt;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.ubercab.client.feature.receipt:
//            EnhancedReceiptDialogFragment

final class a
    implements android.view.gment..ViewInjector._cls5
{

    final EnhancedReceiptDialogFragment a;
    final a b;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        return a.onFeedbackTouch();
    }

    ( , EnhancedReceiptDialogFragment enhancedreceiptdialogfragment)
    {
        b = ;
        a = enhancedreceiptdialogfragment;
        super();
    }
}
