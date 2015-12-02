// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.receipt;

import android.app.Dialog;
import android.content.Context;
import android.widget.LinearLayout;
import com.ubercab.ui.EditText;

// Referenced classes of package com.ubercab.client.feature.receipt:
//            EnhancedReceiptDialogFragment

final class a extends Dialog
{

    final EnhancedReceiptDialogFragment a;

    public final void onBackPressed()
    {
        if (a.mViewBottomDrawer.getVisibility() != 8) goto _L2; else goto _L1
_L1:
        EnhancedReceiptDialogFragment.b(a);
_L4:
        super.onBackPressed();
        return;
_L2:
        if (a.mEditTextComment.getVisibility() == 0)
        {
            EnhancedReceiptDialogFragment.c(a);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    (EnhancedReceiptDialogFragment enhancedreceiptdialogfragment, Context context, int i)
    {
        a = enhancedreceiptdialogfragment;
        super(context, i);
    }
}
